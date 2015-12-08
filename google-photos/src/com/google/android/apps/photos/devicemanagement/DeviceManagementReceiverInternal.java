// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.devicemanagement;

import android.content.Context;
import android.content.Intent;
import ez;
import noy;
import noz;

// Referenced classes of package com.google.android.apps.photos.devicemanagement:
//            DeviceManagementService

public final class DeviceManagementReceiverInternal extends ez
{

    public DeviceManagementReceiverInternal()
    {
    }

    static void b(Context context, Intent intent)
    {
        if (noz.a(context, 3, "PhotosDeviceMgmt", new String[0]).a())
        {
            noy.a("intent", intent);
        }
        Intent intent1 = new Intent(context, com/google/android/apps/photos/devicemanagement/DeviceManagementService);
        intent1.putExtra("extra_original_action", intent.getAction());
        a(context, intent1);
    }

    public final void onReceive(Context context, Intent intent)
    {
        b(context, intent);
    }
}
