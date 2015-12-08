// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject;

import com.google.inject.internal.MoreTypes;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.util.Types;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.List;

public class TypeLiteral
{

    final int hashCode;
    final Class rawType;
    final Type type;

    protected TypeLiteral()
    {
        type = getSuperclassTypeParameter(getClass());
        rawType = MoreTypes.getRawType(type);
        hashCode = type.hashCode();
    }

    TypeLiteral(Type type1)
    {
        type = MoreTypes.canonicalize((Type)$Preconditions.checkNotNull(type1, "type"));
        rawType = MoreTypes.getRawType(type);
        hashCode = type.hashCode();
    }

    static TypeLiteral fromSuperclassTypeParameter(Class class1)
    {
        return new TypeLiteral(getSuperclassTypeParameter(class1));
    }

    public static TypeLiteral get(Class class1)
    {
        return new TypeLiteral(class1);
    }

    public static TypeLiteral get(Type type1)
    {
        return new TypeLiteral(type1);
    }

    static Type getSuperclassTypeParameter(Class class1)
    {
        class1 = class1.getGenericSuperclass();
        if (class1 instanceof Class)
        {
            throw new RuntimeException("Missing type parameter.");
        } else
        {
            return MoreTypes.canonicalize(((ParameterizedType)class1).getActualTypeArguments()[0]);
        }
    }

    private List resolveAll(Type atype[])
    {
        TypeLiteral atypeliteral[] = new TypeLiteral[atype.length];
        for (int i = 0; i < atype.length; i++)
        {
            atypeliteral[i] = resolve(atype[i]);
        }

        return $ImmutableList.of(atypeliteral);
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof TypeLiteral) && MoreTypes.equals(type, ((TypeLiteral)obj).type);
    }

    public List getExceptionTypes(Member member)
    {
        if (member instanceof Method)
        {
            member = (Method)member;
            $Preconditions.checkArgument(member.getDeclaringClass().isAssignableFrom(rawType), "%s is not defined by a supertype of %s", new Object[] {
                member, type
            });
            member = member.getGenericExceptionTypes();
        } else
        if (member instanceof Constructor)
        {
            member = (Constructor)member;
            $Preconditions.checkArgument(member.getDeclaringClass().isAssignableFrom(rawType), "%s does not construct a supertype of %s", new Object[] {
                member, type
            });
            member = member.getGenericExceptionTypes();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not a method or a constructor: ").append(member).toString());
        }
        return resolveAll(member);
    }

    public TypeLiteral getFieldType(Field field)
    {
        $Preconditions.checkArgument(field.getDeclaringClass().isAssignableFrom(rawType), "%s is not defined by a supertype of %s", new Object[] {
            field, type
        });
        return resolve(field.getGenericType());
    }

    public List getParameterTypes(Member member)
    {
        if (member instanceof Method)
        {
            member = (Method)member;
            $Preconditions.checkArgument(member.getDeclaringClass().isAssignableFrom(rawType), "%s is not defined by a supertype of %s", new Object[] {
                member, type
            });
            member = member.getGenericParameterTypes();
        } else
        if (member instanceof Constructor)
        {
            member = (Constructor)member;
            $Preconditions.checkArgument(member.getDeclaringClass().isAssignableFrom(rawType), "%s does not construct a supertype of %s", new Object[] {
                member, type
            });
            member = member.getGenericParameterTypes();
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Not a method or a constructor: ").append(member).toString());
        }
        return resolveAll(member);
    }

    public final Class getRawType()
    {
        return rawType;
    }

    public TypeLiteral getReturnType(Method method)
    {
        $Preconditions.checkArgument(method.getDeclaringClass().isAssignableFrom(rawType), "%s is not defined by a supertype of %s", new Object[] {
            method, type
        });
        return resolve(method.getGenericReturnType());
    }

    public TypeLiteral getSupertype(Class class1)
    {
        $Preconditions.checkArgument(class1.isAssignableFrom(rawType), "%s is not a supertype of %s", new Object[] {
            class1, type
        });
        return resolve(MoreTypes.getGenericSupertype(type, rawType, class1));
    }

    public final Type getType()
    {
        return type;
    }

    public final int hashCode()
    {
        return hashCode;
    }

    final TypeLiteral providerType()
    {
        return get(Types.providerOf(getType()));
    }

    TypeLiteral resolve(Type type1)
    {
        return get(resolveType(type1));
    }

    Type resolveType(Type type1)
    {
_L4:
        if (!(type1 instanceof TypeVariable)) goto _L2; else goto _L1
_L1:
        Type type2;
        TypeVariable typevariable;
        typevariable = (TypeVariable)type1;
        type2 = MoreTypes.resolveTypeVariable(type, rawType, typevariable);
        type1 = type2;
        if (type2 != typevariable) goto _L4; else goto _L3
_L3:
        type1 = type2;
_L6:
        return type1;
_L2:
        if (!(type1 instanceof GenericArrayType))
        {
            break; /* Loop/switch isn't completed */
        }
        type1 = (GenericArrayType)type1;
        Type type3 = type1.getGenericComponentType();
        Type type4 = resolveType(type3);
        if (type3 != type4)
        {
            return Types.arrayOf(type4);
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (!(type1 instanceof ParameterizedType))
        {
            break; /* Loop/switch isn't completed */
        }
        ParameterizedType parameterizedtype = (ParameterizedType)type1;
        type1 = parameterizedtype.getOwnerType();
        Type type6 = resolveType(type1);
        Type atype[];
        boolean flag;
        int i;
        if (type6 != type1)
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
            Type type7 = resolveType(atype[i]);
            type1 = atype;
            boolean flag1 = flag;
            if (type7 != atype[i])
            {
                type1 = atype;
                flag1 = flag;
                if (!flag)
                {
                    type1 = (Type[])atype.clone();
                    flag1 = true;
                }
                type1[i] = type7;
            }
            i++;
            atype = type1;
            flag = flag1;
        }

        type1 = parameterizedtype;
        if (flag)
        {
            return Types.newParameterizedTypeWithOwner(type6, parameterizedtype.getRawType(), atype);
        }
        if (true) goto _L6; else goto _L7
_L7:
        if (type1 instanceof WildcardType)
        {
            WildcardType wildcardtype = (WildcardType)type1;
            Type atype1[] = wildcardtype.getLowerBounds();
            Object obj = wildcardtype.getUpperBounds();
            if (atype1.length == 1)
            {
                obj = resolveType(atype1[0]);
                type1 = wildcardtype;
                if (obj != atype1[0])
                {
                    return Types.supertypeOf(((Type) (obj)));
                }
            } else
            {
                type1 = wildcardtype;
                if (obj.length == 1)
                {
                    Type type5 = resolveType(obj[0]);
                    type1 = wildcardtype;
                    if (type5 != obj[0])
                    {
                        return Types.subtypeOf(type5);
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

    public final String toString()
    {
        return MoreTypes.typeToString(type);
    }
}
