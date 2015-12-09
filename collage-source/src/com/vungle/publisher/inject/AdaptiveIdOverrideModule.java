// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.inject;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.vungle.publisher.env.AdaptiveDeviceIdStrategy;

// Referenced classes of package com.vungle.publisher.inject:
//            OverrideModule

public class AdaptiveIdOverrideModule
    implements OverrideModule
{

    public AdaptiveIdOverrideModule()
    {
    }

    WifiManager a(Context context)
    {
        return (WifiManager)context.getSystemService("wifi");
    }

    com.vungle.publisher.env.AndroidDevice.DeviceIdStrategy a(AdaptiveDeviceIdStrategy adaptivedeviceidstrategy)
    {
        return adaptivedeviceidstrategy;
    }
}
