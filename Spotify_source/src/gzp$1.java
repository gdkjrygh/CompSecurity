// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private Runnable a;
    private gzp b;

    public final void run()
    {
        a.run();
        b.a();
        return;
        Exception exception;
        exception;
        b.a();
        throw exception;
    }

    (gzp gzp1, Runnable runnable)
    {
        b = gzp1;
        a = runnable;
        super();
    }
}
