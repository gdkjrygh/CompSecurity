// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

public class PropertyDescriptor
{

    private String name;
    private Method readMethod;
    private Class type;
    private Method writeMethod;

    public PropertyDescriptor(String s)
    {
        name = s;
    }

    public String getName()
    {
        return name;
    }

    public Class getPropertyType()
    {
        return type;
    }

    public Method getWriteMethod()
    {
        return writeMethod;
    }

    public void setPropertyType(Class class1)
    {
        type = class1;
    }

    public void setReadMethod(Method method)
    {
        readMethod = method;
    }

    public void setWriteMethod(Method method)
    {
        writeMethod = method;
    }
}
