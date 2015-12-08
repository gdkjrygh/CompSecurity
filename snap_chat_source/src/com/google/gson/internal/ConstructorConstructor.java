// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

// Referenced classes of package com.google.gson.internal:
//            ObjectConstructor, LinkedTreeMap, UnsafeAllocator

public final class ConstructorConstructor
{

    private final Map a;

    public ConstructorConstructor(Map map)
    {
        a = map;
    }

    private static ObjectConstructor a(Class class1)
    {
        try
        {
            class1 = class1.getDeclaredConstructor(new Class[0]);
            if (!class1.isAccessible())
            {
                class1.setAccessible(true);
            }
            class1 = new ObjectConstructor(class1) {

                private Constructor a;

                public final Object construct()
                {
                    Object obj;
                    try
                    {
                        obj = a.newInstance(null);
                    }
                    catch (InstantiationException instantiationexception)
                    {
                        throw new RuntimeException((new StringBuilder("Failed to invoke ")).append(a).append(" with no args").toString(), instantiationexception);
                    }
                    catch (InvocationTargetException invocationtargetexception)
                    {
                        throw new RuntimeException((new StringBuilder("Failed to invoke ")).append(a).append(" with no args").toString(), invocationtargetexception.getTargetException());
                    }
                    catch (IllegalAccessException illegalaccessexception)
                    {
                        throw new AssertionError(illegalaccessexception);
                    }
                    return obj;
                }

            
            {
                a = constructor;
                super();
            }
            };
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        return class1;
    }

    public final ObjectConstructor get(TypeToken typetoken)
    {
        Type type = typetoken.getType();
        Class class1 = typetoken.getRawType();
        typetoken = (InstanceCreator)a.get(type);
        Object obj;
        if (typetoken != null)
        {
            obj = new ObjectConstructor(typetoken, type) {

                private InstanceCreator a;
                private Type b;

                public final Object construct()
                {
                    return a.createInstance(b);
                }

            
            {
                a = instancecreator;
                b = type;
                super();
            }
            };
        } else
        {
            typetoken = (InstanceCreator)a.get(class1);
            if (typetoken != null)
            {
                return new ObjectConstructor(typetoken, type) {

                    private InstanceCreator a;
                    private Type b;

                    public final Object construct()
                    {
                        return a.createInstance(b);
                    }

            
            {
                a = instancecreator;
                b = type;
                super();
            }
                };
            }
            typetoken = a(class1);
            obj = typetoken;
            if (typetoken == null)
            {
                if (java/util/Collection.isAssignableFrom(class1))
                {
                    if (java/util/SortedSet.isAssignableFrom(class1))
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new TreeSet();
                            }

                        };
                    } else
                    if (java/util/EnumSet.isAssignableFrom(class1))
                    {
                        typetoken = new ObjectConstructor(type) {

                            private Type a;

                            public final Object construct()
                            {
                                if (a instanceof ParameterizedType)
                                {
                                    Type type1 = ((ParameterizedType)a).getActualTypeArguments()[0];
                                    if (type1 instanceof Class)
                                    {
                                        return EnumSet.noneOf((Class)type1);
                                    } else
                                    {
                                        throw new JsonIOException((new StringBuilder("Invalid EnumSet type: ")).append(a.toString()).toString());
                                    }
                                } else
                                {
                                    throw new JsonIOException((new StringBuilder("Invalid EnumSet type: ")).append(a.toString()).toString());
                                }
                            }

            
            {
                a = type;
                super();
            }
                        };
                    } else
                    if (java/util/Set.isAssignableFrom(class1))
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new LinkedHashSet();
                            }

                        };
                    } else
                    if (java/util/Queue.isAssignableFrom(class1))
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new LinkedList();
                            }

                        };
                    } else
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new ArrayList();
                            }

                        };
                    }
                } else
                if (java/util/Map.isAssignableFrom(class1))
                {
                    if (java/util/SortedMap.isAssignableFrom(class1))
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new TreeMap();
                            }

                        };
                    } else
                    if ((type instanceof ParameterizedType) && !java/lang/String.isAssignableFrom(TypeToken.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType()))
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new LinkedHashMap();
                            }

                        };
                    } else
                    {
                        typetoken = new ObjectConstructor() {

                            public final Object construct()
                            {
                                return new LinkedTreeMap();
                            }

                        };
                    }
                } else
                {
                    typetoken = null;
                }
                obj = typetoken;
                if (typetoken == null)
                {
                    return new ObjectConstructor(class1, type) {

                        private final UnsafeAllocator a = UnsafeAllocator.create();
                        private Class b;
                        private Type c;

                        public final Object construct()
                        {
                            Object obj1;
                            try
                            {
                                obj1 = a.newInstance(b);
                            }
                            catch (Exception exception)
                            {
                                throw new RuntimeException((new StringBuilder("Unable to invoke no-args constructor for ")).append(c).append(". Register an InstanceCreator with Gson for this type may fix this problem.").toString(), exception);
                            }
                            return obj1;
                        }

            
            {
                b = class1;
                c = type;
                super();
            }
                    };
                }
            }
        }
        return ((ObjectConstructor) (obj));
    }

    public final String toString()
    {
        return a.toString();
    }
}
