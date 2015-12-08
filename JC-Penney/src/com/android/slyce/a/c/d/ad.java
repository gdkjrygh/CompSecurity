// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.ao;
import java.io.IOException;

// Referenced classes of package com.android.slyce.a.c.d:
//            i, m, af, ag, 
//            ah, ae, o, j, 
//            h, g, ab

final class ad
    implements i
{

    int a;
    int b;
    int c;
    int d;
    int e;
    boolean f;
    aj g;
    private final m h = new m();
    private final am i;
    private final boolean j;
    private final j k;
    private final ao l = new ao();
    private final aj m = new aj();
    private final e n = new af(this);
    private final e o = new ag(this);
    private final e p = new ah(this);

    ad(am am1, j j1, boolean flag)
    {
        g = new aj();
        i = am1;
        k = j1;
        j = flag;
        am1.b(new ae(this));
        a();
    }

    static e a(ad ad1)
    {
        return ad1.o;
    }

    private static transient IOException a(String s, Object aobj[])
    {
        throw new IOException(String.format(s, aobj));
    }

    private void a()
    {
        i.a(l);
        l.a(8, n);
    }

    private void a(aj aj1, int i1, int j1)
    {
        boolean flag1 = true;
        int k1 = aj1.f();
        int l1 = aj1.f();
        aj1.h();
        aj1 = h.a(aj1, j1 - 10);
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 2) == 0)
        {
            flag1 = false;
        }
        k.a(flag1, flag, k1 & 0x7fffffff, l1 & 0x7fffffff, aj1, o.a);
    }

    static void a(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.a(aj1, i1, j1);
    }

    static aj b(ad ad1)
    {
        return ad1.m;
    }

    private void b(aj aj1, int i1, int j1)
    {
        int k1 = aj1.f();
        aj1 = h.a(aj1, j1 - 4);
        boolean flag;
        if ((i1 & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k.a(false, flag, k1 & 0x7fffffff, -1, aj1, o.b);
    }

    static void b(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.b(aj1, i1, j1);
    }

    static e c(ad ad1)
    {
        return ad1.p;
    }

    private void c(aj aj1, int i1, int j1)
    {
        if (j1 != 8)
        {
            throw a("TYPE_RST_STREAM length: %d != 8", new Object[] {
                Integer.valueOf(j1)
            });
        }
        i1 = aj1.f();
        j1 = aj1.f();
        aj1 = com.android.slyce.a.c.d.h.a(j1);
        if (aj1 == null)
        {
            throw a("TYPE_RST_STREAM unexpected error code: %d", new Object[] {
                Integer.valueOf(j1)
            });
        } else
        {
            k.a(i1 & 0x7fffffff, aj1);
            return;
        }
    }

    static void c(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.c(aj1, i1, j1);
    }

    static ao d(ad ad1)
    {
        return ad1.l;
    }

    private void d(aj aj1, int i1, int j1)
    {
        i1 = aj1.f();
        aj1 = h.a(aj1, j1 - 4);
        k.a(false, false, i1 & 0x7fffffff, -1, aj1, o.c);
    }

    static void d(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.h(aj1, i1, j1);
    }

    static j e(ad ad1)
    {
        return ad1.k;
    }

    private void e(aj aj1, int i1, int j1)
    {
        if (j1 != 8)
        {
            throw a("TYPE_WINDOW_UPDATE length: %d != 8", new Object[] {
                Integer.valueOf(j1)
            });
        }
        i1 = aj1.f();
        long l1 = aj1.f() & 0x7fffffff;
        if (l1 == 0L)
        {
            throw a("windowSizeIncrement was 0", new Object[] {
                Long.valueOf(l1)
            });
        } else
        {
            k.a(i1 & 0x7fffffff, l1);
            return;
        }
    }

    static void e(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.f(aj1, i1, j1);
    }

    private void f(aj aj1, int i1, int j1)
    {
        boolean flag1 = true;
        if (j1 != 4)
        {
            throw a("TYPE_PING length: %d != 4", new Object[] {
                Integer.valueOf(j1)
            });
        }
        i1 = aj1.f();
        boolean flag2 = j;
        boolean flag;
        if ((i1 & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag2 == flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        k.a(flag, i1, 0);
    }

    static void f(ad ad1)
    {
        ad1.a();
    }

    static void f(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.g(aj1, i1, j1);
    }

    private void g(aj aj1, int i1, int j1)
    {
        if (j1 != 8)
        {
            throw a("TYPE_GOAWAY length: %d != 8", new Object[] {
                Integer.valueOf(j1)
            });
        }
        i1 = aj1.f();
        j1 = aj1.f();
        aj1 = com.android.slyce.a.c.d.h.c(j1);
        if (aj1 == null)
        {
            throw a("TYPE_GOAWAY unexpected error code: %d", new Object[] {
                Integer.valueOf(j1)
            });
        } else
        {
            k.a(i1 & 0x7fffffff, aj1, g.a);
            return;
        }
    }

    static void g(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.d(aj1, i1, j1);
    }

    private void h(aj aj1, int i1, int j1)
    {
        boolean flag = true;
        int k1 = aj1.f();
        if (j1 != k1 * 8 + 4)
        {
            throw a("TYPE_SETTINGS length: %d != 4 + 8 * %d", new Object[] {
                Integer.valueOf(j1), Integer.valueOf(k1)
            });
        }
        ab ab1 = new ab();
        for (j1 = 0; j1 < k1; j1++)
        {
            int l1 = aj1.f();
            ab1.a(l1 & 0xffffff, (0xff000000 & l1) >>> 24, aj1.f());
        }

        if ((i1 & 1) == 0)
        {
            flag = false;
        }
        k.a(flag, ab1);
    }

    static void h(ad ad1, aj aj1, int i1, int j1)
    {
        ad1.e(aj1, i1, j1);
    }
}
