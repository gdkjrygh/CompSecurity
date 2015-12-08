// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, PlayQueueManager, PlayQueue

class this._cls0
    implements b
{

    final PlaySessionController this$0;

    public void call(PlayQueue playqueue)
    {
        PlaySessionController.access$000(PlaySessionController.this).appendPlayQueueItems(playqueue);
    }

    public volatile void call(Object obj)
    {
        call((PlayQueue)obj);
    }

    ()
    {
        this$0 = PlaySessionController.this;
        super();
    }
}
