// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedAction;

public final class PlatformDependent
{

    private static final int ANDROID_API_VERSION;
    public static final int ANDROID_API_VERSION_IS_NOT_ANDROID = 0;
    private static final boolean IS_ANDROID;

    public PlatformDependent()
    {
    }

    public static int getAndroidApiVersion()
    {
        return ANDROID_API_VERSION;
    }

    static ClassLoader getSystemClassLoader()
    {
        if (System.getSecurityManager() == null)
        {
            return ClassLoader.getSystemClassLoader();
        } else
        {
            return (ClassLoader)AccessController.doPrivileged(new PrivilegedAction() {

                public ClassLoader run()
                {
                    return ClassLoader.getSystemClassLoader();
                }

                public volatile Object run()
                {
                    return run();
                }

            });
        }
    }

    public static boolean isAndroid()
    {
        return IS_ANDROID;
    }

    private static int resolveAndroidApiVersion()
    {
        int i;
        try
        {
            i = ((Integer)Class.forName("android.os.Build$VERSION", true, getSystemClassLoader()).getField("SDK_INT").get(null)).intValue();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    static 
    {
        ANDROID_API_VERSION = resolveAndroidApiVersion();
        boolean flag;
        if (ANDROID_API_VERSION != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_ANDROID = flag;
    }
}
