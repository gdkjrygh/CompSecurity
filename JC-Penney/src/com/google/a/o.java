// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a;

import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

// Referenced classes of package com.google.a:
//            af, j

class o extends af
{

    final j a;

    o(j j)
    {
        a = j;
        super();
    }

    public Number a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        } else
        {
            return Long.valueOf(a1.l());
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
            d1.b(number.toString());
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
