// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.views;

import android.os.Handler;

// Referenced classes of package com.android.slyce.views:
//            CustomCircleProgressWidgetExtraAnimationsAll, c

class a
    implements Runnable
{

    final CustomCircleProgressWidgetExtraAnimationsAll a;

    a(CustomCircleProgressWidgetExtraAnimationsAll customcircleprogresswidgetextraanimationsall)
    {
        a = customcircleprogresswidgetextraanimationsall;
        super();
    }

    public void run()
    {
        a.i = a.i + CustomCircleProgressWidgetExtraAnimationsAll.a(a);
        if (a.i > 60F)
        {
            a.i = a.i + 0.2F;
        }
        if (a.i > 140F)
        {
            a.i = a.i + 0.4F;
        }
        if (a.i > 190F)
        {
            a.i = a.i + 0.5F;
        }
        if (a.i > 360F && !CustomCircleProgressWidgetExtraAnimationsAll.b(a))
        {
            if (CustomCircleProgressWidgetExtraAnimationsAll.c(a) != null)
            {
                CustomCircleProgressWidgetExtraAnimationsAll.c(a).a();
            }
            a.a();
            CustomCircleProgressWidgetExtraAnimationsAll.a(a, true);
        }
        a.setProgress(a.i);
        a.invalidate();
        a.h.postDelayed(this, 20L);
    }
}
