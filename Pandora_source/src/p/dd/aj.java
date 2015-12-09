// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dd;


public class aj
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(p/dd/aj$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("PLAYING", 0);
            b = new a("STOPPED", 1);
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

    public aj(a a1)
    {
        a = a1;
    }
}
