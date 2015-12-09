// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;


public class w
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dd/w$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("CONNECTION_SUCCESS", 0);
            b = new a("CONNECTION_FAILED", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }
    }


    public final a a;

    public w(a a1)
    {
        a = a1;
    }
}
