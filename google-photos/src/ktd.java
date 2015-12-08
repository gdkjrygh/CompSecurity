// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;

public abstract class ktd
{

    final String a;
    final Object b;

    ktd(String s, Object obj)
    {
        a = s;
        b = obj;
        jqc.h().a.add(this);
    }

    public static ktd a(String s)
    {
        s = a(s, ((String) (null)));
        jqc.h().b.add(s);
        return s;
    }

    public static ktd a(String s, int i)
    {
        return new ktf(s, Integer.valueOf(i));
    }

    public static ktd a(String s, long l)
    {
        return new ktg(s, Long.valueOf(l));
    }

    public static ktd a(String s, Boolean boolean1)
    {
        return new kte(s, boolean1);
    }

    public static ktd a(String s, String s1)
    {
        return new kth(s, s1);
    }

    public static ktd b(String s)
    {
        s = a(s, ((String) (null)));
        jqc.h().c.add(s);
        return s;
    }
}
