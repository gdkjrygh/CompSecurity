// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ab;
import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class be extends af
{

    be()
    {
    }

    public Number a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        long l;
        try
        {
            l = a1.l();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ab(a1);
        }
        return Long.valueOf(l);
    }

    public void a(d d1, Number number)
    {
        d1.a(number);
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
