// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.mediacore.logging.Logger;

// Referenced classes of package com.adobe.mediacore:
//            ItemReadyListener, DefaultMediaPlayer

class this._cls0
    implements ItemReadyListener
{

    final DefaultMediaPlayer this$0;

    public void onReady()
    {
        DefaultMediaPlayer.access$1600(DefaultMediaPlayer.this).i((new StringBuilder()).append(DefaultMediaPlayer.access$1400()).append("#onPlayerItemReady").toString(), "Media item ready for further processing.");
    }

    ()
    {
        this$0 = DefaultMediaPlayer.this;
        super();
    }
}
