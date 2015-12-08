// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import java.io.Serializable;

abstract class bj
    implements Serializable
{

    private String a;
    protected long i;
    protected long j;
    protected long k;

    bj()
    {
        i = System.currentTimeMillis();
        j = -1L;
        k = 0L;
    }

    protected void a(long l)
    {
        k = l;
    }

    public void a(String s)
    {
        a = s;
    }

    protected long b()
    {
        return k;
    }

    protected void b(long l)
    {
        i = l;
    }

    protected long c()
    {
        return i;
    }

    protected void c(long l)
    {
        j = l;
    }

    protected long d()
    {
        return j;
    }
}
