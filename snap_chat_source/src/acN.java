// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.TreeMap;

public final class acN
{

    abH a;
    byte b[];
    TreeMap c;
    private final abK d;

    public acN(abK abk)
    {
        d = abk;
        a = null;
        b = null;
        c = null;
    }

    final void a()
    {
        if (a == null)
        {
            abK abk = d;
            abk.a();
            a = abk.c;
        }
    }

    public final void a(aeG aeg)
    {
        a();
        int j = ((aeN) (a)).K.length;
        for (int i = 0; i < j; i++)
        {
            abH.a a1 = a.a(i);
            int k = a1.a;
            int l = a1.b;
            int i1 = l - k;
            if (i1 >= 0x10000)
            {
                throw new UnsupportedOperationException((new StringBuilder("bogus exception range: ")).append(aeO.a(k)).append("..").append(aeO.a(l)).toString());
            }
            aeg.d(k);
            aeg.c(i1);
            aeg.c(((Integer)c.get(a1.c)).intValue());
        }

        aeg.a(b);
    }

    public final int b()
    {
        a();
        return ((aeN) (a)).K.length;
    }
}
