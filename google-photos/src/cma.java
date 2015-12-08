// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;

public final class cma
{

    public byte a[];
    public final cmc b;
    public final cmj c;
    private final cme d;

    cma()
    {
        b = new cmc();
        c = new cmj();
        d = new cme();
    }

    cma(cmf cmf1)
    {
        if (cmf1.c() != null)
        {
            b = new cmc(cmf1.c());
        } else
        {
            b = new cmc();
        }
        if (cmf1.d() != null)
        {
            c = new cmj(cmf1.d());
        } else
        {
            c = new cmj();
        }
        if (cmf1.e() != null)
        {
            d = new cme(cmf1.e());
            return;
        } else
        {
            d = new cme();
            return;
        }
    }

    public final cmf a()
    {
        return a(bjn.a, bjx.a);
    }

    public final cmf a(bjn abjn[], bjx abjx[])
    {
        Object obj;
        cmi cmi1;
        obj = null;
        b.a(abjn, "postProcessors", null);
        b.a(abjx, "segmenters", null);
        int l = abjn.length;
        for (int i = 0; i < l; i++)
        {
            abjn[i].a(c);
        }

        abjn = c;
        cmi1 = new cmi(((cmj) (abjn)).a, ((cmj) (abjn)).b);
        if (b.a()) goto _L2; else goto _L1
_L1:
        long l1;
        cmc cmc1 = b;
        int j;
        int i1;
        if (cmi1.a(cos.a) || cmi1.a(cos.b))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j != 0) goto _L4; else goto _L3
_L3:
        l1 = 0L;
_L7:
        cmc1.a = b.b(l1, "durationUs");
_L2:
        abjn = b;
        c.a(abjn.a(), "Required field durationUs not set.");
        abjn = new cmb(((cmc) (abjn)).a, ((cmc) (abjn)).b, ((cmc) (abjn)).c, ((cmc) (abjn)).d, ((cmc) (abjn)).e);
        i1 = abjx.length;
        for (j = 0; j < i1; j++)
        {
            abjx[j].a(abjn, cmi1, d);
        }

        break MISSING_BLOCK_LABEL_331;
_L4:
        if (!cmi1.a(cos.b)) goto _L6; else goto _L5
_L5:
        abjn = cos.b;
_L8:
        abjn = cmi1.b(abjn);
        int k = abjn.size();
        if (k == 0)
        {
            l1 = 0L;
        } else
        if (k == 1)
        {
            l1 = abjn.keyAt(k - 1);
        } else
        {
            l1 = abjn.keyAt(k - 1);
            l1 = (l1 - abjn.keyAt(k - 2)) + l1;
        }
        if (true) goto _L7; else goto _L6
_L6:
        abjn = obj;
        if (cmi1.a(cos.a))
        {
            abjn = cos.a;
        }
          goto _L8
        abjx = new cmd(d.a);
        return new clz(a, abjn, cmi1, abjx);
    }
}
