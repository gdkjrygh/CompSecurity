// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            na, mt, hg, nm, 
//            mu, nb, my, nl, 
//            hb, hf, hj, mw, 
//            od, nh, nj, gi, 
//            ph, hl, gb, gn, 
//            gh, gl, nf, ng, 
//            np, nq

final class hi
    implements na
{

    mt a;
    gh b;
    final hg c;
    private final hb d;

    public hi(hg hg1, hb hb1)
    {
        c = hg1;
        super();
        d = hb1;
    }

    private nh a()
    {
        int i = a.d;
        my my1;
        if (i >= 0)
        {
            if ((my1 = c.a.a.b(i).b.a(0)).b.a == 56)
            {
                return my1.d;
            }
        }
        return null;
    }

    private void a(gl gl)
    {
        d.a(gl);
    }

    public final void a(nf nf)
    {
        no no = ((my) (nf)).c;
        gn gn1 = hf.a(nf);
        nl nl1 = ((my) (nf)).b;
        int i = nl1.a;
        if (nl1.c != 1)
        {
            throw new RuntimeException("shouldn't happen");
        }
        if (i == 3)
        {
            if (!c.h)
            {
                nh nh1 = ((my) (nf)).d;
                a(((gl) (new hj(gn1, no, nj.a(nh1, nh.a(((od)((mw) (nf)).a).f() + (c.e - c.g), nh1.b()))))));
            }
            return;
        } else
        {
            a(((gl) (new gi(gn1, no, hg.a(nf), ((mw) (nf)).a))));
            return;
        }
    }

    public final void a(ng ng)
    {
        nl nl1;
        nl1 = ((my) (ng)).b;
        break MISSING_BLOCK_LABEL_5;
_L6:
        no no;
        gn gn1;
        do
        {
            return;
        } while (nl1.a == 54 || nl1.a == 56);
        no = ((my) (ng)).c;
        gn1 = hf.a(ng);
        nl1.c;
        JVM INSTR tableswitch 1 6: default 76
    //                   1 86
    //                   2 86
    //                   3 14
    //                   4 107
    //                   5 76
    //                   6 86;
           goto _L1 _L2 _L2 _L3 _L4 _L1 _L2
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        throw new RuntimeException("shouldn't happen");
_L2:
        ng = new hj(gn1, no, hg.a(ng));
          goto _L5
        if (true) goto _L6; else goto _L4
_L5:
        a(((gl) (ng)));
        return;
_L4:
        int i = a.c.a(1);
        ng = new hl(gn1, no, hg.a(ng), c.c.a[i]);
        if (true) goto _L5; else goto _L7
_L7:
    }

    public final void a(np np)
    {
        boolean flag1 = true;
        no no = ((my) (np)).c;
        gn gn1 = hf.a(np);
        nl nl1 = ((my) (np)).b;
        nr nr = ((mw) (np)).a;
        if (nl1.c != 6)
        {
            throw new RuntimeException("shouldn't happen");
        }
        a(((gl) (b)));
        if (nl1.d)
        {
            a(((gl) (new gi(gn1, no, ((my) (np)).e, nr))));
            return;
        }
        nh nh1 = a();
        nj nj1 = hg.a(np, nh1);
        boolean flag;
        if (gn1.e || nl1.a == 43)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (nh1 == null)
        {
            flag1 = false;
        }
        if (flag != flag1)
        {
            throw new RuntimeException((new StringBuilder("Insn with result/move-result-pseudo mismatch ")).append(np).toString());
        }
        if (nl1.a == 41 && gn1.a != 35)
        {
            np = new hj(gn1, no, nj1);
        } else
        {
            np = new gi(gn1, no, nj1, nr);
        }
        a(((gl) (np)));
    }

    public final void a(nq nq)
    {
        no no = ((my) (nq)).c;
        gn gn1 = hf.a(nq);
        if (((my) (nq)).b.c != 6)
        {
            throw new RuntimeException("shouldn't happen");
        }
        nh nh1 = a();
        boolean flag1 = gn1.e;
        boolean flag;
        if (nh1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag1 != flag)
        {
            throw new RuntimeException((new StringBuilder("Insn with result/move-result-pseudo mismatch")).append(nq).toString());
        } else
        {
            a(((gl) (b)));
            a(((gl) (new hj(gn1, no, hg.a(nq, nh1)))));
            return;
        }
    }
}
