// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class mtk
    implements Runnable
{

    private mty a;
    private mtf b;

    mtk(mty mty1, mtf mtf)
    {
        a = mty1;
        b = mtf;
        super();
    }

    public final void run()
    {
        a.a(b, null);
    }
}
