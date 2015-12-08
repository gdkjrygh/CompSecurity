// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.io.Serializable;
import java.util.Collection;

// Referenced classes of package com.google.android.m4b.maps.y:
//            g, k, j

public final class l
{
    static final class a
        implements k, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Collection a;

        public final boolean a(Object obj)
        {
            boolean flag;
            try
            {
                flag = a.contains(obj);
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
            if (obj instanceof a)
            {
                obj = (a)obj;
                return a.equals(((a) (obj)).a);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return a.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.in(")).append(a).append(")").toString();
        }

        private a(Collection collection)
        {
            a = (Collection)j.a(collection);
        }

        a(Collection collection, byte byte0)
        {
            this(collection);
        }
    }

    static final class b
        implements k, Serializable
    {

        private static final long serialVersionUID = 0L;
        private final Object a;

        public final boolean a(Object obj)
        {
            return a.equals(obj);
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof b)
            {
                obj = (b)obj;
                return a.equals(((b) (obj)).a);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return a.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.equalTo(")).append(a).append(")").toString();
        }

        private b(Object obj)
        {
            a = obj;
        }

        b(Object obj, byte byte0)
        {
            this(obj);
        }
    }

    static final class c
        implements k, Serializable
    {

        private static final long serialVersionUID = 0L;
        private k a;

        public final boolean a(Object obj)
        {
            return !a.a(obj);
        }

        public final boolean equals(Object obj)
        {
            if (obj instanceof c)
            {
                obj = (c)obj;
                return a.equals(((c) (obj)).a);
            } else
            {
                return false;
            }
        }

        public final int hashCode()
        {
            return ~a.hashCode();
        }

        public final String toString()
        {
            return (new StringBuilder("Predicates.not(")).append(a.toString()).append(")").toString();
        }

        c(k k1)
        {
            a = (k)j.a(k1);
        }
    }

    static abstract class d extends Enum
        implements k
    {

        public static final d a;
        private static d b;
        private static d c;
        private static d d;
        private static final d e[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/google/android/m4b/maps/y/l$d, s);
        }

        public static d[] values()
        {
            return (d[])e.clone();
        }

        static 
        {
            b = new d("ALWAYS_TRUE") {

                public final boolean a(Object obj)
                {
                    return true;
                }

                public final String toString()
                {
                    return "Predicates.alwaysTrue()";
                }

            };
            c = new d("ALWAYS_FALSE") {

                public final boolean a(Object obj)
                {
                    return false;
                }

                public final String toString()
                {
                    return "Predicates.alwaysFalse()";
                }

            };
            a = new d("IS_NULL") {

                public final boolean a(Object obj)
                {
                    return obj == null;
                }

                public final String toString()
                {
                    return "Predicates.isNull()";
                }

            };
            d = new d("NOT_NULL") {

                public final boolean a(Object obj)
                {
                    return obj != null;
                }

                public final String toString()
                {
                    return "Predicates.notNull()";
                }

            };
            e = (new d[] {
                b, c, a, d
            });
        }

        private d(String s, int i)
        {
            super(s, i);
        }

        d(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private static final g a = g.a(',');

    public static k a(k k)
    {
        return new c(k);
    }

    public static k a(Object obj)
    {
        if (obj == null)
        {
            return d.a;
        } else
        {
            return new b(obj, (byte)0);
        }
    }

    public static k a(Collection collection)
    {
        return new a(collection, (byte)0);
    }

}
