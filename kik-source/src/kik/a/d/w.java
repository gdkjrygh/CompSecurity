// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import com.kik.n.a.f.a;

public final class w
{

    private String a;
    private String b;
    private String c;

    public w(a a1)
    {
        this(a1.c(), a1.d(), a1.e());
    }

    public w(String s, String s1, String s2)
    {
        a = s;
        b = s1;
        c = s2;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final a d()
    {
        a a1 = new a();
        a1.c(c);
        a1.b(b);
        a1.a(a);
        return a1;
    }
}
