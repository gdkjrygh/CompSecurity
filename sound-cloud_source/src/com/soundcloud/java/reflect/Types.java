// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.reflect;

import com.soundcloud.java.checks.Preconditions;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;

final class Types
{
    private static final class GenericArrayTypeImpl
        implements Serializable, GenericArrayType
    {

        private static final long serialVersionUID = 0L;
        private final Type componentType;

        public final boolean equals(Object obj)
        {
            return (obj instanceof GenericArrayType) && Types.equals(this, (GenericArrayType)obj);
        }

        public final Type getGenericComponentType()
        {
            return componentType;
        }

        public final int hashCode()
        {
            return componentType.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder()).append(Types.typeToString(componentType)).append("[]").toString();
        }

        public GenericArrayTypeImpl(Type type)
        {
            componentType = Types.canonicalize(type);
        }
    }

    private static final class ParameterizedTypeImpl
        implements Serializable, ParameterizedType
    {

        private static final long serialVersionUID = 0L;
        private final Type ownerType;
        private final Type rawType;
        private final Type typeArguments[];

        public final boolean equals(Object obj)
        {
            return (obj instanceof ParameterizedType) && Types.equals(this, (ParameterizedType)obj);
        }

        public final Type[] getActualTypeArguments()
        {
            return (Type[])typeArguments.clone();
        }

        public final Type getOwnerType()
        {
            return ownerType;
        }

        public final Type getRawType()
        {
            return rawType;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(typeArguments) ^ rawType.hashCode() ^ Types.hashCodeOrZero(ownerType);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
            stringbuilder.append(Types.typeToString(rawType));
            if (typeArguments.length == 0)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append('<').append(Types.typeToString(typeArguments[0]));
            for (int i = 1; i < typeArguments.length; i++)
            {
                stringbuilder.append(", ").append(Types.typeToString(typeArguments[i]));
            }

            return stringbuilder.append('>').toString();
        }

        public transient ParameterizedTypeImpl(Type type, Type type1, Type atype[])
        {
            boolean flag = false;
            super();
            if (type1 instanceof Class)
            {
                Class class1 = (Class)type1;
                int i;
                boolean flag1;
                if (Modifier.isStatic(class1.getModifiers()) || class1.getEnclosingClass() == null)
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (type != null || i != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkArgument(flag1);
            }
            if (type == null)
            {
                type = null;
            } else
            {
                type = Types.canonicalize(type);
            }
            ownerType = type;
            rawType = Types.canonicalize(type1);
            typeArguments = (Type[])atype.clone();
            for (i = ((flag) ? 1 : 0); i < typeArguments.length; i++)
            {
                Preconditions.checkNotNull(typeArguments[i]);
                Types.checkNotPrimitive(typeArguments[i]);
                typeArguments[i] = Types.canonicalize(typeArguments[i]);
            }

        }
    }

    private static final class WildcardTypeImpl
        implements Serializable, WildcardType
    {

        private static final long serialVersionUID = 0L;
        private final Type lowerBound;
        private final Type upperBound;

        public final boolean equals(Object obj)
        {
            return (obj instanceof WildcardType) && Types.equals(this, (WildcardType)obj);
        }

        public final Type[] getLowerBounds()
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

        public final Type[] getUpperBounds()
        {
            return (new Type[] {
                upperBound
            });
        }

        public final int hashCode()
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

        public final String toString()
        {
            if (lowerBound != null)
            {
                return (new StringBuilder("? super ")).append(Types.typeToString(lowerBound)).toString();
            }
            if (upperBound == java/lang/Object)
            {
                return "?";
            } else
            {
                return (new StringBuilder("? extends ")).append(Types.typeToString(upperBound)).toString();
            }
        }

        public WildcardTypeImpl(Type atype[], Type atype1[])
        {
            boolean flag1 = true;
            super();
            boolean flag;
            if (atype1.length <= 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            if (atype.length == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            if (atype1.length == 1)
            {
                Preconditions.checkNotNull(atype1[0]);
                Types.checkNotPrimitive(atype1[0]);
                if (atype[0] == java/lang/Object)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                Preconditions.checkArgument(flag);
                lowerBound = Types.canonicalize(atype1[0]);
                upperBound = java/lang/Object;
                return;
            } else
            {
                Preconditions.checkNotNull(atype[0]);
                Types.checkNotPrimitive(atype[0]);
                lowerBound = null;
                upperBound = Types.canonicalize(atype[0]);
                return;
            }
        }
    }


    static final Type EMPTY_TYPE_ARRAY[] = new Type[0];

    private Types()
    {
    }

    public static Type canonicalize(Type type)
    {
        if (type instanceof Class)
        {
            type = (Class)type;
            if (type.isArray())
            {
                type = new GenericArrayTypeImpl(canonicalize(((Type) (type.getComponentType()))));
            }
            return (Type)type;
        }
        if (type instanceof ParameterizedType)
        {
            type = (ParameterizedType)type;
            return new ParameterizedTypeImpl(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType)
        {
            return new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType)
        {
            type = (WildcardType)type;
            return new WildcardTypeImpl(type.getUpperBounds(), type.getLowerBounds());
        } else
        {
            return type;
        }
    }

    private static void checkNotPrimitive(Type type)
    {
        boolean flag;
        if (!(type instanceof Class) || !((Class)type).isPrimitive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    static boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static boolean equals(Type type, Type type1)
    {
        Type type2 = type;
        type = type1;
        do
        {
            if (type2 == type)
            {
                return true;
            }
            if (type2 instanceof Class)
            {
                return type2.equals(type);
            }
            if (type2 instanceof ParameterizedType)
            {
                if (!(type instanceof ParameterizedType))
                {
                    return false;
                }
                type1 = (ParameterizedType)type2;
                type = (ParameterizedType)type;
                return equal(type1.getOwnerType(), type.getOwnerType()) && type1.getRawType().equals(type.getRawType()) && Arrays.equals(type1.getActualTypeArguments(), type.getActualTypeArguments());
            }
            if (!(type2 instanceof GenericArrayType))
            {
                break;
            }
            if (!(type instanceof GenericArrayType))
            {
                return false;
            }
            type1 = (GenericArrayType)type2;
            type = (GenericArrayType)type;
            type2 = type1.getGenericComponentType();
            type = type.getGenericComponentType();
        } while (true);
        if (type2 instanceof WildcardType)
        {
            if (!(type instanceof WildcardType))
            {
                return false;
            }
            type1 = (WildcardType)type2;
            type = (WildcardType)type;
            return Arrays.equals(type1.getUpperBounds(), type.getUpperBounds()) && Arrays.equals(type1.getLowerBounds(), type.getLowerBounds());
        }
        if (type2 instanceof TypeVariable)
        {
            if (!(type instanceof TypeVariable))
            {
                return false;
            }
            type1 = (TypeVariable)type2;
            type = (TypeVariable)type;
            return type1.getGenericDeclaration() == type.getGenericDeclaration() && type1.getName().equals(type.getName());
        } else
        {
            return false;
        }
    }

    public static Class getRawType(Type type)
    {
        do
        {
            if (type instanceof Class)
            {
                return (Class)type;
            }
            if (type instanceof ParameterizedType)
            {
                type = ((ParameterizedType)type).getRawType();
                Preconditions.checkArgument(type instanceof Class);
                return (Class)type;
            }
            if (type instanceof GenericArrayType)
            {
                return Array.newInstance(getRawType(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
            }
            if (type instanceof TypeVariable)
            {
                return java/lang/Object;
            }
            if (!(type instanceof WildcardType))
            {
                break;
            }
            type = ((WildcardType)type).getUpperBounds()[0];
        } while (true);
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

    static Type getSuperclassTypeParameter(Class class1)
    {
        class1 = class1.getGenericSuperclass();
        if (class1 instanceof Class)
        {
            throw new IllegalArgumentException("Missing type parameter.");
        } else
        {
            return canonicalize(((ParameterizedType)class1).getActualTypeArguments()[0]);
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

    public static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Type type1, Type atype[])
    {
        return new ParameterizedTypeImpl(type, type1, atype);
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
