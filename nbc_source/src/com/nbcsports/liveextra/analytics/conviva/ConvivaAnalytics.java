// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import android.content.Context;
import android.text.TextUtils;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.conviva.ConvivaContentInfo;
import com.conviva.LivePass;
import com.conviva.streamerProxies.adobe.PrimeTimeDefaultMediaPlayerProxy;
import com.nbcsports.liveextra.analytics.PlayerAnalytics;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.system.NBCSystem;
import java.util.HashMap;
import java.util.Map;
import timber.log.Timber;

public class ConvivaAnalytics
    implements PlayerAnalytics
{

    private final Context context;
    private final AuthService pass;
    private PrimeTimeDefaultMediaPlayerProxy proxy;
    private int sessionId;
    private HashMap tags;
    private final AssetViewModel viewModel;

    public ConvivaAnalytics(Context context1, AssetViewModel assetviewmodel, AuthService authservice, PrimeTimeDefaultMediaPlayerProxy primetimedefaultmediaplayerproxy)
    {
        sessionId = -1;
        context = context1;
        viewModel = assetviewmodel;
        pass = authservice;
        proxy = primetimedefaultmediaplayerproxy;
    }

    private void cleanupSession()
    {
        if (sessionId >= 0)
        {
            LivePass.cleanupSession(sessionId);
            sessionId = -1;
        }
    }

    private boolean createSession()
    {
        if (sessionId >= 0)
        {
            return false;
        }
        Map map = getTags();
        Object obj;
        if (viewModel.getTrackName() != null)
        {
            obj = (new StringBuilder()).append("_").append(viewModel.getTrackName()).toString();
        } else
        {
            obj = "";
        }
        if (viewModel.asset().getPid() != null)
        {
            obj = String.format("%s_%s%s", new Object[] {
                viewModel.asset().getTitle(), viewModel.asset().getPid(), obj
            });
        } else
        {
            obj = String.format("%s%s", new Object[] {
                viewModel.asset().getTitle(), obj
            });
        }
        obj = new ConvivaContentInfo(((String) (obj)), map);
        obj.playerName = "NBCSLE Android";
        obj.viewerId = android.provider.Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        obj.isLive = viewModel.isLive();
        obj.streamUrl = viewModel.getStreamUrl();
        try
        {
            sessionId = LivePass.createSession(null, ((ConvivaContentInfo) (obj)));
        }
        catch (Exception exception)
        {
            Timber.w(exception, "Error creating Conviva session", new Object[0]);
        }
        return true;
    }

    private Map getTags()
    {
        tags = new HashMap();
        String s = viewModel.getSport();
        String s1 = viewModel.asset().getChannel();
        VideoSource videosource = viewModel.getSelectedSource();
        String s2 = viewModel.asset().getPid();
        String s3 = viewModel.asset().getTitle();
        tags.put("appVersion", NBCSystem.getVersion());
        tags.put("eventTitle", s3);
        if (!TextUtils.isEmpty(s))
        {
            tags.put("sport", s);
        }
        if (s2 != null)
        {
            tags.put("eventPID", s2);
        }
        if (s1 != null)
        {
            tags.put("channel", s1);
        }
        if (videosource != null)
        {
            tags.put("id", videosource.getId());
            tags.put("camera", videosource.getName());
        }
        if (pass.getSelectedMvpd() != null)
        {
            tags.put("provider", pass.getSelectedMvpd().getDisplayName());
        }
        return tags;
    }

    private void initSession()
    {
        try
        {
            LivePass.attachStreamer(sessionId, proxy);
            return;
        }
        catch (Exception exception)
        {
            Timber.w(exception, "Error attaching player to Conviva session", new Object[0]);
        }
    }

    public void attachPlayer(MediaPlayer mediaplayer)
    {
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, new PlaybackEventListenerStub() {

            final ConvivaAnalytics this$0;

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                super.onStateChanged(playerstate, mediaplayernotification);
                static class _cls3
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.INITIALIZING.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls3..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
                JVM INSTR tableswitch 1 2: default 36
            //                           1 37
            //                           2 62;
                   goto _L1 _L2 _L3
_L1:
                return;
_L2:
                cleanupSession();
                if (createSession())
                {
                    initSession();
                    return;
                }
                  goto _L1
_L3:
                cleanupSession();
                return;
            }

            
            {
                this$0 = ConvivaAnalytics.this;
                super();
            }
        });
        mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, new AdPlaybackEventListenerStub() {

            final ConvivaAnalytics this$0;

            public void onAdBreakComplete(AdBreak adbreak)
            {
                super.onAdBreakComplete(adbreak);
                LivePass.adEnd(sessionId);
                try
                {
                    LivePass.attachStreamer(sessionId, proxy);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AdBreak adbreak)
                {
                    Timber.w(adbreak, "Error reattaching player to Conviva session after ad break", new Object[0]);
                }
            }

            public void onAdBreakStart(AdBreak adbreak)
            {
                super.onAdBreakStart(adbreak);
                LivePass.adStart(sessionId);
                try
                {
                    LivePass.pauseMonitor(sessionId);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (AdBreak adbreak)
                {
                    Timber.w(adbreak, "Error pausing Conviva session", new Object[0]);
                }
            }

            
            {
                this$0 = ConvivaAnalytics.this;
                super();
            }
        });
    }

    public void onDestroy()
    {
        cleanupSession();
        if (proxy != null)
        {
            proxy.Cleanup();
            proxy = null;
        }
    }

    public void onPause()
    {
    }





}
