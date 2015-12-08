// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.xp;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            at, ao, aq

final class ar
    implements at
{

    final Map a;
    final Map b;
    final Map c;
    final Map d;
    final aq e;

    ar(aq aq, Map map, Map map1, Map map2, Map map3)
    {
        e = aq;
        a = map;
        b = map1;
        c = map2;
        d = map3;
        super();
    }

    public final void a(xp xp, Set set, Set set1, ao ao1)
    {
        List list = (List)a.get(xp);
        b.get(xp);
        if (list != null)
        {
            set.addAll(list);
            ao1.c();
        }
        set = (List)c.get(xp);
        d.get(xp);
        if (set != null)
        {
            set1.addAll(set);
            ao1.d();
        }
    }
}
