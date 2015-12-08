// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.macs.CBCBlockCipherMac;
import org.bouncycastle.crypto.params.AEADParameters;
import org.bouncycastle.crypto.params.ParametersWithIV;
import org.bouncycastle.util.Arrays;

// Referenced classes of package org.bouncycastle.crypto.modes:
//            AEADBlockCipher, SICBlockCipher

public class CCMBlockCipher
    implements AEADBlockCipher
{

    private BlockCipher a;
    private int b;
    private boolean c;
    private byte d[];
    private byte e[];
    private int f;
    private CipherParameters g;
    private byte h[];
    private ByteArrayOutputStream i;

    public CCMBlockCipher(BlockCipher blockcipher)
    {
        i = new ByteArrayOutputStream();
        a = blockcipher;
        b = blockcipher.getBlockSize();
        h = new byte[b];
        if (b != 16)
        {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        } else
        {
            return;
        }
    }

    private int calculateMac(byte abyte0[], int j, int k, byte abyte1[])
    {
        int l = 1;
        CBCBlockCipherMac cbcblockciphermac = new CBCBlockCipherMac(a, f * 8);
        cbcblockciphermac.init(g);
        byte abyte2[] = new byte[16];
        if (hasAssociatedText())
        {
            abyte2[0] = (byte)(abyte2[0] | 0x40);
        }
        abyte2[0] = (byte)(abyte2[0] | ((cbcblockciphermac.getMacSize() - 2) / 2 & 7) << 3);
        abyte2[0] = (byte)(abyte2[0] | 15 - d.length - 1 & 7);
        System.arraycopy(d, 0, abyte2, 1, d.length);
        for (int j1 = k; j1 > 0;)
        {
            abyte2[16 - l] = (byte)(j1 & 0xff);
            j1 >>>= 8;
            l++;
        }

        cbcblockciphermac.update(abyte2, 0, 16);
        if (hasAssociatedText())
        {
            int i1;
            int k1;
            if (e.length < 65280)
            {
                cbcblockciphermac.update((byte)(e.length >> 8));
                cbcblockciphermac.update((byte)e.length);
                i1 = 2;
            } else
            {
                cbcblockciphermac.update((byte)-1);
                cbcblockciphermac.update((byte)-2);
                cbcblockciphermac.update((byte)(e.length >> 24));
                cbcblockciphermac.update((byte)(e.length >> 16));
                cbcblockciphermac.update((byte)(e.length >> 8));
                cbcblockciphermac.update((byte)e.length);
                i1 = 6;
            }
            cbcblockciphermac.update(e, 0, e.length);
            k1 = (i1 + e.length) % 16;
            if (k1 != 0)
            {
                for (i1 = 0; i1 != 16 - k1; i1++)
                {
                    cbcblockciphermac.update((byte)0);
                }

            }
        }
        cbcblockciphermac.update(abyte0, j, k);
        return cbcblockciphermac.doFinal(abyte1, 0);
    }

    private boolean hasAssociatedText()
    {
        return e != null && e.length != 0;
    }

    public int doFinal(byte abyte0[], int j)
    {
        byte abyte1[] = i.toByteArray();
        abyte1 = processPacket(abyte1, 0, abyte1.length);
        System.arraycopy(abyte1, 0, abyte0, j, abyte1.length);
        reset();
        return abyte1.length;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getAlgorithmName()).append("/CCM").toString();
    }

    public byte[] getMac()
    {
        byte abyte0[] = new byte[f];
        System.arraycopy(h, 0, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public int getOutputSize(int j)
    {
        if (c)
        {
            return i.size() + j + f;
        } else
        {
            return (i.size() + j) - f;
        }
    }

    public BlockCipher getUnderlyingCipher()
    {
        return a;
    }

    public int getUpdateOutputSize(int j)
    {
        return 0;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            d = cipherparameters.getNonce();
            e = cipherparameters.getAssociatedText();
            f = cipherparameters.getMacSize() / 8;
            g = cipherparameters.getKey();
            return;
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            d = cipherparameters.getIV();
            e = null;
            f = h.length / 2;
            g = cipherparameters.getParameters();
            return;
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to CCM");
        }
    }

    public int processByte(byte byte0, byte abyte0[], int j)
    {
        i.write(byte0);
        return 0;
    }

    public int processBytes(byte abyte0[], int j, int k, byte abyte1[], int l)
    {
        i.write(abyte0, j, k);
        return 0;
    }

    public byte[] processPacket(byte abyte0[], int j, int k)
    {
_L2:
        while (k < abyte1.length - b) 
        {
            sicblockcipher.processBlock(abyte0, j, abyte1, k);
            k += b;
            j += b;
        }
        byte abyte3[] = new byte[b];
        System.arraycopy(abyte0, j, abyte3, 0, abyte1.length - k);
        sicblockcipher.processBlock(abyte3, 0, abyte3, 0);
        System.arraycopy(abyte3, 0, abyte1, k, abyte1.length - k);
        abyte0 = new byte[b];
        calculateMac(abyte1, 0, abyte1.length, abyte0);
        if (!Arrays.b(h, abyte0))
        {
            throw new InvalidCipherTextException("mac check in CCM failed");
        } else
        {
            return abyte1;
        }
        if (g == null)
        {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        SICBlockCipher sicblockcipher = new SICBlockCipher(a);
        byte abyte1[] = new byte[b];
        abyte1[0] = (byte)(15 - d.length - 1 & 7);
        System.arraycopy(d, 0, abyte1, 1, d.length);
        sicblockcipher.init(c, new ParametersWithIV(g, abyte1));
        if (c)
        {
            abyte1 = new byte[f + k];
            calculateMac(abyte0, j, k, h);
            sicblockcipher.processBlock(h, 0, h, 0);
            int l = 0;
            for (; j < k - b; j += b)
            {
                sicblockcipher.processBlock(abyte0, j, abyte1, l);
                l += b;
            }

            byte abyte2[] = new byte[b];
            System.arraycopy(abyte0, j, abyte2, 0, k - j);
            sicblockcipher.processBlock(abyte2, 0, abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, l, k - j);
            j = l + (k - j);
            System.arraycopy(h, 0, abyte1, j, abyte1.length - j);
            return abyte1;
        }
        abyte1 = new byte[k - f];
        System.arraycopy(abyte0, (j + k) - f, h, 0, f);
        sicblockcipher.processBlock(h, 0, h, 0);
        for (k = f; k != h.length; k++)
        {
            h[k] = 0;
        }

        k = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void reset()
    {
        a.reset();
        i.reset();
    }
}
