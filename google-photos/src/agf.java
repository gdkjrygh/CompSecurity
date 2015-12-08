// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.List;

final class agf
    implements afb
{

    private agd a;

    agf(agd agd1)
    {
        a = agd1;
        super();
    }

    public final boolean onInterceptTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        int i;
        a.s.onTouchEvent(motionevent);
        i = lt.a(motionevent);
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_336;
        }
        a.i = lt.b(motionevent, 0);
        a.c = motionevent.getX();
        a.d = motionevent.getY();
        recyclerview = a;
        if (((agd) (recyclerview)).p != null)
        {
            ((agd) (recyclerview)).p.recycle();
        }
        recyclerview.p = VelocityTracker.obtain();
        if (a.b != null) goto _L2; else goto _L1
_L1:
        agd agd1 = a;
        if (agd1.l.isEmpty()) goto _L4; else goto _L3
_L3:
        android.view.View view;
        view = agd1.a(motionevent);
        i = agd1.l.size() - 1;
_L8:
        if (i < 0) goto _L4; else goto _L5
_L5:
        recyclerview = (agn)agd1.l.get(i);
        if (((agn) (recyclerview)).e.a != view) goto _L7; else goto _L6
_L6:
        if (recyclerview != null)
        {
            agd agd2 = a;
            agd2.c = agd2.c - ((agn) (recyclerview)).j;
            agd2 = a;
            agd2.d = agd2.d - ((agn) (recyclerview)).k;
            a.a(((agn) (recyclerview)).e, true);
            if (a.a.remove(((agn) (recyclerview)).e.a))
            {
                a.j.b(a.n, ((agn) (recyclerview)).e);
            }
            a.a(((agn) (recyclerview)).e, ((agn) (recyclerview)).f);
            agd.a(a, motionevent, a.k, 0);
        }
_L2:
        if (a.p != null)
        {
            a.p.addMovement(motionevent);
        }
        int j;
        return a.b != null;
_L7:
        i--;
          goto _L8
_L4:
        recyclerview = null;
          goto _L6
        if (i == 3 || i == 1)
        {
            a.i = -1;
            a.a(null, 0);
        } else
        if (a.i != -1)
        {
            j = lt.a(motionevent, a.i);
            if (j >= 0)
            {
                agd.a(a, i, motionevent, j);
            }
        }
          goto _L2
    }

    public final void onRequestDisallowInterceptTouchEvent(boolean flag)
    {
        if (!flag)
        {
            return;
        } else
        {
            a.a(null, 0);
            return;
        }
    }

    public final void onTouchEvent(RecyclerView recyclerview, MotionEvent motionevent)
    {
        int i;
        i = 0;
        a.s.onTouchEvent(motionevent);
        if (a.p != null)
        {
            a.p.addMovement(motionevent);
        }
        if (a.i != -1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int j;
        int k;
        j = lt.a(motionevent);
        k = lt.a(motionevent, a.i);
        if (k >= 0)
        {
            agd.a(a, j, motionevent, k);
        }
        recyclerview = a.b;
        if (recyclerview == null) goto _L1; else goto _L3
_L3:
        switch (j)
        {
        case 4: // '\004'
        case 5: // '\005'
        default:
            return;

        case 1: // '\001'
        case 3: // '\003'
            if (a.p != null)
            {
                a.p.computeCurrentVelocity(1000, a.n.t);
            }
            a.a(null, 0);
            a.i = -1;
            return;

        case 2: // '\002'
            if (k >= 0)
            {
                agd.a(a, motionevent, a.k, k);
                agd.a(a, recyclerview);
                a.n.removeCallbacks(a.o);
                a.o.run();
                a.n.invalidate();
                return;
            }
            break;

        case 6: // '\006'
            j = lt.b(motionevent);
            continue; /* Loop/switch isn't completed */
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (lt.b(motionevent, j) != a.i) goto _L1; else goto _L5
_L5:
        if (a.p != null)
        {
            a.p.computeCurrentVelocity(1000, a.n.t);
        }
        if (j == 0)
        {
            i = 1;
        }
        a.i = lt.b(motionevent, i);
        agd.a(a, motionevent, a.k, j);
        return;
    }
}
