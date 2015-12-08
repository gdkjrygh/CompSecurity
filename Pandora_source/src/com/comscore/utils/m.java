// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import android.os.Build;
import java.io.File;

public class m
{

    public static boolean a()
    {
        while (b() || c()) 
        {
            return true;
        }
        return false;
    }

    private static boolean b()
    {
        String s = Build.TAGS;
        return s != null && s.contains("test-keys");
    }

    private static boolean c()
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
}
