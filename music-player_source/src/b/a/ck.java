// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, ch, gt, gn, 
//            fm

final class ck extends gx
{

    private ck()
    {
    }

    ck(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (ch)fm;
        gn = (gt)gn;
        gn.a(((ch) (fm)).b);
        gn.a(((ch) (fm)).c);
        BitSet bitset = new BitSet();
        if (fm.b())
        {
            bitset.set(0);
        }
        gn.a(bitset, 1);
        if (fm.b())
        {
            gn.a(((ch) (fm)).a);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (ch)fm;
        gn = (gt)gn;
        fm.b = gn.n();
        fm.f();
        fm.c = gn.p();
        ch.h();
        if (gn.b(1).get(0))
        {
            fm.a = gn.p();
            ch.c();
        }
    }
}
