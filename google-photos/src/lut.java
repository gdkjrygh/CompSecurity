// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lut
    implements Runnable
{

    private lqa a;
    private lur b;

    lut(lur lur1, lqa lqa1)
    {
        b = lur1;
        a = lqa1;
        super();
    }

    public final void run()
    {
        a.a(lur.a(b));
    }
}
