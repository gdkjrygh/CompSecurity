// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class boa
{

    final Object a;

    boa(cmz cmz1, Object obj)
    {
        btl.a(cmz1);
        a = obj;
    }

    static boa a(String s, int i, int j)
    {
        return new boa(cmz.b(s), Integer.valueOf(i));
    }

    static boa a(String s, long l, long l1)
    {
        return new boa(cmz.a(s), Long.valueOf(l));
    }

    static boa a(String s, String s1, String s2)
    {
        return new boa(cmz.d(s), s1);
    }

    static boa a(String s, boolean flag)
    {
        return new boa(cmz.a(s, flag), Boolean.valueOf(flag));
    }
}
