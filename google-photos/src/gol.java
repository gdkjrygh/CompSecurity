// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class gol
    implements Runnable
{

    private ekp a;
    private int b;
    private hyk c;
    private gog d;

    gol(gog gog1, ekp ekp, int i, hyk hyk1)
    {
        d = gog1;
        a = ekp;
        b = i;
        c = hyk1;
        super();
    }

    public final void run()
    {
        hyo hyo1 = (hyo)olm.a(gog.d(d), gog.a(d, gog.d(d).c().a(gog.e(d)))).b(hyo);
        if (hyo1 != null)
        {
            hyo1.a(a, b, c);
            return;
        } else
        {
            c.a(null);
            return;
        }
    }
}
