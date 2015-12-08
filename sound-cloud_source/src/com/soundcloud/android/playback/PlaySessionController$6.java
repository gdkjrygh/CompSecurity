// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import javax.inject.Provider;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlaySessionController, PlaybackStrategy

class this._cls0
    implements f
{

    final PlaySessionController this$0;

    public volatile Object call(Object obj)
    {
        return call((PlayQueue)obj);
    }

    public b call(PlayQueue playqueue)
    {
        return ((PlaybackStrategy)PlaySessionController.access$200(PlaySessionController.this).get()).playCurrent();
    }

    ()
    {
        this$0 = PlaySessionController.this;
        super();
    }
}
