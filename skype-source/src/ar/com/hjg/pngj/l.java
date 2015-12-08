// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ar.com.hjg.pngj;

import java.util.Arrays;
import java.util.zip.Checksum;

// Referenced classes of package ar.com.hjg.pngj:
//            f, g, m, y, 
//            r, h, x

public final class l extends f
{

    protected byte d[];
    protected byte e[];
    protected final m f;
    protected final g g;
    final y h;
    protected int i[];

    public l(String s, m m1, g g1)
    {
        this(s, m1, g1, (byte)0);
    }

    private l(String s, m m1, g g1, byte byte0)
    {
        if (g1 != null)
        {
            byte0 = g1.g() + 1;
        } else
        {
            byte0 = m1.k + 1;
        }
        super(s, byte0, m1.k + 1);
        i = new int[5];
        f = m1;
        g = g1;
        h = new y(m1, g1);
    }

    private void b(int k)
    {
        int i1 = 1 - f.j;
        int j1 = 1;
        while (j1 <= k) 
        {
            int k1;
            if (i1 > 0)
            {
                k1 = d[i1] & 0xff;
            } else
            {
                k1 = 0;
            }
            d[j1] = (byte)(a[j1] + ((e[j1] & 0xff) + k1) / 2);
            j1++;
            i1++;
        }
    }

    private void c(int k)
    {
        for (int i1 = 1; i1 <= k; i1++)
        {
            d[i1] = a[i1];
        }

    }

    private void d(int k)
    {
        int i1 = 1 - f.j;
        int j1 = 1;
        while (j1 <= k) 
        {
            int k1;
            int l1;
            if (i1 > 0)
            {
                k1 = d[i1] & 0xff;
            } else
            {
                k1 = 0;
            }
            if (i1 > 0)
            {
                l1 = e[i1] & 0xff;
            } else
            {
                l1 = 0;
            }
            d[j1] = (byte)(a[j1] + r.a(k1, e[j1] & 0xff, l1));
            j1++;
            i1++;
        }
    }

    private void e(int k)
    {
        for (int i1 = 1; i1 <= f.j; i1++)
        {
            d[i1] = a[i1];
        }

        int j1 = 1;
        for (int k1 = f.j + 1; k1 <= k;)
        {
            d[k1] = (byte)(a[k1] + d[j1]);
            k1++;
            j1++;
        }

    }

    private void f(int k)
    {
        for (int i1 = 1; i1 <= k; i1++)
        {
            d[i1] = (byte)(a[i1] + e[i1]);
        }

    }

    protected final void a()
    {
        Object obj;
        int k;
        byte byte0;
        super.a();
        obj = h;
        k = g();
        obj.h = k;
        if (((y) (obj)).c)
        {
            obj.n = ((y) (obj)).b.d();
            obj.e = ((y) (obj)).b.c;
            obj.d = ((y) (obj)).b.b;
            obj.g = ((y) (obj)).b.e;
            obj.f = ((y) (obj)).b.d;
            obj.i = ((y) (obj)).b.c();
            obj.j = ((y) (obj)).b.b();
            obj.k = ((y) (obj)).b.e();
            obj.l = ((y) (obj)).b.f();
            obj.m = (((y) (obj)).a.i * ((y) (obj)).l + 7) / 8;
        } else
        {
            obj.n = 1;
            obj.d = 1;
            obj.e = 1;
            obj.f = 0;
            obj.g = 0;
            obj.j = k;
            obj.i = k;
            obj.k = ((y) (obj)).a.b;
            obj.l = ((y) (obj)).a.a;
            obj.m = ((y) (obj)).a.k;
        }
        k = h.m;
        if (d == null || d.length < a.length)
        {
            d = new byte[a.length];
            e = new byte[a.length];
        }
        if (h.j == 0)
        {
            Arrays.fill(d, (byte)0);
        }
        obj = d;
        d = e;
        e = ((byte []) (obj));
        byte0 = a[0];
        obj = ar.com.hjg.pngj.h.a(byte0);
        if (obj == null)
        {
            throw new x((new StringBuilder("Filter type ")).append(byte0).append(" invalid").toString());
        }
        int ai[] = i;
        ai[byte0] = ai[byte0] + 1;
        d[0] = a[0];
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ar.com.hjg.pngj.h.values().length];
                try
                {
                    a[h.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[h.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[h.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[h.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[h.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[((h) (obj)).ordinal()];
        JVM INSTR tableswitch 1 5: default 420
    //                   1 450
    //                   2 486
    //                   3 494
    //                   4 502
    //                   5 510;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        throw new x((new StringBuilder("Filter type ")).append(byte0).append(" not implemented").toString());
_L2:
        c(k);
_L8:
        y y1 = h;
        byte abyte0[] = d;
        k = h.m;
        y1.o = abyte0;
        y1.p = k + 1;
        return;
_L3:
        e(k);
        continue; /* Loop/switch isn't completed */
_L4:
        f(k);
        continue; /* Loop/switch isn't completed */
_L5:
        b(k);
        continue; /* Loop/switch isn't completed */
_L6:
        d(k);
        if (true) goto _L8; else goto _L7
_L7:
    }

    final transient void a(Checksum achecksum[])
    {
        for (int k = 0; k < 2; k++)
        {
            Checksum checksum = achecksum[k];
            if (checksum != null)
            {
                checksum.update(d, 1, f() - 1);
            }
        }

    }

    protected final int b()
    {
        return i();
    }

    public final boolean c()
    {
        boolean flag;
        if (super.b == f.a.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
    }

    public final void d()
    {
        super.d();
        d = null;
        e = null;
    }

    public final int i()
    {
        int k;
        boolean flag;
        flag = false;
        k = 0;
        if (g != null) goto _L2; else goto _L1
_L1:
        if (g() < f.b - 1)
        {
            k = f.k + 1;
        }
_L4:
        if (!h())
        {
            a(k);
        }
        return k;
_L2:
        k = ((flag) ? 1 : 0);
        if (g.a())
        {
            k = g.g() + 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final byte[] j()
    {
        return d;
    }
}
