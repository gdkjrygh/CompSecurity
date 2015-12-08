// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private hbg a;
    private String b;
    private akm c;

    public final void run()
    {
        try
        {
            c.g.a(a, b);
            return;
        }
        catch (Exception exception)
        {
            gya.a().c("Answers", "Failed to set analytics settings data", exception);
        }
    }

    (akm akm1, hbg hbg, String s)
    {
        c = akm1;
        a = hbg;
        b = s;
        super();
    }
}
