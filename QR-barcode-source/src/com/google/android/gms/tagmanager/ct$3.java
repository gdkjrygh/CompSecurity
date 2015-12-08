// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ct, cn, cl

class ari
    implements ari
{

    final ct are;
    final Map arf;
    final Map arg;
    final Map arh;
    final Map ari;

    public void a(ari ari1, Set set, Set set1, cn cn1)
    {
        List list = (List)arf.get(ari1);
        List list1 = (List)arg.get(ari1);
        if (list != null)
        {
            set.addAll(list);
            cn1.oA().c(list, list1);
        }
        set = (List)arh.get(ari1);
        ari1 = (List)ari.get(ari1);
        if (set != null)
        {
            set1.addAll(set);
            cn1.oB().c(set, ari1);
        }
    }

    (ct ct1, Map map, Map map1, Map map2, Map map3)
    {
        are = ct1;
        arf = map;
        arg = map1;
        arh = map2;
        ari = map3;
        super();
    }
}
