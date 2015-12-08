// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jsm
{

    private final Object a;
    private final kzu b;

    jsm(kzu kzu1, Object obj)
    {
        b.d(kzu1);
        b = kzu1;
        a = obj;
    }

    static jsm a(String s, int i, int j)
    {
        return new jsm(kzu.a(s, Integer.valueOf(j)), Integer.valueOf(i));
    }

    static jsm a(String s, long l, long l1)
    {
        return new jsm(kzu.a(s, Long.valueOf(l1)), Long.valueOf(l));
    }

    static jsm a(String s, String s1, String s2)
    {
        return new jsm(kzu.a(s, s2), s1);
    }

    public final Object a()
    {
        if (kbe.a && kzu.b())
        {
            return b.d();
        } else
        {
            return a;
        }
    }
}
