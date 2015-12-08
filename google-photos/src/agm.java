// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;

public final class agm extends android.view.GestureDetector.SimpleOnGestureListener
{

    private agd a;

    public agm(agd agd1)
    {
        a = agd1;
        super();
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public final void onLongPress(MotionEvent motionevent)
    {
        Object obj;
        obj = a.a(motionevent);
        if (obj != null)
        {
            obj = a.n.a(((android.view.View) (obj)));
            break MISSING_BLOCK_LABEL_29;
        }
_L1:
        return;
        if (obj != null && agj.a(a.j, a.n, ((afn) (obj))) && lt.b(motionevent, 0) == a.i)
        {
            int i = lt.a(motionevent, a.i);
            float f = lt.c(motionevent, i);
            float f1 = lt.d(motionevent, i);
            a.c = f;
            a.d = f1;
            motionevent = a;
            a.f = 0.0F;
            motionevent.e = 0.0F;
            if (a.j.d())
            {
                a.a(((afn) (obj)), 2);
                return;
            }
        }
          goto _L1
    }
}
