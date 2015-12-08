// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package com.flurry.sdk:
//            jo

public class jj
{

    private static jj a;
    private static final String b = com/flurry/sdk/jj.getSimpleName();

    private jj()
    {
    }

    public static jj a()
    {
        com/flurry/sdk/jj;
        JVM INSTR monitorenter ;
        jj jj1;
        if (a == null)
        {
            a = new jj();
        }
        jj1 = a;
        com/flurry/sdk/jj;
        JVM INSTR monitorexit ;
        return jj1;
        Exception exception;
        exception;
        throw exception;
    }

    public static void b()
    {
        a = null;
    }

    public String c()
    {
        TelephonyManager telephonymanager = (TelephonyManager)jo.a().c().getSystemService("phone");
        if (telephonymanager == null)
        {
            return null;
        } else
        {
            return telephonymanager.getNetworkOperatorName();
        }
    }

    public String d()
    {
        TelephonyManager telephonymanager = (TelephonyManager)jo.a().c().getSystemService("phone");
        if (telephonymanager == null)
        {
            return null;
        } else
        {
            return telephonymanager.getNetworkOperator();
        }
    }

}
