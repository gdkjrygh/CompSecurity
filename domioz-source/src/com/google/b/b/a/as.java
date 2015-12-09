// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.ac;
import com.google.b.al;
import com.google.b.b.v;
import com.google.b.d.a;
import com.google.b.d.c;
import com.google.b.d.d;
import com.google.b.t;
import com.google.b.w;
import com.google.b.y;
import com.google.b.z;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.b.b.a:
//            ba

final class as extends al
{

    as()
    {
    }

    private void a(d d1, w w1)
    {
        if (w1 == null || (w1 instanceof y))
        {
            d1.f();
            return;
        }
        if (w1 instanceof ac)
        {
            w1 = w1.j();
            if (w1.k())
            {
                d1.a(w1.b());
                return;
            }
            if (w1.a())
            {
                d1.a(w1.g());
                return;
            } else
            {
                d1.b(w1.c());
                return;
            }
        }
        if (w1 instanceof t)
        {
            d1.b();
            for (w1 = w1.i().iterator(); w1.hasNext(); a(d1, (w)w1.next())) { }
            d1.c();
            return;
        }
        if (w1 instanceof z)
        {
            d1.d();
            java.util.Map.Entry entry;
            for (w1 = w1.h().a().iterator(); w1.hasNext(); a(d1, (w)entry.getValue()))
            {
                entry = (java.util.Map.Entry)w1.next();
                d1.a((String)entry.getKey());
            }

            d1.e();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Couldn't write ")).append(w1.getClass()).toString());
        }
    }

    private w b(a a1)
    {
        z z1;
        switch (com.google.b.b.a.ba.a[a1.f().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new ac(a1.h());

        case 1: // '\001'
            return new ac(new v(a1.h()));

        case 2: // '\002'
            return new ac(Boolean.valueOf(a1.i()));

        case 4: // '\004'
            a1.j();
            return y.a;

        case 5: // '\005'
            t t1 = new t();
            a1.a();
            for (; a1.e(); t1.a(b(a1))) { }
            a1.b();
            return t1;

        case 6: // '\006'
            z1 = new z();
            a1.c();
            break;
        }
        for (; a1.e(); z1.a(a1.g(), b(a1))) { }
        a1.d();
        return z1;
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final volatile void a(d d1, Object obj)
    {
        a(d1, (w)obj);
    }
}
