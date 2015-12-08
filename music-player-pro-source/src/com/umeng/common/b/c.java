// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.b;

import java.math.BigInteger;

// Referenced classes of package com.umeng.common.b:
//            d, a

public class c extends d
{

    static final byte a[] = {
        13, 10
    };
    private static final int m = 6;
    private static final int n = 3;
    private static final int o = 4;
    private static final byte p[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte q[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte r[];
    private static final int s = 63;
    private final byte t[];
    private final byte u[];
    private final byte v[];
    private final int w;
    private final int x;
    private int y;

    public c()
    {
        this(0);
    }

    public c(int j)
    {
        this(j, a);
    }

    public c(int j, byte abyte0[])
    {
        this(j, abyte0, false);
    }

    public c(int j, byte abyte0[], boolean flag)
    {
        int k;
        if (abyte0 == null)
        {
            k = 0;
        } else
        {
            k = abyte0.length;
        }
        super(3, 4, j, k);
        u = r;
        if (abyte0 != null)
        {
            if (n(abyte0))
            {
                abyte0 = com.umeng.common.b.a.f(abyte0);
                throw new IllegalArgumentException((new StringBuilder("lineSeparator must not contain base64 characters: [")).append(abyte0).append("]").toString());
            }
            if (j > 0)
            {
                x = abyte0.length + 4;
                v = new byte[abyte0.length];
                System.arraycopy(abyte0, 0, v, 0, abyte0.length);
            } else
            {
                x = 4;
                v = null;
            }
        } else
        {
            x = 4;
            v = null;
        }
        w = x - 1;
        if (flag)
        {
            abyte0 = q;
        } else
        {
            abyte0 = p;
        }
        t = abyte0;
    }

    public c(boolean flag)
    {
        this(76, a, flag);
    }

    public static boolean a(byte byte0)
    {
        return byte0 == 61 || byte0 >= 0 && byte0 < r.length && r[byte0] != -1;
    }

    public static boolean a(String s1)
    {
        return b(com.umeng.common.b.a.f(s1));
    }

    public static boolean a(byte abyte0[])
    {
        return b(abyte0);
    }

    public static byte[] a(BigInteger biginteger)
    {
        if (biginteger == null)
        {
            throw new NullPointerException("encodeInteger called with null parameter");
        } else
        {
            return a(b(biginteger), false);
        }
    }

    public static byte[] a(byte abyte0[], boolean flag)
    {
        return a(abyte0, flag, false);
    }

    public static byte[] a(byte abyte0[], boolean flag, boolean flag1)
    {
        return a(abyte0, flag, flag1, 0x7fffffff);
    }

    public static byte[] a(byte abyte0[], boolean flag, boolean flag1, int j)
    {
        if (abyte0 == null || abyte0.length == 0)
        {
            return abyte0;
        }
        c c1;
        long l;
        if (flag)
        {
            c1 = new c(flag1);
        } else
        {
            c1 = new c(0, a, flag1);
        }
        l = c1.o(abyte0);
        if (l > (long)j)
        {
            throw new IllegalArgumentException((new StringBuilder("Input array too big, the output array would be bigger (")).append(l).append(") than the specified maximum size of ").append(j).toString());
        } else
        {
            return c1.l(abyte0);
        }
    }

    public static boolean b(byte abyte0[])
    {
        int j;
        boolean flag1;
        flag1 = false;
        j = 0;
_L6:
        if (j < abyte0.length) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        if (a(abyte0[j]))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!c(abyte0[j])) goto _L4; else goto _L3
_L3:
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static byte[] b(String s1)
    {
        return (new c()).c(s1);
    }

    static byte[] b(BigInteger biginteger)
    {
        int i1 = (biginteger.bitLength() + 7 >> 3) << 3;
        byte abyte0[] = biginteger.toByteArray();
        if (biginteger.bitLength() % 8 != 0 && biginteger.bitLength() / 8 + 1 == i1 / 8)
        {
            return abyte0;
        }
        int k = 0;
        int l = abyte0.length;
        int j = l;
        if (biginteger.bitLength() % 8 == 0)
        {
            k = 1;
            j = l - 1;
        }
        l = i1 / 8;
        biginteger = new byte[i1 / 8];
        System.arraycopy(abyte0, k, biginteger, l - j, j);
        return biginteger;
    }

    public static byte[] c(byte abyte0[])
    {
        return a(abyte0, false);
    }

    public static String d(byte abyte0[])
    {
        return com.umeng.common.b.a.f(a(abyte0, false));
    }

    public static byte[] e(byte abyte0[])
    {
        return a(abyte0, false, true);
    }

    public static String f(byte abyte0[])
    {
        return com.umeng.common.b.a.f(a(abyte0, false, true));
    }

    public static byte[] g(byte abyte0[])
    {
        return a(abyte0, true);
    }

    public static byte[] h(byte abyte0[])
    {
        return (new c()).k(abyte0);
    }

    public static BigInteger i(byte abyte0[])
    {
        return new BigInteger(1, h(abyte0));
    }

    void a(byte abyte0[], int j, int k)
    {
        if (!this.j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (k >= 0) goto _L4; else goto _L3
_L3:
        this.j = true;
        if (this.l == 0 && g == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        a(x);
        j = i;
        this.l;
        JVM INSTR tableswitch 1 2: default 72
    //                   1 139
    //                   2 264;
           goto _L5 _L6 _L7
_L5:
        k = this.k;
        this.k = (i - j) + k;
        if (g > 0 && this.k > 0)
        {
            System.arraycopy(v, 0, h, i, v.length);
            i = i + v.length;
            return;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        abyte0 = h;
        k = i;
        i = k + 1;
        abyte0[k] = t[y >> 2 & 0x3f];
        abyte0 = h;
        k = i;
        i = k + 1;
        abyte0[k] = t[y << 4 & 0x3f];
        if (t == p)
        {
            abyte0 = h;
            k = i;
            i = k + 1;
            abyte0[k] = 61;
            abyte0 = h;
            k = i;
            i = k + 1;
            abyte0[k] = 61;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        abyte0 = h;
        k = i;
        i = k + 1;
        abyte0[k] = t[y >> 10 & 0x3f];
        abyte0 = h;
        k = i;
        i = k + 1;
        abyte0[k] = t[y >> 4 & 0x3f];
        abyte0 = h;
        k = i;
        i = k + 1;
        abyte0[k] = t[y << 2 & 0x3f];
        if (t == p)
        {
            abyte0 = h;
            k = i;
            i = k + 1;
            abyte0[k] = 61;
        }
        if (true) goto _L5; else goto _L4
_L4:
        int l = 0;
        while (l < k) 
        {
            a(x);
            this.l = (this.l + 1) % 3;
            byte byte0 = abyte0[j];
            int i1 = byte0;
            if (byte0 < 0)
            {
                i1 = byte0 + 256;
            }
            y = i1 + (y << 8);
            if (this.l == 0)
            {
                byte abyte1[] = h;
                int j1 = i;
                i = j1 + 1;
                abyte1[j1] = t[y >> 18 & 0x3f];
                abyte1 = h;
                j1 = i;
                i = j1 + 1;
                abyte1[j1] = t[y >> 12 & 0x3f];
                abyte1 = h;
                j1 = i;
                i = j1 + 1;
                abyte1[j1] = t[y >> 6 & 0x3f];
                abyte1 = h;
                j1 = i;
                i = j1 + 1;
                abyte1[j1] = t[y & 0x3f];
                this.k = this.k + 4;
                if (g > 0 && g <= this.k)
                {
                    System.arraycopy(v, 0, h, i, v.length);
                    i = i + v.length;
                    this.k = 0;
                }
            }
            l++;
            j++;
        }
        if (true) goto _L1; else goto _L8
_L8:
    }

    public boolean a()
    {
        return t == q;
    }

    void b(byte abyte0[], int j, int k)
    {
        if (!this.j) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int l;
        if (k < 0)
        {
            this.j = true;
        }
        l = 0;
_L4:
        if (l < k)
        {
label0:
            {
                a(w);
                i1 = abyte0[j];
                if (i1 != 61)
                {
                    break label0;
                }
                this.j = true;
            }
        }
        if (this.j && this.l != 0)
        {
            a(w);
            byte abyte1[];
            int i1;
            switch (this.l)
            {
            default:
                return;

            case 2: // '\002'
                y = y >> 4;
                abyte0 = h;
                j = i;
                i = j + 1;
                abyte0[j] = (byte)(y & 0xff);
                return;

            case 3: // '\003'
                y = y >> 2;
                break;
            }
            break MISSING_BLOCK_LABEL_336;
        }
        continue; /* Loop/switch isn't completed */
        if (i1 >= 0 && i1 < r.length)
        {
            i1 = r[i1];
            if (i1 >= 0)
            {
                this.l = (this.l + 1) % 4;
                y = i1 + (y << 6);
                if (this.l == 0)
                {
                    abyte1 = h;
                    i1 = i;
                    i = i1 + 1;
                    abyte1[i1] = (byte)(y >> 16 & 0xff);
                    abyte1 = h;
                    i1 = i;
                    i = i1 + 1;
                    abyte1[i1] = (byte)(y >> 8 & 0xff);
                    abyte1 = h;
                    i1 = i;
                    i = i1 + 1;
                    abyte1[i1] = (byte)(y & 0xff);
                }
            }
        }
        l++;
        j++;
        if (true) goto _L4; else goto _L3
_L3:
        abyte0 = h;
        j = i;
        i = j + 1;
        abyte0[j] = (byte)(y >> 8 & 0xff);
        abyte0 = h;
        j = i;
        i = j + 1;
        abyte0[j] = (byte)(y & 0xff);
        return;
        if (true) goto _L1; else goto _L5
_L5:
    }

    protected boolean b(byte byte0)
    {
        return byte0 >= 0 && byte0 < u.length && u[byte0] != -1;
    }

    static 
    {
        byte abyte0[] = new byte[123];
        abyte0[0] = -1;
        abyte0[1] = -1;
        abyte0[2] = -1;
        abyte0[3] = -1;
        abyte0[4] = -1;
        abyte0[5] = -1;
        abyte0[6] = -1;
        abyte0[7] = -1;
        abyte0[8] = -1;
        abyte0[9] = -1;
        abyte0[10] = -1;
        abyte0[11] = -1;
        abyte0[12] = -1;
        abyte0[13] = -1;
        abyte0[14] = -1;
        abyte0[15] = -1;
        abyte0[16] = -1;
        abyte0[17] = -1;
        abyte0[18] = -1;
        abyte0[19] = -1;
        abyte0[20] = -1;
        abyte0[21] = -1;
        abyte0[22] = -1;
        abyte0[23] = -1;
        abyte0[24] = -1;
        abyte0[25] = -1;
        abyte0[26] = -1;
        abyte0[27] = -1;
        abyte0[28] = -1;
        abyte0[29] = -1;
        abyte0[30] = -1;
        abyte0[31] = -1;
        abyte0[32] = -1;
        abyte0[33] = -1;
        abyte0[34] = -1;
        abyte0[35] = -1;
        abyte0[36] = -1;
        abyte0[37] = -1;
        abyte0[38] = -1;
        abyte0[39] = -1;
        abyte0[40] = -1;
        abyte0[41] = -1;
        abyte0[42] = -1;
        abyte0[43] = 62;
        abyte0[44] = -1;
        abyte0[45] = 62;
        abyte0[46] = -1;
        abyte0[47] = 63;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -1;
        abyte0[59] = -1;
        abyte0[60] = -1;
        abyte0[61] = -1;
        abyte0[62] = -1;
        abyte0[63] = -1;
        abyte0[64] = -1;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -1;
        abyte0[92] = -1;
        abyte0[93] = -1;
        abyte0[94] = -1;
        abyte0[95] = 63;
        abyte0[96] = -1;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        r = abyte0;
    }
}
