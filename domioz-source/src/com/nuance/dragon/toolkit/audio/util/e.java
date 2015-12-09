// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.util;


abstract class e
{

    final int a;
    e b;
    e c;
    private final Object d;

    e(int i, Object obj)
    {
        a = i;
        d = obj;
    }

    static Object b(e e1)
    {
        return e1.d;
    }

    final void a()
    {
        if (b != null)
        {
            b.c = c;
        }
        if (c != null)
        {
            c.b = b;
        }
        b = null;
        c = null;
    }

    final void a(e e1)
    {
        e1.b = this;
        if (c != null)
        {
            c.b = e1;
        }
        e1.c = c;
        c = e1;
    }
}
