// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.EnumMap;

final class idx
    implements ign
{

    private idu a;

    idx(idu idu1)
    {
        a = idu1;
        super();
    }

    public final void a(igj igj1)
    {
        idy.a[igj1.ordinal()];
        JVM INSTR tableswitch 1 5: default 44
    //                   1 45
    //                   2 45
    //                   3 45
    //                   4 45
    //                   5 165;
           goto _L1 _L2 _L2 _L2 _L2 _L3
_L1:
        return;
_L2:
        int i = idu.h(a).size();
        idu.i(a);
        if (i > 200)
        {
            ido.h(false).a(a.h(), "selection_too_large_tag");
            return;
        }
        if (idu.l(a).a((ejm)idu.j(a).a.get(igj1), idu.k(a)))
        {
            idu.a(a).b();
            idu.a(a).a(idu.m(a).getString(b.yS)).a(true);
            return;
        }
          goto _L1
_L3:
        int j = idu.h(a).size();
        idu.i(a);
        if (j > 1500)
        {
            ido.h(true).a(a.h(), "selection_too_large_tag");
            return;
        } else
        {
            idu.n(a);
            return;
        }
    }
}
