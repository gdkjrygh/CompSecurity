// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class plj extends qlq
{

    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private int k;
    private int l;
    private Boolean m;
    private Boolean n;
    private plg o;
    private Boolean p;

    public plj()
    {
        e = null;
        f = null;
        g = null;
        h = null;
        a = null;
        i = null;
        b = null;
        j = null;
        c = null;
        k = 0x80000000;
        l = 0x80000000;
        m = null;
        d = null;
        n = null;
        o = null;
        p = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (qlp.c(1) + 1);
        }
        j1 = i1;
        if (f != null)
        {
            f.booleanValue();
            j1 = i1 + (qlp.c(2) + 1);
        }
        i1 = j1;
        if (g != null)
        {
            g.booleanValue();
            i1 = j1 + (qlp.c(3) + 1);
        }
        j1 = i1;
        if (h != null)
        {
            h.booleanValue();
            j1 = i1 + (qlp.c(4) + 1);
        }
        i1 = j1;
        if (a != null)
        {
            a.booleanValue();
            i1 = j1 + (qlp.c(5) + 1);
        }
        j1 = i1;
        if (i != null)
        {
            i.booleanValue();
            j1 = i1 + (qlp.c(6) + 1);
        }
        i1 = j1;
        if (b != null)
        {
            b.booleanValue();
            i1 = j1 + (qlp.c(7) + 1);
        }
        j1 = i1;
        if (j != null)
        {
            j.booleanValue();
            j1 = i1 + (qlp.c(8) + 1);
        }
        i1 = j1;
        if (c != null)
        {
            c.booleanValue();
            i1 = j1 + (qlp.c(9) + 1);
        }
        j1 = i1;
        if (k != 0x80000000)
        {
            j1 = i1 + qlp.e(10, k);
        }
        i1 = j1;
        if (l != 0x80000000)
        {
            i1 = j1 + qlp.e(11, l);
        }
        j1 = i1;
        if (m != null)
        {
            m.booleanValue();
            j1 = i1 + (qlp.c(12) + 1);
        }
        i1 = j1;
        if (d != null)
        {
            d.booleanValue();
            i1 = j1 + (qlp.c(13) + 1);
        }
        j1 = i1;
        if (n != null)
        {
            n.booleanValue();
            j1 = i1 + (qlp.c(14) + 1);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.c(15, o);
        }
        j1 = i1;
        if (p != null)
        {
            p.booleanValue();
            j1 = i1 + (qlp.c(16) + 1);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L19:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 17: default 152
    //                   0: 161
    //                   8: 163
    //                   16: 177
    //                   24: 191
    //                   32: 205
    //                   40: 219
    //                   48: 233
    //                   56: 247
    //                   64: 261
    //                   72: 275
    //                   80: 289
    //                   88: 331
    //                   96: 379
    //                   104: 393
    //                   112: 407
    //                   122: 421
    //                   128: 450;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18
_L1:
        if (super.a(qlo1, i1)) goto _L19; else goto _L2
_L2:
        return this;
_L3:
        e = Boolean.valueOf(qlo1.f());
          goto _L19
_L4:
        f = Boolean.valueOf(qlo1.f());
          goto _L19
_L5:
        g = Boolean.valueOf(qlo1.f());
          goto _L19
_L6:
        h = Boolean.valueOf(qlo1.f());
          goto _L19
_L7:
        a = Boolean.valueOf(qlo1.f());
          goto _L19
_L8:
        i = Boolean.valueOf(qlo1.f());
          goto _L19
_L9:
        b = Boolean.valueOf(qlo1.f());
          goto _L19
_L10:
        j = Boolean.valueOf(qlo1.f());
          goto _L19
_L11:
        c = Boolean.valueOf(qlo1.f());
          goto _L19
_L12:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            k = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            l = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L14:
        m = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L15:
        d = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L16:
        n = Boolean.valueOf(qlo1.f());
        continue; /* Loop/switch isn't completed */
_L17:
        if (o == null)
        {
            o = new plg();
        }
        qlo1.a(o);
        continue; /* Loop/switch isn't completed */
_L18:
        p = Boolean.valueOf(qlo1.f());
        if (true) goto _L19; else goto _L20
_L20:
    }

    public final void a(qlp qlp1)
    {
        if (e != null)
        {
            qlp1.a(1, e.booleanValue());
        }
        if (f != null)
        {
            qlp1.a(2, f.booleanValue());
        }
        if (g != null)
        {
            qlp1.a(3, g.booleanValue());
        }
        if (h != null)
        {
            qlp1.a(4, h.booleanValue());
        }
        if (a != null)
        {
            qlp1.a(5, a.booleanValue());
        }
        if (i != null)
        {
            qlp1.a(6, i.booleanValue());
        }
        if (b != null)
        {
            qlp1.a(7, b.booleanValue());
        }
        if (j != null)
        {
            qlp1.a(8, j.booleanValue());
        }
        if (c != null)
        {
            qlp1.a(9, c.booleanValue());
        }
        if (k != 0x80000000)
        {
            qlp1.a(10, k);
        }
        if (l != 0x80000000)
        {
            qlp1.a(11, l);
        }
        if (m != null)
        {
            qlp1.a(12, m.booleanValue());
        }
        if (d != null)
        {
            qlp1.a(13, d.booleanValue());
        }
        if (n != null)
        {
            qlp1.a(14, n.booleanValue());
        }
        if (o != null)
        {
            qlp1.a(15, o);
        }
        if (p != null)
        {
            qlp1.a(16, p.booleanValue());
        }
        super.a(qlp1);
    }
}
