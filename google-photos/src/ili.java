// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ili
    implements Runnable
{

    private Thread a;
    private Throwable b;
    private ilh c;

    ili(ilh ilh1, Thread thread, Throwable throwable)
    {
        c = ilh1;
        a = thread;
        b = throwable;
        super();
    }

    public final void run()
    {
        ilh.a(c, a, b);
    }
}
