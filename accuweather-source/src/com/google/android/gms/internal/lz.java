// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            me, mf, mi

public final class lz
{

    private int amK;
    private int amL;
    private int amM;
    private int amN;
    private int amO;
    private int amP;
    private int amQ;
    private int amR;
    private int amS;
    private final byte buffer[];

    private lz(byte abyte0[], int i, int j)
    {
        amP = 0x7fffffff;
        amR = 64;
        amS = 0x4000000;
        buffer = abyte0;
        amK = i;
        amL = i + j;
        amN = i;
    }

    public static long A(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static lz a(byte abyte0[], int i, int j)
    {
        return new lz(abyte0, i, j);
    }

    public static int ew(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    private void nH()
    {
        amL = amL + amM;
        int i = amL;
        if (i > amP)
        {
            amM = i - amP;
            amL = amL - amM;
            return;
        } else
        {
            amM = 0;
            return;
        }
    }

    public static lz p(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public void a(mf mf1)
        throws IOException
    {
        int i = nD();
        if (amQ >= amR)
        {
            throw me.nT();
        } else
        {
            i = ex(i);
            amQ = amQ + 1;
            mf1.b(this);
            eu(0);
            amQ = amQ - 1;
            ey(i);
            return;
        }
    }

    public void a(mf mf1, int i)
        throws IOException
    {
        if (amQ >= amR)
        {
            throw me.nT();
        } else
        {
            amQ = amQ + 1;
            mf1.b(this);
            eu(mi.u(i, 4));
            amQ = amQ - 1;
            return;
        }
    }

    public byte[] eA(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw me.nO();
        }
        if (amN + i > amP)
        {
            eB(amP - amN);
            throw me.nN();
        }
        if (i <= amL - amN)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, amN, abyte0, 0, i);
            amN = amN + i;
            return abyte0;
        } else
        {
            throw me.nN();
        }
    }

    public void eB(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw me.nO();
        }
        if (amN + i > amP)
        {
            eB(amP - amN);
            throw me.nN();
        }
        if (i <= amL - amN)
        {
            amN = amN + i;
            return;
        } else
        {
            throw me.nN();
        }
    }

    public void eu(int i)
        throws me
    {
        if (amO != i)
        {
            throw me.nR();
        } else
        {
            return;
        }
    }

    public boolean ev(int i)
        throws IOException
    {
        switch (mi.eN(i))
        {
        default:
            throw me.nS();

        case 0: // '\0'
            nz();
            return true;

        case 1: // '\001'
            nG();
            return true;

        case 2: // '\002'
            eB(nD());
            return true;

        case 3: // '\003'
            nx();
            eu(mi.u(mi.eO(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            nF();
            break;
        }
        return true;
    }

    public int ex(int i)
        throws me
    {
        if (i < 0)
        {
            throw me.nO();
        }
        i = amN + i;
        int j = amP;
        if (i > j)
        {
            throw me.nN();
        } else
        {
            amP = i;
            nH();
            return j;
        }
    }

    public void ey(int i)
    {
        amP = i;
        nH();
    }

    public void ez(int i)
    {
        if (i > amN - amK)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(amN - amK).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            amN = amK + i;
            return;
        }
    }

    public int getPosition()
    {
        return amN - amK;
    }

    public boolean nA()
        throws IOException
    {
        return nD() != 0;
    }

    public int nB()
        throws IOException
    {
        return ew(nD());
    }

    public long nC()
        throws IOException
    {
        return A(nE());
    }

    public int nD()
        throws IOException
    {
        int i = nK();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = nK();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = nK();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = nK();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = nK();
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
                    if (nK() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw me.nP();
    }

    public long nE()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = nK();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw me.nP();
    }

    public int nF()
        throws IOException
    {
        return nK() & 0xff | (nK() & 0xff) << 8 | (nK() & 0xff) << 16 | (nK() & 0xff) << 24;
    }

    public long nG()
        throws IOException
    {
        int i = nK();
        int j = nK();
        int k = nK();
        int l = nK();
        int i1 = nK();
        int j1 = nK();
        int k1 = nK();
        int l1 = nK();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int nI()
    {
        if (amP == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = amN;
            return amP - i;
        }
    }

    public boolean nJ()
    {
        return amN == amL;
    }

    public byte nK()
        throws IOException
    {
        if (amN == amL)
        {
            throw me.nN();
        } else
        {
            byte abyte0[] = buffer;
            int i = amN;
            amN = i + 1;
            return abyte0[i];
        }
    }

    public int nw()
        throws IOException
    {
        if (nJ())
        {
            amO = 0;
            return 0;
        }
        amO = nD();
        if (amO == 0)
        {
            throw me.nQ();
        } else
        {
            return amO;
        }
    }

    public void nx()
        throws IOException
    {
        int i;
        do
        {
            i = nw();
        } while (i != 0 && ev(i));
    }

    public long ny()
        throws IOException
    {
        return nE();
    }

    public int nz()
        throws IOException
    {
        return nD();
    }

    public byte[] o(int i, int j)
    {
        if (j == 0)
        {
            return mi.anh;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = amK;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }

    public byte[] readBytes()
        throws IOException
    {
        int i = nD();
        if (i <= amL - amN && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, amN, abyte0, 0, i);
            amN = i + amN;
            return abyte0;
        } else
        {
            return eA(i);
        }
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(nG());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(nF());
    }

    public String readString()
        throws IOException
    {
        int i = nD();
        if (i <= amL - amN && i > 0)
        {
            String s = new String(buffer, amN, i, "UTF-8");
            amN = i + amN;
            return s;
        } else
        {
            return new String(eA(i), "UTF-8");
        }
    }
}
