// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.photos.devicemanagement.DeviceManagementReceiverInternal;
import com.google.android.apps.photos.devicemanagement.DeviceManagementService;

public final class fby
    implements jhl
{

    private DeviceManagementService a;

    public fby(DeviceManagementService devicemanagementservice)
    {
        a = devicemanagementservice;
        super();
    }

    public final long a()
    {
        return DeviceManagementService.b();
    }

    public final void a(Intent intent)
    {
        DeviceManagementReceiverInternal.a(intent);
    }

    public final void b(Intent intent)
    {
        DeviceManagementReceiverInternal.a(intent);
        intent = intent.getStringExtra("extra_original_action");
        fbw fbw1 = (fbw)olm.a(a.getApplicationContext(), fbw);
        if (DeviceManagementService.a(a).a())
        {
            DeviceManagementService.a(a);
            noy.a("originalAction", intent);
        }
        if (DeviceManagementService.a().matchAction(intent))
        {
            if (DeviceManagementService.a(a).a())
            {
                DeviceManagementService.a(a);
            }
            fbw1.a();
        }
    }
}
