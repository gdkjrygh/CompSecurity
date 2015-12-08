// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import java.util.List;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.stations:
//            StationBucket

final class val.bucketSize
    implements f
{

    final int val$bucketSize;
    final int val$collectionType;
    final String val$name;

    public final StationBucket call(List list)
    {
        return new StationBucket(val$name, val$collectionType, val$bucketSize, list);
    }

    public final volatile Object call(Object obj)
    {
        return call((List)obj);
    }

    ()
    {
        val$name = s;
        val$collectionType = i;
        val$bucketSize = j;
        super();
    }
}
