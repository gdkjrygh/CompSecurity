// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes:
//            AEADBlockCipher, SICBlockCipher

public class EAXBlockCipher
    implements AEADBlockCipher
{

    private SICBlockCipher a;
    private boolean b;
    private int c;
    private Mac d;
    private byte e[];
    private byte f[];
    private byte g[];
    private int h;
    private byte i[];
    private int j;

    public EAXBlockCipher(BlockCipher blockcipher)
    {
        c = blockcipher.getBlockSize();
        d = new CMac(blockcipher);
        g = new byte[c];
        i = new byte[c * 2];
        f = new byte[d.getMacSize()];
        e = new byte[d.getMacSize()];
        a = new SICBlockCipher(blockcipher);
    }

    private void calculateMac()
    {
        int k = 0;
        byte abyte0[] = new byte[c];
        d.doFinal(abyte0, 0);
        for (; k < g.length; k++)
        {
            g[k] = (byte)(e[k] ^ f[k] ^ abyte0[k]);
        }

    }

    private int process(byte byte0, byte abyte0[], int k)
    {
        byte abyte1[] = i;
        int l = j;
        j = l + 1;
        abyte1[l] = byte0;
        if (j == i.length)
        {
            if (b)
            {
                int i1 = a.processBlock(i, 0, abyte0, k);
                d.update(abyte0, k, c);
                k = i1;
            } else
            {
                d.update(i, 0, c);
                k = a.processBlock(i, 0, abyte0, k);
            }
            j = c;
            System.arraycopy(i, c, i, 0, c);
            return k;
        } else
        {
            return 0;
        }
    }

    private void reset(boolean flag)
    {
        a.reset();
        d.reset();
        j = 0;
        Arrays.a(i);
        if (flag)
        {
            Arrays.a(g);
        }
        byte abyte0[] = new byte[c];
        abyte0[c - 1] = 2;
        d.update(abyte0, 0, c);
    }

    private boolean verifyMac(byte abyte0[], int k)
    {
        for (int l = 0; l < h; l++)
        {
            if (g[l] != abyte0[k + l])
            {
                return false;
            }
        }

        return true;
    }

    public int doFinal(byte abyte0[], int k)
    {
        int l = j;
        byte abyte1[] = new byte[i.length];
        j = 0;
        if (b)
        {
            a.processBlock(i, 0, abyte1, 0);
            a.processBlock(i, c, abyte1, c);
            System.arraycopy(abyte1, 0, abyte0, k, l);
            d.update(abyte1, 0, l);
            calculateMac();
            System.arraycopy(g, 0, abyte0, k + l, h);
            reset(false);
            return l + h;
        }
        if (l > h)
        {
            d.update(i, 0, l - h);
            a.processBlock(i, 0, abyte1, 0);
            a.processBlock(i, c, abyte1, c);
            System.arraycopy(abyte1, 0, abyte0, k, l - h);
        }
        calculateMac();
        if (!verifyMac(i, l - h))
        {
            throw new InvalidCipherTextException("mac check in EAX failed");
        } else
        {
            reset(false);
            return l - h;
        }
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getUnderlyingCipher().getAlgorithmName()).append("/EAX").toString();
    }

    public int getBlockSize()
    {
        return a.getBlockSize();
    }

    public byte[] getMac()
    {
        byte abyte0[] = new byte[h];
        System.arraycopy(g, 0, abyte0, 0, h);
        return abyte0;
    }

    public int getOutputSize(int k)
    {
        if (b)
        {
            return j + k + h;
        } else
        {
            return (j + k) - h;
        }
    }

    public BlockCipher getUnderlyingCipher()
    {
        return a.getUnderlyingCipher();
    }

    public int getUpdateOutputSize(int k)
    {
        return ((j + k) / c) * c;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        b = flag;
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            abyte1 = cipherparameters.getNonce();
            abyte0 = cipherparameters.getAssociatedText();
            h = cipherparameters.getMacSize() / 8;
            cipherparameters = cipherparameters.getKey();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            abyte1 = cipherparameters.getIV();
            abyte0 = new byte[0];
            h = d.getMacSize() / 2;
            cipherparameters = cipherparameters.getParameters();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        abyte2 = new byte[c];
        d.init(cipherparameters);
        abyte2[c - 1] = 1;
        d.update(abyte2, 0, c);
        d.update(abyte0, 0, abyte0.length);
        d.doFinal(f, 0);
        abyte2[c - 1] = 0;
        d.update(abyte2, 0, c);
        d.update(abyte1, 0, abyte1.length);
        d.doFinal(e, 0);
        abyte2[c - 1] = 2;
        d.update(abyte2, 0, c);
        a.init(true, new ParametersWithIV(cipherparameters, e));
    }

    public int processByte(byte byte0, byte abyte0[], int k)
    {
        return process(byte0, abyte0, k);
    }

    public int processBytes(byte abyte0[], int k, int l, byte abyte1[], int i1)
    {
        int j1 = 0;
        int k1 = 0;
        for (; j1 != l; j1++)
        {
            k1 += process(abyte0[k + j1], abyte1, i1 + k1);
        }

        return k1;
    }

    public void reset()
    {
        reset(true);
    }
}
