// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.helpers;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;

// Referenced classes of package org.apache.log4j.helpers:
//            OptionConverter, LogLog

public class Loader
{

    static Class class$java$lang$Thread;
    static Class class$org$apache$log4j$helpers$Loader;
    private static boolean ignoreTCL = false;
    private static boolean java1 = true;

    public Loader()
    {
    }

    private static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new NoClassDefFoundError(s.getMessage());
        }
        return s;
    }

    public static URL getResource(String s)
    {
        Object obj;
        if (java1)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        obj = getTCL();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        LogLog.debug("Trying to find [" + s + "] using context classloader " + obj + ".");
        obj = ((ClassLoader) (obj)).getResource(s);
        if (obj != null)
        {
            return ((URL) (obj));
        }
        if (class$org$apache$log4j$helpers$Loader != null) goto _L2; else goto _L1
_L1:
        obj = _mthclass$("org.apache.log4j.helpers.Loader");
        class$org$apache$log4j$helpers$Loader = ((Class) (obj));
_L7:
        obj = ((Class) (obj)).getClassLoader();
        if (obj == null) goto _L4; else goto _L3
_L3:
        LogLog.debug("Trying to find [" + s + "] using " + obj + " class loader.");
        obj = ((ClassLoader) (obj)).getResource(s);
        if (obj != null) goto _L5; else goto _L4
_L4:
        LogLog.debug("Trying to find [" + s + "] using ClassLoader.getSystemResource().");
        return ClassLoader.getSystemResource(s);
_L2:
        try
        {
            obj = class$org$apache$log4j$helpers$Loader;
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            LogLog.warn("Caught Exception while in Loader.getResource. This may be innocuous.", ((Throwable) (obj)));
        }
        if (true) goto _L4; else goto _L5
_L5:
        return ((URL) (obj));
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static ClassLoader getTCL()
        throws IllegalAccessException, InvocationTargetException
    {
        Object obj;
        if (class$java$lang$Thread != null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        obj = _mthclass$("java.lang.Thread");
        class$java$lang$Thread = ((Class) (obj));
_L1:
        obj = ((Class) (obj)).getMethod("getContextClassLoader", null);
        return (ClassLoader)((Method) (obj)).invoke(Thread.currentThread(), null);
        try
        {
            obj = class$java$lang$Thread;
        }
        catch (NoSuchMethodException nosuchmethodexception)
        {
            return null;
        }
          goto _L1
    }

    public static Class loadClass(String s)
        throws ClassNotFoundException
    {
        if (java1 || ignoreTCL)
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

    static 
    {
        String s = OptionConverter.getSystemProperty("java.version", null);
        if (s != null)
        {
            int i = s.indexOf('.');
            if (i != -1 && s.charAt(i + 1) != '1')
            {
                java1 = false;
            }
        }
        s = OptionConverter.getSystemProperty("log4j.ignoreTCL", null);
        if (s != null)
        {
            ignoreTCL = OptionConverter.toBoolean(s, true);
        }
    }
}
