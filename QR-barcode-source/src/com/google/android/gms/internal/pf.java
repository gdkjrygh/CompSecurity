// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            pm, pn, pq

public final class pf
{

    private int awA;
    private int awB;
    private int awC;
    private int awD;
    private int awE;
    private int awF;
    private int awG;
    private int awH;
    private int awz;
    private final byte buffer[];

    private pf(byte abyte0[], int i, int j)
    {
        awE = 0x7fffffff;
        awG = 64;
        awH = 0x4000000;
        buffer = abyte0;
        awz = i;
        awA = i + j;
        awC = i;
    }

    public static long A(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static pf a(byte abyte0[], int i, int j)
    {
        return new pf(abyte0, i, j);
    }

    public static int go(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    public static pf p(byte abyte0[])
    {
        return a(abyte0, 0, abyte0.length);
    }

    private void qt()
    {
        awA = awA + awB;
        int i = awA;
        if (i > awE)
        {
            awB = i - awE;
            awA = awA - awB;
            return;
        } else
        {
            awB = 0;
            return;
        }
    }

    public void a(pn pn1)
        throws IOException
    {
        int i = qp();
        if (awF >= awG)
        {
            throw pm.qG();
        } else
        {
            i = gp(i);
            awF = awF + 1;
            pn1.b(this);
            gm(0);
            awF = awF - 1;
            gq(i);
            return;
        }
    }

    public void a(pn pn1, int i)
        throws IOException
    {
        if (awF >= awG)
        {
            throw pm.qG();
        } else
        {
            awF = awF + 1;
            pn1.b(this);
            gm(pq.x(i, 4));
            awF = awF - 1;
            return;
        }
    }

    public int getPosition()
    {
        return awC - awz;
    }

    public void gm(int i)
        throws pm
    {
        if (awD != i)
        {
            throw pm.qE();
        } else
        {
            return;
        }
    }

    public boolean gn(int i)
        throws IOException
    {
        switch (pq.gH(i))
        {
        default:
            throw pm.qF();

        case 0: // '\0'
            ql();
            return true;

        case 1: // '\001'
            qs();
            return true;

        case 2: // '\002'
            gt(qp());
            return true;

        case 3: // '\003'
            qj();
            gm(pq.x(pq.gI(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            qr();
            break;
        }
        return true;
    }

    public int gp(int i)
        throws pm
    {
        if (i < 0)
        {
            throw pm.qB();
        }
        i = awC + i;
        int j = awE;
        if (i > j)
        {
            throw pm.qA();
        } else
        {
            awE = i;
            qt();
            return j;
        }
    }

    public void gq(int i)
    {
        awE = i;
        qt();
    }

    public void gr(int i)
    {
        if (i > awC - awz)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(awC - awz).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            awC = awz + i;
            return;
        }
    }

    public byte[] gs(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw pm.qB();
        }
        if (awC + i > awE)
        {
            gt(awE - awC);
            throw pm.qA();
        }
        if (i <= awA - awC)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, awC, abyte0, 0, i);
            awC = awC + i;
            return abyte0;
        } else
        {
            throw pm.qA();
        }
    }

    public void gt(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw pm.qB();
        }
        if (awC + i > awE)
        {
            gt(awE - awC);
            throw pm.qA();
        }
        if (i <= awA - awC)
        {
            awC = awC + i;
            return;
        } else
        {
            throw pm.qA();
        }
    }

    public int qi()
        throws IOException
    {
        if (qv())
        {
            awD = 0;
            return 0;
        }
        awD = qp();
        if (awD == 0)
        {
            throw pm.qD();
        } else
        {
            return awD;
        }
    }

    public void qj()
        throws IOException
    {
        int i;
        do
        {
            i = qi();
        } while (i != 0 && gn(i));
    }

    public long qk()
        throws IOException
    {
        return qq();
    }

    public int ql()
        throws IOException
    {
        return qp();
    }

    public boolean qm()
        throws IOException
    {
        return qp() != 0;
    }

    public int qn()
        throws IOException
    {
        return go(qp());
    }

    public long qo()
        throws IOException
    {
        return A(qq());
    }

    public int qp()
        throws IOException
    {
        int i = qw();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = qw();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = qw();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = qw();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = qw();
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
                    if (qw() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw pm.qC();
    }

    public long qq()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = qw();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw pm.qC();
    }

    public int qr()
        throws IOException
    {
        return qw() & 0xff | (qw() & 0xff) << 8 | (qw() & 0xff) << 16 | (qw() & 0xff) << 24;
    }

    public long qs()
        throws IOException
    {
        int i = qw();
        int j = qw();
        int k = qw();
        int l = qw();
        int i1 = qw();
        int j1 = qw();
        int k1 = qw();
        int l1 = qw();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int qu()
    {
        if (awE == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = awC;
            return awE - i;
        }
    }

    public boolean qv()
    {
        return awC == awA;
    }

    public byte qw()
        throws IOException
    {
        if (awC == awA)
        {
            throw pm.qA();
        } else
        {
            byte abyte0[] = buffer;
            int i = awC;
            awC = i + 1;
            return abyte0[i];
        }
    }

    public byte[] r(int i, int j)
    {
        if (j == 0)
        {
            return pq.axd;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = awz;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }

    public byte[] readBytes()
        throws IOException
    {
        int i = qp();
        if (i <= awA - awC && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, awC, abyte0, 0, i);
            awC = i + awC;
            return abyte0;
        } else
        {
            return gs(i);
        }
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(qs());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(qr());
    }

    public String readString()
        throws IOException
    {
        int i = qp();
        if (i <= awA - awC && i > 0)
        {
            String s = new String(buffer, awC, i, "UTF-8");
            awC = i + awC;
            return s;
        } else
        {
            return new String(gs(i), "UTF-8");
        }
    }
}
