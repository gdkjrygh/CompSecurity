// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jrg
    implements Runnable
{

    private String a;
    private Runnable b;
    private jre c;

    jrg(jre jre1, String s, Runnable runnable)
    {
        c = jre1;
        a = s;
        b = runnable;
        super();
    }

    public final void run()
    {
        c.a.a(a);
        if (b != null)
        {
            b.run();
        }
    }
}
