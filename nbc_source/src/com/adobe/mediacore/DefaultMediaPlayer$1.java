// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.qos.metrics.PlaybackMetrics;

// Referenced classes of package com.adobe.mediacore:
//            SeekAdjustCompletedListener, DefaultMediaPlayer, VideoEngineDispatcher, VideoEngineAdapter, 
//            MediaPlayerItem, MediaPlayerClient

class this._cls0
    implements SeekAdjustCompletedListener
{

    final DefaultMediaPlayer this$0;

    public void onAdjustCompleted(long l)
    {
        if (DefaultMediaPlayer.access$000(DefaultMediaPlayer.this) != null)
        {
            DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).removeEventListener(.SEEK_ADJUST_COMPLETED, DefaultMediaPlayer.access$000(DefaultMediaPlayer.this));
        }
        DefaultMediaPlayer.access$200(DefaultMediaPlayer.this).seek(imeMapping.create(-1, l));
        if (te.PAUSED != getStatus() && te.SUSPENDED != getStatus())
        {
            DefaultMediaPlayer.access$200(DefaultMediaPlayer.this).play();
        }
        if (DefaultMediaPlayer.access$300(DefaultMediaPlayer.this).isLive() && DefaultMediaPlayer.access$400(DefaultMediaPlayer.this) != null)
        {
            DefaultMediaPlayer.access$400(DefaultMediaPlayer.this).update(DefaultMediaPlayer.access$500(DefaultMediaPlayer.this).getTime(), DefaultMediaPlayer.access$500(DefaultMediaPlayer.this).getPlaybackRange());
        }
        if (!DefaultMediaPlayer.access$600(DefaultMediaPlayer.this))
        {
            DefaultMediaPlayer.access$700(DefaultMediaPlayer.this);
        }
    }

    etrics()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
