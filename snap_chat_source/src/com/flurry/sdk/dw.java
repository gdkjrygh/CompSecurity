// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.os.Looper;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.GooglePlayServicesUtil;
import java.io.IOException;

// Referenced classes of package com.flurry.sdk:
//            do, el

public class dw
{

    private static final String a = com/flurry/sdk/dw.getSimpleName();

    public dw()
    {
    }

    public static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info a()
    {
        com/flurry/sdk/dw;
        JVM INSTR monitorenter ;
        if (Looper.getMainLooper().getThread() == Thread.currentThread())
        {
            throw new IllegalStateException("Must be called from a background thread!");
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        com/flurry/sdk/dw;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag = b();
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        info = null;
_L1:
        com/flurry/sdk/dw;
        JVM INSTR monitorexit ;
        return info;
        info = c();
          goto _L1
    }

    public static boolean b()
    {
        int i;
        try
        {
            i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(com.flurry.sdk.do.a().b());
        }
        catch (Exception exception)
        {
            el.d(a, (new StringBuilder("Google Play Services not available - ")).append(exception).toString());
            return false;
        }
        if (i == 0)
        {
            return true;
        }
        el.d(a, (new StringBuilder("Google Play Services not available - connection result: ")).append(i).toString());
        return false;
    }

    private static com.google.android.gms.ads.identifier.AdvertisingIdClient.Info c()
    {
        com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info;
        try
        {
            info = AdvertisingIdClient.getAdvertisingIdInfo(com.flurry.sdk.do.a().b());
        }
        catch (IOException ioexception)
        {
            el.a(6, a, (new StringBuilder("Exception in readAdvertisingInfo():")).append(ioexception).toString());
            return null;
        }
        catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
        {
            el.a(6, a, (new StringBuilder("Exception in readAdvertisingInfo():")).append(googleplayservicesnotavailableexception).toString());
            return null;
        }
        catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
        {
            el.a(6, a, (new StringBuilder("Exception in readAdvertisingInfo():")).append(googleplayservicesrepairableexception).toString());
            return null;
        }
        return info;
    }

}
