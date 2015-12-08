// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class iot
{

    int a;
    Set b;
    final ior c;
    final msx d[][];
    final int e[][];
    final int f[];
    final int g[];
    final int h[];
    final int i[];
    final msx j[][];
    final int k;
    final int l;
    final Point m[];
    int n;
    int o;
    int p;
    final int q;
    boolean r;
    int s;
    Set t;
    int u;
    int v;
    int w;
    long x;
    int y;

    public iot(Context context, float af[][], Point apoint[][], msx amsx[][], int i1, int j1)
    {
        a = 0;
        s = -1;
        t = new HashSet();
        y = 0;
        if (af.length != apoint.length || af.length != amsx.length)
        {
            throw new RuntimeException("Parameters velocityScaleFactors, velocityScaleFactors, and planeScrollPositions must represent the same number of planes.");
        }
        k = apoint.length;
        l = apoint[0].length;
        d = amsx;
        v = i1;
        w = j1;
        c = new ior(context);
        int k1 = (int)((float)v / 2.0F);
        i1 = k;
        j1 = l;
        e = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i1, j1
        });
        for (i1 = 0; i1 < k; i1++)
        {
            for (j1 = 0; j1 < l; j1++)
            {
                e[i1][j1] = apoint[i1][j1].x - k1;
            }

        }

        f = new int[l];
        f[0] = 0;
        j = (msx[][])Array.newInstance(msx, new int[] {
            k, l
        });
        for (i1 = 0; i1 < l - 1; i1++)
        {
            context = new int[k];
            j1 = 0;
            for (int l1 = 0; l1 < k;)
            {
                context[l1] = Math.round((float)(apoint[l1][i1 + 1].x - apoint[l1][i1].x) / af[l1][i1]);
                int j2 = j1;
                if (context[l1] > j1)
                {
                    j2 = context[l1];
                }
                l1++;
                j1 = j2;
            }

            for (int i2 = 0; i2 < k; i2++)
            {
                float f1 = (float)context[i2] / (float)j1;
                float f2 = af[i2][i1] * f1;
                amsx = new msx();
                amsx.a = 0.0F;
                amsx.b = 0.0F;
                amsx.c = f1;
                amsx.d = f2;
                amsx.e = f1;
                amsx.f = f2;
                amsx.g = 1.0F;
                amsx.h = f2;
                j[i2][i1] = amsx;
            }

            f[i1 + 1] = j1 + f[i1];
        }

        g = new int[f.length];
        h = new int[f.length];
        g[0] = 0;
        for (i1 = 0; i1 < f.length; i1++)
        {
            if (i1 != 0)
            {
                g[i1] = Math.round((float)f[i1] - 0.6F * (float)(f[i1] - f[i1 - 1]));
            }
            if (i1 != f.length - 1)
            {
                h[i1] = Math.round((float)f[i1] + 0.6F * (float)(f[i1 + 1] - f[i1]));
            }
        }

        h[f.length - 1] = f[f.length - 1];
        i = new int[f.length - 1];
        for (i1 = 0; i1 < i.length; i1++)
        {
            i[i1] = f[i1] + (f[i1 + 1] - f[i1]) / 2;
        }

        q = f[l - 1];
        c.a = f;
        m = new Point[k];
        for (i1 = 0; i1 < k; i1++)
        {
            m[i1] = new Point(0, 0);
        }

        b = new HashSet();
        r = false;
        f(0);
    }

    public int a()
    {
        return k;
    }

    public int a(int i1)
    {
        return m[i1].x;
    }

    void a(float f1)
    {
        int j1;
        int k1;
        boolean flag1 = true;
        Iterator iterator = t.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            int i1 = ((Integer)iterator.next()).intValue();
            if (n < g[i1] || n > h[i1])
            {
                for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); ((ios)iterator1.next()).b(i1)) { }
                iterator.remove();
            }
        } while (true);
        boolean flag;
        if (n - o > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j1 = 0;
_L3:
        if (j1 >= f.length)
        {
            break MISSING_BLOCK_LABEL_310;
        }
        if (flag)
        {
            k1 = j1;
        } else
        {
            k1 = f.length - 1 - j1;
        }
        if (flag && (n < g[k1] || n > f[k1]) || !flag && (n > h[k1] || n < f[k1]) || r && s == k1) goto _L2; else goto _L1
_L1:
        j1 = ((flag1) ? 1 : 0);
        if ((double)f1 < 5.0000000000000003E-10D)
        {
            j1 = ((flag1) ? 1 : 0);
            if (!g())
            {
                g(k1);
                j1 = ((flag1) ? 1 : 0);
            }
        }
_L4:
        if (j1 == 0)
        {
            s = -1;
            r = false;
        }
        return;
_L2:
        j1++;
          goto _L3
        j1 = 0;
          goto _L4
    }

    public void a(int i1, int j1)
    {
        if (i1 == v && j1 == w)
        {
            return;
        }
        int k1 = (int)((float)v / 2.0F);
        v = i1;
        w = j1;
        int l1 = (int)((float)v / 2.0F);
        for (i1 = 0; i1 < k; i1++)
        {
            for (j1 = 0; j1 < l; j1++)
            {
                e[i1][j1] = (e[i1][j1] + k1) - l1;
            }

        }

        f(n);
    }

    public void a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2)
    {
        c.fling(i1, 0, k1, 0, 0, j2, 0, 0);
        d();
    }

    public void a(ios ios1)
    {
        b.add(ios1);
    }

    public void a(Collection collection)
    {
        t.addAll(collection);
    }

    public void a(boolean flag)
    {
        ior.a(c, n, true);
        d();
    }

    public int b(int i1)
    {
        return m[i1].y;
    }

    int b(int i1, int j1)
    {
        int k1 = 0;
        int ai[] = e[i1];
        int l1 = 0;
        for (; k1 < f.length; k1++)
        {
            if (j1 > f[k1])
            {
                l1 = k1;
            }
        }

        k1 = l1 + 1;
        int i2 = f[l1];
        int j2 = f[k1];
        float f1 = j2 - i2;
        msx msx1 = j[i1][l1];
        float f2;
        switch (y)
        {
        default:
            return Math.round(msx1.a(msx1.b((float)(j1 - i2) / f1)) * f1 + (float)ai[l1]);

        case 2: // '\002'
            f2 = msx1.a(msx1.b((float)(j2 - j1) / f1));
            break;
        }
        return Math.round((float)ai[k1] - f2 * f1);
    }

    public void b()
    {
        a = 0;
    }

    void b(float f1)
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = 0;
_L5:
        if (i1 >= f.length)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        if ((double)f1 >= 5.0000000000000003E-10D || n != f[i1]) goto _L2; else goto _L1
