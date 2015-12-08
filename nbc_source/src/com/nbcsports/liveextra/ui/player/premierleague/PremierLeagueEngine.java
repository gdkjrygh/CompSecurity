// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player.premierleague;

import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.utils.TimeRange;
import com.google.gson.Gson;
import com.nbcsports.liveextra.content.models.overlay.premierleague.ConfigurationInfo;
import com.nbcsports.liveextra.content.overlay.OverlayContentService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.PlayerActivity;
import com.nbcsports.liveextra.ui.player.dataviews.DataEngine;
import com.nbcsports.liveextra.ui.player.premierleague.core.TimeUtils;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Interval;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func1;
import rx.observables.ConnectableObservable;
import rx.schedulers.Schedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player.premierleague:
//            PremierLeagueModule, PremierLeagueComponent

public class PremierLeagueEngine
    implements DataEngine
{
    public static interface Listener
    {

        public abstract void onSeek();

        public abstract void onSeekComplete();

        public abstract void showGoLive(boolean flag);
    }


    private static final int BUFFER_SLOP = 24000;
    private static final String OVERLAY_CONFIG_URL = "http://overlays.nbcsports.com/services/highttl/pl.asmx/GetConfigurationInfo?=string&callback=";
    private static PremierLeagueComponent component;
    private com.adobe.mediacore.MediaPlayer.EventListener adListener;
    private Observable configObservable;
    private ConfigurationInfo configurationInfo;
    private DateTime encoderStartTime;
    private final String gameId;
    Gson gson;
    private boolean isInAdBreak;
    private boolean isSeeking;
    private com.adobe.mediacore.MediaPlayer.EventListener listener;
    public List listeners;
    OverlayContentService overlayContentService;
    private DateTime playHead;
    private MediaPlayer player;
    private DateTime programStartTime;
    private com.adobe.mediacore.MediaPlayer.EventListener qosListener;
    private Subscription timer;
    AssetViewModel viewModel;

    public PremierLeagueEngine()
    {
        listeners = new ArrayList();
        qosListener = new QosEventListenerStub() {

            final PremierLeagueEngine this$0;

            public void onSeekComplete(long l)
            {
                super.onSeekComplete(l);
                isSeeking = false;
                stopTimer();
                startTimer();
                onTick(0L);
                player.play();
                for (int i = 0; i < listeners.size(); i++)
                {
                    ((Listener)listeners.get(i)).onSeekComplete();
                }

            }

            public void onSeekStart()
            {
                super.onSeekStart();
                if (!isSeeking)
                {
                    isSeeking = true;
                    stopTimer();
                    int i = 0;
                    while (i < listeners.size()) 
                    {
                        ((Listener)listeners.get(i)).onSeek();
                        i++;
                    }
                }
            }

            
            {
                this$0 = PremierLeagueEngine.this;
                super();
            }
        };
        listener = new PlaybackEventListenerStub() {

            final PremierLeagueEngine this$0;

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                super.onStateChanged(playerstate, mediaplayernotification);
                static class _cls6
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls6..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
                JVM INSTR tableswitch 1 4: default 44
            //                           1 45
            //                           2 63
            //                           3 63
            //                           4 63;
                   goto _L1 _L2 _L3 _L3 _L3
_L1:
                return;
_L2:
                if (!isInAdBreak)
                {
                    startTimer();
                    return;
                }
                  goto _L1
_L3:
                stopTimer();
                return;
            }

            public void onTimedMetadata(TimedMetadata timedmetadata)
            {
                super.onTimedMetadata(timedmetadata);
                if (programStartTime == null)
                {
                    if (timedmetadata.getName().equals("#EXT-X-PROGRAM-DATE-TIME"))
                    {
                        try
                        {
                            timedmetadata = DateTime.parse(TimeUtils.normalizeTimestamp(timedmetadata.getMetadata().getValue("DATA")));
                            if (programStartTime == null)
                            {
                                programStartTime = timedmetadata;
                                encoderStartTime = programStartTime;
                                Timber.d((new StringBuilder()).append("Program start time set to: ").append(encoderStartTime.toString()).toString(), new Object[0]);
                                startTimer();
                            }
                        }
                        // Misplaced declaration of an exception variable
                        catch (TimedMetadata timedmetadata)
                        {
                            Timber.d(timedmetadata, "Exception while setting encoderStartTime", new Object[0]);
                        }
                    }
                    if (programStartTime == null && encoderStartTime == null && viewModel.isLive())
                    {
                        encoderStartTime = DateTime.now().minus(player.getPlaybackMetrics().getTime());
                        Timber.d((new StringBuilder()).append("Program start set from DateTime.now(): ").append(encoderStartTime.toString()).toString(), new Object[0]);
                        startTimer();
                        return;
                    }
                }
            }

            public void onTimelineUpdated()
            {
                super.onTimelineUpdated();
            }

            
            {
                this$0 = PremierLeagueEngine.this;
                super();
            }
        };
        adListener = new AdPlaybackEventListenerStub() {

            final PremierLeagueEngine this$0;

            public void onAdBreakComplete(AdBreak adbreak)
            {
                super.onAdBreakComplete(adbreak);
                isInAdBreak = false;
                startTimer();
                showGoLive();
            }

            public void onAdBreakStart(AdBreak adbreak)
            {
                super.onAdBreakStart(adbreak);
                isInAdBreak = true;
                stopTimer();
                for (adbreak = listeners.iterator(); adbreak.hasNext(); ((Listener)adbreak.next()).showGoLive(false)) { }
            }

            
            {
                this$0 = PremierLeagueEngine.this;
                super();
            }
        };
        component = PlayerActivity.component().premierLeague(new PremierLeagueModule(this));
        component.inject(this);
        gameId = viewModel.asset().getOverlayId();
    }

    public static PremierLeagueComponent component()
    {
        return component;
    }

    public static boolean handles(AssetViewModel assetviewmodel)
    {
        return "nbc-premier-league".equals(assetviewmodel.asset().getSportCode()) && !assetviewmodel.asset().getOverlayId().equals("0") && assetviewmodel.asset().getSportCode().equals("nbc-premier-league");
    }

    private void showGoLive()
    {
        if (isLive()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator;
        boolean flag;
        if (player.getPlaybackRange().getEnd() - player.getBufferedRange().getEnd() - player.getPlaybackMetrics().getBufferTime() - 24000L > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (isInAdBreak || !flag)
        {
            break; /* Loop/switch isn't completed */
        }
        iterator = listeners.iterator();
        while (iterator.hasNext()) 
        {
            ((Listener)iterator.next()).showGoLive(true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        Iterator iterator1 = listeners.iterator();
        while (iterator1.hasNext()) 
        {
            ((Listener)iterator1.next()).showGoLive(false);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void startTimer()
    {
        timer = Observable.interval(1L, TimeUnit.SECONDS).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

            final PremierLeagueEngine this$0;

            public void onCompleted()
            {
            }

            public void onError(Throwable throwable)
            {
            }

            public void onNext(Long long1)
            {
                onTick(long1.longValue());
            }

            public volatile void onNext(Object obj)
            {
                onNext((Long)obj);
            }

            
            {
                this$0 = PremierLeagueEngine.this;
                super();
            }
        });
    }

    private void stopTimer()
    {
        if (timer != null && !timer.isUnsubscribed())
        {
            timer.unsubscribe();
        }
    }

    public void addListener(Listener listener1)
    {
        listeners.add(listener1);
    }

    public int getBottomPanel()
    {
        return 0x7f04007c;
    }

    public Observable getConfiguration()
    {
        if (configurationInfo != null)
        {
            return Observable.just(configurationInfo);
        }
        if (configObservable == null)
        {
            configObservable = overlayContentService.getResponseObservable("http://overlays.nbcsports.com/services/highttl/pl.asmx/GetConfigurationInfo?=string&callback=").subscribeOn(Schedulers.io()).map(new Func1() {

                final PremierLeagueEngine this$0;

                public ConfigurationInfo call(Response response)
                {
                    try
                    {
                        configurationInfo = (ConfigurationInfo)gson.fromJson(response.body().charStream(), com/nbcsports/liveextra/content/models/overlay/premierleague/ConfigurationInfo);
                        response = configurationInfo;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Response response)
                    {
                        Timber.d(response, "Error retrieving PL configuration", new Object[0]);
                        return null;
                    }
                    return response;
                }

                public volatile Object call(Object obj)
                {
                    return call((Response)obj);
                }

            
            {
                this$0 = PremierLeagueEngine.this;
                super();
            }
            }).replay(1).refCount();
        }
        return configObservable.asObservable();
    }

    public DateTime getEncoderStartTime()
    {
        return encoderStartTime;
    }

    public String getGameId()
    {
        return gameId;
    }

    public DateTime getPlayHead()
    {
        return playHead;
    }

    public int getSidePanel()
    {
        return 0x7f04007d;
    }

    public int getTopPanel()
    {
        return 0x7f04007e;
    }

    public void goLive()
    {
        player.seek(-2L);
    }

    public boolean isLive()
    {
        return viewModel.isLive();
    }

    public void onTick(long l)
    {
        if (encoderStartTime != null && player != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        try
        {
            int i = (int)(player.getPlaybackMetrics().getTime() / 1000L);
            playHead = encoderStartTime.plusSeconds(i - 65);
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
        if (l % 5L != 0L) goto _L1; else goto _L3
_L3:
        showGoLive();
        return;
    }

    public void removeListener(Listener listener1)
    {
        listeners.remove(listener1);
    }

    public void seekTo(DateTime datetime)
    {
        while (!player.getStatus().equals(com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING) && !player.getStatus().equals(com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED) || encoderStartTime == null || isInAdBreak) 
        {
            return;
        }
        if (datetime.isBefore(encoderStartTime))
        {
            player.pause();
            player.seek(0L);
            return;
        } else
        {
            datetime = (new Interval(encoderStartTime, datetime)).toDuration().minus(15000L);
            player.pause();
            player.seek(datetime.getMillis());
            return;
        }
    }

    public void start(MediaPlayer mediaplayer)
    {
        getConfiguration();
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, listener);
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
        player = mediaplayer;
    }

    public void stop()
    {
        listeners = new ArrayList();
        stopTimer();
        if (player != null)
        {
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, listener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
        }
    }



/*
    static boolean access$002(PremierLeagueEngine premierleagueengine, boolean flag)
    {
        premierleagueengine.isSeeking = flag;
        return flag;
    }

*/






/*
    static DateTime access$402(PremierLeagueEngine premierleagueengine, DateTime datetime)
    {
        premierleagueengine.programStartTime = datetime;
        return datetime;
    }

*/



/*
    static DateTime access$502(PremierLeagueEngine premierleagueengine, DateTime datetime)
    {
        premierleagueengine.encoderStartTime = datetime;
        return datetime;
    }

*/



/*
    static boolean access$602(PremierLeagueEngine premierleagueengine, boolean flag)
    {
        premierleagueengine.isInAdBreak = flag;
        return flag;
    }

*/




/*
    static ConfigurationInfo access$802(PremierLeagueEngine premierleagueengine, ConfigurationInfo configurationinfo)
    {
        premierleagueengine.configurationInfo = configurationinfo;
        return configurationinfo;
    }

*/
}
