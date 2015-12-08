// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class akj
    implements Runnable
{

    private Runnable a;
    private aki b;

    public akj(aki aki1, Runnable runnable)
    {
        b = aki1;
        super();
        a = runnable;
    }

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            ajn.b(getClass(), "Unexpected error running asynchronous task: ");
            ajn.a(exception);
            b.a.t();
            return;
        }
    }
}
