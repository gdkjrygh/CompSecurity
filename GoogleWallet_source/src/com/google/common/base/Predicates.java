// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.common.base:
//            Joiner, Preconditions, Predicate

public final class Predicates
{
    static final class AndPredicate
        implements Predicate, Serializable
    {

        private final List components;

        public final boolean apply(Object obj)
        {
            for (int i = 0; i < components.size(); i++)
            {
                if (!((Predicate)components.get(i)).apply(obj))
                {
                    return false;
                }
            }

            return true;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof AndPredicate)
            {
                obj = (AndPredicate)obj;
                return components.equals(((AndPredicate) (obj)).components);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return components.hashCode() + 0x12472c2c;
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.and(")).append(Predicates.COMMA_JOINER.join(components)).append(")").toString();
        }

        private AndPredicate(List list)
        {
            components = list;
        }

    }

    static final class InPredicate
        implements Predicate, Serializable
    {

        private final Collection target;

        public final boolean apply(Object obj)
        {
            boolean flag;
            try
            {
                flag = target.contains(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            return flag;
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof InPredicate)
            {
                obj = (InPredicate)obj;
                return target.equals(((InPredicate) (obj)).target);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return target.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.in(")).append(target).append(")").toString();
        }

        private InPredicate(Collection collection)
        {
            target = (Collection)Preconditions.checkNotNull(collection);
        }

    }

    static final class IsEqualToPredicate
        implements Predicate, Serializable
    {

        private final Object target;

        public final boolean apply(Object obj)
        {
            return target.equals(obj);
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof IsEqualToPredicate)
            {
                obj = (IsEqualToPredicate)obj;
                return target.equals(((IsEqualToPredicate) (obj)).target);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return target.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.equalTo(")).append(target).append(")").toString();
        }

        private IsEqualToPredicate(Object obj)
        {
            target = obj;
        }

    }

    static final class NotPredicate
        implements Predicate, Serializable
    {

        final Predicate predicate;

        public final boolean apply(Object obj)
        {
            return !predicate.apply(obj);
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof NotPredicate)
            {
                obj = (NotPredicate)obj;
                return predicate.equals(((NotPredicate) (obj)).predicate);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return ~predicate.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.not(")).append(predicate.toString()).append(")").toString();
        }

        NotPredicate(Predicate predicate1)
        {
            predicate = (Predicate)Preconditions.checkNotNull(predicate1);
        }
    }

    static abstract class ObjectPredicate extends Enum
        implements Predicate
    {

        private static final ObjectPredicate $VALUES[];
        public static final ObjectPredicate ALWAYS_FALSE;
        public static final ObjectPredicate ALWAYS_TRUE;
        public static final ObjectPredicate IS_NULL;
        public static final ObjectPredicate NOT_NULL;

        public static ObjectPredicate valueOf(String s)
        {
            return (ObjectPredicate)Enum.valueOf(com/google/common/base/Predicates$ObjectPredicate, s);
        }

        public static ObjectPredicate[] values()
        {
            return (ObjectPredicate[])$VALUES.clone();
        }

        final Predicate withNarrowedType()
        {
            return this;
        }

        static 
        {
            ALWAYS_TRUE = new ObjectPredicate("ALWAYS_TRUE", 0) {

                public final boolean apply(Object obj)
                {
                    return true;
                }

                public final String toString()
                {
                    return "Predicates.alwaysTrue()";
                }

            };
            ALWAYS_FALSE = new ObjectPredicate("ALWAYS_FALSE", 1) {

                public final boolean apply(Object obj)
                {
                    return false;
                }

                public final String toString()
                {
                    return "Predicates.alwaysFalse()";
                }

            };
            IS_NULL = new ObjectPredicate("IS_NULL", 2) {

                public final boolean apply(Object obj)
                {
                    return obj == null;
                }

                public final String toString()
                {
                    return "Predicates.isNull()";
                }

            };
            NOT_NULL = new ObjectPredicate("NOT_NULL", 3) {

                public final boolean apply(Object obj)
                {
                    return obj != null;
                }

                public final String toString()
                {
                    return "Predicates.notNull()";
                }

            };
            $VALUES = (new ObjectPredicate[] {
                ALWAYS_TRUE, ALWAYS_FALSE, IS_NULL, NOT_NULL
            });
        }

        private ObjectPredicate(String s, int i)
        {
            super(s, i);
        }

    }


    private static final Joiner COMMA_JOINER = Joiner.on(',');

    public static Predicate and(Predicate predicate, Predicate predicate1)
    {
        return new AndPredicate(asList((Predicate)Preconditions.checkNotNull(predicate), (Predicate)Preconditions.checkNotNull(predicate1)));
    }

    public static transient Predicate and(Predicate apredicate[])
    {
        return new AndPredicate(defensiveCopy(apredicate));
    }

    private static List asList(Predicate predicate, Predicate predicate1)
    {
        return Arrays.asList(new Predicate[] {
            predicate, predicate1
        });
    }

    private static List defensiveCopy(Iterable iterable)
    {
        ArrayList arraylist = new ArrayList();
        for (iterable = iterable.iterator(); iterable.hasNext(); arraylist.add(Preconditions.checkNotNull(iterable.next()))) { }
        return arraylist;
    }

    private static transient List defensiveCopy(Object aobj[])
    {
        return defensiveCopy(((Iterable) (Arrays.asList(aobj))));
    }

    public static Predicate equalTo(Object obj)
    {
        if (obj == null)
        {
            return isNull();
        } else
        {
            return new IsEqualToPredicate(obj);
        }
    }

    public static Predicate in(Collection collection)
    {
        return new InPredicate(collection);
    }

    private static Predicate isNull()
    {
        return ObjectPredicate.IS_NULL.withNarrowedType();
    }

    public static Predicate not(Predicate predicate)
    {
        return new NotPredicate(predicate);
    }

    public static Predicate notNull()
    {
        return ObjectPredicate.NOT_NULL.withNarrowedType();
    }


}
