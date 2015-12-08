// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

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

public final class on
{

    static final Type EMPTY_TYPE_ARRAY[] = new Type[0];

    public static GenericArrayType arrayOf(Type type)
    {
        class GenericArrayTypeImpl
            implements Serializable, GenericArrayType
        {

            private static final long serialVersionUID = 0L;
            private final Type componentType;

            public final boolean equals(Object obj)
            {
                return (obj instanceof GenericArrayType) && .Gson.Types.equals(this, (GenericArrayType)obj);
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
                return (new StringBuilder()).append(.Gson.Types.typeToString(componentType)).append("[]").toString();
            }

            public GenericArrayTypeImpl(Type type)
            {
                componentType = .Gson.Types.canonicalize(type);
            }
        }

        return new GenericArrayTypeImpl(type);
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
            class ParameterizedTypeImpl
                implements Serializable, ParameterizedType
            {

                private static final long serialVersionUID = 0L;
                private final Type ownerType;
                private final Type rawType;
                private final Type typeArguments[];

                public final boolean equals(Object obj)
                {
                    return (obj instanceof ParameterizedType) && .Gson.Types.equals(this, (ParameterizedType)obj);
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
                    return Arrays.hashCode(typeArguments) ^ rawType.hashCode() ^ .Gson.Types.hashCodeOrZero(ownerType);
                }

                public final String toString()
                {
                    StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
                    stringbuilder.append(.Gson.Types.typeToString(rawType));
                    if (typeArguments.length == 0)
                    {
                        return stringbuilder.toString();
                    }
                    stringbuilder.append("<").append(.Gson.Types.typeToString(typeArguments[0]));
                    for (int i = 1; i < typeArguments.length; i++)
                    {
                        stringbuilder.append(", ").append(.Gson.Types.typeToString(typeArguments[i]));
                    }

                    return stringbuilder.append(">").toString();
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
                    .Gson.Preconditions.checkArgument(flag1);
                }
                if (type == null)
                {
                    type = null;
                } else
                {
                    type = .Gson.Types.canonicalize(type);
                }
                ownerType = type;
                rawType = .Gson.Types.canonicalize(type1);
                typeArguments = (Type[])atype.clone();
                for (i = ((flag) ? 1 : 0); i < typeArguments.length; i++)
                {
                    .Gson.Preconditions.checkNotNull(typeArguments[i]);
                    .Gson.Types.checkNotPrimitive(typeArguments[i]);
                    typeArguments[i] = .Gson.Types.canonicalize(typeArguments[i]);
                }

            }
            }

