// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

public final class canonicalize
{
    static final class a
        implements Serializable, GenericArrayType
    {

        private final Type a;

        public final boolean equals(Object obj)
        {
            return (obj instanceof GenericArrayType) && .Gson.Types.equals(this, (GenericArrayType)obj);
        }

        public final Type getGenericComponentType()
        {
            return a;
        }

        public final int hashCode()
        {
            return a.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder()).append(.Gson.Types.typeToString(a)).append("[]").toString();
        }

        public a(Type type)
        {
            a = .Gson.Types.canonicalize(type);
        }
    }

    static final class b
        implements Serializable, ParameterizedType
    {

        private final Type a;
        private final Type b;
        private final Type c[];

        public final boolean equals(Object obj)
        {
            return (obj instanceof ParameterizedType) && .Gson.Types.equals(this, (ParameterizedType)obj);
        }

        public final Type[] getActualTypeArguments()
        {
            return (Type[])c.clone();
        }

        public final Type getOwnerType()
        {
            return a;
        }

        public final Type getRawType()
        {
            return b;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(c) ^ b.hashCode() ^ .Gson.Types.a(a);
        }

        public final String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((c.length + 1) * 30);
            stringbuilder.append(.Gson.Types.typeToString(b));
            if (c.length == 0)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append("<").append(.Gson.Types.typeToString(c[0]));
            for (int i = 1; i < c.length; i++)
            {
                stringbuilder.append(", ").append(.Gson.Types.typeToString(c[i]));
            }

            return stringbuilder.append(">").toString();
        }

        public transient b(Type type, Type type1, Type atype[])
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
            a = type;
            b = .Gson.Types.canonicalize(type1);
            c = (Type[])atype.clone();
            for (i = ((flag) ? 1 : 0); i < c.length; i++)
            {
                .Gson.Preconditions.checkNotNull(c[i]);
                .Gson.Types.a(c[i]);
                c[i] = .Gson.Types.canonicalize(c[i]);
            }

        }
    }

    static final class c
        implements Serializable, WildcardType
    {

        private final Type a;
        private final Type b;

        public final boolean equals(Object obj)
        {
            return (obj instanceof WildcardType) && .Gson.Types.equals(this, (WildcardType)obj);
        }

        public final Type[] getLowerBounds()
        {
            if (b != null)
            {
                return (new Type[] {
                    b
                });
            } else
            {
                return .Gson.Types.a;
            }
        }

        public final Type[] getUpperBounds()
        {
            return (new Type[] {
                a
            });
        }

        public final int hashCode()
        {
            int i;
            if (b != null)
            {
                i = b.hashCode() + 31;
            } else
            {
                i = 1;
            }
            return i ^ a.hashCode() + 31;
        }

        public final String toString()
        {
            if (b != null)
            {
                return (new StringBuilder("? super ")).append(.Gson.Types.typeToString(b)).toString();
            }
            if (a == java/lang/Object)
            {
                return "?";
            } else
            {
                return (new StringBuilder("? extends ")).append(.Gson.Types.typeToString(a)).toString();
            }
        }

        public c(Type atype[], Type atype1[])
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
                .Gson.Types.a(atype1[0]);
                if (atype[0] == java/lang/Object)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                .Gson.Preconditions.checkArgument(flag);
                b = .Gson.Types.canonicalize(atype1[0]);
                a = java/lang/Object;
                return;
            } else
            {
                .Gson.Preconditions.checkNotNull(atype[0]);
                .Gson.Types.a(atype[0]);
                b = null;
                a = .Gson.Types.canonicalize(atype[0]);
                return;
            }
        }
    }


    static final Type a[] = new Type[0];

    static int a(Object obj)
    {
        if (obj != null)
        {
            return obj.hashCode();
        } else
        {
            return 0;
        }
    }

    private static Type a(Type type, Class class1, Class class2)
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

    static void a(Type type)
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

    public static GenericArrayType arrayOf(Type type)
    {
        return new a(type);
    }

    private static Type b(Type type, Class class1, Class class2)
    {
        ditions.checkArgument(class2.isAssignableFrom(class1));
        return resolve(type, class1, a(type, class1, class2));
    }

    public static Type canonicalize(Type type)
    {
        if (type instanceof Class)
        {
            type = (Class)type;
            if (type.isArray())
            {
                type = new a(canonicalize(((Type) (type.getComponentType()))));
            }
            return (Type)type;
        }
        if (type instanceof ParameterizedType)
        {
            type = (ParameterizedType)type;
            return new b(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType)
        {
            return new a(((GenericArrayType)type).getGenericComponentType());
        }
        if (type instanceof WildcardType)
        {
            type = (WildcardType)type;
            return new c(type.getUpperBounds(), type.getLowerBounds());
        } else
        {
            return type;
        }
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
                type2 = type1.getOwnerType();
                Type type3 = type.getOwnerType();
                boolean flag;
                if (type2 == type3 || type2 != null && type2.equals(type3))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                return flag && type1.getRawType().equals(type.getRawType()) && Arrays.equals(type1.getActualTypeArguments(), type.getActualTypeArguments());
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

    public static Type[] getMapKeyAndValueTypes(Type type, Class class1)
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

    public static transient ParameterizedType newParameterizedTypeWithOwner(Type type, Type type1, Type atype[])
    {
        return new b(type, type1, atype);
    }

    public static Type resolve(Type type, Class class1, Type type1)
    {
        Type atype[];
        int j;
        j = 0;
        atype = type1;
_L11:
        if (!(atype instanceof TypeVariable)) goto _L2; else goto _L1
_L1:
        TypeVariable typevariable;
        int i;
        typevariable = (TypeVariable)atype;
        type1 = typevariable.getGenericDeclaration();
        if (type1 instanceof Class)
        {
            type1 = (Class)type1;
        } else
        {
            type1 = null;
        }
        if (type1 == null) goto _L4; else goto _L3
_L3:
        atype = a(type, class1, type1);
        if (!(atype instanceof ParameterizedType)) goto _L4; else goto _L5
_L5:
        type1 = type1.getTypeParameters();
        i = 0;
_L12:
        if (i >= type1.length) goto _L7; else goto _L6
_L6:
        if (!typevariable.equals(type1[i])) goto _L9; else goto _L8
_L8:
        type1 = ((ParameterizedType)atype).getActualTypeArguments()[i];
_L13:
        atype = type1;
        if (type1 != typevariable) goto _L11; else goto _L10
_L10:
        return type1;
_L9:
        i++;
          goto _L12
_L7:
        throw new NoSuchElementException();
_L4:
        type1 = typevariable;
          goto _L13
_L2:
        WildcardType wildcardtype;
        Type atype2[];
        if ((atype instanceof Class) && ((Class)atype).isArray())
        {
            type1 = (Class)atype;
            atype = type1.getComponentType();
            type = resolve(type, class1, ((Type) (atype)));
            if (atype != type)
            {
                return arrayOf(type);
            }
        } else
        if (atype instanceof GenericArrayType)
        {
            type1 = (GenericArrayType)atype;
            atype = type1.getGenericComponentType();
            type = resolve(type, class1, ((Type) (atype)));
            if (atype != type)
            {
                return arrayOf(type);
            }
        } else
        if (atype instanceof ParameterizedType)
        {
            ParameterizedType parameterizedtype = (ParameterizedType)atype;
            type1 = parameterizedtype.getOwnerType();
            Type type2 = resolve(type, class1, type1);
            boolean flag;
            if (type2 != type1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            atype = parameterizedtype.getActualTypeArguments();
            for (int k = atype.length; j < k;)
            {
                Type type3 = resolve(type, class1, atype[j]);
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
                return newParameterizedTypeWithOwner(type2, parameterizedtype.getRawType(), atype);
            }
        } else
        {
            type1 = atype;
            if (atype instanceof WildcardType)
            {
label0:
                {
                    wildcardtype = (WildcardType)atype;
                    Type atype1[] = wildcardtype.getLowerBounds();
                    atype2 = wildcardtype.getUpperBounds();
                    if (atype1.length != 1)
                    {
                        break label0;
                    }
                    type = resolve(type, class1, atype1[0]);
                    type1 = wildcardtype;
                    if (type != atype1[0])
                    {
                        return supertypeOf(type);
                    }
                }
            }
        }
          goto _L10
        type1 = wildcardtype;
        if (atype2.length != 1) goto _L10; else goto _L14
_L14:
        type = resolve(type, class1, atype2[0]);
        type1 = wildcardtype;
        if (type == atype2[0]) goto _L10; else goto _L15
_L15:
        return subtypeOf(type);
          goto _L12
    }

    public static WildcardType subtypeOf(Type type)
    {
        Type atype[] = a;
        return new c(new Type[] {
            type
        }, atype);
    }

    public static WildcardType supertypeOf(Type type)
    {
        return new c(new Type[] {
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

}
