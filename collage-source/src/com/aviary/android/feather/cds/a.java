// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds;

import java.util.Locale;

public class com.aviary.android.feather.cds.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        private static final a d[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/aviary/android/feather/cds/a$a, s);
        }

        public static a[] values()
        {
            return (a[])d.clone();
        }

        static 
        {
            a = new a("PREVIEW", 0);
            b = new a("CONTENT", 1);
            c = new a("MESSAGE", 2);
            d = (new a[] {
                a, b, c
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b a(String s)
        {
            if ("effect".equals(s))
            {
                return b;
            }
            if ("frame".equals(s))
            {
                return a;
            }
            if ("sticker".equals(s))
            {
                return c;
            } else
            {
                return null;
            }
        }

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/aviary/android/feather/cds/a$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        public String a()
        {
            return name().toLowerCase(Locale.US);
        }

        static 
        {
            a = new b("FRAME", 0);
            b = new b("EFFECT", 1);
            c = new b("STICKER", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        public static final c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/aviary/android/feather/cds/a$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("hires", 0);
            b = new c("whitelabel", 1);
            c = new c("kill", 2);
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class d extends Enum
    {

        public static final d a;
        public static final d b;
        public static final d c;
        private static final d d[];

        public static d valueOf(String s)
        {
            return (d)Enum.valueOf(com/aviary/android/feather/cds/a$d, s);
        }

        public static d[] values()
        {
            return (d[])d.clone();
        }

        static 
        {
            a = new d("Small", 0);
            b = new d("Medium", 1);
            c = new d("Large", 2);
            d = (new d[] {
                a, b, c
            });
        }

        private d(String s, int i)
        {
            super(s, i);
        }
    }


    public com.aviary.android.feather.cds.a()
    {
    }

    public static String a(b b1)
    {
        if (b1 == b.b)
        {
            return ".jpg";
        } else
        {
            return ".png";
        }
    }

    public static String a(String s)
    {
        if ("effect".equals(s))
        {
            return ".jpg";
        } else
        {
            return ".png";
        }
    }

    public static String a(String s, b b1, d d1)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[d.values().length];
                try
                {
                    b[d.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    b[d.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    b[d.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                a = new int[b.values().length];
                try
                {
                    a[b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[b1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return a(s, d1);
        }
    }

    private static String a(String s, d d1)
    {
        switch (_cls1.b[d1.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return (new StringBuilder()).append(s).append("-large.png").toString();

        case 2: // '\002'
            return (new StringBuilder()).append(s).append("-medium.png").toString();

        case 3: // '\003'
            return (new StringBuilder()).append(s).append("-small.png").toString();
        }
    }
}
