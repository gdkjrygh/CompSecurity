// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view.fragments;

import android.view.MotionEvent;
import android.view.View;
import com.malinskiy.superrecyclerview.SuperRecyclerView;

// Referenced classes of package com.cardinalblue.android.piccollage.view.fragments:
//            q

class nit> extends android.view.ureDetector.SimpleOnGestureListener
{

    final q a;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (f1 <= 100F) goto _L2; else goto _L1
_L1:
        if (!q.a(a) && q.b(a).getVisibility() == 8)
        {
            q.b(a).startAnimation(q.c(a));
        }
_L4:
        return super.onFling(motionevent, motionevent1, f, f1);
_L2:
        if (f1 < -100F && !q.a(a) && q.b(a).getVisibility() == 0)
        {
            q.b(a).startAnimation(q.d(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        View view;
        view = a.k.getChildAt(0);
        if (view == null)
        {
            return false;
        }
        if (f1 <= 0.0F) goto _L2; else goto _L1
_L1:
        if (q.b(a).getVisibility() == 0)
        {
            q.e(a);
        }
        if (q.f(a) >= 3F && (double)view.getTop() < (double)a.k.getPaddingTop() * 0.10000000000000001D && !q.a(a) && q.b(a).getVisibility() == 0)
        {
            q.b(a).startAnimation(q.d(a));
        }
_L4:
        return super.onScroll(motionevent, motionevent1, f, f1);
_L2:
        if (q.b(a).getVisibility() == 8)
        {
            q.g(a);
        }
        if (q.f(a) <= -3F && !q.a(a) && q.b(a).getVisibility() == 8)
        {
            q.b(a).startAnimation(q.c(a));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (q q1)
    {
        a = q1;
        super();
    }
}
