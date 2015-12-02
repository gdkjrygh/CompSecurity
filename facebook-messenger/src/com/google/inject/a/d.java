// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.a;

import com.google.common.a.ew;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.inject.b.c;
import com.google.inject.f;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import javax.inject.a;

// Referenced classes of package com.google.inject.a:
//            f, e, g, h

public class d
{

    public static final Type a[] = new Type[0];
    private static final Map b;

    private d()
    {
    }

    static int a(Object obj)
    {
        return b(obj);
    }

    public static f a(f f1)
    {
        Object obj = f1.b();
        if (!e(((Type) (obj))))
        {
            throw new RuntimeException((new StringBuilder()).append("Key not fully specified ").append(f1).toString());
        }
        if (f1.a() == javax/inject/a)
        {
            obj = f.a(com.google.inject.b.c.a(((ParameterizedType)obj).getActualTypeArguments()[0]));
        } else
        {
            f f2 = (f)b.get(f1);
            obj = f2;
            if (f2 == null)
            {
                return f1;
            }
        }
        return ((f) (obj));
    }

    public static Type a(Type type)
    {
        Object obj;
        if (type instanceof Class)
        {
            type = (Class)type;
            obj = type;
            if (type.isArray())
            {
                obj = new com.google.inject.a.f(a(((Type) (type.getComponentType()))));
            }
        } else
        {
            obj = type;
            if (!(type instanceof e))
            {
                if (type instanceof ParameterizedType)
                {
                    type = (ParameterizedType)type;
                    return new g(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
                }
                if (type instanceof GenericArrayType)
                {
                    return new com.google.inject.a.f(((GenericArrayType)type).getGenericComponentType());
                }
                obj = type;
                if (type instanceof WildcardType)
                {
                    type = (WildcardType)type;
                    return new h(type.getUpperBounds(), type.getLowerBounds());
                }
            }
        }
        return ((Type) (obj));
    }

    static void a(Type type, String s)
    {
        b(type, s);
    }

    public static boolean a(Type type, Type type1)
    {
        boolean flag2;
        boolean flag3;
        boolean flag4;
        boolean flag5;
        flag4 = true;
        flag5 = true;
        flag2 = true;
        flag3 = false;
        if (type != type1) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        if (type instanceof Class)
        {
            return type.equals(type1);
        }
        if (!(type instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag3;
        if (type1 instanceof ParameterizedType)
        {
            type = (ParameterizedType)type;
            type1 = (ParameterizedType)type1;
            if (Objects.equal(type.getOwnerType(), type1.getOwnerType()) && type.getRawType().equals(type1.getRawType()) && Arrays.equals(type.getActualTypeArguments(), type1.getActualTypeArguments()))
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            return flag;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!(type instanceof GenericArrayType))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag3;
        if (type1 instanceof GenericArrayType)
        {
            type = (GenericArrayType)type;
            type1 = (GenericArrayType)type1;
            return a(type.getGenericComponentType(), type1.getGenericComponentType());
        }
        if (true) goto _L4; else goto _L5
_L5:
        if (!(type instanceof WildcardType))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag3;
        if (type1 instanceof WildcardType)
        {
            type = (WildcardType)type;
            type1 = (WildcardType)type1;
            if (Arrays.equals(type.getUpperBounds(), type1.getUpperBounds()) && Arrays.equals(type.getLowerBounds(), type1.getLowerBounds()))
            {
                flag = flag4;
            } else
            {
                flag = false;
            }
            return flag;
        }
        if (true) goto _L4; else goto _L6
_L6:
        flag = flag3;
        if (type instanceof TypeVariable)
        {
            flag = flag3;
            if (type1 instanceof TypeVariable)
            {
                type = (TypeVariable)type;
                type1 = (TypeVariable)type1;
                boolean flag1;
                if (type.getGenericDeclaration() == type1.getGenericDeclaration() && type.getName().equals(type1.getName()))
                {
                    flag1 = flag5;
                } else
                {
                    flag1 = false;
                }
                return flag1;
            }
        }
        if (true) goto _L4; else goto _L7
_L7:
    }

    private static int b(Object obj)
    {
        if (obj != null)
        {
            return obj.hashCode();
        } else
        {
            return 0;
        }
    }

    public static Class b(Type type)
    {
        if (type instanceof Class)
        {
            return (Class)type;
        }
        if (type instanceof ParameterizedType)
        {
            Type type1 = ((ParameterizedType)type).getRawType();
            Preconditions.checkArgument(type1 instanceof Class, "Expected a Class, but <%s> is of type %s", new Object[] {
                type, type.getClass().getName()
            });
            return (Class)type1;
        }
        if (type instanceof GenericArrayType)
        {
            return Array.newInstance(b(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable)
        {
            return java/lang/Object;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Expected a Class, ParameterizedType, or GenericArrayType, but <").append(type).append("> is of type ").append(type.getClass().getName()).toString());
        }
    }

    private static void b(Type type, String s)
    {
        boolean flag;
        if (!(type instanceof Class) || !((Class)type).isPrimitive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Primitive types are not allowed in %s: %s", new Object[] {
            s, type
        });
    }

    public static String c(Type type)
    {
        if (type instanceof Class)
        {
            return ((Class)type).getName();
        } else
        {
            return type.toString();
        }
    }

    static boolean d(Type type)
    {
        return e(type);
    }

    private static boolean e(Type type)
    {
        if (type instanceof Class)
        {
            return true;
        }
        if (type instanceof e)
        {
            return ((e)type).a();
        }
        if (type instanceof TypeVariable)
        {
            return false;
        } else
        {
            return ((e)a(type)).a();
        }
    }

    static 
    {
        b = (new ew()).b(f.c(Boolean.TYPE), f.c(java/lang/Boolean)).b(f.c(Byte.TYPE), f.c(java/lang/Byte)).b(f.c(Short.TYPE), f.c(java/lang/Short)).b(f.c(Integer.TYPE), f.c(java/lang/Integer)).b(f.c(Long.TYPE), f.c(java/lang/Long)).b(f.c(Float.TYPE), f.c(java/lang/Float)).b(f.c(Double.TYPE), f.c(java/lang/Double)).b(f.c(Character.TYPE), f.c(java/lang/Character)).b(f.c(Void.TYPE), f.c(java/lang/Void)).b();
    }
}
