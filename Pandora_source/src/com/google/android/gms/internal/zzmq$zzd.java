// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzdf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzmq, zzb

public static class <init>
{

    private final List zzaHl;
    private final Map zzaHm;
    private int zzaHn;
    private String zzacK;

    public <init> zzb(<init> <init>1)
    {
        zzaHl.add(<init>1);
        return this;
    }

    public zzaHl zzc(zzaHl zzahl)
    {
        String s = zzdf.zzg((g)zzahl.zzyt().get(zzb.zzdJ.toString()));
        List list = (List)zzaHm.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaHm.put(s, obj);
        }
        ((List) (obj)).add(zzahl);
        return this;
    }

    public zzaHm zzen(String s)
    {
        zzacK = s;
        return this;
    }

    public zzacK zzhM(int i)
    {
        zzaHn = i;
        return this;
    }

    public zzaHn zzyy()
    {
        return new <init>(zzaHl, zzaHm, zzacK, zzaHn, null);
    }

    private ()
    {
        zzaHl = new ArrayList();
        zzaHm = new HashMap();
        zzacK = "";
        zzaHn = 0;
    }

    zzaHn(zzaHn zzahn)
    {
        this();
    }
}
