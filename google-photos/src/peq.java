// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class peq extends qlq
{

    private static volatile peq g[];
    public per a;
    public int b;
    public ppq c;
    public qgg d;
    public pes e;
    public Boolean f;
    private pgs h;
    private int i;
    private Float j;
    private pta k;

    public peq()
    {
        a = null;
        h = null;
        b = 0x80000000;
        i = 0x80000000;
        c = null;
        d = null;
        j = null;
        k = null;
        e = null;
        f = null;
        F = null;
        G = -1;
    }

    public static peq[] b()
    {
        if (g == null)
        {
            synchronized (qlu.a)
            {
                if (g == null)
                {
                    g = new peq[0];
                }
            }
        }
        return g;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int i1 = super.a();
        int l = i1;
        if (a != null)
        {
            l = i1 + qlp.c(1, a);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + qlp.c(2, h);
        }
        l = i1;
        if (b != 0x80000000)
        {
            l = i1 + qlp.e(3, b);
        }
        i1 = l;
        if (i != 0x80000000)
        {
            i1 = l + qlp.e(4, i);
        }
        l = i1;
        if (j != null)
        {
            j.floatValue();
            l = i1 + (qlp.c(6) + 4);
        }
        i1 = l;
        if (k != null)
        {
            i1 = l + qlp.c(7, k);
        }
        l = i1;
        if (e != null)
        {
            l = i1 + qlp.c(8, e);
        }
        i1 = l;
        if (f != null)
        {
            f.booleanValue();
            i1 = l + (qlp.c(9) + 1);
        }
        l = i1;
        if (c != null)
        {
            l = i1 + qlp.c(10, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l + qlp.c(11, d);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L13:
        int l = qlo1.a();
        l;
        JVM INSTR lookupswitch 11: default 104
    //                   0: 113
    //                   10: 115
    //                   18: 144
    //                   24: 173
    //                   32: 219
    //                   53: 263
    //                   58: 280
    //                   66: 309
    //                   72: 338
    //                   82: 352
    //                   90: 381;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12
_L1:
        if (super.a(qlo1, l)) goto _L13; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new per();
        }
        qlo1.a(a);
          goto _L13
_L4:
        if (h == null)
        {
            h = new pgs();
        }
        qlo1.a(h);
          goto _L13
_L5:
        int i1 = qlo1.i();
        switch (i1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            b = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            i = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        j = Float.valueOf(Float.intBitsToFloat(qlo1.k()));
        continue; /* Loop/switch isn't completed */
_L8:
        if (k == null)
        {
            k = new pta();
        }
        qlo1.a(k);
        continue; /* Loop/switch isn't completed */
_L9:
        if (e == null)
        {
            e = new pes();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L10:
        f = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L11:
        if (c == null)
        {
            c = new ppq();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L12:
        if (d == null)
        {
            d = new qgg();
        }
        qlo1.a(d);
        if (true) goto _L13; else goto _L14
_L14:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (h != null)
        {
            qlp1.a(2, h);
        }
        if (b != 0x80000000)
        {
            qlp1.a(3, b);
        }
        if (i != 0x80000000)
        {
            qlp1.a(4, i);
        }
        if (j != null)
        {
            qlp1.a(6, j.floatValue());
        }
        if (k != null)
        {
            qlp1.a(7, k);
        }
        if (e != null)
        {
            qlp1.a(8, e);
        }
        if (f != null)
        {
            qlp1.a(9, f.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(10, c);
        }
        if (d != null)
        {
            qlp1.a(11, d);
        }
        super.a(qlp1);
    }
}
