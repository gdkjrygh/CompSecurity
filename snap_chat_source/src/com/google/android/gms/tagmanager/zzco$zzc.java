// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzco

static class 
{

    private final Set zzaAe = new HashSet();
    private final Map zzaAp = new HashMap();
    private final Map zzaAq = new HashMap();
    private final Map zzaAr = new HashMap();
    private final Map zzaAs = new HashMap();
    private com.google.android.gms.internal.c.zzaAt zzaAt;

    public void zza(com.google.android.gms.internal.c c)
    {
        zzaAe.add(c);
    }

    public void zza(com.google.android.gms.internal.c c, com.google.android.gms.internal.c c1)
    {
        List list = (List)zzaAp.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaAp.put(c, obj);
        }
        ((List) (obj)).add(c1);
    }

    public void zza(com.google.android.gms.internal.c c, String s)
    {
        List list = (List)zzaAr.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaAr.put(c, obj);
        }
        ((List) (obj)).add(s);
    }

    public void zzb(com.google.android.gms.internal.c c)
    {
        zzaAt = c;
    }

    public void zzb(com.google.android.gms.internal.c c, com.google.android.gms.internal.c c1)
    {
        List list = (List)zzaAq.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaAq.put(c, obj);
        }
        ((List) (obj)).add(c1);
    }

    public void zzb(com.google.android.gms.internal.c c, String s)
    {
        List list = (List)zzaAs.get(c);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaAs.put(c, obj);
        }
        ((List) (obj)).add(s);
    }

    public Set zztL()
    {
        return zzaAe;
    }

    public Map zztM()
    {
        return zzaAp;
    }

    public Map zztN()
    {
        return zzaAr;
    }

    public Map zztO()
    {
        return zzaAs;
    }

    public Map zztP()
    {
        return zzaAq;
    }

    public com.google.android.gms.internal.c zztQ()
    {
        return zzaAt;
    }

    public ()
    {
    }
}
