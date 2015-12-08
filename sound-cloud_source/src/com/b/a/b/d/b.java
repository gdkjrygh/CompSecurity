// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.b.d;

import java.io.IOException;
import java.io.InputStream;
import java.util.Locale;

public interface b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final a j[];
        private String h;
        private String i;

        public static a a(String s)
        {
            if (s != null)
            {
                a aa[] = values();
                int l = aa.length;
                for (int k = 0; k < l; k++)
                {
                    a a1 = aa[k];
                    if (a1.d(s))
                    {
                        return a1;
                    }
                }

            }
            return g;
        }

        private boolean d(String s)
        {
            return s.toLowerCase(Locale.US).startsWith(i);
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/b/a/b/d/b$a, s);
        }

        public static a[] values()
        {
            return (a[])j.clone();
        }

        public final String b(String s)
        {
            return (new StringBuilder()).append(i).append(s).toString();
        }

        public final String c(String s)
        {
            if (!d(s))
            {
                throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[] {
                    s, h
                }));
            } else
            {
                return s.substring(i.length());
            }
        }

        static 
        {
            a = new a("HTTP", 0, "http");
            b = new a("HTTPS", 1, "https");
            c = new a("FILE", 2, "file");
            d = new a("CONTENT", 3, "content");
            e = new a("ASSETS", 4, "assets");
            f = new a("DRAWABLE", 5, "drawable");
            g = new a("UNKNOWN", 6, "");
            j = (new a[] {
                a, b, c, d, e, f, g
            });
        }

        private a(String s, int k, String s1)
        {
            super(s, k);
            h = s1;
            i = (new StringBuilder()).append(s1).append("://").toString();
        }
    }


    public abstract InputStream a(String s, Object obj)
        throws IOException;
}
