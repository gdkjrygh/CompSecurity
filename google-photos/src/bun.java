// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;

public final class bun
    implements ctp
{

    private final clb a;
    private long b;
    private int c;
    private int d;
    private int e;
    private int f;

    public bun(clb clb1)
    {
        a = clb1;
    }

    private int i()
    {
        int j;
        for (j = -1; j == -1; j = a.f())
        {
            if (Thread.interrupted())
            {
                throw new InterruptedException();
            }
        }

        return j;
    }

    public final int a(byte abyte0[], int j, int k)
    {
        ByteBuffer bytebuffer;
        int l;
        long l1;
        try
        {
            l = i();
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            Thread.currentThread().interrupt();
            return 0;
        }
        bytebuffer = a.g()[l];
        k = Math.min(bytebuffer.capacity(), k);
        bytebuffer.put(abyte0, j, k);
        l1 = d();
        a.a(l, 0, k, l1, 0);
        f = f + k;
        return k;
    }

    public final void a()
    {
    }

    public final void a(int j, int k, int l)
    {
        c = 2;
        d = 44100;
        e = 2;
    }

    public final void a(long l)
    {
        b = b.b(l, "presentationTimeUs");
    }

    public final void b()
    {
    }

    public final void c()
    {
    }

    public final long d()
    {
        return b + b.b(f, c, e, d);
    }

    public final int e()
    {
        return 0;
    }

    public final long f()
    {
        return 0L;
    }

    public final boolean g()
    {
        return true;
    }

    public final void h()
    {
        int j;
        try
        {
            j = i();
        }
        catch (InterruptedException interruptedexception)
        {
            Thread.currentThread().interrupt();
            return;
        }
        a.a(j, 0, 0, 0L, 4);
    }

    static 
    {
        bun.getSimpleName();
    }
}
