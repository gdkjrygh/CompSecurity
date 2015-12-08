// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.setup;

import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.home.ui.f;

// Referenced classes of package com.fitbit.onboarding.setup:
//            CheckDeviceActivity

private class <init>
    implements f
{

    final CheckDeviceActivity a;

    public void a(Exception exception)
    {
        if (exception instanceof IncorrectTimestampException)
        {
            CheckDeviceActivity.g(a);
            return;
        } else
        {
            com.fitbit.onboarding.setup.CheckDeviceActivity.f(a);
            return;
        }
    }

    public void c()
    {
        a.e();
    }

    public void d()
    {
    }

    public void h()
    {
    }

    private ception(CheckDeviceActivity checkdeviceactivity)
    {
        a = checkdeviceactivity;
        super();
    }

    a(CheckDeviceActivity checkdeviceactivity, a a1)
    {
        this(checkdeviceactivity);
    }
}
