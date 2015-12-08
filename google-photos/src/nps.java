// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nps
    implements lzy
{

    private npr a;

    nps(npr npr1)
    {
        a = npr1;
        super();
    }

    public final void a(lzx lzx)
    {
        lzx = (mcm)lzx;
        if (lzx != null)
        {
            lzx = lzx.a();
            a.a(lzx);
        }
        if (npr.a(a).c())
        {
            npr.a(a).b();
        }
    }
}
