// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bl, bg, be

class d
    implements d
{

    final Map a;
    final Map b;
    final Map c;
    final Map d;
    final bl e;

    public void a(com.google.android.gms.internal.zze zze, Set set, Set set1, bg bg1)
    {
        List list = (List)a.get(zze);
        List list1 = (List)b.get(zze);
        if (list != null)
        {
            set.addAll(list);
            bg1.c().zzc(list, list1);
        }
        set = (List)c.get(zze);
        zze = (List)d.get(zze);
        if (set != null)
        {
            set1.addAll(set);
            bg1.d().zzc(set, zze);
        }
    }

    e(bl bl1, Map map, Map map1, Map map2, Map map3)
    {
        e = bl1;
        a = map;
        b = map1;
        c = map2;
        d = map3;
        super();
    }
}
