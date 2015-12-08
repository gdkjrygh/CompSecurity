// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            a, az, fi, m, 
//            n

public class l extends a
{

    public l(a.a a1, Activity activity, az az1)
    {
        super(a1, activity);
        activity.addContentView(new View(activity), new android.widget.TableLayout.LayoutParams(-1, -1));
        a.setRequestedOrientation(b.c());
        a1 = fi.a(activity, az1.r(), az1.t(), b);
        a1.setOnDismissListener(new m(this));
        a1.setOnCancelListener(new n(this));
        activity = az1.t().a(ea.b.N);
        if (activity != null)
        {
            b.a(activity);
        }
        a1.show();
    }

    public void c()
    {
    }

    public void h()
    {
        super.h();
        if (b.d() != -1)
        {
            a.setRequestedOrientation(b.d());
        }
    }

    public a.b l()
    {
        return a.b.c;
    }
}
