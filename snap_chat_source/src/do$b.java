// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


static final class lang.Object extends do
{

    private do c;
    private do d;

    final do a(String s)
    {
        return new <init>(c, d, s);
    }

    public final boolean a(char c1)
    {
        return c.a(c1) || d.a(c1);
    }

    public final volatile boolean a(Object obj)
    {
        return super.a((Character)obj);
    }

    >(do do1, do do2)
    {
        String s = String.valueOf(String.valueOf(do1));
        String s1 = String.valueOf(String.valueOf(do2));
        this(do1, do2, (new StringBuilder(s.length() + 18 + s1.length())).append("CharMatcher.or(").append(s).append(", ").append(s1).append(")").toString());
    }

    private >(do do1, do do2, String s)
    {
        super(s);
        c = (do)dv.a(do1);
        d = (do)dv.a(do2);
    }
}
