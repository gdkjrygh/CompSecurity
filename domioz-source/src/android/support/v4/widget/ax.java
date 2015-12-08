// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.support.v4.view.ay;
import android.support.v4.view.bl;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

// Referenced classes of package android.support.v4.widget:
//            ay, az, ae

public final class ax
{

    private static final Interpolator v = new android.support.v4.widget.ay();
    private int a;
    private int b;
    private int c;
    private float d[];
    private float e[];
    private float f[];
    private float g[];
    private int h[];
    private int i[];
    private int j[];
    private int k;
    private VelocityTracker l;
    private float m;
    private float n;
    private int o;
    private int p;
    private ae q;
    private final az r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w;

    private static float a(float f1, float f2, float f3)
    {
        float f4 = Math.abs(f1);
        if (f4 < f2)
        {
            f2 = 0.0F;
        } else
        if (f4 > f3)
        {
            f2 = f3;
            if (f1 <= 0.0F)
            {
                return -f3;
            }
        } else
        {
            return f1;
        }
        return f2;
    }

    private int a(int i1, int j1, int k1)
    {
        if (i1 == 0)
        {
            return 0;
        }
        int l1 = u.getWidth();
        int i2 = l1 / 2;
        float f3 = Math.min(1.0F, (float)Math.abs(i1) / (float)l1);
        float f1 = i2;
        float f2 = i2;
        f3 = (float)Math.sin((float)((double)(f3 - 0.5F) * 0.4712389167638204D));
        j1 = Math.abs(j1);
        if (j1 > 0)
        {
            i1 = Math.round(Math.abs((f3 * f2 + f1) / (float)j1) * 1000F) * 4;
        } else
        {
            i1 = (int)(((float)Math.abs(i1) / (float)k1 + 1.0F) * 256F);
        }
        return Math.min(i1, 600);
    }

    private void a(float f1)
    {
        t = true;
        r.a(s, f1);
        t = false;
        if (a == 1)
        {
            c(0);
        }
    }

    private void a(float f1, float f2, int i1)
    {
        int k1 = 0;
        if (d == null || d.length <= i1)
        {
            float af[] = new float[i1 + 1];
            float af2[] = new float[i1 + 1];
            float af3[] = new float[i1 + 1];
            float af4[] = new float[i1 + 1];
            int ai[] = new int[i1 + 1];
            int ai1[] = new int[i1 + 1];
            int ai2[] = new int[i1 + 1];
            if (d != null)
            {
                System.arraycopy(d, 0, af, 0, d.length);
                System.arraycopy(e, 0, af2, 0, e.length);
                System.arraycopy(f, 0, af3, 0, f.length);
                System.arraycopy(g, 0, af4, 0, g.length);
                System.arraycopy(h, 0, ai, 0, h.length);
                System.arraycopy(i, 0, ai1, 0, i.length);
                System.arraycopy(j, 0, ai2, 0, j.length);
            }
            d = af;
            e = af2;
            f = af3;
            g = af4;
            h = ai;
            i = ai1;
            j = ai2;
        }
        float af1[] = d;
        f[i1] = f1;
        af1[i1] = f1;
        af1 = e;
        g[i1] = f2;
        af1[i1] = f2;
        af1 = h;
        int i2 = (int)f1;
        int l1 = (int)f2;
        if (i2 < u.getLeft() + o)
        {
            k1 = 1;
        }
        int j1 = k1;
        if (l1 < u.getTop() + o)
        {
            j1 = k1 | 4;
        }
        k1 = j1;
        if (i2 > u.getRight() - o)
        {
            k1 = j1 | 2;
        }
        j1 = k1;
        if (l1 > u.getBottom() - o)
        {
            j1 = k1 | 8;
        }
        af1[i1] = j1;
        k = k | 1 << i1;
    }

    private boolean a(float f1, float f2, int i1, int j1)
    {
        f1 = Math.abs(f1);
        for (f2 = Math.abs(f2); (h[i1] & j1) != j1 || (p & j1) == 0 || (j[i1] & j1) == j1 || (i[i1] & j1) == j1 || f1 <= (float)b && f2 <= (float)b || (i[i1] & j1) != 0 || f1 <= (float)b;)
        {
            return false;
        }

        return true;
    }

