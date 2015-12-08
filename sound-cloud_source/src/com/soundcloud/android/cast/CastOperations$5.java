// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.cast;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.List;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.cast:
//            LocalPlayQueue, CastOperations

class this._cls0
    implements g
{

    final CastOperations this$0;

    public LocalPlayQueue call(PropertySet propertyset, List list)
    {
        return new LocalPlayQueue(CastOperations.access$100(CastOperations.this, list), list, CastOperations.access$200(CastOperations.this, propertyset), (Urn)propertyset.get(TrackProperty.URN));
    }

    public volatile Object call(Object obj, Object obj1)
    {
        return call((PropertySet)obj, (List)obj1);
    }

    ()
    {
        this$0 = CastOperations.this;
        super();
    }
}
