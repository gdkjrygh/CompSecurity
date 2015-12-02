// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.m;
import android.support.v4.view.q;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import java.util.Arrays;

// Referenced classes of package android.support.v4.widget:
//            g

public class j
{
    public static abstract class a
    {

        public int a(View view)
        {
            return 0;
        }

        public int a(View view, int i1, int j1)
        {
            return 0;
        }

        public void a(int i1)
        {
        }

        public void a(int i1, int j1)
        {
        }

        public void a(View view, float f1, float f2)
        {
        }

        public void a(View view, int i1, int j1, int k1, int l1)
        {
        }

        public abstract boolean a(View view, int i1);

        public int b(View view)
        {
            return 0;
        }

        public int b(View view, int i1, int j1)
        {
            return 0;
        }

        public void b(int i1, int j1)
        {
        }

        public void b(View view, int i1)
        {
        }

        public boolean b(int i1)
        {
            return false;
        }

        public int c(int i1)
        {
            return i1;
        }

        public a()
        {
        }
    }


    private static final Interpolator v = new Interpolator() {

        public float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
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
    private g q;
    private final a r;
    private View s;
    private boolean t;
    private final ViewGroup u;
    private final Runnable w = new Runnable() {

        final j a;

        public void run()
        {
            a.c(0);
        }

            
            {
                a = j.this;
                super();
            }
    };

    private j(Context context, ViewGroup viewgroup, a a1)
    {
        c = -1;
        if (viewgroup == null)
        {
            throw new IllegalArgumentException("Parent view may not be null");
        }
        if (a1 == null)
        {
            throw new IllegalArgumentException("Callback may not be null");
        } else
        {
            u = viewgroup;
            r = a1;
            viewgroup = ViewConfiguration.get(context);
            o = (int)(context.getResources().getDisplayMetrics().density * 20F + 0.5F);
            b = viewgroup.getScaledTouchSlop();
            m = viewgroup.getScaledMaximumFlingVelocity();
            n = viewgroup.getScaledMinimumFlingVelocity();
            q = android.support.v4.widget.g.a(context, v);
            return;
        }
    }

    private float a(float f1, float f2, float f3)
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
        f3 = b(f3);
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

    private int a(View view, int i1, int j1, int k1, int l1)
    {
        k1 = b(k1, (int)n, (int)m);
        l1 = b(l1, (int)n, (int)m);
        int i2 = Math.abs(i1);
        int j2 = Math.abs(j1);
        int k2 = Math.abs(k1);
        int l2 = Math.abs(l1);
        int i3 = k2 + l2;
        int j3 = i2 + j2;
        float f1;
        float f2;
        float f3;
        if (k1 != 0)
        {
            f1 = (float)k2 / (float)i3;
        } else
        {
            f1 = (float)i2 / (float)j3;
        }
        if (l1 != 0)
        {
            f2 = (float)l2 / (float)i3;
        } else
        {
            f2 = (float)j2 / (float)j3;
        }
        i1 = a(i1, k1, r.a(view));
        j1 = a(j1, l1, r.b(view));
        f3 = i1;
        return (int)(f2 * (float)j1 + f1 * f3);
    }

    public static j a(ViewGroup viewgroup, float f1, a a1)
    {
        viewgroup = a(viewgroup, a1);
        viewgroup.b = (int)((float)((j) (viewgroup)).b * (1.0F / f1));
        return viewgroup;
    }

    public static j a(ViewGroup viewgroup, a a1)
    {
        return new j(viewgroup.getContext(), viewgroup, a1);
    }

    private void a(float f1, float f2)
    {
        t = true;
        r.a(s, f1, f2);
        t = false;
        if (a == 1)
        {
            c(0);
        }
    }

    private void a(float f1, float f2, int i1)
    {
        f(i1);
        float af[] = d;
        f[i1] = f1;
        af[i1] = f1;
        af = e;
        g[i1] = f2;
        af[i1] = f2;
        h[i1] = e((int)f1, (int)f2);
        k = k | 1 << i1;
    }

    private boolean a(float f1, float f2, int i1, int j1)
    {
        f1 = Math.abs(f1);
        f2 = Math.abs(f2);
        if ((h[i1] & j1) == j1 && (p & j1) != 0 && (j[i1] & j1) != j1 && (i[i1] & j1) != j1 && (f1 > (float)b || f2 > (float)b))
        {
            if (f1 < f2 * 0.5F && r.b(j1))
            {
                int ai[] = j;
                ai[i1] = ai[i1] | j1;
                return false;
            }
            if ((i[i1] & j1) == 0 && f1 > (float)b)
            {
                return true;
            }
        }
        return false;
    }

    private boolean a(int i1, int j1, int k1, int l1)
    {
        int i2 = s.getLeft();
        int j2 = s.getTop();
        i1 -= i2;
        j1 -= j2;
        if (i1 == 0 && j1 == 0)
        {
            q.g();
            c(0);
            return false;
        } else
        {
            k1 = a(s, i1, j1, k1, l1);
            q.a(i2, j2, i1, j1, k1);
            c(2);
            return true;
        }
    }

    private boolean a(View view, float f1, float f2)
    {
        boolean flag2 = true;
        if (view != null) goto _L2; else goto _L1
_L1:
        flag2 = false;
_L4:
        return flag2;
_L2:
        boolean flag;
        boolean flag1;
        if (r.a(view) > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (r.b(view) > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!flag || !flag1)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 * f1 + f2 * f2 <= (float)(b * b))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Math.abs(f1) <= (float)b)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (flag1)
        {
            if (Math.abs(f2) <= (float)b)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    private float b(float f1)
    {
        return (float)Math.sin((float)((double)(f1 - 0.5F) * 0.4712389167638204D));
    }

    private int b(int i1, int j1, int k1)
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
            r.b(j1, i1);
        }
    }

