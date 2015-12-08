// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class pk extends Enum
{

    public static final pk a;
    public static final pk b;
    private static final pk e[];
    private String c;
    private int d;

    private pk(String s, int i, String s1, int j)
    {
        super(s, i);
        c = s1;
        d = j;
    }

    static String a(pk pk1)
    {
        return pk1.c;
    }

    static int b(pk pk1)
    {
        return pk1.d;
    }

    public static pk valueOf(String s)
    {
        return (pk)Enum.valueOf(b/a/pk, s);
    }

    public static pk[] values()
    {
        return (pk[])e.clone();
    }

    static 
    {
        a = new pk("HTTP", 0, "http", 80);
        b = new pk("HTTPS", 1, "https", 443);
        e = (new pk[] {
            a, b
        });
    }
}
