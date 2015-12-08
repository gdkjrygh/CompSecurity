// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


// Referenced classes of package kik.a.d:
//            k

public final class p
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        public static final int c;
        public static final int d;
        private static final int e[];

        static 
        {
            a = 1;
            b = 2;
            c = 3;
            d = 4;
            e = (new int[] {
                a, b, c, d
            });
        }
    }


    private k a;
    private int b;

    public p(k k, int i)
    {
        a = k;
        b = i;
    }

    public final k a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }
}
