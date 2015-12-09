// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;

final class ae extends af
{

    ae()
    {
    }

    public String a(a a1)
    {
        c c1 = a1.f();
        if (c1 == c.i)
        {
            a1.j();
            return null;
        }
        if (c1 == c.h)
        {
            return Boolean.toString(a1.i());
        } else
        {
            return a1.h();
        }
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (String)obj);
    }

    public void a(d d1, String s)
    {
        d1.b(s);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
