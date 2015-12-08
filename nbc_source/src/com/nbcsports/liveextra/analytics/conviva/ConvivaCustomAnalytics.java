// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import android.content.Context;
import android.content.res.Resources;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerNotification;
import com.conviva.ConvivaContentInfo;
import com.conviva.LivePass;
import com.conviva.streamerProxies.adobe.PrimeTimeDefaultMediaPlayerProxy;
import com.nbcsports.liveextra.analytics.PlayerAnalytics;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import java.util.HashMap;
import timber.log.Timber;

public class ConvivaCustomAnalytics
    implements PlayerAnalytics
{

    private final Context context;
    private PrimeTimeDefaultMediaPlayerProxy proxy;
    private int sessionId;
    private final AssetViewModel viewModel;

    public ConvivaCustomAnalytics(Context context1, AssetViewModel assetviewmodel, PrimeTimeDefaultMediaPlayerProxy primetimedefaultmediaplayerproxy)
    {
        context = context1;
        viewModel = assetviewmodel;
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
        Object obj = new HashMap();
        ConvivaContentInfo convivacontentinfo = new ConvivaContentInfo(String.format("[%s] %s", new Object[] {
            viewModel.asset().getPid(), viewModel.asset().getTitle()
        }), ((java.util.Map) (obj)));
        StringBuilder stringbuilder = (new StringBuilder()).append("googleNbcliveProd Android ");
        if (context.getResources().getBoolean(0x7f0b0004))
        {
            obj = " Tablet";
        } else
        {
            obj = " Phone";
        }
        convivacontentinfo.playerName = stringbuilder.append(((String) (obj))).toString();
        convivacontentinfo.viewerId = android.provider.Settings.Secure.getString(context.getApplicationContext().getContentResolver(), "android_id");
        convivacontentinfo.isLive = viewModel.isLive();
        convivacontentinfo.streamUrl = viewModel.getStreamUrl();
        try
        {
            sessionId = LivePass.createSession(null, convivacontentinfo);
        }
        catch (Exception exception)
        {
            Timber.w(exception, "Error creating Conviva session", new Object[0]);
        }
        return true;
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

            final ConvivaCustomAnalytics this$0;

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                super.onStateChanged(playerstate, mediaplayernotification);
                static class _cls2
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PREPARING.ordinal()] = 1;
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

                _cls2..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()];
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
                this$0 = ConvivaCustomAnalytics.this;
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
