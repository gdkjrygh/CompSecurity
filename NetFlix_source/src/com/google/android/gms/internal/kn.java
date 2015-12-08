// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ks, kt, kw

public final class kn
{

    private int adK;
    private int adL;
    private int adM;
    private int adN;
    private int adO;
    private int adP;
    private int adQ;
    private int adR;
    private int adS;
    private final byte buffer[];

    private kn(byte abyte0[], int i, int j)
    {
        adP = 0x7fffffff;
        adR = 64;
        adS = 0x4000000;
        buffer = abyte0;
        adK = i;
        adL = i + j;
        adN = i;
    }

    public static kn a(byte abyte0[], int i, int j)
    {
        return new kn(abyte0, i, j);
    }

    private void mr()
    {
        adL = adL + adM;
        int i = adL;
        if (i > adP)
        {
            adM = i - adP;
            adL = adL - adM;
            return;
        } else
        {
            adM = 0;
            return;
        }
    }

    public static kn n(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    public static long x(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public void a(kt kt1)
        throws IOException
    {
        int i = mn();
        if (adQ >= adR)
        {
            throw ks.mE();
        } else
        {
            i = cR(i);
            adQ = adQ + 1;
            kt1.b(this);
            cP(0);
            adQ = adQ - 1;
            cS(i);
            return;
        }
    }

    public void a(kt kt1, int i)
        throws IOException
    {
        if (adQ >= adR)
        {
            throw ks.mE();
        } else
        {
            adQ = adQ + 1;
            kt1.b(this);
            cP(kw.l(i, 4));
            adQ = adQ - 1;
            return;
        }
    }

    public void cP(int i)
        throws ks
    {
        if (adO != i)
        {
            throw ks.mC();
        } else
        {
            return;
        }
    }

    public boolean cQ(int i)
        throws IOException
    {
        switch (kw.de(i))
        {
        default:
            throw ks.mD();

        case 0: // '\0'
            mk();
            return true;

        case 1: // '\001'
            mq();
            return true;

        case 2: // '\002'
            cV(mn());
            return true;

        case 3: // '\003'
            mi();
            cP(kw.l(kw.df(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            mp();
            break;
        }
        return true;
    }

    public int cR(int i)
        throws ks
    {
        if (i < 0)
        {
            throw ks.mz();
        }
        i = adN + i;
        int j = adP;
        if (i > j)
        {
            throw ks.my();
        } else
        {
            adP = i;
            mr();
            return j;
        }
    }

    public void cS(int i)
    {
        adP = i;
        mr();
    }

    public void cT(int i)
    {
        if (i > adN - adK)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(adN - adK).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            adN = adK + i;
            return;
        }
    }

    public byte[] cU(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw ks.mz();
        }
        if (adN + i > adP)
        {
            cV(adP - adN);
            throw ks.my();
        }
        if (i <= adL - adN)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, adN, abyte0, 0, i);
            adN = adN + i;
            return abyte0;
        } else
        {
            throw ks.my();
        }
    }

    public void cV(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw ks.mz();
        }
        if (adN + i > adP)
        {
            cV(adP - adN);
            throw ks.my();
        }
        if (i <= adL - adN)
        {
            adN = adN + i;
            return;
        } else
        {
            throw ks.my();
        }
    }

    public int getPosition()
    {
        return adN - adK;
    }

    public byte[] h(int i, int j)
    {
        if (j == 0)
        {
            return kw.aeh;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = adK;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }

    public int mh()
        throws IOException
    {
        if (mt())
        {
            adO = 0;
            return 0;
        }
        adO = mn();
        if (adO == 0)
        {
            throw ks.mB();
        } else
        {
            return adO;
        }
    }

    public void mi()
        throws IOException
    {
        int i;
        do
        {
            i = mh();
        } while (i != 0 && cQ(i));
    }

    public long mj()
        throws IOException
    {
        return mo();
    }

    public int mk()
        throws IOException
    {
        return mn();
    }

    public boolean ml()
        throws IOException
    {
        return mn() != 0;
    }

    public long mm()
        throws IOException
    {
        return x(mo());
    }

    public int mn()
        throws IOException
    {
        int i = mu();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = mu();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = mu();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = mu();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = mu();
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
                    if (mu() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw ks.mA();
    }

    public long mo()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = mu();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw ks.mA();
    }

    public int mp()
        throws IOException
    {
        return mu() & 0xff | (mu() & 0xff) << 8 | (mu() & 0xff) << 16 | (mu() & 0xff) << 24;
    }

    public long mq()
        throws IOException
    {
        int i = mu();
        int j = mu();
        int k = mu();
        int l = mu();
        int i1 = mu();
        int j1 = mu();
        int k1 = mu();
        int l1 = mu();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int ms()
    {
        if (adP == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = adN;
            return adP - i;
        }
    }

    public boolean mt()
    {
        return adN == adL;
    }

    public byte mu()
        throws IOException
    {
        if (adN == adL)
        {
            throw ks.my();
        } else
        {
            byte abyte0[] = buffer;
            int i = adN;
            adN = i + 1;
            return abyte0[i];
        }
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(mp());
    }

    public String readString()
        throws IOException
    {
        int i = mn();
        if (i <= adL - adN && i > 0)
        {
            String s = new String(buffer, adN, i, "UTF-8");
            adN = i + adN;
            return s;
        } else
        {
            return new String(cU(i), "UTF-8");
        }
    }
}
