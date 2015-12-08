// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bp;

import com.google.android.gms.ads.AdRequest;

public final class p.bp.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        public static final a c;
        public static final a d;
        private static final a f[];
        private final String e;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/bp/a$a, s);
        }

        public static a[] values()
        {
            return (a[])f.clone();
        }

        public String toString()
        {
            return e;
        }

        static 
        {
            a = new a("INVALID_REQUEST", 0, "Invalid Ad request.");
            b = new a("NO_FILL", 1, "Ad request successful, but no ad returned due to lack of ad inventory.");
            c = new a("NETWORK_ERROR", 2, "A network error occurred.");
            d = new a("INTERNAL_ERROR", 3, "There was an internal error.");
            f = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int i, String s1)
        {
            super(s, i);
            e = s1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        private static final b d[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(p/bp/a$b, s);
        }

        public static b[] values()
        {
            return (b[])d.clone();
        }

        static 
        {
            a = new b("UNKNOWN", 0);
            b = new b("MALE", 1);
            c = new b("FEMALE", 2);
            d = (new b[] {
                a, b, c
            });
        }

        private b(String s, int i)
        {
            super(s, i);
        }
    }


    public static final String a;

    static 
    {
        a = AdRequest.DEVICE_ID_EMULATOR;
    }
}
