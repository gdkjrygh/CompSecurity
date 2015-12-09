// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.details;

import android.graphics.drawable.TransitionDrawable;
import android.support.v7.app.ActionBar;
import android.widget.ScrollView;

// Referenced classes of package com.fitbit.sleep.ui.details:
//            SleepLoggingDetailsActivity

class a
    implements android.view.edListener
{

    final SleepLoggingDetailsActivity a;

    public void onScrollChanged()
    {
        int i = SleepLoggingDetailsActivity.a(a).getScrollY();
        if (!SleepLoggingDetailsActivity.b(a) || i > 5) goto _L2; else goto _L1
_L1:
        SleepLoggingDetailsActivity.c(a).reverseTransition(250);
        SleepLoggingDetailsActivity.a(a, false);
_L4:
        ActionBar actionbar = a.getSupportActionBar();
        if (actionbar != null)
        {
            actionbar.setElevation(Math.min(SleepLoggingDetailsActivity.g(), Math.max(SleepLoggingDetailsActivity.h(), i)));
        }
        return;
_L2:
        if (!SleepLoggingDetailsActivity.b(a) && i > 5)
        {
            SleepLoggingDetailsActivity.c(a).startTransition(250);
            SleepLoggingDetailsActivity.a(a, true);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    (SleepLoggingDetailsActivity sleeploggingdetailsactivity)
    {
        a = sleeploggingdetailsactivity;
        super();
    }
}
