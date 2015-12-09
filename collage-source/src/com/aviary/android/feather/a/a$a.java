// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.a;

import junit.framework.Assert;

// Referenced classes of package com.aviary.android.feather.a:
//            a

public static class a
{

    private final boolean a;
    private String b;
    private long c;
    private String d;
    private String e;
    private boolean f;
    private String g;

    public a a(long l)
    {
        c = l;
        return this;
    }

    public c a(String s)
    {
        b = s;
        return this;
    }

    public b a(boolean flag)
    {
        f = flag;
        return this;
    }

    public a a()
        throws AssertionError
    {
        a a1 = new a(b, c);
        a1.g = f;
        if (a)
        {
            a1.d = true;
        } else
        {
            a1.d = false;
            if (f)
            {
                Assert.assertNotNull("orderId cannot be null", d);
                Assert.assertNotNull("token cannot be null", g);
                Assert.assertNotNull("price cannot be null", e);
                a1.e = d;
                a1.c = g;
                a1.f = e;
                return a1;
            }
        }
        return a1;
    }

    public e b(String s)
    {
        d = s;
        return this;
    }

    public d c(String s)
    {
        e = s;
        return this;
    }

    public e d(String s)
    {
        g = s;
        return this;
    }

    public (boolean flag)
    {
        a = flag;
    }
}
