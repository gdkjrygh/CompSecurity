// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.co;


// Referenced classes of package p.co:
//            a

public class p.co.b
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        private static final a g[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/co/b$a, s);
        }

        public static a[] values()
        {
            return (a[])g.clone();
        }

        static 
        {
            a = new a("EMAIL", 0);
            b = new a("PASSWORD", 1);
            c = new a("PASSWORD_CREATOR", 2);
            d = new a("ZIPCODE", 3);
            e = new a("BIRTH_YEAR", 4);
            f = new a("GENDER", 5);
            g = (new a[] {
                a, b, c, d, e, f
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }

    public static interface b
    {

        public abstract int a(String s);
    }


    public static b a(a a1)
    {
        return new b(a1) {

            final a a;

            public int a(String s)
            {
                static class _cls2
                {

                    static final int a[];

                    static 
                    {
                        a = new int[a.values().length];
                        try
                        {
                            a[a.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            a[a.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            a[a.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[a.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[a.e.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[a.f.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls2.a[a.ordinal()])
                {
                default:
                    throw new IllegalArgumentException((new StringBuilder()).append("Type ").append(a).append(" does not match any of the current Validators").toString());

                case 1: // '\001'
                    return p.co.a.a(s);

                case 2: // '\002'
                    return p.co.a.b(s);

                case 3: // '\003'
                    return p.co.a.c(s);

                case 4: // '\004'
                    return p.co.a.d(s);

                case 5: // '\005'
                    return p.co.a.f(s);

                case 6: // '\006'
                    return p.co.a.e(s);
                }
            }

            
            {
                a = a1;
                super();
            }
        };
    }
}
