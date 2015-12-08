// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            AnnotationFactory, MethodType, MethodException, MethodName, 
//            Reflector, SetPart, GetPart, MethodPart

class MethodPartFactory
{

    private final AnnotationFactory factory;

    public MethodPartFactory()
    {
        this(true);
    }

    public MethodPartFactory(boolean flag)
    {
        factory = new AnnotationFactory(flag);
    }

    private Annotation getAnnotation(Method method)
        throws Exception
    {
        method = getType(method);
        if (method != null)
        {
            return factory.getInstance(method);
        } else
        {
            return null;
        }
    }

    private MethodType getMethodType(Method method)
    {
        method = method.getName();
        if (method.startsWith("get"))
        {
            return MethodType.GET;
        }
        if (method.startsWith("is"))
        {
            return MethodType.IS;
        }
        if (method.startsWith("set"))
        {
            return MethodType.SET;
        } else
        {
            return MethodType.NONE;
        }
    }

    private MethodName getName(Method method, Annotation annotation)
        throws Exception
    {
        MethodType methodtype = getMethodType(method);
        if (methodtype == MethodType.GET)
        {
            return getRead(method, methodtype);
        }
        if (methodtype == MethodType.IS)
        {
            return getRead(method, methodtype);
        }
        if (methodtype == MethodType.SET)
        {
            return getWrite(method, methodtype);
        } else
        {
            throw new MethodException("Annotation %s must mark a set or get method", new Object[] {
                annotation
            });
        }
    }

    private Class getParameterType(Method method)
        throws Exception
    {
        if (method.getParameterTypes().length == 1)
        {
            return method.getParameterTypes()[0];
        } else
        {
            return null;
        }
    }

    private MethodName getRead(Method method, MethodType methodtype)
        throws Exception
    {
        Class aclass[] = method.getParameterTypes();
        String s1 = method.getName();
        if (aclass.length != 0)
        {
            throw new MethodException("Get method %s is not a valid property", new Object[] {
                method
            });
        }
        String s = getTypeName(s1, methodtype);
        if (s == null)
        {
            throw new MethodException("Could not get name for %s", new Object[] {
                method
            });
        } else
        {
            return new MethodName(method, methodtype, s);
        }
    }

    private Class getReturnType(Method method)
        throws Exception
    {
        if (method.getParameterTypes().length == 0)
        {
            return method.getReturnType();
        } else
        {
            return null;
        }
    }

    private String getTypeName(String s, MethodType methodtype)
    {
        int i = methodtype.getPrefix();
        int j = s.length();
        methodtype = s;
        if (j > i)
        {
            methodtype = s.substring(i, j);
        }
        return Reflector.getName(methodtype);
    }

    private MethodName getWrite(Method method, MethodType methodtype)
        throws Exception
    {
        Class aclass[] = method.getParameterTypes();
        String s1 = method.getName();
        if (aclass.length != 1)
        {
            throw new MethodException("Set method %s is not a valid property", new Object[] {
                method
            });
        }
        String s = getTypeName(s1, methodtype);
        if (s == null)
        {
            throw new MethodException("Could not get name for %s", new Object[] {
                method
            });
        } else
        {
            return new MethodName(method, methodtype, s);
        }
    }

    public MethodPart getInstance(Method method)
        throws Exception
    {
        Annotation annotation = getAnnotation(method);
        if (annotation != null)
        {
            return getInstance(method, annotation);
        } else
        {
            return null;
        }
    }

    public MethodPart getInstance(Method method, Annotation annotation)
        throws Exception
    {
        method = getName(method, annotation);
        if (method.getType() == MethodType.SET)
        {
            return new SetPart(method, annotation);
        } else
        {
            return new GetPart(method, annotation);
        }
    }

    public Class getType(Method method)
        throws Exception
    {
        MethodType methodtype = getMethodType(method);
        if (methodtype == MethodType.SET)
        {
            return getParameterType(method);
        }
        if (methodtype == MethodType.GET)
        {
            return getReturnType(method);
        }
        if (methodtype == MethodType.IS)
        {
            return getReturnType(method);
        } else
        {
            return null;
        }
    }
}
