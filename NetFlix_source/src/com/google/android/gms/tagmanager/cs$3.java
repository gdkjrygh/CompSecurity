// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cs, cm, ck

class ZU
    implements ZU
{

    final cs ZQ;
    final Map ZR;
    final Map ZS;
    final Map ZT;
    final Map ZU;

    public void a(ZU zu, Set set, Set set1, cm cm1)
    {
        List list = (List)ZR.get(zu);
        List list1 = (List)ZS.get(zu);
        if (list != null)
        {
            set.addAll(list);
            cm1.kK().b(list, list1);
        }
        set = (List)ZT.get(zu);
        zu = (List)ZU.get(zu);
        if (set != null)
        {
            set1.addAll(set);
            cm1.kL().b(set, zu);
        }
    }

    (cs cs1, Map map, Map map1, Map map2, Map map3)
    {
        ZQ = cs1;
        ZR = map;
        ZS = map1;
        ZT = map2;
        ZU = map3;
        super();
    }
}
