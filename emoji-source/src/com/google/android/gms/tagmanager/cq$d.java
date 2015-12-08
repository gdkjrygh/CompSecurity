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

    private String aeU;
    private final List agZ;
    private final Map aha;
    private int ahb;

    public <init> a(<init> <init>1)
    {
        String s = dh.j((com.google.android.gms.internal.j)<init>1.mo().get(b.cI.toString()));
        List list = (List)aha.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            aha.put(s, obj);
        }
        ((List) (obj)).add(<init>1);
        return this;
    }

    public aha a(aha aha1)
    {
        agZ.add(aha1);
        return this;
    }

    public agZ ce(String s)
    {
        aeU = s;
        return this;
    }

    public aeU du(int i)
    {
        ahb = i;
        return this;
    }

    public ahb mu()
    {
        return new <init>(agZ, aha, aeU, ahb, null);
    }

    private ()
    {
        agZ = new ArrayList();
        aha = new HashMap();
        aeU = "";
        ahb = 0;
    }

    ahb(ahb ahb1)
    {
        this();
    }
}
