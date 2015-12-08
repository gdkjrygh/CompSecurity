// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.os.StrictMode;
import android.util.Log;
import com.google.android.m4b.maps.ay.ab;

class az
{

    private static final String a = com/google/android/m4b/maps/cg/az.getSimpleName();

    private az()
    {
    }

    public static Object a()
    {
        if (d())
        {
            if (ab.a(a, 5))
            {
                Log.w(a, "Suppressed StrictMode policy violation: StrictModeDiskReadViolation");
            }
            return StrictMode.allowThreadDiskReads();
        } else
        {
            return null;
        }
    }

    public static void a(Object obj)
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && obj != null)
        {
            StrictMode.setThreadPolicy((android.os.StrictMode.ThreadPolicy)obj);
        }
    }

    public static Object b()
    {
        if (d())
        {
            if (ab.a(a, 5))
            {
                Log.w(a, "Suppressed StrictMode policy violation: StrictModeDiskWriteViolation");
            }
            return StrictMode.allowThreadDiskWrites();
        } else
        {
            return null;
        }
    }

    public static Object c()
    {
        Object obj = a();
        b();
        return obj;
    }

    private static boolean d()
    {
        return android.os.Build.VERSION.SDK_INT == 21 || android.os.Build.VERSION.SDK_INT == 22;
    }

}
