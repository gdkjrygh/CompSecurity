// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.event.eventListener.javaassist;

import java.lang.reflect.Method;

public class RuntimeSupport
{

    public RuntimeSupport()
    {
    }

    private static void makeDesc(StringBuffer stringbuffer, Class class1)
    {
        if (class1.isArray())
        {
            stringbuffer.append('[');
            makeDesc(stringbuffer, class1.getComponentType());
            return;
        }
        if (class1.isPrimitive())
        {
            if (class1 == Void.TYPE)
            {
                stringbuffer.append('V');
                return;
            }
            if (class1 == Integer.TYPE)
            {
                stringbuffer.append('I');
                return;
            }
            if (class1 == Byte.TYPE)
            {
                stringbuffer.append('B');
                return;
            }
            if (class1 == Long.TYPE)
            {
                stringbuffer.append('J');
                return;
            }
            if (class1 == Double.TYPE)
            {
                stringbuffer.append('D');
                return;
            }
            if (class1 == Float.TYPE)
            {
                stringbuffer.append('F');
                return;
            }
            if (class1 == Character.TYPE)
            {
                stringbuffer.append('C');
                return;
            }
            if (class1 == Short.TYPE)
            {
                stringbuffer.append('S');
                return;
            }
            if (class1 == Boolean.TYPE)
            {
                stringbuffer.append('Z');
                return;
            } else
            {
                throw new RuntimeException((new StringBuilder()).append("bad type: ").append(class1.getName()).toString());
            }
        } else
        {
            stringbuffer.append('L').append(class1.getName().replace('.', '/')).append(';');
            return;
        }
    }

    public static String makeDescriptor(Method method)
    {
        return makeDescriptor(method.getParameterTypes(), method.getReturnType());
    }

    public static String makeDescriptor(Class aclass[], Class class1)
    {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append('(');
        for (int i = 0; i < aclass.length; i++)
        {
            makeDesc(stringbuffer, aclass[i]);
        }

        stringbuffer.append(')');
        makeDesc(stringbuffer, class1);
        return stringbuffer.toString();
    }
}
