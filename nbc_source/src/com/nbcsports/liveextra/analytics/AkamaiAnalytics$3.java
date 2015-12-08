// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayerNotification;
import com.akamai.android.analytics.AnalyticsPlugin;
import com.akamai.android.analytics.EndReasonCodes;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            AkamaiAnalytics

class ListenerStub extends PlaybackEventListenerStub
{

    public com.adobe.mediacore.State lastPlayerState;
    final AkamaiAnalytics this$0;

    public void onPlayComplete()
    {
        if (AkamaiAnalytics.access$000(AkamaiAnalytics.this) == null)
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
        if (AkamaiAnalytics.access$000(AkamaiAnalytics.this) == null)
        {
            return;
        }
        super.onPlayStart();
        if (lastPlayerState == com.adobe.mediacore.State.COMPLETE)
        {
            plugin = new AnalyticsPlugin(AkamaiAnalytics.access$100(AkamaiAnalytics.this), AkamaiAnalytics.mConfigLocation);
            reset();
        }
        plugin.handlePlay();
    }

    public void onStateChanged(com.adobe.mediacore.State state, MediaPlayerNotification mediaplayernotification)
    {
        if (AkamaiAnalytics.access$000(AkamaiAnalytics.this) == null)
        {
            return;
        }
        super.onStateChanged(state, mediaplayernotification);
        .SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[state.ordinal()];
        JVM INSTR tableswitch 1 3: default 52
    //                   1 58
    //                   2 82
    //                   3 95;
           goto _L1 _L2 _L3 _L4
_L1:
        lastPlayerState = state;
        return;
_L2:
        if (lastPlayerState == com.adobe.mediacore.State.PAUSED)
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

    tionCode()
    {
        this$0 = AkamaiAnalytics.this;
        super();
    }
}
