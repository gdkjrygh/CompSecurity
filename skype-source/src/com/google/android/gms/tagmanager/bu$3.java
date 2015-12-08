// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bu, bp

final class d
    implements d
{

    final Map a;
    final Map b;
    final Map c;
    final Map d;
    final bu e;

    public final void a(com.google.android.gms.internal._cls3 _pcls3, Set set, Set set1, bp bp1)
    {
        List list = (List)a.get(_pcls3);
        b.get(_pcls3);
        if (list != null)
        {
            set.addAll(list);
            bp1.c();
        }
        set = (List)c.get(_pcls3);
        d.get(_pcls3);
        if (set != null)
        {
            set1.addAll(set);
            bp1.d();
        }
    }

    (bu bu1, Map map, Map map1, Map map2, Map map3)
    {
        e = bu1;
        a = map;
        b = map1;
        c = map2;
        d = map3;
        super();
    }
}
