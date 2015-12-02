// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.Display;
import android.view.MotionEvent;
import android.view.WindowManager;
import com.facebook.analytics.h.e;
import com.facebook.base.activity.a;
import com.facebook.base.activity.h;

// Referenced classes of package com.facebook.analytics:
//            bt, ci

public class bx extends a
{

    final bt a;

    public bx(bt bt1)
    {
        a = bt1;
        super();
    }

    public void a(Activity activity)
    {
        com.facebook.analytics.bt.a(a, (h)activity);
    }

    public void a(Activity activity, Configuration configuration)
    {
        com.facebook.analytics.bt.a(a, bt.b(a).getDefaultDisplay().getRotation(), false);
    }

    public void a(Activity activity, MotionEvent motionevent)
    {
        a.d();
    }

    public void b(Activity activity)
    {
        bt.b(a, (h)activity);
        if (!(activity instanceof ci))
        {
            com.facebook.analytics.bt.a(a, null);
        }
        com.facebook.analytics.bt.a(a, activity);
        bt.b(a, activity.getApplicationContext());
        com.facebook.analytics.bt.a(a, bt.b(a).getDefaultDisplay().getRotation(), true);
    }

    public void c(Activity activity)
    {
        com.facebook.analytics.bt.a(a, e.BACKGROUNDED, false);
        bt.c(a, (h)activity);
    }

    public void d(Activity activity)
    {
        bt.d(a, (h)activity);
    }

    public void e(Activity activity)
    {
        a.d();
    }
}
