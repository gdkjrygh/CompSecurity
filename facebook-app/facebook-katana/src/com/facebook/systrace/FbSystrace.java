// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.systrace;

import android.os.SystemClock;

// Referenced classes of package com.facebook.systrace:
//            Systrace

class FbSystrace
{

    private static volatile boolean a = false;

    FbSystrace()
    {
    }

    private static long a()
    {
        if (android.os.Build.VERSION.SDK_INT >= 17)
        {
            return SystemClock.elapsedRealtimeNanos();
        } else
        {
            return SystemClock.elapsedRealtime() * 0xf4240L;
        }
    }

    public static long a(long l)
    {
        b();
        return l - a();
    }

    private static void b()
    {
        if (Systrace.b(1L) && !a)
        {
            a = true;
            Systrace.a(1L, "fburl.com/fbsystrace", 1000);
            Systrace.a(1L, "USE fbsystrace", 1000);
            Systrace.a(1L, "DO NOT USE systrace", 1000);
        } else
        if (a && !Systrace.b(1L))
        {
            a = false;
            return;
        }
    }

}
