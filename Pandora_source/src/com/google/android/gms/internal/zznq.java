// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zznx, zzny, zzob

public final class zznq
{

    private final byte buffer[];
    private int zzaNA;
    private int zzaNB;
    private int zzaNC;
    private int zzaND;
    private int zzaNE;
    private int zzaNF;
    private int zzaNG;
    private int zzaNy;
    private int zzaNz;

    private zznq(byte abyte0[], int i, int j)
    {
        zzaND = 0x7fffffff;
        zzaNF = 64;
        zzaNG = 0x4000000;
        buffer = abyte0;
        zzaNy = i;
        zzaNz = i + j;
        zzaNB = i;
    }

    public static long zzU(long l)
    {
        return l >>> 1 ^ -(1L & l);
    }

    public static zznq zza(byte abyte0[], int i, int j)
    {
        return new zznq(abyte0, i, j);
    }

    public static int zzjm(int i)
    {
        return i >>> 1 ^ -(i & 1);
    }

    public static zznq zzv(byte abyte0[])
    {
        return zza(abyte0, 0, abyte0.length);
    }

    private void zzzJ()
    {
        zzaNz = zzaNz + zzaNA;
        int i = zzaNz;
        if (i > zzaND)
        {
            zzaNA = i - zzaND;
            zzaNz = zzaNz - zzaNA;
            return;
        } else
        {
            zzaNA = 0;
            return;
        }
    }

    public int getPosition()
    {
        return zzaNB - zzaNy;
    }

    public byte[] readBytes()
        throws IOException
    {
        int i = zzzF();
        if (i <= zzaNz - zzaNB && i > 0)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, zzaNB, abyte0, 0, i);
            zzaNB = i + zzaNB;
            return abyte0;
        } else
        {
            return zzjq(i);
        }
    }

    public double readDouble()
        throws IOException
    {
        return Double.longBitsToDouble(zzzI());
    }

    public float readFloat()
        throws IOException
    {
        return Float.intBitsToFloat(zzzH());
    }

    public String readString()
        throws IOException
    {
        int i = zzzF();
        if (i <= zzaNz - zzaNB && i > 0)
        {
            String s = new String(buffer, zzaNB, i, "UTF-8");
            zzaNB = i + zzaNB;
            return s;
        } else
        {
            return new String(zzjq(i), "UTF-8");
        }
    }

    public void zza(zzny zzny1)
        throws IOException
    {
        int i = zzzF();
        if (zzaNE >= zzaNF)
        {
            throw zznx.zzAa();
        } else
        {
            i = zzjn(i);
            zzaNE = zzaNE + 1;
            zzny1.zzb(this);
            zzjk(0);
            zzaNE = zzaNE - 1;
            zzjo(i);
            return;
        }
    }

    public void zza(zzny zzny1, int i)
        throws IOException
    {
        if (zzaNE >= zzaNF)
        {
            throw zznx.zzAa();
        } else
        {
            zzaNE = zzaNE + 1;
            zzny1.zzb(this);
            zzjk(zzob.zzC(i, 4));
            zzaNE = zzaNE - 1;
            return;
        }
    }

    public void zzjk(int i)
        throws zznx
    {
        if (zzaNC != i)
        {
            throw zznx.zzzY();
        } else
        {
            return;
        }
    }

    public boolean zzjl(int i)
        throws IOException
    {
        switch (zzob.zzjF(i))
        {
        default:
            throw zznx.zzzZ();

        case 0: // '\0'
            zzzB();
            return true;

        case 1: // '\001'
            zzzI();
            return true;

        case 2: // '\002'
            zzjr(zzzF());
            return true;

        case 3: // '\003'
            zzzz();
            zzjk(zzob.zzC(zzob.zzjG(i), 4));
            return true;

        case 4: // '\004'
            return false;

        case 5: // '\005'
            zzzH();
            break;
        }
        return true;
    }

    public int zzjn(int i)
        throws zznx
    {
        if (i < 0)
        {
            throw zznx.zzzV();
        }
        i = zzaNB + i;
        int j = zzaND;
        if (i > j)
        {
            throw zznx.zzzU();
        } else
        {
            zzaND = i;
            zzzJ();
            return j;
        }
    }

    public void zzjo(int i)
    {
        zzaND = i;
        zzzJ();
    }

    public void zzjp(int i)
    {
        if (i > zzaNB - zzaNy)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Position ").append(i).append(" is beyond current ").append(zzaNB - zzaNy).toString());
        }
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad position ").append(i).toString());
        } else
        {
            zzaNB = zzaNy + i;
            return;
        }
    }

    public byte[] zzjq(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw zznx.zzzV();
        }
        if (zzaNB + i > zzaND)
        {
            zzjr(zzaND - zzaNB);
            throw zznx.zzzU();
        }
        if (i <= zzaNz - zzaNB)
        {
            byte abyte0[] = new byte[i];
            System.arraycopy(buffer, zzaNB, abyte0, 0, i);
            zzaNB = zzaNB + i;
            return abyte0;
        } else
        {
            throw zznx.zzzU();
        }
    }

    public void zzjr(int i)
        throws IOException
    {
        if (i < 0)
        {
            throw zznx.zzzV();
        }
        if (zzaNB + i > zzaND)
        {
            zzjr(zzaND - zzaNB);
            throw zznx.zzzU();
        }
        if (i <= zzaNz - zzaNB)
        {
            zzaNB = zzaNB + i;
            return;
        } else
        {
            throw zznx.zzzU();
        }
    }

    public byte[] zzw(int i, int j)
    {
        if (j == 0)
        {
            return zzob.zzaOc;
        } else
        {
            byte abyte0[] = new byte[j];
            int k = zzaNy;
            System.arraycopy(buffer, k + i, abyte0, 0, j);
            return abyte0;
        }
    }

    public long zzzA()
        throws IOException
    {
        return zzzG();
    }

    public int zzzB()
        throws IOException
    {
        return zzzF();
    }

    public boolean zzzC()
        throws IOException
    {
        return zzzF() != 0;
    }

    public int zzzD()
        throws IOException
    {
        return zzjm(zzzF());
    }

    public long zzzE()
        throws IOException
    {
        return zzU(zzzG());
    }

    public int zzzF()
        throws IOException
    {
        int i = zzzM();
        if (i < 0) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        i &= 0x7f;
        byte byte0 = zzzM();
        if (byte0 >= 0)
        {
            return i | byte0 << 7;
        }
        i |= (byte0 & 0x7f) << 7;
        byte0 = zzzM();
        if (byte0 >= 0)
        {
            return i | byte0 << 14;
        }
        i |= (byte0 & 0x7f) << 14;
        int k = zzzM();
        if (k >= 0)
        {
            return i | k << 21;
        }
        byte0 = zzzM();
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
                    if (zzzM() >= 0)
                    {
                        break label0;
                    }
                    j++;
                }
            } while (true);
        }
        if (true) goto _L1; else goto _L3
