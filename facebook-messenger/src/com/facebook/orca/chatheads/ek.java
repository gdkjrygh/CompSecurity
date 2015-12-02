// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import com.a.c.a;
import com.facebook.inject.t;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;

// Referenced classes of package com.facebook.orca.chatheads:
//            eo, en, em, el

public class ek
{

    private static final g a = com.facebook.n.g.a(40D, 7D);
    private final j b;
    private final c c;
    private final View d;
    private final View e;
    private final en f;
    private final VelocityTracker g = VelocityTracker.obtain();
    private final float h;
    private final int i;
    private em j;
    private boolean k;
    private boolean l;
    private float m;
    private boolean n;
    private int o;
    private int p;
    private int q;

    public ek(View view, View view1, en en1)
    {
        Context context = view.getContext();
        b = (j)t.a(context).a(com/facebook/n/j);
        c = b.b().a(a).a(true).a(new eo(this, null));
        d = view;
        e = view1;
        f = en1;
        c();
        h = context.getResources().getDimensionPixelSize(com.facebook.g.view_swipe_min_dismiss_velocity);
        i = ViewConfiguration.get(context).getScaledTouchSlop();
        k = true;
    }

    static View a(ek ek1)
    {
        return ek1.d;
    }

    private void a(int i1)
    {
        int j1 = i1;
        if (f == en.UP)
        {
            j1 = -i1;
        }
        com.a.c.a.h(d, j1);
    }

    private boolean a(float f1)
    {
        if (f != en.DOWN) goto _L2; else goto _L1
_L1:
        if (f1 <= (float)p) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (f1 >= (float)p)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private boolean a(MotionEvent motionevent)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (k)
        {
            if (motionevent.getAction() == 0)
            {
                n = false;
                if (j != null)
                {
                    if (!j.a(motionevent))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    n = flag;
                }
            }
            flag = flag1;
            if (!n)
            {
                flag = b(motionevent);
            }
        }
        if (e() == 0)
        {
            d(motionevent);
        }
        return flag;
    }

    static boolean a(ek ek1, MotionEvent motionevent)
    {
        return ek1.a(motionevent);
    }

    static em b(ek ek1)
    {
        return ek1.j;
    }

    private void b(float f1)
    {
        if (e() != 0)
        {
            float f2 = f1;
            if (f == en.UP)
            {
                f2 = -f1;
            }
            c.a(com.a.c.a.a(d));
            c.c(f2);
            c.b(0.0D);
        }
    }

    private boolean b(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 239
    //                   2 46
    //                   3 239;
           goto _L1 _L2 _L3 _L4 _L3
_L1:
        return true;
_L2:
        c(motionevent);
        continue; /* Loop/switch isn't completed */
_L4:
        if (!Float.isNaN(m))
        {
            g.addMovement(motionevent);
            int j1 = (int)(motionevent.getRawY() - m);
            int i1 = j1;
            if (f == en.UP)
            {
                i1 = -j1;
            }
            if (!l)
            {
                if (i1 < i)
                {
                    continue; /* Loop/switch isn't completed */
                }
                l = true;
            }
            i1 = Math.max(0, i1) / 2;
            if (i1 >= q && a(motionevent.getY() + (float)e.getTop()))
            {
                m = (0.0F / 0.0F);
                f();
                return false;
            }
            j1 = e();
            if (i1 > 0 && j1 == 0)
            {
                if (j != null)
                {
                    j.a(this);
                }
                d(motionevent);
                motionevent.setAction(3);
                d(motionevent);
            }
            a(i1);
        }
        if (Float.isNaN(m))
        {
            c(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        l = false;
        m = (0.0F / 0.0F);
        g.computeCurrentVelocity(1000);
        float f2 = g.getYVelocity();
        float f1 = f2;
        if (f == en.UP)
        {
            f1 = -f2;
        }
        if (e() >= o && f1 >= h)
        {
            f();
        } else
        {
            b(f1);
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void c(MotionEvent motionevent)
    {
        l = false;
        m = motionevent.getRawY();
        g.clear();
        g.addMovement(motionevent);
    }

    private void d(MotionEvent motionevent)
    {
        int i1 = e.getTop();
        motionevent.offsetLocation(0.0F, i1);
        d.dispatchTouchEvent(motionevent);
        motionevent.offsetLocation(0.0F, -i1);
    }

    private int e()
    {
        return Math.abs((int)com.a.c.a.a(d));
    }

    private void f()
    {
        if (j != null)
        {
            j.c(this);
        }
    }

    public void a()
    {
        c();
        e.setOnTouchListener(new el(this));
    }

    public void a(em em1)
    {
        j = em1;
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public void b()
    {
        l = false;
        n = true;
        a(0);
    }

    public void c()
    {
        o = d.getHeight() / 5;
        int i1;
        if (f == en.DOWN)
        {
            i1 = d.getHeight();
        } else
        {
            i1 = 0;
        }
        p = i1;
        q = d.getHeight() / 3;
    }

    public void d()
    {
        g.recycle();
        e.setOnTouchListener(null);
    }

}
