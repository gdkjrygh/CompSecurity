// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

final class Reflector
{

    private static Class getArrayClass(Type type)
    {
        type = getClass(((GenericArrayType)type).getGenericComponentType());
        if (type != null)
        {
            return Array.newInstance(type, 0).getClass();
        } else
        {
            return null;
        }
    }

    private static Class getClass(ParameterizedType parameterizedtype)
    {
        parameterizedtype = parameterizedtype.getActualTypeArguments();
        if (parameterizedtype.length > 0)
        {
            return getClass(parameterizedtype[0]);
        } else
        {
            return null;
        }
    }

    private static Class getClass(Type type)
    {
        if (type instanceof Class)
        {
            return (Class)type;
        } else
        {
            return getGenericClass(type);
        }
    }

    private static Class[] getClasses(ParameterizedType parameterizedtype)
    {
        parameterizedtype = parameterizedtype.getActualTypeArguments();
        Class aclass[] = new Class[parameterizedtype.length];
        for (int i = 0; i < parameterizedtype.length; i++)
        {
            aclass[i] = getClass(parameterizedtype[i]);
        }

        return aclass;
    }

    public static Class getDependent(Field field)
    {
        field = getType(field);
        if (field != null)
        {
            return getClass(field);
        } else
        {
            return null;
        }
    }

    public static Class[] getDependents(Field field)
    {
        field = getType(field);
        if (field != null)
        {
            return getClasses(field);
        } else
        {
            return new Class[0];
        }
    }

    private static Class getGenericClass(Type type)
    {
        if (type instanceof GenericArrayType)
        {
            return getArrayClass(type);
        } else
        {
            return java/lang/Object;
        }
    }

    public static String getName(String s)
    {
        String s1 = s;
        if (s.length() > 0)
        {
            s = s.toCharArray();
            char c = s[0];
            if (!isAcronym(s))
            {
                s[0] = toLowerCase(c);
            }
            s1 = new String(s);
        }
        return s1;
    }

    public static Class getParameterDependent(Constructor constructor, int i)
    {
        constructor = getParameterType(constructor, i);
        if (constructor != null)
        {
            return getClass(constructor);
        } else
        {
            return null;
        }
    }

    public static Class getParameterDependent(Method method, int i)
    {
        method = getParameterType(method, i);
        if (method != null)
        {
            return getClass(method);
        } else
        {
            return null;
        }
    }

    public static Class[] getParameterDependents(Constructor constructor, int i)
    {
        constructor = getParameterType(constructor, i);
        if (constructor != null)
        {
            return getClasses(constructor);
        } else
        {
            return new Class[0];
        }
    }

    public static Class[] getParameterDependents(Method method, int i)
    {
        method = getParameterType(method, i);
        if (method != null)
        {
            return getClasses(method);
        } else
        {
            return new Class[0];
        }
    }

    private static ParameterizedType getParameterType(Constructor constructor, int i)
    {
        constructor = constructor.getGenericParameterTypes();
        if (constructor.length > i)
        {
            constructor = constructor[i];
            if (constructor instanceof ParameterizedType)
            {
                return (ParameterizedType)constructor;
            }
        }
        return null;
    }

    private static ParameterizedType getParameterType(Method method, int i)
    {
        method = method.getGenericParameterTypes();
        if (method.length > i)
        {
            method = method[i];
            if (method instanceof ParameterizedType)
            {
                return (ParameterizedType)method;
            }
        }
        return null;
    }

    public static Class getReturnDependent(Method method)
    {
        method = getReturnType(method);
        if (method != null)
        {
            return getClass(method);
        } else
        {
            return null;
        }
    }

    public static Class[] getReturnDependents(Method method)
    {
        method = getReturnType(method);
        if (method != null)
        {
            return getClasses(method);
        } else
        {
            return new Class[0];
        }
    }

    private static ParameterizedType getReturnType(Method method)
    {
        method = method.getGenericReturnType();
        if (method instanceof ParameterizedType)
        {
            return (ParameterizedType)method;
        } else
        {
            return null;
        }
    }

    private static ParameterizedType getType(Field field)
    {
        field = field.getGenericType();
        if (field instanceof ParameterizedType)
        {
            return (ParameterizedType)field;
        } else
        {
            return null;
        }
    }

    private static boolean isAcronym(char ac[])
    {
        while (ac.length < 2 || !isUpperCase(ac[0])) 
        {
            return false;
        }
        return isUpperCase(ac[1]);
    }

    private static boolean isUpperCase(char c)
    {
        return Character.isUpperCase(c);
    }

    private static char toLowerCase(char c)
    {
        return Character.toLowerCase(c);
    }
}
