// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.b.v;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import com.google.a.r;
import com.google.a.t;
import com.google.a.w;
import com.google.a.z;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.a.b.a:
//            az

final class as extends af
{

    as()
    {
    }

    public t a(a a1)
    {
        w w1;
        switch (com.google.a.b.a.az.a[a1.f().ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 3: // '\003'
            return new z(a1.h());

        case 1: // '\001'
            return new z(new v(a1.h()));

        case 2: // '\002'
            return new z(Boolean.valueOf(a1.i()));

        case 4: // '\004'
            a1.j();
            return com.google.a.v.a;

        case 5: // '\005'
            r r1 = new r();
            a1.a();
            for (; a1.e(); r1.a(a(a1))) { }
            a1.b();
            return r1;

        case 6: // '\006'
            w1 = new w();
            a1.c();
            break;
        }
        for (; a1.e(); w1.a(a1.g(), a(a1))) { }
        a1.d();
        return w1;
    }

    public void a(d d1, t t1)
    {
        if (t1 == null || t1.k())
        {
            d1.f();
            return;
        }
        if (t1.j())
        {
            t1 = t1.n();
            if (t1.p())
            {
                d1.a(t1.b());
                return;
            }
            if (t1.a())
            {
                d1.a(t1.g());
                return;
            } else
            {
                d1.b(t1.c());
                return;
            }
        }
        if (t1.h())
        {
            d1.b();
            for (t1 = t1.m().iterator(); t1.hasNext(); a(d1, (t)t1.next())) { }
            d1.c();
            return;
        }
        if (t1.i())
        {
            d1.d();
            java.util.Map.Entry entry;
            for (t1 = t1.l().a().iterator(); t1.hasNext(); a(d1, (t)entry.getValue()))
            {
                entry = (java.util.Map.Entry)t1.next();
                d1.a((String)entry.getKey());
            }

            d1.e();
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Couldn't write ").append(t1.getClass()).toString());
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (t)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
