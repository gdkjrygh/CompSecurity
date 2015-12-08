// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private Runnable a;

    public final void run()
    {
        try
        {
            a.run();
            return;
        }
        catch (Exception exception)
        {
            gya.a().c("CrashlyticsCore", "Failed to execute task.", exception);
        }
    }

    (Runnable runnable)
    {
        a = runnable;
        super();
    }
}
