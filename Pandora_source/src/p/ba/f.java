// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ba;

import p.bb.d;
import p.bb.e;

public class f
{

    private byte a;
    private e b;
    private d c;
    private byte d;
    private byte e;
    private int f;
    private int g;
    private int h;
    private byte i[];
    private byte j[];

    public f()
    {
        a = 1;
        b = e.c;
        c = d.a;
        d = 0;
        i = null;
        j = null;
    }

    public byte a()
    {
        return a;
    }

    public void a(byte byte0)
    {
        a = byte0;
    }

    public void a(int k)
    {
        f = k;
    }

    public void a(d d1)
    {
        c = d1;
    }

    public void a(e e1)
    {
        b = e1;
    }

    public void a(byte abyte0[])
    {
        i = abyte0;
        h = abyte0.length;
    }

    public byte b()
    {
        return d;
    }

    public void b(byte byte0)
    {
        d = byte0;
    }

    public void b(int k)
    {
        g = k;
    }

    public void b(byte abyte0[])
    {
        if (j != null)
        {
            j = null;
        }
        j = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, j, 0, abyte0.length);
    }

    public void c(byte byte0)
    {
        e = byte0;
    }

    public byte[] c()
    {
        return i;
    }

    public byte[] d()
    {
        return j;
    }

    public e e()
    {
        return b;
    }

    public byte f()
    {
        return e;
    }

    public int g()
    {
        return f;
    }

    public int h()
    {
        return g;
    }

    public int i()
    {
        return h;
    }
}
