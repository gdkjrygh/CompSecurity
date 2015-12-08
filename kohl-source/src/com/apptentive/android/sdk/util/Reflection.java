// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;

import android.os.Build;
import com.apptentive.android.sdk.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection
{

    public Reflection()
    {
    }

    public static String getBootloaderVersion()
    {
        String s;
        try
        {
            s = (String)android/os/Build.getField("BOOTLOADER").get(null);
        }
        catch (Exception exception)
        {
            return null;
        }
        return s;
    }

    public static String getRadioVersion()
    {
        String s;
        try
        {
            s = android/os/Build.getMethod("getRadioVersion", new Class[0]).invoke(null, new Object[0]).toString();
            Log.v("Build.getRadioVersion() = %s", new Object[] {
                s
            });
        }
        catch (Exception exception)
        {
            String s1;
            try
            {
                Log.v("Build.RADIO = %s", new Object[] {
                    (String)android/os/Build.getField("RADIO").get(null)
                });
                s1 = (String)android/os/Build.getField("RADIO").get(null);
            }
            catch (Exception exception1)
            {
                return null;
            }
            return s1;
        }
        return s;
    }
}
