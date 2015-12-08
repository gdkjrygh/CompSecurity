// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
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

public class IESEngine
{

    BasicAgreement a;
    DerivationFunction b;
    Mac c;
    BufferedBlockCipher d;
    byte e[];
    boolean f;
    CipherParameters g;
    CipherParameters h;
    IESParameters i;

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac)
    {
        a = basicagreement;
        b = derivationfunction;
        c = mac;
        e = new byte[mac.getMacSize()];
        d = null;
    }

    public IESEngine(BasicAgreement basicagreement, DerivationFunction derivationfunction, Mac mac, BufferedBlockCipher bufferedblockcipher)
    {
        a = basicagreement;
        b = derivationfunction;
        c = mac;
        e = new byte[mac.getMacSize()];
        d = bufferedblockcipher;
    }

    private byte[] decryptBlock(byte abyte0[], int j, int k, byte abyte1[])
    {
        boolean flag = false;
        abyte1 = new KDFParameters(abyte1, i.getDerivationV());
        int i1 = i.getMacKeySize();
        b.init(abyte1);
        int l = k - c.getMacSize();
        byte abyte2[];
        byte abyte3[];
        if (d == null)
        {
            abyte1 = generateKdfBytes(abyte1, i1 / 8 + l);
            abyte2 = new byte[l];
            for (k = 0; k != l; k++)
            {
                abyte2[k] = (byte)(abyte0[j + k] ^ abyte1[k]);
            }

            abyte1 = new KeyParameter(abyte1, l, i1 / 8);
        } else
        {
            k = ((IESWithCipherParameters)i).getCipherKeySize();
            abyte1 = generateKdfBytes(abyte1, k / 8 + i1 / 8);
            d.init(false, new KeyParameter(abyte1, 0, k / 8));
            byte abyte4[] = new byte[d.getOutputSize(l)];
            int j1 = d.processBytes(abyte0, j, l, abyte4, 0);
            j1 += d.doFinal(abyte4, j1);
            abyte2 = new byte[j1];
            System.arraycopy(abyte4, 0, abyte2, 0, j1);
            abyte1 = new KeyParameter(abyte1, k / 8, i1 / 8);
        }
        abyte3 = i.getEncodingV();
        c.init(abyte1);
        c.update(abyte0, j, l);
        c.update(abyte3, 0, abyte3.length);
        c.doFinal(e, 0);
        for (k = ((flag) ? 1 : 0); k < e.length; k++)
        {
            if (e[k] != abyte0[j + l + k])
            {
                throw new InvalidCipherTextException("Mac codes failed to equal.");
            }
        }

        return abyte2;
    }

    private byte[] encryptBlock(byte abyte0[], int j, int k, byte abyte1[])
    {
        abyte1 = new KDFParameters(abyte1, i.getDerivationV());
        int j1 = i.getMacKeySize();
        byte abyte3[];
        if (d == null)
        {
            abyte1 = generateKdfBytes(abyte1, j1 / 8 + k);
            byte abyte2[] = new byte[c.getMacSize() + k];
            for (int l = 0; l != k; l++)
            {
                abyte2[l] = (byte)(abyte0[j + l] ^ abyte1[l]);
            }

            abyte1 = new KeyParameter(abyte1, k, j1 / 8);
            abyte0 = abyte2;
        } else
        {
            int i1 = ((IESWithCipherParameters)i).getCipherKeySize();
            abyte1 = generateKdfBytes(abyte1, i1 / 8 + j1 / 8);
            d.init(true, new KeyParameter(abyte1, 0, i1 / 8));
            byte abyte4[] = new byte[d.getOutputSize(k)];
            j = d.processBytes(abyte0, j, k, abyte4, 0);
            k = j + d.doFinal(abyte4, j);
            abyte0 = new byte[c.getMacSize() + k];
            System.arraycopy(abyte4, 0, abyte0, 0, k);
            abyte1 = new KeyParameter(abyte1, i1 / 8, j1 / 8);
        }
        abyte3 = i.getEncodingV();
        c.init(abyte1);
        c.update(abyte0, 0, k);
        c.update(abyte3, 0, abyte3.length);
        c.doFinal(abyte0, k);
        return abyte0;
    }

    private byte[] generateKdfBytes(KDFParameters kdfparameters, int j)
    {
        byte abyte0[] = new byte[j];
        b.init(kdfparameters);
        b.generateBytes(abyte0, 0, j);
        return abyte0;
    }

    public void init(boolean flag, CipherParameters cipherparameters, CipherParameters cipherparameters1, CipherParameters cipherparameters2)
    {
        f = flag;
        g = cipherparameters;
        h = cipherparameters1;
        i = (IESParameters)cipherparameters2;
    }

    public byte[] processBlock(byte abyte0[], int j, int k)
    {
        a.init(g);
        BigInteger biginteger = a.calculateAgreement(h);
        if (f)
        {
            return encryptBlock(abyte0, j, k, biginteger.toByteArray());
        } else
        {
            return decryptBlock(abyte0, j, k, biginteger.toByteArray());
        }
    }
}
