// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.c;

import com.nuance.a.a.a.a.b.b;
import com.nuance.a.a.a.a.d.a.a;
import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.b.f;

public abstract class e
{

    private static final com.nuance.a.a.a.a.d.a.e a = com.nuance.a.a.a.a.d.a.d.a(com/nuance/a/a/a/c/c/e);
    protected String b;
    protected short c;
    protected String d;
    protected a e;
    protected b f;
    protected b g;

    protected e(String s, short word0, String s1, b b1, b b2)
    {
        if (a.b())
        {
            (new StringBuilder("in NMSPManager() gateway IP [")).append(s).append("] Port [").append(word0).append("]");
        }
        String s2 = null;
        if (s == null)
        {
            s2 = " gatewayIP is null";
        } else
        if (s.length() == 0)
        {
            s2 = " gatewayIP is empty";
        }
        if (word0 <= 0)
        {
            s2 = " gatewayPort should be greater than 0";
        }
        if (s2 != null)
        {
            a.b((new StringBuilder("NMSPManager ")).append(java/lang/IllegalArgumentException.getName()).append(s2).toString());
            throw new IllegalArgumentException(s2);
        } else
        {
            b = s;
            c = word0;
            d = s1;
            f = b1;
            g = b2;
            e = new f();
            return;
        }
    }

    public final void a(b b1)
    {
        f = b1;
    }

    public final void b(b b1)
    {
        g = b1;
    }

    public final a d()
    {
        return e;
    }

    public final String e()
    {
        return b;
    }

    public final short f()
    {
        return c;
    }

    public final String g()
    {
        return d;
    }

    public final b h()
    {
        return f;
    }

    public final b i()
    {
        return g;
    }

}
