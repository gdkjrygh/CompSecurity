// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ford.syncV4.d;

import com.ford.syncV4.util.a;

public final class b
{

    private byte a;
    private int b;
    private int c;
    private int d;
    private byte e[];
    private byte f[];

    public b()
    {
    }

    public static b a(byte abyte0[])
    {
        b b1 = new b();
        b1.a = (byte)(abyte0[0] >>> 4);
        b1.b = com.ford.syncV4.util.a.a(abyte0, 0) & 0xfffffff;
        b1.c = com.ford.syncV4.util.a.a(abyte0, 4);
        int i = com.ford.syncV4.util.a.a(abyte0, 8);
        b1.d = i;
        if (i > 0)
        {
            byte abyte1[] = new byte[i];
            System.arraycopy(abyte0, 12, abyte1, 0, i);
            b1.e = new byte[b1.d];
            System.arraycopy(abyte1, 0, b1.e, 0, b1.d);
        }
        if (abyte0.length - i - 12 > 0)
        {
            byte abyte2[] = new byte[abyte0.length - i - 12];
            System.arraycopy(abyte0, i + 12, abyte2, 0, abyte2.length);
            b1.f = abyte2;
        }
        return b1;
    }

    public final void a(byte byte0)
    {
        a = byte0;
    }

    public final void a(int i)
    {
        b = i;
    }

    protected final byte[] a()
    {
        int i = b;
        byte byte0 = a;
        byte abyte0[] = new byte[12];
        System.arraycopy(com.ford.syncV4.util.a.a(i & 0xfffffff | byte0 << 28), 0, abyte0, 0, 4);
        System.arraycopy(com.ford.syncV4.util.a.a(c), 0, abyte0, 4, 4);
        System.arraycopy(com.ford.syncV4.util.a.a(d), 0, abyte0, 8, 4);
        return abyte0;
    }

    public final byte b()
    {
        return a;
    }

    public final void b(int i)
    {
        c = i;
    }

    public final int c()
    {
        return b;
    }

    public final void c(int i)
    {
        d = i;
    }

    public final int d()
    {
        return c;
    }

    public final int e()
    {
        return d;
    }

    public final byte[] f()
    {
        return e;
    }

    public final byte[] g()
    {
        return f;
    }
}
