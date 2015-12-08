// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;


// Referenced classes of package com.google.android.m4b.maps.y:
//            j

public final class h
{
    public static final class a
    {

        private final String a;
        private a b;
        private a c;
        private boolean d;

        private a a()
        {
            a a1 = new a((byte)0);
            c.c = a1;
            c = a1;
            return a1;
        }

        public final a a(Object obj)
        {
            a().b = obj;
            return this;
        }

        public final a a(String s, float f)
        {
            return a(s, String.valueOf(f));
        }

        public final a a(String s, int i)
        {
            return a(s, String.valueOf(i));
        }

        public final a a(String s, long l)
        {
            return a(s, String.valueOf(l));
        }

        public final a a(String s, Object obj)
        {
            a a1 = a();
            a1.b = obj;
            a1.a = (String)j.a(s);
            return this;
        }

        public final a a(String s, boolean flag)
        {
            return a(s, String.valueOf(flag));
        }

        public final String toString()
        {
            String s = "";
            StringBuilder stringbuilder = (new StringBuilder(32)).append(a).append('{');
            for (a a1 = b.c; a1 != null; a1 = a1.c)
            {
                stringbuilder.append(s);
                s = ", ";
                if (a1.a != null)
                {
                    stringbuilder.append(a1.a).append('=');
                }
                stringbuilder.append(a1.b);
            }

            return stringbuilder.append('}').toString();
        }

        private a(String s)
        {
            b = new a((byte)0);
            c = b;
            d = false;
            a = (String)j.a(s);
        }

        a(String s, byte byte0)
        {
            this(s);
        }
    }

    static final class a.a
    {

        String a;
        Object b;
        a.a c;

        private a.a()
        {
        }

        a.a(byte byte0)
        {
            this();
        }
    }


    public static a a(Object obj)
    {
        obj = obj.getClass().getName().replaceAll("\\$[0-9]+", "\\$");
        int k = ((String) (obj)).lastIndexOf('$');
        int i = k;
        if (k == -1)
        {
            i = ((String) (obj)).lastIndexOf('.');
        }
        return new a(((String) (obj)).substring(i + 1), (byte)0);
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    public static Object b(Object obj, Object obj1)
    {
        if (obj != null)
        {
            return obj;
        } else
        {
            return j.a(obj1);
        }
    }
}
