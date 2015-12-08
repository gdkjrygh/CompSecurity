// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class be
    implements Runnable
{

    private String a;
    private int b;
    private bb c;

    be(bb bb1, String s, int i)
    {
        c = bb1;
        a = s;
        b = i;
        super();
    }

    public final void run()
    {
        bb bb1 = c;
        ax ax = c.h;
        bb1.a(a, -1, b);
    }
}
