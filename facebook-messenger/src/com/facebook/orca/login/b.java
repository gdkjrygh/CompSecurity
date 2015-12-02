// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.login;

import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.facebook.analytics.cb;
import com.facebook.auth.e.a;
import com.facebook.common.hardware.z;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.t;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.prefs.shared.d;

public class b
{

    private d a;
    private TelephonyManager b;
    private WifiManager c;

    public b(d d1, TelephonyManager telephonymanager, WifiManager wifimanager)
    {
        a = d1;
        b = telephonymanager;
        c = wifimanager;
    }

    private boolean a()
    {
        return z.a(b) == 1;
    }

    private boolean b()
    {
        return b.getSimState() == 5;
    }

    private boolean c()
    {
        WifiInfo wifiinfo = c.getConnectionInfo();
        return wifiinfo != null && wifiinfo.getNetworkId() != -1;
    }

    public cb a(String s)
    {
        return a("wildfire_registration", s);
    }

    public cb a(String s, ServiceException serviceexception)
    {
        String s1 = serviceexception.a().toString();
        if (serviceexception.a() == t.API_ERROR)
        {
            serviceexception = (ApiErrorResult)serviceexception.b().i();
            s1 = (new StringBuilder()).append(serviceexception.a()).append("").toString();
        }
        return a(s).b("error_code", s1);
    }

    public cb a(String s, String s1)
    {
        return (cb)(new cb(s)).e("wildfire").h(a.a(a.p, null)).b("step", s1).b("android_version", android.os.Build.VERSION.RELEASE).b("manufacturer", Build.MANUFACTURER).b("device", Build.MODEL).a("is_gsm", a()).a("is_sim_ready", b()).a("is_wifi_connected", c()).a("resume_upload_temporary", "1");
    }

    public cb b(String s)
    {
        return a("wildfire_registration_manual", s);
    }
}
