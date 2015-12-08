// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public class bsz
{

    static final String a = bsz.getSimpleName();
    public btc b;
    public int c;
    private final bnk d;
    private final cag e;
    private final int f;
    private final int g;
    private final List h;
    private final List i;
    private final int j;
    private final int k;
    private int l;

    public bsz(bnk bnk1, cag cag1, List list, List list1, int i1, int j1, int k1)
    {
        l = -1;
        c = 0;
        d = bnk1;
        e = cag1;
        f = i1;
        g = j1;
        h = list;
        i = list1;
        j = list.size();
        k = k1;
    }

    public static btb a(bnk bnk1, cag cag1, int i1)
    {
        return new bta(bnk1, cag1, i1);
    }

    public final void a()
    {
        if (c == 3)
        {
            c = 0;
        } else
        if (c != 2)
        {
            l = l + 1;
            if (l >= j)
            {
                c = 0;
                if (b != null)
                {
                    b.b();
                    return;
                }
            } else
            {
                bni bni = d.a((cnq)h.get(l), k, (coa)i.get(l), f, g);
                b.a();
                e.a(bni);
                return;
            }
        }
    }

}
