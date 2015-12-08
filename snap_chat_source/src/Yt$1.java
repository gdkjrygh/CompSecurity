// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class init> extends aid
{

    private Yt a;

    public final long a(ahX ahx, long l)
    {
        if (a.a != 0)
        {
            if ((l = super.a(ahx, Math.min(l, a.a))) != -1L)
            {
                ahx = a;
                ahx.a = (int)((long)((Yt) (ahx)).a - l);
                return l;
            }
        }
        return -1L;
    }

    >(Yt yt, aio aio)
    {
        a = yt;
        super(aio);
    }
}
