// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lpi
    implements Runnable
{

    private lpg a;

    lpi(lpg lpg1)
    {
        a = lpg1;
        super();
    }

    public final void run()
    {
        lpg.b(a);
    }
}
