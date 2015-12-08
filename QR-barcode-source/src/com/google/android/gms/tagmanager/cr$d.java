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

    private String Sx;
    private final List aqF;
    private final Map aqG;
    private int aqH;

    public <init> a(<init> <init>1)
    {
        String s = di.j((com.google.android.gms.internal.j)<init>1.oU().get(b.df.toString()));
        List list = (List)aqG.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            aqG.put(s, obj);
        }
        ((List) (obj)).add(<init>1);
        return this;
    }

    public aqG a(aqG aqg)
    {
        aqF.add(aqg);
        return this;
    }

    public aqF cM(String s)
    {
        Sx = s;
        return this;
    }

    public Sx fm(int i)
    {
        aqH = i;
        return this;
    }

    public aqH pa()
    {
        return new <init>(aqF, aqG, Sx, aqH, null);
    }

    private ()
    {
        aqF = new ArrayList();
        aqG = new HashMap();
        Sx = "";
        aqH = 0;
    }

    aqH(aqH aqh)
    {
        this();
    }
}
