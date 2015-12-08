// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.List;

public abstract class agj
{

    private static final agp a;
    private static final Interpolator b = new agk();
    private static final Interpolator c = new agl();
    private int d;

    public agj()
    {
        d = -1;
    }

    public static int a(int j, int k)
    {
        int l = j & 0xc0c0c;
        if (l == 0)
        {
            return j;
        }
        j = ~l & j;
        if (k == 0)
        {
            return j | l << 2;
        } else
        {
            return j | l << 1 & 0xfff3f3f3 | (l << 1 & 0xc0c0c) << 2;
        }
    }

    public static long a(RecyclerView recyclerview, int j)
    {
        recyclerview = recyclerview.q;
        if (recyclerview == null)
        {
            return j != 8 ? 250L : 200L;
        }
        if (j == 8)
        {
            return ((aer) (recyclerview)).k;
        } else
        {
            return ((aer) (recyclerview)).j;
        }
    }

    static void a(agj agj1, Canvas canvas, RecyclerView recyclerview, afn afn1, List list, int j, float f1, float f2)
    {
        int j1 = list.size();
        for (int k = 0; k < j1; k++)
        {
            agj1 = (agn)list.get(k);
            int k1 = canvas.save();
            b(canvas, recyclerview, ((agn) (agj1)).e, ((agn) (agj1)).j, ((agn) (agj1)).k, ((agn) (agj1)).f, false);
            canvas.restoreToCount(k1);
        }

        if (afn1 != null)
        {
            int l = canvas.save();
            b(canvas, recyclerview, afn1, f1, f2, j, true);
            canvas.restoreToCount(l);
        }
        j = 0;
        int i1 = j1 - 1;
        while (i1 >= 0) 
        {
            agj1 = (agn)list.get(i1);
            if (((agn) (agj1)).m && !((agn) (agj1)).i)
            {
                list.remove(i1);
                ((agn) (agj1)).e.a(true);
            } else
            if (!((agn) (agj1)).m)
            {
                j = 1;
            }
            i1--;
        }
        if (j != 0)
        {
            recyclerview.invalidate();
        }
    }

    static boolean a(agj agj1, RecyclerView recyclerview, afn afn1)
    {
        return (agj1.a(recyclerview, afn1) & 0xff0000) != 0;
    }

    public static int b(int j, int k)
    {
        int l = j & 0x303030;
        if (l == 0)
        {
            return j;
        }
        j = ~l & j;
        if (k == 0)
        {
            return j | l >> 2;
        } else
        {
            return j | l >> 1 & 0xffcfcfcf | (l >> 1 & 0x303030) >> 2;
        }
    }

    static void b(agj agj1, Canvas canvas, RecyclerView recyclerview, afn afn1, List list, int j, float f1, float f2)
    {
        int i1 = list.size();
        int k = 0;
        while (k < i1) 
        {
            agn agn1 = (agn)list.get(k);
            int j1;
            if (agn1.a == agn1.c)
            {
                agn1.j = mk.n(agn1.e.a);
            } else
            {
                agn1.j = agn1.a + agn1.n * (agn1.c - agn1.a);
            }
            if (agn1.b == agn1.d)
            {
                agn1.k = mk.o(agn1.e.a);
            } else
            {
                agn1.k = agn1.b + agn1.n * (agn1.d - agn1.b);
            }
            j1 = canvas.save();
            agj1.a(canvas, recyclerview, agn1.e, agn1.j, agn1.k, agn1.f, false);
            canvas.restoreToCount(j1);
            k++;
        }
        if (afn1 != null)
        {
            int l = canvas.save();
            agj1.a(canvas, recyclerview, afn1, f1, f2, j, true);
            canvas.restoreToCount(l);
        }
    }

    private static void b(Canvas canvas, RecyclerView recyclerview, afn afn1, float f1, float f2, int j, boolean flag)
    {
        a.a(canvas, recyclerview, afn1.a, f1, f2, j);
    }

