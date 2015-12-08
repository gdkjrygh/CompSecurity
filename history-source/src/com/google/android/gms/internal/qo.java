// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

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

    public void a(qw qw1)
        throws IOException
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

    public void a(qw qw1, int i)
        throws IOException
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

    public void gP(int i)
        throws qv
    {
        if (ayQ != i)
        {
            throw qv.rV();
        } else
        {
            return;
        }
    }

    public boolean gQ(int i)
        throws IOException
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

    public int gS(int i)
        throws qv
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

    public void gT(int i)
    {
        ayR = i;
        rK();
    }

    public void gU(int i)
    {
        if (i > ayP - ayM)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(ayP - ayM).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            ayP = ayM + i;
            return;
        }
    }

    public byte[] gV(int i)
        throws IOException
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

    public void gW(int i)
        throws IOException
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

    public int getPosition()
    {
        return ayP - ayM;
    }

    public void rA()
        throws IOException
    {
        int i;
        do
        {
            i = rz();
        } while (i != 0 && gQ(i));
    }

    public long rB()
        throws IOException
    {
        return rH();
    }

    public int rC()
        throws IOException
    {
        return rG();
    }

    public boolean rD()
        throws IOException
    {
        return rG() != 0;
    }

    public int rE()
        throws IOException
    {
        return gR(rG());
    }

    public long rF()
        throws IOException
    {
        return A(rH());
    }

    public int rG()
        throws IOException
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

    public long rH()
        throws IOException
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

    public int rI()
        throws IOException
    {
        return rN() & 0xff | (rN() & 0xff) << 8 | (rN() & 0xff) << 16 | (rN() & 0xff) << 24;
    }

    public long rJ()
        throws IOException
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

    public int rL()
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

    public boolean rM()
    {
        return ayP == ayN;
    }

    public byte rN()
        throws IOException
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

    public byte[] readBytes()
        throws IOException
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

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(rJ());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(rI());
    }

    public String readString()
        throws IOException
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

    public int rz()
        throws IOException
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

    public byte[] s(int i, int j)
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
