// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mraid;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;

// Referenced classes of package com.mopub.mraid:
//            MraidController, ah, MraidBridge

final class o
    implements Runnable
{

    final View a;
    final Runnable b;
    final MraidController c;

    o(MraidController mraidcontroller, View view, Runnable runnable)
    {
        c = mraidcontroller;
        a = view;
        b = runnable;
        super();
    }

    public final void run()
    {
        DisplayMetrics displaymetrics = MraidController.d(c).getResources().getDisplayMetrics();
        MraidController.h(c).a(displaymetrics.widthPixels, displaymetrics.heightPixels);
        int ai[] = new int[2];
        android.view.ViewGroup viewgroup = MraidController.i(c);
        if (viewgroup != null)
        {
            viewgroup.getLocationOnScreen(ai);
            MraidController.h(c).a(ai[0], ai[1], viewgroup.getWidth(), viewgroup.getHeight());
            MraidController.j(c).getLocationOnScreen(ai);
            MraidController.h(c).c(ai[0], ai[1], MraidController.j(c).getWidth(), MraidController.j(c).getHeight());
            a.getLocationOnScreen(ai);
            MraidController.h(c).b(ai[0], ai[1], a.getWidth(), a.getHeight());
            MraidController.c(c).notifyScreenMetrics(MraidController.h(c));
            if (MraidController.b(c).d())
            {
                MraidController.b(c).notifyScreenMetrics(MraidController.h(c));
            }
            if (b != null)
            {
                b.run();
                return;
            }
        }
    }
}
