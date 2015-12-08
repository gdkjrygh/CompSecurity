// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class kyx
    implements Runnable
{

    private String a;
    private long b;
    private kyw c;

    kyx(kyw kyw1, String s, long l)
    {
        c = kyw1;
        a = s;
        b = l;
        super();
    }

    public final void run()
    {
        kyw.a(c).a(a, b);
        kyw.a(c).a(toString());
    }
}
