// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.analytics;

import com.adobe.mediacore.MediaPlayer;
import com.akamai.android.analytics.AnalyticsPlugin;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;

// Referenced classes of package com.nbcsports.liveextra.analytics:
//            AkamaiAnalytics

class nerStub extends QosEventListenerStub
{

    final AkamaiAnalytics this$0;

    public void onSeekComplete(long l)
    {
        if (AkamaiAnalytics.access$000(AkamaiAnalytics.this) == null)
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
        if (AkamaiAnalytics.access$000(AkamaiAnalytics.this) == null)
        {
            return;
        } else
        {
            super.onSeekStart();
            plugin.handleSeekStart(AkamaiAnalytics.access$000(AkamaiAnalytics.this).getCurrentTime());
            return;
        }
    }

    nerStub()
    {
        this$0 = AkamaiAnalytics.this;
        super();
    }
}
