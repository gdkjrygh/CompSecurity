// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.app.Activity;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.view.Window;
import com.google.android.m4b.maps.bj.a;
import com.google.android.m4b.maps.y.i;
import java.io.IOException;
import java.util.Scanner;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            ab

public final class ag
{

    private static final String a = com/google/android/m4b/maps/ay/ag.getSimpleName();

    private ag()
    {
    }

    public static i a(String s)
    {
        i j = i.c(System.getProperty(s));
        Object obj = j;
        if (!j.b())
        {
            try
            {
                s = Runtime.getRuntime().exec(new String[] {
                    "/system/bin/getprop", s
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                if (com.google.android.m4b.maps.ay.ab.a(a, 5))
                {
                    Log.w(a, "Unable to retrieve system property.");
                }
                return i.c();
            }
            obj = (new Scanner(s.getInputStream(), "UTF-8")).useDelimiter("\n");
            if (((Scanner) (obj)).hasNext())
            {
                s = i.b(((Scanner) (obj)).next());
            } else
            {
                s = i.c();
            }
            ((Scanner) (obj)).close();
            obj = s;
        }
        return ((i) (obj));
    }

    public static boolean a()
    {
        boolean flag;
        try
        {
            flag = com.google.android.m4b.maps.bj.a.a();
        }
        catch (Exception exception)
        {
            return false;
        }
        return flag;
    }

    public static boolean a(Activity activity)
    {
        if ((activity.getWindow().getAttributes().flags & 0x1000000) == 0) goto _L2; else goto _L1
_L1:
        int j;
        return true;
_L2:
        if (((j = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 128).flags) & 0x200) != 0) goto _L1; else goto _L3
_L3:
        return false;
        activity;
        if (com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            Log.d(a, "No hardware acceleration detected!");
        }
        return false;
    }

    public static boolean a(Context context)
    {
        boolean flag;
        boolean flag1;
        flag1 = false;
        context = context.getPackageManager().getSystemAvailableFeatures();
        flag = flag1;
        if (context == null) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (context.length <= 0) goto _L2; else goto _L3
_L3:
        int j;
        int k;
        k = context.length;
        j = 0;
_L8:
        flag = flag1;
        if (j >= k) goto _L2; else goto _L4
_L4:
        Object obj = context[j];
        if (((FeatureInfo) (obj)).name != null || ((FeatureInfo) (obj)).reqGlEsVersion < 0x20000) goto _L6; else goto _L5
_L5:
        flag = true;
_L2:
        return flag;
_L6:
        j++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static boolean a(boolean flag)
    {
        if (flag) goto _L2; else goto _L1
_L1:
        if (com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            Log.d(a, "Not using TextureView: No hardware acceleration");
        }
_L4:
        return false;
_L2:
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            if (com.google.android.m4b.maps.ay.ab.a(a, 3))
            {
                Log.d(a, "Not using TextureView: Android version < ICS");
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (!com.google.android.m4b.maps.bj.a.a())
        {
            break MISSING_BLOCK_LABEL_82;
        }
        if (!com.google.android.m4b.maps.ay.ab.a(a, 3))
        {
            continue; /* Loop/switch isn't completed */
        }
        Log.d(a, "Not using TextureView: Emulator");
        return false;
        Exception exception;
        exception;
        if (android.os.Build.VERSION.SDK_INT < 16)
        {
            if (com.google.android.m4b.maps.ay.ab.a(a, 3))
            {
                Log.d(a, "Not using TextureView: Android version < JB");
                return false;
            }
        } else
        {
            if (com.google.android.m4b.maps.ay.ab.a(a, 3))
            {
                Log.d(a, "Using texture view!");
            }
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
