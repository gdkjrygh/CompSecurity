// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            ItemUpdatedListener, DefaultMediaPlayer, MediaPlayerEvent, VideoEngineDispatcher

class this._cls0
    implements ItemUpdatedListener
{

    final DefaultMediaPlayer this$0;

    public void onUpdated()
    {
        if (DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) == te.ERROR)
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemRefreshed").toString(), "Ignore event as media player is in ERROR state.");
            return;
        }
        if (DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) == te.INITIALIZED || DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) == te.INITIALIZING || DefaultMediaPlayer.access$1700(DefaultMediaPlayer.this) == te.PREPARING && !DefaultMediaPlayer.access$2000(DefaultMediaPlayer.this))
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).w((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemRefreshed").toString(), "Ignore event as media player is in PREPARING state.");
            return;
        } else
        {
            DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemRefreshed").toString(), "Media player item refreshed.");
            DefaultMediaPlayer.access$2100(DefaultMediaPlayer.this);
            DefaultMediaPlayer.access$100(DefaultMediaPlayer.this).dispatch(new MediaPlayerEvent(.UPDATED));
            return;
        }
    }

    ()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
