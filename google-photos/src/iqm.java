// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class iqm
{

    final peq a;
    final peh b;
    final int c;
    private final int d;
    private final int e;

    public iqm(peh peh1, int i, int j)
    {
        if (peh1 == null)
        {
            throw new IllegalArgumentException("Cannot create a story element from a null enrichment");
        } else
        {
            a = null;
            b = peh1;
            d = i;
            e = j;
            c = 2;
            return;
        }
    }

    public iqm(peq peq1)
    {
        if (peq1 == null)
        {
            throw new IllegalArgumentException("Cannot create a story element from a null moment");
        } else
        {
            a = peq1;
            b = null;
            d = 0;
            e = 0;
            c = 1;
            return;
        }
    }

    public final boolean a()
    {
        boolean flag1 = false;
        c;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 38
    //                   2 72;
           goto _L1 _L2 _L3
_L1:
        throw new RuntimeException("Unknown element type");
_L2:
        boolean flag;
        if (a.f == null)
        {
            flag = false;
        } else
        {
            flag = a.f.booleanValue();
        }
_L5:
        if (!flag)
        {
            flag1 = true;
        }
        return flag1;
_L3:
        if (b.e == null)
        {
            flag = false;
        } else
        {
            flag = b.e.booleanValue();
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final boolean b()
    {
        return c == 1 && a.b == 1;
    }

    public final pex c()
    {
        c;
        JVM INSTR tableswitch 1 2: default 28
    //                   1 30
    //                   2 79;
           goto _L1 _L2 _L3
_L1:
        peq peq1;
        return null;
_L2:
        if ((peq1 = a) != null && peq1.a != null && peq1.a.a != null)
        {
            pex pex1 = new pex();
            pex1.a = 3;
            pex1.d = peq1.a;
            return pex1;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        peh peh1 = b;
        if (peh1 != null && peh1.b != null && peh1.b.a != null)
        {
            pex pex2 = new pex();
            pex2.a = 4;
            pex2.e = peh1.b;
            pex2.b = Integer.valueOf(d);
            pex2.c = Integer.valueOf(e);
            return pex2;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }
}
