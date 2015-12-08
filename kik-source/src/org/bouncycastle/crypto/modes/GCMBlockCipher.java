// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.modes.gcm.GCMMultiplier;
import org.bouncycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.crypto.util.Pack;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes:
//            AEADBlockCipher

public class GCMBlockCipher
    implements AEADBlockCipher
{

    private static final byte a[] = new byte[16];
    private BlockCipher b;
    private GCMMultiplier c;
    private boolean d;
    private int e;
    private byte f[];
    private byte g[];
    private KeyParameter h;
    private byte i[];
    private byte j[];
    private byte k[];
    private byte l[];
    private byte m[];
    private byte n[];
    private byte o[];
    private int p;
    private long q;

    public GCMBlockCipher(BlockCipher blockcipher)
    {
        this(blockcipher, null);
    }

    public GCMBlockCipher(BlockCipher blockcipher, GCMMultiplier gcmmultiplier)
    {
        if (blockcipher.getBlockSize() != 16)
        {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        }
        Object obj = gcmmultiplier;
        if (gcmmultiplier == null)
        {
            obj = new Tables8kGCMMultiplier();
        }
        b = blockcipher;
        c = ((GCMMultiplier) (obj));
    }

    private void gCTRBlock(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        int k1 = 15;
        do
        {
            if (k1 < 12)
            {
                break;
            }
            byte byte0 = (byte)(o[k1] + 1 & 0xff);
            o[k1] = byte0;
            if (byte0 != 0)
            {
                break;
            }
            k1--;
        } while (true);
        byte abyte3[] = new byte[16];
        b.processBlock(o, 0, abyte3, 0);
        byte abyte2[];
        if (d)
        {
            System.arraycopy(a, i1, abyte3, i1, 16 - i1);
            abyte2 = abyte3;
        } else
        {
            abyte2 = abyte0;
        }
        for (k1 = i1 - 1; k1 >= 0; k1--)
        {
            abyte3[k1] = (byte)(abyte3[k1] ^ abyte0[k1]);
            abyte1[j1 + k1] = abyte3[k1];
        }

        xor(n, abyte2);
        c.multiplyH(n);
        q = q + (long)i1;
    }

    private byte[] gHASH(byte abyte0[])
    {
        byte abyte1[] = new byte[16];
        for (int i1 = 0; i1 < abyte0.length; i1 += 16)
        {
            byte abyte2[] = new byte[16];
            System.arraycopy(abyte0, i1, abyte2, 0, Math.min(abyte0.length - i1, 16));
            xor(abyte1, abyte2);
            c.multiplyH(abyte1);
        }

        return abyte1;
    }

    private static void packLength(long l1, byte abyte0[], int i1)
    {
        Pack.intToBigEndian((int)(l1 >>> 32), abyte0, i1);
        Pack.intToBigEndian((int)l1, abyte0, i1 + 4);
    }

    private int process(byte byte0, byte abyte0[], int i1)
    {
        byte abyte1[] = l;
        int j1 = p;
        p = j1 + 1;
        abyte1[j1] = byte0;
        if (p == l.length)
        {
            gCTRBlock(l, 16, abyte0, i1);
            if (!d)
            {
                System.arraycopy(l, 16, l, 0, e);
            }
            p = l.length - 16;
            return 16;
        } else
        {
            return 0;
        }
    }

    private void reset(boolean flag)
    {
        n = Arrays.c(j);
        o = Arrays.c(k);
        p = 0;
        q = 0L;
        if (l != null)
        {
            Arrays.a(l);
        }
        if (flag)
        {
            m = null;
        }
        b.reset();
    }

    private static void xor(byte abyte0[], byte abyte1[])
    {
        for (int i1 = 15; i1 >= 0; i1--)
        {
            abyte0[i1] = (byte)(abyte0[i1] ^ abyte1[i1]);
        }

    }

    public int doFinal(byte abyte0[], int i1)
    {
        int k1 = p;
        int j1 = k1;
        if (!d)
        {
            if (k1 < e)
            {
                throw new InvalidCipherTextException("data too short");
            }
            j1 = k1 - e;
        }
        if (j1 > 0)
        {
            byte abyte1[] = new byte[16];
            System.arraycopy(l, 0, abyte1, 0, j1);
            gCTRBlock(abyte1, j1, abyte0, i1);
        }
        byte abyte2[] = new byte[16];
        packLength((long)g.length * 8L, abyte2, 0);
        packLength(q * 8L, abyte2, 8);
        xor(n, abyte2);
        c.multiplyH(n);
        abyte2 = new byte[16];
        b.processBlock(k, 0, abyte2, 0);
        xor(abyte2, n);
        m = new byte[e];
        System.arraycopy(abyte2, 0, m, 0, e);
        if (d)
        {
            System.arraycopy(m, 0, abyte0, p + i1, e);
            j1 += e;
        } else
        {
            abyte0 = new byte[e];
            System.arraycopy(l, j1, abyte0, 0, e);
            if (!Arrays.b(m, abyte0))
            {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return j1;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(b.getAlgorithmName()).append("/GCM").toString();
    }

    public byte[] getMac()
    {
        return Arrays.c(m);
    }

    public int getOutputSize(int i1)
    {
        if (d)
        {
            return p + i1 + e;
        } else
        {
            return (p + i1) - e;
        }
    }

    public BlockCipher getUnderlyingCipher()
    {
        return b;
    }

    public int getUpdateOutputSize(int i1)
    {
        return ((p + i1) / 16) * 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        d = flag;
        m = null;
        int j1;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            f = cipherparameters.getNonce();
            g = cipherparameters.getAssociatedText();
            int i1 = cipherparameters.getMacSize();
            if (i1 < 96 || i1 > 128 || i1 % 8 != 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid value for MAC size: ")).append(i1).toString());
            }
            e = i1 / 8;
            h = cipherparameters.getKey();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            f = cipherparameters.getIV();
            g = null;
            e = 16;
            h = (KeyParameter)cipherparameters.getParameters();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        if (flag)
        {
            j1 = 16;
        } else
        {
            j1 = e + 16;
        }
        l = new byte[j1];
        if (f == null || f.length <= 0)
        {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (g == null)
        {
            g = new byte[0];
        }
        b.init(true, h);
        i = new byte[16];
        b.processBlock(a, 0, i, 0);
        c.init(i);
        j = gHASH(g);
        if (f.length == 12)
        {
            k = new byte[16];
            System.arraycopy(f, 0, k, 0, f.length);
            k[15] = 1;
        } else
        {
            k = gHASH(f);
            cipherparameters = new byte[16];
            packLength((long)f.length * 8L, cipherparameters, 8);
            xor(k, cipherparameters);
            c.multiplyH(k);
        }
        n = Arrays.c(j);
        o = Arrays.c(k);
        p = 0;
        q = 0L;
    }

    public int processByte(byte byte0, byte abyte0[], int i1)
    {
        return process(byte0, abyte0, i1);
    }

    public int processBytes(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
    {
        int l1 = 0;
        int i2;
        int j2;
        for (i2 = 0; l1 != j1; i2 = j2)
        {
            byte abyte2[] = l;
            j2 = p;
            p = j2 + 1;
            abyte2[j2] = abyte0[i1 + l1];
            j2 = i2;
            if (p == l.length)
            {
                gCTRBlock(l, 16, abyte1, k1 + i2);
                if (!d)
                {
                    System.arraycopy(l, 16, l, 0, e);
                }
                p = l.length - 16;
                j2 = i2 + 16;
            }
            l1++;
        }

        return i2;
    }

    public void reset()
    {
        reset(true);
    }

}
