// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzco, zzcj, zzch

class zzaAm
    implements a
{

    final zzco zzaAi;
    final Map zzaAj;
    final Map zzaAk;
    final Map zzaAl;
    final Map zzaAm;

    public void zza(com.google.android.gms.internal.e e, Set set, Set set1, zzcj zzcj1)
    {
        List list = (List)zzaAj.get(e);
        List list1 = (List)zzaAk.get(e);
        if (list != null)
        {
            set.addAll(list);
            zzcj1.zzto().zzc(list, list1);
        }
        set = (List)zzaAl.get(e);
        e = (List)zzaAm.get(e);
        if (set != null)
        {
            set1.addAll(set);
            zzcj1.zztp().zzc(set, e);
        }
    }

    a(zzco zzco1, Map map, Map map1, Map map2, Map map3)
    {
        zzaAi = zzco1;
        zzaAj = map;
        zzaAk = map1;
        zzaAl = map2;
        zzaAm = map3;
        super();
    }
}
