// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public static final class d extends Enum
{

    public static final b a;
    public static final b b;
    private static final b e[];
    private String c;
    private int d;

    static String a(um um)
    {
        return um.c;
    }

    static int b(c c1)
    {
        return c1.d;
    }

    public static ang.String valueOf(String s)
    {
        return (f)Enum.valueOf(aeU$a, s);
    }

    public static ang.String[] values()
    {
        return ([])e.clone();
    }

    static 
    {
        a = new <init>("HTTP", 0, "http", 80);
        b = new <init>("HTTPS", 1, "https", 443);
        e = (new e[] {
            a, b
        });
    }

    private (String s, int i, String s1, int j)
    {
        super(s, i);
        c = s1;
        d = j;
    }
}
