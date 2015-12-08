// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.os.Looper;
import com.google.android.gms.ads.a.a;
import com.google.android.gms.common.c;
import com.google.android.gms.common.d;
import com.google.android.gms.common.e;
import java.io.IOException;

// Referenced classes of package com.flurry.sdk:
//            do, eo

public class dw
{

    private static final String a = com/flurry/sdk/dw.getSimpleName();

    public dw()
    {
    }

    public static com.google.android.gms.ads.a.a.a a()
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
        com.google.android.gms.ads.a.a.a a1;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        a1 = null;
_L1:
        com/flurry/sdk/dw;
        JVM INSTR monitorexit ;
        return a1;
        a1 = c();
          goto _L1
    }

    public static boolean b()
    {
        int i;
        try
        {
            i = e.a(com.flurry.sdk.do.a().b());
        }
        catch (Exception exception)
        {
            com.flurry.sdk.eo.d(a, (new StringBuilder("Google Play Services not available - ")).append(exception).toString());
            return false;
        }
        if (i == 0)
        {
            return true;
        }
        com.flurry.sdk.eo.d(a, (new StringBuilder("Google Play Services not available - connection result: ")).append(i).toString());
        return false;
    }

    private static com.google.android.gms.ads.a.a.a c()
    {
        com.google.android.gms.ads.a.a.a a1;
        try
        {
            a1 = com.google.android.gms.ads.a.a.a(com.flurry.sdk.do.a().b());
        }
        catch (IOException ioexception)
        {
            com.flurry.sdk.eo.a(6, a, (new StringBuilder("Exception in readAdvertisingInfo():")).append(ioexception).toString());
            return null;
        }
        catch (c c1)
        {
            com.flurry.sdk.eo.a(6, a, (new StringBuilder("Exception in readAdvertisingInfo():")).append(c1).toString());
            return null;
        }
        catch (d d1)
        {
            com.flurry.sdk.eo.a(6, a, (new StringBuilder("Exception in readAdvertisingInfo():")).append(d1).toString());
            return null;
        }
        return a1;
    }

}
