// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics.conviva;

import com.adobe.mediacore.MediaPlayerNotification;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics.conviva:
//            ConvivaAnalytics

class tub extends PlaybackEventListenerStub
{

    final ConvivaAnalytics this$0;

    public void onStateChanged(com.adobe.mediacore.tate tate, MediaPlayerNotification mediaplayernotification)
    {
        super.onStateChanged(tate, mediaplayernotification);
        .SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[tate.ordinal()];
        JVM INSTR tableswitch 1 2: default 36
    //                   1 37
    //                   2 62;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        ConvivaAnalytics.access$000(ConvivaAnalytics.this);
        if (ConvivaAnalytics.access$100(ConvivaAnalytics.this))
        {
            ConvivaAnalytics.access$200(ConvivaAnalytics.this);
            return;
        }
          goto _L1
_L3:
        ConvivaAnalytics.access$000(ConvivaAnalytics.this);
        return;
    }

    tub()
    {
        this$0 = ConvivaAnalytics.this;
        super();
    }
}
