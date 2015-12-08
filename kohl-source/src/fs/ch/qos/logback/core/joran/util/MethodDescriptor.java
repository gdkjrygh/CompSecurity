// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;

public class MethodDescriptor
{

    private Method method;
    private String name;

    public MethodDescriptor(String s, Method method1)
    {
        name = s;
        method = method1;
    }

    public Method getMethod()
    {
        return method;
    }

    public String getName()
    {
        return name;
    }
}
