// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mkh
    implements Runnable
{

    private mkf a;

    mkh(mkf mkf1)
    {
        a = mkf1;
        super();
    }

    public final void run()
    {
        mkf mkf1 = a;
        System.nanoTime();
        mkf1.a();
    }
}
