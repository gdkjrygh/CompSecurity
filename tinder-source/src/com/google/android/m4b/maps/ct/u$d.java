// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;

import java.io.InputStream;

// Referenced classes of package com.google.android.m4b.maps.ct:
//            u, p

final class a extends InputStream
{

    private a a;
    private p b;
    private int c;
    private int d;
    private int e;
    private int f;
    private u g;

    private int a(byte abyte0[], int i, int j)
    {
        int k = j;
        int i1 = i;
        i = k;
        for (int l = i1; i > 0; l = i1)
        {
            b();
            if (b == null)
            {
                if (i == j)
                {
                    return -1;
                }
                break;
            }
            int j1 = Math.min(c - d, i);
            i1 = l;
            if (abyte0 != null)
            {
                b.a(abyte0, d, l, j1);
                i1 = l + j1;
            }
            d = d + j1;
            i -= j1;
        }

        return j - i;
    }

    private void a()
    {
        a = new <init>(g, (byte)0);
        b = a.a();
        c = b.b();
        d = 0;
        e = 0;
    }

    private void b()
    {
label0:
        {
            if (b != null && d == c)
            {
                e = e + c;
                d = 0;
                if (!a.hasNext())
                {
                    break label0;
                }
                b = a.a();
                c = b.b();
            }
            return;
        }
        b = null;
        c = 0;
    }

    public final int available()
    {
        int i = e;
        int j = d;
        return g.b() - (i + j);
    }

    public final void mark(int i)
    {
        f = e + d;
    }

    public final boolean markSupported()
    {
        return true;
    }

    public final int read()
    {
        b();
        if (b == null)
        {
            return -1;
        } else
        {
            p p1 = b;
            int i = d;
            d = i + 1;
            return p1.b(i) & 0xff;
        }
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (abyte0 == null)
        {
            throw new NullPointerException();
        }
        if (i < 0 || j < 0 || j > abyte0.length - i)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            return a(abyte0, i, j);
        }
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        a();
        a(null, 0, f);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final long skip(long l)
    {
        if (l < 0L)
        {
            throw new IndexOutOfBoundsException();
        }
        long l1 = l;
        if (l > 0x7fffffffL)
        {
            l1 = 0x7fffffffL;
        }
        return (long)a(null, 0, (int)l1);
    }

    public (u u1)
    {
        g = u1;
        super();
        a();
    }
}
