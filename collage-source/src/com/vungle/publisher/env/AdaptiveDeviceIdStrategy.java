// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.env;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import com.vungle.log.Logger;

// Referenced classes of package com.vungle.publisher.env:
//            AdvertisingDeviceIdStrategy, AndroidDevice

public class AdaptiveDeviceIdStrategy extends AdvertisingDeviceIdStrategy
{

    Context a;
    WifiManager b;

    public AdaptiveDeviceIdStrategy()
    {
    }

    protected final boolean a(AndroidDevice androiddevice)
    {
        return androiddevice.f();
    }

    protected final boolean b(AndroidDevice androiddevice)
    {
        Object obj;
        boolean flag;
        try
        {
            flag = super.b(androiddevice);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Logger.w("VungleDevice", ((Throwable) (obj)));
            return androiddevice.f();
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        Logger.v("VungleDevice", "have advertising ID - not fetching fallback device IDs");
        return flag;
        Logger.d("VungleDevice", "ensuring fallback device IDs");
        if (AndroidDevice.a(androiddevice.e)) goto _L2; else goto _L1
_L1:
        obj = android.provider.Settings.Secure.getString(a.getContentResolver(), "android_id");
        Logger.d("VungleDevice", (new StringBuilder("fetched android ID ")).append(((String) (obj))).toString());
        if (!androiddevice.b()) goto _L4; else goto _L3
_L3:
        Logger.w("VungleDevice", "have advertising id - not setting androidId");
_L7:
        obj = androiddevice.j();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_269;
        }
        obj = b.getConnectionInfo();
        if (obj != null) goto _L6; else goto _L5
_L5:
        Logger.d("VungleDevice", "unable to get MAC address - not connected");
_L8:
        return true;
_L4:
        Logger.d("VungleDevice", (new StringBuilder("setting android ID ")).append(((String) (obj))).toString());
        androiddevice.e = ((String) (obj));
        androiddevice.e();
          goto _L7
_L2:
        Logger.v("VungleDevice", (new StringBuilder("existing android ID ")).append(androiddevice.c()).toString());
          goto _L7
_L6:
        obj = ((WifiInfo) (obj)).getMacAddress();
        Logger.d("VungleDevice", (new StringBuilder("fetched MAC address ")).append(((String) (obj))).toString());
        if (!androiddevice.b())
        {
            break MISSING_BLOCK_LABEL_240;
        }
        Logger.w("VungleDevice", "have advertising id - not setting mac address");
          goto _L8
        obj;
        Logger.d("VungleDevice", "unable to get MAC address - no ACCESS_WIFI_STATE permission");
          goto _L8
        Logger.d("VungleDevice", (new StringBuilder("setting MAC address ")).append(((String) (obj))).toString());
        androiddevice.f = ((String) (obj));
          goto _L8
        Logger.v("VungleDevice", (new StringBuilder("existing MAC address ")).append(((String) (obj))).toString());
          goto _L8
    }
}
