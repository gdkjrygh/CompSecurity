// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.facebook.n.c;
import com.facebook.n.g;
import com.facebook.n.j;
import com.facebook.orca.chatheads.b.k;
import com.google.common.a.es;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.chatheads:
//            bp, ag, al, cf, 
//            ChatHeadCloseTargetView, ef, d, ak, 
//            dc, br, bq

class bo extends android.view.GestureDetector.SimpleOnGestureListener
{

    final al a;
    private final g b = com.facebook.n.g.a(200D, 9D);
    private final g c = com.facebook.n.g.a(100D, 7D);
    private float d;
    private float e;
    private es f;
    private c g;
    private float h;
    private float i;
    private PointF j;
    private PointF k;
    private int l;

    public bo(al al1, j j1)
    {
        a = al1;
        super();
        j = new PointF();
        k = new PointF();
        g = j1.b().a(b).a(new bp(this, al1));
    }

    static void a(bo bo1)
    {
        bo1.d();
    }

    static c b(bo bo1)
    {
        return bo1.g;
    }

    private void d()
    {
        if (f.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1 = (ag)f.get(0);
        int i1 = (int)(h - d);
        int j1 = (int)(i - e);
        ChatHeadCloseTargetView chatheadclosetargetview = al.F(a).e();
        chatheadclosetargetview.a(j);
        Object obj = j;
        obj.x = ((PointF) (obj)).x - (float)(al.h(a) / 2);
        obj = j;
        obj.y = ((PointF) (obj)).y - (float)(al.I(a) / 2);
        double d1 = g.c();
        i1 = (int)((double)j.x * d1 + (1.0D - d1) * (double)i1);
        double d2 = j.y;
        j1 = (int)((1.0D - d1) * (double)j1 + d2 * d1);
        k.x = i1;
        k.y = j1;
        ((ag) (obj1)).getSpringyPositioner().b(k);
        int k1 = al.h(a) / 2;
        int l1 = al.I(a) / 2;
        obj = d.NONE;
        if (chatheadclosetargetview.c(k1 + i1, j1 + l1))
        {
            obj = d.CLOSE;
        }
        if (obj != ((ag) (obj1)).getActionState())
        {
            if (obj == d.CLOSE)
            {
                ((ag) (obj1)).performHapticFeedback(0);
            }
            obj1 = f.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                ((ag)((Iterator) (obj1)).next()).setActionState(((d) (obj)));
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private ag e()
    {
        return (ag)f.get(0);
    }

    public void a(Collection collection)
    {
        f = es.a(collection);
        al.a(a, (ag)f.get(0));
        collection = com.facebook.orca.chatheads.al.k(a).getThreadViewSpec();
        l = al.D(a).e(collection);
    }

    public boolean a()
    {
        return f != null && !f.isEmpty();
    }

    public void b()
    {
        al.a(a, null);
        f = es.d();
        g.b(0.0D);
        al.F(a).e().setOnCloseBaublePositionListener(null);
    }

    public void c()
    {
        g.a();
    }

    public boolean onDown(MotionEvent motionevent)
    {
        ef ef1 = e().getSpringyPositioner();
        al.y(a).sendEmptyMessageDelayed(12, com.facebook.orca.chatheads.al.k());
        PointF pointf = new PointF();
        ef1.c(pointf);
        h = motionevent.getX();
        i = motionevent.getY();
        d = h - pointf.x;
        e = i - pointf.y;
        g.a(0.0D).i();
        ef1.c();
        e().d();
        al.b(a, false);
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        if (e().getActionState() == d.CLOSE)
        {
            return false;
        }
        al.y(a).removeMessages(12);
        if (al.a(a, motionevent1, f1, f2))
        {
            e().c();
            al.a(a, "remove", f, "fling_to_close");
            motionevent = f.iterator();
            do
            {
                if (!motionevent.hasNext())
                {
                    break;
                }
                motionevent1 = (ag)motionevent.next();
                al.a(a, motionevent1, f1, f2);
                if (al.a(a, motionevent1, al.H(a)) && al.t(a) != null)
                {
                    al.t(a).b().b(new PointF(f1, f2), f1, f2);
                }
            } while (true);
            al.F(a).e().e();
            if (a.e() && !al.l(a))
            {
                al.N(a);
            }
            al.u(a);
            return true;
        }
        g.b(0.0D);
        al.F(a).e().b();
        motionevent = al.M(a);
        int i1 = al.D(a).e(e().getThreadViewSpec());
        motionevent1 = e().getSpringyPositioner();
        if (!a.e())
        {
            int j1 = com.facebook.orca.chatheads.al.c(a).getResources().getDisplayMetrics().widthPixels;
            int k1 = al.h(a);
            PointF pointf = new PointF();
            motionevent1.c(pointf);
            float f3 = (float)(j1 - k1) * 0.25F;
            float f4 = pointf.x;
            f3 = Math.min(Math.max(-f3, f4 + f1 * 0.17F), f3 + (float)j1);
            f4 = (f3 - pointf.x) / 0.17F / f1;
            float f5 = pointf.y;
            al.a(a, new PointF(f3, f4 * f2 * 0.17F + f5));
        }
        motionevent1 = (ag)f.get(0);
        motionevent = motionevent.a(i1);
        motionevent1.getSpringyPositioner().a(motionevent, f1, f2);
        al.u(a);
        if (al.a(a, motionevent1, al.H(a)) && al.t(a) != null)
        {
            al.t(a).b().a(new PointF(0.0F, 0.0F), f1, f2);
            al.t(a).c();
        }
        return true;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        al.a(a, "long_click", e().getThreadViewSpec());
        if (!a.e())
        {
            al.J(a);
            al.K(a);
        }
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        motionevent = e();
        al.y(a).removeMessages(12);
        h = motionevent1.getX();
        i = motionevent1.getY();
        boolean flag = al.a(a, motionevent, al.H(a));
        motionevent1 = al.F(a).e();
        if (!com.facebook.orca.chatheads.al.j(a))
        {
            al.b(a, true);
            al.A(a).f();
            al.L(a);
            al.G(a);
            motionevent.c();
            if (flag && al.t(a) != null)
            {
                al.t(a).d();
                Object obj = motionevent.getThreadViewSpec();
                int i1 = al.D(a).e(((com.facebook.messages.threads.model.ThreadViewSpec) (obj)));
                obj = al.M(a).a(i1);
                al.t(a).b().a(motionevent.getSpringyPositioner(), new PointF(-((PointF) (obj)).x, -((PointF) (obj)).y));
            }
            motionevent1.setOnCloseBaublePositionListener(new bq(this));
        }
        f1 = h - d;
        f2 = i - e;
        float f3 = (float)(al.h(a) / 2) + f1;
        float f4 = (float)(al.I(a) / 2) + f2;
        motionevent1.a(f3, f4);
        if (a.e())
        {
            int j1 = Math.max(0, Math.min(al.a(a, f1, f2), al.D(a).b() - 1));
            if (j1 != l)
            {
                al.a(a, motionevent, j1);
                l = j1;
            }
        }
        if (motionevent1.b(f3, f4))
        {
            g.a(b).b(1.0D);
        } else
        {
            g.a(c).b(0.0D);
        }
        d();
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        motionevent = e().getThreadViewSpec();
        if (motionevent != null)
        {
            e().c();
            al.b(a, motionevent, "chathead_click");
        }
        al.F(a).e().b();
        return true;
    }
}
