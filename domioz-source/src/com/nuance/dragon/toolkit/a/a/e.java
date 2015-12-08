// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a.a;

import com.nuance.dragon.toolkit.a.x;

final class e
{

    private x a;
    private boolean b;
    private boolean c;

    private e()
    {
    }

    e(byte byte0)
    {
        this();
    }

    static x a(e e1, x x)
    {
        e1.a = x;
        return x;
    }

    static boolean a(e e1)
    {
        e1.b = true;
        return true;
    }

    static x b(e e1)
    {
        return e1.a;
    }

    static boolean c(e e1)
    {
        return e1.c;
    }

    static boolean d(e e1)
    {
        e1.c = true;
        return true;
    }

    static boolean e(e e1)
    {
        return e1.b;
    }
}