    private boolean a(int i1, int j1, int k1, int l1)
    {
        int i2 = s.getLeft();
        int j2 = s.getTop();
        i1 -= i2;
        j1 -= j2;
        if (i1 == 0 && j1 == 0)
        {
            q.h();
            c(0);
            return false;
        }
        View view = s;
        k1 = b(k1, (int)n, (int)m);
        l1 = b(l1, (int)n, (int)m);
        int k2 = Math.abs(i1);
        int l2 = Math.abs(j1);
        int i3 = Math.abs(k1);
        int j3 = Math.abs(l1);
        int k3 = i3 + j3;
        int l3 = k2 + l2;
        float f1;
        float f2;
        float f3;
        if (k1 != 0)
        {
            f1 = (float)i3 / (float)k3;
        } else
        {
            f1 = (float)k2 / (float)l3;
        }
        if (l1 != 0)
        {
            f2 = (float)j3 / (float)k3;
        } else
        {
            f2 = (float)l2 / (float)l3;
        }
        k1 = a(i1, k1, r.c(view));
        l1 = a(j1, l1, 0);
        f3 = k1;
        k1 = (int)(f2 * (float)l1 + f1 * f3);
        q.a(i2, j2, i1, j1, k1);
        c(2);
        return true;
    }

    private boolean a(View view, float f1)
    {
        if (view != null)
        {
            boolean flag;
            if (r.c(view) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag && Math.abs(f1) > (float)b)
            {
                return true;
            }
        }
        return false;
    }

    private static int b(int i1, int j1, int k1)
    {
        int l1 = Math.abs(i1);
        if (l1 < j1)
        {
            j1 = 0;
        } else
        if (l1 > k1)
        {
            j1 = k1;
            if (i1 <= 0)
            {
                return -k1;
            }
        } else
        {
            return i1;
        }
        return j1;
    }

    private void b(float f1, float f2, int i1)
    {
        int k1 = 1;
        int j1;
        if (!a(f1, f2, i1, 1))
        {
            k1 = 0;
        }
        j1 = k1;
        if (a(f2, f1, i1, 4))
        {
            j1 = k1 | 4;
        }
        k1 = j1;
        if (a(f1, f2, i1, 2))
        {
            k1 = j1 | 2;
        }
        j1 = k1;
        if (a(f2, f1, i1, 8))
        {
            j1 = k1 | 8;
        }
        if (j1 != 0)
        {
            int ai[] = i;
            ai[i1] = ai[i1] | j1;
            r.a(j1, i1);
        }
    }

    private void b(int i1)
    {
        if (d == null)
        {
            return;
        } else
        {
            d[i1] = 0.0F;
            e[i1] = 0.0F;
            f[i1] = 0.0F;
            g[i1] = 0.0F;
            h[i1] = 0;
            i[i1] = 0;
            j[i1] = 0;
            k = k & ~(1 << i1);
            return;
        }
    }

