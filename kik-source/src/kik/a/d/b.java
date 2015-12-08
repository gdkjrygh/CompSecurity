// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


public final class kik.a.d.b
{
    public static final class a extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }

    public static final class b extends Enum
    {

        public static final int a;
        public static final int b;
        private static final int c[];

        static 
        {
            a = 1;
            b = 2;
            c = (new int[] {
                a, b
            });
        }
    }


    private final int a;
    private final String b;
    private final int c;

    public kik.a.d.b(int i, String s, int j)
    {
        a = i;
        c = j;
        b = s;
    }

    public final int a()
    {
        return a;
    }

    public final int b()
    {
        return c;
    }

    public final String c()
    {
        return b;
    }
}
