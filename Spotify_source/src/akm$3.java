// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private akm a;

    public final void run()
    {
        try
        {
            a.g.b();
            return;
        }
        catch (Exception exception)
        {
            gya.a().c("Answers", "Failed to send events files", exception);
        }
    }

    (akm akm1)
    {
        a = akm1;
        super();
    }
}
