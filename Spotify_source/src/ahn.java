// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class ahn
{

    static int a = 7;
    final String b;

    private ahn(String s)
    {
        b = s;
    }

    ahn(String s, byte byte0)
    {
        this(s);
    }

    public static ahn a(String s)
    {
        String s1 = (new RuntimeException()).getStackTrace()[1].getClassName();
        return new aho(s, s1.substring(s1.lastIndexOf(".") + 1), (byte)0);
    }

    abstract int a();

    protected transient abstract void a(int i, String s, Object aobj[]);

    public final transient void a(String s, Object aobj[])
    {
        a(2, s, aobj);
    }

    abstract int b();

    public final transient void b(String s, Object aobj[])
    {
        a(3, s, aobj);
    }

    public final transient void c(String s, Object aobj[])
    {
        a(3, s, aobj);
    }

    public final transient void d(String s, Object aobj[])
    {
        a(5, s, aobj);
    }

    public final transient void e(String s, Object aobj[])
    {
        a(6, s, aobj);
    }

}
