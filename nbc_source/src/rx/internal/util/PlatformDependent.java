// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.security.AccessController;
import java.security.PrivilegedAction;

public final class PlatformDependent
{

    private static final boolean IS_ANDROID = isAndroid0();

    public PlatformDependent()
    {
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

    private static boolean isAndroid0()
    {
        try
        {
            Class.forName("android.app.Application", false, getSystemClassLoader());
        }
        catch (Exception exception)
        {
            return false;
        }
        return true;
    }

}
