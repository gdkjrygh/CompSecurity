// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collection;

// Referenced classes of package com.google.common.base:
//            Joiner, Predicate

public final class Predicates
{

    private static final Joiner COMMA_JOINER = Joiner.on(",");

    private Predicates()
    {
    }

    public static Predicate in(Collection collection)
    {
        return new InPredicate(collection, null);
    }

    public static Predicate not(Predicate predicate)
    {
        return new NotPredicate(predicate);
    }


    private class InPredicate
        implements Predicate, Serializable
    {

        private final Collection target;

        public boolean apply(Object obj)
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

        public boolean equals(Object obj)
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

        public int hashCode()
        {
            return target.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("In(").append(target).append(")").toString();
        }

        private InPredicate(Collection collection)
        {
            target = (Collection)Preconditions.checkNotNull(collection);
        }

        InPredicate(Collection collection, _cls1 _pcls1)
        {
            this(collection);
        }
    }


    private class NotPredicate
        implements Predicate, Serializable
    {

        final Predicate predicate;

        public boolean apply(Object obj)
        {
            return !predicate.apply(obj);
        }

        public boolean equals(Object obj)
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

        public int hashCode()
        {
            return ~predicate.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder()).append("Not(").append(predicate.toString()).append(")").toString();
        }

        NotPredicate(Predicate predicate1)
        {
            predicate = (Predicate)Preconditions.checkNotNull(predicate1);
        }
    }

}
