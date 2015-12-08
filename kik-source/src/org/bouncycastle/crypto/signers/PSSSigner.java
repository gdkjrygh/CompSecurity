// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class PSSSigner
    implements Signer
{

    private Digest a;
    private Digest b;
    private AsymmetricBlockCipher c;
    private SecureRandom d;
    private int e;
    private int f;
    private int g;
    private int h;
    private byte i[];
    private byte j[];
    private byte k[];
    private byte l;

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, int i1)
    {
        this(asymmetricblockcipher, digest, i1, (byte)-68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, int i1, byte byte0)
    {
        this(asymmetricblockcipher, digest, digest, i1, byte0);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, int i1)
    {
        this(asymmetricblockcipher, digest, digest1, i1, (byte)-68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, int i1, byte byte0)
    {
        c = asymmetricblockcipher;
        a = digest;
        b = digest1;
        e = digest.getDigestSize();
        f = digest1.getDigestSize();
        g = i1;
        i = new byte[i1];
        j = new byte[i1 + 8 + e];
        l = byte0;
    }

    private void ItoOSP(int i1, byte abyte0[])
    {
        abyte0[0] = (byte)(i1 >>> 24);
        abyte0[1] = (byte)(i1 >>> 16);
        abyte0[2] = (byte)(i1 >>> 8);
        abyte0[3] = (byte)(i1 >>> 0);
    }

    private void clearBlock(byte abyte0[])
    {
        for (int i1 = 0; i1 != abyte0.length; i1++)
        {
            abyte0[i1] = 0;
        }

    }

    private byte[] maskGeneratorFunction1(byte abyte0[], int i1, int j1, int k1)
    {
        byte abyte1[] = new byte[k1];
        byte abyte2[] = new byte[f];
        byte abyte3[] = new byte[4];
        b.reset();
        int l1;
        for (l1 = 0; l1 < k1 / f; l1++)
        {
            ItoOSP(l1, abyte3);
            b.update(abyte0, i1, j1);
            b.update(abyte3, 0, 4);
            b.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, f * l1, f);
        }

        if (f * l1 < k1)
        {
            ItoOSP(l1, abyte3);
            b.update(abyte0, i1, j1);
            b.update(abyte3, 0, 4);
            b.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, f * l1, k1 - l1 * f);
        }
        return abyte1;
    }

    public byte[] generateSignature()
    {
        a.doFinal(j, j.length - e - g);
        if (g != 0)
        {
            d.nextBytes(i);
            System.arraycopy(i, 0, j, j.length - g, g);
        }
        byte abyte0[] = new byte[e];
        a.update(j, 0, j.length);
        a.doFinal(abyte0, 0);
        k[k.length - g - 1 - e - 1] = 1;
        System.arraycopy(i, 0, k, k.length - g - e - 1, g);
        byte abyte1[] = maskGeneratorFunction1(abyte0, 0, abyte0.length, k.length - e - 1);
        for (int i1 = 0; i1 != abyte1.length; i1++)
        {
            byte abyte2[] = k;
            abyte2[i1] = (byte)(abyte2[i1] ^ abyte1[i1]);
        }

        abyte1 = k;
        abyte1[0] = (byte)(abyte1[0] & 255 >> k.length * 8 - h);
        System.arraycopy(abyte0, 0, k, k.length - e - 1, e);
        k[k.length - 1] = l;
        abyte0 = c.processBlock(k, 0, k.length);
        clearBlock(k);
        return abyte0;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            ParametersWithRandom parameterswithrandom = (ParametersWithRandom)cipherparameters;
            cipherparameters = parameterswithrandom.getParameters();
            d = parameterswithrandom.getRandom();
        } else
        if (flag)
        {
            d = new SecureRandom();
        }
        c.init(flag, cipherparameters);
        if (cipherparameters instanceof RSABlindingParameters)
        {
            cipherparameters = ((RSABlindingParameters)cipherparameters).getPublicKey();
        } else
        {
            cipherparameters = (RSAKeyParameters)cipherparameters;
        }
        h = cipherparameters.getModulus().bitLength() - 1;
        if (h < e * 8 + g * 8 + 9)
        {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        } else
        {
            k = new byte[(h + 7) / 8];
            reset();
            return;
        }
    }

    public void reset()
    {
        a.reset();
    }

    public void update(byte byte0)
    {
        a.update(byte0);
    }

    public void update(byte abyte0[], int i1, int j1)
    {
        a.update(abyte0, i1, j1);
    }

    public boolean verifySignature(byte abyte0[])
    {
        a.doFinal(j, j.length - e - g);
        int l1;
        try
        {
            abyte0 = c.processBlock(abyte0, 0, abyte0.length);
            System.arraycopy(abyte0, 0, k, k.length - abyte0.length, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (k[k.length - 1] != l)
        {
            clearBlock(k);
            return false;
        }
        abyte0 = maskGeneratorFunction1(k, k.length - e - 1, e, k.length - e - 1);
        for (int i1 = 0; i1 != abyte0.length; i1++)
        {
            byte abyte1[] = k;
            abyte1[i1] = (byte)(abyte1[i1] ^ abyte0[i1]);
        }

        abyte0 = k;
        abyte0[0] = (byte)(abyte0[0] & 255 >> k.length * 8 - h);
        for (int j1 = 0; j1 != k.length - e - g - 2; j1++)
        {
            if (k[j1] != 0)
            {
                clearBlock(k);
                return false;
            }
        }

        if (k[k.length - e - g - 2] != 1)
        {
            clearBlock(k);
            return false;
        }
        System.arraycopy(k, k.length - g - e - 1, j, j.length - g, g);
        a.update(j, 0, j.length);
        a.doFinal(j, j.length - e);
        l1 = k.length - e - 1;
        for (int k1 = j.length - e; k1 != j.length; k1++)
        {
            if ((k[l1] ^ j[k1]) != 0)
            {
                clearBlock(j);
                clearBlock(k);
                return false;
            }
            l1++;
        }

        clearBlock(j);
        clearBlock(k);
        return true;
    }
}
