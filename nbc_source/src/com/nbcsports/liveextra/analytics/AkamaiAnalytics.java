// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import android.content.Context;
import android.net.Uri;
import android.view.ViewGroup;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaPlayerView;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.utils.TimeRange;
import com.akamai.android.analytics.AnalyticsPlugin;
import com.akamai.android.analytics.EndReasonCodes;
import com.akamai.android.analytics.ErrorCodes;
import com.akamai.android.analytics.PluginCallBacks;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import java.util.HashMap;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            PlayerAnalytics

public class AkamaiAnalytics
    implements PluginCallBacks, PlayerAnalytics
{

    public static String mConfigLocation = "http://ma99-r.analytics.edgesuite.net/config/beacon-5351.xml";
    private com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener adListener;
    private Context appContext;
    private com.adobe.mediacore.MediaPlayer.PlaybackEventListener playbackListener;
    private MediaPlayer player;
    public AnalyticsPlugin plugin;
    private com.adobe.mediacore.MediaPlayer.QOSEventListener qosListener;
    private final AssetViewModel viewModel;

    public AkamaiAnalytics(Context context, AssetViewModel assetviewmodel)
    {
        qosListener = new QosEventListenerStub() {

            final AkamaiAnalytics this$0;

            public void onSeekComplete(long l)
            {
                if (player == null)
                {
                    return;
                } else
                {
                    super.onSeekComplete(l);
                    plugin.handleSeekEnd(l);
                    return;
                }
            }

            public void onSeekStart()
            {
                if (player == null)
                {
                    return;
                } else
                {
                    super.onSeekStart();
                    plugin.handleSeekStart(player.getCurrentTime());
                    return;
                }
            }

            
            {
                this$0 = AkamaiAnalytics.this;
                super();
            }
        };
        adListener = new AdPlaybackEventListenerStub() {

            final AkamaiAnalytics this$0;

            public void onAdBreakSkipped(AdBreak adbreak)
            {
                if (player == null)
                {
                    return;
                } else
                {
                    super.onAdBreakSkipped(adbreak);
                    plugin.handleAdStopped();
                    return;
                }
            }

            public void onAdBreakStart(AdBreak adbreak)
            {
                super.onAdBreakStart(adbreak);
            }

            public void onAdComplete(AdBreak adbreak, Ad ad)
            {
                if (player == null)
                {
                    return;
                } else
                {
                    super.onAdComplete(adbreak, ad);
                    plugin.handleAdComplete();
                    return;
                }
            }

            public void onAdProgress(AdBreak adbreak, Ad ad, int i)
            {
                if (player != null)
                {
                    super.onAdProgress(adbreak, ad, i);
                    if (i == 25)
                    {
                        plugin.handleAdFirstQuartile();
                        return;
                    }
                    if (i == 50)
                    {
                        plugin.handleAdMidPoint();
                        return;
                    }
                    if (i == 75)
                    {
                        plugin.handleAdThirdQuartile();
                        return;
                    }
                }
            }

            public void onAdStart(AdBreak adbreak, Ad ad)
            {
                if (player == null)
                {
                    return;
                } else
                {
                    super.onAdStart(adbreak, ad);
                    adbreak = new HashMap();
                    adbreak.put("adTitle", String.valueOf(ad.getId()));
                    adbreak.put("adCategory", ad.getType().name());
                    plugin.handleAdLoaded(adbreak);
                    plugin.handleAdStarted();
                    return;
                }
            }

            
            {
                this$0 = AkamaiAnalytics.this;
                super();
            }
        };
        playbackListener = new PlaybackEventListenerStub() {

            public com.adobe.mediacore.MediaPlayer.PlayerState lastPlayerState;
            final AkamaiAnalytics this$0;

            public void onPlayComplete()
            {
                if (player == null)
                {
                    return;
                } else
                {
                    super.onPlayComplete();
                    plugin.handlePlayEnd(EndReasonCodes.Play_End_Detected.toString());
                    return;
                }
            }

            public void onPlayStart()
            {
                if (player == null)
                {
                    return;
                }
                super.onPlayStart();
                if (lastPlayerState == com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE)
                {
                    plugin = new AnalyticsPlugin(appContext, AkamaiAnalytics.mConfigLocation);
                    reset();
                }
                plugin.handlePlay();
            }

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                if (player == null)
                {
                    return;
                }
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
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.ERROR.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls4..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
                JVM INSTR tableswitch 1 3: default 52
            //                           1 58
            //                           2 82
            //                           3 95;
                   goto _L1 _L2 _L3 _L4
_L1:
                lastPlayerState = playerstate;
                return;
_L2:
                if (lastPlayerState == com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED)
                {
                    plugin.handleResume(true);
                }
                continue; /* Loop/switch isn't completed */
_L3:
                plugin.handlePause();
                continue; /* Loop/switch isn't completed */
_L4:
                plugin.handleError(mediaplayernotification.getCode().getName());
                if (true) goto _L1; else goto _L5
_L5:
            }

            
            {
                this$0 = AkamaiAnalytics.this;
                super();
            }
        };
        appContext = context.getApplicationContext();
        viewModel = assetviewmodel;
        plugin = new AnalyticsPlugin(appContext, mConfigLocation);
        reset();
    }

    public void attachPlayer(MediaPlayer mediaplayer)
    {
        player = mediaplayer;
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
    }

    public long bytesLoaded()
    {
        if (player == null)
        {
            return 0L;
        } else
        {
            return player.getBufferedRange().getDuration();
        }
    }

    public int droppedFrames()
    {
        if (player == null)
        {
            return 0;
        } else
        {
            return (int)player.getPlaybackMetrics().getDroppedFramesCount();
        }
    }

    public float getFps()
    {
        if (player == null)
        {
            return 0.0F;
        } else
        {
            return player.getPlaybackMetrics().getFrameRate();
        }
    }

    public boolean isLive()
    {
        return player != null && player.getCurrentItem().isLive();
    }

    public boolean isPlaying()
    {
        return player != null && player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING;
    }

    public void onDestroy()
    {
        plugin.handleError(ErrorCodes.Application_Close.toString());
    }

    public void onPause()
    {
        if (player != null)
        {
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
            player.removeEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
        }
        plugin.handleEnterBackground();
    }

    public float playBackRate()
    {
        if (player == null)
        {
            return 0.0F;
        } else
        {
            return (float)player.getPlaybackMetrics().getBitrate();
        }
    }

    public void reset()
    {
        plugin.handleSessionInit(this, false);
        plugin.setData("playerId", "Android-4.3.5.4000784");
        plugin.setData("format", "L");
        plugin.setData("eventName", viewModel.asset().getTitle());
    }

    public String serverIP()
    {
        if (viewModel == null)
        {
            return "";
        } else
        {
            Uri uri = Uri.parse(viewModel.getAuthenticatedStreamUrl());
            return (new StringBuilder()).append(uri.getHost()).append(":").append(uri.getPort()).toString();
        }
    }

    public float streamHeadPosition()
    {
        if (player == null)
        {
            return 0.0F;
        } else
        {
            return (float)player.getLocalTime() * 1000F;
        }
    }

    public float streamLength()
    {
        if (player == null)
        {
            return 0.0F;
        } else
        {
            return (float)player.getPlaybackRange().getDuration() * 1000F;
        }
    }

    public String streamURL()
    {
        if (viewModel == null)
        {
            return "";
        } else
        {
            return viewModel.getAuthenticatedStreamUrl();
        }
    }

    public String videoSize()
    {
        if (player == null)
        {
            return "";
        } else
        {
            return (new StringBuilder()).append(player.getView().getWidth()).append("x").append(player.getView().getHeight()).toString();
        }
    }

    public String viewSize()
    {
        if (player == null)
        {
            return "";
        } else
        {
            ViewGroup viewgroup = (ViewGroup)player.getView().getParent();
            return (new StringBuilder()).append(viewgroup.getWidth()).append("x").append(viewgroup.getHeight()).toString();
        }
    }



}
