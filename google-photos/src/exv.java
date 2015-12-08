// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.RecyclerView;

final class exv
    implements gml
{

    private static final onh a = new onh("debug.photos.assert_position");
    private final exh b;
    private final gml c;
    private final noz d;
    private long e;
    private int f;
    private int g;
    private final exk h;

    public exv(Context context, ekq ekq, ekw ekw, eyz eyz, gml gml1, int i, exk exk1)
    {
        g = i;
        h = exk1;
        b = ((exm)olm.a(context, exm)).a(ekq, ekw, eyz);
        c = gml1;
        d = noz.a(context, 2, "dhfactory", new String[] {
            "perf"
        });
    }

    private int c(int i)
    {
        return i - b.b(i);
    }

    public final int a()
    {
        int i = c.a();
        if (i == -1 || i == 0)
        {
            return i;
        } else
        {
            return b.b() + c.a();
        }
    }

    public final int a(int i, int j)
    {
        if (b.c(i) != 0x8000000000000000L)
        {
            return j;
        } else
        {
            return c.a(c(i), j);
        }
    }

    public final int a(gml gml1, int i)
    {
        int k;
        if (gml1 == this)
        {
            return i;
        }
        k = c.a(gml1, i);
        gml1 = b.c().e(k);
        i = b.b() - gml1.d();
_L7:
        int j = i;
        if (!gml1.a()) goto _L2; else goto _L1
_L1:
        int l = gml1.b() - i;
        if (l != k) goto _L4; else goto _L3
_L3:
        j = i + 1;
_L2:
        return k + j;
_L4:
        j = i;
        if (l > k) goto _L2; else goto _L5
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(RecyclerView recyclerview, int i)
    {
    }

    public final boolean a(int i)
    {
        return b.f(i) != 0x8000000000000000L || c.a(c(i));
    }

    public final void a_(int i, int j, int k)
    {
        int l = b.b(i);
        c.a_(i - l, j, k - b.b());
    }

    public final int b(int i, int j)
    {
        if (b.c(i) != 0x8000000000000000L)
        {
            return 0;
        }
        int k = b.d(i);
        if (k != 0x80000000)
        {
            return (i - k - 1) % j;
        } else
        {
            return c.b(c(i), j);
        }
    }

    public final int b(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        } else
        {
            return c.b(gml1, i - b.b(i));
        }
    }

    public final hgo b(int i)
    {
        long l = noy.a();
        long l1 = b.c(i);
        hgo hgo;
        if (l1 != 0x8000000000000000L)
        {
            hgo = h.a(l1);
        } else
        {
            i = c(i);
            hgo = c.b(i);
        }
        l1 = e;
        e = (noy.a() - l) + l1;
        f = f + 1;
        if (d.a() && f % 20 == 0)
        {
            noy.b("total time", e);
            noy.a("calls", Integer.valueOf(f));
            noy.b("time per call", Math.round((double)e / (double)f));
        }
        return hgo;
    }

    public final int c(int i, int j)
    {
        int l = 0;
        eyh eyh1 = b.e(i);
        if (eyh1 == null)
        {
            return c.c(c(i), j);
        }
        if (eyh1.d() == 0)
        {
            throw new IllegalStateException((new StringBuilder(37)).append("Got empty headers before: ").append(i).toString());
        }
        j = -1;
        int k = 0;
        while (eyh1.a()) 
        {
            int j1 = l + 1;
            l = eyh1.b();
            int i1 = j;
            if (j == -1)
            {
                i1 = l;
            }
            if (i1 != l)
            {
                j = (int)Math.ceil((double)(l - (i1 + 1)) / (double)g) + k;
            } else
            {
                j = k;
            }
            k = j;
            j = l;
            l = j1;
        }
        l += k;
        k = l;
        if (j < i)
        {
            k = l + (int)Math.ceil((double)(i - j) / (double)g);
        }
        return k - 1;
    }

}
