// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.f;


public final class a
{

    private static final double e[];
    public int a;
    private char b;
    private CharSequence c;
    private int d;

    public a(CharSequence charsequence)
    {
        c = charsequence;
        a = 0;
        d = charsequence.length();
        b = charsequence.charAt(0);
    }

    private static void a(char c1)
    {
        throw new RuntimeException((new StringBuilder("Unexpected char '")).append(c1).append("'.").toString());
    }

    private char d()
    {
        if (a < d)
        {
            a = a + 1;
        }
        if (a == d)
        {
            return '\0';
        } else
        {
            return c.charAt(a);
        }
    }

    public final void a()
    {
        for (; a < d && Character.isWhitespace(c.charAt(a)); b()) { }
    }

    public final void b()
    {
        b = d();
    }

    public final float c()
    {
        int l1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag4 = true;
        flag2 = true;
        flag3 = true;
        l1 = 0;
        flag1 = false;
        a();
        b;
        JVM INSTR tableswitch 43 45: default 48
    //                   43 1507
    //                   44 48
    //                   45 186;
           goto _L1 _L2 _L1 _L3
_L1:
        boolean flag = true;
_L11:
        b;
        JVM INSTR tableswitch 46 57: default 116
    //                   46 204
    //                   47 116
    //                   48 325
    //                   49 472
    //                   50 472
    //                   51 472
    //                   52 472
    //                   53 472
    //                   54 472
    //                   55 472
    //                   56 472
    //                   57 472;
           goto _L4 _L5 _L4 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7
_L4:
        float f = (0.0F / 0.0F);
_L18:
        if (a >= d) goto _L9; else goto _L8
_L8:
        c.charAt(a);
        JVM INSTR lookupswitch 4: default 184
    //                   9: 1480
    //                   10: 1480
    //                   32: 1480
    //                   44: 1480;
           goto _L9 _L10 _L10 _L10 _L10
_L9:
        return f;
_L3:
        int i = 0;
_L43:
        b = d();
        flag = i;
          goto _L11
_L5:
        int j;
        int k;
        int k1;
        i = 0;
        k1 = 0;
        j = 0;
        k = 0;
_L21:
        int i1;
        int j1;
        j1 = i;
        i1 = j;
        if (b != '.') goto _L13; else goto _L12
_L12:
        b = d();
        b;
        JVM INSTR tableswitch 48 57: default 300
    //                   48 615
    //                   49 1504
    //                   50 1504
    //                   51 1504
    //                   52 1504
    //                   53 1504
    //                   54 1504
    //                   55 1504
    //                   56 1504
    //                   57 1504;
           goto _L14 _L15 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16
_L14:
        j1 = i;
        i1 = j;
        if (k1 != 0) goto _L13; else goto _L17
_L17:
        a(b);
        f = 0.0F;
          goto _L18
_L6:
        b = d();
        b;
        JVM INSTR lookupswitch 13: default 452
    //                   46: 457
    //                   48: 325
    //                   49: 472
    //                   50: 472
    //                   51: 472
    //                   52: 472
    //                   53: 472
    //                   54: 472
    //                   55: 472
    //                   56: 472
    //                   57: 472
    //                   69: 457
    //                   101: 457;
           goto _L19 _L20 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L20 _L20
_L19:
        f = 0.0F;
          goto _L18
_L20:
        i = 0;
        k1 = 1;
        j = 0;
        k = 0;
          goto _L21
_L7:
        k1 = 0;
        i1 = 0;
        j1 = 0;
_L23:
        if (j1 < 9)
        {
            k = j1 + 1;
            j = i1 * 10 + (b - 48);
            i = k1;
        } else
        {
            i = k1 + 1;
            j = i1;
            k = j1;
        }
        b = d();
        k1 = i;
        i1 = j;
        j1 = k;
        b;
        JVM INSTR tableswitch 48 57: default 592
    //                   48 481
    //                   49 481
    //                   50 481
    //                   51 481
    //                   52 481
    //                   53 481
    //                   54 481
    //                   55 481
    //                   56 481
    //                   57 481;
           goto _L22 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23 _L23
_L22:
        k1 = 1;
          goto _L21
_L15:
        if (k != 0) goto _L16; else goto _L24
_L24:
        i1 = i;
_L26:
        b = d();
        i = i1 - 1;
        i1 = i;
        b;
        JVM INSTR tableswitch 48 57: default 700
    //                   48 624
    //                   49 718
    //                   50 718
    //                   51 718
    //                   52 718
    //                   53 718
    //                   54 718
    //                   55 718
    //                   56 718
    //                   57 718;
           goto _L25 _L26 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16 _L16
_L25:
        j1 = i;
        i1 = j;
        if (k1 != 0) goto _L13; else goto _L27
_L27:
        f = 0.0F;
          goto _L18
_L16:
label0:
        while (true) 
        {
            j1 = i;
            i1 = j;
            k1 = k;
            if (k < 9)
            {
                k1 = k + 1;
                i1 = j * 10 + (b - 48);
                j1 = i - 1;
            }
            b = d();
            i = j1;
            j = i1;
            k = k1;
            switch (b)
            {
            default:
                break label0;

            case 48: // '0'
            case 49: // '1'
            case 50: // '2'
            case 51: // '3'
            case 52: // '4'
            case 53: // '5'
            case 54: // '6'
            case 55: // '7'
            case 56: // '8'
            case 57: // '9'
                break;
            }
        }
_L13:
        b;
        JVM INSTR lookupswitch 2: default 876
    //                   69: 932
    //                   101: 932;
           goto _L28 _L29 _L29
_L28:
        i = ((flag3) ? 1 : 0);
        j = ((flag1) ? 1 : 0);
_L37:
        int l = j;
        if (i == 0)
        {
            l = -j;
        }
        l += j1;
        if (!flag)
        {
            i = -i1;
        } else
        {
            i = i1;
        }
        if (l < -125 || i == 0)
        {
            f = 0.0F;
        } else
        {
            if (l >= 128)
            {
                if (i > 0)
                {
                    f = (1.0F / 0.0F);
                } else
                {
                    f = (-1.0F / 0.0F);
                }
            } else
            if (l == 0)
            {
                f = i;
            } else
            {
                j = i;
                if (i >= 0x4000000)
                {
                    j = i + 1;
                }
                double d1;
                if (l > 0)
                {
                    d1 = j;
                    d1 = e[l] * d1;
                } else
                {
                    d1 = (double)j / e[-l];
                }
                f = (float)d1;
            }
            continue; /* Loop/switch isn't completed */
        }
          goto _L18
_L29:
        b = d();
        j = ((flag4) ? 1 : 0);
        i = ((flag2) ? 1 : 0);
        b;
        JVM INSTR tableswitch 43 57: default 1028
    //                   43 1043
    //                   44 1028
    //                   45 1040
    //                   46 1028
    //                   47 1028
    //                   48 1124
    //                   49 1124
    //                   50 1124
    //                   51 1124
    //                   52 1124
    //                   53 1124
    //                   54 1124
    //                   55 1124
    //                   56 1124
    //                   57 1124;
           goto _L30 _L31 _L30 _L32 _L30 _L30 _L33 _L33 _L33 _L33 _L33 _L33 _L33 _L33 _L33 _L33
_L30:
        a(b);
        f = 0.0F;
          goto _L18
_L32:
        j = 0;
_L31:
        b = d();
        i = j;
        switch (b)
        {
        default:
            a(b);
            f = 0.0F;
            continue; /* Loop/switch isn't completed */

        case 48: // '0'
        case 49: // '1'
        case 50: // '2'
        case 51: // '3'
        case 52: // '4'
        case 53: // '5'
        case 54: // '6'
        case 55: // '7'
        case 56: // '8'
        case 57: // '9'
            break;
        }
_L33:
        b;
        JVM INSTR tableswitch 48 57: default 1184
    //                   48 1191
    //                   49 1494
    //                   50 1494
    //                   51 1494
    //                   52 1494
    //                   53 1494
    //                   54 1494
    //                   55 1494
    //                   56 1494
    //                   57 1494;
           goto _L34 _L35 _L36 _L36 _L36 _L36 _L36 _L36 _L36 _L36 _L36
_L34:
        j = ((flag1) ? 1 : 0);
          goto _L37
_L35:
        b = d();
        b;
        JVM INSTR tableswitch 48 57: default 1256
    //                   48 1191
    //                   49 1263
    //                   50 1263
    //                   51 1263
    //                   52 1263
    //                   53 1263
    //                   54 1263
    //                   55 1263
    //                   56 1263
    //                   57 1263;
           goto _L38 _L35 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39 _L39
_L38:
        j = ((flag1) ? 1 : 0);
          goto _L37
_L39:
        j = 0;
        k1 = l1;
_L41:
        l1 = k1;
        l = j;
        if (k1 < 3)
        {
            l1 = k1 + 1;
            l = j * 10 + (b - 48);
        }
        b = d();
        k1 = l1;
        j = l;
        b;
        JVM INSTR tableswitch 48 57: default 1380
    //                   48 1270
    //                   49 1270
    //                   50 1270
    //                   51 1270
    //                   52 1270
    //                   53 1270
    //                   54 1270
    //                   55 1270
    //                   56 1270
    //                   57 1270;
           goto _L40 _L41 _L41 _L41 _L41 _L41 _L41 _L41 _L41 _L41 _L41
_L40:
        j = l;
          goto _L37
_L10:
        b();
        continue; /* Loop/switch isn't completed */
_L36:
        j = 0;
        k1 = l1;
          goto _L41
        if (true) goto _L18; else goto _L42
_L42:
_L2:
        i = 1;
          goto _L43
    }

    static 
    {
        e = new double[128];
        for (int i = 0; i < e.length; i++)
        {
            e[i] = Math.pow(10D, i);
        }

    }
}
