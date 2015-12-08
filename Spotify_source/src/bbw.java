// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.EOFException;
import java.util.concurrent.LinkedBlockingDeque;

public final class bbw
    implements bce
{

    public final bca a;
    public final azk b = new azk();
    public boolean c;
    public volatile long d;
    private long e;
    private volatile azi f;

    public bbw(bda bda1)
    {
        a = new bca(bda1);
        c = true;
        e = 0x8000000000000000L;
        d = 0x8000000000000000L;
    }

    public final int a(bby bby1, int i, boolean flag)
    {
        bca bca1 = a;
        i = bca1.a(i);
        i = bby1.a(bca1.i.a, bca1.j, i);
        if (i == -1)
        {
            if (flag)
            {
                return -1;
            } else
            {
                throw new EOFException();
            }
        } else
        {
            bca1.j = bca1.j + i;
            bca1.h = bca1.h + (long)i;
            return i;
        }
    }

    public final void a()
    {
        bca bca1 = a;
        bcb bcb1 = bca1.c;
        bcb1.e = 0;
        bcb1.f = 0;
        bcb1.g = 0;
        bcb1.d = 0;
        for (; !bca1.d.isEmpty(); bca1.a.a((bcz)bca1.d.remove())) { }
        bca1.g = 0L;
        bca1.h = 0L;
        bca1.i = null;
        bca1.j = 0x10000;
        c = true;
        e = 0x8000000000000000L;
        d = 0x8000000000000000L;
    }

    public final void a(long l, int i, int j, int k, byte abyte0[])
    {
        d = Math.max(d, l);
        bca bca1 = a;
        long l1 = a.h;
        long l2 = j;
        long l3 = k;
        bca1.c.a(l, i, l1 - l2 - l3, j, abyte0);
    }

    public final void a(azi azi)
    {
        f = azi;
    }

    public final void a(bec bec1, int i)
    {
        bca bca1 = a;
        int j;
        for (; i > 0; i -= j)
        {
            j = bca1.a(i);
            bec1.a(bca1.i.a, bca1.j, j);
            bca1.j = bca1.j + j;
            bca1.h = bca1.h + (long)j;
        }

    }

    public final int b()
    {
        return a.c.e;
    }

    public final boolean c()
    {
        return !d();
    }

    public final boolean d()
    {
        boolean flag = a.a(b);
        boolean flag1 = flag;
        if (c)
        {
            do
            {
                flag1 = flag;
                if (!flag)
                {
                    break;
                }
                flag1 = flag;
                if (b.b())
                {
                    break;
                }
                bca bca1 = a;
                bca1.a(bca1.c.b());
                flag = a.a(b);
            } while (true);
        }
        while (!flag1 || e != 0x8000000000000000L && b.e >= e) 
        {
            return false;
        }
        return true;
    }
}
