// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Iterator;

// Referenced classes of package com.google.a.a:
//            e, ad, ar, ap, 
//            av, at

public final class ao
{

    private final e a;
    private final boolean b;
    private final av c;
    private final int d;

    private ao(av av1)
    {
        this(av1, false, e.m, 0x7fffffff);
    }

    private ao(av av1, boolean flag, e e1, int i)
    {
        c = av1;
        b = flag;
        a = e1;
        d = i;
    }

    public static ao a(int i)
    {
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad.a(flag, "The length may not be less than 1");
        return new ao(new ar(i));
    }

    public static ao a(String s)
    {
        boolean flag;
        if (s.length() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad.a(flag, "The separator may not be the empty string.");
        return new ao(new ap(s));
    }

    static e a(ao ao1)
    {
        return ao1.a;
    }

    static Iterator a(ao ao1, CharSequence charsequence)
    {
        return ao1.c.a(ao1, charsequence);
    }

    static boolean b(ao ao1)
    {
        return ao1.b;
    }

    static int c(ao ao1)
    {
        return ao1.d;
    }

    public final ao a()
    {
        return new ao(c, true, a, d);
    }

    public final Iterable a(CharSequence charsequence)
    {
        ad.a(charsequence);
        return new at(this, charsequence);
    }
}