_L3:
        throw zznx.zzzW();
    }

    public long zzzG()
        throws IOException
    {
        int i = 0;
        long l = 0L;
        for (; i < 64; i += 7)
        {
            byte byte0 = zzzM();
            l |= (long)(byte0 & 0x7f) << i;
            if ((byte0 & 0x80) == 0)
            {
                return l;
            }
        }

        throw zznx.zzzW();
    }

    public int zzzH()
        throws IOException
    {
        return zzzM() & 0xff | (zzzM() & 0xff) << 8 | (zzzM() & 0xff) << 16 | (zzzM() & 0xff) << 24;
    }

    public long zzzI()
        throws IOException
    {
        int i = zzzM();
        int j = zzzM();
        int k = zzzM();
        int l = zzzM();
        int i1 = zzzM();
        int j1 = zzzM();
        int k1 = zzzM();
        int l1 = zzzM();
        long l2 = i;
        return ((long)j & 255L) << 8 | l2 & 255L | ((long)k & 255L) << 16 | ((long)l & 255L) << 24 | ((long)i1 & 255L) << 32 | ((long)j1 & 255L) << 40 | ((long)k1 & 255L) << 48 | ((long)l1 & 255L) << 56;
    }

    public int zzzK()
    {
        if (zzaND == 0x7fffffff)
        {
            return -1;
        } else
        {
            int i = zzaNB;
            return zzaND - i;
        }
    }

    public boolean zzzL()
    {
        return zzaNB == zzaNz;
    }

    public byte zzzM()
        throws IOException
    {
        if (zzaNB == zzaNz)
        {
            throw zznx.zzzU();
        } else
        {
            byte abyte0[] = buffer;
            int i = zzaNB;
            zzaNB = i + 1;
            return abyte0[i];
        }
    }

    public int zzzy()
        throws IOException
    {
        if (zzzL())
        {
            zzaNC = 0;
            return 0;
        }
        zzaNC = zzzF();
        if (zzaNC == 0)
        {
            throw zznx.zzzX();
        } else
        {
            return zzaNC;
        }
    }

    public void zzzz()
        throws IOException
    {
        int i;
        do
        {
            i = zzzy();
        } while (i != 0 && zzjl(i));
    }
}
