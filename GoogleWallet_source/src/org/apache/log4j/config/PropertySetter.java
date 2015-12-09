// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.log4j.config;

import java.beans.BeanInfo;
import java.beans.FeatureDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Properties;
import org.apache.log4j.Appender;
import org.apache.log4j.Level;
import org.apache.log4j.helpers.LogLog;
import org.apache.log4j.helpers.OptionConverter;
import org.apache.log4j.spi.OptionHandler;

// Referenced classes of package org.apache.log4j.config:
//            PropertySetterException

public final class PropertySetter
{

    static Class class$java$lang$String;
    static Class class$org$apache$log4j$Priority;
    protected Object obj;
    protected PropertyDescriptor props[];

    private PropertySetter(Object obj1)
    {
        obj = obj1;
    }

    private void activate()
    {
        Object obj1;
        if (obj instanceof OptionHandler)
        {
            obj1 = obj;
        }
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

    private static Object convertArg(String s, Class class1)
    {
        if (s == null)
        {
            s = null;
        } else
        {
            String s1 = s.trim();
            Class class2;
            if (class$java$lang$String == null)
            {
                class2 = _mthclass$("java.lang.String");
                class$java$lang$String = class2;
            } else
            {
                class2 = class$java$lang$String;
            }
            if (!class2.isAssignableFrom(class1))
            {
                if (Integer.TYPE.isAssignableFrom(class1))
                {
                    return new Integer(s1);
                }
                if (Long.TYPE.isAssignableFrom(class1))
                {
                    return new Long(s1);
                }
                if (Boolean.TYPE.isAssignableFrom(class1))
                {
                    if ("true".equalsIgnoreCase(s1))
                    {
                        return Boolean.TRUE;
                    }
                    if ("false".equalsIgnoreCase(s1))
                    {
                        return Boolean.FALSE;
                    }
                } else
                {
                    if (class$org$apache$log4j$Priority == null)
                    {
                        s = _mthclass$("org.apache.log4j.Priority");
                        class$org$apache$log4j$Priority = s;
                    } else
                    {
                        s = class$org$apache$log4j$Priority;
                    }
                    if (s.isAssignableFrom(class1))
                    {
                        return OptionConverter.toLevel(s1, Level.DEBUG);
                    }
                }
                return null;
            }
        }
        return s;
    }

    private PropertyDescriptor getPropertyDescriptor(String s)
    {
        if (props == null)
        {
            introspect();
        }
        for (int i = 0; i < props.length; i++)
        {
            if (s.equals(props[i].getName()))
            {
                return props[i];
            }
        }

        return null;
    }

    private void introspect()
    {
        try
        {
            props = Introspector.getBeanInfo(obj.getClass()).getPropertyDescriptors();
            return;
        }
        catch (IntrospectionException introspectionexception)
        {
            LogLog.error("Failed to introspect " + obj + ": " + introspectionexception.getMessage());
        }
        props = new PropertyDescriptor[0];
    }

    public static void setProperties(Object obj1, Properties properties, String s)
    {
        (new PropertySetter(obj1)).setProperties(properties, s);
    }

    private void setProperties(Properties properties, String s)
    {
        int i = s.length();
        Enumeration enumeration = properties.propertyNames();
        do
        {
            if (!enumeration.hasMoreElements())
            {
                break;
            }
            String s2 = (String)enumeration.nextElement();
            if (s2.startsWith(s) && s2.indexOf('.', i + 1) <= 0)
            {
                String s1 = OptionConverter.findAndSubst(s2, properties);
                s2 = s2.substring(i);
                if (!"layout".equals(s2) || !(obj instanceof Appender))
                {
                    setProperty(s2, s1);
                }
            }
        } while (true);
        activate();
    }

    private void setProperty(PropertyDescriptor propertydescriptor, String s, String s1)
        throws PropertySetterException
    {
        Method method = propertydescriptor.getWriteMethod();
        if (method == null)
        {
            throw new PropertySetterException("No setter for property [" + s + "].");
        }
        propertydescriptor = method.getParameterTypes();
        if (propertydescriptor.length != 1)
        {
            throw new PropertySetterException("#params for setter != 1");
        }
        try
        {
            s1 = ((String) (convertArg(s1, propertydescriptor[0])));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new PropertySetterException("Conversion to type [" + propertydescriptor[0] + "] failed. Reason: " + s);
        }
        if (s1 == null)
        {
            throw new PropertySetterException("Conversion to type [" + propertydescriptor[0] + "] failed.");
        }
        LogLog.debug("Setting property [" + s + "] to [" + s1 + "].");
        try
        {
            method.invoke(obj, new Object[] {
                s1
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PropertyDescriptor propertydescriptor)
        {
            throw new PropertySetterException(propertydescriptor);
        }
    }

    private void setProperty(String s, String s1)
    {
        if (s1 == null)
        {
            return;
        }
        s = Introspector.decapitalize(s);
        PropertyDescriptor propertydescriptor = getPropertyDescriptor(s);
        if (propertydescriptor == null)
        {
            LogLog.warn("No such property [" + s + "] in " + obj.getClass().getName() + ".");
            return;
        }
        try
        {
            setProperty(propertydescriptor, s, s1);
            return;
        }
        catch (PropertySetterException propertysetterexception)
        {
            LogLog.warn("Failed to set property [" + s + "] to value \"" + s1 + "\". ", propertysetterexception.rootCause);
        }
    }
}
