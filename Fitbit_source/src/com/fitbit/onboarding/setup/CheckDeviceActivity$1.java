// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.setup;

import com.fitbit.data.bl.bl;
import com.fitbit.home.ui.g;

// Referenced classes of package com.fitbit.onboarding.setup:
//            CheckDeviceActivity

class a
    implements Runnable
{

    final CheckDeviceActivity a;

    public void run()
    {
        CheckDeviceActivity.a(a).a(bl.a(a, true));
    }

    (CheckDeviceActivity checkdeviceactivity)
    {
        a = checkdeviceactivity;
        super();
    }
}
