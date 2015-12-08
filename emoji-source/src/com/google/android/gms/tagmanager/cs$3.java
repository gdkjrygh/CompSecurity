// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cs, cm, ck

class ahC
    implements ahC
{

    final Map ahA;
    final Map ahB;
    final Map ahC;
    final cs ahy;
    final Map ahz;

    public void a(ahC ahc, Set set, Set set1, cm cm1)
    {
        List list = (List)ahz.get(ahc);
        List list1 = (List)ahA.get(ahc);
        if (list != null)
        {
            set.addAll(list);
            cm1.lU().b(list, list1);
        }
        set = (List)ahB.get(ahc);
        ahc = (List)ahC.get(ahc);
        if (set != null)
        {
            set1.addAll(set);
            cm1.lV().b(set, ahc);
        }
    }

    (cs cs1, Map map, Map map1, Map map2, Map map3)
    {
        ahy = cs1;
        ahz = map;
        ahA = map1;
        ahB = map2;
        ahC = map3;
        super();
    }
}