    private void b(int i1, int j1, int k1, int l1)
    {
        int i2 = s.getLeft();
        int j2 = s.getTop();
        if (k1 != 0)
        {
            i1 = r.a(s, i1, k1);
            s.offsetLeftAndRight(i1 - i2);
        }
        if (l1 != 0)
        {
            j1 = r.b(s, j1, l1);
            s.offsetTopAndBottom(j1 - j2);
        }
        if (k1 != 0 || l1 != 0)
        {
            r.a(s, i1, j1, i1 - i2, j1 - j2);
        }
    }

    private void c(MotionEvent motionevent)
    {
        int j1 = android.support.v4.view.m.c(motionevent);
        for (int i1 = 0; i1 < j1; i1++)
        {
            int k1 = android.support.v4.view.m.b(motionevent, i1);
            float f1 = android.support.v4.view.m.c(motionevent, i1);
            float f2 = android.support.v4.view.m.d(motionevent, i1);
            f[k1] = f1;
            g[k1] = f2;
        }

    }

    private int e(int i1, int j1)
    {
        int l1 = 0;
        if (i1 < u.getLeft() + o)
        {
            l1 = 1;
        }
        int k1 = l1;
        if (j1 < u.getTop() + o)
        {
            k1 = l1 | 4;
        }
        l1 = k1;
        if (i1 > u.getRight() - o)
        {
            l1 = k1 | 2;
        }
        i1 = l1;
        if (j1 > u.getBottom() - o)
        {
            i1 = l1 | 8;
        }
        return i1;
    }

    private void e(int i1)
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

