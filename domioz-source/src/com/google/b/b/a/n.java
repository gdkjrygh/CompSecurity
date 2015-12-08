// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.b.w;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import com.google.b.k;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.b.b.a:
//            o, p

public final class n extends al
{

    public static final am a = new o();
    private final k b;

    private n(k k1)
    {
        b = k1;
    }

    n(k k1, byte byte0)
    {
        this(k1);
    }

    public final Object a(a a1)
    {
        c c1 = a1.f();
        switch (com.google.b.b.a.p.a[c1.ordinal()])
        {
        default:
            throw new IllegalStateException();

        case 1: // '\001'
            ArrayList arraylist = new ArrayList();
            a1.a();
            for (; a1.e(); arraylist.add(a(a1))) { }
            a1.b();
            return arraylist;

        case 2: // '\002'
            w w1 = new w();
            a1.c();
            for (; a1.e(); w1.put(a1.g(), a(a1))) { }
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

    public final void a(d d1, Object obj)
    {
        if (obj == null)
        {
            d1.f();
            return;
        }
        al al1 = b.a(obj.getClass());
        if (al1 instanceof n)
        {
            d1.d();
            d1.e();
            return;
        } else
        {
            al1.a(d1, obj);
            return;
        }
    }

}
