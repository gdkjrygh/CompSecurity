// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dxr
    implements lzy
{

    private dxo a;

    dxr(dxo dxo1)
    {
        a = dxo1;
        super();
    }

    public final void a(lzx lzx)
    {
        lzx = (maa)lzx;
        dxo.c(a);
        if (lzx.a())
        {
            dxo.a(a, c.cn);
            return;
        }
        if (dxo.d(a).a())
        {
            noy.a("status", lzx);
        }
        dxo.a(a, c.cm);
    }
}
