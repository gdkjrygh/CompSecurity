// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            FunctionalEquivalence, PairwiseEquivalence, q, d

public abstract class Equivalence
{

    protected Equivalence()
    {
    }

    public static Equivalence equals()
    {
        return Equals.INSTANCE;
    }

    public static Equivalence identity()
    {
        return Identity.INSTANCE;
    }

    protected abstract boolean doEquivalent(Object obj, Object obj1);

    protected abstract int doHash(Object obj);

    public final boolean equivalent(Object obj, Object obj1)
    {
        if (obj == obj1)
        {
            return true;
        }
        if (obj == null || obj1 == null)
        {
            return false;
        } else
        {
            return doEquivalent(obj, obj1);
        }
    }

    public final q equivalentTo(Object obj)
    {
        return new EquivalentToPredicate(obj);
    }

    public final int hash(Object obj)
    {
        if (obj == null)
        {
            return 0;
        } else
        {
            return doHash(obj);
        }
    }

    public final Equivalence onResultOf(d d)
    {
        return new FunctionalEquivalence(d, this);
    }

    public final Equivalence pairwise()
    {
        return new PairwiseEquivalence(this);
    }

    public final Wrapper wrap(Object obj)
    {
        return new Wrapper(obj, null);
    }

    private class Equals extends Equivalence
        implements Serializable
    {

        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected final boolean doEquivalent(Object obj, Object obj1)
        {
            return obj.equals(obj1);
        }

        protected final int doHash(Object obj)
        {
            return obj.hashCode();
        }


        Equals()
        {
        }
    }


    private class Identity extends Equivalence
        implements Serializable
    {

        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1L;

        private Object readResolve()
        {
            return INSTANCE;
        }

        protected final boolean doEquivalent(Object obj, Object obj1)
        {
            return false;
        }

        protected final int doHash(Object obj)
        {
            return System.identityHashCode(obj);
        }


        Identity()
        {
        }
    }


    private class EquivalentToPredicate
        implements q, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Equivalence equivalence;
        private final Object target;

        public final boolean apply(Object obj)
        {
            return equivalence.equivalent(obj, target);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj instanceof EquivalentToPredicate)
                {
                    if (!equivalence.equals(((EquivalentToPredicate) (obj = (EquivalentToPredicate)obj)).equivalence) || !k.a(target, ((EquivalentToPredicate) (obj)).target))
                    {
                        return false;
                    }
                } else
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                equivalence, target
            });
        }

        public final String toString()
        {
            return (new StringBuilder()).append(equivalence).append(".equivalentTo(").append(target).append(")").toString();
        }

        EquivalentToPredicate(Object obj)
        {
            equivalence = (Equivalence)p.a(Equivalence.this);
            target = obj;
        }
    }


    private class Wrapper
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Equivalence equivalence;
        private final Object reference;

        public final boolean equals(Object obj)
        {
            if (obj == this)
            {
                return true;
            }
            if (obj instanceof Wrapper)
            {
                obj = (Wrapper)obj;
                if (equivalence.equals(((Wrapper) (obj)).equivalence))
                {
                    return equivalence.equivalent(reference, ((Wrapper) (obj)).reference);
                }
            }
            return false;
        }

        public final Object get()
        {
            return reference;
        }

        public final int hashCode()
        {
            return equivalence.hash(reference);
        }

        public final String toString()
        {
            return (new StringBuilder()).append(equivalence).append(".wrap(").append(reference).append(")").toString();
        }

        private Wrapper(Object obj)
        {
            equivalence = (Equivalence)p.a(Equivalence.this);
            reference = obj;
        }

        Wrapper(Object obj, c c)
        {
            this(obj);
        }
    }

}
