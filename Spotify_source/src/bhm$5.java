// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ang.Object
    implements Runnable
{

    private bhm a;

    public final void run()
    {
        if (bhm.a(a) != null)
        {
            bhm.a(a).c();
            bhm.a(a).e();
        }
    }

    (bhm bhm1)
    {
        a = bhm1;
        super();
    }
}
