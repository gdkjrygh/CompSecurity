// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlayQueue, PlayQueueOperations

class this._cls0
    implements f
{

    final PlayQueueOperations this$0;

    public PlayQueue call(List list)
    {
        return new PlayQueue(list);
    }

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    ()
    {
        this$0 = PlayQueueOperations.this;
        super();
    }
}
