// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ct, cn, cl

class atr
    implements atr
{

    final ct atn;
    final Map ato;
    final Map atp;
    final Map atq;
    final Map atr;

    public void a(atr atr1, Set set, Set set1, cn cn1)
    {
        List list = (List)ato.get(atr1);
        List list1 = (List)atp.get(atr1);
        if (list != null)
        {
            set.addAll(list);
            cn1.pR().c(list, list1);
        }
        set = (List)atq.get(atr1);
        atr1 = (List)atr.get(atr1);
        if (set != null)
        {
            set1.addAll(set);
            cn1.pS().c(set, atr1);
        }
    }

    (ct ct1, Map map, Map map1, Map map2, Map map3)
    {
        atn = ct1;
        ato = map;
        atp = map1;
        atq = map2;
        atr = map3;
        super();
    }
}
