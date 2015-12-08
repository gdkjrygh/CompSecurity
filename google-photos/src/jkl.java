// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.concurrent.LinkedBlockingDeque;

final class jkl
{

    final jmo a;
    final int b;
    final jkm c = new jkm();
    final LinkedBlockingDeque d = new LinkedBlockingDeque();
    final jkn e = new jkn();
    final jnl f = new jnl(32);
    long g;
    long h;
    jmn i;
    int j;

    public jkl(jmo jmo1)
    {
        a = jmo1;
        b = jmo1.b();
        j = b;
    }

    int a(int k)
    {
        if (j == b)
        {
            j = 0;
            i = a.a();
            d.add(i);
        }
        return Math.min(k, b - j);
    }

    public final void a()
    {
        a(c.a());
    }

    void a(long l)
    {
        int i1 = (int)(l - g) / b;
        for (int k = 0; k < i1; k++)
        {
            a.a((jmn)d.remove());
            g = g + (long)b;
        }

    }

    void a(long l, byte abyte0[], int k)
    {
        int k1;
        for (int i1 = 0; i1 < k; i1 += k1)
        {
            a(l);
            int j1 = (int)(l - g);
            k1 = Math.min(k - i1, b - j1);
            jmn jmn1 = (jmn)d.peek();
            System.arraycopy(jmn1.a, jmn1.b + j1, abyte0, i1, k1);
            l += k1;
        }

    }

    public final boolean a(jjk jjk)
    {
        return c.a(jjk, e);
    }
}
