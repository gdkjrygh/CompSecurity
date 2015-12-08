// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bx;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.widget.TextView;
import com.google.android.m4b.maps.ao.a;
import com.google.android.m4b.maps.bi.b;
import com.google.android.m4b.maps.bi.c;
import com.google.android.m4b.maps.bl.f;
import com.google.android.m4b.maps.bo.ah;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cf.g;
import com.google.android.m4b.maps.cg.bc;
import com.google.android.m4b.maps.cg.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.m4b.maps.bx:
//            at, ac, aq, af, 
//            ar, l, ai, r, 
//            p, ah, w, g, 
//            ak, v, x, d

public class ao extends at
    implements af.b, aq.b
{
    public static interface a
    {

        public abstract boolean a();
    }

    public static interface b
    {

        public abstract void a(com.google.android.m4b.maps.bo.g g1);

        public abstract void b(com.google.android.m4b.maps.bo.g g1);
    }


    public ai a;
    public b b;
    public a c;
    public aq d;
    public p e;
    public af f;
    private final ac n = new ac();
    private final Resources o;
    private f p;
    private r q;
    private boolean r;
    private c s;
    private long t;
    private boolean u;
    private g v;
    private q w;
    private com.google.android.m4b.maps.bx.g x;

    public ao(Context context, Resources resources, TextView textview, q q1, e e1, com.google.android.m4b.maps.bw.g g1, bc bc1)
    {
        super(context);
        t = 0x8000000000000000L;
        u = false;
        o = resources;
        w = q1;
        v = null;
        super.m = true;
        d = new aq(this);
        p = new f();
        p.a(getContext(), d);
        setFocusable(true);
        setClickable(true);
        float f1 = o.getDisplayMetrics().density;
        f = new af(getContext(), this);
        context = new ArrayList();
        if (com.google.android.m4b.maps.ao.a.a())
        {
            context.add(new ar.a(8, 8, 8, 0, 16, 8));
        }
        context.add(new ar.a(5, 6, 5, 0, 16, 8));
        context.add(new ar.a(5, 6, 5, 0, 16, 0));
        for (resources = context.iterator(); resources.hasNext();)
        {
            ((ar.a)resources.next()).g = false;
        }

        context = new ar((ar.a[])context.toArray(new ar.a[context.size()]));
        super.a();
        super.j = context;
        resources = new com.google.android.m4b.maps.bi.b(com.google.android.m4b.maps.bi.b.a, 256, 256, f1, (byte)0);
        if (bc1 == null)
        {
            context = com.google.android.m4b.maps.bx.l.a(ah.a, o, e1, g1);
        } else
        {
            context = com.google.android.m4b.maps.bx.l.a(ah.a, bc1.a(), o, e1, g1);
        }
        a = new ai(f, o, resources, context, textview, g1);
        context = a;
        super.a();
        if (super.j == null)
        {
            super.j = new at.i(this);
        }
        if (super.k == null)
        {
            super.k = new at.c(this, (byte)0);
        }
        if (super.l == null)
        {
            super.l = new at.e((byte)0);
        }
        super.i = context;
        super.h = new at.g(super.g);
        super.h.start();
        super.h.a(0);
    }

    private float b()
    {
        return o.getDisplayMetrics().density;
    }

    public final boolean A()
    {
        return d.a.e;
    }

    public final Bitmap a(Bitmap bitmap)
    {
        synchronized (a)
        {
            s();
            bitmap = a.a(bitmap);
        }
        return bitmap;
        bitmap;
        ai1;
        JVM INSTR monitorexit ;
        throw bitmap;
    }

    public final ak a(r.a a1)
    {
        return a.a(a1);
    }

    public void a()
    {
        a.b();
    }

    public void a(float f1, float f2)
    {
    }

    public final void a(com.google.android.m4b.maps.bx.g g1)
    {
        if (a != null)
        {
            a.g = g1;
        }
        x = g1;
    }

    public final void a(r r1)
    {
        a.a(r1);
    }

    public final void a(v v1, x x1)
    {
        r = true;
        a.a(v1, x1);
    }

    public void a(boolean flag, boolean flag1)
    {
        f.a(flag, flag1);
    }

    public final boolean a(MotionEvent motionevent)
    {
        com.google.android.m4b.maps.bi.b b1 = null;
        if (e == null)
        {
            return false;
        }
        com.google.android.m4b.maps.bp.b b2 = a.f;
        if (b2.m_() && b2.d(motionevent.getX(), motionevent.getY(), null))
        {
            a(false, true);
            return true;
        }
        ArrayList arraylist = a.d();
        for (int i = arraylist.size() - 1; i >= 0;)
        {
            r r1 = (r)arraylist.get(i);
            com.google.android.m4b.maps.bi.b b4 = b1;
            if (r1.m_())
            {
                com.google.android.m4b.maps.bi.b b3 = b1;
                if (b1 == null)
                {
                    b3 = new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
                }
                b4 = b3;
                if (r1.d(motionevent.getX(), motionevent.getY(), b3))
                {
                    a(false, true);
                    return true;
                }
            }
            i--;
            b1 = b4;
        }

        return false;
    }

    public final void b(float f1, float f2)
    {
        if (e != null)
        {
            com.google.android.m4b.maps.bi.b b1 = new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
            ArrayList arraylist = a.d();
            int i = arraylist.size() - 1;
            while (i >= 0) 
            {
                r r1 = (r)arraylist.get(i);
                if (r1.c(f1, f2, b1))
                {
                    q = r1;
                    s();
                    return;
                }
                i--;
            }
        }
    }

    public final void b(r r1)
    {
        a.b(r1);
        if (q == r1)
        {
            q();
        }
    }

    public final boolean c(float f1, float f2)
    {
        com.google.android.m4b.maps.bo.g g1 = null;
        if (e == null)
        {
            return false;
        }
        ArrayList arraylist = a.d();
        int i = arraylist.size();
        Object obj = a.f;
        if (((com.google.android.m4b.maps.bp.b) (obj)).m_() && ((com.google.android.m4b.maps.bp.b) (obj)).b(f1, f2, null, null))
        {
            a(false, true);
            return true;
        }
        obj = null;
        for (i--; i >= 0;)
        {
            r r1 = (r)arraylist.get(i);
            com.google.android.m4b.maps.bo.g g2 = g1;
            com.google.android.m4b.maps.bi.b b2 = ((com.google.android.m4b.maps.bi.b) (obj));
            if (r1.m_())
            {
                com.google.android.m4b.maps.bi.b b1 = ((com.google.android.m4b.maps.bi.b) (obj));
                if (obj == null)
                {
                    b1 = new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
                    g1 = b1.b(f1, f2);
                }
                g2 = g1;
                b2 = b1;
                if (r1.b(f1, f2, g1, b1))
                {
                    return true;
                }
            }
            i--;
            g1 = g2;
            obj = b2;
        }

        return false;
    }

    public final void d(float f1, float f2)
    {
        if (e == null)
        {
            return;
        }
        com.google.android.m4b.maps.bi.b b1 = new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
        com.google.android.m4b.maps.bo.g g1 = b1.b(f1, f2);
        boolean flag2 = false;
        boolean flag3 = r;
        if (a.f != null)
        {
            flag2 = a.f.a(f1, f2, g1, b1);
        }
        boolean flag = flag2;
        if (!flag2)
        {
            flag = flag2;
            if (a.e != null)
            {
                flag = a.e.a(f1, f2, g1, b1);
            }
        }
        flag2 = flag;
        if (c != null)
        {
            flag2 = flag;
            if (!flag)
            {
                flag2 = c.a();
            }
        }
        ArrayList arraylist = a.d();
        int j = arraylist.size();
        ArrayList arraylist1 = new ArrayList();
        int i = j - 1;
        flag = flag2;
        while (!flag && i >= 0) 
        {
            r r2 = (r)arraylist.get(i);
            if (r2.m())
            {
                arraylist1.add((w)r2);
            } else
            if (arraylist1.isEmpty() && r2 != a.e && r2.a(f1, f2, g1, b1))
            {
                flag = true;
            }
            i--;
        }
        flag2 = flag;
        if (!flag)
        {
            flag2 = flag;
            if (!arraylist1.isEmpty())
            {
                if (!flag3 || !e.c.equals(s))
                {
                    n.a = true;
                }
                flag2 = flag;
                if (n.a(f1, f2, b1, arraylist1))
                {
                    flag2 = true;
                }
            }
        }
        if (!flag2)
        {
            w.a();
        }
        i = j - 1;
        while (!flag2 && i >= 0) 
        {
            r r1 = (r)arraylist.get(i);
            boolean flag1;
            if (!r1.m() && r1 != a.e && r1.a(f1, f2, g1, b1))
            {
                flag1 = true;
            } else
            {
                flag1 = flag2;
            }
            i--;
            flag2 = flag1;
        }
        if (!flag2 && b != null)
        {
            b.b(g1);
        }
        s = e.c;
        s();
    }

    public final void d(boolean flag)
    {
        d.a(flag);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
    }

    public final void e(boolean flag)
    {
        d.b(flag);
    }

    public final boolean e(float f1, float f2)
    {
        if (e != null && a.e != null)
        {
            com.google.android.m4b.maps.bi.b b1 = new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
            b1.b(f1, f2);
            return a.e.a_(f1, f2, b1);
        } else
        {
            return false;
        }
    }

    public final void f(float f1, float f2)
    {
        boolean flag1 = false;
        if (e == null)
        {
            return;
        }
        com.google.android.m4b.maps.bi.b b1 = new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
        com.google.android.m4b.maps.bo.g g1 = b1.b(f1, f2);
        ArrayList arraylist;
        int i;
        boolean flag;
        if (a.e != null)
        {
            flag = a.e.b(f1, f2, b1);
        } else
        {
            flag = false;
        }
        if (c != null && !flag)
        {
            flag = flag1;
        }
        arraylist = a.d();
        i = arraylist.size() - 1;
        do
        {
label0:
            {
                boolean flag2 = flag;
                if (i >= 0)
                {
                    r r1 = (r)arraylist.get(i);
                    if (r1 == a.e || !r1.b(f1, f2, b1))
                    {
                        break label0;
                    }
                    flag2 = true;
                }
                if (!flag2 && b != null)
                {
                    b.a(g1);
                }
                s();
                return;
            }
            i--;
        } while (true);
    }

    public final void f(boolean flag)
    {
        d.c(flag);
    }

    public final void g(boolean flag)
    {
        d.d(flag);
    }

    public Resources getResources()
    {
        return o;
    }

    public boolean isOpaque()
    {
        return true;
    }

    public final d n()
    {
        return a.c();
    }

    public final void o()
    {
        r = false;
        a.e.c();
    }

    public void onFinishInflate()
    {
        super.onFinishInflate();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (isEnabled() && isClickable())
        {
            p.a(motionevent);
            return true;
        } else
        {
            return false;
        }
    }

    public void onWindowFocusChanged(boolean flag)
    {
        super.onWindowFocusChanged(flag);
        ai ai1 = a;
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ai1.a(flag);
    }

    public final com.google.android.m4b.maps.bi.b p()
    {
        return new com.google.android.m4b.maps.bi.b(e.c, getWidth(), getHeight(), b());
    }

    public final void q()
    {
        if (q != null)
        {
            q.i_();
            q = null;
            s();
        }
    }

    public final p r()
    {
        return e;
    }

    public final void s()
    {
        if (x != null)
        {
            x.c();
        }
        super.s();
    }

    public final void t()
    {
        if (x != null)
        {
            x.b();
        }
    }

    public final void u()
    {
        q();
        f.c();
        super.u();
        com.google.android.m4b.maps.bh.a a1 = com.google.android.m4b.maps.bh.a.a();
        if (a1 != null && a != null)
        {
            a1.b(a.c);
        }
    }

    public final void v()
    {
        super.v();
        f.b();
    }

    public final void w()
    {
        long l1 = SystemClock.uptimeMillis();
        if (l1 - t < 20000L)
        {
            a.b(true);
        } else
        {
            a.b(false);
        }
        t = l1;
    }

    public final boolean x()
    {
        return d.a.a;
    }

    public final boolean y()
    {
        return d.a.b;
    }

    public final boolean z()
    {
        return d.a.d;
    }
}
