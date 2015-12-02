// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.reflex.Scroller;
import com.facebook.reflex.Transaction;
import com.facebook.reflex.Widget;
import com.facebook.reflex.a.c;
import com.facebook.reflex.view.b.r;
import com.google.common.a.hq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.facebook.reflex.view.c:
//            h, c, f, s, 
//            g

public class d
{

    public static float a = 0.5F;
    private final Scroller b;
    private final s c;
    private final com.facebook.reflex.view.c.c d = new com.facebook.reflex.view.c.c();
    private final f e;
    private final Transaction f;
    private final h g = new h(this, null);
    private final h h = new h(this, null);
    private final ArrayList i = hq.a();
    private final c j;
    private final int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private final LinkedList q = hq.b();

    public d(Scroller scroller, s s1, f f1, Transaction transaction, c c1)
    {
        l = 0;
        m = 0;
        n = 0;
        o = 0;
        p = false;
        b = scroller;
        c = s1;
        e = f1;
        f = transaction;
        j = c1;
        k = f1.a();
        b.a((float)k * 0.25F);
    }

    private float a(h h1)
    {
        if (q.isEmpty())
        {
            return 1.0F;
        }
        if (h1.b == h1.a)
        {
            return 0.0F;
        }
        int j1 = ((r)q.getFirst()).f().getTop();
        int k1 = ((r)q.getLast()).f().getBottom();
        int i1 = 0;
        if (!a(j1, k1, h1))
        {
            return 1.0F;
        }
        if (j1 > h1.a)
        {
            i1 = 0 + (j1 - h1.a);
        }
        j1 = i1;
        if (k1 < h1.b)
        {
            j1 = i1 + (h1.b - k1);
        }
        return (float)(j1 / (h1.b - h1.a));
    }

