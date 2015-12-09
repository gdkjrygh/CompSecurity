// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.k;

import com.android.slyce.j;

// Referenced classes of package com.android.slyce.k:
//            b

public class a
{

    private static com.android.slyce.d.a a(String s, b b)
    {
        byte byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 21: default 184
    //                   -1868159152: 522
    //                   -1319933914: 537
    //                   -1030320650: 402
    //                   -84093723: 447
    //                   48: 288
    //                   49: 302
    //                   50: 330
    //                   52: 358
    //                   56: 387
    //                   72827: 492
    //                   62792985: 417
    //                   65737323: 316
    //                   80949962: 567
    //                   80949966: 552
    //                   1199463154: 507
    //                   1310753099: 372
    //                   1604782171: 582
    //                   1659708778: 432
    //                   1659855352: 462
    //                   1659855532: 477
    //                   2037856847: 344;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22
_L1:
        break; /* Loop/switch isn't completed */
_L18:
        break MISSING_BLOCK_LABEL_582;
_L23:
        switch (byte0)
        {
        default:
            return com.android.slyce.d.a.a;

        case 0: // '\0'
            return com.android.slyce.d.a.a;

        case 1: // '\001'
        case 2: // '\002'
            return com.android.slyce.d.a.h;

        case 3: // '\003'
        case 4: // '\004'
            return com.android.slyce.d.a.i;

        case 5: // '\005'
        case 6: // '\006'
            return com.android.slyce.d.a.m;

        case 7: // '\007'
        case 8: // '\b'
            return com.android.slyce.d.a.g;

        case 9: // '\t'
            return com.android.slyce.d.a.b;

        case 10: // '\n'
            return com.android.slyce.d.a.c;

        case 11: // '\013'
            return com.android.slyce.d.a.f;

        case 12: // '\f'
            return com.android.slyce.d.a.d;

        case 13: // '\r'
            return com.android.slyce.d.a.e;

        case 14: // '\016'
            return com.android.slyce.d.a.j;

        case 15: // '\017'
            return com.android.slyce.d.a.k;

        case 16: // '\020'
            return com.android.slyce.d.a.n;

        case 17: // '\021'
            return com.android.slyce.d.a.o;

        case 18: // '\022'
            return com.android.slyce.d.a.q;

        case 19: // '\023'
            return com.android.slyce.d.a.p;

        case 20: // '\024'
            return com.android.slyce.d.a.r;
        }
_L6:
        if (s.equals("0"))
        {
            byte0 = 0;
        }
          goto _L23
_L7:
        if (s.equals("1"))
        {
            byte0 = 1;
        }
          goto _L23
_L13:
        if (s.equals("EAN_8"))
        {
            byte0 = 2;
        }
          goto _L23
_L8:
        if (s.equals("2"))
        {
            byte0 = 3;
        }
          goto _L23
_L22:
        if (s.equals("EAN_13"))
        {
            byte0 = 4;
        }
          goto _L23
_L9:
        if (s.equals("4"))
        {
            byte0 = 5;
        }
          goto _L23
_L17:
        if (s.equals("QR_CODE"))
        {
            byte0 = 6;
        }
          goto _L23
_L10:
        if (s.equals("8"))
        {
            byte0 = 7;
        }
          goto _L23
_L4:
        if (s.equals("DATA_MATRIX"))
        {
            byte0 = 8;
        }
          goto _L23
_L12:
        if (s.equals("AZTEC"))
        {
            byte0 = 9;
        }
          goto _L23
_L19:
        if (s.equals("CODABAR"))
        {
            byte0 = 10;
        }
          goto _L23
_L5:
        if (s.equals("CODE_128"))
        {
            byte0 = 11;
        }
          goto _L23
_L20:
        if (s.equals("CODE_39"))
        {
            byte0 = 12;
        }
          goto _L23
_L21:
        if (s.equals("CODE_93"))
        {
            byte0 = 13;
        }
          goto _L23
_L11:
        if (s.equals("ITF"))
        {
            byte0 = 14;
        }
          goto _L23
_L16:
        if (s.equals("MAXICODE"))
        {
            byte0 = 15;
        }
          goto _L23
_L2:
        if (s.equals("RSS_14"))
        {
            byte0 = 16;
        }
          goto _L23
_L3:
        if (s.equals("RSS_EXPANDED"))
        {
            byte0 = 17;
        }
          goto _L23
_L15:
        if (s.equals("UPC_E"))
        {
            byte0 = 18;
        }
          goto _L23
_L14:
        if (s.equals("UPC_A"))
        {
            byte0 = 19;
        }
          goto _L23
        if (s.equals("UPC_EAN_EXTENSION"))
        {
            byte0 = 20;
        }
          goto _L23
    }

    public static j a(String s, b b, String s1)
    {
        return new j(a(s, b), s1);
    }
}
