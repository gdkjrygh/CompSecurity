// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.util;

import fs.ch.qos.logback.core.spi.ContextAware;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;

public class StringToObjectConverter
{

    private static final Class STING_CLASS_PARAMETER[] = {
        java/lang/String
    };

    public static boolean canBeBuiltFromSimpleString(Class class1)
    {
        for (Package package1 = class1.getPackage(); class1.isPrimitive() || package1 != null && "java.lang".equals(package1.getName()) || followsTheValueOfConvention(class1) || class1.isEnum() || isOfTypeCharset(class1);)
        {
            return true;
        }

        return false;
    }

    public static Object convertArg(ContextAware contextaware, String s, Class class1)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        String s1;
        s1 = s.trim();
        if (java/lang/String.isAssignableFrom(class1))
        {
            return s1;
        }
        if (Integer.TYPE.isAssignableFrom(class1))
        {
            return new Integer(s1);
        }
        if (Long.TYPE.isAssignableFrom(class1))
        {
            return new Long(s1);
        }
        if (Float.TYPE.isAssignableFrom(class1))
        {
            return new Float(s1);
        }
        if (Double.TYPE.isAssignableFrom(class1))
        {
            return new Double(s1);
        }
        if (!Boolean.TYPE.isAssignableFrom(class1))
        {
            break; /* Loop/switch isn't completed */
        }
        if ("true".equalsIgnoreCase(s1))
        {
            return Boolean.TRUE;
        }
        if ("false".equalsIgnoreCase(s1))
        {
            return Boolean.FALSE;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (class1.isEnum())
        {
            return convertToEnum(contextaware, s1, class1);
        }
        if (followsTheValueOfConvention(class1))
        {
            return convertByValueOfMethod(contextaware, class1, s1);
        }
        if (isOfTypeCharset(class1))
        {
            return convertToCharset(contextaware, s);
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private static Object convertByValueOfMethod(ContextAware contextaware, Class class1, String s)
    {
        Object obj;
        try
        {
            obj = class1.getMethod("valueOf", STING_CLASS_PARAMETER).invoke(null, new Object[] {
                s
            });
        }
        catch (Exception exception)
        {
            contextaware.addError((new StringBuilder()).append("Failed to invoke valueOf{} method in class [").append(class1.getName()).append("] with value [").append(s).append("]").toString());
            return null;
        }
        return obj;
    }

    private static Charset convertToCharset(ContextAware contextaware, String s)
    {
        Charset charset;
        try
        {
            charset = Charset.forName(s);
        }
        catch (UnsupportedCharsetException unsupportedcharsetexception)
        {
            contextaware.addError((new StringBuilder()).append("Failed to get charset [").append(s).append("]").toString(), unsupportedcharsetexception);
            return null;
        }
        return charset;
    }

    private static Object convertToEnum(ContextAware contextaware, String s, Class class1)
    {
        return Enum.valueOf(class1, s);
    }

    private static boolean followsTheValueOfConvention(Class class1)
    {
        boolean flag = Modifier.isStatic(class1.getMethod("valueOf", STING_CLASS_PARAMETER).getModifiers());
label0:
        {
            if (flag)
            {
                return true;
            }
            break label0;
        }
        class1;
_L2:
        return false;
        class1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static boolean isOfTypeCharset(Class class1)
    {
        return java/nio/charset/Charset.isAssignableFrom(class1);
    }

}
