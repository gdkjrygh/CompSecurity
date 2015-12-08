// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import fs.ch.qos.logback.core.Context;
import java.net.URL;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;

// Referenced classes of package fs.ch.qos.logback.core.util:
//            OptionHelper

public class Loader
{

    private static boolean HAS_GET_CLASS_LOADER_PERMISSION = false;
    private static boolean ignoreTCL = false;

    public Loader()
    {
    }

    public static ClassLoader getClassLoaderOfClass(Class class1)
    {
        ClassLoader classloader = class1.getClassLoader();
        class1 = classloader;
        if (classloader == null)
        {
            class1 = ClassLoader.getSystemClassLoader();
        }
        return class1;
    }

    public static ClassLoader getClassLoaderOfObject(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException("Argument cannot be null");
        } else
        {
            return getClassLoaderOfClass(obj.getClass());
        }
    }

    public static URL getResource(String s, ClassLoader classloader)
    {
        try
        {
            s = classloader.getResource(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static URL getResourceBySelfClassLoader(String s)
    {
        return getResource(s, getClassLoaderOfClass(fs/ch/qos/logback/core/util/Loader));
    }

    public static ClassLoader getTCL()
    {
        return Thread.currentThread().getContextClassLoader();
    }

    public static Class loadClass(String s)
        throws ClassNotFoundException
    {
        if (ignoreTCL)
        {
            return Class.forName(s);
        }
        Class class1;
        try
        {
            class1 = getTCL().loadClass(s);
        }
        catch (Throwable throwable)
        {
            return Class.forName(s);
        }
        return class1;
    }

    public static Class loadClass(String s, Context context)
        throws ClassNotFoundException
    {
        return getClassLoaderOfObject(context).loadClass(s);
    }

    static 
    {
        String s = OptionHelper.getSystemProperty("logback.ignoreTCL", null);
        if (s != null)
        {
            ignoreTCL = OptionHelper.toBoolean(s, true);
        }
        HAS_GET_CLASS_LOADER_PERMISSION = ((Boolean)AccessController.doPrivileged(new PrivilegedAction() {

            public Boolean run()
            {
                try
                {
                    AccessController.checkPermission(new RuntimePermission("getClassLoader"));
                }
                catch (AccessControlException accesscontrolexception)
                {
                    return Boolean.valueOf(false);
                }
                return Boolean.valueOf(true);
            }

            public volatile Object run()
            {
                return run();
            }

        })).booleanValue();
    }
}