    public static boolean b()
    {
        return true;
    }

    public static int f()
    {
        return 0;
    }

    public static float g()
    {
        return 0.5F;
    }

    public static float h()
    {
        return 0.5F;
    }

    public abstract int a();

    public int a(RecyclerView recyclerview, int j, int k, long l)
    {
label0:
        {
            float f1 = 1.0F;
            if (d == -1)
            {
                d = recyclerview.getResources().getDimensionPixelSize(b.cj);
            }
            int i1 = d;
            int j1 = Math.abs(k);
            int k1 = (int)Math.signum(k);
            float f2 = Math.min(1.0F, ((float)j1 * 1.0F) / (float)j);
            j = (int)((float)(i1 * k1) * c.getInterpolation(f2));
            if (l <= 2000L)
            {
                f1 = (float)l / 2000F;
            }
            f2 = j;
            i1 = (int)(b.getInterpolation(f1) * f2);
            j = i1;
            if (i1 == 0)
            {
                if (k <= 0)
                {
                    break label0;
                }
                j = 1;
            }
            return j;
        }
        return -1;
    }

    final int a(RecyclerView recyclerview, afn afn1)
    {
        return b(a(), mk.h(recyclerview));
    }

    public afn a(afn afn1, List list, int j, int k)
    {
        afn afn3;
        int l;
        int i1;
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        j2 = afn1.a.getWidth();
        k2 = afn1.a.getHeight();
        afn3 = null;
        l = -1;
        l2 = j - afn1.a.getLeft();
        i3 = k - afn1.a.getTop();
        j3 = list.size();
        i1 = 0;
_L2:
        afn afn2;
        if (i1 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        afn2 = (afn)list.get(i1);
        if (l2 > 0)
        {
            int j1 = afn2.a.getRight() - (j + j2);
            if (j1 < 0 && afn2.a.getRight() > afn1.a.getRight())
            {
                j1 = Math.abs(j1);
                if (j1 > l)
                {
                    l = j1;
                    afn3 = afn2;
                }
            }
        }
        if (l2 < 0)
        {
            int k1 = afn2.a.getLeft() - j;
            if (k1 > 0 && afn2.a.getLeft() < afn1.a.getLeft())
            {
                k1 = Math.abs(k1);
                if (k1 > l)
                {
                    afn3 = afn2;
                    l = k1;
                }
            }
        }
        if (i3 < 0)
        {
            int l1 = afn2.a.getTop() - k;
            if (l1 > 0 && afn2.a.getTop() < afn1.a.getTop())
            {
                l1 = Math.abs(l1);
                if (l1 > l)
                {
                    afn3 = afn2;
                    l = l1;
                }
            }
        }
        if (i3 <= 0)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        int i2 = afn2.a.getBottom() - (k + k2);
        if (i2 >= 0 || afn2.a.getBottom() <= afn1.a.getBottom())
        {
            break MISSING_BLOCK_LABEL_349;
        }
        i2 = Math.abs(i2);
        if (i2 <= l)
        {
            break MISSING_BLOCK_LABEL_349;
        }
        l = i2;
_L3:
        i1++;
        afn3 = afn2;
        if (true) goto _L2; else goto _L1
_L1:
        return afn3;
        afn2 = afn3;
          goto _L3
    }

    public void a(afn afn1, int j)
    {
        if (afn1 != null)
        {
            a.b(afn1.a);
        }
    }

    public void a(Canvas canvas, RecyclerView recyclerview, afn afn1, float f1, float f2, int j, boolean flag)
    {
        a.a(canvas, recyclerview, afn1.a, f1, f2, j, flag);
    }

    public void b(RecyclerView recyclerview, afn afn1)
    {
        a.a(afn1.a);
    }

    public abstract boolean c();

    public boolean d()
    {
        return true;
    }

    public boolean e()
    {
        return true;
    }

    public abstract void i();

    static 
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            a = new ags();
        } else
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a = new agr();
        } else
        {
            a = new agq();
        }
    }
}
