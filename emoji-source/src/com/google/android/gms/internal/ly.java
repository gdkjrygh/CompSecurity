// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            md, me, mh

public final class ly
{

    private int amN;
    private int amO;
    private int amP;
    private int amQ;
    private int amR;
    private int amS;
    private int amT;
    private int amU;
    private int amV;
    private final byte buffer[];

    private ly(byte abyte0[], int i, int j)
    {
        amS = 0x7fffffff;
        amU = 64;
        amV = 0x4000000;
        buffer = abyte0;
        amN = i;
        amO = i + j;
        amQ = i;
    }

    public static long A(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static ly a(byte abyte0[], int i, int j)
    {
        return new ly(abyte0, i, j);
    }

    public static int ew(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    private void nM()
    {
        amO = amO + amP;
        int i = amO;
        if (i > amS)
        {
            amP = i - amS;
            amO = amO - amP;
            return;
        } else
        {
            amP = 0;
            return;
        }
    }

    public static ly p(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public void a(me me1)
        throws IOException
    {
        int i = nI();
        if (amT >= amU)
        {
            throw md.nY();
        } else
        {
            i = ex(i);
            amT = amT + 1;
            me1.b(this);
            eu(0);
            amT = amT - 1;
            ey(i);
            return;
        }
    }

    public void a(me me1, int i)
        throws IOException
    {
        if (amT >= amU)
        {
            throw md.nY();
        } else
        {
            amT = amT + 1;
            me1.b(this);
            eu(mh.u(i, 4));
            amT = amT - 1;
            return;
        }
    }

    public byte[] eA(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw md.nT();
        }
        if (amQ + i > amS)
        {
            eB(amS - amQ);
            throw md.nS();
        }
        if (i <= amO - amQ)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, amQ, abyte0, 0, i);
            amQ = amQ + i;
            return abyte0;
        } else
        {
            throw md.nS();
        }
    }

    public void eB(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw md.nT();
        }
        if (amQ + i > amS)
        {
            eB(amS - amQ);
            throw md.nS();
        }
        if (i <= amO - amQ)
        {
            amQ = amQ + i;
            return;
        } else
        {
            throw md.nS();
        }
    }

    public void eu(int i)
        throws md
    {
        if (amR != i)
        {
            throw md.nW();
        } else
        {
            return;
        }
    }

    public boolean ev(int i)
        throws IOException
    {
        switch (mh.eN(i))
        {
        default:
            throw md.nX();

        case 0: // '\0'
            nE();
            return true;

        case 1: // '\001'
            nL();
            return true;

        case 2: // '\002'
            eB(nI());
            return true;

        case 3: // '\003'
            nC();
            eu(mh.u(mh.eO(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            nK();
            break;
        }
        return true;
    }

    public int ex(int i)
        throws md
    {
        if (i < 0)
        {
            throw md.nT();
        }
        i = amQ + i;
        int j = amS;
        if (i > j)
        {
            throw md.nS();
        } else
        {
            amS = i;
            nM();
            return j;
        }
    }

    public void ey(int i)
    {
        amS = i;
        nM();
    }

    public void ez(int i)
    {
        if (i > amQ - amN)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(amQ - amN).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            amQ = amN + i;
            return;
        }
    }

    public int getPosition()
    {
        return amQ - amN;
    }

    public int nB()
        throws IOException
    {
        if (nO())
        {
            amR = 0;
            return 0;
        }
        amR = nI();
        if (amR == 0)
        {
            throw md.nV();
        } else
        {
            return amR;
        }
    }

    public void nC()
        throws IOException
    {
        int i;
        do
        {
            i = nB();
        } while (i != 0 && ev(i));
    }

    public long nD()
        throws IOException
    {
        return nJ();
    }

    public int nE()
        throws IOException
    {
        return nI();
    }

    public boolean nF()
        throws IOException
    {
        return nI() != 0;
    }

    public int nG()
        throws IOException
    {
        return ew(nI());
    }

    public long nH()
        throws IOException
    {
        return A(nJ());
    }

    public int nI()
        throws IOException
    {
        int i = nP();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = nP();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = nP();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = nP();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = nP();
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
                    if (nP() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw md.nU();
    }

    public long nJ()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = nP();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw md.nU();
    }

    public int nK()
        throws IOException
    {
        return nP() & 0xff | (nP() & 0xff) << 8 | (nP() & 0xff) << 16 | (nP() & 0xff) << 24;
    }

    public long nL()
        throws IOException
    {
        int i = nP();
        int j = nP();
        int k = nP();
        int l = nP();
        int i1 = nP();
        int j1 = nP();
        int k1 = nP();
        int l1 = nP();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int nN()
    {
        if (amS == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = amQ;
            return amS - i;
        }
    }

    public boolean nO()
    {
        return amQ == amO;
    }

    public byte nP()
        throws IOException
    {
        if (amQ == amO)
        {
            throw md.nS();
        } else
        {
            byte abyte0[] = buffer;
            int i = amQ;
            amQ = i + 1;
            return abyte0[i];
        }
    }

    public byte[] o(int i, int j)
    {
        if (j == 0)
        {
            return mh.ank;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = amN;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }

    public byte[] readBytes()
        throws IOException
    {
        int i = nI();
        if (i <= amO - amQ && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, amQ, abyte0, 0, i);
            amQ = i + amQ;
            return abyte0;
        } else
        {
            return eA(i);
        }
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(nL());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(nK());
    }

    public String readString()
        throws IOException
    {
        int i = nI();
        if (i <= amO - amQ && i > 0)
        {
            String s = new String(buffer, amQ, i, "UTF-8");
            amQ = i + amQ;
            return s;
        } else
        {
            return new String(eA(i), "UTF-8");
        }
    }
}
