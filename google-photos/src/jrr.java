// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrr
    implements Runnable
{

    private jtf a;
    private jrq b;

    jrr(jrq jrq1, jtf jtf)
    {
        b = jrq1;
        a = jtf;
        super();
    }

    public final void run()
    {
        if (!b.a.b())
        {
            b.a.c("Connected to service after a timeout");
            jro.a(b.a, a);
        }
    }
}
