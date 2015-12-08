// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.io.Serializable;

// Referenced classes of package com.c.a.a:
//            r, v, x, y, 
//            z, aa

public final class w
{
    private static final class a
        implements v, Serializable
    {

        private final Object a;

        public final boolean a(Object obj)
        {
            return a.equals(obj);
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
            String s = String.valueOf(String.valueOf(a));
            return (new StringBuilder(s.length() + 20)).append("Predicates.equalTo(").append(s).append(")").toString();
        }

        private a(Object obj)
        {
            a = obj;
        }

        a(Object obj, byte byte0)
        {
            this(obj);
        }
    }

    static abstract class b extends Enum
        implements v
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/c/a/a/w$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new x("ALWAYS_TRUE");
            b = new y("ALWAYS_FALSE");
            c = new z("IS_NULL");
            d = new aa("NOT_NULL");
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }

        b(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private static final r a = r.a(',');

    public static v a(Object obj)
    {
        if (obj == null)
        {
            return b.c;
        } else
        {
            return new a(obj, (byte)0);
        }
    }

}
