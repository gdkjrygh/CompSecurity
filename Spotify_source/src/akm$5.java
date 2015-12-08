// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private alc a;
    private boolean b;
    private akm c;

    public final void run()
    {
        try
        {
            c.g.a(a);
            if (b)
            {
                c.g.e();
            }
            return;
        }
        catch (Exception exception)
        {
            gya.a().c("Answers", "Failed to process event", exception);
        }
    }

    (akm akm1, alc alc, boolean flag)
    {
        c = akm1;
        a = alc;
        b = flag;
        super();
    }
}
