// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.BitSet;

// Referenced classes of package b.a:
//            gx, ez, gt, gn, 
//            fm

final class fc extends gx
{

    private fc()
    {
    }

    fc(byte byte0)
    {
        this();
    }

    public final void a(gn gn, fm fm)
    {
        fm = (ez)fm;
        gn = (gt)gn;
        gn.a(((ez) (fm)).a);
        gn.a(((ez) (fm)).b);
        gn.a(((ez) (fm)).c);
        gn.a(((ez) (fm)).d);
        gn.a(((ez) (fm)).e);
        gn.a(((ez) (fm)).f);
        gn.a(((ez) (fm)).g);
        gn.a(((ez) (fm)).h);
        gn.a(((ez) (fm)).i);
        BitSet bitset = new BitSet();
        if (fm.m())
        {
            bitset.set(0);
        }
        gn.a(bitset, 1);
        if (fm.m())
        {
            gn.a(((ez) (fm)).j);
        }
    }

    public final void b(gn gn, fm fm)
    {
        fm = (ez)fm;
        gn = (gt)gn;
        fm.a = gn.p();
        ez.a();
        fm.b = gn.p();
        ez.b();
        fm.c = gn.p();
        ez.c();
        fm.d = gn.m();
        fm.e();
        fm.e = gn.m();
        fm.g();
        fm.f = gn.m();
        fm.i();
        fm.g = gn.q();
        ez.j();
        fm.h = gn.p();
        ez.k();
        fm.i = gn.p();
        ez.l();
        if (gn.b(1).get(0))
        {
            fm.j = gn.m();
            fm.n();
        }
    }
}
