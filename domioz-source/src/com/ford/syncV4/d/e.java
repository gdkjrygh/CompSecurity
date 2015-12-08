// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d;

import com.ford.syncV4.d.a.f;

public final class e
{

    private byte a;
    private f b;
    private int c;
    private byte d;
    private byte e;
    private int f;
    private int g;
    private int h;
    private byte i[];
    private byte j[];

    public e()
    {
        a = 1;
        b = f.c;
        c = com.ford.syncV4.d.a.e.a;
        d = 0;
        i = null;
        j = null;
    }

    public final byte a()
    {
        return a;
    }

    public final void a(byte byte0)
    {
        a = byte0;
    }

    public final void a(int k)
    {
        c = k;
    }

    public final void a(f f1)
    {
        b = f1;
    }

    public final void a(byte abyte0[])
    {
        i = abyte0;
        h = abyte0.length;
    }

    public final byte b()
    {
        return d;
    }

    public final void b(byte byte0)
    {
        d = byte0;
    }

    public final void b(int k)
    {
        f = k;
    }

    public final void b(byte abyte0[])
    {
        if (j != null)
        {
            j = null;
        }
        j = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, j, 0, abyte0.length);
    }

    public final void c(byte byte0)
    {
        e = byte0;
    }

    public final void c(int k)
    {
        g = k;
    }

    public final byte[] c()
    {
        return i;
    }

    public final byte[] d()
    {
        return j;
    }

    public final f e()
    {
        return b;
    }

    public final byte f()
    {
        return e;
    }

    public final int g()
    {
        return f;
    }

    public final int h()
    {
        return g;
    }

    public final int i()
    {
        return h;
    }
}
