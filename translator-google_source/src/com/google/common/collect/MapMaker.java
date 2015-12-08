// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Equivalence;
import com.google.common.base.b;
import com.google.common.base.d;
import com.google.common.base.h;
import com.google.common.base.i;
import com.google.common.base.p;
import com.google.common.base.u;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.common.collect:
//            GenericMapMaker

public final class MapMaker extends GenericMapMaker
{

    boolean b;
    int c;
    int d;
    int e;
    MapMakerInternalMap.Strength f;
    MapMakerInternalMap.Strength g;
    long h;
    long i;
    RemovalCause j;
    Equivalence k;
    u l;

    public MapMaker()
    {
        c = -1;
        d = -1;
        e = -1;
        h = -1L;
        i = -1L;
    }

    final MapMaker a(MapMakerInternalMap.Strength strength)
    {
        boolean flag1 = false;
        boolean flag;
        if (f == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Key strength was already set to %s", new Object[] {
            f
        });
        f = (MapMakerInternalMap.Strength)p.a(strength);
        flag = flag1;
        if (f != MapMakerInternalMap.Strength.SOFT)
        {
            flag = true;
        }
        p.a(flag, "Soft keys are not supported");
        if (strength != MapMakerInternalMap.Strength.STRONG)
        {
            b = true;
        }
        return this;
    }

    final ConcurrentMap a(d d1)
    {
        if (j == null)
        {
            d1 = new ComputingMapAdapter(d1);
        } else
        {
            d1 = new NullComputingConcurrentMap(d1);
        }
        return (ConcurrentMap)d1;
    }

    final void a(long l1, TimeUnit timeunit)
    {
        boolean flag;
        if (h == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "expireAfterWrite was already set to %s ns", new Object[] {
            Long.valueOf(h)
        });
        if (i == -1L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "expireAfterAccess was already set to %s ns", new Object[] {
            Long.valueOf(i)
        });
        if (l1 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "duration cannot be negative: %s %s", new Object[] {
            Long.valueOf(l1), timeunit
        });
    }

    final int b()
    {
        if (c == -1)
        {
            return 16;
        } else
        {
            return c;
        }
    }

    final int c()
    {
        if (d == -1)
        {
            return 4;
        } else
        {
            return d;
        }
    }

    final MapMakerInternalMap.Strength d()
    {
        return (MapMakerInternalMap.Strength)com.google.common.base.h.a(f, MapMakerInternalMap.Strength.STRONG);
    }

    public final String toString()
    {
        i i1 = new i(com.google.common.base.h.a(getClass()));
        if (c != -1)
        {
            i1.a("initialCapacity", c);
        }
        if (d != -1)
        {
            i1.a("concurrencyLevel", d);
        }
        if (e != -1)
        {
            i1.a("maximumSize", e);
        }
        if (h != -1L)
        {
            i1.a("expireAfterWrite", (new StringBuilder()).append(h).append("ns").toString());
        }
        if (i != -1L)
        {
            i1.a("expireAfterAccess", (new StringBuilder()).append(i).append("ns").toString());
        }
        if (f != null)
        {
            i1.a("keyStrength", com.google.common.base.b.a(f.toString()));
        }
        if (g != null)
        {
            i1.a("valueStrength", com.google.common.base.b.a(g.toString()));
        }
        if (k != null)
        {
            i1.a("keyEquivalence");
        }
        if (a != null)
        {
            i1.a("removalListener");
        }
        return i1.toString();
    }

    private class ComputingMapAdapter extends ComputingConcurrentHashMap
        implements Serializable
    {

        private static final long serialVersionUID = 0L;

        public final Object get(Object obj)
        {
            Object obj1;
            try
            {
                obj1 = getOrCompute(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = ((ExecutionException) (obj)).getCause();
                t.a(((Throwable) (obj)), com/google/common/collect/ComputationException);
                throw new ComputationException(((Throwable) (obj)));
            }
            if (obj1 == null)
            {
                throw new NullPointerException((new StringBuilder()).append(computingFunction).append(" returned null for key ").append(obj).append(".").toString());
            } else
            {
                return obj1;
            }
        }

        ComputingMapAdapter(d d1)
        {
            super(MapMaker.this, d1);
        }
    }


    private class NullComputingConcurrentMap extends NullConcurrentMap
    {
        private class NullConcurrentMap extends AbstractMap
            implements Serializable, ConcurrentMap
        {

            private static final long serialVersionUID = 0L;
            private final RemovalCause removalCause;
            private final bu removalListener;

            public boolean containsKey(Object obj)
            {
                return false;
            }

            public boolean containsValue(Object obj)
            {
                return false;
            }

            public Set entrySet()
            {
                return Collections.emptySet();
            }

            public Object get(Object obj)
            {
                return null;
            }

            void notifyRemoval(Object obj, Object obj1)
            {
                obj = new RemovalNotification(obj, obj1, removalCause);
                removalListener.onRemoval(((RemovalNotification) (obj)));
            }

            public Object put(Object obj, Object obj1)
            {
                p.a(obj);
                p.a(obj1);
                notifyRemoval(obj, obj1);
                return null;
            }

            public Object putIfAbsent(Object obj, Object obj1)
            {
                return put(obj, obj1);
            }

            public Object remove(Object obj)
            {
                return null;
            }

            public boolean remove(Object obj, Object obj1)
            {
                return false;
            }

            public Object replace(Object obj, Object obj1)
            {
                p.a(obj);
                p.a(obj1);
                return null;
            }

            public boolean replace(Object obj, Object obj1, Object obj2)
            {
                p.a(obj);
                p.a(obj2);
                return false;
            }

            NullConcurrentMap()
            {
                removalListener = a();
                removalCause = j;
            }

            private class RemovalNotification extends ImmutableEntry
            {

                private static final long serialVersionUID = 0L;
                private final RemovalCause cause;

                public final RemovalCause getCause()
                {
                    return cause;
                }

                public final boolean wasEvicted()
                {
                    return cause.wasEvicted();
                }

                RemovalNotification(Object obj, Object obj1, RemovalCause removalcause)
                {
                    super(obj, obj1);
                    cause = removalcause;
                }

                private class RemovalCause extends Enum
                {

                    public static final RemovalCause COLLECTED;
                    public static final RemovalCause EXPIRED;
                    public static final RemovalCause EXPLICIT;
                    public static final RemovalCause REPLACED;
                    public static final RemovalCause SIZE;
                    private static final RemovalCause a[];

                    public static RemovalCause valueOf(String s)
                    {
                        return (RemovalCause)Enum.valueOf(com/google/common/collect/MapMaker$RemovalCause, s);
                    }

                    public static RemovalCause[] values()
                    {
                        return (RemovalCause[])a.clone();
                    }

                    abstract boolean wasEvicted();

                    static 
                    {
                        class _cls1 extends RemovalCause
                        {

                            final boolean wasEvicted()
                            {
                                return false;
                            }

                            _cls1(String s, int i1)
                            {
                                super(s, i1, null);
                            }
                        }

                        EXPLICIT = new _cls1("EXPLICIT", 0);
                        class _cls2 extends RemovalCause
                        {

                            final boolean wasEvicted()
                            {
                                return false;
                            }

                            _cls2(String s, int i1)
                            {
                                super(s, i1, null);
                            }
                        }

                        REPLACED = new _cls2("REPLACED", 1);
                        class _cls3 extends RemovalCause
                        {

                            final boolean wasEvicted()
                            {
                                return true;
                            }

                            _cls3(String s, int i1)
                            {
                                super(s, i1, null);
                            }
                        }

                        COLLECTED = new _cls3("COLLECTED", 2);
                        class _cls4 extends RemovalCause
                        {

                            final boolean wasEvicted()
                            {
                                return true;
                            }

                            _cls4(String s, int i1)
                            {
                                super(s, i1, null);
                            }
                        }

                        EXPIRED = new _cls4("EXPIRED", 3);
                        class _cls5 extends RemovalCause
                        {

                            final boolean wasEvicted()
                            {
                                return true;
                            }

                            _cls5(String s, int i1)
                            {
                                super(s, i1, null);
                            }
                        }

                        SIZE = new _cls5("SIZE", 4);
                        a = (new RemovalCause[] {
                            EXPLICIT, REPLACED, COLLECTED, EXPIRED, SIZE
                        });
                    }

                    private RemovalCause(String s, int i1)
                    {
                        super(s, i1);
                    }

                    RemovalCause(String s, int i1, bt bt)
                    {
                        this(s, i1);
                    }
                }

            }

        }


        private static final long serialVersionUID = 0L;
        final d computingFunction;

        private Object a(Object obj)
        {
            p.a(obj);
            try
            {
                obj = computingFunction.apply(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw obj;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new ComputationException(((Throwable) (obj)));
            }
            return obj;
        }

        public final Object get(Object obj)
        {
            Object obj1 = a(obj);
            d d1 = computingFunction;
            if (obj1 == null)
            {
                throw new NullPointerException(p.a("%s returned null for key %s.", new Object[] {
                    d1, obj
                }));
            } else
            {
                notifyRemoval(obj, obj1);
                return obj1;
            }
        }

        NullComputingConcurrentMap(d d1)
        {
            computingFunction = (d)p.a(d1);
        }
    }

}
