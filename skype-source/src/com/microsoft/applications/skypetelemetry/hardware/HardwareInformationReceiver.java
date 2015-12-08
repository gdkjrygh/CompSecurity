// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.applications.skypetelemetry.hardware;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.microsoft.applications.skypetelemetry.hardware:
//            NetworkInformation, DeviceInformation

public class HardwareInformationReceiver extends BroadcastReceiver
{

    private static final String a = com/microsoft/applications/skypetelemetry/hardware/HardwareInformationReceiver.getSimpleName();

    public HardwareInformationReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (s.equals("android.net.conn.CONNECTIVITY_CHANGE"))
        {
            NetworkInformation.a(context);
        } else
        {
            if (s.equals("android.intent.action.ACTION_POWER_CONNECTED") || s.equals("android.intent.action.ACTION_POWER_DISCONNECTED"))
            {
                DeviceInformation.a(intent);
                return;
            }
            if (s.equals("android.intent.action.MEDIA_MOUNTED") || s.equals("android.intent.action.MEDIA_REMOVED"))
            {
                DeviceInformation.a();
                return;
            }
        }
    }

}
