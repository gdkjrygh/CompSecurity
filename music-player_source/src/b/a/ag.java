// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, ad, gt, gn, 
//            fm

final class ag extends gx
{

    private ag()
    {
    }

    ag(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (ad)fm;
        gn = (gt)gn;
        gn.a(((ad) (fm)).a);
        gn.a(((ad) (fm)).b);
        BitSet bitset = new BitSet();
        if (fm.e())
        {
            bitset.set(0);
        }
        gn.a(bitset, 1);
        if (fm.e())
        {
            gn.a(((ad) (fm)).c);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (ad)fm;
        gn = (gt)gn;
        fm.a = gn.m();
        fm.b();
        fm.b = gn.m();
        fm.d();
        if (gn.b(1).get(0))
        {
            fm.c = gn.m();
            fm.f();
        }
    }
}
