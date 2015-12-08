// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.os.Handler;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;

// Referenced classes of package com.adobe.mediacore:
//            DefaultMediaPlayer, AdTimeline, TimelineMonitor, TrickPlayManager

class this._cls0
    implements Runnable
{

    final DefaultMediaPlayer this$0;

    public void run()
    {
        if (DefaultMediaPlayer.access$200(DefaultMediaPlayer.this) != null)
        {
            DefaultMediaPlayer.access$500(DefaultMediaPlayer.this).update();
            long l = getCurrentTime();
            if (DefaultMediaPlayer.access$800(DefaultMediaPlayer.this) != null)
            {
                DefaultMediaPlayer.access$800(DefaultMediaPlayer.this).update(l);
            }
            if (DefaultMediaPlayer.access$900(DefaultMediaPlayer.this) != null)
            {
                DefaultMediaPlayer.access$900(DefaultMediaPlayer.this).update(l);
            }
            if (DefaultMediaPlayer.access$1000(DefaultMediaPlayer.this) != null)
            {
                DefaultMediaPlayer.access$1000(DefaultMediaPlayer.this).update(l);
            }
        }
        if (!DefaultMediaPlayer.access$1100(DefaultMediaPlayer.this))
        {
            DefaultMediaPlayer.access$1300(DefaultMediaPlayer.this).postDelayed(DefaultMediaPlayer.access$1200(DefaultMediaPlayer.this), 250L);
        }
    }

    etrics()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
