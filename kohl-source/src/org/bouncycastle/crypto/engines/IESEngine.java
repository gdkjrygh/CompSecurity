// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BasicAgreement;
import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DerivationFunction;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.IESParameters;
import org.bouncycastle.crypto.params.IESWithCipherParameters;
import org.bouncycastle.crypto.params.KDFParameters;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.util.BigIntegers;

public class IESEngine
{

    BasicAgreement agree;
    BufferedBlockCipher cipher;
    boolean forEncryption;
    DerivationFunction kdf;
    Mac mac;
    byte macBuf[];
    IESParameters param;
    CipherParameters privParam;
    CipherParameters pubParam;

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac1)
    {
        agree = basicagreement;
        kdf = derivationfunction;
        mac = mac1;
        macBuf = new byte[mac1.getMacSize()];
        cipher = null;
    }

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac1, BufferedBlockCipher bufferedblockcipher)
    {
        agree = basicagreement;
        kdf = derivationfunction;
        mac = mac1;
        macBuf = new byte[mac1.getMacSize()];
        cipher = bufferedblockcipher;
    }

    private byte[] decryptBlock(byte abyte0[], int i, int j, byte abyte1[])
        throws InvalidCipherTextException
    {
        boolean flag = false;
        abyte1 = new KDFParameters(abyte1, param.getDerivationV());
        int l = param.getMacKeySize();
        kdf.init(abyte1);
        int k = j - mac.getMacSize();
        byte abyte2[];
        byte abyte3[];
        if (cipher == null)
        {
            abyte1 = generateKdfBytes(abyte1, l / 8 + k);
            abyte2 = new byte[k];
            for (j = 0; j != k; j++)
            {
                abyte2[j] = (byte)(abyte0[i + j] ^ abyte1[j]);
            }

            abyte1 = new KeyParameter(abyte1, k, l / 8);
        } else
        {
            j = ((IESWithCipherParameters)param).getCipherKeySize();
            abyte1 = generateKdfBytes(abyte1, j / 8 + l / 8);
            cipher.init(false, new KeyParameter(abyte1, 0, j / 8));
            byte abyte4[] = new byte[cipher.getOutputSize(k)];
            int i1 = cipher.processBytes(abyte0, i, k, abyte4, 0);
            i1 += cipher.doFinal(abyte4, i1);
            abyte2 = new byte[i1];
            System.arraycopy(abyte4, 0, abyte2, 0, i1);
            abyte1 = new KeyParameter(abyte1, j / 8, l / 8);
        }
        abyte3 = param.getEncodingV();
        mac.init(abyte1);
        mac.update(abyte0, i, k);
        mac.update(abyte3, 0, abyte3.length);
        mac.doFinal(macBuf, 0);
        for (j = ((flag) ? 1 : 0); j < macBuf.length; j++)
        {
            if (macBuf[j] != abyte0[i + k + j])
            {
                throw new InvalidCipherTextException("Mac codes failed to equal.");
            }
        }

        return abyte2;
    }

    private byte[] encryptBlock(byte abyte0[], int i, int j, byte abyte1[])
        throws InvalidCipherTextException
    {
        abyte1 = new KDFParameters(abyte1, param.getDerivationV());
        int i1 = param.getMacKeySize();
        byte abyte3[];
        if (cipher == null)
        {
            byte abyte2[] = generateKdfBytes(abyte1, i1 / 8 + j);
            abyte1 = new byte[mac.getMacSize() + j];
            for (int k = 0; k != j; k++)
            {
                abyte1[k] = (byte)(abyte0[i + k] ^ abyte2[k]);
            }

            abyte0 = new KeyParameter(abyte2, j, i1 / 8);
        } else
        {
            int l = ((IESWithCipherParameters)param).getCipherKeySize();
            byte abyte4[] = generateKdfBytes(abyte1, l / 8 + i1 / 8);
            cipher.init(true, new KeyParameter(abyte4, 0, l / 8));
            byte abyte5[] = new byte[cipher.getOutputSize(j)];
            i = cipher.processBytes(abyte0, i, j, abyte5, 0);
            j = i + cipher.doFinal(abyte5, i);
            abyte1 = new byte[mac.getMacSize() + j];
            System.arraycopy(abyte5, 0, abyte1, 0, j);
            abyte0 = new KeyParameter(abyte4, l / 8, i1 / 8);
        }
        abyte3 = param.getEncodingV();
        mac.init(abyte0);
        mac.update(abyte1, 0, j);
        mac.update(abyte3, 0, abyte3.length);
        mac.doFinal(abyte1, j);
        return abyte1;
    }

    private byte[] generateKdfBytes(KDFParameters kdfparameters, int i)
    {
        byte abyte0[] = new byte[i];
        kdf.init(kdfparameters);
        kdf.generateBytes(abyte0, 0, abyte0.length);
        return abyte0;
    }

    public void init(boolean flag, CipherParameters cipherparameters, CipherParameters cipherparameters1, CipherParameters cipherparameters2)
    {
        forEncryption = flag;
        privParam = cipherparameters;
        pubParam = cipherparameters1;
        param = (IESParameters)cipherparameters2;
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        agree.init(privParam);
        byte abyte1[] = BigIntegers.asUnsignedByteArray(agree.calculateAgreement(pubParam));
        if (forEncryption)
        {
            return encryptBlock(abyte0, i, j, abyte1);
        } else
        {
            return decryptBlock(abyte0, i, j, abyte1);
        }
    }
}
