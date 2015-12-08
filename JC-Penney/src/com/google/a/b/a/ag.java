// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ab;
import com.google.a.af;
import com.google.a.d.a;
import com.google.a.d.c;
import com.google.a.d.d;
import java.math.BigInteger;

final class ag extends af
{

    ag()
    {
    }

    public BigInteger a(a a1)
    {
        if (a1.f() == c.i)
        {
            a1.j();
            return null;
        }
        try
        {
            a1 = new BigInteger(a1.h());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ab(a1);
        }
        return a1;
    }

    public volatile void a(d d1, Object obj)
    {
        a(d1, (BigInteger)obj);
    }

    public void a(d d1, BigInteger biginteger)
    {
        d1.a(biginteger);
    }

    public Object b(a a1)
    {
        return a(a1);
    }
}
