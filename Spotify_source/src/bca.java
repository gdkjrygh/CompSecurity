// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.LinkedBlockingDeque;

public final class bca
{

    public final bda a;
    public final int b = 0x10000;
    public final bcb c = new bcb();
    public final LinkedBlockingDeque d = new LinkedBlockingDeque();
    public final bcc e = new bcc((byte)0);
    public final bec f = new bec(32);
    public long g;
    public long h;
    public bcz i;
    public int j;

    public bca(bda bda1)
    {
        a = bda1;
        j = 0x10000;
    }

    public final int a(int k)
    {
        if (j == 0x10000)
        {
            j = 0;
            i = a.a();
            d.add(i);
        }
        return Math.min(k, 0x10000 - j);
    }

    public final void a(long l)
    {
        int i1 = (int)(l - g) / 0x10000;
        for (int k = 0; k < i1; k++)
        {
            a.a((bcz)d.remove());
            g = g + 0x10000L;
        }

    }

    public final void a(long l, byte abyte0[], int k)
    {
        int k1;
        for (int i1 = 0; i1 < k; i1 += k1)
        {
            a(l);
            int j1 = (int)(l - g);
            k1 = Math.min(k - i1, 0x10000 - j1);
            System.arraycopy(((bcz)d.peek()).a, j1, abyte0, i1, k1);
            l += k1;
        }

    }

    public final boolean a(azk azk)
    {
        return c.a(azk, e);
    }
}
