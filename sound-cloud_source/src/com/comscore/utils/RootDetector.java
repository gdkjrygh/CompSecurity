// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.os.Build;
import java.io.File;

public class RootDetector
{

    public RootDetector()
    {
    }

    private static boolean a()
    {
        String s = Build.TAGS;
        return s != null && s.contains("test-keys");
    }

    private static boolean b()
    {
        boolean flag;
        try
        {
            flag = (new File("/system/app/Superuser.apk")).exists();
        }
        catch (Exception exception)
        {
            return false;
        }
label0:
        {
            if (flag)
            {
                return true;
            }
            break label0;
        }
    }

    public static boolean isDeviceRooted()
    {
        while (a() || b()) 
        {
            return true;
        }
        return false;
    }
}
