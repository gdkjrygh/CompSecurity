// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class bky
{

    static final Type a[] = new Type[0];

    static int a(Object obj)
    {
        return b(obj);
    }

    private static int a(Object aobj[], Object obj)
    {
        for (int j = 0; j < aobj.length; j++)
        {
            if (obj.equals(aobj[j]))
            {
                return j;
            }
        }

        throw new NoSuchElementException();
    }

    private static Class a(TypeVariable typevariable)
    {
        typevariable = typevariable.getGenericDeclaration();
        if (typevariable instanceof Class)
        {
            return (Class)typevariable;
        } else
        {
            return null;
        }
    }

    private static transient ParameterizedType a(Type type, Type type1, Type atype[])
    {
        return new bla(type, type1, atype);
    }

    public static Type a(Type type)
    {
        if (type instanceof Class)
        {
            type = (Class)type;
            if (type.isArray())
            {
                type = new bkz(a(((Type) (type.getComponentType()))));
            }
            return (Type)type;
        }
        if (type instanceof ParameterizedType)
        {
            type = (ParameterizedType)type;
            return new bla(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType)
        {
            return new bkz(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType)
        {
            type = (WildcardType)type;
            return new blb(type.getUpperBounds(), type.getLowerBounds());
        } else
        {
            return type;
        }
    }

    public static Type a(Type type, Class class1)
    {
        class1 = b(type, class1, java/util/Collection);
        type = class1;
        if (class1 instanceof WildcardType)
        {
            type = ((WildcardType)class1).getUpperBounds()[0];
        }
        if (type instanceof ParameterizedType)
        {
            return ((ParameterizedType)type).getActualTypeArguments()[0];
        } else
        {
            return java/lang/Object;
        }
    }

    private static Type a(Type type, Class class1, Class class2)
    {
        if (class2 == class1)
        {
            return type;
        }
        if (class2.isInterface())
        {
            type = class1.getInterfaces();
            int j = 0;
            for (int k = type.length; j < k; j++)
            {
                if (type[j] == class2)
                {
                    return class1.getGenericInterfaces()[j];
                }
                if (class2.isAssignableFrom(type[j]))
                {
                    return a(class1.getGenericInterfaces()[j], type[j], class2);
                }
            }

        }
        if (!class1.isInterface())
        {
            for (; class1 != java/lang/Object; class1 = type)
            {
                type = class1.getSuperclass();
                if (type == class2)
                {
                    return class1.getGenericSuperclass();
                }
                if (class2.isAssignableFrom(type))
                {
                    return a(class1.getGenericSuperclass(), ((Class) (type)), class2);
                }
            }

        }
        return class2;
    }

    public static Type a(Type type, Class class1, Type type1)
    {
        Type atype[] = type1;
_L12:
        if (!(atype instanceof TypeVariable)) goto _L2; else goto _L1
_L1:
        atype = (TypeVariable)atype;
        type1 = a(type, class1, ((TypeVariable) (atype)));
        if (type1 != atype) goto _L4; else goto _L3
_L3:
        return type1;
_L4:
        atype = type1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (!(atype instanceof Class) || !((Class)atype).isArray())
        {
            break; /* Loop/switch isn't completed */
        }
        type1 = (Class)atype;
        atype = type1.getComponentType();
        type = a(type, class1, ((Type) (atype)));
        if (atype != type)
        {
            return f(type);
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (!(atype instanceof GenericArrayType))
        {
            break; /* Loop/switch isn't completed */
        }
        type1 = (GenericArrayType)atype;
        atype = type1.getGenericComponentType();
        type = a(type, class1, ((Type) (atype)));
        if (atype != type)
        {
            return f(type);
        }
        if (true) goto _L3; else goto _L6
_L6:
        if (!(atype instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        ParameterizedType parameterizedtype = (ParameterizedType)atype;
        type1 = parameterizedtype.getOwnerType();
        Type type2 = a(type, class1, type1);
        boolean flag;
        int k;
        if (type2 != type1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        atype = parameterizedtype.getActualTypeArguments();
        k = atype.length;
        for (int j = 0; j < k;)
        {
            Type type3 = a(type, class1, atype[j]);
            boolean flag1 = flag;
            type1 = atype;
            if (type3 != atype[j])
            {
                flag1 = flag;
                type1 = atype;
                if (!flag)
                {
                    type1 = (Type[])atype.clone();
                    flag1 = true;
                }
                type1[j] = type3;
            }
            j++;
            flag = flag1;
            atype = type1;
        }

        type1 = parameterizedtype;
        if (flag)
        {
            return a(type2, parameterizedtype.getRawType(), atype);
        }
        if (true) goto _L3; else goto _L7
_L7:
        WildcardType wildcardtype;
        Type atype2[];
        type1 = atype;
        if (!(atype instanceof WildcardType))
        {
            continue; /* Loop/switch isn't completed */
        }
        wildcardtype = (WildcardType)atype;
        Type atype1[] = wildcardtype.getLowerBounds();
        atype2 = wildcardtype.getUpperBounds();
        if (atype1.length != 1)
        {
            break; /* Loop/switch isn't completed */
        }
        type = a(type, class1, atype1[0]);
        type1 = wildcardtype;
        if (type != atype1[0])
        {
            return h(type);
        }
        if (true) goto _L3; else goto _L8
_L8:
        type1 = wildcardtype;
        if (atype2.length != 1) goto _L3; else goto _L9
_L9:
        type = a(type, class1, atype2[0]);
        type1 = wildcardtype;
        if (type == atype2[0]) goto _L3; else goto _L10
_L10:
        return g(type);
        if (true) goto _L12; else goto _L11
_L11:
    }

    private static Type a(Type type, Class class1, TypeVariable typevariable)
    {
        Class class2 = a(typevariable);
        if (class2 != null)
        {
            if ((type = a(type, class1, class2)) instanceof ParameterizedType)
            {
                int j = a(((Object []) (class2.getTypeParameters())), typevariable);
                return ((ParameterizedType)type).getActualTypeArguments()[j];
            }
        }
        return typevariable;
    }

    private static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static boolean a(Type type, Type type1)
    {
        if (type != type1) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (type instanceof Class)
        {
            return type.equals(type1);
        }
        if (!(type instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(type1 instanceof ParameterizedType))
        {
            return false;
        }
        type = (ParameterizedType)type;
        type1 = (ParameterizedType)type1;
        if (!a(type.getOwnerType(), type1.getOwnerType()) || !type.getRawType().equals(type1.getRawType()) || !Arrays.equals(type.getActualTypeArguments(), type1.getActualTypeArguments()))
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (type instanceof GenericArrayType)
        {
            if (!(type1 instanceof GenericArrayType))
            {
                return false;
            } else
            {
                type = (GenericArrayType)type;
                type1 = (GenericArrayType)type1;
                return a(type.getGenericComponentType(), type1.getGenericComponentType());
            }
        }
        if (!(type instanceof WildcardType))
        {
            break; /* Loop/switch isn't completed */
        }
        if (!(type1 instanceof WildcardType))
        {
            return false;
        }
        type = (WildcardType)type;
        type1 = (WildcardType)type1;
        if (!Arrays.equals(type.getUpperBounds(), type1.getUpperBounds()) || !Arrays.equals(type.getLowerBounds(), type1.getLowerBounds()))
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (type instanceof TypeVariable)
        {
            if (!(type1 instanceof TypeVariable))
            {
                return false;
            }
            type = (TypeVariable)type;
            type1 = (TypeVariable)type1;
            if (type.getGenericDeclaration() != type1.getGenericDeclaration() || !type.getName().equals(type1.getName()))
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L5
_L5:
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
            type = ((ParameterizedType)type).getRawType();
            bkx.a(type instanceof Class);
            return (Class)type;
        }
        if (type instanceof GenericArrayType)
        {
            return Array.newInstance(b(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable)
        {
            return java/lang/Object;
        }
        if (type instanceof WildcardType)
        {
            return b(((WildcardType)type).getUpperBounds()[0]);
        }
        String s;
        if (type == null)
        {
            s = "null";
        } else
        {
            s = type.getClass().getName();
        }
        throw new IllegalArgumentException((new StringBuilder("Expected a Class, ParameterizedType, or GenericArrayType, but <")).append(type).append("> is of type ").append(s).toString());
    }

    private static Type b(Type type, Class class1, Class class2)
    {
        bkx.a(class2.isAssignableFrom(class1));
        return a(type, class1, a(type, class1, class2));
    }

    public static Type[] b(Type type, Class class1)
    {
        if (type == java/util/Properties)
        {
            return (new Type[] {
                java/lang/String, java/lang/String
            });
        }
        type = b(type, class1, java/util/Map);
        if (type instanceof ParameterizedType)
        {
            return ((ParameterizedType)type).getActualTypeArguments();
        } else
        {
            return (new Type[] {
                java/lang/Object, java/lang/Object
            });
        }
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

    public static Type d(Type type)
    {
        if (type instanceof GenericArrayType)
        {
            return ((GenericArrayType)type).getGenericComponentType();
        } else
        {
            return ((Class)type).getComponentType();
        }
    }

    static void e(Type type)
    {
        i(type);
    }

    private static GenericArrayType f(Type type)
    {
        return new bkz(type);
    }

    private static WildcardType g(Type type)
    {
        Type atype[] = a;
        return new blb(new Type[] {
            type
        }, atype);
    }

    private static WildcardType h(Type type)
    {
        return new blb(new Type[] {
            java/lang/Object
        }, new Type[] {
            type
        });
    }

    private static void i(Type type)
    {
        boolean flag;
        if (!(type instanceof Class) || !((Class)type).isPrimitive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bkx.a(flag);
    }

}
