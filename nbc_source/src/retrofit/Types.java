// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.NoSuchElementException;

final class Types
{
    private static final class GenericArrayTypeImpl
        implements GenericArrayType
    {

        private final Type componentType;

        public boolean equals(Object obj)
        {
            return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType)obj);
        }

        public Type getGenericComponentType()
        {
            return componentType;
        }

        public int hashCode()
        {
            return componentType.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append(Types.typeToString(componentType)).append("[]").toString();
        }

        public GenericArrayTypeImpl(Type type)
        {
            componentType = type;
        }
    }

    private static final class ParameterizedTypeImpl
        implements ParameterizedType
    {

        private final Type ownerType;
        private final Type rawType;
        private final Type typeArguments[];

        public boolean equals(Object obj)
        {
            return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType)obj);
        }

        public Type[] getActualTypeArguments()
        {
            return (Type[])typeArguments.clone();
        }

        public Type getOwnerType()
        {
            return ownerType;
        }

        public Type getRawType()
        {
            return rawType;
        }

        public int hashCode()
        {
            return Arrays.hashCode(typeArguments) ^ rawType.hashCode() ^ Types.hashCodeOrZero(ownerType);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
            stringbuilder.append(Types.typeToString(rawType));
            if (typeArguments.length == 0)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append("<").append(Types.typeToString(typeArguments[0]));
            for (int i = 1; i < typeArguments.length; i++)
            {
                stringbuilder.append(", ").append(Types.typeToString(typeArguments[i]));
            }

            return stringbuilder.append(">").toString();
        }

        public transient ParameterizedTypeImpl(Type type, Type type1, Type atype[])
        {
            int j = 1;
            boolean flag1 = false;
            super();
            if (type1 instanceof Class)
            {
                boolean flag;
                if (type == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (((Class)type1).getEnclosingClass() != null)
                {
                    j = 0;
                }
                if (flag != j)
                {
                    throw new IllegalArgumentException();
                }
            }
            ownerType = type;
            rawType = type1;
            typeArguments = (Type[])atype.clone();
            type = typeArguments;
            j = type.length;
            for (int i = ((flag1) ? 1 : 0); i < j; i++)
            {
                type1 = type[i];
                if (type1 == null)
                {
                    throw new NullPointerException();
                }
                Types.checkNotPrimitive(type1);
            }

        }
    }

    private static final class WildcardTypeImpl
        implements WildcardType
    {

        private final Type lowerBound;
        private final Type upperBound;

        public boolean equals(Object obj)
        {
            return (obj instanceof WildcardType) && Types.equals(this, (WildcardType)obj);
        }

        public Type[] getLowerBounds()
        {
            if (lowerBound != null)
            {
                return (new Type[] {
                    lowerBound
                });
            } else
            {
                return Types.EMPTY_TYPE_ARRAY;
            }
        }

        public Type[] getUpperBounds()
        {
            return (new Type[] {
                upperBound
            });
        }

        public int hashCode()
        {
            int i;
            if (lowerBound != null)
            {
                i = lowerBound.hashCode() + 31;
            } else
            {
                i = 1;
            }
            return i ^ upperBound.hashCode() + 31;
        }

        public String toString()
        {
            if (lowerBound != null)
            {
                return (new StringBuilder()).append("? super ").append(Types.typeToString(lowerBound)).toString();
            }
            if (upperBound == java/lang/Object)
            {
                return "?";
            } else
            {
                return (new StringBuilder()).append("? extends ").append(Types.typeToString(upperBound)).toString();
            }
        }

        public WildcardTypeImpl(Type atype[], Type atype1[])
        {
            if (atype1.length > 1)
            {
                throw new IllegalArgumentException();
            }
            if (atype.length != 1)
            {
                throw new IllegalArgumentException();
            }
            if (atype1.length == 1)
            {
                if (atype1[0] == null)
                {
                    throw new NullPointerException();
                }
                Types.checkNotPrimitive(atype1[0]);
                if (atype[0] != java/lang/Object)
                {
                    throw new IllegalArgumentException();
                } else
                {
                    lowerBound = atype1[0];
                    upperBound = java/lang/Object;
                    return;
                }
            }
            if (atype[0] == null)
            {
                throw new NullPointerException();
            } else
            {
                Types.checkNotPrimitive(atype[0]);
                lowerBound = null;
                upperBound = atype[0];
                return;
            }
        }
    }


    private static final Type EMPTY_TYPE_ARRAY[] = new Type[0];

    private Types()
    {
    }

    private static void checkNotPrimitive(Type type)
    {
        if ((type instanceof Class) && ((Class)type).isPrimitive())
        {
            throw new IllegalArgumentException();
        } else
        {
            return;
        }
    }

    private static Class declaringClassOf(TypeVariable typevariable)
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

    private static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static boolean equals(Type type, Type type1)
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
            if (equal(type.getOwnerType(), type1.getOwnerType()) && type.getRawType().equals(type1.getRawType()) && Arrays.equals(type.getActualTypeArguments(), type1.getActualTypeArguments()))
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
            return equals(type.getGenericComponentType(), type1.getGenericComponentType());
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

    static Type getGenericSupertype(Type type, Class class1, Class class2)
    {
        if (class2 == class1)
        {
            return type;
        }
        if (class2.isInterface())
        {
            type = class1.getInterfaces();
            int i = 0;
            for (int j = type.length; i < j; i++)
            {
                if (type[i] == class2)
                {
                    return class1.getGenericInterfaces()[i];
                }
                if (class2.isAssignableFrom(type[i]))
                {
                    return getGenericSupertype(class1.getGenericInterfaces()[i], type[i], class2);
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
                    return getGenericSupertype(class1.getGenericSuperclass(), ((Class) (type)), class2);
                }
            }

        }
        return class2;
    }

    public static Class getRawType(Type type)
    {
        if (type instanceof Class)
        {
            return (Class)type;
        }
        if (type instanceof ParameterizedType)
        {
            type = ((ParameterizedType)type).getRawType();
            if (!(type instanceof Class))
            {
                throw new IllegalArgumentException();
            } else
            {
                return (Class)type;
            }
        }
        if (type instanceof GenericArrayType)
        {
            return Array.newInstance(getRawType(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable)
        {
            return java/lang/Object;
        }
        if (type instanceof WildcardType)
        {
            return getRawType(((WildcardType)type).getUpperBounds()[0]);
        }
        String s;
        if (type == null)
        {
            s = "null";
        } else
        {
            s = type.getClass().getName();
        }
        throw new IllegalArgumentException((new StringBuilder()).append("Expected a Class, ParameterizedType, or GenericArrayType, but <").append(type).append("> is of type ").append(s).toString());
    }

    public static Type getSupertype(Type type, Class class1, Class class2)
    {
        if (!class2.isAssignableFrom(class1))
        {
            throw new IllegalArgumentException();
        } else
        {
            return resolve(type, class1, getGenericSupertype(type, class1, class2));
        }
    }

    private static int hashCodeOrZero(Object obj)
    {
        if (obj != null)
        {
            return obj.hashCode();
        } else
        {
            return 0;
        }
    }

    private static int indexOf(Object aobj[], Object obj)
    {
        for (int i = 0; i < aobj.length; i++)
        {
            if (obj.equals(aobj[i]))
            {
                return i;
            }
        }

        throw new NoSuchElementException();
    }

    public static Type resolve(Type type, Class class1, Type type1)
    {
_L4:
        if (!(type1 instanceof TypeVariable)) goto _L2; else goto _L1
_L1:
        Type type2;
        TypeVariable typevariable;
        typevariable = (TypeVariable)type1;
        type2 = resolveTypeVariable(type, class1, typevariable);
        type1 = type2;
        if (type2 != typevariable) goto _L4; else goto _L3
_L3:
        type1 = type2;
_L6:
        return type1;
_L2:
        if ((type1 instanceof Class) && ((Class)type1).isArray())
        {
            type1 = (Class)type1;
            Class class2 = type1.getComponentType();
            type = resolve(type, class1, ((Type) (class2)));
            if (class2 == type)
            {
                type = type1;
            } else
            {
                type = new GenericArrayTypeImpl(type);
            }
            return type;
        }
        if (!(type1 instanceof GenericArrayType))
        {
            break; /* Loop/switch isn't completed */
        }
        type1 = (GenericArrayType)type1;
        Type type3 = type1.getGenericComponentType();
        type = resolve(type, class1, type3);
        if (type3 != type)
        {
            return new GenericArrayTypeImpl(type);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!(type1 instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        ParameterizedType parameterizedtype = (ParameterizedType)type1;
        type1 = parameterizedtype.getOwnerType();
        Type type4 = resolve(type, class1, type1);
        Type atype[];
        boolean flag;
        int i;
        if (type4 != type1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        atype = parameterizedtype.getActualTypeArguments();
        i = 0;
        for (int j = atype.length; i < j;)
        {
            Type type5 = resolve(type, class1, atype[i]);
            type1 = atype;
            boolean flag1 = flag;
            if (type5 != atype[i])
            {
                type1 = atype;
                flag1 = flag;
                if (!flag)
                {
                    type1 = (Type[])atype.clone();
                    flag1 = true;
                }
                type1[i] = type5;
            }
            i++;
            atype = type1;
            flag = flag1;
        }

        type1 = parameterizedtype;
        if (flag)
        {
            return new ParameterizedTypeImpl(type4, parameterizedtype.getRawType(), atype);
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (type1 instanceof WildcardType)
        {
            WildcardType wildcardtype = (WildcardType)type1;
            Type atype1[] = wildcardtype.getLowerBounds();
            Type atype2[] = wildcardtype.getUpperBounds();
            if (atype1.length == 1)
            {
                type = resolve(type, class1, atype1[0]);
                type1 = wildcardtype;
                if (type != atype1[0])
                {
                    return new WildcardTypeImpl(new Type[] {
                        java/lang/Object
                    }, new Type[] {
                        type
                    });
                }
            } else
            {
                type1 = wildcardtype;
                if (atype2.length == 1)
                {
                    type = resolve(type, class1, atype2[0]);
                    type1 = wildcardtype;
                    if (type != atype2[0])
                    {
                        class1 = EMPTY_TYPE_ARRAY;
                        return new WildcardTypeImpl(new Type[] {
                            type
                        }, class1);
                    }
                }
            }
        } else
        {
            return type1;
        }
        if (true) goto _L6; else goto _L8
_L8:
    }

    private static Type resolveTypeVariable(Type type, Class class1, TypeVariable typevariable)
    {
        Class class2 = declaringClassOf(typevariable);
        if (class2 != null)
        {
            if ((type = getGenericSupertype(type, class1, class2)) instanceof ParameterizedType)
            {
                int i = indexOf(class2.getTypeParameters(), typevariable);
                return ((ParameterizedType)type).getActualTypeArguments()[i];
            }
        }
        return typevariable;
    }

    public static String typeToString(Type type)
    {
        if (type instanceof Class)
        {
            return ((Class)type).getName();
        } else
        {
            return type.toString();
        }
    }




}
