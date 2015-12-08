// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.utils.TimeRange;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.subscriptions.CompositeSubscription;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            PlayerAnalytics

public class OmniturePlayerAnalytics
    implements PlayerAnalytics
{

    private static final int AD_COMPLETE = 1;
    private static final int AD_START = 0;
    private static final int REWIND_100 = 10;
    private static final int REWIND_25 = 7;
    private static final int REWIND_50 = 8;
    private static final int REWIND_75 = 9;
    private static final int REWIND_START = 6;
    private static final int STREAM_COMPLETE = 5;
    private static final int STREAM_START = 2;
    private com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener adListener;
    private com.adobe.mediacore.MediaPlayer.PlaybackEventListener playbackListener;
    private MediaPlayer player;
    private CompositeSubscription subscriptions;
    private boolean tracked25;
    private boolean tracked50;
    private boolean tracked75;
    private boolean trackedStart;
    private final TrackingHelper trackingHelper;
    private AssetViewModel viewModel;

    public OmniturePlayerAnalytics(AssetViewModel assetviewmodel, TrackingHelper trackinghelper)
    {
        adListener = new AdPlaybackEventListenerStub() {

            final OmniturePlayerAnalytics this$0;

            public void onAdComplete(AdBreak adbreak, Ad ad)
            {
                super.onAdComplete(adbreak, ad);
                logEvent(1);
                if (viewModel.isLive())
                {
                    logEvent(2);
                    return;
                } else
                {
                    logEvent(6);
                    return;
                }
            }

            public void onAdStart(AdBreak adbreak, Ad ad)
            {
                super.onAdStart(adbreak, ad);
                logEvent(0);
            }

            
            {
                this$0 = OmniturePlayerAnalytics.this;
                super();
            }
        };
        playbackListener = new PlaybackEventListenerStub() {

            public com.adobe.mediacore.MediaPlayer.PlayerState lastPlayerState;
            final OmniturePlayerAnalytics this$0;

            public void onPlayComplete()
            {
                super.onPlayComplete();
                if (player.getCurrentItem().isLive())
                {
                    logEvent(5);
                    return;
                } else
                {
                    logEvent(10);
                    return;
                }
            }

            public void onPlayStart()
            {
                super.onPlayStart();
                if (lastPlayerState == com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE)
                {
                    logEvent(6);
                }
            }

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                super.onStateChanged(playerstate, mediaplayernotification);
                static class _cls4
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.ERROR.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.SUSPENDED.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls4..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
                JVM INSTR tableswitch 1 6: default 52
            //                           1 58
            //                           2 68
            //                           3 68
            //                           4 68
            //                           5 68
            //                           6 68;
                   goto _L1 _L2 _L3 _L3 _L3 _L3 _L3
_L1:
                lastPlayerState = playerstate;
                return;
_L2:
                startListening();
                continue; /* Loop/switch isn't completed */
_L3:
                stopListening();
                if (true) goto _L1; else goto _L4
_L4:
            }

            
            {
                this$0 = OmniturePlayerAnalytics.this;
                super();
            }
        };
        viewModel = assetviewmodel;
        trackingHelper = trackinghelper;
        trackedStart = false;
        tracked75 = false;
        tracked50 = false;
        tracked25 = false;
    }

    private void startListening()
    {
        subscriptions = new CompositeSubscription();
        subscriptions.add(Observable.timer(1000L, 1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final OmniturePlayerAnalytics this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(Long long1)
            {
                long l = player.getLocalTime();
                if (l != 0L)
                {
                    float f = (float)(player.getPlaybackRange().getDuration() / l) * 1.0F;
                    if ((double)f > 0.75D && !tracked75)
                    {
                        tracked75 = true;
                        logEvent(9);
                    }
                    if ((double)f > 0.5D && !tracked50)
                    {
                        tracked50 = true;
                        logEvent(8);
                    }
                    if ((double)f > 0.25D && !tracked25)
                    {
                        tracked25 = true;
                        logEvent(7);
                        return;
                    }
                }
            }

            public volatile void onNext(Object obj)
            {
                onNext((Long)obj);
            }

            
            {
                this$0 = OmniturePlayerAnalytics.this;
                super();
            }
        }));
    }

    private void stopListening()
    {
        if (subscriptions != null)
        {
            subscriptions.unsubscribe();
        }
    }

    public void attachPlayer(MediaPlayer mediaplayer)
    {
        player = mediaplayer;
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
    }

    public void logEvent(int i)
    {
        HashMap hashmap = new HashMap();
        Object obj;
        String s;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        s = null;
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        obj = null;
        hashmap.put("nbcs.videosport", viewModel.asset().getSportName());
        hashmap.put("nbcs.videotitle", viewModel.asset().getTitle());
        hashmap.put("nbcs.playermode", "Live:Full Screen");
        hashmap.put("nbcs.videoid", viewModel.asset().getEventId());
        hashmap.put("nbcs.videorsn", viewModel.asset().getChannel());
        i;
        JVM INSTR tableswitch 0 10: default 516
    //                   0 235
    //                   1 263
    //                   2 465
    //                   3 168
    //                   4 168
    //                   5 498
    //                   6 279
    //                   7 332
    //                   8 363
    //                   9 394
    //                   10 425;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        Timber.d((new StringBuilder()).append("Unknown tracking event ").append(i).toString(), new Object[0]);
          goto _L11
_L2:
        obj = "Video Ad Start";
        hashmap.put("nbcs.videoadstart", "true");
        continue; /* Loop/switch isn't completed */
_L11:
        if (obj != null)
        {
            try
            {
                trackingHelper.trackLink(((String) (obj)), hashmap);
                Timber.d((new StringBuilder()).append("PlayerAction: ").append(((String) (obj))).toString(), new Object[0]);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Timber.e(((Throwable) (obj)), "Error logging event", new Object[0]);
            }
        }
        return;
_L3:
        obj = "Video Ad Complete";
        hashmap.put("nbcs.videoadend", "true");
        continue; /* Loop/switch isn't completed */
_L6:
        obj = s;
        if (trackedStart)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        trackedStart = true;
        if (viewModel.isReplay())
        {
            obj = "VOD Ep Start";
        } else
        {
            obj = "VOD Start";
        }
        if (viewModel.isReplay())
        {
            s = "nbcs.videoepstart";
        } else
        {
            s = "nbcs.videostart";
        }
        hashmap.put(s, "true");
        continue; /* Loop/switch isn't completed */
_L7:
        obj = obj1;
        if (!viewModel.isReplay())
        {
            obj = "Video 25% Complete";
        }
        hashmap.put("nbcs.video25", "true");
        continue; /* Loop/switch isn't completed */
_L8:
        obj = obj2;
        if (!viewModel.isReplay())
        {
            obj = "Video 50% Complete";
        }
        hashmap.put("nbcs.video50", "true");
        continue; /* Loop/switch isn't completed */
_L9:
        obj = obj3;
        if (!viewModel.isReplay())
        {
            obj = "Video 75% Complete";
        }
        hashmap.put("nbcs.video75", "true");
        continue; /* Loop/switch isn't completed */
_L10:
        if (viewModel.isReplay())
        {
            obj = "VOD Episode Complete";
        } else
        {
            obj = "VOD Complete";
        }
        if (viewModel.isReplay())
        {
            s = "nbcs.videoepend";
        } else
        {
            s = "nbcs.videoend";
        }
        hashmap.put(s, "true");
        continue; /* Loop/switch isn't completed */
_L4:
        obj = obj4;
        if (trackedStart)
        {
            break MISSING_BLOCK_LABEL_484;
        }
        trackedStart = true;
        obj = "Live Video Start";
        hashmap.put("nbcs.livevideostart", "true");
        continue; /* Loop/switch isn't completed */
_L5:
        obj = "Live Video Complete";
        hashmap.put("nbcs.livevideostart", "true");
        if (true) goto _L11; else goto _L12
_L12:
    }

    public void onDestroy()
    {
    }

    public void onPause()
    {
        if (player == null)
        {
            return;
        } else
        {
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
            stopListening();
            return;
        }
    }







/*
    static boolean access$402(OmniturePlayerAnalytics omnitureplayeranalytics, boolean flag)
    {
        omnitureplayeranalytics.tracked75 = flag;
        return flag;
    }

*/



/*
    static boolean access$502(OmniturePlayerAnalytics omnitureplayeranalytics, boolean flag)
    {
        omnitureplayeranalytics.tracked50 = flag;
        return flag;
    }

*/



/*
    static boolean access$602(OmniturePlayerAnalytics omnitureplayeranalytics, boolean flag)
    {
        omnitureplayeranalytics.tracked25 = flag;
        return flag;
    }

*/
}
