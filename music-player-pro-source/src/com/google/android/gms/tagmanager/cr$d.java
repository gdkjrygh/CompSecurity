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
//            cr, di

public static class <init>
{

    private String TU;
    private final List asO;
    private final Map asP;
    private int asQ;

    public <init> a(<init> <init>1)
    {
        String s = di.j((com.google.android.gms.internal.j)<init>1.ql().get(b.df.toString()));
        List list = (List)asP.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            asP.put(s, obj);
        }
        ((List) (obj)).add(<init>1);
        return this;
    }

    public asP a(asP asp)
    {
        asO.add(asp);
        return this;
    }

    public asO cO(String s)
    {
        TU = s;
        return this;
    }

    public TU fO(int i)
    {
        asQ = i;
        return this;
    }

    public asQ qr()
    {
        return new <init>(asO, asP, TU, asQ, null);
    }

    private ()
    {
        asO = new ArrayList();
        asP = new HashMap();
        TU = "";
        asQ = 0;
    }

    asQ(asQ asq)
    {
        this();
    }
}
