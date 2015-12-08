// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;


public class a
{

    private static final double e[];
    public int a;
    private char b;
    private CharSequence c;
    private int d;

    public a(CharSequence charsequence, int i)
    {
        c = charsequence;
        a = i;
        d = charsequence.length();
        b = charsequence.charAt(i);
    }

    public static float a(int i, int j)
    {
        if (j < -125 || i == 0)
        {
            return 0.0F;
        }
        if (j >= 128)
        {
            return i <= 0 ? (-1.0F / 0.0F) : (1.0F / 0.0F);
        }
        if (j == 0)
        {
            return (float)i;
        }
        int k = i;
        if (i >= 0x4000000)
        {
            k = i + 1;
        }
        double d1;
        if (j > 0)
        {
            d1 = (double)k * e[j];
        } else
        {
            d1 = (double)k / e[-j];
        }
        return (float)d1;
    }

    private void a(char c1)
    {
        throw new RuntimeException((new StringBuilder()).append("Unexpected char '").append(c1).append("'.").toString());
    }

    private char f()
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

    public void a()
    {
        for (; a < d && Character.isWhitespace(c.charAt(a)); c()) { }
    }

    public void b()
    {
_L5:
        if (a >= d) goto _L2; else goto _L1
_L1:
        c.charAt(a);
        JVM INSTR lookupswitch 4: default 68
    //                   9: 69
    //                   10: 69
    //                   32: 69
    //                   44: 69;
           goto _L2 _L3 _L3 _L3 _L3
_L2:
        return;
_L3:
        c();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void c()
    {
        b = f();
    }

    public float d()
    {
        int k1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        boolean flag4;
        flag4 = true;
        flag2 = true;
        flag3 = true;
        k1 = 0;
        flag1 = false;
        b;
        JVM INSTR tableswitch 43 45: default 44
    //                   43 1251
    //                   44 44
    //                   45 115;
           goto _L1 _L2 _L1 _L3
_L1:
        boolean flag = true;
_L8:
        b;
        JVM INSTR tableswitch 46 57: default 112
    //                   46 131
    //                   47 112
    //                   48 241
    //                   49 382
    //                   50 382
    //                   51 382
    //                   52 382
    //                   53 382
    //                   54 382
    //                   55 382
    //                   56 382
    //                   57 382;
           goto _L4 _L5 _L4 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7
_L4:
        return (0.0F / 0.0F);
_L3:
        int i = 0;
_L34:
        b = f();
        flag = i;
          goto _L8
_L5:
        int j;
        int k;
        int j1;
        i = 0;
        j1 = 0;
        k = 0;
        j = 0;
_L16:
        int l;
        int i1;
        l = i;
        i1 = j;
        if (b != '.') goto _L10; else goto _L9
_L9:
        b = f();
        b;
        JVM INSTR tableswitch 48 57: default 220
    //                   48 524
    //                   49 1248
    //                   50 1248
    //                   51 1248
    //                   52 1248
    //                   53 1248
    //                   54 1248
    //                   55 1248
    //                   56 1248
    //                   57 1248;
           goto _L11 _L12 _L13 _L13 _L13 _L13 _L13 _L13 _L13 _L13 _L13
_L11:
        l = i;
        i1 = j;
        if (j1 == 0)
        {
            a(b);
            return 0.0F;
        }
          goto _L10
_L6:
        b = f();
        b;
        JVM INSTR lookupswitch 13: default 368
    //                   46: 370
    //                   48: 241
    //                   49: 382
    //                   50: 382
    //                   51: 382
    //                   52: 382
    //                   53: 382
    //                   54: 382
    //                   55: 382
    //                   56: 382
    //                   57: 382
    //                   69: 370
    //                   101: 370;
           goto _L14 _L15 _L6 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L7 _L15 _L15
_L14:
        return 0.0F;
_L15:
        i = 0;
        j1 = 1;
        k = 0;
        j = 0;
          goto _L16
_L7:
        i1 = 0;
        j1 = 0;
        l = 0;
label0:
        do
        {
            if (j1 < 9)
            {
                j = j1 + 1;
                k = l * 10 + (b - 48);
                i = i1;
            } else
            {
                i = i1 + 1;
                j = j1;
                k = l;
            }
            b = f();
            i1 = i;
            j1 = j;
            l = k;
            switch (b)
            {
            default:
                l = k;
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
        } while (true);
        j1 = 1;
        k = j;
        j = l;
          goto _L16
_L12:
        if (k != 0) goto _L13; else goto _L17
_L17:
        l = i;
_L19:
        b = f();
        i = l - 1;
        l = i;
        b;
        JVM INSTR tableswitch 48 57: default 604
    //                   48 531
    //                   49 617
    //                   50 617
    //                   51 617
    //                   52 617
    //                   53 617
    //                   54 617
    //                   55 617
    //                   56 617
    //                   57 617;
           goto _L18 _L19 _L13 _L13 _L13 _L13 _L13 _L13 _L13 _L13 _L13
_L18:
        l = i;
        i1 = j;
        if (j1 == 0)
        {
            return 0.0F;
        }
          goto _L10
_L13:
label1:
        while (true) 
        {
            l = i;
            j1 = k;
            i1 = j;
            if (k < 9)
            {
                j1 = k + 1;
                i1 = j * 10 + (b - 48);
                l = i - 1;
            }
            b = f();
            i = l;
            k = j1;
            j = i1;
            switch (b)
            {
            default:
                break label1;

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
_L10:
        b;
        JVM INSTR lookupswitch 2: default 764
    //                   69: 800
    //                   101: 800;
           goto _L20 _L21 _L21
_L20:
        k = ((flag3) ? 1 : 0);
        j = ((flag1) ? 1 : 0);
_L29:
        i = j;
        if (k == 0)
        {
            i = -j;
        }
        j = i1;
        if (!flag)
        {
            j = -i1;
        }
        return a(j, i + l);
_L21:
        b = f();
        j = ((flag4) ? 1 : 0);
        i = ((flag2) ? 1 : 0);
        b;
        JVM INSTR tableswitch 43 57: default 892
    //                   43 904
    //                   44 892
    //                   45 902
    //                   46 892
    //                   47 892
    //                   48 982
    //                   49 982
    //                   50 982
    //                   51 982
    //                   52 982
    //                   53 982
    //                   54 982
    //                   55 982
    //                   56 982
    //                   57 982;
           goto _L22 _L23 _L22 _L24 _L22 _L22 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25 _L25
_L22:
        a(b);
        return 0.0F;
_L24:
        j = 0;
_L23:
        b = f();
        i = j;
        switch (b)
        {
        default:
            a(b);
            return 0.0F;

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
_L25:
        b;
        JVM INSTR tableswitch 48 57: default 1040
    //                   48 1048
    //                   49 1239
    //                   50 1239
    //                   51 1239
    //                   52 1239
    //                   53 1239
    //                   54 1239
    //                   55 1239
    //                   56 1239
    //                   57 1239;
           goto _L26 _L27 _L28 _L28 _L28 _L28 _L28 _L28 _L28 _L28 _L28
_L26:
        j = ((flag1) ? 1 : 0);
        k = i;
          goto _L29
_L27:
        b = f();
        b;
        JVM INSTR tableswitch 48 57: default 1116
    //                   48 1048
    //                   49 1124
    //                   50 1124
    //                   51 1124
    //                   52 1124
    //                   53 1124
    //                   54 1124
    //                   55 1124
    //                   56 1124
    //                   57 1124;
           goto _L30 _L27 _L31 _L31 _L31 _L31 _L31 _L31 _L31 _L31 _L31
_L30:
        j = ((flag1) ? 1 : 0);
        k = i;
          goto _L29
_L31:
        j = 0;
        j1 = k1;
_L33:
        k1 = j1;
        k = j;
        if (j1 < 3)
        {
            k1 = j1 + 1;
            k = j * 10 + (b - 48);
        }
        b = f();
        j1 = k1;
        j = k;
        b;
        JVM INSTR tableswitch 48 57: default 1232
    //                   48 1130
    //                   49 1130
    //                   50 1130
    //                   51 1130
    //                   52 1130
    //                   53 1130
    //                   54 1130
    //                   55 1130
    //                   56 1130
    //                   57 1130;
           goto _L32 _L33 _L33 _L33 _L33 _L33 _L33 _L33 _L33 _L33 _L33
_L32:
        j = k;
        k = i;
          goto _L29
_L28:
        j = 0;
        j1 = k1;
          goto _L33
_L2:
        i = 1;
          goto _L34
    }

    public float e()
    {
        float f1 = d();
        b();
        return f1;
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
