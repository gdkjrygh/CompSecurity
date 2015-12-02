// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import com.a.a.c;
import com.a.a.q;
import com.facebook.g;
import com.facebook.widget.listview.BetterListView;
import com.facebook.widget.listview.k;

// Referenced classes of package com.facebook.orca.threadlist:
//            k, j

public class i
{

    private final Context a;
    private final Resources b;
    private BetterListView c;
    private View d;
    private View e;
    private VelocityTracker f;
    private int g;
    private int h;
    private int i;
    private float j;
    private int k;
    private com.facebook.orca.threadlist.k l;
    private int m;
    private int n;
    private q o;
    private k p;
    private k q;

    public i(Context context, Resources resources)
    {
        k = 0;
        l = k.VISIBLE;
        n = 0;
        a = context;
        b = resources;
    }

    static int a(i i1)
    {
        return i1.m;
    }

    private void a(int i1, int j1)
    {
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        int k1;
        l = k.VISIBLE;
        k1 = 0;
_L4:
        if (m == k1)
        {
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        k1 = i1;
        if (i1 <= g)
        {
            l = k.HIDDEN;
            k1 = g;
        }
        if (true) goto _L4; else goto _L3
_L3:
        m = k1;
        if (o != null && o.d())
        {
            o.b();
        }
        o = com.a.a.q.a(d, "translationY", new float[] {
            (float)k1
        });
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            o.a(d());
        }
        o.b(j1).a();
        return;
    }

    static int b(i i1)
    {
        return i1.g;
    }

    static View c(i i1)
    {
        return i1.e;
    }

    static View d(i i1)
    {
        return i1.d;
    }

    private c d()
    {
        return new j(this);
    }

    private boolean e()
    {
        return k == 2 && (l == k.VISIBLE && j < (float)(-h) || l == k.HIDDEN && j > (float)h);
    }

    public void a()
    {
        g = -b.getDimensionPixelOffset(g.publisher_height_with_offset);
        if (l == k.HIDDEN)
        {
            a(false);
        }
    }

    public void a(float f1, float f2, boolean flag)
    {
        if (l == k.VISIBLE || f1 < (float)(-g) || flag && -f2 > (float)h)
        {
            int i1;
            if (f1 < (float)(-g))
            {
                int j1 = -(int)f1;
                i1 = j1;
                if (f1 < (float)n)
                {
                    i1 = Math.max(m, j1);
                }
            } else
            {
                i1 = m + (int)((float)n - f1);
            }
            a(i1, 0);
        }
        n = (int)f1;
    }

    public void a(AbsListView abslistview, int i1)
    {
label0:
        {
            k = i1;
            if (k == 0)
            {
                j = 0.0F;
                if (m <= g / 2 && c.getFirstVisiblePosition() != 0)
                {
                    break label0;
                }
                a(true);
            }
            return;
        }
        a(false);
    }

    public void a(AbsListView abslistview, int i1, int j1, int k1)
    {
        q.a();
        if (k == 0)
        {
            return;
        }
        if (l == k.VISIBLE || e())
        {
            k1 = q.b() - p.b();
            if (Math.abs(k1) < 2)
            {
                j1 = m - (q.d() - p.d());
                if (k1 == 1)
                {
                    i1 = j1 - p.c();
                } else
                {
                    i1 = j1;
                    if (k1 == -1)
                    {
                        i1 = j1 + q.c();
                    }
                }
                a(i1, 0);
            } else
            if (k1 > 0)
            {
                a(false);
            }
        } else
        if (m != 0 && q.b() == 0)
        {
            a(-q.d(), 0);
        }
        p.a(q);
    }

    public void a(BetterListView betterlistview, View view, View view1)
    {
        c = betterlistview;
        d = view;
        e = view1;
        a();
        view = ViewConfiguration.get(a);
        int i1 = view.getScaledMinimumFlingVelocity();
        i = view.getScaledMaximumFlingVelocity();
        h = (int)Math.max((double)i * 0.050000000000000003D, i1);
        p = new k(betterlistview);
        q = new k(betterlistview);
    }

    public void a(boolean flag)
    {
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = g;
        }
        a(i1, 100);
    }

    public boolean a(MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 38
    //                   1 49
    //                   2 38
    //                   3 49;
           goto _L1 _L2 _L3 _L2 _L3
_L1:
        return false;
_L2:
        f.addMovement(motionevent);
        continue; /* Loop/switch isn't completed */
_L3:
        f.computeCurrentVelocity(1000);
        j = f.getYVelocity();
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void b()
    {
        if (f == null)
        {
            f = VelocityTracker.obtain();
        }
    }

    public void b(MotionEvent motionevent)
    {
        if (motionevent.getActionMasked() == 0)
        {
            p.a();
        }
    }

    public void c()
    {
        if (f != null)
        {
            f.recycle();
            f = null;
        }
    }
}
