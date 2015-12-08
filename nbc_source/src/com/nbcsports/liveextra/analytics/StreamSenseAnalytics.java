// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import android.util.Log;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.comscore.streaming.StreamSense;
import com.comscore.streaming.StreamSenseEventType;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import java.util.HashMap;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            PlayerAnalytics

public class StreamSenseAnalytics
    implements PlayerAnalytics
{

    private static final int BUFFER = 0;
    private static final int END = 3;
    private static final int PAUSE = 1;
    private static final int PLAY = 2;
    private com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener adListener;
    private int partCounter;
    private com.adobe.mediacore.MediaPlayer.PlaybackEventListener playbackListener;
    private MediaPlayer player;
    private StreamSense streamSense;
    private int totalParts;
    private int videoPart;
    private AssetViewModel viewModel;

    public StreamSenseAnalytics(AssetViewModel assetviewmodel)
    {
        adListener = new AdPlaybackEventListenerStub() {

            final StreamSenseAnalytics this$0;

            public void onAdComplete(AdBreak adbreak, Ad ad)
            {
                super.onAdComplete(adbreak, ad);
                setClip(null);
            }

            public void onAdStart(AdBreak adbreak, Ad ad)
            {
                super.onAdStart(adbreak, ad);
                setClip(Integer.valueOf((int)adbreak.size()));
            }

            
            {
                this$0 = StreamSenseAnalytics.this;
                super();
            }
        };
        playbackListener = new PlaybackEventListenerStub() {

            final StreamSenseAnalytics this$0;

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                super.onStateChanged(playerstate, mediaplayernotification);
                static class _cls5
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PREPARING.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls5..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    notifyStream(0, player.getLocalTime());
                    return;

                case 2: // '\002'
                    notifyStream(2, player.getLocalTime());
                    return;

                case 3: // '\003'
                    notifyStream(1, player.getLocalTime());
                    return;

                case 4: // '\004'
                    notifyStream(3, player.getLocalTime());
                    break;
                }
            }

            
            {
                this$0 = StreamSenseAnalytics.this;
                super();
            }
        };
        viewModel = assetviewmodel;
        streamSense = new StreamSense();
        partCounter = 0;
        totalParts = 0;
        videoPart = 0;
    }

    public void attachPlayer(MediaPlayer mediaplayer)
    {
        player = mediaplayer;
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
    }

    public void notifyStream(final int event, final long time)
    {
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = new Thread.UncaughtExceptionHandler() {

            final StreamSenseAnalytics this$0;

            public void uncaughtException(Thread thread1, Throwable throwable)
            {
                Timber.d((new StringBuilder()).append("NotifyStreamThreadUncaught, Exception occured in notifyStream thread: ").append(throwable.toString()).toString(), new Object[0]);
            }

            
            {
                this$0 = StreamSenseAnalytics.this;
                super();
            }
        };
        Thread thread = new Thread() {

            final StreamSenseAnalytics this$0;
            final int val$event;
            final long val$time;

            public void run()
            {
                this;
                JVM INSTR monitorenter ;
                if (streamSense == null) goto _L2; else goto _L1
_L1:
                int i = event;
                i;
                JVM INSTR tableswitch 0 3: default 48
            //                           0 51
            //                           1 105
            //                           2 154
            //                           3 203;
                   goto _L2 _L3 _L4 _L5 _L6
_L2:
                this;
                JVM INSTR monitorexit ;
                return;
_L3:
                streamSense.notify(StreamSenseEventType.BUFFER, time);
                Timber.d((new StringBuilder()).append("event: BUFFER | time :").append(time).toString(), new Object[0]);
                  goto _L2
                Exception exception;
                exception;
                throw exception;
_L4:
                streamSense.notify(StreamSenseEventType.PAUSE, time);
                Timber.d((new StringBuilder()).append("event: PAUSE | time :").append(time).toString(), new Object[0]);
                  goto _L2
_L5:
                streamSense.notify(StreamSenseEventType.PLAY, time);
                Timber.d((new StringBuilder()).append("event: PLAY | time :").append(time).toString(), new Object[0]);
                  goto _L2
_L6:
                streamSense.notify(StreamSenseEventType.END, time);
                Timber.d((new StringBuilder()).append("event: END | time :").append(time).toString(), new Object[0]);
                  goto _L2
            }

            
            {
                this$0 = StreamSenseAnalytics.this;
                event = i;
                time = l;
                super();
            }
        };
        thread.setPriority(1);
        thread.setUncaughtExceptionHandler(uncaughtexceptionhandler);
        thread.start();
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
            return;
        }
    }

    public void setClip(Integer integer)
    {
        String s;
        HashMap hashmap;
        com.phunware.nbc.sochi.content.ContentState.Status status;
        Integer integer1;
        int i;
        int j;
        try
        {
            integer1 = Integer.valueOf(viewModel.asset().getStatus());
            status = com.phunware.nbc.sochi.content.ContentState.Status.values()[integer1.intValue()];
            hashmap = new HashMap();
        }
        // Misplaced declaration of an exception variable
        catch (Integer integer)
        {
            Timber.e(integer, "Error setting clip", new Object[0]);
            return;
        }
        if (integer == null) goto _L2; else goto _L1
_L1:
        partCounter = partCounter + 1;
        totalParts = integer.intValue() + 1;
_L18:
        if (integer == null) goto _L4; else goto _L3
_L3:
        i = partCounter;
_L19:
        hashmap.put("ns_st_cn", String.valueOf(i));
        hashmap.put("ns_st_ci", viewModel.asset().getEventId());
        if (integer == null) goto _L6; else goto _L5
_L5:
        i = partCounter;
_L20:
        hashmap.put("ns_st_pn", String.valueOf(i));
        hashmap.put("ns_st_tp", String.valueOf(totalParts));
        hashmap.put("ns_st_cu", viewModel.asset().getStreamUrl());
        hashmap.put("ns_st_cl", "0");
        s = "vc11";
        if (integer != null) goto _L8; else goto _L7
_L7:
        integer = s;
        integer1.intValue();
        JVM INSTR tableswitch 0 5: default 441
    //                   0 446
    //                   1 212
    //                   2 212
    //                   3 452
    //                   4 212
    //                   5 458;
           goto _L9 _L10 _L11 _L11 _L12 _L11 _L13
_L11:
        hashmap.put("ns_st_ct", integer);
        s = viewModel.asset().getTitle();
        integer = s;
        if (s == null)
        {
            integer = "";
        }
        s = status.name().toLowerCase();
        hashmap.put("c3", "NBCSports.com");
        hashmap.put("c4", s);
        hashmap.put("c6", integer);
        hashmap.put("ns_st_de", (new StringBuilder()).append("NBCSports.com-").append(s).toString());
        integer = com.adobe.mediacore.MediaResource.Type.values();
        j = integer.length;
        i = 0;
_L16:
        if (i >= j) goto _L15; else goto _L14
_L14:
        Log.w("Type: ", integer[i].name());
        i++;
          goto _L16
_L2:
        if (videoPart != 0) goto _L18; else goto _L17
_L17:
        partCounter = partCounter + 1;
        videoPart = partCounter;
          goto _L18
_L4:
        i = videoPart;
          goto _L19
_L6:
        i = videoPart;
          goto _L20
_L8:
        partCounter;
        JVM INSTR tableswitch 1 4: default 464
    //                   1 469
    //                   2 464
    //                   3 475
    //                   4 481;
           goto _L21 _L22 _L21 _L23 _L24
_L27:
        if (true) goto _L11; else goto _L25
_L25:
_L29:
        if (true) goto _L27; else goto _L26
_L26:
_L31:
        if (true) goto _L29; else goto _L28
_L28:
_L33:
        if (true) goto _L31; else goto _L30
_L30:
_L35:
        if (true) goto _L33; else goto _L32
_L32:
_L37:
        if (true) goto _L35; else goto _L34
_L34:
_L39:
        if (true) goto _L37; else goto _L36
_L36:
_L41:
        if (true) goto _L39; else goto _L38
_L38:
_L43:
        if (true) goto _L41; else goto _L40
_L40:
_L45:
        if (true) goto _L43; else goto _L42
_L42:
_L47:
        if (true) goto _L45; else goto _L44
_L44:
_L49:
        if (true) goto _L47; else goto _L46
_L46:
_L51:
        if (true) goto _L49; else goto _L48
_L48:
        if (true) goto _L51; else goto _L50
_L50:
_L15:
        streamSense.setClip(hashmap);
        return;
_L9:
        integer = s;
          goto _L11
_L10:
        integer = "vc11";
          goto _L11
_L12:
        integer = "vc13";
          goto _L11
_L13:
        integer = "vc12";
          goto _L11
_L21:
        integer = s;
          goto _L11
_L22:
        integer = "va11";
          goto _L11
_L23:
        integer = "va12";
          goto _L11
_L24:
        integer = "va13";
          goto _L11
    }


}
