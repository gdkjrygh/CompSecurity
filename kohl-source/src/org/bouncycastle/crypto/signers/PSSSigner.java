// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Signer;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class PSSSigner
    implements Signer
{

    public static final byte TRAILER_IMPLICIT = -68;
    private byte block[];
    private AsymmetricBlockCipher cipher;
    private Digest contentDigest;
    private int emBits;
    private int hLen;
    private byte mDash[];
    private Digest mgfDigest;
    private int mgfhLen;
    private SecureRandom random;
    private int sLen;
    private byte salt[];
    private byte trailer;

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, int i)
    {
        this(asymmetricblockcipher, digest, i, (byte)-68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, int i, byte byte0)
    {
        this(asymmetricblockcipher, digest, digest, i, byte0);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, int i)
    {
        this(asymmetricblockcipher, digest, digest1, i, (byte)-68);
    }

    public PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, int i, byte byte0)
    {
        cipher = asymmetricblockcipher;
        contentDigest = digest;
        mgfDigest = digest1;
        hLen = digest.getDigestSize();
        mgfhLen = digest1.getDigestSize();
        sLen = i;
        salt = new byte[i];
        mDash = new byte[i + 8 + hLen];
        trailer = byte0;
    }

    private void ItoOSP(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    private void clearBlock(byte abyte0[])
    {
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = 0;
        }

    }

    private byte[] maskGeneratorFunction1(byte abyte0[], int i, int j, int k)
    {
        byte abyte1[] = new byte[k];
        byte abyte2[] = new byte[mgfhLen];
        byte abyte3[] = new byte[4];
        mgfDigest.reset();
        int l;
        for (l = 0; l < k / mgfhLen; l++)
        {
            ItoOSP(l, abyte3);
            mgfDigest.update(abyte0, i, j);
            mgfDigest.update(abyte3, 0, abyte3.length);
            mgfDigest.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, mgfhLen * l, mgfhLen);
        }

        if (mgfhLen * l < k)
        {
            ItoOSP(l, abyte3);
            mgfDigest.update(abyte0, i, j);
            mgfDigest.update(abyte3, 0, abyte3.length);
            mgfDigest.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, mgfhLen * l, abyte1.length - l * mgfhLen);
        }
        return abyte1;
    }

    public byte[] generateSignature()
        throws CryptoException, DataLengthException
    {
        contentDigest.doFinal(mDash, mDash.length - hLen - sLen);
        if (sLen != 0)
        {
            random.nextBytes(salt);
            System.arraycopy(salt, 0, mDash, mDash.length - sLen, sLen);
        }
        byte abyte0[] = new byte[hLen];
        contentDigest.update(mDash, 0, mDash.length);
        contentDigest.doFinal(abyte0, 0);
        block[block.length - sLen - 1 - hLen - 1] = 1;
        System.arraycopy(salt, 0, block, block.length - sLen - hLen - 1, sLen);
        byte abyte1[] = maskGeneratorFunction1(abyte0, 0, abyte0.length, block.length - hLen - 1);
        for (int i = 0; i != abyte1.length; i++)
        {
            byte abyte2[] = block;
            abyte2[i] = (byte)(abyte2[i] ^ abyte1[i]);
        }

        abyte1 = block;
        abyte1[0] = (byte)(abyte1[0] & 255 >> block.length * 8 - emBits);
        System.arraycopy(abyte0, 0, block, block.length - hLen - 1, hLen);
        block[block.length - 1] = trailer;
        abyte0 = cipher.processBlock(block, 0, block.length);
        clearBlock(block);
        return abyte0;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            ParametersWithRandom parameterswithrandom = (ParametersWithRandom)cipherparameters;
            cipherparameters = parameterswithrandom.getParameters();
            random = parameterswithrandom.getRandom();
        } else
        if (flag)
        {
            random = new SecureRandom();
        }
        cipher.init(flag, cipherparameters);
        if (cipherparameters instanceof RSABlindingParameters)
        {
            cipherparameters = ((RSABlindingParameters)cipherparameters).getPublicKey();
        } else
        {
            cipherparameters = (RSAKeyParameters)cipherparameters;
        }
        emBits = cipherparameters.getModulus().bitLength() - 1;
        if (emBits < hLen * 8 + sLen * 8 + 9)
        {
            throw new IllegalArgumentException("key too small for specified hash and salt lengths");
        } else
        {
            block = new byte[(emBits + 7) / 8];
            reset();
            return;
        }
    }

    public void reset()
    {
        contentDigest.reset();
    }

    public void update(byte byte0)
    {
        contentDigest.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        contentDigest.update(abyte0, i, j);
    }

    public boolean verifySignature(byte abyte0[])
    {
        contentDigest.doFinal(mDash, mDash.length - hLen - sLen);
        int l;
        try
        {
            abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
            System.arraycopy(abyte0, 0, block, block.length - abyte0.length, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (block[block.length - 1] != trailer)
        {
            clearBlock(block);
            return false;
        }
        abyte0 = maskGeneratorFunction1(block, block.length - hLen - 1, hLen, block.length - hLen - 1);
        for (int i = 0; i != abyte0.length; i++)
        {
            byte abyte1[] = block;
            abyte1[i] = (byte)(abyte1[i] ^ abyte0[i]);
        }

        abyte0 = block;
        abyte0[0] = (byte)(abyte0[0] & 255 >> block.length * 8 - emBits);
        for (int j = 0; j != block.length - hLen - sLen - 2; j++)
        {
            if (block[j] != 0)
            {
                clearBlock(block);
                return false;
            }
        }

        if (block[block.length - hLen - sLen - 2] != 1)
        {
            clearBlock(block);
            return false;
        }
        System.arraycopy(block, block.length - sLen - hLen - 1, mDash, mDash.length - sLen, sLen);
        contentDigest.update(mDash, 0, mDash.length);
        contentDigest.doFinal(mDash, mDash.length - hLen);
        l = block.length - hLen - 1;
        for (int k = mDash.length - hLen; k != mDash.length; k++)
        {
            if ((block[l] ^ mDash[k]) != 0)
            {
                clearBlock(mDash);
                clearBlock(block);
                return false;
            }
            l++;
        }

        clearBlock(mDash);
        clearBlock(block);
        return true;
    }
}
