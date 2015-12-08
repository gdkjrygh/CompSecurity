// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.graphics.Matrix;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;

// Referenced classes of package com.roidapp.baselib.view:
//            DraggableGridView, d

final class c
    implements Runnable
{

    final DraggableGridView a;

    c(DraggableGridView draggablegridview)
    {
        a = draggablegridview;
        super();
    }

    public final void run()
    {
label0:
        {
            if (DraggableGridView.p(a) != null)
            {
                DraggableGridView.p(a).setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                DraggableGridView.q(a).set(DraggableGridView.p(a).getImageMatrix());
                if (a.c <= 0.1F)
                {
                    break label0;
                }
                if (a.c >= 0.9999F)
                {
                    DraggableGridView.r(a).width = DraggableGridView.p(a).getWidth();
                    DraggableGridView.r(a).height = DraggableGridView.p(a).getHeight();
                    DisplayMetrics displaymetrics = new DisplayMetrics();
                    DraggableGridView.s(a).getDefaultDisplay().getMetrics(displaymetrics);
                    DraggableGridView.r(a).x = a.a[0] - DraggableGridView.r(a).width / 2;
                    DraggableGridView.r(a).y = Math.min(a.a[1] - DraggableGridView.r(a).height / 2, displaymetrics.heightPixels - DraggableGridView.r(a).height);
                    a.b[0] = a.a[0] - DraggableGridView.r(a).x - DraggableGridView.r(a).width / 2;
                    a.b[1] = a.a[1] - DraggableGridView.r(a).y - DraggableGridView.r(a).height / 2;
                    DraggableGridView.s(a).updateViewLayout(DraggableGridView.p(a), DraggableGridView.r(a));
                }
                DraggableGridView.q(a).setScale(a.c, a.c, DraggableGridView.p(a).getWidth() / 2 + a.b[0], DraggableGridView.p(a).getHeight() / 2 + a.b[1]);
                DraggableGridView.p(a).setImageMatrix(DraggableGridView.q(a));
                DraggableGridView.j(a).postDelayed(DraggableGridView.t(a), 50L);
                DraggableGridView draggablegridview = a;
                draggablegridview.c = draggablegridview.c * 0.8F;
            }
            return;
        }
        DraggableGridView.j(a).removeCallbacks(DraggableGridView.t(a));
        if (DraggableGridView.p(a) != null)
        {
            try
            {
                DraggableGridView.s(a).removeView(DraggableGridView.p(a));
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                illegalargumentexception.printStackTrace();
            }
            DraggableGridView.u(a);
        }
        if (DraggableGridView.v(a) != null)
        {
            DraggableGridView.v(a).a();
        }
        a.c = 1.0F;
    }
}
