// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import com.pandora.radio.util.b;
import com.yume.android.sdk.YuMeSDKInterface;

// Referenced classes of package com.pandora.android.ads:
//            s

public static class Interface extends b
{

    private static volatile s a = null;

    public static s a()
    {
        com/pandora/android/ads/s$b;
        JVM INSTR monitorenter ;
        s s1;
        if (a == null)
        {
            a = new s(null);
        }
        s1 = a;
        com/pandora/android/ads/s$b;
        JVM INSTR monitorexit ;
        return s1;
        Exception exception;
        exception;
        com/pandora/android/ads/s$b;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void b()
    {
        a();
    }

    public static void c()
    {
        if (a != null && s.a(a))
        {
            try
            {
                s.f().YuMeSDK_DeInit();
            }
            catch (Exception exception)
            {
                s.a(a, "Error with YuMe deinit", exception);
            }
            s.a(null);
            s.a(a, false);
        }
    }


    public Interface()
    {
    }
}
