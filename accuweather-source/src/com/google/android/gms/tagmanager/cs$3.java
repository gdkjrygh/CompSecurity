// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cs, cm, ck

class ahz
    implements ahz
{

    final cs ahv;
    final Map ahw;
    final Map ahx;
    final Map ahy;
    final Map ahz;

    public void a(ahz ahz1, Set set, Set set1, cm cm1)
    {
        List list = (List)ahw.get(ahz1);
        List list1 = (List)ahx.get(ahz1);
        if (list != null)
        {
            set.addAll(list);
            cm1.lP().b(list, list1);
        }
        set = (List)ahy.get(ahz1);
        ahz1 = (List)ahz.get(ahz1);
        if (set != null)
        {
            set1.addAll(set);
            cm1.lQ().b(set, ahz1);
        }
    }

    (cs cs1, Map map, Map map1, Map map2, Map map3)
    {
        ahv = cs1;
        ahw = map;
        ahx = map1;
        ahy = map2;
        ahz = map3;
        super();
    }
}
