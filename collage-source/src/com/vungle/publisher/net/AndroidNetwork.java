// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.vungle.log.Logger;
import com.vungle.publisher.co;
import com.vungle.publisher.cp;
import javax.inject.Provider;

public class AndroidNetwork
    implements cp
{

    ConnectivityManager a;
    Provider b;
    TelephonyManager c;

    public AndroidNetwork()
    {
    }

    public final co a()
    {
        Object obj;
        int i;
        try
        {
            obj = a.getActiveNetworkInfo();
        }
        catch (Exception exception)
        {
            Logger.d("VungleNetwork", "error getting connectivity type", exception);
            return null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        i = ((NetworkInfo) (obj)).getType();
        i;
        JVM INSTR lookupswitch 3: default 96
    //                   0: 79
    //                   1: 75
    //                   6: 75;
           goto _L3 _L4 _L5 _L5
_L3:
        Logger.d("VungleNetwork", (new StringBuilder("unknown connectivity type: ")).append(i).toString());
        return null;
_L5:
        return co.b;
_L4:
        obj = co.a;
        return ((co) (obj));
_L2:
        return null;
    }

    public final String b()
    {
        String s;
        try
        {
            s = c.getNetworkOperatorName();
        }
        catch (Exception exception)
        {
            Logger.d("VungleNetwork", "error getting network operator", exception);
            return null;
        }
        return s;
    }
}
