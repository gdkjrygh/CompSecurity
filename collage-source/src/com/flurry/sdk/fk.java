// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.content.Context;
import android.telephony.TelephonyManager;

// Referenced classes of package com.flurry.sdk:
//            fp

public class fk
{

    private static fk a;
    private static final String b = com/flurry/sdk/fk.getSimpleName();

    private fk()
    {
    }

    public static fk a()
    {
        com/flurry/sdk/fk;
        JVM INSTR monitorenter ;
        fk fk1;
        if (a == null)
        {
            a = new fk();
        }
        fk1 = a;
        com/flurry/sdk/fk;
        JVM INSTR monitorexit ;
        return fk1;
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
        TelephonyManager telephonymanager = (TelephonyManager)fp.a().c().getSystemService("phone");
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
        TelephonyManager telephonymanager = (TelephonyManager)fp.a().c().getSystemService("phone");
        if (telephonymanager == null)
        {
            return null;
        } else
        {
            return telephonymanager.getNetworkOperator();
        }
    }

}
