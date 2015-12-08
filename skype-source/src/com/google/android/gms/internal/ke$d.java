// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.tagmanager.cl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ke, f

public static final class <init>
{

    private final List a;
    private final Map b;
    private String c;
    private int d;

    public final <init> a()
    {
        d = 1;
        return this;
    }

    public final d a(d d1)
    {
        String s = cl.a((a)d1.a().get(f.bk.toString()));
        List list = (List)b.get(s);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            b.put(s, obj);
        }
        ((List) (obj)).add(d1);
        return this;
    }

    public final b a(b b1)
    {
        a.add(b1);
        return this;
    }

    public final a a(String s)
    {
        c = s;
        return this;
    }

    public final c b()
    {
        return new <init>(a, b, c, d, (byte)0);
    }

    private ()
    {
        a = new ArrayList();
        b = new HashMap();
        c = "";
        d = 0;
    }

    d(byte byte0)
    {
        this();
    }
}
