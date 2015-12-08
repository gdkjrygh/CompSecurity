// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.env;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.vungle.log.Logger;
import com.vungle.publisher.async.ScheduledPriorityExecutor;
import com.vungle.publisher.bw;
import com.vungle.publisher.event.EventBus;

// Referenced classes of package com.vungle.publisher.env:
//            AndroidDevice

public class AdvertisingDeviceIdStrategy extends AndroidDevice.DeviceIdStrategy
{

    protected Context c;
    protected EventBus d;
    protected ScheduledPriorityExecutor e;

    public AdvertisingDeviceIdStrategy()
    {
    }

    protected boolean a(AndroidDevice androiddevice)
    {
        return androiddevice.b();
    }

    protected boolean b(AndroidDevice androiddevice)
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        String s;
        if (!androiddevice.b("VungleDevice"))
        {
            break MISSING_BLOCK_LABEL_117;
        }
        Logger.d("VungleDevice", "fetching advertising ID and ad tracking preference");
        info = AdvertisingIdClient.getAdvertisingIdInfo(c);
        s = info.getId();
        boolean flag;
        if (!info.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            Logger.d("VungleDevice", (new StringBuilder("advertising ID ")).append(s).append("; ad tracking enabled ").append(flag).toString());
            androiddevice.d = s;
            if (androiddevice.b() && (AndroidDevice.a(androiddevice.e) || androiddevice.l()))
            {
                androiddevice.d();
                androiddevice.k();
            }
            androiddevice.e();
            androiddevice.c = flag;
        }
        catch (Exception exception)
        {
            Logger.w("VungleDevice", "error fetching advertising ID and ad tracking preference", exception);
        }
        try
        {
            flag = androiddevice.b();
        }
        // Misplaced declaration of an exception variable
        catch (AndroidDevice androiddevice)
        {
            Logger.w("VungleDevice", "error verifying advertising ID", androiddevice);
            return false;
        }
        return flag;
    }

    protected final void c(AndroidDevice androiddevice)
    {
        e.a(new _cls1(androiddevice), com.vungle.publisher.async.ScheduledPriorityExecutor.b.a);
    }

    protected final void d(AndroidDevice androiddevice)
    {
        boolean flag;
        if (!a(androiddevice))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (b(androiddevice) && flag)
        {
            d.a(new bw());
        }
    }

    /* member class not found */
    class _cls1 {}

}
