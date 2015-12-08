// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dmw
    implements drx
{

    private gjr a;
    private gka b;
    private boolean c;
    private int d;
    private int e;

    dmw(gjr gjr1, gka gka)
    {
        a = gjr1;
        b = gka;
        c = false;
    }

    dmw(gjr gjr1, gka gka, int i, int j)
    {
        a = gjr1;
        b = gka;
        e = i;
        d = j;
        c = true;
    }

    public final erm a(erm erm1)
    {
        erm1.l = false;
        if (c)
        {
            return erm1.a(gjr.a(b, e, d));
        } else
        {
            return erm1.a(gjr.b(b));
        }
    }
}
