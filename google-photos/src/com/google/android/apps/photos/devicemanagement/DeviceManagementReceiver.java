// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.devicemanagement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.apps.photos.devicemanagement:
//            DeviceManagementReceiverInternal

public class DeviceManagementReceiver extends BroadcastReceiver
{

    public DeviceManagementReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        DeviceManagementReceiverInternal.b(context, intent);
    }
}
