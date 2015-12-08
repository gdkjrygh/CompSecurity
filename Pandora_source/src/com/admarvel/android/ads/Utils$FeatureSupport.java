// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.pm.PackageManager;

// Referenced classes of package com.admarvel.android.ads:
//            Utils, Version

private static class 
{

    public static boolean testFeature(Context context, String s)
    {
        context = context.getPackageManager();
        if (s.equals("camera"))
        {
            return context.hasSystemFeature("android.hardware.camera");
        }
        if (Version.getAndroidSDKVersion() >= 8)
        {
            if (s.equals("location"))
            {
                return context.hasSystemFeature("android.hardware.location");
            }
            if (s.equals("accelerometer"))
            {
                return context.hasSystemFeature("android.hardware.sensor.accelerometer");
            }
            if (s.equals("compass"))
            {
                return context.hasSystemFeature("android.hardware.sensor.compass");
            }
        }
        return false;
    }

    private ()
    {
    }
}
