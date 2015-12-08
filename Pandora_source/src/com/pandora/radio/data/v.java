// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;


public class v
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        private static final a f[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/pandora/radio/data/v$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("TopHit", 0);
            b = new a("AdStations", 1);
            c = new a("Artists", 2);
            d = new a("Tracks", 3);
            e = new a("Genres", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private String a;
    private String b;
    private String c;
    private String d;
    private t.a e;
    private a f;

    public v(String s, a a1, t.a a2)
    {
        d = s;
        f = a1;
        e = a2;
    }

    public v(String s, String s1)
    {
        this(s, s1, t.a.g);
    }

    public v(String s, String s1, t.a a1)
    {
        d = s;
        a = s1;
        e = a1;
    }

    public v(String s, String s1, String s2)
    {
        d = s;
        a = String.format("%s by %s", new Object[] {
            s2, s1
        });
        b = s2;
        c = s1;
        e = t.a.c;
    }

    public a a()
    {
        return f;
    }

    public String b()
    {
        return a;
    }

    public String c()
    {
        return d;
    }

    public t.a d()
    {
        return e;
    }

    public String toString()
    {
        return a;
    }
}
