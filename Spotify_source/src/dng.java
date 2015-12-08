// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class dng extends dnj
{

    private boolean a;
    private long b;
    private String c;
    private String d;

    public dng(boolean flag, long l, String s, String s1)
    {
        super("285", "1");
        a = flag;
        b = l;
        c = s;
        d = s1;
    }

    public final String a()
    {
        return (new dnb(b(), c())).a(null).a(Boolean.valueOf(a)).a(Long.valueOf(b)).a(c).a(d).a();
    }
}
