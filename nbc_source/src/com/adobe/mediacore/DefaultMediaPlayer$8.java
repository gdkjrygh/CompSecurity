// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;

// Referenced classes of package com.adobe.mediacore:
//            BufferingFullListener, DefaultMediaPlayer

class this._cls0
    implements BufferingFullListener
{

    final DefaultMediaPlayer this$0;

    public void onFull()
    {
        if (DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) == te.ERROR)
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerBufferFull").toString(), "Ignore event as media player is in ERROR state.");
        } else
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerBufferFull").toString(), (new StringBuilder()).append("Buffer full: ").append(DefaultMediaPlayer.access$500(DefaultMediaPlayer.this).getBufferLength()).append(".").toString());
            if (getStatus() == te.PAUSED)
            {
                DefaultMediaPlayer.access$2200(DefaultMediaPlayer.this);
                return;
            }
        }
    }

    etrics()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
