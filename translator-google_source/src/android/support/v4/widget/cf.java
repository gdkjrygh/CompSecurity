// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.at;
import android.support.v4.view.bp;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

// Referenced classes of package android.support.v4.widget:
//            cg, ch, bc, ci, 
//            bd

public final class cf
{

    private static final Interpolator v = new cg();
    int a;
    int b;
    float c[];
    float d[];
    float e[];
    float f[];
    int g;
    float h;
    int i;
    int j;
    View k;
    private int l;
    private int m[];
    private int n[];
    private int o[];
    private VelocityTracker p;
    private float q;
    private bc r;
    private final ci s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new ch(this);

    private cf(Context context, ViewGroup viewgroup, ci ci1)
    {
        l = -1;
        if (viewgroup == null)
        {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (ci1 == null)
        {
            throw new IllegalArgumentException("Callback may not be null");
        } else
        {
            u = viewgroup;
            s = ci1;
            viewgroup = ViewConfiguration.get(context);
            i = (int)(context.getResources().getDisplayMetrics().density * 20F + 0.5F);
            b = viewgroup.getScaledTouchSlop();
            q = viewgroup.getScaledMaximumFlingVelocity();
            h = viewgroup.getScaledMinimumFlingVelocity();
            r = bc.a(context, v);
            return;
        }
    }

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

    public static cf a(ViewGroup viewgroup, float f1, ci ci1)
    {
        viewgroup = new cf(viewgroup.getContext(), viewgroup, ci1);
        viewgroup.b = (int)((float)((cf) (viewgroup)).b * (1.0F / f1));
        return viewgroup;
    }

    private void a(float f1)
    {
        t = true;
        s.a(k, f1);
        t = false;
        if (a == 1)
        {
            a(0);
        }
    }

    private void a(float f1, float f2, int i1)
    {
        int k1 = 0;
        if (c == null || c.length <= i1)
        {
            float af[] = new float[i1 + 1];
            float af2[] = new float[i1 + 1];
            float af3[] = new float[i1 + 1];
            float af4[] = new float[i1 + 1];
            int ai[] = new int[i1 + 1];
            int ai1[] = new int[i1 + 1];
            int ai2[] = new int[i1 + 1];
            if (c != null)
            {
                System.arraycopy(c, 0, af, 0, c.length);
                System.arraycopy(d, 0, af2, 0, d.length);
                System.arraycopy(e, 0, af3, 0, e.length);
                System.arraycopy(f, 0, af4, 0, f.length);
                System.arraycopy(m, 0, ai, 0, m.length);
                System.arraycopy(n, 0, ai1, 0, n.length);
                System.arraycopy(o, 0, ai2, 0, o.length);
            }
            c = af;
            d = af2;
            e = af3;
            f = af4;
            m = ai;
            n = ai1;
            o = ai2;
        }
        float af1[] = c;
        e[i1] = f1;
        af1[i1] = f1;
        af1 = d;
        f[i1] = f2;
        af1[i1] = f2;
        af1 = m;
        int i2 = (int)f1;
        int l1 = (int)f2;
        if (i2 < u.getLeft() + i)
        {
            k1 = 1;
        }
        int j1 = k1;
        if (l1 < u.getTop() + i)
        {
            j1 = k1 | 4;
        }
        k1 = j1;
        if (i2 > u.getRight() - i)
        {
            k1 = j1 | 2;
        }
        j1 = k1;
        if (l1 > u.getBottom() - i)
        {
            j1 = k1 | 8;
        }
        af1[i1] = j1;
        g = g | 1 << i1;
    }

    private boolean a(float f1, float f2, int i1, int j1)
    {
        f1 = Math.abs(f1);
        for (f2 = Math.abs(f2); (m[i1] & j1) != j1 || (j & j1) == 0 || (o[i1] & j1) == j1 || (n[i1] & j1) == j1 || f1 <= (float)b && f2 <= (float)b || (n[i1] & j1) != 0 || f1 <= (float)b;)
        {
            return false;
        }

        return true;
    }

    private boolean a(int i1, int j1, int k1, int l1)
    {
        int i2 = k.getLeft();
        int j2 = k.getTop();
        i1 -= i2;
        j1 -= j2;
        if (i1 == 0 && j1 == 0)
        {
            r.g();
            a(0);
            return false;
        }
        Object obj = k;
        k1 = b(k1, (int)h, (int)q);
        l1 = b(l1, (int)h, (int)q);
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
        k1 = a(i1, k1, s.c(((View) (obj))));
        l1 = a(j1, l1, 0);
        f3 = k1;
        k1 = (int)(f2 * (float)l1 + f1 * f3);
        obj = r;
        ((bc) (obj)).b.a(((bc) (obj)).a, i2, j2, i1, j1, k1);
        a(2);
        return true;
    }

    private boolean a(View view, float f1)
    {
        if (view != null)
        {
            boolean flag;
            if (s.c(view) > 0)
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
            int ai[] = n;
            ai[i1] = ai[i1] | j1;
            s.a(j1, i1);
        }
    }

    private void b(int i1)
    {
        if (c == null)
        {
            return;
        } else
        {
            c[i1] = 0.0F;
            d[i1] = 0.0F;
            e[i1] = 0.0F;
            f[i1] = 0.0F;
            m[i1] = 0;
            n[i1] = 0;
            o[i1] = 0;
            g = g & ~(1 << i1);
            return;
        }
    }

    private boolean b(View view, int i1)
    {
        if (view == k && l == i1)
        {
            return true;
        }
        if (view != null && s.a(view))
        {
            l = i1;
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

    private void c(MotionEvent motionevent)
    {
        int j1 = at.c(motionevent);
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = at.b(motionevent, i1);
            float f1 = at.c(motionevent, i1);
            float f2 = at.d(motionevent, i1);
            e[k1] = f1;
            f[k1] = f2;
        }

    }

    private void d()
    {
        p.computeCurrentVelocity(1000, q);
        float f1 = a(bp.a(p, l), h, q);
        a(bp.b(p, l), h, q);
        a(f1);
    }

    public final void a()
    {
        l = -1;
        if (c != null)
        {
            Arrays.fill(c, 0.0F);
            Arrays.fill(d, 0.0F);
            Arrays.fill(e, 0.0F);
            Arrays.fill(f, 0.0F);
            Arrays.fill(m, 0);
            Arrays.fill(n, 0);
            Arrays.fill(o, 0);
            g = 0;
        }
        if (p != null)
        {
            p.recycle();
            p = null;
        }
    }

    final void a(int i1)
    {
        u.removeCallbacks(w);
        if (a != i1)
        {
            a = i1;
            s.a(i1);
            if (a == 0)
            {
                k = null;
            }
        }
    }

    public final void a(View view, int i1)
    {
        if (view.getParent() != u)
        {
            throw new IllegalArgumentException((new StringBuilder("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (")).append(u).append(")").toString());
        } else
        {
            k = view;
            l = i1;
            s.b(view);
            a(1);
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
            return a(i1, j1, (int)bp.a(p, l), (int)bp.b(p, l));
        }
    }

    public final boolean a(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = at.a(motionevent);
        i1 = at.b(motionevent);
        if (j1 == 0)
        {
            a();
        }
        if (p == null)
        {
            p = VelocityTracker.obtain();
        }
        p.addMovement(motionevent);
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
        i1 = at.b(motionevent, 0);
        a(f1, f4, i1);
        motionevent = b((int)f1, (int)f4);
        if (motionevent == k && a == 2)
        {
            b(motionevent, i1);
        }
        if ((m[i1] & j) != 0)
        {
            s.c();
        }
          goto _L7
_L5:
        j1 = at.b(motionevent, i1);
        float f2 = at.c(motionevent, i1);
        f4 = at.d(motionevent, i1);
        a(f2, f4, j1);
        if (a == 0)
        {
            if ((m[j1] & j) != 0)
            {
                s.c();
            }
        } else
        if (a == 2)
        {
            motionevent = b((int)f2, (int)f4);
            if (motionevent == k)
            {
                b(motionevent, j1);
            }
        }
          goto _L7
_L4:
        if (c == null || d == null) goto _L7; else goto _L8
_L8:
        k1 = at.c(motionevent);
        i1 = 0;
_L14:
        if (i1 >= k1) goto _L10; else goto _L9
_L9:
        l1 = at.b(motionevent, i1);
        float f3 = at.c(motionevent, i1);
        f4 = at.d(motionevent, i1);
        f5 = f3 - c[l1];
        f6 = d[l1];
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
        j2 = s.b(view, j2 + i2);
        view.getTop();
        s.d(view);
        k2 = s.c(view);
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
        b(at.b(motionevent, i1));
          goto _L7
        a();
          goto _L7
    }

    public final boolean a(View view, int i1, int j1)
    {
        k = view;
        l = -1;
        boolean flag = a(i1, j1, 0, 0);
        if (!flag && a == 0 && k != null)
        {
            k = null;
        }
        return flag;
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

    public final void b()
    {
        a();
        if (a == 2)
        {
            r.b();
            r.c();
            r.g();
            int i1 = r.b();
            r.c();
            s.a(k, i1);
        }
        a(0);
    }

    public final void b(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = 0;
        j1 = 0;
        l1 = at.a(motionevent);
        k1 = at.b(motionevent);
        if (l1 == 0)
        {
            a();
        }
        if (p == null)
        {
            p = VelocityTracker.obtain();
        }
        p.addMovement(motionevent);
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
        i1 = at.b(motionevent, 0);
        motionevent = b((int)f1, (int)f3);
        a(f1, f3, i1);
        b(((View) (motionevent)), i1);
        if ((m[i1] & j) != 0)
        {
            s.c();
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        float f2;
        float f4;
        i1 = at.b(motionevent, k1);
        f2 = at.c(motionevent, k1);
        f4 = at.d(motionevent, k1);
        a(f2, f4, i1);
        if (a != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        b(b((int)f2, (int)f4), i1);
        if ((m[i1] & j) != 0)
        {
            s.c();
            return;
        }
        if (true) goto _L1; else goto _L8
_L8:
        j1 = (int)f2;
        k1 = (int)f4;
        if (b(k, j1, k1))
        {
            b(k, i1);
            return;
        }
          goto _L1
_L4:
        if (a == 1)
        {
            i1 = at.a(motionevent, l);
            f2 = at.c(motionevent, i1);
            f4 = at.d(motionevent, i1);
            k1 = (int)(f2 - e[l]);
            l1 = (int)(f4 - f[l]);
            j1 = k.getLeft() + k1;
            k.getTop();
            int j2 = k.getLeft();
            int i2 = k.getTop();
            i1 = j1;
            if (k1 != 0)
            {
                i1 = s.b(k, j1);
                k.offsetLeftAndRight(i1 - j2);
            }
            if (l1 != 0)
            {
                j1 = s.d(k);
                k.offsetTopAndBottom(j1 - i2);
            }
            if (k1 != 0 || l1 != 0)
            {
                s.a(k, i1);
            }
            c(motionevent);
            return;
        }
        k1 = at.c(motionevent);
        i1 = j1;
        do
        {
            if (i1 >= k1)
            {
                break;
            }
            j1 = at.b(motionevent, i1);
            f2 = at.c(motionevent, i1);
            f4 = at.d(motionevent, i1);
            float f5 = f2 - c[j1];
            b(f5, f4 - d[j1], j1);
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
        j1 = at.b(motionevent, k1);
        if (a != 1 || j1 != l) goto _L10; else goto _L9
_L9:
        k1 = at.c(motionevent);
_L16:
        if (i1 >= k1) goto _L12; else goto _L11
_L11:
        l1 = at.b(motionevent, i1);
        if (l1 == l) goto _L14; else goto _L13
_L13:
        f2 = at.c(motionevent, i1);
        f4 = at.d(motionevent, i1);
        if (b((int)f2, (int)f4) != k || !b(k, l1)) goto _L14; else goto _L15
_L15:
        i1 = l;
_L17:
        if (i1 == -1)
        {
            d();
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
            d();
        }
        a();
        return;
_L5:
        if (a == 1)
        {
            a(0.0F);
        }
        a();
        return;
_L12:
        i1 = -1;
          goto _L17
    }

    public final boolean c()
    {
        boolean flag2 = false;
        if (a == 2)
        {
            boolean flag3 = r.f();
            int i1 = r.b();
            int j1 = r.c();
            int k1 = i1 - k.getLeft();
            int l1 = j1 - k.getTop();
            if (k1 != 0)
            {
                k.offsetLeftAndRight(k1);
            }
            if (l1 != 0)
            {
                k.offsetTopAndBottom(l1);
            }
            if (k1 != 0 || l1 != 0)
            {
                s.a(k, i1);
            }
            boolean flag = flag3;
            if (flag3)
            {
                bc bc1 = r;
                flag = flag3;
                if (i1 == bc1.b.g(bc1.a))
                {
                    flag = flag3;
                    if (j1 == r.d())
                    {
                        r.g();
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

}
