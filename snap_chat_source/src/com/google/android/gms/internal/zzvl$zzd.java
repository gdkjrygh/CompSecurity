// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.zzde;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzvl, zzb

public static class <init>
{

    private String zzYw;
    private final List zzaCk;
    private final Map zzaCl;
    private int zzaCm;

    public <init> zzb(<init> <init>1)
    {
        zzaCk.add(<init>1);
        return this;
    }

    public zzaCk zzc(zzaCk zzack)
    {
        String s = zzde.zzg((g)zzack.zzuv().get(zzb.zzdf.toString()));
        List list = (List)zzaCl.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            zzaCl.put(s, obj);
        }
        ((List) (obj)).add(zzack);
        return this;
    }

    public zzaCl zzdy(String s)
    {
        zzYw = s;
        return this;
    }

    public zzYw zzhk(int i)
    {
        zzaCm = i;
        return this;
    }

    public zzaCm zzuA()
    {
        return new <init>(zzaCk, zzaCl, zzYw, zzaCm, null);
    }

    private ()
    {
        zzaCk = new ArrayList();
        zzaCl = new HashMap();
        zzYw = "";
        zzaCm = 0;
    }

    zzaCm(zzaCm zzacm)
    {
        this();
    }
}
