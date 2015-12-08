// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzcp, zzck, zzci

class zzaNu
    implements a
{

    final zzcp zzaNq;
    final Map zzaNr;
    final Map zzaNs;
    final Map zzaNt;
    final Map zzaNu;

    public void zza(com.google.android.gms.internal.e e, Set set, Set set1, zzck zzck1)
    {
        List list = (List)zzaNr.get(e);
        List list1 = (List)zzaNs.get(e);
        if (list != null)
        {
            set.addAll(list);
            zzck1.zzyU().zzc(list, list1);
        }
        set = (List)zzaNt.get(e);
        e = (List)zzaNu.get(e);
        if (set != null)
        {
            set1.addAll(set);
            zzck1.zzyV().zzc(set, e);
        }
    }

    a(zzcp zzcp1, Map map, Map map1, Map map2, Map map3)
    {
        zzaNq = zzcp1;
        zzaNr = map;
        zzaNs = map1;
        zzaNt = map2;
        zzaNu = map3;
        super();
    }
}
