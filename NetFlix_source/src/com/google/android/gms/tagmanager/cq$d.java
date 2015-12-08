// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            cq, dh

public static class <init>
{

    private String Xl;
    private final List Zr;
    private final Map Zs;
    private int Zt;

    public <init> a(<init> <init>1)
    {
        String s = dh.j((com.google.android.gms.internal.j)<init>1.le().get(b.cI.toString()));
        List list = (List)Zs.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            Zs.put(s, obj);
        }
        ((List) (obj)).add(<init>1);
        return this;
    }

    public Zs a(Zs zs)
    {
        Zr.add(zs);
        return this;
    }

    public Zr bM(String s)
    {
        Xl = s;
        return this;
    }

    public Xl ch(int i)
    {
        Zt = i;
        return this;
    }

    public Zt lk()
    {
        return new <init>(Zr, Zs, Xl, Zt, null);
    }

    private ()
    {
        Zr = new ArrayList();
        Zs = new HashMap();
        Xl = "";
        Zt = 0;
    }

    Zt(Zt zt)
    {
        this();
    }
}
