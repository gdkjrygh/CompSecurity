// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class lfh
{

    public final String a;
    final Integer b;
    final String c;
    final boolean d;
    final String e;

    public lfh(String s, Integer integer, String s1, boolean flag)
    {
        this(s, integer, s1, false, "");
    }

    private lfh(String s, Integer integer, String s1, boolean flag, String s2)
    {
        b.d(s);
        b.d(s2);
        a = s;
        b = integer;
        c = s1;
        d = flag;
        e = s2;
    }

    public final String a()
    {
        if (c != null)
        {
            return (new StringBuilder()).append(c).append("_").append(a).toString();
        } else
        {
            return a;
        }
    }
}
