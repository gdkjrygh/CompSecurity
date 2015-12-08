// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.multipledevice;

import android.content.Intent;
import com.fitbit.e.a;
import com.fitbit.util.threading.c;

// Referenced classes of package com.fitbit.multipledevice:
//            a

class nit> extends c
{

    final com.fitbit.multipledevice.a a;

    protected void a(Intent intent)
    {
        intent = intent.getAction();
        if ("SavedState.GalileoState.ACTION_USE_BLUETOOTH_OPTION_CHANGED".equals(intent))
        {
            com.fitbit.e.a.a("MultipleDeviceController", "'Use bluetooth' option changed", new Object[0]);
            a.b();
        } else
        {
            if ("com.fitbit.FitbitMobile.BluetoothSupportStatusController.ACTION_SUPPORT_STATUS_CHANGED".equals(intent))
            {
                com.fitbit.e.a.a("MultipleDeviceController", "Bluetooth support status changed", new Object[0]);
                a.b();
                return;
            }
            if ("com.fitbit.FitbitMobile.ChinaConfirmationDialogController.BLUETOOTH_ACTION_PERMISSION_RESPONSE".equals(intent))
            {
                com.fitbit.e.a.a("MultipleDeviceController", "China Bluetooth permission changed", new Object[0]);
                a.b();
                return;
            }
        }
    }

    (com.fitbit.multipledevice.a a1)
    {
        a = a1;
        super();
    }
}
