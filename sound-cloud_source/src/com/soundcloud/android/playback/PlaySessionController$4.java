// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import rx.Y;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionController

class this._cls0
    implements a
{

    final PlaySessionController this$0;

    public void call()
    {
        PlaySessionController.access$100(PlaySessionController.this).unsubscribe();
    }

    ()
    {
        this$0 = PlaySessionController.this;
        super();
    }
}