            return new ParameterizedTypeImpl(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType)
        {
            return new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType)
        {
            type = (WildcardType)type;
            class WildcardTypeImpl
                implements Serializable, WildcardType
            {

                private static final long serialVersionUID = 0L;
                private final Type lowerBound;
                private final Type upperBound;

                public final boolean equals(Object obj)
                {
                    return (obj instanceof WildcardType) && .Gson.Types.equals(this, (WildcardType)obj);
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
                        return .Gson.Types.EMPTY_TYPE_ARRAY;
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
                        return (new StringBuilder("? super ")).append(.Gson.Types.typeToString(lowerBound)).toString();
                    }
                    if (upperBound == java/lang/Object)
                    {
                        return "?";
                    } else
                    {
                        return (new StringBuilder("? extends ")).append(.Gson.Types.typeToString(upperBound)).toString();
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
                .Gson.Preconditions.checkArgument(flag);
                if (atype.length == 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                .Gson.Preconditions.checkArgument(flag);
                if (atype1.length == 1)
                {
                    .Gson.Preconditions.checkNotNull(atype1[0]);
                    .Gson.Types.checkNotPrimitive(atype1[0]);
                    if (atype[0] == java/lang/Object)
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                    .Gson.Preconditions.checkArgument(flag);
                    lowerBound = .Gson.Types.canonicalize(atype1[0]);
                    upperBound = java/lang/Object;
                    return;
                } else
                {
                    .Gson.Preconditions.checkNotNull(atype[0]);
                    .Gson.Types.checkNotPrimitive(atype[0]);
                    lowerBound = null;
                    upperBound = .Gson.Types.canonicalize(atype[0]);
                    return;
                }
            }
            }

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
        ditions.checkArgument(flag);
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

    public static Type getArrayComponentType(Type type)
    {
        if (type instanceof GenericArrayType)
        {
            return ((GenericArrayType)type).getGenericComponentType();
        } else
        {
            return ((Class)type).getComponentType();
        }
    }

    public static Type getCollectionElementType(Type type, Class class1)
    {
        class1 = getSupertype(type, class1, java/util/Collection);
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

    static Type getGenericSupertype(Type type, Class class1, Class class2)
    {
        Class class3 = class1;
        class1 = type;
        type = class3;
_L3:
        if (class2 != type) goto _L2; else goto _L1
_L1:
        return class1;
_L2:
        Class aclass[];
        int i;
        int j;
        if (!class2.isInterface())
        {
            break MISSING_BLOCK_LABEL_91;
        }
        aclass = type.getInterfaces();
        i = 0;
        j = aclass.length;
_L4:
label0:
        {
            if (i >= j)
            {
                break MISSING_BLOCK_LABEL_91;
            }
            if (aclass[i] == class2)
            {
                return type.getGenericInterfaces()[i];
            }
            if (!class2.isAssignableFrom(aclass[i]))
            {
                break label0;
            }
            class1 = type.getGenericInterfaces()[i];
            type = aclass[i];
        }
          goto _L3
        i++;
          goto _L4
        class1 = class2;
        if (type.isInterface()) goto _L1; else goto _L5
_L5:
        class1 = class2;
        if (type == java/lang/Object) goto _L1; else goto _L6
_L6:
label1:
        {
            class1 = type.getSuperclass();
            if (class1 == class2)
            {
                return type.getGenericSuperclass();
            }
            if (!class2.isAssignableFrom(class1))
            {
                break label1;
            }
            Type type1 = type.getGenericSuperclass();
            type = class1;
            class1 = type1;
        }
          goto _L3
        type = class1;
          goto _L5
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class class1)
    {
        if (type == java/util/Properties)
        {
            return (new Type[] {
                java/lang/String, java/lang/String
            });
        }
        type = getSupertype(type, class1, java/util/Map);
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
                ditions.checkArgument(type instanceof Class);
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

    static Type getSupertype(Type type, Class class1, Class class2)
    {
        ditions.checkArgument(class2.isAssignableFrom(class1));
        return resolve(type, class1, getGenericSupertype(type, class1, class2));
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

    public static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Type type1, Type atype[])
    {
        return new ParameterizedTypeImpl(type, type1, atype);
    }

    public static Type resolve(Type type, Class class1, Type type1)
    {
        Type atype[] = type1;
_L12:
        if (!(atype instanceof TypeVariable)) goto _L2; else goto _L1
_L1:
        atype = (TypeVariable)atype;
        type1 = resolveTypeVariable(type, class1, atype);
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
        type = resolve(type, class1, ((Type) (atype)));
        if (atype != type)
        {
            return arrayOf(type);
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (!(atype instanceof GenericArrayType))
        {
            break; /* Loop/switch isn't completed */
        }
        type1 = (GenericArrayType)atype;
        atype = type1.getGenericComponentType();
        type = resolve(type, class1, ((Type) (atype)));
        if (atype != type)
        {
            return arrayOf(type);
        }
        if (true) goto _L3; else goto _L6
_L6:
        if (!(atype instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        ParameterizedType parameterizedtype = (ParameterizedType)atype;
        type1 = parameterizedtype.getOwnerType();
        Type type2 = resolve(type, class1, type1);
        boolean flag;
        int j;
        if (type2 != type1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        atype = parameterizedtype.getActualTypeArguments();
        j = atype.length;
        for (int i = 0; i < j;)
        {
            Type type3 = resolve(type, class1, atype[i]);
            boolean flag1 = flag;
            type1 = atype;
            if (type3 != atype[i])
            {
                flag1 = flag;
                type1 = atype;
                if (!flag)
                {
                    type1 = (Type[])atype.clone();
                    flag1 = true;
                }
                type1[i] = type3;
            }
            i++;
            flag = flag1;
            atype = type1;
        }

        type1 = parameterizedtype;
        if (flag)
        {
            return newParameterizedTypeWithOwner(type2, parameterizedtype.getRawType(), atype);
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
        type = resolve(type, class1, atype1[0]);
        type1 = wildcardtype;
        if (type != atype1[0])
        {
            return supertypeOf(type);
        }
        if (true) goto _L3; else goto _L8
_L8:
        type1 = wildcardtype;
        if (atype2.length != 1) goto _L3; else goto _L9
_L9:
        type = resolve(type, class1, atype2[0]);
        type1 = wildcardtype;
        if (type == atype2[0]) goto _L3; else goto _L10
_L10:
        return subtypeOf(type);
        if (true) goto _L12; else goto _L11
_L11:
    }

    static Type resolveTypeVariable(Type type, Class class1, TypeVariable typevariable)
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

    public static WildcardType subtypeOf(Type type)
    {
        Type atype[] = EMPTY_TYPE_ARRAY;
        return new WildcardTypeImpl(new Type[] {
            type
        }, atype);
    }

    public static WildcardType supertypeOf(Type type)
    {
        return new WildcardTypeImpl(new Type[] {
            java/lang/Object
        }, new Type[] {
            type
        });
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




    private ditions()
    {
        throw new UnsupportedOperationException();
    }
}
