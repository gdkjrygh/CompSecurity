// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.api.model.StationRecord;
import com.soundcloud.java.collections.Lists;
import java.util.Collections;
import java.util.List;
import rx.a;
import rx.b.h;

// Referenced classes of package com.soundcloud.android.collections:
//            MyCollections

final class 
    implements h
{

    public final volatile Object call(Object obj, Object obj1, Object obj2)
    {
        return call((a)obj, (a)obj1, (a)obj2);
    }

    public final a call(a a1, a a2, a a3)
    {
        if (a1.c() && a2.c() && a3.c())
        {
            return a.a();
        }
        List list;
        List list1;
        List list2;
        boolean flag;
        if (a2.b())
        {
            list = Collections.emptyList();
        } else
        {
            list = (List)a2.c;
        }
        if (a1.b())
        {
            list1 = Collections.emptyList();
        } else
        {
            list1 = (List)a1.c;
        }
        if (a3.b())
        {
            list2 = Collections.emptyList();
        } else
        {
            list2 = (List)a3.c;
        }
        list2 = Lists.transform(list2, StationRecord.TO_URN);
        if (a2.b() || a1.b() || a3.b())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a.a(new MyCollections(list, list1, list2, flag));
    }

    ()
    {
    }
}
