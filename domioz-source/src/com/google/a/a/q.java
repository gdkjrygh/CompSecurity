// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;


// Referenced classes of package com.google.a.a:
//            e, ad

final class q extends e
{

    final e q;
    final e r;

    q(e e1, e e2)
    {
        String s = String.valueOf(String.valueOf(e1));
        String s1 = String.valueOf(String.valueOf(e2));
        this(e1, e2, (new StringBuilder(s.length() + 18 + s1.length())).append("CharMatcher.or(").append(s).append(", ").append(s1).append(")").toString());
    }

    private q(e e1, e e2, String s)
    {
        super(s);
        q = (e)ad.a(e1);
        r = (e)ad.a(e2);
    }

    final e a(String s)
    {
        return new q(q, r, s);
    }

    public final boolean a(char c)
    {
        return q.a(c) || r.a(c);
    }

    public final boolean apply(Object obj)
    {
        return super.a((Character)obj);
    }
}