    private void f(int i1)
    {
        if (d == null || d.length <= i1)
        {
            float af[] = new float[i1 + 1];
            float af1[] = new float[i1 + 1];
            float af2[] = new float[i1 + 1];
            float af3[] = new float[i1 + 1];
            int ai[] = new int[i1 + 1];
            int ai1[] = new int[i1 + 1];
            int ai2[] = new int[i1 + 1];
            if (d != null)
            {
                System.arraycopy(d, 0, af, 0, d.length);
                System.arraycopy(e, 0, af1, 0, e.length);
                System.arraycopy(f, 0, af2, 0, f.length);
                System.arraycopy(g, 0, af3, 0, g.length);
                System.arraycopy(h, 0, ai, 0, h.length);
                System.arraycopy(i, 0, ai1, 0, i.length);
                System.arraycopy(j, 0, ai2, 0, j.length);
            }
            d = af;
            e = af1;
            f = af2;
            g = af3;
            h = ai;
            i = ai1;
            j = ai2;
        }
    }

    private void g()
    {
        if (d == null)
        {
            return;
        } else
        {
            Arrays.fill(d, 0.0F);
            Arrays.fill(e, 0.0F);
            Arrays.fill(f, 0.0F);
            Arrays.fill(g, 0.0F);
            Arrays.fill(h, 0);
            Arrays.fill(i, 0);
            Arrays.fill(j, 0);
            k = 0;
            return;
        }
    }

    private void h()
    {
        l.computeCurrentVelocity(1000, m);
        a(a(android.support.v4.view.q.a(l, c), n, m), a(android.support.v4.view.q.b(l, c), n, m));
    }

    public int a()
    {
        return a;
    }

    public void a(float f1)
    {
        n = f1;
    }

    public void a(int i1)
    {
        p = i1;
    }

