// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pnj extends qlq
{

    private Long a;
    private Long b;
    private Boolean c;
    private int d;
    private Long e;
    private Long f;
    private Integer g;
    private long h[];

    public pnj()
    {
        a = null;
        b = null;
        c = null;
        d = 0x80000000;
        e = null;
        f = null;
        g = null;
        h = qmb.b;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int j = super.a();
        int i = j;
        if (a != null)
        {
            i = j + qlp.e(1, a.longValue());
        }
        j = i;
        if (b != null)
        {
            j = i + qlp.e(2, b.longValue());
        }
        i = j;
        if (c != null)
        {
            c.booleanValue();
            i = j + (qlp.c(3) + 1);
        }
        j = i;
        if (d != 0x80000000)
        {
            j = i + qlp.e(4, d);
        }
        i = j;
        if (e != null)
        {
            i = j + qlp.e(5, e.longValue());
        }
        j = i;
        if (f != null)
        {
            j = i + qlp.e(6, f.longValue());
        }
        i = j;
        if (g != null)
        {
            i = j + qlp.e(7, g.intValue());
        }
        j = i;
        if (h != null)
        {
            j = i;
            if (h.length > 0)
            {
                int k = 0;
                for (j = ((flag) ? 1 : 0); j < h.length; j++)
                {
                    k += qlp.a(h[j]);
                }

                j = i + k + h.length * 1;
            }
        }
        return j;
    }

    public final qlw a(qlo qlo1)
    {
_L12:
        int i = qlo1.a();
        i;
        JVM INSTR lookupswitch 10: default 96
    //                   0: 105
    //                   8: 107
    //                   16: 121
    //                   24: 135
    //                   32: 149
    //                   40: 191
    //                   48: 205
    //                   56: 219
    //                   64: 233
    //                   66: 334;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L1:
        if (super.a(qlo1, i)) goto _L12; else goto _L2
_L2:
        return this;
_L3:
        a = Long.valueOf(qlo1.j());
          goto _L12
_L4:
        b = Long.valueOf(qlo1.j());
          goto _L12
_L5:
        c = Boolean.valueOf(qlo1.f());
          goto _L12
_L6:
        int j = qlo1.i();
        switch (j)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
            d = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        e = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L8:
        f = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L9:
        g = Integer.valueOf(qlo1.i());
        continue; /* Loop/switch isn't completed */
_L10:
        int i1 = qmb.b(qlo1, 64);
        long al[];
        int k;
        if (h == null)
        {
            k = 0;
        } else
        {
            k = h.length;
        }
        al = new long[i1 + k];
        i1 = k;
        if (k != 0)
        {
            System.arraycopy(h, 0, al, 0, k);
            i1 = k;
        }
        for (; i1 < al.length - 1; i1++)
        {
            al[i1] = qlo1.j();
            qlo1.a();
        }

        al[i1] = qlo1.j();
        h = al;
        continue; /* Loop/switch isn't completed */
_L11:
        int k1 = qlo1.c(qlo1.i());
        int l = qlo1.o();
        int j1;
        for (j1 = 0; qlo1.m() > 0; j1++)
        {
            qlo1.j();
        }

        qlo1.e(l);
        long al1[];
        if (h == null)
        {
            l = 0;
        } else
        {
            l = h.length;
        }
        al1 = new long[j1 + l];
        j1 = l;
        if (l != 0)
        {
            System.arraycopy(h, 0, al1, 0, l);
            j1 = l;
        }
        for (; j1 < al1.length; j1++)
        {
            al1[j1] = qlo1.j();
        }

        h = al1;
        qlo1.d(k1);
        if (true) goto _L12; else goto _L13
_L13:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.b(1, a.longValue());
        }
        if (b != null)
        {
            qlp1.b(2, b.longValue());
        }
        if (c != null)
        {
            qlp1.a(3, c.booleanValue());
        }
        if (d != 0x80000000)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.b(5, e.longValue());
        }
        if (f != null)
        {
            qlp1.b(6, f.longValue());
        }
        if (g != null)
        {
            qlp1.a(7, g.intValue());
        }
        if (h != null && h.length > 0)
        {
            for (int i = 0; i < h.length; i++)
            {
                qlp1.b(8, h[i]);
            }

        }
        super.a(qlp1);
    }
}
