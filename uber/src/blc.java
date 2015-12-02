// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

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

public final class blc
{

    private final Map a;

    public blc(Map map)
    {
        a = map;
    }

    private bll a(Class class1)
    {
        try
        {
            class1 = class1.getDeclaredConstructor(new Class[0]);
            if (!class1.isAccessible())
            {
                class1.setAccessible(true);
            }
            class1 = new bll(class1) {

                final Constructor a;
                final blc b;

                public final Object a()
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
                b = blc.this;
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

    private bll a(Type type, Class class1)
    {
        if (java/util/Collection.isAssignableFrom(class1))
        {
            if (java/util/SortedSet.isAssignableFrom(class1))
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new TreeSet();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            }
            if (java/util/EnumSet.isAssignableFrom(class1))
            {
                return new bll(type) {

                    final Type a;
                    final blc b;

                    public final Object a()
                    {
                        if (a instanceof ParameterizedType)
                        {
                            Type type1 = ((ParameterizedType)a).getActualTypeArguments()[0];
                            if (type1 instanceof Class)
                            {
                                return EnumSet.noneOf((Class)type1);
                            } else
                            {
                                throw new bke((new StringBuilder("Invalid EnumSet type: ")).append(a.toString()).toString());
                            }
                        } else
                        {
                            throw new bke((new StringBuilder("Invalid EnumSet type: ")).append(a.toString()).toString());
                        }
                    }

            
            {
                b = blc.this;
                a = type;
                super();
            }
                };
            }
            if (java/util/Set.isAssignableFrom(class1))
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new LinkedHashSet();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            }
            if (java/util/Queue.isAssignableFrom(class1))
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new LinkedList();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            } else
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new ArrayList();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            }
        }
        if (java/util/Map.isAssignableFrom(class1))
        {
            if (java/util/SortedMap.isAssignableFrom(class1))
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new TreeMap();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            }
            if ((type instanceof ParameterizedType) && !java/lang/String.isAssignableFrom(bmj.get(((ParameterizedType)type).getActualTypeArguments()[0]).getRawType()))
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new LinkedHashMap();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            } else
            {
                return new bll() {

                    final blc a;

                    public final Object a()
                    {
                        return new blg();
                    }

            
            {
                a = blc.this;
                super();
            }
                };
            }
        } else
        {
            return null;
        }
    }

    private bll b(Type type, Class class1)
    {
        return new bll(class1, type) {

            final Class a;
            final Type b;
            final blc c;
            private final blq d = blq.a();

            public final Object a()
            {
                Object obj;
                try
                {
                    obj = d.a(a);
                }
                catch (Exception exception)
                {
                    throw new RuntimeException((new StringBuilder("Unable to invoke no-args constructor for ")).append(b).append(". Register an InstanceCreator with Gson for this type may fix this problem.").toString(), exception);
                }
                return obj;
            }

            
            {
                c = blc.this;
                a = class1;
                b = type;
                super();
            }
        };
    }

    public final bll a(bmj bmj1)
    {
        Type type = bmj1.getType();
        Class class1 = bmj1.getRawType();
        bmj1 = (bjz)a.get(type);
        if (bmj1 != null)
        {
            bmj1 = new bll(bmj1, type) {

                final bjz a;
                final Type b;
                final blc c;

                public final Object a()
                {
                    return a.a();
                }

            
            {
                c = blc.this;
                a = bjz1;
                b = type;
                super();
            }
            };
        } else
        {
            bmj1 = (bjz)a.get(class1);
            if (bmj1 != null)
            {
                return new bll(bmj1, type) {

                    final bjz a;
                    final Type b;
                    final blc c;

                    public final Object a()
                    {
                        return a.a();
                    }

            
            {
                c = blc.this;
                a = bjz1;
                b = type;
                super();
            }
                };
            }
            bll bll = a(class1);
            bmj1 = bll;
            if (bll == null)
            {
                bll bll1 = a(type, class1);
                bmj1 = bll1;
                if (bll1 == null)
                {
                    return b(type, class1);
                }
            }
        }
        return bmj1;
    }

    public final String toString()
    {
        return a.toString();
    }
}
