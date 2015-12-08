// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import java.util.List;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.cast:
//            LocalPlayQueue, CastOperations

class val.currentTrackUrn
    implements f
{

    final CastOperations this$0;
    final Urn val$currentTrackUrn;

    public volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    public b call(List list)
    {
        if (list.isEmpty())
        {
            return b.just(LocalPlayQueue.empty());
        }
        if (list.contains(val$currentTrackUrn))
        {
            return loadLocalPlayQueue(val$currentTrackUrn, list);
        } else
        {
            return loadLocalPlayQueue((Urn)list.get(0), list);
        }
    }

    ()
    {
        this$0 = final_castoperations;
        val$currentTrackUrn = Urn.this;
        super();
    }
}
