// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.support.v7.widget.RecyclerView;

final class dqu
    implements gml
{

    private final dqv a;
    private final gml b;

    public dqu(dqv dqv1, gml gml1)
    {
        a = dqv1;
        b = gml1;
    }

    public final int a()
    {
        int i = b.a();
        if (i == -1 || i == 0)
        {
            return i;
        }
        int j = b.a();
        if (a.W_())
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public final int a(int i, int j)
    {
        int k;
        if (!a.W_())
        {
            k = b.a(i, j);
        } else
        {
            k = j;
            if (i != 0)
            {
                return b.a(i - 1, j);
            }
        }
        return k;
    }

    public final int a(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        }
        if (a.W_())
        {
            return b.a(gml1, i) + 1;
        } else
        {
            return b.a(gml1, i);
        }
    }

    public final void a(RecyclerView recyclerview, int i)
    {
    }

    public final boolean a(int i)
    {
        if (!a.W_())
        {
            return b.a(i);
        }
        return i == 0 || b.a(i - 1);
    }

    public final void a_(int i, int j, int k)
    {
        int l;
        if (a.W_())
        {
            l = 1;
        } else
        {
            l = 0;
        }
        b.a_(Math.max(0, i - l), j, k - l);
    }

    public final int b(int i, int j)
    {
        if (!a.W_())
        {
            return b.b(i, j);
        }
        if (i == 0)
        {
            return 0;
        } else
        {
            return b.b(i - 1, j);
        }
    }

    public final int b(gml gml1, int i)
    {
        if (gml1 == this)
        {
            return i;
        }
        gml gml2 = b;
        int j;
        if (a.W_())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        return gml2.b(gml1, i - j);
    }

    public final hgo b(int i)
    {
        if (!a.W_())
        {
            return b.b(i);
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        dqv dqv1;
        dqv1 = a;
        p.a(dqv1.c.e(), "Can't obtain a status bar row without an account!");
        if (dqv1.f) goto _L4; else goto _L3
_L3:
        if (dqv1.b == null)
        {
            dqv1.b = new dsj(dsi.a);
            if (dqv1.h > 0)
            {
                dqv1.b.c(dqv1.h);
            }
            dqv1.d = true;
        }
_L5:
        dqv1.g = 0;
        return dqv1.b;
_L4:
        if (dqv1.b != null || dqv1.d)
        {
            dqv1.d = true;
            dqv1.b = new dsj(dsi.b);
            Runnable runnable = dqv1.a;
            b.w().removeCallbacks(runnable);
            b.a(dqv1.a, 5000L);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return b.b(i - 1);
    }

    public final int c(int i, int j)
    {
        if (!a.W_())
        {
            return b.c(i, j);
        }
        if (i == 0)
        {
            return 0;
        } else
        {
            return b.c(i - 1, j) + 1;
        }
    }
}
