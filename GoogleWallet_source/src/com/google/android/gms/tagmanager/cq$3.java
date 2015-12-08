// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq, ck

final class aPF
    implements aPF
{

    final cq aPB;
    final Map aPC;
    final Map aPD;
    final Map aPE;
    final Map aPF;

    public final void a(aPF apf, Set set, Set set1, ck ck1)
    {
        List list = (List)aPC.get(apf);
        aPD.get(apf);
        if (list != null)
        {
            set.addAll(list);
            ck1.td();
        }
        set = (List)aPE.get(apf);
        aPF.get(apf);
        if (set != null)
        {
            set1.addAll(set);
            ck1.te();
        }
    }

    (cq cq1, Map map, Map map1, Map map2, Map map3)
    {
        aPB = cq1;
        aPC = map;
        aPD = map1;
        aPE = map2;
        aPF = map3;
        super();
    }
}
