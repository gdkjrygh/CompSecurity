// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.FinalizableReferenceQueue;
import com.google.common.base.FinalizableWeakReference;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.google.common.collect:
//            Interner, MapMaker

public final class Interners
{
    private static class InternerFunction
        implements Function
    {

        private final Interner interner;

        public Object apply(Object obj)
        {
            return interner.intern(obj);
        }

        public boolean equals(Object obj)
        {
            if (obj instanceof InternerFunction)
            {
                obj = (InternerFunction)obj;
                return interner.equals(((InternerFunction) (obj)).interner);
            } else
            {
                return false;
            }
        }

        public int hashCode()
        {
            return interner.hashCode();
        }

        public InternerFunction(Interner interner1)
        {
            interner = interner1;
        }
    }

    private static class WeakInterner
        implements Interner
    {

        private static final FinalizableReferenceQueue frq = new FinalizableReferenceQueue();
        private final ConcurrentMap map;

        public Object intern(Object obj)
        {
            final int hashCode = obj.hashCode();
            Object obj1 = ((_cls1) (obj)). new Object() {

                final WeakInterner this$0;
                final int val$hashCode;
                final Object val$sample;

                public boolean equals(Object obj)
                {
                    if (obj.hashCode() != hashCode)
                    {
                        return false;
                    } else
                    {
                        obj = (WeakInterner.InternReference)obj;
                        return sample.equals(((WeakInterner.InternReference) (obj)).get());
                    }
                }

                public int hashCode()
                {
                    return hashCode;
                }

            
            {
                this$0 = final_weakinterner;
                hashCode = i;
                sample = Object.this;
                super();
            }
            };
            obj1 = (InternReference)map.get(obj1);
            if (obj1 != null)
            {
                obj1 = ((InternReference) (obj1)).get();
                if (obj1 != null)
                {
                    return obj1;
                }
            }
            obj1 = new InternReference(obj, hashCode);
            Object obj2;
            do
            {
                obj2 = (InternReference)map.putIfAbsent(obj1, obj1);
                if (obj2 == null)
                {
                    return obj;
                }
                obj2 = ((InternReference) (obj2)).get();
            } while (obj2 == null);
            return obj2;
        }




        private WeakInterner()
        {
            map = (new MapMaker()).makeMap();
        }

    }

    class WeakInterner.InternReference extends FinalizableWeakReference
    {

        final int hashCode;
        final WeakInterner this$0;

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (obj instanceof WeakInterner.InternReference)
                {
                    obj = (WeakInterner.InternReference)obj;
                    if (((WeakInterner.InternReference) (obj)).hashCode != hashCode)
                    {
                        return false;
                    }
                    Object obj1 = super.get();
                    if (obj1 == null || !obj1.equals(((WeakInterner.InternReference) (obj)).get()))
                    {
                        return false;
                    }
                } else
                {
                    return obj.equals(this);
                }
            }
            return true;
        }

        public void finalizeReferent()
        {
            map.remove(this);
        }

        public Object get()
        {
            Object obj = super.get();
            if (obj == null)
            {
                finalizeReferent();
            }
            return obj;
        }

        public int hashCode()
        {
            return hashCode;
        }

        WeakInterner.InternReference(Object obj, int i)
        {
            this$0 = WeakInterner.this;
            super(obj, WeakInterner.frq);
            hashCode = i;
        }
    }


    private Interners()
    {
    }

    public static Function asFunction(Interner interner)
    {
        return new InternerFunction((Interner)Preconditions.checkNotNull(interner));
    }

    public static Interner newStrongInterner()
    {
        return new Interner((new MapMaker()).makeMap()) {

            final ConcurrentMap val$map;

            public Object intern(Object obj)
            {
                Object obj1 = map.putIfAbsent(Preconditions.checkNotNull(obj), obj);
                if (obj1 == null)
                {
                    return obj;
                } else
                {
                    return obj1;
                }
            }

            
            {
                map = concurrentmap;
                super();
            }
        };
    }

    public static Interner newWeakInterner()
    {
        return new WeakInterner();
    }
}
