// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class oxz extends qlq
{

    public qpw a;
    public qyv b;
    public rca c;
    private int d[];
    private int e;
    private oya f;
    private Long g;
    private oxy h;
    private int i;
    private int j;
    private int k;

    public oxz()
    {
        a = null;
        b = null;
        c = null;
        d = qmb.a;
        e = 0x80000000;
        f = null;
        g = null;
        h = null;
        i = 0x80000000;
        j = 0x80000000;
        k = 0x80000000;
        F = null;
        G = -1;
    }

    protected final int a()
    {
        boolean flag = false;
        int i1 = super.a();
        int l = i1;
        if (i != 0x80000000)
        {
            l = i1 + qlp.e(1, i);
        }
        i1 = l;
        if (j != 0x80000000)
        {
            i1 = l + qlp.e(2, j);
        }
        l = i1;
        if (k != 0x80000000)
        {
            l = i1 + qlp.e(3, k);
        }
        i1 = l;
        if (a != null)
        {
            i1 = l + qlp.c(4, a);
        }
        int j1 = i1;
        if (b != null)
        {
            j1 = i1 + qlp.c(5, b);
        }
        l = j1;
        if (c != null)
        {
            l = j1 + qlp.c(6, c);
        }
        i1 = l;
        if (d != null)
        {
            i1 = l;
            if (d.length > 0)
            {
                int k1 = 0;
                for (i1 = ((flag) ? 1 : 0); i1 < d.length; i1++)
                {
                    k1 += qlp.b(d[i1]);
                }

                i1 = l + k1 + d.length * 1;
            }
        }
        l = i1;
        if (e != 0x80000000)
        {
            l = i1 + qlp.e(8, e);
        }
        i1 = l;
        if (f != null)
        {
            i1 = l + qlp.c(9, f);
        }
        l = i1;
        if (g != null)
        {
            g.longValue();
            l = i1 + (qlp.c(10) + 8);
        }
        i1 = l;
        if (h != null)
        {
            i1 = l + qlp.c(11, h);
        }
        return i1;
    }

    public final qlw a(qlo qlo1)
    {
_L15:
        int l = qlo1.a();
        l;
        JVM INSTR lookupswitch 13: default 120
    //                   0: 129
    //                   8: 131
    //                   16: 279
    //                   24: 1859
    //                   34: 1927
    //                   42: 1956
    //                   50: 1985
    //                   56: 2014
    //                   58: 2115
    //                   64: 2243
    //                   74: 2303
    //                   81: 2332
    //                   90: 2346;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14
_L1:
        if (super.a(qlo1, l)) goto _L15; else goto _L2
_L2:
        return this;
_L3:
        int i1 = qlo1.i();
        switch (i1)
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
        case 100: // 'd'
        case 200: 
        case 201: 
        case 202: 
        case 203: 
            i = i1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
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
        case 80: // 'P'
        case 81: // 'Q'
        case 100: // 'd'
        case 101: // 'e'
        case 102: // 'f'
        case 103: // 'g'
        case 104: // 'h'
        case 105: // 'i'
        case 106: // 'j'
        case 107: // 'k'
        case 108: // 'l'
        case 109: // 'm'
        case 110: // 'n'
        case 111: // 'o'
        case 112: // 'p'
        case 113: // 'q'
        case 114: // 'r'
        case 115: // 's'
        case 116: // 't'
        case 117: // 'u'
        case 118: // 'v'
        case 119: // 'w'
        case 120: // 'x'
        case 121: // 'y'
        case 122: // 'z'
        case 123: // '{'
        case 124: // '|'
        case 125: // '}'
        case 126: // '~'
        case 127: // '\177'
        case 128: 
        case 129: 
        case 130: 
        case 131: 
        case 132: 
        case 133: 
        case 134: 
        case 135: 
        case 136: 
        case 137: 
        case 138: 
        case 139: 
        case 140: 
        case 141: 
        case 142: 
        case 143: 
        case 144: 
        case 145: 
        case 146: 
        case 147: 
        case 148: 
        case 149: 
        case 150: 
        case 151: 
        case 152: 
        case 153: 
        case 154: 
        case 155: 
        case 156: 
        case 157: 
        case 158: 
        case 159: 
        case 160: 
        case 161: 
        case 162: 
        case 163: 
        case 164: 
        case 165: 
        case 166: 
        case 167: 
        case 168: 
        case 169: 
        case 170: 
        case 171: 
        case 172: 
        case 173: 
        case 174: 
        case 175: 
        case 176: 
        case 177: 
        case 178: 
        case 179: 
        case 180: 
        case 181: 
        case 182: 
        case 183: 
        case 184: 
        case 185: 
        case 186: 
        case 187: 
        case 188: 
        case 189: 
        case 190: 
        case 191: 
        case 192: 
        case 193: 
        case 194: 
        case 195: 
        case 196: 
        case 197: 
        case 198: 
        case 199: 
        case 200: 
        case 201: 
        case 202: 
        case 203: 
        case 204: 
        case 205: 
        case 206: 
        case 207: 
        case 208: 
        case 209: 
        case 210: 
        case 211: 
        case 212: 
        case 213: 
        case 214: 
        case 215: 
        case 216: 
        case 217: 
        case 218: 
        case 219: 
        case 220: 
        case 221: 
        case 222: 
        case 300: 
        case 301: 
        case 400: 
        case 401: 
        case 402: 
        case 403: 
        case 404: 
        case 405: 
        case 406: 
        case 407: 
        case 408: 
        case 409: 
        case 410: 
        case 411: 
        case 412: 
        case 500: 
        case 501: 
        case 502: 
        case 503: 
        case 504: 
        case 505: 
        case 506: 
        case 507: 
        case 508: 
        case 509: 
        case 510: 
        case 511: 
        case 512: 
        case 513: 
        case 514: 
        case 515: 
        case 516: 
        case 517: 
        case 518: 
        case 519: 
        case 520: 
        case 521: 
        case 522: 
        case 523: 
        case 524: 
        case 525: 
        case 526: 
        case 527: 
        case 1000: 
        case 1001: 
        case 1002: 
        case 1003: 
        case 1004: 
        case 1005: 
        case 1006: 
        case 1007: 
        case 1008: 
        case 1009: 
        case 1010: 
            j = j1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        int k1 = qlo1.i();
        switch (k1)
        {
        case 0: // '\0'
        case 1: // '\001'
        case 2: // '\002'
        case 10: // '\n'
        case 20: // '\024'
            k = k1;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (a == null)
        {
            a = new qpw();
        }
        qlo1.a(a);
        continue; /* Loop/switch isn't completed */
_L7:
        if (b == null)
        {
            b = new qyv();
        }
        qlo1.a(b);
        continue; /* Loop/switch isn't completed */
_L8:
        if (c == null)
        {
            c = new rca();
        }
        qlo1.a(c);
        continue; /* Loop/switch isn't completed */
_L9:
        int k2 = qmb.b(qlo1, 56);
        int ai[];
        int l1;
        if (d == null)
        {
            l1 = 0;
        } else
        {
            l1 = d.length;
        }
        ai = new int[k2 + l1];
        k2 = l1;
        if (l1 != 0)
        {
            System.arraycopy(d, 0, ai, 0, l1);
            k2 = l1;
        }
        for (; k2 < ai.length - 1; k2++)
        {
            ai[k2] = qlo1.i();
            qlo1.a();
        }

        ai[k2] = qlo1.i();
        d = ai;
        continue; /* Loop/switch isn't completed */
_L10:
        int i3 = qlo1.c(qlo1.i());
        int i2 = qlo1.o();
        int l2;
        for (l2 = 0; qlo1.m() > 0; l2++)
        {
            qlo1.i();
        }

        qlo1.e(i2);
        int ai1[];
        if (d == null)
        {
            i2 = 0;
        } else
        {
            i2 = d.length;
        }
        ai1 = new int[l2 + i2];
        l2 = i2;
        if (i2 != 0)
        {
            System.arraycopy(d, 0, ai1, 0, i2);
            l2 = i2;
        }
        for (; l2 < ai1.length; l2++)
        {
            ai1[l2] = qlo1.i();
        }

        d = ai1;
        qlo1.d(i3);
        continue; /* Loop/switch isn't completed */
_L11:
        int j2 = qlo1.i();
        switch (j2)
        {
        case 10: // '\n'
        case 20: // '\024'
        case 30: // '\036'
        case 80: // 'P'
            e = j2;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L12:
        if (f == null)
        {
            f = new oya();
        }
        qlo1.a(f);
        continue; /* Loop/switch isn't completed */
_L13:
        g = Long.valueOf(qlo1.l());
        continue; /* Loop/switch isn't completed */
_L14:
        if (h == null)
        {
            h = new oxy();
        }
        qlo1.a(h);
        if (true) goto _L15; else goto _L16
_L16:
    }

    public final void a(qlp qlp1)
    {
        if (i != 0x80000000)
        {
            qlp1.a(1, i);
        }
        if (j != 0x80000000)
        {
            qlp1.a(2, j);
        }
        if (k != 0x80000000)
        {
            qlp1.a(3, k);
        }
        if (a != null)
        {
            qlp1.a(4, a);
        }
        if (b != null)
        {
            qlp1.a(5, b);
        }
        if (c != null)
        {
            qlp1.a(6, c);
        }
        if (d != null && d.length > 0)
        {
            for (int l = 0; l < d.length; l++)
            {
                qlp1.a(7, d[l]);
            }

        }
        if (e != 0x80000000)
        {
            qlp1.a(8, e);
        }
        if (f != null)
        {
            qlp1.a(9, f);
        }
        if (g != null)
        {
            qlp1.c(10, g.longValue());
        }
        if (h != null)
        {
            qlp1.a(11, h);
        }
        super.a(qlp1);
    }
}
