// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.java.collections.Lists;
import java.util.List;
import rx.b.h;

// Referenced classes of package com.soundcloud.android.collections:
//            MyCollections

final class 
    implements h
{

    public final MyCollections call(List list, List list1, List list2)
    {
        return new MyCollections(list1, list, Lists.transform(list2, StationRecord.TO_URN), false);
    }

    public final volatile Object call(Object obj, Object obj1, Object obj2)
    {
        return call((List)obj, (List)obj1, (List)obj2);
    }

    ()
    {
    }
}
