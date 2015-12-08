// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

// Referenced classes of package com.google.a:
//            af, j

class m extends af
{

    final j a;

    m(j j1)
    {
        a = j1;
        super();
    }

    public Double a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return Double.valueOf(a1.k());
        }
    }

    public void a(d d1, Number number)
    {
        if (number == null)
        {
            d1.f();
            return;
        } else
        {
            double d2 = number.doubleValue();
            com.google.a.j.a(a, d2);
            d1.a(number);
            return;
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (Number)obj);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
