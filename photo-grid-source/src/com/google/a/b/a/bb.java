// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.e;
import com.google.a.d.f;

final class bb extends am
{

    bb()
    {
    }

    private static Number b(a a1)
    {
        if (a1.f() == e.i)
        {
            a1.j();
            return null;
        }
        byte byte0;
        try
        {
            byte0 = (byte)a1.m();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ag(a1);
        }
        return Byte.valueOf(byte0);
    }

    public final Object a(a a1)
    {
        return b(a1);
    }

    public final volatile void a(f f1, Object obj)
    {
        f1.a((Number)obj);
    }
}
