// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.configuration;

import java.lang.reflect.Field;

public class SharedBuildConfig
{

    public static final String APPLICATION_ID = (String)getBuildConfigValue("APPLICATION_ID");
    private static final String BUILD_CONFIG = "com.pinterest.SharedBuildConfig";
    public static final String BUILD_TYPE = (String)getBuildConfigValue("BUILD_TYPE");
    public static final boolean DEBUG = getDebug();
    public static final String FLAVOR = (String)getBuildConfigValue("FLAVOR");
    public static final int VERSION_CODE = getVersionCode();
    public static final String VERSION_NAME = (String)getBuildConfigValue("VERSION_NAME");

    public SharedBuildConfig()
    {
    }

    private static Object getBuildConfigValue(String s)
    {
        try
        {
            s = Class.forName("com.pinterest.SharedBuildConfig").getDeclaredField(s);
            s.setAccessible(true);
            s = ((String) (s.get(null)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    private static boolean getDebug()
    {
        Object obj = getBuildConfigValue("DEBUG");
        if (obj != null && (obj instanceof Boolean))
        {
            return ((Boolean)obj).booleanValue();
        } else
        {
            return false;
        }
    }

    private static int getVersionCode()
    {
        Object obj = getBuildConfigValue("VERSION_CODE");
        if (obj != null && (obj instanceof Integer))
        {
            return ((Integer)obj).intValue();
        } else
        {
            return 0x80000000;
        }
    }

    public static boolean isNonProduction()
    {
        boolean flag1 = false;
label0:
        {
            if (!DEBUG)
            {
                boolean flag = flag1;
                boolean flag2;
                try
                {
                    if (FLAVOR.contains("production"))
                    {
                        break label0;
                    }
                    flag2 = FLAVOR.contains("preinstall");
                }
                catch (Exception exception)
                {
                    return false;
                }
                flag = flag1;
                if (flag2)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

}
