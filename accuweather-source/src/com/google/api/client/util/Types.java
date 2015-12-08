// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.api.client.util:
//            Preconditions

public class Types
{

    private Types()
    {
    }

    private static Type getActualParameterAtPosition(Type type, Class class1, int i)
    {
        class1 = getSuperParameterizedType(type, class1).getActualTypeArguments()[i];
        if (class1 instanceof TypeVariable)
        {
            type = resolveTypeVariable(Arrays.asList(new Type[] {
                type
            }), (TypeVariable)class1);
            if (type != null)
            {
                return type;
            }
        }
        return class1;
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

    public static Type getBound(WildcardType wildcardtype)
    {
        Type atype[] = wildcardtype.getLowerBounds();
        if (atype.length != 0)
        {
            return atype[0];
        } else
        {
            return wildcardtype.getUpperBounds()[0];
        }
    }

    public static Type getIterableParameter(Type type)
    {
        return getActualParameterAtPosition(type, java/lang/Iterable, 0);
    }

    public static Type getMapValueParameter(Type type)
    {
        return getActualParameterAtPosition(type, java/util/Map, 1);
    }

    public static Class getRawArrayComponentType(List list, Type type)
    {
        Type type1 = type;
        if (type instanceof TypeVariable)
        {
            type1 = resolveTypeVariable(list, (TypeVariable)type);
        }
        if (type1 instanceof GenericArrayType)
        {
            return Array.newInstance(getRawArrayComponentType(list, getArrayComponentType(type1)), 0).getClass();
        }
        if (type1 instanceof Class)
        {
            return (Class)type1;
        }
        if (type1 instanceof ParameterizedType)
        {
            return getRawClass((ParameterizedType)type1);
        }
        boolean flag;
        if (type1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "wildcard type is not supported: %s", new Object[] {
            type1
        });
        return java/lang/Object;
    }

    public static Class getRawClass(ParameterizedType parameterizedtype)
    {
        return (Class)parameterizedtype.getRawType();
    }

    public static ParameterizedType getSuperParameterizedType(Type type, Class class1)
    {
        Object obj = type;
        if (type instanceof Class) goto _L2; else goto _L1
_L1:
        if (!(type instanceof ParameterizedType)) goto _L4; else goto _L3
_L3:
        obj = type;
_L2:
        if (obj == null || obj == java/lang/Object) goto _L4; else goto _L5
_L5:
        if (!(obj instanceof Class)) goto _L7; else goto _L6
_L6:
        type = (Class)obj;
_L8:
        obj = type.getGenericSuperclass();
        continue; /* Loop/switch isn't completed */
_L7:
        type = (ParameterizedType)obj;
        obj = getRawClass(type);
        if (obj == class1)
        {
            return type;
        }
        type = ((Type) (obj));
        if (class1.isInterface())
        {
            Type atype[] = ((Class) (obj)).getGenericInterfaces();
            int j = atype.length;
            int i = 0;
            do
            {
                type = ((Type) (obj));
                if (i >= j)
                {
                    break;
                }
                Type type1 = atype[i];
                if (type1 instanceof Class)
                {
                    type = (Class)type1;
                } else
                {
                    type = getRawClass((ParameterizedType)type1);
                }
                if (class1.isAssignableFrom(type))
                {
                    obj = type1;
                    continue; /* Loop/switch isn't completed */
                }
                i++;
            } while (true);
        }
        if (true) goto _L8; else goto _L4
_L4:
        return null;
        if (true) goto _L2; else goto _L9
_L9:
    }

    private static IllegalArgumentException handleExceptionForNewInstance(Exception exception, Class class1)
    {
        StringBuilder stringbuilder = (new StringBuilder("unable to create new instance of class ")).append(class1.getName());
        Object obj = new ArrayList();
        boolean flag;
        if (class1.isArray())
        {
            ((ArrayList) (obj)).add("because it is an array");
        } else
        if (class1.isPrimitive())
        {
            ((ArrayList) (obj)).add("because it is primitive");
        } else
        if (class1 == java/lang/Void)
        {
            ((ArrayList) (obj)).add("because it is void");
        } else
        {
            if (Modifier.isInterface(class1.getModifiers()))
            {
                ((ArrayList) (obj)).add("because it is an interface");
            } else
            if (Modifier.isAbstract(class1.getModifiers()))
            {
                ((ArrayList) (obj)).add("because it is abstract");
            }
            if (class1.getEnclosingClass() != null && !Modifier.isStatic(class1.getModifiers()))
            {
                ((ArrayList) (obj)).add("because it is not static");
            }
            if (!Modifier.isPublic(class1.getModifiers()))
            {
                ((ArrayList) (obj)).add("possibly because it is not public");
            } else
            {
                try
                {
                    class1.getConstructor(new Class[0]);
                }
                // Misplaced declaration of an exception variable
                catch (Class class1)
                {
                    ((ArrayList) (obj)).add("because it has no accessible default constructor");
                }
            }
        }
        flag = false;
        class1 = ((ArrayList) (obj)).iterator();
        while (class1.hasNext()) 
        {
            obj = (String)class1.next();
            if (flag)
            {
                stringbuilder.append(" and");
            } else
            {
                flag = true;
            }
            stringbuilder.append(" ").append(((String) (obj)));
        }
        return new IllegalArgumentException(stringbuilder.toString(), exception);
    }

    public static boolean isArray(Type type)
    {
        return (type instanceof GenericArrayType) || (type instanceof Class) && ((Class)type).isArray();
    }

    public static boolean isAssignableToOrFrom(Class class1, Class class2)
    {
        return class1.isAssignableFrom(class2) || class2.isAssignableFrom(class1);
    }

    public static Iterable iterableOf(Object obj)
    {
        if (obj instanceof Iterable)
        {
            return (Iterable)obj;
        }
        Class class1 = obj.getClass();
        Preconditions.checkArgument(class1.isArray(), "not an array or Iterable: %s", new Object[] {
            class1
        });
        if (!class1.getComponentType().isPrimitive())
        {
            return Arrays.asList((Object[])(Object[])obj);
        } else
        {
            return new Iterable(obj) {

                final Object val$value;

                public Iterator iterator()
                {
                    return new Iterator() {

                        int index;
                        final int length;
                        final _cls1 this$0;

                        public boolean hasNext()
                        {
                            return index < length;
                        }

                        public Object next()
                        {
                            if (!hasNext())
                            {
                                throw new NoSuchElementException();
                            } else
                            {
                                Object obj = value;
                                int i = index;
                                index = i + 1;
                                return Array.get(obj, i);
                            }
                        }

                        public void remove()
                        {
                            throw new UnsupportedOperationException();
                        }

            
            {
                this$0 = _cls1.this;
                super();
                length = Array.getLength(value);
                index = 0;
            }
                    };
                }

            
            {
                value = obj;
                super();
            }
            };
        }
    }

    public static Object newInstance(Class class1)
    {
        Object obj;
        try
        {
            obj = class1.newInstance();
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            throw handleExceptionForNewInstance(illegalaccessexception, class1);
        }
        catch (InstantiationException instantiationexception)
        {
            throw handleExceptionForNewInstance(instantiationexception, class1);
        }
        return obj;
    }

    public static Type resolveTypeVariable(List list, TypeVariable typevariable)
    {
        GenericDeclaration genericdeclaration = typevariable.getGenericDeclaration();
        if (genericdeclaration instanceof Class)
        {
            Class class1 = (Class)genericdeclaration;
            int i = list.size();
            ParameterizedType parameterizedtype = null;
            do
            {
                if (parameterizedtype != null)
                {
                    break;
                }
                i--;
                if (i < 0)
                {
                    break;
                }
                parameterizedtype = getSuperParameterizedType((Type)list.get(i), class1);
            } while (true);
            if (parameterizedtype != null)
            {
                TypeVariable atypevariable[] = genericdeclaration.getTypeParameters();
                int j = 0;
                do
                {
                    if (j >= atypevariable.length || atypevariable[j].equals(typevariable))
                    {
                        typevariable = parameterizedtype.getActualTypeArguments()[j];
                        if (typevariable instanceof TypeVariable)
                        {
                            list = resolveTypeVariable(list, (TypeVariable)typevariable);
                            if (list != null)
                            {
                                return list;
                            }
                        }
                        break;
                    }
                    j++;
                } while (true);
                return typevariable;
            }
        }
        return null;
    }

    public static Object toArray(Collection collection, Class class1)
    {
        if (class1.isPrimitive())
        {
            class1 = ((Class) (Array.newInstance(class1, collection.size())));
            int i = 0;
            Iterator iterator = collection.iterator();
            do
            {
                collection = class1;
                if (!iterator.hasNext())
                {
                    break;
                }
                Array.set(class1, i, iterator.next());
                i++;
            } while (true);
        } else
        {
            collection = ((Collection) (collection.toArray((Object[])(Object[])Array.newInstance(class1, collection.size()))));
        }
        return collection;
    }
}
