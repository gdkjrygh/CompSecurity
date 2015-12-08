// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class poe extends qlq
{

    private static volatile poe a[];
    private String b;
    private String c;
    private String d;
    private ptd e;
    private pro f;
    private qqh g;
    private String h;
    private Long i;
    private Long j;
    private ppc k;
    private int l;
    private int m;
    private String n;
    private ppv o;

    public poe()
    {
        b = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = null;
        k = null;
        l = 0x80000000;
        m = 0x80000000;
        n = null;
        o = null;
        F = null;
        G = -1;
    }

    public static poe[] b()
    {
        if (a == null)
        {
            synchronized (qlu.a)
            {
                if (a == null)
                {
                    a = new poe[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        int j1 = super.a() + qlp.b(1, b) + qlp.b(2, c) + qlp.b(3, h);
        int i1 = j1;
        if (k != null)
        {
            i1 = j1 + qlp.c(4, k);
        }
        j1 = i1;
        if (l != 0x80000000)
        {
            j1 = i1 + qlp.e(5, l);
        }
        i1 = j1;
        if (m != 0x80000000)
        {
            i1 = j1 + qlp.e(6, m);
        }
        j1 = i1;
        if (n != null)
        {
            j1 = i1 + qlp.b(7, n);
        }
        i1 = j1;
        if (o != null)
        {
            i1 = j1 + qlp.c(8, o);
        }
        j1 = i1;
        if (d != null)
        {
            j1 = i1 + qlp.b(9, d);
        }
        i1 = j1;
        if (i != null)
        {
            i1 = j1 + qlp.e(10, i.longValue());
        }
        j1 = i1;
        if (j != null)
        {
            j1 = i1 + qlp.e(11, j.longValue());
        }
        i1 = j1;
        if (e != null)
        {
            i1 = j1 + qlp.c(12, e);
        }
        j1 = i1;
        if (f != null)
        {
            j1 = i1 + qlp.c(13, f);
        }
        i1 = j1;
        if (g != null)
        {
            i1 = j1 + qlp.c(14, g);
        }
        return i1;
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
    //                   40: 209
    //                   48: 255
    //                   58: 295
    //                   66: 306
    //                   74: 335
    //                   80: 346
    //                   88: 360
    //                   98: 374
    //                   106: 403
    //                   114: 432;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16
_L1:
        if (super.a(qlo1, i1)) goto _L17; else goto _L2
_L2:
        return this;
_L3:
        b = qlo1.g();
          goto _L17
_L4:
        c = qlo1.g();
          goto _L17
_L5:
        h = qlo1.g();
          goto _L17
_L6:
        if (k == null)
        {
            k = new ppc();
        }
        qlo1.a(k);
          goto _L17
_L7:
        int j1 = qlo1.i();
        switch (j1)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
            l = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 1: // '\001'
        case 2: // '\002'
            m = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L9:
        n = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L10:
        if (o == null)
        {
            o = new ppv();
        }
        qlo1.a(o);
        continue; /* Loop/switch isn't completed */
_L11:
        d = qlo1.g();
        continue; /* Loop/switch isn't completed */
_L12:
        i = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L13:
        j = Long.valueOf(qlo1.j());
        continue; /* Loop/switch isn't completed */
_L14:
        if (e == null)
        {
            e = new ptd();
        }
        qlo1.a(e);
        continue; /* Loop/switch isn't completed */
_L15:
        if (f == null)
        {
            f = new pro();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L16:
        if (g == null)
        {
            g = new qqh();
        }
        qlo1.a(g);
        if (true) goto _L17; else goto _L18
_L18:
    }

    public final void a(qlp qlp1)
    {
        qlp1.a(1, b);
        qlp1.a(2, c);
        qlp1.a(3, h);
        if (k != null)
        {
            qlp1.a(4, k);
        }
        if (l != 0x80000000)
        {
            qlp1.a(5, l);
        }
        if (m != 0x80000000)
        {
            qlp1.a(6, m);
        }
        if (n != null)
        {
            qlp1.a(7, n);
        }
        if (o != null)
        {
            qlp1.a(8, o);
        }
        if (d != null)
        {
            qlp1.a(9, d);
        }
        if (i != null)
        {
            qlp1.b(10, i.longValue());
        }
        if (j != null)
        {
            qlp1.b(11, j.longValue());
        }
        if (e != null)
        {
            qlp1.a(12, e);
        }
        if (f != null)
        {
            qlp1.a(13, f);
        }
        if (g != null)
        {
            qlp1.a(14, g);
        }
        super.a(qlp1);
    }
}
