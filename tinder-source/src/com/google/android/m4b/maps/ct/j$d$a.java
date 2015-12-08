// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            j, i, v, q, 
//            f

public final class <init>
{

    private final Iterator a;
    private java.util.try b;
    private final boolean c;
    private b d;

    public final void a(int k, f f1)
    {
        while (b != null && ((b)b.getKey()).b < k) 
        {
            Object obj = (b)b.getKey();
            if (c && ((c) (obj)).c.c == c && !((c) (obj)).c)
            {
                int l = ((c) (obj)).c;
                obj = (q)b.getValue();
                f1.a(1, 3);
                f1.a(2, 0);
                f1.j(l);
                f1.a(3, 2);
                f1.a(((q) (obj)));
                f1.a(1, 4);
            } else
            {
                i.a(((b) (obj)), b.getValue(), f1);
            }
            if (a.hasNext())
            {
                b = (java.util.try)a.next();
            } else
            {
                b = null;
            }
        }
    }

    private ( , boolean flag)
    {
        d = ;
        super();
         = d.d;
        if (((i) ()).c)
        {
             = new nit>(((i) ()).a.entrySet().iterator());
        } else
        {
             = ((i) ()).a.entrySet().iterator();
        }
        a = ;
        if (a.hasNext())
        {
            b = (java.util.try)a.next();
        }
        c = flag;
    }

    public c(c c1, boolean flag, byte byte0)
    {
        this(c1, flag);
    }
}
