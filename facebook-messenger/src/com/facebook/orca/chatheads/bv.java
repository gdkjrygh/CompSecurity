// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.graphics.PointF;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.google.common.a.es;
import java.util.List;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, ak, bo, ag, 
//            cf, ChatHeadCloseTargetView, d, ef, 
//            dc

class bv
    implements android.view.View.OnTouchListener
{

    final al a;
    private final ag b;
    private GestureDetector c;
    private List d;

    public bv(al al1, ag ag1)
    {
        a = al1;
        super();
        b = ag1;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            if (a.e())
            {
                view = es.a(b);
            } else
            {
                view = al.D(a).e();
            }
            if (view.isEmpty())
            {
                return false;
            }
            c = new GestureDetector(al.c(a), a.b);
            c.setIsLongpressEnabled(false);
            d = view;
            a.b.a(d);
        }
        float f = motionevent.getRawX() - motionevent.getX();
        float f1 = motionevent.getRawY() - motionevent.getY();
        motionevent.offsetLocation(f, f1);
        boolean flag;
        boolean flag1;
        if (c != null && c.onTouchEvent(motionevent))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        motionevent.offsetLocation(-f, -f1);
        if (motionevent.getAction() == 1) goto _L2; else goto _L1
_L1:
        flag1 = flag;
        if (motionevent.getAction() != 3) goto _L3; else goto _L2
_L2:
        al.y(a).removeMessages(12);
        b.c();
        al.E(a);
        a.b.b();
        flag1 = flag;
        if (flag) goto _L3; else goto _L4
_L4:
        flag1 = flag;
        if (!al.j(a)) goto _L3; else goto _L5
_L5:
        al.F(a).e().b();
        al.b(a, false);
        if (b.getActionState() == d.CLOSE)
        {
            al.G(a);
            al.a(a, d);
            al.a(a, "remove", d, "drop_to_close");
            return true;
        }
        if (a.e()) goto _L7; else goto _L6
_L6:
        view = b.getSpringyPositioner();
        motionevent = new PointF();
        view.c(motionevent);
        al.a(a, motionevent);
_L9:
        al.u(a);
        flag1 = true;
_L3:
        return flag1;
_L7:
        if (al.a(a, b, al.H(a)) && al.t(a) != null)
        {
            al.t(a).b().a(new PointF(0.0F, 0.0F));
            al.t(a).c();
        }
        if (true) goto _L9; else goto _L8
_L8:
    }
}
