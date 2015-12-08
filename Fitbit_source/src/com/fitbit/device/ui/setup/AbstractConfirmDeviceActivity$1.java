// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup;

import android.content.Intent;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.device.ui.setup:
//            AbstractConfirmDeviceActivity

class a extends c
{

    final AbstractConfirmDeviceActivity a;

    public void a(Intent intent)
    {
        if ("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE".equals(intent.getAction()) && intent.getBooleanExtra("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.ACTION_PERMISSION_RESPONSE_VALUE_KEY", false))
        {
            AbstractConfirmDeviceActivity.a(a);
        }
    }

    (AbstractConfirmDeviceActivity abstractconfirmdeviceactivity)
    {
        a = abstractconfirmdeviceactivity;
        super();
    }
}
