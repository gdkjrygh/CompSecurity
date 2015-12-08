// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import java.util.Collection;

// Referenced classes of package com.google.common.base:
//            e, q

public final class Predicates
{

    private static final e a = new e(",");

    public static q a()
    {
        return ObjectPredicate.ALWAYS_TRUE.withNarrowedType();
    }

    public static q a(Object obj)
    {
        if (obj == null)
        {
            return ObjectPredicate.IS_NULL.withNarrowedType();
        } else
        {
            return new IsEqualToPredicate(obj, null);
        }
    }

    public static q a(Collection collection)
    {
        return new InPredicate(collection, null);
    }


    private class ObjectPredicate extends Enum
        implements q
    {

        public static final ObjectPredicate ALWAYS_FALSE;
        public static final ObjectPredicate ALWAYS_TRUE;
        public static final ObjectPredicate IS_NULL;
        public static final ObjectPredicate NOT_NULL;
        private static final ObjectPredicate a[];

        public static ObjectPredicate valueOf(String s)
        {
            return (ObjectPredicate)Enum.valueOf(com/google/common/base/Predicates$ObjectPredicate, s);
        }

        public static ObjectPredicate[] values()
        {
            return (ObjectPredicate[])a.clone();
        }

        q withNarrowedType()
        {
            return this;
        }

        static 
        {
            class _cls1 extends ObjectPredicate
            {

                public final boolean apply(Object obj)
                {
                    return true;
                }

                public final String toString()
                {
                    return "Predicates.alwaysTrue()";
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ALWAYS_TRUE = new _cls1("ALWAYS_TRUE", 0);
            class _cls2 extends ObjectPredicate
            {

                public final boolean apply(Object obj)
                {
                    return false;
                }

                public final String toString()
                {
                    return "Predicates.alwaysFalse()";
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ALWAYS_FALSE = new _cls2("ALWAYS_FALSE", 1);
            class _cls3 extends ObjectPredicate
            {

                public final boolean apply(Object obj)
                {
                    return obj == null;
                }

                public final String toString()
                {
                    return "Predicates.isNull()";
                }

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            IS_NULL = new _cls3("IS_NULL", 2);
            class _cls4 extends ObjectPredicate
            {

                public final boolean apply(Object obj)
                {
                    return obj != null;
                }

                public final String toString()
                {
                    return "Predicates.notNull()";
                }

                _cls4(String s, int i)
                {
                    super(s, i, null);
                }
            }

            NOT_NULL = new _cls4("NOT_NULL", 3);
            a = (new ObjectPredicate[] {
                ALWAYS_TRUE, ALWAYS_FALSE, IS_NULL, NOT_NULL
            });
        }

        private ObjectPredicate(String s, int i)
        {
            super(s, i);
        }

        ObjectPredicate(String s, int i, r r)
        {
            this(s, i);
        }
    }


    private class IsEqualToPredicate
        implements q, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object target;

        public boolean apply(Object obj)
        {
            return target.equals(obj);
        }

        public boolean equals(Object obj)
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

        public int hashCode()
        {
            return target.hashCode();
        }

        public String toString()
        {
            return (new StringBuilder("Predicates.equalTo(")).append(target).append(")").toString();
        }

        private IsEqualToPredicate(Object obj)
        {
            target = obj;
        }

        IsEqualToPredicate(Object obj, r r)
        {
            this(obj);
        }
    }


    private class InPredicate
        implements q, Serializable
    {

        private static final long serialVersionUID = 0L;
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
            return (new StringBuilder("Predicates.in(")).append(target).append(")").toString();
        }

        private InPredicate(Collection collection)
        {
            target = (Collection)p.a(collection);
        }

        InPredicate(Collection collection, r r)
        {
            this(collection);
        }
    }

}