    private boolean b(View view, int i1)
    {
        if (view == s && c == i1)
        {
            return true;
        }
        if (view != null && r.a(view))
        {
            c = i1;
            a(view, i1);
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean b(View view, int i1, int j1)
    {
        while (view == null || i1 < view.getLeft() || i1 >= view.getRight() || j1 < view.getTop() || j1 >= view.getBottom()) 
        {
            return false;
        }
        return true;
    }

    private void c(int i1)
    {
        u.removeCallbacks(w);
        if (a != i1)
        {
            a = i1;
            r.a(i1);
            if (a == 0)
            {
                s = null;
            }
        }
    }

    private void c(MotionEvent motionevent)
    {
        int j1 = ay.c(motionevent);
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = ay.b(motionevent, i1);
            float f1 = ay.c(motionevent, i1);
            float f2 = ay.d(motionevent, i1);
            f[k1] = f1;
            g[k1] = f2;
        }

    }

    private void i()
    {
        l.computeCurrentVelocity(1000, m);
        float f1 = a(bl.a(l, c), n, m);
        a(bl.b(l, c), n, m);
        a(f1);
    }

    public final int a()
    {
        return a;
    }

    public final void a(int i1)
    {
        p = i1;
    }

    public final void a(View view, int i1)
    {
        if (view.getParent() != u)
        {
            throw new IllegalArgumentException((new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (")).append(u).append(")").toString());
        } else
        {
            s = view;
            c = i1;
            r.b(view);
            c(1);
            return;
        }
    }

    public final boolean a(int i1, int j1)
    {
        if (!t)
        {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        } else
        {
            return a(i1, j1, (int)bl.a(l, c), (int)bl.b(l, c));
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = ay.a(motionevent);
        i1 = ay.b(motionevent);
        if (j1 == 0)
        {
            e();
        }
        if (l == null)
        {
            l = VelocityTracker.obtain();
        }
        l.addMovement(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 88
    //                   0 98
    //                   1 529
    //                   2 279
    //                   3 529
    //                   4 88
    //                   5 181
    //                   6 516;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_529;
_L7:
        float f1;
        float f4;
        float f5;
        float f6;
        View view;
        int k1;
        int l1;
        return a == 1;
_L2:
        f1 = motionevent.getX();
        f4 = motionevent.getY();
        i1 = ay.b(motionevent, 0);
        a(f1, f4, i1);
        motionevent = b((int)f1, (int)f4);
        if (motionevent == s && a == 2)
        {
            b(motionevent, i1);
        }
        if ((h[i1] & p) != 0)
        {
            r.b();
        }
          goto _L7
_L5:
        j1 = ay.b(motionevent, i1);
        float f2 = ay.c(motionevent, i1);
        f4 = ay.d(motionevent, i1);
        a(f2, f4, j1);
        if (a == 0)
        {
            if ((h[j1] & p) != 0)
            {
                r.b();
            }
        } else
        if (a == 2)
        {
            motionevent = b((int)f2, (int)f4);
            if (motionevent == s)
            {
                b(motionevent, j1);
            }
        }
          goto _L7
_L4:
        if (d == null || e == null) goto _L7; else goto _L8
_L8:
        k1 = ay.c(motionevent);
        i1 = 0;
_L14:
        if (i1 >= k1) goto _L10; else goto _L9
_L9:
        l1 = ay.b(motionevent, i1);
        float f3 = ay.c(motionevent, i1);
        f4 = ay.d(motionevent, i1);
        f5 = f3 - d[l1];
        f6 = e[l1];
        view = b((int)f3, (int)f4);
        int i2;
        int j2;
        int k2;
        if (view != null && a(view, f5))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (!j1) goto _L12; else goto _L11
_L11:
        i2 = view.getLeft();
        j2 = (int)f5;
        j2 = r.b(view, j2 + i2);
        view.getTop();
        r.d(view);
        k2 = r.c(view);
        if (k2 != 0 && (k2 <= 0 || j2 != i2)) goto _L12; else goto _L10
_L10:
        c(motionevent);
          goto _L7
_L12:
        b(f5, f4 - f6, l1);
        if (a == 1 || j1 && b(view, l1)) goto _L10; else goto _L13
_L13:
        i1++;
          goto _L14
_L6:
        b(ay.b(motionevent, i1));
          goto _L7
        e();
          goto _L7
    }

    public final boolean a(View view, int i1, int j1)
    {
        s = view;
        c = -1;
        boolean flag = a(i1, j1, 0, 0);
        if (!flag && a == 0 && s != null)
        {
            s = null;
        }
        return flag;
    }

    public final int b()
    {
        return o;
    }

    public final View b(int i1, int j1)
    {
        for (int k1 = u.getChildCount() - 1; k1 >= 0; k1--)
        {
            View view = u.getChildAt(k1);
            if (i1 >= view.getLeft() && i1 < view.getRight() && j1 >= view.getTop() && j1 < view.getBottom())
            {
                return view;
            }
        }

        return null;
    }

    public final void b(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = 0;
        j1 = 0;
        l1 = ay.a(motionevent);
        k1 = ay.b(motionevent);
        if (l1 == 0)
        {
            e();
        }
        if (l == null)
        {
            l = VelocityTracker.obtain();
        }
        l.addMovement(motionevent);
        l1;
        JVM INSTR tableswitch 0 6: default 92
    //                   0 93
    //                   1 711
    //                   2 267
    //                   3 728
    //                   4 92
    //                   5 158
    //                   6 582;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        i1 = ay.b(motionevent, 0);
        motionevent = b((int)f1, (int)f3);
        a(f1, f3, i1);
        b(((View) (motionevent)), i1);
        if ((h[i1] & p) != 0)
        {
            r.b();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        float f2;
        float f4;
        i1 = ay.b(motionevent, k1);
        f2 = ay.c(motionevent, k1);
        f4 = ay.d(motionevent, k1);
        a(f2, f4, i1);
        if (a != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        b(b((int)f2, (int)f4), i1);
        if ((h[i1] & p) != 0)
        {
            r.b();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        j1 = (int)f2;
        k1 = (int)f4;
        if (b(s, j1, k1))
        {
            b(s, i1);
            return;
        }
          goto _L1
_L4:
        if (a == 1)
        {
            i1 = ay.a(motionevent, c);
            f2 = ay.c(motionevent, i1);
            f4 = ay.d(motionevent, i1);
            k1 = (int)(f2 - f[c]);
            l1 = (int)(f4 - g[c]);
            j1 = s.getLeft() + k1;
            s.getTop();
            int j2 = s.getLeft();
            int i2 = s.getTop();
            i1 = j1;
            if (k1 != 0)
            {
                i1 = r.b(s, j1);
                s.offsetLeftAndRight(i1 - j2);
            }
            if (l1 != 0)
            {
                j1 = r.d(s);
                s.offsetTopAndBottom(j1 - i2);
            }
            if (k1 != 0 || l1 != 0)
            {
                r.a(s, i1);
            }
            c(motionevent);
            return;
        }
        k1 = ay.c(motionevent);
        i1 = j1;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            j1 = ay.b(motionevent, i1);
            f2 = ay.c(motionevent, i1);
            f4 = ay.d(motionevent, i1);
            float f5 = f2 - d[j1];
            b(f5, f4 - e[j1], j1);
            if (a == 1)
            {
                break;
            }
            View view = b((int)f2, (int)f4);
            if (a(view, f5) && b(view, j1))
            {
                break;
            }
            i1++;
        } while (true);
        c(motionevent);
        return;
_L7:
        j1 = ay.b(motionevent, k1);
        if (a != 1 || j1 != c) goto _L10; else goto _L9
_L9:
        k1 = ay.c(motionevent);
_L16:
        if (i1 >= k1) goto _L12; else goto _L11
_L11:
        l1 = ay.b(motionevent, i1);
        if (l1 == c) goto _L14; else goto _L13
_L13:
        f2 = ay.c(motionevent, i1);
        f4 = ay.d(motionevent, i1);
        if (b((int)f2, (int)f4) != s || !b(s, l1)) goto _L14; else goto _L15
_L15:
        i1 = c;
_L17:
        if (i1 == -1)
        {
            i();
        }
_L10:
        b(j1);
        return;
_L14:
        i1++;
          goto _L16
_L3:
        if (a == 1)
        {
            i();
        }
        e();
        return;
_L5:
        if (a == 1)
        {
            a(0.0F);
        }
        e();
        return;
_L12:
        i1 = -1;
          goto _L17
    }

    public final View c()
    {
        return s;
    }

    public final int d()
    {
        return b;
    }

    public final void e()
    {
        c = -1;
        if (d != null)
        {
            Arrays.fill(d, 0.0F);
            Arrays.fill(e, 0.0F);
            Arrays.fill(f, 0.0F);
            Arrays.fill(g, 0.0F);
            Arrays.fill(h, 0);
            Arrays.fill(i, 0);
            Arrays.fill(j, 0);
            k = 0;
        }
        if (l != null)
        {
            l.recycle();
            l = null;
        }
    }

    public final void f()
    {
        e();
        if (a == 2)
        {
            q.b();
            q.c();
            q.h();
            int i1 = q.b();
            q.c();
            r.a(s, i1);
        }
        c(0);
    }

    public final boolean g()
    {
        boolean flag2 = false;
        if (a == 2)
        {
            boolean flag3 = q.g();
            int i1 = q.b();
            int j1 = q.c();
            int k1 = i1 - s.getLeft();
            int l1 = j1 - s.getTop();
            if (k1 != 0)
            {
                s.offsetLeftAndRight(k1);
            }
            if (l1 != 0)
            {
                s.offsetTopAndBottom(l1);
            }
            if (k1 != 0 || l1 != 0)
            {
                r.a(s, i1);
            }
            boolean flag = flag3;
            if (flag3)
            {
                flag = flag3;
                if (i1 == q.d())
                {
                    flag = flag3;
                    if (j1 == q.e())
                    {
                        q.h();
                        flag = false;
                    }
                }
            }
            if (!flag)
            {
                u.post(w);
            }
        }
        boolean flag1 = flag2;
        if (a == 2)
        {
            flag1 = true;
        }
        return flag1;
    }

    public final boolean h()
    {
        int j1 = d.length;
        boolean flag;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if ((k & 1 << i1) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                float f1 = f[i1] - d[i1];
                float f2 = g[i1] - e[i1];
                if (f1 * f1 + f2 * f2 > (float)(b * b))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            if (flag)
            {
                return true;
            }
        }

        return false;
    }

}
