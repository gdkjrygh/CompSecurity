// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mtv
    implements Runnable
{

    private mtf a;
    private mts b;

    mtv(mts mts1, mtf mtf1)
    {
        b = mts1;
        a = mtf1;
        super();
    }

    public final void run()
    {
        a.f(mts.c(b));
    }
}
