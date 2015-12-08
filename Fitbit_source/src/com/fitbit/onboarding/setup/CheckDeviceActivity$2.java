// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.setup;

import android.os.Handler;
import android.widget.ProgressBar;

// Referenced classes of package com.fitbit.onboarding.setup:
//            CheckDeviceActivity

class a
    implements Runnable
{

    final CheckDeviceActivity a;

    public void run()
    {
        if (!CheckDeviceActivity.b(a))
        {
            CheckDeviceActivity.a(a, 4);
            if (CheckDeviceActivity.c(a) > 100)
            {
                CheckDeviceActivity.b(a, 100);
            }
            a.c.setProgress(CheckDeviceActivity.c(a));
            CheckDeviceActivity.e(a).postDelayed(CheckDeviceActivity.d(a), 40L);
        }
    }

    (CheckDeviceActivity checkdeviceactivity)
    {
        a = checkdeviceactivity;
        super();
    }
}
