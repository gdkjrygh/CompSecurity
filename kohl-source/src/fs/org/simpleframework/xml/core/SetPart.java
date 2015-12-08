// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            MethodPart, MethodName, Reflector, MethodType

class SetPart
    implements MethodPart
{

    private final Annotation label;
    private final Method method;
    private final String name;
    private final MethodType type;

    public SetPart(MethodName methodname, Annotation annotation)
    {
        method = methodname.getMethod();
        name = methodname.getName();
        type = methodname.getType();
        label = annotation;
    }

    public Annotation getAnnotation()
    {
        return label;
    }

    public Annotation getAnnotation(Class class1)
    {
        return method.getAnnotation(class1);
    }

    public Class getDependent()
    {
        return Reflector.getParameterDependent(method, 0);
    }

    public Class[] getDependents()
    {
        return Reflector.getParameterDependents(method, 0);
    }

    public Method getMethod()
    {
        if (!method.isAccessible())
        {
            method.setAccessible(true);
        }
        return method;
    }

    public MethodType getMethodType()
    {
        return type;
    }

    public String getName()
    {
        return name;
    }

    public Class getType()
    {
        return method.getParameterTypes()[0];
    }

    public String toString()
    {
        return method.toGenericString();
    }
}
