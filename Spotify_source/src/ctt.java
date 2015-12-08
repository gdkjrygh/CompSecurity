// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ctt extends ctr
{

    private ctr c;
    private ctr d;

    ctt(ctr ctr1, ctr ctr2)
    {
        String s = String.valueOf(String.valueOf(ctr1));
        String s1 = String.valueOf(String.valueOf(ctr2));
        this(ctr1, ctr2, (new StringBuilder(s.length() + 18 + s1.length())).append("CharMatcher.or(").append(s).append(", ").append(s1).append(")").toString());
    }

    private ctt(ctr ctr1, ctr ctr2, String s)
    {
        super(s);
        c = (ctr)ctz.a(ctr1);
        d = (ctr)ctz.a(ctr2);
    }

    final ctr a(String s)
    {
        return new ctt(c, d, s);
    }

    public final boolean a(char c1)
    {
        return c.a(c1) || d.a(c1);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }
}
