// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.modes;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
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

    private byte associatedText[];
    private int blockSize;
    private BlockCipher cipher;
    private ByteArrayOutputStream data;
    private boolean forEncryption;
    private CipherParameters keyParam;
    private byte macBlock[];
    private int macSize;
    private byte nonce[];

    public CCMBlockCipher(BlockCipher blockcipher)
    {
        data = new ByteArrayOutputStream();
        cipher = blockcipher;
        blockSize = blockcipher.getBlockSize();
        macBlock = new byte[blockSize];
        if (blockSize != 16)
        {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        } else
        {
            return;
        }
    }

    private int calculateMac(byte abyte0[], int i, int j, byte abyte1[])
    {
        int k = 1;
        CBCBlockCipherMac cbcblockciphermac = new CBCBlockCipherMac(cipher, macSize * 8);
        cbcblockciphermac.init(keyParam);
        byte abyte2[] = new byte[16];
        if (hasAssociatedText())
        {
            abyte2[0] = (byte)(abyte2[0] | 0x40);
        }
        abyte2[0] = (byte)(abyte2[0] | ((cbcblockciphermac.getMacSize() - 2) / 2 & 7) << 3);
        abyte2[0] = (byte)(abyte2[0] | 15 - nonce.length - 1 & 7);
        System.arraycopy(nonce, 0, abyte2, 1, nonce.length);
        for (int i1 = j; i1 > 0;)
        {
            abyte2[abyte2.length - k] = (byte)(i1 & 0xff);
            i1 >>>= 8;
            k++;
        }

        cbcblockciphermac.update(abyte2, 0, abyte2.length);
        if (hasAssociatedText())
        {
            int l;
            int j1;
            if (associatedText.length < 65280)
            {
                cbcblockciphermac.update((byte)(associatedText.length >> 8));
                cbcblockciphermac.update((byte)associatedText.length);
                l = 2;
            } else
            {
                cbcblockciphermac.update((byte)-1);
                cbcblockciphermac.update((byte)-2);
                cbcblockciphermac.update((byte)(associatedText.length >> 24));
                cbcblockciphermac.update((byte)(associatedText.length >> 16));
                cbcblockciphermac.update((byte)(associatedText.length >> 8));
                cbcblockciphermac.update((byte)associatedText.length);
                l = 6;
            }
            cbcblockciphermac.update(associatedText, 0, associatedText.length);
            j1 = (l + associatedText.length) % 16;
            if (j1 != 0)
            {
                for (l = 0; l != 16 - j1; l++)
                {
                    cbcblockciphermac.update((byte)0);
                }

            }
        }
        cbcblockciphermac.update(abyte0, i, j);
        return cbcblockciphermac.doFinal(abyte1, 0);
    }

    private boolean hasAssociatedText()
    {
        return associatedText != null && associatedText.length != 0;
    }

    public int doFinal(byte abyte0[], int i)
        throws IllegalStateException, InvalidCipherTextException
    {
        byte abyte1[] = data.toByteArray();
        abyte1 = processPacket(abyte1, 0, abyte1.length);
        System.arraycopy(abyte1, 0, abyte0, i, abyte1.length);
        reset();
        return abyte1.length;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(cipher.getAlgorithmName()).append("/CCM").toString();
    }

    public byte[] getMac()
    {
        byte abyte0[] = new byte[macSize];
        System.arraycopy(macBlock, 0, abyte0, 0, abyte0.length);
        return abyte0;
    }

    public int getOutputSize(int i)
    {
        if (forEncryption)
        {
            return data.size() + i + macSize;
        } else
        {
            return (data.size() + i) - macSize;
        }
    }

    public BlockCipher getUnderlyingCipher()
    {
        return cipher;
    }

    public int getUpdateOutputSize(int i)
    {
        return 0;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException
    {
        forEncryption = flag;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            nonce = cipherparameters.getNonce();
            associatedText = cipherparameters.getAssociatedText();
            macSize = cipherparameters.getMacSize() / 8;
            keyParam = cipherparameters.getKey();
            return;
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            nonce = cipherparameters.getIV();
            associatedText = null;
            macSize = macBlock.length / 2;
            keyParam = cipherparameters.getParameters();
            return;
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to CCM");
        }
    }

    public int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException, IllegalStateException
    {
        data.write(byte0);
        return 0;
    }

    public int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException, IllegalStateException
    {
        data.write(abyte0, i, j);
        return 0;
    }

    public byte[] processPacket(byte abyte0[], int i, int j)
        throws IllegalStateException, InvalidCipherTextException
    {
_L2:
        while (j < abyte1.length - blockSize) 
        {
            sicblockcipher.processBlock(abyte0, i, abyte1, j);
            j += blockSize;
            i += blockSize;
        }
        byte abyte3[] = new byte[blockSize];
        System.arraycopy(abyte0, i, abyte3, 0, abyte1.length - j);
        sicblockcipher.processBlock(abyte3, 0, abyte3, 0);
        System.arraycopy(abyte3, 0, abyte1, j, abyte1.length - j);
        abyte0 = new byte[blockSize];
        calculateMac(abyte1, 0, abyte1.length, abyte0);
        if (!Arrays.constantTimeAreEqual(macBlock, abyte0))
        {
            throw new InvalidCipherTextException("mac check in CCM failed");
        } else
        {
            return abyte1;
        }
        if (keyParam == null)
        {
            throw new IllegalStateException("CCM cipher unitialized.");
        }
        SICBlockCipher sicblockcipher = new SICBlockCipher(cipher);
        byte abyte1[] = new byte[blockSize];
        abyte1[0] = (byte)(15 - nonce.length - 1 & 7);
        System.arraycopy(nonce, 0, abyte1, 1, nonce.length);
        sicblockcipher.init(forEncryption, new ParametersWithIV(keyParam, abyte1));
        if (forEncryption)
        {
            abyte1 = new byte[macSize + j];
            calculateMac(abyte0, i, j, macBlock);
            sicblockcipher.processBlock(macBlock, 0, macBlock, 0);
            int k = 0;
            for (; i < j - blockSize; i += blockSize)
            {
                sicblockcipher.processBlock(abyte0, i, abyte1, k);
                k += blockSize;
            }

            byte abyte2[] = new byte[blockSize];
            System.arraycopy(abyte0, i, abyte2, 0, j - i);
            sicblockcipher.processBlock(abyte2, 0, abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, k, j - i);
            i = k + (j - i);
            System.arraycopy(macBlock, 0, abyte1, i, abyte1.length - i);
            return abyte1;
        }
        abyte1 = new byte[j - macSize];
        System.arraycopy(abyte0, (i + j) - macSize, macBlock, 0, macSize);
        sicblockcipher.processBlock(macBlock, 0, macBlock, 0);
        for (j = macSize; j != macBlock.length; j++)
        {
            macBlock[j] = 0;
        }

        j = 0;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void reset()
    {
        cipher.reset();
        data.reset();
    }
}
