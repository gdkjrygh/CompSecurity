// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gos
    implements Runnable
{

    private goq a;

    gos(goq goq1)
    {
        a = goq1;
        super();
    }

    public final void run()
    {
        goq.b(a);
    }
}
