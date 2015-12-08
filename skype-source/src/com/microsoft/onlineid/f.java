// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid;


public final class f
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a g[];
        private final String f;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/f$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        public final String toString()
        {
            return f;
        }

        static 
        {
            a = new a("None", 0, null);
            b = new a("Email", 1, "easi2");
            c = new a("Outlook", 2, "wld2");
            d = new a("Telephone", 3, "phone2");
            e = new a("TelephoneOnly", 4, "phone");
            g = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            f = s1;
        }
    }


    private final a a;
    private String b;

    public f()
    {
        this(a.a);
    }

    public f(a a1)
    {
        a = a1;
    }

    public final a a()
    {
        return a;
    }

    public final f a(String s)
    {
        b = s;
        return this;
    }

    public final String b()
    {
        return b;
    }
}
