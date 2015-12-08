// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class init> extends aid
{

    final pl this$0;

    public final long a(ahX ahx, long l)
    {
        l = super.a(ahx, l);
        ahx = mProgressListeners;
        int j = ahx.length;
        for (int i = 0; i < j; i++)
        {
            ahx[i].a(l, mResponseBody.a());
        }

        return l;
    }

    >(aio aio)
    {
        this$0 = pl.this;
        super(aio);
    }
}
