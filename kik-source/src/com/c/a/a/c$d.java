// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;


// Referenced classes of package com.c.a.a:
//            c, u

private static final class ct extends c
{

    final c q;
    final c r;

    final c a(String s)
    {
        return new <init>(q, r, s);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    public final boolean c(char c1)
    {
        return q.c(c1) || r.c(c1);
    }

    ng(c c1, c c2)
    {
        String s = String.valueOf(String.valueOf(c1));
        String s1 = String.valueOf(String.valueOf(c2));
        this(c1, c2, (new StringBuilder(s.length() + 18 + s1.length())).append("CharMatcher.or(").append(s).append(", ").append(s1).append(")").toString());
    }

    private ct(c c1, c c2, String s)
    {
        super(s);
        q = (c)u.a(c1);
        r = (c)u.a(c2);
    }
}
