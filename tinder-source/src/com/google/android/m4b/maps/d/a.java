// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.d;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class com.google.android.m4b.maps.d.a
{
    public static final class a
        implements Comparable
    {

        public static final a d = new a();
        public final String a;
        public final String b;
        public final boolean c;
        private String e;

        public final int compareTo(Object obj)
        {
            return ((a)obj).a.compareTo(a);
        }


        private a()
        {
            e = "DEFAULT";
            a = "";
            b = null;
            c = false;
        }

        public a(String s, String s1)
        {
            e = s;
            String as[] = com.google.android.m4b.maps.d.a.a().split(s1);
            if (as.length == 0)
            {
                throw new b("Empty rule");
            }
            a = as[0];
            s = null;
            boolean flag = false;
            for (int i = 1; i < as.length;)
            {
                String s2 = as[i].toLowerCase();
                if (s2.equals("rewrite") && i + 1 < as.length)
                {
                    s = as[i + 1];
                    i += 2;
                } else
                if (s2.equals("block"))
                {
                    i++;
                    flag = true;
                } else
                {
                    throw new b((new StringBuilder("Illegal rule: ")).append(s1).toString());
                }
            }

            b = s;
            c = flag;
        }
    }

    public static final class b extends Exception
    {

        public b(String s)
        {
            super(s);
        }
    }


    private static final Pattern c = Pattern.compile(" +");
    private static final Pattern d = Pattern.compile("\\W");
    private static com.google.android.m4b.maps.d.a e = new com.google.android.m4b.maps.d.a(new a[0]);
    public final a a[];
    public final Pattern b;

    public com.google.android.m4b.maps.d.a(a aa[])
    {
        Arrays.sort(aa);
        StringBuilder stringbuilder = new StringBuilder("(");
        for (int i = 0; i < aa.length; i++)
        {
            if (i > 0)
            {
                stringbuilder.append(")|(");
            }
            stringbuilder.append(d.matcher(aa[i].a).replaceAll("\\\\$0"));
        }

        b = Pattern.compile(stringbuilder.append(")").toString());
        a = aa;
    }

    static Pattern a()
    {
        return c;
    }

}
