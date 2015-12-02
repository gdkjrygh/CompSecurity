// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.zero.server;

import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.facebook.common.hardware.k;
import com.facebook.zero.protocol.CarrierAndSimMccMnc;

// Referenced classes of package com.facebook.zero.server:
//            c

public class d
{

    private final TelephonyManager a;
    private final k b;

    public d(TelephonyManager telephonymanager, k k1)
    {
        a = telephonymanager;
        b = k1;
    }

    private com.facebook.zero.protocol.CarrierAndSimMccMnc.MccMncPair a(String s)
    {
        if (s != null && s.length() > 3)
        {
            return new com.facebook.zero.protocol.CarrierAndSimMccMnc.MccMncPair(s.substring(0, 3), s.substring(3));
        } else
        {
            return new com.facebook.zero.protocol.CarrierAndSimMccMnc.MccMncPair("0", "0");
        }
    }

    public CarrierAndSimMccMnc a()
    {
        return new CarrierAndSimMccMnc(a(a.getNetworkOperator()), a(a.getSimOperator()));
    }

    public c b()
    {
        NetworkInfo networkinfo = b.c();
        int i = 8;
        if (networkinfo != null)
        {
            i = networkinfo.getType();
        }
        return c.a(i);
    }
}
