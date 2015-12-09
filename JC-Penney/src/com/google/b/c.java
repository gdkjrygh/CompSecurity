// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b;

import com.google.b.b.a;
import com.google.b.b.b;

// Referenced classes of package com.google.b:
//            b, i, m

public final class c
{

    private final com.google.b.b a;
    private b b;

    public c(com.google.b.b b1)
    {
        if (b1 == null)
        {
            throw new IllegalArgumentException("Binarizer must be non-null.");
        } else
        {
            a = b1;
            return;
        }
    }

    public int a()
    {
        return a.c();
    }

    public a a(int j, a a1)
    {
        return a.(j, a1);
    }

    public int b()
    {
        return a.d();
    }

    public b c()
    {
        if (b == null)
        {
            b = a.();
        }
        return b;
    }

    public boolean d()
    {
        return a.().d();
    }

    public c e()
    {
        i j = a.().e();
        return new c(a.(j));
    }

    public String toString()
    {
        String s;
        try
        {
            s = c().toString();
        }
        catch (m m1)
        {
            return "";
        }
        return s;
    }
}
