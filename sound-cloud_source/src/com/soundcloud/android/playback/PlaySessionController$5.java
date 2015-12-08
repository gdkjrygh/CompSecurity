// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import rx.b.b;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController, PlaybackResult

class this._cls0
    implements b
{

    final PlaySessionController this$0;

    public void call(PlaybackResult playbackresult)
    {
        playCurrent();
    }

    public volatile void call(Object obj)
    {
        call((PlaybackResult)obj);
    }

    ()
    {
        this$0 = PlaySessionController.this;
        super();
    }
}
