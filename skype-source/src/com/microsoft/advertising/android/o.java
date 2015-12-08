// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


final class o
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a d[];
        private final String c;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/advertising/android/o$a, s);
        }

        public static a[] values()
        {
            a aa[] = d;
            int i = aa.length;
            a aa1[] = new a[i];
            System.arraycopy(aa, 0, aa1, 0, i);
            return aa1;
        }

        static 
        {
            a = new a("WEB_VIEW", 0, "webViewResource");
            b = new a("BANNER_IMAGE", 1, "bannerAdImage");
            d = (new a[] {
                a, b
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            c = s1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        private static final b d[];
        private final String c;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/microsoft/advertising/android/o$b, s);
        }

        public static b[] values()
        {
            b ab[] = d;
            int i = ab.length;
            b ab1[] = new b[i];
            System.arraycopy(ab, 0, ab1, 0, i);
            return ab1;
        }

        static 
        {
            a = new b("EXACT", 0, "exact");
            b = new b("REGEX", 1, "regex");
            d = (new b[] {
                a, b
            });
        }

        private b(String s, int i, String s1)
        {
            super(s, i);
            c = s1;
        }
    }


    private final b a;
    private final String b;
    private volatile String c;
    private volatile byte d[];
    private final a e;

    private o(String s, b b1, String s1, byte abyte0[], a a1)
    {
        b = s;
        c = s1;
        d = abyte0;
        e = a1;
        if (b1 == null)
        {
            b1 = b.a;
        }
        a = b1;
    }

    public o(String s, String s1, byte abyte0[], a a1)
    {
        this(s, b.a, s1, abyte0, a1);
    }
}
