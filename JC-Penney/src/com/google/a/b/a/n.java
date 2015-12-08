// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.b.w;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import com.google.a.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.a.b.a:
//            o, p

public final class n extends af
{

    public static final ag a = new o();
    private final j b;

    private n(j j1)
    {
        b = j1;
    }

    n(j j1, o o1)
    {
        this(j1);
    }

    public void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        af af1 = b.a(obj.getClass());
        if (af1 instanceof n)
        {
            d1.d();
            d1.e();
            return;
        } else
        {
            af1.a(d1, obj);
            return;
        }
    }

    public Object b(a a1)
    {
        c c1 = a1.f();
        switch (com.google.a.b.a.p.a[c1.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            a1.a();
            for (; a1.e(); arraylist.add(b(a1))) { }
            a1.b();
            return arraylist;

        case 2: // '\002'
            w w1 = new w();
            a1.c();
            for (; a1.e(); w1.put(a1.g(), b(a1))) { }
            a1.d();
            return w1;

        case 3: // '\003'
            return a1.h();

        case 4: // '\004'
            return Double.valueOf(a1.k());

        case 5: // '\005'
            return Boolean.valueOf(a1.i());

        case 6: // '\006'
            a1.j();
            return null;
        }
    }

}
