// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, aj, gt, ct, 
//            gn, fm

final class am extends gx
{

    private am()
    {
    }

    am(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (aj)fm;
        gn = (gt)gn;
        BitSet bitset = new BitSet();
        if (fm.a())
        {
            bitset.set(0);
        }
        gn.a(bitset, 1);
        if (fm.a())
        {
            ((aj) (fm)).a.b(gn);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (aj)fm;
        gn = (gt)gn;
        if (gn.b(1).get(0))
        {
            fm.a = new ct();
            ((aj) (fm)).a.a(gn);
            aj.b();
        }
    }
}
