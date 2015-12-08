// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class buw
    implements Runnable
{

    private buv a;

    buw(buv buv1)
    {
        a = buv1;
        super();
    }

    public final void run()
    {
        try
        {
            buv.a(a);
            return;
        }
        catch (Exception exception)
        {
            buv.b(a).a(exception);
        }
    }
}
