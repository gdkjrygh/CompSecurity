// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class ctw
    implements Runnable
{

    private cuc a;
    private chp b;
    private ctv c;

    ctw(ctv ctv1, cuc cuc, chp chp)
    {
        c = ctv1;
        a = cuc;
        b = chp;
        super();
    }

    public final void run()
    {
        ctv.a(c, a, b);
    }
}
