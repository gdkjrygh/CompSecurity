// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            qv, qw, qz

public final class qo
{

    private int ayM;
    private int ayN;
    private int ayO;
    private int ayP;
    private int ayQ;
    private int ayR;
    private int ayS;
    private int ayT;
    private int ayU;
    private final byte buffer[];

    private qo(byte abyte0[], int i, int j)
    {
        ayR = 0x7fffffff;
        ayT = 64;
        ayU = 0x4000000;
        buffer = abyte0;
        ayM = i;
        ayN = i + j;
        ayP = i;
    }

    public static long A(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static qo a(byte abyte0[], int i, int j)
    {
        return new qo(abyte0, i, j);
    }

    public static int gR(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    public static qo p(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    private void rK()
    {
        ayN = ayN + ayO;
        int i = ayN;
        if (i > ayR)
        {
            ayO = i - ayR;
            ayN = ayN - ayO;
            return;
        } else
        {
            ayO = 0;
            return;
        }
    }

    public final void a(qw qw1)
    {
        int i = rG();
        if (ayS >= ayT)
        {
            throw qv.rX();
        } else
        {
            i = gS(i);
            ayS = ayS + 1;
            qw1.b(this);
            gP(0);
            ayS = ayS - 1;
            gT(i);
            return;
        }
    }

    public final void a(qw qw1, int i)
    {
        if (ayS >= ayT)
        {
            throw qv.rX();
        } else
        {
            ayS = ayS + 1;
            qw1.b(this);
            gP(qz.y(i, 4));
            ayS = ayS - 1;
            return;
        }
    }

    public final void gP(int i)
    {
        if (ayQ != i)
        {
            throw qv.rV();
        } else
        {
            return;
        }
    }

    public final boolean gQ(int i)
    {
        switch (qz.hk(i))
        {
        default:
            throw qv.rW();

        case 0: // '\0'
            rC();
            return true;

        case 1: // '\001'
            rJ();
            return true;

        case 2: // '\002'
            gW(rG());
            return true;

        case 3: // '\003'
            rA();
            gP(qz.y(qz.hl(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            rI();
            break;
        }
        return true;
    }

    public final int gS(int i)
    {
        if (i < 0)
        {
            throw qv.rS();
        }
        i = ayP + i;
        int j = ayR;
        if (i > j)
        {
            throw qv.rR();
        } else
        {
            ayR = i;
            rK();
            return j;
        }
    }

    public final void gT(int i)
    {
        ayR = i;
        rK();
    }

    public final void gU(int i)
    {
        if (i > ayP - ayM)
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is beyond current ").append(ayP - ayM).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Bad position ")).append(i).toString());
        } else
        {
            ayP = ayM + i;
            return;
        }
    }

    public final byte[] gV(int i)
    {
        if (i < 0)
        {
            throw qv.rS();
        }
        if (ayP + i > ayR)
        {
            gW(ayR - ayP);
            throw qv.rR();
        }
        if (i <= ayN - ayP)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, ayP, abyte0, 0, i);
            ayP = ayP + i;
            return abyte0;
        } else
        {
            throw qv.rR();
        }
    }

    public final void gW(int i)
    {
        if (i < 0)
        {
            throw qv.rS();
        }
        if (ayP + i > ayR)
        {
            gW(ayR - ayP);
            throw qv.rR();
        }
        if (i <= ayN - ayP)
        {
            ayP = ayP + i;
            return;
        } else
        {
            throw qv.rR();
        }
    }

    public final int getPosition()
    {
        return ayP - ayM;
    }

    public final void rA()
    {
        int i;
        do
        {
            i = rz();
        } while (i != 0 && gQ(i));
    }

    public final long rB()
    {
        return rH();
    }

    public final int rC()
    {
        return rG();
    }

    public final boolean rD()
    {
        return rG() != 0;
    }

    public final int rE()
    {
        return gR(rG());
    }

    public final long rF()
    {
        return A(rH());
    }

    public final int rG()
    {
        int i = rN();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = rN();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = rN();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = rN();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = rN();
        k = i | (k & 0x7f) << 21 | byte0 << 28;
        i = k;
        if (byte0 < 0)
        {
            int j = 0;
label0:
            do
            {
label1:
                {
                    if (j >= 5)
                    {
                        break label1;
                    }
                    i = k;
                    if (rN() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw qv.rT();
    }

    public final long rH()
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = rN();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw qv.rT();
    }

    public final int rI()
    {
        return rN() & 0xff | (rN() & 0xff) << 8 | (rN() & 0xff) << 16 | (rN() & 0xff) << 24;
    }

    public final long rJ()
    {
        int i = rN();
        int j = rN();
        int k = rN();
        int l = rN();
        int i1 = rN();
        int j1 = rN();
        int k1 = rN();
        int l1 = rN();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public final int rL()
    {
        if (ayR == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = ayP;
            return ayR - i;
        }
    }

    public final boolean rM()
    {
        return ayP == ayN;
    }

    public final byte rN()
    {
        if (ayP == ayN)
        {
            throw qv.rR();
        } else
        {
            byte abyte0[] = buffer;
            int i = ayP;
            ayP = i + 1;
            return abyte0[i];
        }
    }

    public final byte[] readBytes()
    {
        int i = rG();
        if (i <= ayN - ayP && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, ayP, abyte0, 0, i);
            ayP = i + ayP;
            return abyte0;
        } else
        {
            return gV(i);
        }
    }

    public final double readDouble()
    {
        return Double.longBitsToDouble(rJ());
    }

    public final float readFloat()
    {
        return Float.intBitsToFloat(rI());
    }

    public final String readString()
    {
        int i = rG();
        if (i <= ayN - ayP && i > 0)
        {
            String s1 = new String(buffer, ayP, i, "UTF-8");
            ayP = i + ayP;
            return s1;
        } else
        {
            return new String(gV(i), "UTF-8");
        }
    }

    public final int rz()
    {
        if (rM())
        {
            ayQ = 0;
            return 0;
        }
        ayQ = rG();
        if (ayQ == 0)
        {
            throw qv.rU();
        } else
        {
            return ayQ;
        }
    }

    public final byte[] s(int i, int j)
    {
        if (j == 0)
        {
            return qz.azq;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = ayM;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }
}