    private int a(int i1, int j1, h h1, g g1)
    {
        f.b();
        r r1;
        View view;
        int k1;
        long l1;
        r1 = c.a(i1);
        view = r1.f();
        l1 = System.currentTimeMillis();
        if (!i.contains(r1))
        {
            e.a(r1);
            e.b(r1);
        }
        a(view);
        k1 = view.getMeasuredHeight();
        d.a(i1, k1);
        if (g1 != g.BEFORE) goto _L2; else goto _L1
_L1:
        boolean flag1 = a(j1 - k1, j1, h1);
        boolean flag;
        flag = flag1;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        q.addFirst(r1);
        view.layout(0, j1 - k1, b.f(), j1);
        flag = flag1;
_L4:
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_303;
        }
        r1.getBackingWidget().b(0.0F, view.getTop());
        r1.e();
        e.c(r1);
        i.remove(r1);
_L5:
        m = (int)((long)m + (System.currentTimeMillis() - l1));
        l = l + k1;
        f.c();
        return k1;
_L2:
        flag1 = a(j1, j1 + k1, h1);
        flag = flag1;
        if (!flag1) goto _L4; else goto _L3
_L3:
        q.addLast(r1);
        view.layout(0, j1, b.f(), j1 + k1);
        flag = flag1;
          goto _L4
        h1;
        f.c();
        throw h1;
        c.a(r1);
        if (!i.contains(r1))
        {
            i.add(r1);
        }
          goto _L5
    }

    private int a(h h1, long l1)
    {
        int i1 = ((r)q.getLast()).f().getBottom();
        do
        {
            int j1;
            for (j1 = c(((r)q.getLast()).f().getTop()); i1 >= h1.b || j1 >= c.a() - 1 || System.currentTimeMillis() - l1 > 32L;)
            {
                return i1;
            }

            j1++;
            i1 += c(j1, i1, h1);
        } while (true);
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, -2);
        }
        int j1 = ViewGroup.getChildMeasureSpec(0x40000000, 0, b.f());
        int i1 = layoutparams.height;
        if (i1 > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j1, i1);
    }

    private void a(r r1)
    {
        e.b(r1);
        c.a(r1);
        if (!i.contains(r1))
        {
            i.add(r1);
        }
    }

    private boolean a(int i1, int j1, h h1)
    {
        return i1 <= h1.b && j1 >= h1.a;
    }

    private int b(int i1, int j1, h h1)
    {
        return a(i1, j1, h1, g.BEFORE);
    }

    private int b(h h1, long l1)
    {
        int i1;
        i1 = ((r)q.getFirst()).f().getTop();
_L2:
        int k1;
        int i2;
        int j1;
        for (j1 = c(i1); i1 <= h1.a || j1 <= 0 || System.currentTimeMillis() - l1 > 32L;)
        {
            return i1;
        }

        j1--;
        k1 = d.c(j1);
        i2 = b(j1, i1, h1);
        if (i2 == k1)
        {
            break MISSING_BLOCK_LABEL_187;
        }
        f.b();
        r r1;
        for (Iterator iterator = q.iterator(); iterator.hasNext(); r1.getBackingWidget().b(0.0F, r1.f().getTop()))
        {
            r1 = (r)iterator.next();
            r1.f().offsetTopAndBottom(i2 - k1);
        }

        break MISSING_BLOCK_LABEL_180;
        h1;
        f.c();
        throw h1;
        f.c();
        i1 -= k1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private h b(float f1)
    {
        g.a = (int)f1;
        h.b = (int)((float)b.g() + f1);
        return h;
    }

    private int c(int i1, int j1, h h1)
    {
        return a(i1, j1, h1, g.AFTER);
    }

    private h c(float f1)
    {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        f3 = b.g();
        f4 = a * f3;
        f2 = f1 - f4;
        f5 = f1 + f3 + f4;
        f6 = b.c() + (float)n;
        f1 = Math.max(b.d() - (float)o, f3 + f6 + f4 * 2.0F);
        f3 = Math.max(f6, f2);
        f4 = Math.min(f1, f5);
        if (f3 <= f2) goto _L2; else goto _L1
_L1:
        f1 = Math.min(f1, (f4 + f3) - f2);
        f2 = f3;
_L4:
        h.a = (int)Math.floor(f2);
        h.b = (int)Math.ceil(f1);
        return h;
_L2:
        f1 = f4;
        f2 = f3;
        if (f4 < f5)
        {
            f2 = Math.max(f6, f3 - (f5 - f4));
            f1 = f4;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private void c()
    {
        float f1;
        float f2;
        if (d.b() == 0)
        {
            f1 = 100F;
        } else
        {
            f1 = (float)(d.a() * c.a()) / (float)d.b();
        }
        f2 = o + n;
        b.a(b.c(), f1 + f2 + b.c());
        if (m > 0)
        {
            f1 = Math.min(Math.max((l / m) * 1000, (float)k * 0.2F), (float)k * 1.0F);
            b.a(f1);
        }
    }

    private void d()
    {
        r r1;
        for (Iterator iterator = i.iterator(); iterator.hasNext(); e.d(r1))
        {
            r1 = (r)iterator.next();
        }

        i.clear();
    }

    private void e()
    {
        for (Iterator iterator = q.iterator(); iterator.hasNext(); a((r)iterator.next())) { }
        q.clear();
    }

    public void a()
    {
        e();
        d();
    }

    public void a(float f1)
    {
        h h1;
        h h2;
        int i1;
        int j1;
        boolean flag;
        j1 = 0;
        flag = false;
        h1 = b(f1);
        h2 = c(f1);
        if (p)
        {
            p = false;
            e();
        }
        for (; !q.isEmpty() && ((r)q.getFirst()).f().getBottom() < h2.a; a((r)q.removeFirst())) { }
        for (; !q.isEmpty() && ((r)q.getLast()).f().getTop() > h2.b; a((r)q.removeLast())) { }
        for (; !q.isEmpty() && c(((r)q.getLast()).f().getTop()) > c.a(); a((r)q.removeLast())) { }
        i1 = j1;
        if (h2.a >= h2.b) goto _L2; else goto _L1
_L1:
        i1 = j1;
        if (c.a() <= 0) goto _L2; else goto _L3
_L3:
        long l2;
        l2 = System.currentTimeMillis();
        f1 = a(h1);
_L9:
        if (!q.isEmpty()) goto _L5; else goto _L4
_L4:
        j1 = c((h2.a + h2.b) / 2);
        i1 = j1;
        if (j1 < c.a()) goto _L7; else goto _L6
_L6:
        j1 = c(h2.a);
        i1 = j1;
        if (j1 < c.a()) goto _L7; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
        double d1;
        if (!q.isEmpty())
        {
            int k1 = b(h2, l2);
            i1 = a(h2, l2);
            int i2 = c(((r)q.getLast()).f().getTop());
            int l1 = c(((r)q.getFirst()).f().getTop());
            c c1;
            if (i1 >= h2.b || i2 >= c.a() - 1)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (k1 <= h2.a || l1 == 0)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (k1 && i1 != 0)
            {
                i1 = 1;
            } else
            {
                e.b();
                i1 = ((flag) ? 1 : 0);
            }
        }
        j.a(f1);
        c1 = j;
        if (f1 > 0.0F)
        {
            d1 = System.currentTimeMillis() - l2;
        } else
        {
            d1 = 0.0D;
        }
        c1.b(d1);
_L2:
        c();
        if (i1 != 0)
        {
            d();
            c.b();
        }
        return;
_L7:
        c(i1, d(i1), h2);
        if (true) goto _L9; else goto _L8
_L8:
    }

    public void a(int i1)
    {
        n = i1;
    }

    public void b()
    {
        p = true;
    }

    public void b(int i1)
    {
        o = i1;
    }

    public int c(int i1)
    {
        return d.b((int)((float)i1 - (b.c() + (float)n)));
    }

    public int d(int i1)
    {
        return (int)((float)d.a(i1) + b.c() + (float)n);
    }

}
