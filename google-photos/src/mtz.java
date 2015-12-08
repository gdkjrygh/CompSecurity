// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mtz
    implements Runnable
{

    private mtf a;
    private mue b;
    private mty c;

    mtz(mty mty1, mtf mtf, mue mue)
    {
        c = mty1;
        a = mtf;
        b = mue;
        super();
    }

    public final void run()
    {
        mty.a(c, a, b);
    }
}
