// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            G, I

final class J
    implements I.a
{

    final Map a;
    final Map b;
    final Map c;
    final Map d;
    final I e;

    J(I i, Map map, Map map1, Map map2, Map map3)
    {
        e = i;
        a = map;
        b = map1;
        c = map2;
        d = map3;
        super();
    }

    public final void a(com.google.android.gms.b.az.b b1, Set set, Set set1, G g)
    {
        List list = (List)a.get(b1);
        b.get(b1);
        if (list != null)
        {
            set.addAll(list);
            g.c();
        }
        set = (List)c.get(b1);
        d.get(b1);
        if (set != null)
        {
            set1.addAll(set);
            g.d();
        }
    }
}
