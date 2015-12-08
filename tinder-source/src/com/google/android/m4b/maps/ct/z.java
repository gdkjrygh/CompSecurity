// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ct;


// Referenced classes of package com.google.android.m4b.maps.ct:
//            e, d

public final class z
{
    public static class a extends Enum
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
        public static final a j;
        public static final a k;
        public static final a l;
        public static final a m;
        public static final a n;
        public static final a o;
        public static final a p;
        public static final a q;
        public static final a r;
        private static final a u[];
        final b s;
        final int t;

        public static a valueOf(String s1)
        {
            return (a)Enum.valueOf(com/google/android/m4b/maps/ct/z$a, s1);
        }

        public static a[] values()
        {
            return (a[])u.clone();
        }

        public boolean a()
        {
            return true;
        }

        static 
        {
            a = new a("DOUBLE", 0, b.d, 1);
            b = new a("FLOAT", 1, b.c, 5);
            c = new a("INT64", 2, b.b, 0);
            d = new a("UINT64", 3, b.b, 0);
            e = new a("INT32", 4, b.a, 0);
            f = new a("FIXED64", 5, b.b, 1);
            g = new a("FIXED32", 6, b.a, 5);
            h = new a("BOOL", 7, b.e, 0);
            i = new a("STRING", b.f) {

                public final boolean a()
                {
                    return false;
                }

            };
            j = new a("GROUP", b.i) {

                public final boolean a()
                {
                    return false;
                }

            };
            k = new a("MESSAGE", b.i) {

                public final boolean a()
                {
                    return false;
                }

            };
            l = new a("BYTES", b.g) {

                public final boolean a()
                {
                    return false;
                }

            };
            m = new a("UINT32", 12, b.a, 0);
            n = new a("ENUM", 13, b.h, 0);
            o = new a("SFIXED32", 14, b.a, 5);
            p = new a("SFIXED64", 15, b.b, 1);
            q = new a("SINT32", 16, b.a, 0);
            r = new a("SINT64", 17, b.b, 0);
            u = (new a[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l, m, n, o, p, q, r
            });
        }

        private a(String s1, int i1, b b1, int j1)
        {
            super(s1, i1);
            s = b1;
            t = j1;
        }

        a(String s1, int i1, b b1, int j1, byte byte0)
        {
            this(s1, i1, b1, j1);
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        public static final b e;
        public static final b f;
        public static final b g;
        public static final b h;
        public static final b i;
        private static final b k[];
        private final Object j;

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/google/android/m4b/maps/ct/z$b, s);
        }

        public static b[] values()
        {
            return (b[])k.clone();
        }

        static 
        {
            a = new b("INT", 0, Integer.valueOf(0));
            b = new b("LONG", 1, Long.valueOf(0L));
            c = new b("FLOAT", 2, Float.valueOf(0.0F));
            d = new b("DOUBLE", 3, Double.valueOf(0.0D));
            e = new b("BOOLEAN", 4, Boolean.valueOf(false));
            f = new b("STRING", 5, "");
            g = new b("BYTE_STRING", 6, d.a);
            h = new b("ENUM", 7, null);
            i = new b("MESSAGE", 8, null);
            k = (new b[] {
                a, b, c, d, e, f, g, h, i
            });
        }

        private b(String s, int l, Object obj)
        {
            super(s, l);
            j = obj;
        }
    }

    static abstract class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static c c;
        private static final c d[];

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(com/google/android/m4b/maps/ct/z$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        abstract Object a(e e1);

        static 
        {
            a = new c("LOOSE") {

                final Object a(e e1)
                {
                    return e1.b();
                }

            };
            b = new c("STRICT") {

                final Object a(e e1)
                {
                    return e1.c();
                }

            };
            c = new c("LAZY") {

                final Object a(e e1)
                {
                    return e1.d();
                }

            };
            d = (new c[] {
                a, b, c
            });
        }

        private c(String s, int i)
        {
            super(s, i);
        }

        c(String s, int i, byte byte0)
        {
            this(s, i);
        }
    }


    private static int a = 11;
    private static int b = 12;
    private static int c = 16;
    private static int d = 26;

    public static int a(int i)
    {
        return i & 7;
    }

    static int a(int i, int j)
    {
        return i << 3 | j;
    }

    static Object a(e e1, a a1, c c1)
    {
        boolean flag = true;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[a.values().length];
                try
                {
                    a[a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror17) { }
                try
                {
                    a[a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror16) { }
                try
                {
                    a[a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror15) { }
                try
                {
                    a[a.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror14) { }
                try
                {
                    a[a.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    a[a.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    a[a.g.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    a[a.h.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    a[a.l.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    a[a.m.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    a[a.o.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    a[a.p.ordinal()] = 12;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    a[a.q.ordinal()] = 13;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[a.r.ordinal()] = 14;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[a.i.ordinal()] = 15;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[a.j.ordinal()] = 16;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[a.k.ordinal()] = 17;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[a.n.ordinal()] = 18;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[a1.ordinal()])
        {
        default:
            throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");

        case 1: // '\001'
            return Double.valueOf(Double.longBitsToDouble(e1.h()));

        case 2: // '\002'
            return Float.valueOf(Float.intBitsToFloat(e1.g()));

        case 3: // '\003'
            return Long.valueOf(e1.f());

        case 4: // '\004'
            return Long.valueOf(e1.f());

        case 5: // '\005'
            return Integer.valueOf(e1.e());

        case 6: // '\006'
            return Long.valueOf(e1.h());

        case 7: // '\007'
            return Integer.valueOf(e1.g());

        case 8: // '\b'
            if (e1.f() == 0L)
            {
                flag = false;
            }
            return Boolean.valueOf(flag);

        case 9: // '\t'
            return e1.d();

        case 10: // '\n'
            return Integer.valueOf(e1.e());

        case 11: // '\013'
            return Integer.valueOf(e1.g());

        case 12: // '\f'
            return Long.valueOf(e1.h());

        case 13: // '\r'
            int i = e1.e();
            return Integer.valueOf(-(i & 1) ^ i >>> 1);

        case 14: // '\016'
            long l = e1.f();
            return Long.valueOf(l >>> 1 ^ -(l & 1L));

        case 15: // '\017'
            return c1.a(e1);

        case 16: // '\020'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");

        case 17: // '\021'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");

        case 18: // '\022'
            throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
        }
    }

    public static int b(int i)
    {
        return i >>> 3;
    }

}
