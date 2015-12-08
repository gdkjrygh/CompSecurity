// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pms extends qlq
{

    private static volatile pms i[];
    public String a;
    public String b;
    public String c;
    public String d;
    public Boolean e;
    public String f;
    public String g;
    public String h;
    private String j;
    private pml k[];
    private Boolean l;
    private int m;
    private Long n;
    private Boolean o;

    public pms()
    {
        a = null;
        b = null;
        c = null;
        j = null;
        d = null;
        e = null;
        k = pml.b();
        f = null;
        l = null;
        m = 0x80000000;
        g = null;
        h = null;
        n = null;
        o = null;
        F = null;
        G = -1;
    }

    public static pms[] b()
    {
        if (i == null)
        {
            synchronized (qlu.a)
            {
                if (i == null)
                {
                    i = new pms[0];
                }
            }
        }
        return i;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.b(1, a);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.b(2, c);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.b(3, j);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.b(4, d);
        }
        i1 = j1;
        if (e != null)
        {
            e.booleanValue();
            i1 = j1 + (qlp.c(5) + 1);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1;
            if (k.length > 0)
            {
                for (j1 = 0; j1 < k.length;)
                {
                    pml pml1 = k[j1];
                    int k1 = i1;
                    if (pml1 != null)
                    {
                        k1 = i1 + qlp.c(6, pml1);
                    }
                    j1++;
                    i1 = k1;
                }

                j1 = i1;
            }
        }
        i1 = j1;
        if (b != null)
        {
            i1 = j1 + qlp.b(7, b);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.b(8, f);
        }
        i1 = j1;
        if (l != null)
        {
            l.booleanValue();
            i1 = j1 + (qlp.c(9) + 1);
        }
        j1 = i1;
        if (m != 0x80000000)
        {
            j1 = i1 + qlp.e(10, m);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.b(11, g);
        }
        j1 = i1;
        if (h != null)
        {
            j1 = i1 + qlp.b(12, h);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.e(13, n.longValue());
        }
        j1 = i1;
        if (o != null)
        {
            o.booleanValue();
            j1 = i1 + (qlp.c(14) + 1);
        }
        return j1;
    }

    public final qlw a(qlo qlo1)
    {
_L17:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 15: default 136
    //                   0: 145
    //                   10: 147
    //                   18: 158
    //                   26: 169
    //                   34: 180
    //                   40: 191
    //                   50: 205
    //                   58: 329
    //                   66: 340
    //                   72: 351
    //                   80: 365
    //                   90: 431
    //                   98: 442
    //                   104: 453
    //                   112: 467;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.a(qlo1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        a = qlo1.g();
          goto _L17
_L4:
        c = qlo1.g();
          goto _L17
_L5:
        j = qlo1.g();
          goto _L17
_L6:
        d = qlo1.g();
          goto _L17
_L7:
        e = Boolean.valueOf(qlo1.f());
          goto _L17
_L8:
        int l1 = qmb.b(qlo1, 50);
        pml apml[];
        int j1;
        if (k == null)
        {
            j1 = 0;
        } else
        {
            j1 = k.length;
        }
        apml = new pml[l1 + j1];
        l1 = j1;
        if (j1 != 0)
        {
            System.arraycopy(k, 0, apml, 0, j1);
            l1 = j1;
        }
        for (; l1 < apml.length - 1; l1++)
        {
            apml[l1] = new pml();
            qlo1.a(apml[l1]);
            qlo1.a();
        }

        apml[l1] = new pml();
        qlo1.a(apml[l1]);
        k = apml;
          goto _L17
_L9:
        b = qlo1.g();
          goto _L17
_L10:
        f = qlo1.g();
          goto _L17
_L11:
        l = Boolean.valueOf(qlo1.f());
          goto _L17
_L12:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            m = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L13:
        g = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L14:
        h = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L15:
        n = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L16:
        o = Boolean.valueOf(qlo1.f());
        if (true) goto _L17; else goto _L18
_L18:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (c != null)
        {
            qlp1.a(2, c);
        }
        if (j != null)
        {
            qlp1.a(3, j);
        }
        if (d != null)
        {
            qlp1.a(4, d);
        }
        if (e != null)
        {
            qlp1.a(5, e.booleanValue());
        }
        if (k != null && k.length > 0)
        {
            for (int i1 = 0; i1 < k.length; i1++)
            {
                pml pml1 = k[i1];
                if (pml1 != null)
                {
                    qlp1.a(6, pml1);
                }
            }

        }
        if (b != null)
        {
            qlp1.a(7, b);
        }
        if (f != null)
        {
            qlp1.a(8, f);
        }
        if (l != null)
        {
            qlp1.a(9, l.booleanValue());
        }
        if (m != 0x80000000)
        {
            qlp1.a(10, m);
        }
        if (g != null)
        {
            qlp1.a(11, g);
        }
        if (h != null)
        {
            qlp1.a(12, h);
        }
        if (n != null)
        {
            qlp1.b(13, n.longValue());
        }
        if (o != null)
        {
            qlp1.a(14, o.booleanValue());
        }
        super.a(qlp1);
    }
}
