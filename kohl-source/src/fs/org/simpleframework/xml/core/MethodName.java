// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.reflect.Method;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            MethodType

class MethodName
{

    private Method method;
    private String name;
    private MethodType type;

    public MethodName(Method method1, MethodType methodtype, String s)
    {
        name = s.intern();
        method = method1;
        type = methodtype;
    }

    public Method getMethod()
    {
        return method;
    }

    public String getName()
    {
        return name;
    }

    public MethodType getType()
    {
        return type;
    }
}
