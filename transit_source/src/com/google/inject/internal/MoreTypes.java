// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal;

import com.google.inject.ConfigurationException;
import com.google.inject.TypeLiteral;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.util.Types;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import javax.inject.Provider;

// Referenced classes of package com.google.inject.internal:
//            Errors

public class MoreTypes
{
    private static interface CompositeType
    {

        public abstract boolean isFullySpecified();
    }

    public static class GenericArrayTypeImpl
        implements GenericArrayType, Serializable, CompositeType
    {

        private static final long serialVersionUID = 0L;
        private final Type componentType;

        public boolean equals(Object obj)
        {
            return (obj instanceof GenericArrayType) && MoreTypes.equals(this, (GenericArrayType)obj);
        }

        public Type getGenericComponentType()
        {
            return componentType;
        }

        public int hashCode()
        {
            return componentType.hashCode();
        }

        public boolean isFullySpecified()
        {
            return MoreTypes.isFullySpecified(componentType);
        }

        public String toString()
        {
            return (new StringBuilder()).append(MoreTypes.typeToString(componentType)).append("[]").toString();
        }

        public GenericArrayTypeImpl(Type type)
        {
            componentType = MoreTypes.canonicalize(type);
        }
    }

    public static class ParameterizedTypeImpl
        implements ParameterizedType, Serializable, CompositeType
    {

        private static final long serialVersionUID = 0L;
        private final Type ownerType;
        private final Type rawType;
        private final Type typeArguments[];

        public boolean equals(Object obj)
        {
            return (obj instanceof ParameterizedType) && MoreTypes.equals(this, (ParameterizedType)obj);
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
            return Arrays.hashCode(typeArguments) ^ rawType.hashCode() ^ MoreTypes.hashCodeOrZero(ownerType);
        }

        public boolean isFullySpecified()
        {
_L2:
            return false;
            if (ownerType != null && !MoreTypes.isFullySpecified(ownerType) || !MoreTypes.isFullySpecified(rawType)) goto _L2; else goto _L1
_L1:
            Type atype[] = typeArguments;
            int j = atype.length;
            int i = 0;
label0:
            do
            {
label1:
                {
                    if (i >= j)
                    {
                        break label1;
                    }
                    if (!MoreTypes.isFullySpecified(atype[i]))
                    {
                        break label0;
                    }
                    i++;
                }
            } while (true);
            if (true) goto _L2; else goto _L3
_L3:
            return true;
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((typeArguments.length + 1) * 30);
            stringbuilder.append(MoreTypes.typeToString(rawType));
            if (typeArguments.length == 0)
            {
                return stringbuilder.toString();
            }
            stringbuilder.append("<").append(MoreTypes.typeToString(typeArguments[0]));
            for (int i = 1; i < typeArguments.length; i++)
            {
                stringbuilder.append(", ").append(MoreTypes.typeToString(typeArguments[i]));
            }

            return stringbuilder.append(">").toString();
        }

        public transient ParameterizedTypeImpl(Type type, Type type1, Type atype[])
        {
            if (type1 instanceof Class)
            {
                Class class1 = (Class)type1;
                int i;
                boolean flag;
                if (type != null || class1.getEnclosingClass() == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $Preconditions.checkArgument(flag, "No owner type for enclosed %s", new Object[] {
                    type1
                });
                if (type == null || class1.getEnclosingClass() != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                $Preconditions.checkArgument(flag, "Owner type for unenclosed %s", new Object[] {
                    type1
                });
            }
            if (type == null)
            {
                type = null;
            } else
            {
                type = MoreTypes.canonicalize(type);
            }
            ownerType = type;
            rawType = MoreTypes.canonicalize(type1);
            typeArguments = (Type[])atype.clone();
            for (i = 0; i < typeArguments.length; i++)
            {
                $Preconditions.checkNotNull(typeArguments[i], "type parameter");
                MoreTypes.checkNotPrimitive(typeArguments[i], "type parameters");
                typeArguments[i] = MoreTypes.canonicalize(typeArguments[i]);
            }

        }
    }

    public static class WildcardTypeImpl
        implements WildcardType, Serializable, CompositeType
    {

        private static final long serialVersionUID = 0L;
        private final Type lowerBound;
        private final Type upperBound;

        public boolean equals(Object obj)
        {
            return (obj instanceof WildcardType) && MoreTypes.equals(this, (WildcardType)obj);
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
                return MoreTypes.EMPTY_TYPE_ARRAY;
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

        public boolean isFullySpecified()
        {
            return MoreTypes.isFullySpecified(upperBound) && (lowerBound == null || MoreTypes.isFullySpecified(lowerBound));
        }

        public String toString()
        {
            if (lowerBound != null)
            {
                return (new StringBuilder()).append("? super ").append(MoreTypes.typeToString(lowerBound)).toString();
            }
            if (upperBound == java/lang/Object)
            {
                return "?";
            } else
            {
                return (new StringBuilder()).append("? extends ").append(MoreTypes.typeToString(upperBound)).toString();
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
            $Preconditions.checkArgument(flag, "Must have at most one lower bound.");
            if (atype.length == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $Preconditions.checkArgument(flag, "Must have exactly one upper bound.");
            if (atype1.length == 1)
            {
                $Preconditions.checkNotNull(atype1[0], "lowerBound");
                MoreTypes.checkNotPrimitive(atype1[0], "wildcard bounds");
                if (atype[0] == java/lang/Object)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                $Preconditions.checkArgument(flag, "bounded both ways");
                lowerBound = MoreTypes.canonicalize(atype1[0]);
                upperBound = java/lang/Object;
                return;
            } else
            {
                $Preconditions.checkNotNull(atype[0], "upperBound");
                MoreTypes.checkNotPrimitive(atype[0], "wildcard bounds");
                lowerBound = null;
                upperBound = MoreTypes.canonicalize(atype[0]);
                return;
            }
        }
    }


    public static final Type EMPTY_TYPE_ARRAY[] = new Type[0];
    private static final Map PRIMITIVE_TO_WRAPPER;

    private MoreTypes()
    {
    }

    public static Type canonicalize(Type type)
    {
        Object obj;
        if (type instanceof Class)
        {
            obj = (Class)type;
            type = ((Type) (obj));
            if (((Class) (obj)).isArray())
            {
                type = new GenericArrayTypeImpl(canonicalize(((Type) (((Class) (obj)).getComponentType()))));
            }
            obj = type;
        } else
        {
            obj = type;
            if (!(type instanceof CompositeType))
            {
                if (type instanceof ParameterizedType)
                {
                    type = (ParameterizedType)type;
                    return new ParameterizedTypeImpl(type.getOwnerType(), type.getRawType(), type.getActualTypeArguments());
                }
                if (type instanceof GenericArrayType)
                {
                    return new GenericArrayTypeImpl(((GenericArrayType)type).getGenericComponentType());
                }
                obj = type;
                if (type instanceof WildcardType)
                {
                    type = (WildcardType)type;
                    return new WildcardTypeImpl(type.getUpperBounds(), type.getLowerBounds());
                }
            }
        }
        return ((Type) (obj));
    }

    public static TypeLiteral canonicalizeForKey(TypeLiteral typeliteral)
    {
        Object obj = typeliteral.getType();
        if (!isFullySpecified(((Type) (obj))))
        {
            throw new ConfigurationException((new Errors()).keyNotFullySpecified(typeliteral).getMessages());
        }
        if (typeliteral.getRawType() == javax/inject/Provider)
        {
            return TypeLiteral.get(Types.providerOf(((ParameterizedType)obj).getActualTypeArguments()[0]));
        }
        obj = (TypeLiteral)PRIMITIVE_TO_WRAPPER.get(typeliteral);
        if (obj != null)
        {
            typeliteral = ((TypeLiteral) (obj));
        }
        return typeliteral;
    }

    private static void checkNotPrimitive(Type type, String s)
    {
        boolean flag;
        if (!(type instanceof Class) || !((Class)type).isPrimitive())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $Preconditions.checkArgument(flag, "Primitive types are not allowed in %s: %s", new Object[] {
            s, type
        });
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
            if ($Objects.equal(type.getOwnerType(), type1.getOwnerType()) && type.getRawType().equals(type1.getRawType()) && Arrays.equals(type.getActualTypeArguments(), type1.getActualTypeArguments()))
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

    public static Type getGenericSupertype(Type type, Class class1, Class class2)
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
            Type type1 = ((ParameterizedType)type).getRawType();
            $Preconditions.checkArgument(type1 instanceof Class, "Expected a Class, but <%s> is of type %s", new Object[] {
                type, type.getClass().getName()
            });
            return (Class)type1;
        }
        if (type instanceof GenericArrayType)
        {
            return Array.newInstance(getRawType(((GenericArrayType)type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable)
        {
            return java/lang/Object;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Expected a Class, ParameterizedType, or GenericArrayType, but <").append(type).append("> is of type ").append(type.getClass().getName()).toString());
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

    private static boolean isFullySpecified(Type type)
    {
        if (type instanceof Class)
        {
            return true;
        }
        if (type instanceof CompositeType)
        {
            return ((CompositeType)type).isFullySpecified();
        }
        if (type instanceof TypeVariable)
        {
            return false;
        } else
        {
            return ((CompositeType)canonicalize(type)).isFullySpecified();
        }
    }

    public static Type resolveTypeVariable(Type type, Class class1, TypeVariable typevariable)
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

    static 
    {
        PRIMITIVE_TO_WRAPPER = (new com.google.inject.internal.util..ImmutableMap.Builder()).put(TypeLiteral.get(Boolean.TYPE), TypeLiteral.get(java/lang/Boolean)).put(TypeLiteral.get(Byte.TYPE), TypeLiteral.get(java/lang/Byte)).put(TypeLiteral.get(Short.TYPE), TypeLiteral.get(java/lang/Short)).put(TypeLiteral.get(Integer.TYPE), TypeLiteral.get(java/lang/Integer)).put(TypeLiteral.get(Long.TYPE), TypeLiteral.get(java/lang/Long)).put(TypeLiteral.get(Float.TYPE), TypeLiteral.get(java/lang/Float)).put(TypeLiteral.get(Double.TYPE), TypeLiteral.get(java/lang/Double)).put(TypeLiteral.get(Character.TYPE), TypeLiteral.get(java/lang/Character)).put(TypeLiteral.get(Void.TYPE), TypeLiteral.get(java/lang/Void)).build();
    }



}
