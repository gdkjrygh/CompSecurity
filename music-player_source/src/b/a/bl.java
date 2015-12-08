// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, bi, gt, gn, 
//            fm

final class bl extends gx
{

    private bl()
    {
    }

    bl(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (bi)fm;
        gn = (gt)gn;
        gn.a(((bi) (fm)).a);
        gn.a(((bi) (fm)).c);
        gn.a(((bi) (fm)).d);
        BitSet bitset = new BitSet();
        if (fm.b())
        {
            bitset.set(0);
        }
        gn.a(bitset, 1);
        if (fm.b())
        {
            gn.a(((bi) (fm)).b);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (bi)fm;
        gn = (gt)gn;
        fm.a = gn.p();
        bi.a();
        fm.c = gn.p();
        bi.d();
        fm.d = gn.n();
        fm.f();
        if (gn.b(1).get(0))
        {
            fm.b = gn.p();
            bi.c();
        }
    }
}
