// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;


// Referenced classes of package com.google.common.base:
//            PairwiseEquivalence, Equivalence

public final class Equivalences
{
    private static abstract class Impl extends Enum
        implements Equivalence
    {

        private static final Impl $VALUES[];
        public static final Impl EQUALS;
        public static final Impl IDENTITY;

        public static Impl valueOf(String s)
        {
            return (Impl)Enum.valueOf(com/google/common/base/Equivalences$Impl, s);
        }

        public static Impl[] values()
        {
            return (Impl[])$VALUES.clone();
        }

        static 
        {
            EQUALS = new Impl("EQUALS", 0) {

                public boolean equivalent(Object obj, Object obj1)
                {
                    if (obj == null)
                    {
                        return obj1 == null;
                    } else
                    {
                        return obj.equals(obj1);
                    }
                }

                public int hash(Object obj)
                {
                    if (obj == null)
                    {
                        return 0;
                    } else
                    {
                        return obj.hashCode();
                    }
                }

            };
            IDENTITY = new Impl("IDENTITY", 1) {

                public boolean equivalent(Object obj, Object obj1)
                {
                    return obj == obj1;
                }

                public int hash(Object obj)
                {
                    return System.identityHashCode(obj);
                }

            };
            $VALUES = (new Impl[] {
                EQUALS, IDENTITY
            });
        }

        private Impl(String s, int i)
        {
            super(s, i);
        }

    }


    private Equivalences()
    {
    }

    public static Equivalence equals()
    {
        return Impl.EQUALS;
    }

    public static Equivalence identity()
    {
        return Impl.IDENTITY;
    }

    public static Equivalence pairwise(Equivalence equivalence)
    {
        return new PairwiseEquivalence(equivalence);
    }
}
