// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public class cjj
    implements cje
{

    public final ckx a;
    public final civ b;
    public ckq c;
    public long d;

    public cjj(ckx ckx1, civ civ1)
    {
        d = -1L;
        a = (ckx)b.a(ckx1, "decoderPool", null);
        b = (civ)b.a(civ1, "source", null);
    }

    public void a()
    {
        a.a(c);
        c = null;
        d = -1L;
    }

    public void a(ciw ciw1)
    {
        boolean flag = ciw1.b;
        c.a(ciw1);
        if (flag)
        {
            a();
        }
    }

    public volatile void a(Object obj)
    {
        a((ciw)obj);
    }

    public Object b()
    {
        return d();
    }

    public long c()
    {
        return d;
    }

    public ciw d()
    {
        if (c != null) goto _L2; else goto _L1
_L1:
        c = a.a(b);
        if (c != null) goto _L2; else goto _L3
_L3:
        ciw ciw1 = null;
_L5:
        return ciw1;
_L2:
        ciw ciw2 = c.c();
        ciw1 = ciw2;
        if (ciw2 != null)
        {
            d = ciw2.a;
            return ciw2;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }
}
