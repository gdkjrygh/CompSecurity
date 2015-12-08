// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;


public final class ad extends Exception
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
            return (a)Enum.valueOf(crittercism/android/ad$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        static 
        {
            a = new a("NO_INTERNET", 0);
            b = new a("CONN_TIMEOUT", 1);
            c = new a("UNKNOWN_HOST", 2);
            d = new a("WTF", 3);
            e = new a("FILE_NOT_FOUND", 4);
            f = (new a[] {
                a, b, c, d, e
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final long serialVersionUID = 0x3e9b557ab5fea913L;
    private a a;

    public ad(String s, a a1)
    {
        super(s);
        a = a1;
    }
}
