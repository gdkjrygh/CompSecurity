// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ar, aj, ao, am

final class ap
    implements ar
{

    final Map a;
    final Map b;
    final Map c;
    final Map d;
    final ao e;

    ap(ao ao, Map map, Map map1, Map map2, Map map3)
    {
        e = ao;
        a = map;
        b = map1;
        c = map2;
        d = map3;
        super();
    }

    public final void a(am am, Set set, Set set1, aj aj1)
    {
        List list = (List)a.get(am);
        b.get(am);
        if (list != null)
        {
            set.addAll(list);
            aj1.c();
        }
        set = (List)c.get(am);
        d.get(am);
        if (set != null)
        {
            set1.addAll(set);
            aj1.d();
        }
    }
}
