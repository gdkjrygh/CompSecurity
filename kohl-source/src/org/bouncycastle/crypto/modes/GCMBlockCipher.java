// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
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

    private static final int BLOCK_SIZE = 16;
    private static final byte ZEROES[] = new byte[16];
    private byte A[];
    private byte H[];
    private byte J0[];
    private byte S[];
    private byte bufBlock[];
    private int bufOff;
    private BlockCipher cipher;
    private byte counter[];
    private boolean forEncryption;
    private byte initS[];
    private byte macBlock[];
    private int macSize;
    private GCMMultiplier multiplier;
    private byte nonce[];
    private long totalLength;

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
        cipher = blockcipher;
        multiplier = ((GCMMultiplier) (obj));
    }

    private void gCTRBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = 15;
        byte abyte2[];
label0:
        do
        {
label1:
            {
                if (k >= 12)
                {
                    byte byte0 = (byte)(counter[k] + 1 & 0xff);
                    counter[k] = byte0;
                    if (byte0 == 0)
                    {
                        break label1;
                    }
                }
                byte abyte3[] = new byte[16];
                cipher.processBlock(counter, 0, abyte3, 0);
                if (forEncryption)
                {
                    System.arraycopy(ZEROES, i, abyte3, i, 16 - i);
                    abyte2 = abyte3;
                } else
                {
                    abyte2 = abyte0;
                }
                for (k = i - 1; k >= 0; k--)
                {
                    abyte3[k] = (byte)(abyte3[k] ^ abyte0[k]);
                    abyte1[j + k] = abyte3[k];
                }

                break label0;
            }
            k--;
        } while (true);
        xor(S, abyte2);
        multiplier.multiplyH(S);
        totalLength = totalLength + (long)i;
    }

    private byte[] gHASH(byte abyte0[])
    {
        byte abyte1[] = new byte[16];
        for (int i = 0; i < abyte0.length; i += 16)
        {
            byte abyte2[] = new byte[16];
            System.arraycopy(abyte0, i, abyte2, 0, Math.min(abyte0.length - i, 16));
            xor(abyte1, abyte2);
            multiplier.multiplyH(abyte1);
        }

        return abyte1;
    }

    private static void packLength(long l, byte abyte0[], int i)
    {
        Pack.intToBigEndian((int)(l >>> 32), abyte0, i);
        Pack.intToBigEndian((int)l, abyte0, i + 4);
    }

    private int process(byte byte0, byte abyte0[], int i)
        throws DataLengthException
    {
        byte abyte1[] = bufBlock;
        int j = bufOff;
        bufOff = j + 1;
        abyte1[j] = byte0;
        if (bufOff == bufBlock.length)
        {
            gCTRBlock(bufBlock, 16, abyte0, i);
            if (!forEncryption)
            {
                System.arraycopy(bufBlock, 16, bufBlock, 0, macSize);
            }
            bufOff = bufBlock.length - 16;
            return 16;
        } else
        {
            return 0;
        }
    }

    private void reset(boolean flag)
    {
        S = Arrays.clone(initS);
        counter = Arrays.clone(J0);
        bufOff = 0;
        totalLength = 0L;
        if (bufBlock != null)
        {
            Arrays.fill(bufBlock, (byte)0);
        }
        if (flag)
        {
            macBlock = null;
        }
        cipher.reset();
    }

    private static void xor(byte abyte0[], byte abyte1[])
    {
        for (int i = 15; i >= 0; i--)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte1[i]);
        }

    }

    public int doFinal(byte abyte0[], int i)
        throws IllegalStateException, InvalidCipherTextException
    {
        int k = bufOff;
        int j = k;
        if (!forEncryption)
        {
            if (k < macSize)
            {
                throw new InvalidCipherTextException("data too short");
            }
            j = k - macSize;
        }
        if (j > 0)
        {
            byte abyte1[] = new byte[16];
            System.arraycopy(bufBlock, 0, abyte1, 0, j);
            gCTRBlock(abyte1, j, abyte0, i);
        }
        byte abyte2[] = new byte[16];
        packLength((long)A.length * 8L, abyte2, 0);
        packLength(totalLength * 8L, abyte2, 8);
        xor(S, abyte2);
        multiplier.multiplyH(S);
        abyte2 = new byte[16];
        cipher.processBlock(J0, 0, abyte2, 0);
        xor(abyte2, S);
        macBlock = new byte[macSize];
        System.arraycopy(abyte2, 0, macBlock, 0, macSize);
        if (forEncryption)
        {
            System.arraycopy(macBlock, 0, abyte0, bufOff + i, macSize);
            j += macSize;
        } else
        {
            abyte0 = new byte[macSize];
            System.arraycopy(bufBlock, j, abyte0, 0, macSize);
            if (!Arrays.constantTimeAreEqual(macBlock, abyte0))
            {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        reset(false);
        return j;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/GCM").toString();
    }

    public byte[] getMac()
    {
        return Arrays.clone(macBlock);
    }

    public int getOutputSize(int i)
    {
        if (forEncryption)
        {
            return bufOff + i + macSize;
        } else
        {
            return (bufOff + i) - macSize;
        }
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public int getUpdateOutputSize(int i)
    {
        return ((bufOff + i) / 16) * 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        forEncryption = flag;
        macBlock = null;
        int j;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            nonce = cipherparameters.getNonce();
            A = cipherparameters.getAssociatedText();
            int i = cipherparameters.getMacSize();
            if (i < 96 || i > 128 || i % 8 != 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid value for MAC size: ").append(i).toString());
            }
            macSize = i / 8;
            cipherparameters = cipherparameters.getKey();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            nonce = cipherparameters.getIV();
            A = null;
            macSize = 16;
            cipherparameters = (KeyParameter)cipherparameters.getParameters();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        if (flag)
        {
            j = 16;
        } else
        {
            j = macSize + 16;
        }
        bufBlock = new byte[j];
        if (nonce == null || nonce.length < 1)
        {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (A == null)
        {
            A = new byte[0];
        }
        if (cipherparameters != null)
        {
            cipher.init(true, cipherparameters);
        }
        H = new byte[16];
        cipher.processBlock(ZEROES, 0, H, 0);
        multiplier.init(H);
        initS = gHASH(A);
        if (nonce.length == 12)
        {
            J0 = new byte[16];
            System.arraycopy(nonce, 0, J0, 0, nonce.length);
            J0[15] = 1;
        } else
        {
            J0 = gHASH(nonce);
            cipherparameters = new byte[16];
            packLength((long)nonce.length * 8L, cipherparameters, 8);
            xor(J0, cipherparameters);
            multiplier.multiplyH(J0);
        }
        S = Arrays.clone(initS);
        counter = Arrays.clone(J0);
        bufOff = 0;
        totalLength = 0L;
    }

    public int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException
    {
        return process(byte0, abyte0, i);
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException
    {
        int l = 0;
        int i1;
        int j1;
        for (i1 = 0; l != j; i1 = j1)
        {
            byte abyte2[] = bufBlock;
            j1 = bufOff;
            bufOff = j1 + 1;
            abyte2[j1] = abyte0[i + l];
            j1 = i1;
            if (bufOff == bufBlock.length)
            {
                gCTRBlock(bufBlock, 16, abyte1, k + i1);
                if (!forEncryption)
                {
                    System.arraycopy(bufBlock, 16, bufBlock, 0, macSize);
                }
                bufOff = bufBlock.length - 16;
                j1 = i1 + 16;
            }
            l++;
        }

        return i1;
    }

    public void reset()
    {
        reset(true);
    }

}
