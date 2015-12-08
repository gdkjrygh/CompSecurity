// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
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

    private static final byte cTAG = 2;
    private static final byte hTAG = 1;
    private static final byte nTAG = 0;
    private byte associatedTextMac[];
    private int blockSize;
    private byte bufBlock[];
    private int bufOff;
    private SICBlockCipher cipher;
    private boolean forEncryption;
    private Mac mac;
    private byte macBlock[];
    private int macSize;
    private byte nonceMac[];

    public EAXBlockCipher(BlockCipher blockcipher)
    {
        blockSize = blockcipher.getBlockSize();
        mac = new CMac(blockcipher);
        macBlock = new byte[blockSize];
        bufBlock = new byte[blockSize * 2];
        associatedTextMac = new byte[mac.getMacSize()];
        nonceMac = new byte[mac.getMacSize()];
        cipher = new SICBlockCipher(blockcipher);
    }

    private void calculateMac()
    {
        int i = 0;
        byte abyte0[] = new byte[blockSize];
        mac.doFinal(abyte0, 0);
        for (; i < macBlock.length; i++)
        {
            macBlock[i] = (byte)(nonceMac[i] ^ associatedTextMac[i] ^ abyte0[i]);
        }

    }

    private int process(byte byte0, byte abyte0[], int i)
    {
        byte abyte1[] = bufBlock;
        int j = bufOff;
        bufOff = j + 1;
        abyte1[j] = byte0;
        if (bufOff == bufBlock.length)
        {
            if (forEncryption)
            {
                int k = cipher.processBlock(bufBlock, 0, abyte0, i);
                mac.update(abyte0, i, blockSize);
                i = k;
            } else
            {
                mac.update(bufBlock, 0, blockSize);
                i = cipher.processBlock(bufBlock, 0, abyte0, i);
            }
            bufOff = blockSize;
            System.arraycopy(bufBlock, blockSize, bufBlock, 0, blockSize);
            return i;
        } else
        {
            return 0;
        }
    }

    private void reset(boolean flag)
    {
        cipher.reset();
        mac.reset();
        bufOff = 0;
        Arrays.fill(bufBlock, (byte)0);
        if (flag)
        {
            Arrays.fill(macBlock, (byte)0);
        }
        byte abyte0[] = new byte[blockSize];
        abyte0[blockSize - 1] = 2;
        mac.update(abyte0, 0, blockSize);
    }

    private boolean verifyMac(byte abyte0[], int i)
    {
        for (int j = 0; j < macSize; j++)
        {
            if (macBlock[j] != abyte0[i + j])
            {
                return false;
            }
        }

        return true;
    }

    public int doFinal(byte abyte0[], int i)
        throws IllegalStateException, InvalidCipherTextException
    {
        int j = bufOff;
        byte abyte1[] = new byte[bufBlock.length];
        bufOff = 0;
        if (forEncryption)
        {
            cipher.processBlock(bufBlock, 0, abyte1, 0);
            cipher.processBlock(bufBlock, blockSize, abyte1, blockSize);
            System.arraycopy(abyte1, 0, abyte0, i, j);
            mac.update(abyte1, 0, j);
            calculateMac();
            System.arraycopy(macBlock, 0, abyte0, i + j, macSize);
            reset(false);
            return j + macSize;
        }
        if (j > macSize)
        {
            mac.update(bufBlock, 0, j - macSize);
            cipher.processBlock(bufBlock, 0, abyte1, 0);
            cipher.processBlock(bufBlock, blockSize, abyte1, blockSize);
            System.arraycopy(abyte1, 0, abyte0, i, j - macSize);
        }
        calculateMac();
        if (!verifyMac(bufBlock, j - macSize))
        {
            throw new InvalidCipherTextException("mac check in EAX failed");
        } else
        {
            reset(false);
            return j - macSize;
        }
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getUnderlyingCipher().getAlgorithmName()).append("/EAX").toString();
    }

    public int getBlockSize()
    {
        return cipher.getBlockSize();
    }

    public byte[] getMac()
    {
        byte abyte0[] = new byte[macSize];
        System.arraycopy(macBlock, 0, abyte0, 0, macSize);
        return abyte0;
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
        return cipher.getUnderlyingCipher();
    }

    public int getUpdateOutputSize(int i)
    {
        return ((bufOff + i) / blockSize) * blockSize;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        forEncryption = flag;
        byte abyte0[];
        byte abyte1[];
        byte abyte2[];
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            abyte1 = cipherparameters.getNonce();
            abyte0 = cipherparameters.getAssociatedText();
            macSize = cipherparameters.getMacSize() / 8;
            cipherparameters = cipherparameters.getKey();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            abyte1 = cipherparameters.getIV();
            abyte0 = new byte[0];
            macSize = mac.getMacSize() / 2;
            cipherparameters = cipherparameters.getParameters();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to EAX");
        }
        abyte2 = new byte[blockSize];
        mac.init(cipherparameters);
        abyte2[blockSize - 1] = 1;
        mac.update(abyte2, 0, blockSize);
        mac.update(abyte0, 0, abyte0.length);
        mac.doFinal(associatedTextMac, 0);
        abyte2[blockSize - 1] = 0;
        mac.update(abyte2, 0, blockSize);
        mac.update(abyte1, 0, abyte1.length);
        mac.doFinal(nonceMac, 0);
        abyte2[blockSize - 1] = 2;
        mac.update(abyte2, 0, blockSize);
        cipher.init(true, new ParametersWithIV(cipherparameters, nonceMac));
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
        int i1 = 0;
        for (; l != j; l++)
        {
            i1 += process(abyte0[i + l], abyte1, k + i1);
        }

        return i1;
    }

    public void reset()
    {
        reset(true);
    }
}
