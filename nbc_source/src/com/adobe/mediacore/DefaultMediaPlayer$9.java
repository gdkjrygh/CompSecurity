// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;


// Referenced classes of package com.adobe.mediacore:
//            ViewClickListener, DefaultMediaPlayer, TimelineMonitor

class this._cls0
    implements ViewClickListener
{

    final DefaultMediaPlayer this$0;

    public void onClick()
    {
        if (DefaultMediaPlayer.access$900(DefaultMediaPlayer.this) != null)
        {
            DefaultMediaPlayer.access$900(DefaultMediaPlayer.this).processAdClick();
        }
    }

    ()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
