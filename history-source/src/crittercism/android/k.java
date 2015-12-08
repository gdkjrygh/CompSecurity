// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.net.InetAddress;

public final class k
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a e[];
        private String c;
        private int d;

        static String a(a a1)
        {
            return a1.c;
        }

        static int b(a a1)
        {
            return a1.d;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(crittercism/android/k$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("HTTP", 0, "http", 80);
            b = new a("HTTPS", 1, "https", 443);
            e = (new a[] {
                a, b
            });
        }

        private a(String s, int i, String s1, int j)
        {
            super(s, i);
            c = s1;
            d = j;
        }
    }


    InetAddress a;
    String b;
    public String c;
    a d;
    int e;
    boolean f;

    public k()
    {
        c = "/";
        d = null;
        e = -1;
        f = false;
    }
}