    public void a(View view, int i1)
    {
        if (view.getParent() != u)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (").append(u).append(")").toString());
        } else
        {
            s = view;
            c = i1;
            r.b(view, i1);
            c(1);
            return;
        }
    }

    public boolean a(int i1, int j1)
    {
        if (!t)
        {
            throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        } else
        {
            return a(i1, j1, (int)android.support.v4.view.q.a(l, c), (int)android.support.v4.view.q.b(l, c));
        }
    }

    public boolean a(MotionEvent motionevent)
    {
        int i1;
        int j1;
        j1 = android.support.v4.view.m.a(motionevent);
        i1 = android.support.v4.view.m.b(motionevent);
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
    //                   1 452
    //                   2 305
    //                   3 452
    //                   4 88
    //                   5 194
    //                   6 439;
           goto _L1 _L2 _L3 _L4 _L3 _L1 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_452;
_L7:
        float f1;
        float f2;
        float f3;
        float f4;
        View view;
        int k1;
        return a == 1;
_L2:
        f1 = motionevent.getX();
        f2 = motionevent.getY();
        i1 = android.support.v4.view.m.b(motionevent, 0);
        a(f1, f2, i1);
        motionevent = d((int)f1, (int)f2);
        if (motionevent == s && a == 2)
        {
            b(motionevent, i1);
        }
        j1 = h[i1];
        if ((p & j1) != 0)
        {
            r.a(j1 & p, i1);
        }
          goto _L7
_L5:
        j1 = android.support.v4.view.m.b(motionevent, i1);
        f1 = android.support.v4.view.m.c(motionevent, i1);
        f2 = android.support.v4.view.m.d(motionevent, i1);
        a(f1, f2, j1);
        if (a == 0)
        {
            i1 = h[j1];
            if ((p & i1) != 0)
            {
                r.a(i1 & p, j1);
            }
        } else
        if (a == 2)
        {
            motionevent = d((int)f1, (int)f2);
            if (motionevent == s)
            {
                b(motionevent, j1);
            }
        }
          goto _L7
_L4:
        j1 = android.support.v4.view.m.c(motionevent);
        i1 = 0;
_L12:
        if (i1 >= j1) goto _L9; else goto _L8
_L8:
        k1 = android.support.v4.view.m.b(motionevent, i1);
        f1 = android.support.v4.view.m.c(motionevent, i1);
        f2 = android.support.v4.view.m.d(motionevent, i1);
        f3 = f1 - d[k1];
        f4 = f2 - e[k1];
        b(f3, f4, k1);
        if (a != 1) goto _L10; else goto _L9
_L9:
        c(motionevent);
          goto _L7
_L10:
        if ((view = d((int)f1, (int)f2)) != null && a(view, f3, f4) && b(view, k1)) goto _L9; else goto _L11
_L11:
        i1++;
          goto _L12
_L6:
        e(android.support.v4.view.m.b(motionevent, i1));
          goto _L7
        e();
          goto _L7
    }

    public boolean a(View view, int i1, int j1)
    {
        s = view;
        c = -1;
        return a(i1, j1, 0, 0);
    }

    public boolean a(boolean flag)
    {
        if (a == 2)
        {
            boolean flag1 = q.f();
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
                r.a(s, i1, j1, k1, l1);
            }
            if (flag1 && i1 == q.d() && j1 == q.e())
            {
                q.g();
                flag1 = q.a();
            }
            if (!flag1)
            {
                if (flag)
                {
                    u.post(w);
                } else
                {
                    c(0);
                }
            }
        }
        return a == 2;
    }

    public int b()
    {
        return o;
    }

    public void b(MotionEvent motionevent)
    {
        int i1;
        int j1;
        int k1;
        int l1;
        i1 = 0;
        j1 = 0;
        l1 = android.support.v4.view.m.a(motionevent);
        k1 = android.support.v4.view.m.b(motionevent);
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
    //                   1 633
    //                   2 282
    //                   3 650
    //                   4 92
    //                   5 171
    //                   6 504;
           goto _L1 _L2 _L3 _L4 _L5 _L1 _L6 _L7
_L1:
        return;
_L2:
        float f1 = motionevent.getX();
        float f3 = motionevent.getY();
        i1 = android.support.v4.view.m.b(motionevent, 0);
        motionevent = d((int)f1, (int)f3);
        a(f1, f3, i1);
        b(((View) (motionevent)), i1);
        j1 = h[i1];
        if ((p & j1) != 0)
        {
            r.a(j1 & p, i1);
            return;
        }
          goto _L1
_L6:
        float f2;
        float f4;
        i1 = android.support.v4.view.m.b(motionevent, k1);
        f2 = android.support.v4.view.m.c(motionevent, k1);
        f4 = android.support.v4.view.m.d(motionevent, k1);
        a(f2, f4, i1);
        if (a != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        b(d((int)f2, (int)f4), i1);
        j1 = h[i1];
        if ((p & j1) == 0) goto _L1; else goto _L8
_L8:
        r.a(j1 & p, i1);
        return;
        if (!c((int)f2, (int)f4)) goto _L1; else goto _L9
_L9:
        b(s, i1);
        return;
_L4:
        if (a == 1)
        {
            i1 = android.support.v4.view.m.a(motionevent, c);
            f2 = android.support.v4.view.m.c(motionevent, i1);
            f4 = android.support.v4.view.m.d(motionevent, i1);
            i1 = (int)(f2 - f[c]);
            j1 = (int)(f4 - g[c]);
            b(s.getLeft() + i1, s.getTop() + j1, i1, j1);
            c(motionevent);
            return;
        }
        k1 = android.support.v4.view.m.c(motionevent);
        i1 = j1;
_L14:
        if (i1 >= k1) goto _L11; else goto _L10
_L10:
        float f5;
        float f6;
        j1 = android.support.v4.view.m.b(motionevent, i1);
        f2 = android.support.v4.view.m.c(motionevent, i1);
        f4 = android.support.v4.view.m.d(motionevent, i1);
        f5 = f2 - d[j1];
        f6 = f4 - e[j1];
        b(f5, f6, j1);
        if (a != 1) goto _L12; else goto _L11
_L11:
        View view;
        c(motionevent);
        return;
_L12:
        if (a(view = d((int)f2, (int)f4), f5, f6) && b(view, j1)) goto _L11; else goto _L13
_L13:
        i1++;
          goto _L14
_L7:
        j1 = android.support.v4.view.m.b(motionevent, k1);
        if (a != 1 || j1 != c) goto _L16; else goto _L15
_L15:
        k1 = android.support.v4.view.m.c(motionevent);
_L21:
        if (i1 >= k1) goto _L18; else goto _L17
_L17:
        l1 = android.support.v4.view.m.b(motionevent, i1);
        if (l1 != c) goto _L20; else goto _L19
_L19:
        i1++;
          goto _L21
_L20:
        f2 = android.support.v4.view.m.c(motionevent, i1);
        f4 = android.support.v4.view.m.d(motionevent, i1);
        if (d((int)f2, (int)f4) != s || !b(s, l1)) goto _L19; else goto _L22
_L22:
        i1 = c;
_L24:
        if (i1 == -1)
        {
            h();
        }
_L16:
        e(j1);
        return;
_L3:
        if (a == 1)
        {
            h();
        }
        e();
        return;
_L5:
        if (a == 1)
        {
            a(0.0F, 0.0F);
        }
        e();
        return;
_L18:
        i1 = -1;
        if (true) goto _L24; else goto _L23
_L23:
    }

    public boolean b(int i1)
    {
        return (k & 1 << i1) != 0;
    }

    public boolean b(int i1, int j1)
    {
        boolean flag1 = true;
        if (b(j1)) goto _L2; else goto _L1
_L1:
        flag1 = false;
_L4:
        return flag1;
_L2:
        float f1;
        float f2;
        boolean flag;
        if ((i1 & 1) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((i1 & 2) == 2)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        f1 = f[j1] - d[j1];
        f2 = g[j1] - e[j1];
        if (!flag || i1 == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        if (f1 * f1 + f2 * f2 <= (float)(b * b))
        {
            return false;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Math.abs(f1) <= (float)b)
        {
            return false;
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (i1 != 0)
        {
            if (Math.abs(f2) <= (float)b)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    boolean b(View view, int i1)
    {
        if (view == s && c == i1)
        {
            return true;
        }
        if (view != null && r.a(view, i1))
        {
            c = i1;
            a(view, i1);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean b(View view, int i1, int j1)
    {
        while (view == null || i1 < view.getLeft() || i1 >= view.getRight() || j1 < view.getTop() || j1 >= view.getBottom()) 
        {
            return false;
        }
        return true;
    }

    public View c()
    {
        return s;
    }

    void c(int i1)
    {
        if (a != i1)
        {
            a = i1;
            r.a(i1);
            if (i1 == 0)
            {
                s = null;
            }
        }
    }

    public boolean c(int i1, int j1)
    {
        return b(s, i1, j1);
    }

    public int d()
    {
        return b;
    }

    public View d(int i1, int j1)
    {
        for (int k1 = u.getChildCount() - 1; k1 >= 0; k1--)
        {
            View view = u.getChildAt(r.c(k1));
            if (i1 >= view.getLeft() && i1 < view.getRight() && j1 >= view.getTop() && j1 < view.getBottom())
            {
                return view;
            }
        }

        return null;
    }

    public boolean d(int i1)
    {
        boolean flag1 = false;
        int k1 = d.length;
        int j1 = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (j1 < k1)
                {
                    if (!b(i1, j1))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            j1++;
        } while (true);
    }

    public void e()
    {
        c = -1;
        g();
        if (l != null)
        {
            l.recycle();
            l = null;
        }
    }

    public void f()
    {
        e();
        if (a == 2)
        {
            int i1 = q.b();
            int j1 = q.c();
            q.g();
            int k1 = q.b();
            int l1 = q.c();
            r.a(s, k1, l1, k1 - i1, l1 - j1);
        }
        c(0);
    }

}
