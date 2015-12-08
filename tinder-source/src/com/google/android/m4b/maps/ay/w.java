// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.m4b.maps.ae.c;
import com.google.android.m4b.maps.ap.e;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            z

public final class w
{

    public static boolean a;
    public static volatile boolean b;
    public static volatile boolean c;
    public static volatile int d;
    public static volatile float e;
    public static volatile float f;
    public static volatile float g;
    public static volatile z h;
    public static volatile e i;
    public static boolean j;

    public static PackageInfo a(Context context, String s)
    {
        context = context.getPackageManager();
        try
        {
            context = context.getPackageInfo(s, 0);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new AssertionError(context);
        }
        return context;
    }

    public static boolean a()
    {
        return d > 200;
    }

    public static boolean a(String s)
    {
        return s == null || s.length() == 0;
    }

    public static int b()
    {
        return com.google.android.m4b.maps.ae.c.a(20D * (double)e);
    }

    public static String c()
    {
        String s1 = Build.MANUFACTURER;
        String s2 = Build.DEVICE;
        String s = Build.MODEL;
        s1 = String.valueOf(s1.replace('-', '_'));
        s2 = String.valueOf(s2.replace('-', '_'));
        s = String.valueOf(s.replace('-', '_'));
        s1 = (new StringBuilder(String.valueOf(s1).length() + 10 + String.valueOf(s2).length() + String.valueOf(s).length())).append("android:").append(s1).append("-").append(s2).append("-").append(s).toString();
        s = s1;
        if (j)
        {
            s = String.valueOf(s1).concat("-wear");
        }
        return s;
    }
}
