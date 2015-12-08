// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.util;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.android.SystemPropertiesProxy;
import fs.ch.qos.logback.core.spi.ContextAware;
import fs.ch.qos.logback.core.spi.PropertyContainer;
import fs.ch.qos.logback.core.spi.ScanException;
import fs.ch.qos.logback.core.subst.NodeToStringTransformer;
import java.lang.reflect.Constructor;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

// Referenced classes of package fs.ch.qos.logback.core.util:
//            IncompatibleClassException, DynamicClassLoadingException, Loader

public class OptionHelper
{

    public static String getAndroidSystemProperty(String s)
    {
        try
        {
            s = SystemPropertiesProxy.getInstance().get(s, null);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String getEnv(String s)
    {
        try
        {
            s = System.getenv(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String getSystemProperty(String s)
    {
        String s1;
        String s2;
        try
        {
            s2 = System.getProperty(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        s1 = s2;
        if (s2 != null)
        {
            break MISSING_BLOCK_LABEL_16;
        }
        s1 = getAndroidSystemProperty(s);
        return s1;
    }

    public static String getSystemProperty(String s, String s1)
    {
        try
        {
            s = System.getProperty(s, s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
        return s;
    }

    public static Object instantiateByClassName(String s, Class class1, Context context)
        throws IncompatibleClassException, DynamicClassLoadingException
    {
        return instantiateByClassName(s, class1, Loader.getClassLoaderOfObject(context));
    }

    public static Object instantiateByClassName(String s, Class class1, ClassLoader classloader)
        throws IncompatibleClassException, DynamicClassLoadingException
    {
        return instantiateByClassNameAndParameter(s, class1, classloader, null, null);
    }

    public static Object instantiateByClassNameAndParameter(String s, Class class1, ClassLoader classloader, Class class2, Object obj)
        throws IncompatibleClassException, DynamicClassLoadingException
    {
        if (s == null)
        {
            throw new NullPointerException();
        }
        try
        {
            classloader = classloader.loadClass(s);
            if (!class1.isAssignableFrom(classloader))
            {
                throw new IncompatibleClassException(class1, classloader);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new DynamicClassLoadingException((new StringBuilder()).append("Failed to instantiate type ").append(s).toString(), class1);
        }
        if (class2 != null)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        return classloader.newInstance();
        class1 = ((Class) (classloader.getConstructor(new Class[] {
            class2
        }).newInstance(new Object[] {
            obj
        })));
        return class1;
    }

    public static boolean isEmpty(String s)
    {
        return s == null || "".equals(s);
    }

    public static void setSystemProperties(ContextAware contextaware, Properties properties)
    {
        String s;
        for (Iterator iterator = properties.keySet().iterator(); iterator.hasNext(); setSystemProperty(contextaware, s, properties.getProperty(s)))
        {
            s = (String)iterator.next();
        }

    }

    public static void setSystemProperty(ContextAware contextaware, String s, String s1)
    {
        try
        {
            System.setProperty(s, s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            contextaware.addError((new StringBuilder()).append("Failed to set system property [").append(s).append("]").toString(), s1);
        }
    }

    public static String substVars(String s, PropertyContainer propertycontainer, PropertyContainer propertycontainer1)
    {
        String s1;
        String s2;
        try
        {
            s2 = NodeToStringTransformer.substituteVariable(s, propertycontainer, propertycontainer1);
        }
        // Misplaced declaration of an exception variable
        catch (PropertyContainer propertycontainer)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to parse input [").append(s).append("]").toString(), propertycontainer);
        }
        s1 = s2;
        if (s2.contains("${"))
        {
            s1 = NodeToStringTransformer.substituteVariable(s2, propertycontainer, propertycontainer1);
        }
        return s1;
    }

    public static boolean toBoolean(String s, boolean flag)
    {
        if (s != null)
        {
            s = s.trim();
            if ("true".equalsIgnoreCase(s))
            {
                return true;
            }
            if ("false".equalsIgnoreCase(s))
            {
                return false;
            }
        }
        return flag;
    }
}
