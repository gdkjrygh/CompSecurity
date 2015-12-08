// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.os.Handler;
import android.view.View;
import android.widget.Scroller;

// Referenced classes of package com.roidapp.baselib.view:
//            DraggableGridView

final class b
    implements Runnable
{

    final DraggableGridView a;

    b(DraggableGridView draggablegridview)
    {
        a = draggablegridview;
        super();
    }

    public final void run()
    {
        View view;
        int i;
        i = DraggableGridView.e(a) - DraggableGridView.f(a);
        if (i < 0 && DraggableGridView.f(a) > DraggableGridView.g(a))
        {
            i = -DraggableGridView.h(a);
            DraggableGridView.j(a).postDelayed(DraggableGridView.i(a), 25L);
        } else
        if (i > 0 && DraggableGridView.f(a) < DraggableGridView.k(a))
        {
            i = DraggableGridView.h(a);
            DraggableGridView.j(a).postDelayed(DraggableGridView.i(a), 25L);
        } else
        {
            i = 0;
            DraggableGridView.j(a).removeCallbacks(DraggableGridView.i(a));
        }
        if (i == 0) goto _L2; else goto _L1
_L1:
        view = a.getChildAt(DraggableGridView.l(a) - a.getFirstVisiblePosition());
        if (android.os.Build.VERSION.SDK_INT < 11 || view == null) goto _L4; else goto _L3
_L3:
        a.smoothScrollToPositionFromTop(DraggableGridView.l(a), i + view.getTop());
_L6:
        if (view != null)
        {
            view.getHitRect(DraggableGridView.n(a));
        }
        DraggableGridView.a(a, DraggableGridView.o(a), DraggableGridView.f(a));
_L2:
        return;
_L4:
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            a.smoothScrollBy(-i, 200);
        } else
        if (view != null)
        {
            int j = view.getTop();
            DraggableGridView.m(a).startScroll(DraggableGridView.m(a).getFinalX(), DraggableGridView.m(a).getFinalY(), DraggableGridView.m(a).getFinalX(), i + j + DraggableGridView.m(a).getFinalY());
            a.postInvalidate();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