_L1:
        u = f[i1];
        i1 = 1;
_L9:
        if (i1 == 0) goto _L4; else goto _L3
_L3:
        i1 = ((flag) ? 1 : 0);
_L8:
        y = i1;
_L7:
        return;
_L2:
        i1++;
          goto _L5
_L4:
        if (y != 0) goto _L7; else goto _L6
_L6:
        if (n > u)
        {
            i1 = 1;
        } else
        {
            i1 = 2;
        }
          goto _L8
        i1 = 0;
          goto _L9
    }

    public void b(boolean flag)
    {
        if (f.length == 0)
        {
            return;
        }
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = f.length - 1;
        }
        g(i1);
    }

    public void c(int i1)
    {
        f(i1);
    }

    public boolean c()
    {
        return a == 0;
    }

    public void d()
    {
        a = 3;
    }

    public void d(int i1)
    {
        c(f[i1]);
    }

    public void e(int i1)
    {
        t.add(Integer.valueOf(0));
    }

    public boolean e()
    {
        return a == 3;
    }

    public void f()
    {
        a = 2;
    }

    boolean f(int i1)
    {
        int j1 = 0;
        n = i1;
        long l1 = System.nanoTime();
        if (n != o)
        {
            float f1 = (float)Math.abs(n - o) / (float)v / (float)(l1 - x);
            a(f1);
            b(f1);
            x = l1;
            o = n;
        }
        for (; p < i.length && i1 >= i[p]; p = p + 1) { }
        for (; p > 0 && i1 < i[p - 1]; p = p - 1) { }
        boolean flag = false;
        for (; j1 < k; j1++)
        {
            int k1 = b(j1, i1);
            if (k1 != m[j1].x)
            {
                m[j1].x = k1;
                m[j1].y = h(j1);
                flag = true;
            }
        }

        if (flag && b != null)
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ios)iterator.next()).a(this)) { }
        }
        return flag;
    }

    void g(int i1)
    {
        if (!b.isEmpty())
        {
            for (Iterator iterator = b.iterator(); iterator.hasNext(); ((ios)iterator.next()).a(i1)) { }
        }
        s = i1;
        t.add(Integer.valueOf(i1));
        r = true;
    }

    public boolean g()
    {
        return a == 2;
    }

    int h(int i1)
    {
        float f3;
        float f4;
        boolean flag;
        int j1;
        flag = false;
        float f1 = m[i1].x;
        f4 = (float)v / 2.0F + f1;
        f3 = 0.0F;
        j1 = d[i1].length;
        if (f4 > d[i1][0].a) goto _L2; else goto _L1
_L1:
        float f2 = d[i1][0].b;
_L4:
        return (int)(f2 - (float)w / 2.0F);
_L2:
        msx amsx[];
        if (f4 >= d[i1][j1 - 1].g)
        {
            f2 = d[i1][j1 - 1].h;
            continue; /* Loop/switch isn't completed */
        }
        amsx = d[i1];
        j1 = amsx.length;
        i1 = ((flag) ? 1 : 0);
_L5:
        f2 = f3;
        if (i1 < j1)
        {
label0:
            {
                msx msx1 = amsx[i1];
                if (f4 < msx1.a || f4 > msx1.g)
                {
                    break label0;
                }
                f2 = msx1.a(msx1.b(f4));
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1++;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public boolean h()
    {
        if (n())
        {
            i();
            if (!n())
            {
                b();
            }
            return true;
        }
        if (e())
        {
            b();
        }
        return false;
    }

    public boolean i()
    {
        if (c.computeScrollOffset())
        {
            return f(c.getCurrX());
        } else
        {
            return false;
        }
    }

    public int j()
    {
        return a(0);
    }

    public int k()
    {
        return b(0);
    }

    public int l()
    {
        return n;
    }

    public void m()
    {
        c.abortAnimation();
    }

    public boolean n()
    {
        return !c.isFinished();
    }

    public int o()
    {
        return q;
    }

    public int p()
    {
        return p;
    }
}
