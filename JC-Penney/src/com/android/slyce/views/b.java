// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.views;

import android.graphics.Paint;
import android.os.Handler;

// Referenced classes of package com.android.slyce.views:
//            CustomCircleProgressWidgetExtraAnimationsAll

class b
    implements Runnable
{

    final CustomCircleProgressWidgetExtraAnimationsAll a;

    b(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        a = customcircleprogresswidgetextraanimationsall;
        super();
    }

    public void run()
    {
        if (a.b < a.l + 25 && a.n)
        {
            CustomCircleProgressWidgetExtraAnimationsAll.d(a).setStrokeWidth(a.b);
            a.b = a.b + 3;
            a.a = a.a + 3;
        } else
        {
            a.n = false;
        }
        if (a.b > a.m && !a.n)
        {
            CustomCircleProgressWidgetExtraAnimationsAll.d(a).setStrokeWidth(a.b);
            a.b = a.b - 4;
            a.a = a.a - 4;
            CustomCircleProgressWidgetExtraAnimationsAll.a(a, CustomCircleProgressWidgetExtraAnimationsAll.e(a) - 2.0F);
            CustomCircleProgressWidgetExtraAnimationsAll.f(a).setStrokeWidth(CustomCircleProgressWidgetExtraAnimationsAll.e(a));
        }
        a.invalidate();
        a.k.postDelayed(this, 15L);
    }
}
