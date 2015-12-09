// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing;

import com.google.zxing.common.a;

// Referenced classes of package com.google.zxing:
//            a, e, NotFoundException

public final class b
{

    private final com.google.zxing.a a;
    private com.google.zxing.common.b b;

    public b(com.google.zxing.a a1)
    {
        if (a1 == null)
        {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        } else
        {
            a = a1;
            return;
        }
    }

    public int a()
    {
        return a.c();
    }

    public b a(int i, int j, int k, int l)
    {
        e e1 = a.a().a(i, j, k, l);
        return new b(a.a(e1));
    }

    public a a(int i, a a1)
        throws NotFoundException
    {
        return a.a(i, a1);
    }

    public int b()
    {
        return a.d();
    }

    public com.google.zxing.common.b c()
        throws NotFoundException
    {
        if (b == null)
        {
            b = a.b();
        }
        return b;
    }

    public boolean d()
    {
        return a.a().c();
    }

    public boolean e()
    {
        return a.a().g();
    }

    public b f()
    {
        e e1 = a.a().h();
        return new b(a.a(e1));
    }

    public b g()
    {
        e e1 = a.a().J_();
        return new b(a.a(e1));
    }

    public String toString()
    {
        String s;
        try
        {
            s = c().toString();
        }
        catch (NotFoundException notfoundexception)
        {
            return "";
        }
        return s;
    }
}
