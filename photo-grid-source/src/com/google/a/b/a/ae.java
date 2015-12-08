// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;
import java.math.BigDecimal;

final class ae extends am
{

    ae()
    {
    }

    private static BigDecimal b(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        try
        {
            a1 = new BigDecimal(a1.h());
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ag(a1);
        }
        return a1;
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final volatile void a(f f1, Object obj)
    {
        f1.a((BigDecimal)obj);
    }
}
