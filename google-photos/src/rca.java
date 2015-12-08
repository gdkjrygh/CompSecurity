// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class rca extends qlq
{

    public rba a;
    public ras b;
    public ran c;
    public rbo d;
    public rai e;
    public raj f;
    public rau g;
    public int h;
    public ral i;
    public rak j;
    public rbt k;
    public rap l;
    public qzw m;
    public rbl n;
    public rav o;
    private rbq p;
    private rbr q;

    public rca()
    {
        a = null;
        b = null;
        p = null;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = 0x80000000;
        i = null;
        j = null;
        k = null;
        l = null;
        m = null;
        n = null;
        o = null;
        q = null;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        int j1 = super.a();
        int i1 = j1;
        if (a != null)
        {
            i1 = j1 + qlp.c(1, a);
        }
        j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(2, b);
        }
        i1 = j1;
        if (p != null)
        {
            i1 = j1 + qlp.c(3, p);
        }
        j1 = i1;
        if (c != null)
        {
            j1 = i1 + qlp.c(4, c);
        }
        i1 = j1;
        if (d != null)
        {
            i1 = j1 + qlp.c(5, d);
        }
        j1 = i1;
        if (e != null)
        {
            j1 = i1 + qlp.c(6, e);
        }
        i1 = j1;
        if (f != null)
        {
            i1 = j1 + qlp.c(7, f);
        }
        j1 = i1;
        if (g != null)
        {
            j1 = i1 + qlp.c(8, g);
        }
        i1 = j1;
        if (h != 0x80000000)
        {
            i1 = j1 + qlp.e(9, h);
        }
        j1 = i1;
        if (i != null)
        {
            j1 = i1 + qlp.c(10, i);
        }
        i1 = j1;
        if (j != null)
        {
            i1 = j1 + qlp.c(11, j);
        }
        j1 = i1;
        if (k != null)
        {
            j1 = i1 + qlp.c(12, k);
        }
        i1 = j1;
        if (l != null)
        {
            i1 = j1 + qlp.c(13, l);
        }
        j1 = i1;
        if (m != null)
        {
            j1 = i1 + qlp.c(14, m);
        }
        i1 = j1;
        if (n != null)
        {
            i1 = j1 + qlp.c(15, n);
        }
        j1 = i1;
        if (o != null)
        {
            j1 = i1 + qlp.c(16, o);
        }
        i1 = j1;
        if (q != null)
        {
            i1 = j1 + qlp.c(17, q);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L20:
        int i1 = qlo1.a();
        i1;
        JVM INSTR lookupswitch 18: default 160
    //                   0: 169
    //                   10: 171
    //                   18: 200
    //                   26: 229
    //                   34: 258
    //                   42: 287
    //                   50: 316
    //                   58: 345
    //                   66: 374
    //                   72: 403
    //                   82: 535
    //                   90: 564
    //                   98: 593
    //                   106: 622
    //                   114: 651
    //                   122: 680
    //                   130: 709
    //                   138: 738;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19
_L1:
        if (super.a(qlo1, i1)) goto _L20; else goto _L2
_L2:
        return this;
_L3:
        if (a == null)
        {
            a = new rba();
        }
        qlo1.a(a);
          goto _L20
_L4:
        if (b == null)
        {
            b = new ras();
        }
        qlo1.a(b);
          goto _L20
_L5:
        if (p == null)
        {
            p = new rbq();
        }
        qlo1.a(p);
          goto _L20
_L6:
        if (c == null)
        {
            c = new ran();
        }
        qlo1.a(c);
          goto _L20
_L7:
        if (d == null)
        {
            d = new rbo();
        }
        qlo1.a(d);
          goto _L20
_L8:
        if (e == null)
        {
            e = new rai();
        }
        qlo1.a(e);
          goto _L20
_L9:
        if (f == null)
        {
            f = new raj();
        }
        qlo1.a(f);
          goto _L20
_L10:
        if (g == null)
        {
            g = new rau();
        }
        qlo1.a(g);
          goto _L20
_L11:
        int j1 = qlo1.i();
        switch (j1)
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
        case 9: // '\t'
        case 10: // '\n'
        case 11: // '\013'
        case 12: // '\f'
        case 13: // '\r'
        case 14: // '\016'
        case 15: // '\017'
        case 16: // '\020'
        case 17: // '\021'
        case 18: // '\022'
        case 19: // '\023'
        case 20: // '\024'
        case 21: // '\025'
        case 22: // '\026'
        case 23: // '\027'
        case 24: // '\030'
            h = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (i == null)
        {
            i = new ral();
        }
        qlo1.a(i);
        continue; /* Loop/switch isn't completed */
_L13:
        if (j == null)
        {
            j = new rak();
        }
        qlo1.a(j);
        continue; /* Loop/switch isn't completed */
_L14:
        if (k == null)
        {
            k = new rbt();
        }
        qlo1.a(k);
        continue; /* Loop/switch isn't completed */
_L15:
        if (l == null)
        {
            l = new rap();
        }
        qlo1.a(l);
        continue; /* Loop/switch isn't completed */
_L16:
        if (m == null)
        {
            m = new qzw();
        }
        qlo1.a(m);
        continue; /* Loop/switch isn't completed */
_L17:
        if (n == null)
        {
            n = new rbl();
        }
        qlo1.a(n);
        continue; /* Loop/switch isn't completed */
_L18:
        if (o == null)
        {
            o = new rav();
        }
        qlo1.a(o);
        continue; /* Loop/switch isn't completed */
_L19:
        if (q == null)
        {
            q = new rbr();
        }
        qlo1.a(q);
        if (true) goto _L20; else goto _L21
_L21:
    }

    public final void a(qlp qlp1)
    {
        if (a != null)
        {
            qlp1.a(1, a);
        }
        if (b != null)
        {
            qlp1.a(2, b);
        }
        if (p != null)
        {
            qlp1.a(3, p);
        }
        if (c != null)
        {
            qlp1.a(4, c);
        }
        if (d != null)
        {
            qlp1.a(5, d);
        }
        if (e != null)
        {
            qlp1.a(6, e);
        }
        if (f != null)
        {
            qlp1.a(7, f);
        }
        if (g != null)
        {
            qlp1.a(8, g);
        }
        if (h != 0x80000000)
        {
            qlp1.a(9, h);
        }
        if (i != null)
        {
            qlp1.a(10, i);
        }
        if (j != null)
        {
            qlp1.a(11, j);
        }
        if (k != null)
        {
            qlp1.a(12, k);
        }
        if (l != null)
        {
            qlp1.a(13, l);
        }
        if (m != null)
        {
            qlp1.a(14, m);
        }
        if (n != null)
        {
            qlp1.a(15, n);
        }
        if (o != null)
        {
            qlp1.a(16, o);
        }
        if (q != null)
        {
            qlp1.a(17, q);
        }
        super.a(qlp1);
    }
}
