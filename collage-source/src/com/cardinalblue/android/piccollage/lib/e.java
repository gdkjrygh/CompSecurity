// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.lib;

import android.graphics.Bitmap;
import android.widget.ImageView;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.cardinalblue.android.piccollage.lib:
//            f

public interface e
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
        public static final a h;
        public static final a i;
        private static final a l[];
        private final String j;
        private final String k;

        public static a a(String s)
        {
            if (s != null)
            {
                a aa[] = values();
                int j1 = aa.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    a a1 = aa[i1];
                    if (a1.e(s))
                    {
                        return a1;
                    }
                }

            }
            return i;
        }

        public static String d(String s)
        {
            String s1 = s;
            if (a(s) == i)
            {
                s1 = c.b(s);
            }
            return s1;
        }

        private boolean e(String s)
        {
            if (s == null)
            {
                return false;
            } else
            {
                return s.regionMatches(true, 0, k, 0, k.length());
            }
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/cardinalblue/android/piccollage/lib/e$a, s);
        }

        public static a[] values()
        {
            return (a[])l.clone();
        }

        public String a()
        {
            return k;
        }

        public String b(String s)
        {
            return (new StringBuilder()).append(k).append(s).toString();
        }

        public String c(String s)
        {
            if (!e(s))
            {
                throw new IllegalArgumentException(String.format("URI [%1$s] doesn't have expected scheme [%2$s]", new Object[] {
                    s, j
                }));
            } else
            {
                return s.substring(k.length());
            }
        }

        static 
        {
            a = new a("HTTP", 0, "http");
            b = new a("HTTPS", 1, "https");
            c = new a("FILE", 2, "file");
            d = new a("CONTENT", 3, "content");
            e = new a("ASSETS", 4, "assets");
            f = new a("RESOURCE", 5, "resource");
            g = new a("BUNDLED", 6, "bundled", "bundled:/");
            h = new a("YOUTUBE", 7, "youtube", "youtube:/");
            i = new a("UNKNOWN", 8, "");
            l = (new a[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private a(String s, int i1, String s1)
        {
            this(s, i1, s1, (new StringBuilder()).append(s1).append("://").toString());
        }

        private a(String s, int i1, String s1, String s2)
        {
            super(s, i1);
            j = s1;
            k = s2;
        }
    }


    public abstract Bitmap a(int i)
        throws IOException, OutOfMemoryError;

    public abstract Bitmap a(int i, android.graphics.Bitmap.Config config)
        throws IOException, OutOfMemoryError;

    public abstract void a(ImageView imageview)
        throws IOException, OutOfMemoryError;

    public abstract void a(ImageView imageview, f f)
        throws IOException, OutOfMemoryError;

    public abstract InputStream d()
        throws IOException;
}
