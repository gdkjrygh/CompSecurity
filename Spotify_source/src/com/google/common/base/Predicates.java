// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.base;

import ctw;
import ctz;
import cua;
import java.util.Arrays;

public final class Predicates
{

    private static final ctw a = ctw.a(',');

    static ctw a()
    {
        return a;
    }

    public static cua a(cua cua1, cua cua2)
    {
        return new AndPredicate(Arrays.asList(new cua[] {
            (cua)ctz.a(cua1), (cua)ctz.a(cua2)
        }), (byte)0);
    }

    public static cua a(Object obj)
    {
        if (obj == null)
        {
            return ObjectPredicate.a;
        } else
        {
            return new IsEqualToPredicate(obj, (byte)0);
        }
    }


    private class AndPredicate
        implements cua, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final List components;

        public final boolean a(Object obj)
        {
            for (int i = 0; i < components.size(); i++)
            {
                if (!((cua)components.get(i)).a(obj))
                {
                    return false;
                }
            }

            return true;
        }

        public boolean equals(Object obj)
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

        public int hashCode()
        {
            return components.hashCode() + 0x12472c2c;
        }

        public String toString()
        {
            String s = String.valueOf(String.valueOf(Predicates.a().a(components)));
            return (new StringBuilder(s.length() + 16)).append("Predicates.and(").append(s).append(")").toString();
        }

        private AndPredicate(List list)
        {
            components = list;
        }

        AndPredicate(List list, byte byte0)
        {
            this(list);
        }
    }


    private class ObjectPredicate extends Enum
        implements cua
    {

        public static final ObjectPredicate a;
        private static ObjectPredicate b;
        private static ObjectPredicate c;
        private static ObjectPredicate d;
        private static final ObjectPredicate e[];

        public static ObjectPredicate valueOf(String s)
        {
            return (ObjectPredicate)Enum.valueOf(com/google/common/base/Predicates$ObjectPredicate, s);
        }

        public static ObjectPredicate[] values()
        {
            return (ObjectPredicate[])e.clone();
        }

        static 
        {
            b = new ObjectPredicate("ALWAYS_TRUE") {

                public final boolean a(Object obj)
                {
                    return true;
                }

                public final String toString()
                {
                    return "Predicates.alwaysTrue()";
                }

            };
            c = new ObjectPredicate("ALWAYS_FALSE") {

                public final boolean a(Object obj)
                {
                    return false;
                }

                public final String toString()
                {
                    return "Predicates.alwaysFalse()";
                }

            };
            a = new ObjectPredicate("IS_NULL") {

                public final boolean a(Object obj)
                {
                    return obj == null;
                }

                public final String toString()
                {
                    return "Predicates.isNull()";
                }

            };
            d = new ObjectPredicate("NOT_NULL") {

                public final boolean a(Object obj)
                {
                    return obj != null;
                }

                public final String toString()
                {
                    return "Predicates.notNull()";
                }

            };
            e = (new ObjectPredicate[] {
                b, c, a, d
            });
        }

        private ObjectPredicate(String s, int i)
        {
            super(s, i);
        }

        ObjectPredicate(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private class IsEqualToPredicate
        implements cua, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object target;

        public final boolean a(Object obj)
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
            String s = String.valueOf(String.valueOf(target));
            return (new StringBuilder(s.length() + 20)).append("Predicates.equalTo(").append(s).append(")").toString();
        }

        private IsEqualToPredicate(Object obj)
        {
            target = obj;
        }

        IsEqualToPredicate(Object obj, byte byte0)
        {
            this(obj);
        }
    }

}
