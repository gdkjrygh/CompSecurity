// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.ParametersWithSalt;
import org.bouncycastle.crypto.params.RSAKeyParameters;

public class ISO9796d2PSSSigner
    implements SignerWithRecovery
{

    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    private byte block[];
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int hLen;
    private int keyBits;
    private byte mBuf[];
    private int messageLength;
    private SecureRandom random;
    private byte recoveredMessage[];
    private int saltLength;
    private byte standardSalt[];
    private int trailer;

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest1, int i)
    {
        this(asymmetricblockcipher, digest1, i, false);
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest1, int i, boolean flag)
    {
        cipher = asymmetricblockcipher;
        digest = digest1;
        hLen = digest1.getDigestSize();
        saltLength = i;
        if (flag)
        {
            trailer = 188;
            return;
        }
        if (digest1 instanceof SHA1Digest)
        {
            trailer = 13260;
            return;
        }
        if (digest1 instanceof RIPEMD160Digest)
        {
            trailer = 12748;
            return;
        }
        if (digest1 instanceof RIPEMD128Digest)
        {
            trailer = 13004;
            return;
        } else
        {
            throw new IllegalArgumentException("no valid trailer for digest");
        }
    }

    private void ItoOSP(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    private void LtoOSP(long l, byte abyte0[])
    {
        abyte0[0] = (byte)(int)(l >>> 56);
        abyte0[1] = (byte)(int)(l >>> 48);
        abyte0[2] = (byte)(int)(l >>> 40);
        abyte0[3] = (byte)(int)(l >>> 32);
        abyte0[4] = (byte)(int)(l >>> 24);
        abyte0[5] = (byte)(int)(l >>> 16);
        abyte0[6] = (byte)(int)(l >>> 8);
        abyte0[7] = (byte)(int)(l >>> 0);
    }

    private void clearBlock(byte abyte0[])
    {
        for (int i = 0; i != abyte0.length; i++)
        {
            abyte0[i] = 0;
        }

    }

    private boolean isSameAs(byte abyte0[], byte abyte1[])
    {
        boolean flag = true;
        if (messageLength != abyte1.length)
        {
            flag = false;
        }
        for (int i = 0; i != abyte1.length; i++)
        {
            if (abyte0[i] != abyte1[i])
            {
                flag = false;
            }
        }

        return flag;
    }

    private byte[] maskGeneratorFunction1(byte abyte0[], int i, int j, int k)
    {
        byte abyte1[] = new byte[k];
        byte abyte2[] = new byte[hLen];
        byte abyte3[] = new byte[4];
        digest.reset();
        int l;
        for (l = 0; l < k / hLen; l++)
        {
            ItoOSP(l, abyte3);
            digest.update(abyte0, i, j);
            digest.update(abyte3, 0, abyte3.length);
            digest.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, hLen * l, hLen);
        }

        if (hLen * l < k)
        {
            ItoOSP(l, abyte3);
            digest.update(abyte0, i, j);
            digest.update(abyte3, 0, abyte3.length);
            digest.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, hLen * l, abyte1.length - l * hLen);
        }
        return abyte1;
    }

    public byte[] generateSignature()
        throws CryptoException
    {
        byte abyte0[] = new byte[digest.getDigestSize()];
        digest.doFinal(abyte0, 0);
        byte abyte1[] = new byte[8];
        LtoOSP(messageLength * 8, abyte1);
        digest.update(abyte1, 0, abyte1.length);
        digest.update(mBuf, 0, messageLength);
        digest.update(abyte0, 0, abyte0.length);
        byte byte0;
        int i;
        if (standardSalt != null)
        {
            abyte0 = standardSalt;
        } else
        {
            abyte0 = new byte[saltLength];
            random.nextBytes(abyte0);
        }
        digest.update(abyte0, 0, abyte0.length);
        abyte1 = new byte[digest.getDigestSize()];
        digest.doFinal(abyte1, 0);
        byte0 = 2;
        if (trailer == 188)
        {
            byte0 = 1;
        }
        i = block.length - messageLength - abyte0.length - hLen - byte0 - 1;
        block[i] = 1;
        System.arraycopy(mBuf, 0, block, i + 1, messageLength);
        System.arraycopy(abyte0, 0, block, i + 1 + messageLength, abyte0.length);
        abyte0 = maskGeneratorFunction1(abyte1, 0, abyte1.length, block.length - hLen - byte0);
        for (int j = 0; j != abyte0.length; j++)
        {
            byte abyte2[] = block;
            abyte2[j] = (byte)(abyte2[j] ^ abyte0[j]);
        }

        System.arraycopy(abyte1, 0, block, block.length - hLen - byte0, hLen);
        if (trailer == 188)
        {
            block[block.length - 1] = -68;
        } else
        {
            block[block.length - 2] = (byte)(trailer >>> 8);
            block[block.length - 1] = (byte)trailer;
        }
        abyte0 = block;
        abyte0[0] = (byte)(abyte0[0] & 0x7f);
        abyte0 = cipher.processBlock(block, 0, block.length);
        clearBlock(mBuf);
        clearBlock(block);
        messageLength = 0;
        return abyte0;
    }

    public byte[] getRecoveredMessage()
    {
        return recoveredMessage;
    }

    public boolean hasFullMessage()
    {
        return fullMessage;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        int i = saltLength;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            ParametersWithRandom parameterswithrandom = (ParametersWithRandom)cipherparameters;
            cipherparameters = (RSAKeyParameters)parameterswithrandom.getParameters();
            if (flag)
            {
                random = parameterswithrandom.getRandom();
            }
        } else
        if (cipherparameters instanceof ParametersWithSalt)
        {
            ParametersWithSalt parameterswithsalt = (ParametersWithSalt)cipherparameters;
            cipherparameters = (RSAKeyParameters)parameterswithsalt.getParameters();
            standardSalt = parameterswithsalt.getSalt();
            i = standardSalt.length;
            if (standardSalt.length != saltLength)
            {
                throw new IllegalArgumentException("Fixed salt is of wrong length");
            }
        } else
        {
            cipherparameters = (RSAKeyParameters)cipherparameters;
            if (flag)
            {
                random = new SecureRandom();
            }
        }
        cipher.init(flag, cipherparameters);
        keyBits = cipherparameters.getModulus().bitLength();
        block = new byte[(keyBits + 7) / 8];
        if (trailer == 188)
        {
            mBuf = new byte[block.length - digest.getDigestSize() - i - 1 - 1];
        } else
        {
            mBuf = new byte[block.length - digest.getDigestSize() - i - 1 - 2];
        }
        reset();
    }

    public void reset()
    {
        digest.reset();
        messageLength = 0;
        if (mBuf != null)
        {
            clearBlock(mBuf);
        }
        if (recoveredMessage != null)
        {
            clearBlock(recoveredMessage);
            recoveredMessage = null;
        }
        fullMessage = false;
    }

    public void update(byte byte0)
    {
        if (messageLength < mBuf.length)
        {
            byte abyte0[] = mBuf;
            int i = messageLength;
            messageLength = i + 1;
            abyte0[i] = byte0;
            return;
        } else
        {
            digest.update(byte0);
            return;
        }
    }

    public void update(byte abyte0[], int i, int j)
    {
        for (; j > 0 && messageLength < mBuf.length; j--)
        {
            update(abyte0[i]);
            i++;
        }

        if (j > 0)
        {
            digest.update(abyte0, i, j);
        }
    }

    public void updateWithRecoveredMessage(byte abyte0[])
        throws InvalidCipherTextException
    {
        throw new RuntimeException("not implemented");
    }

    public boolean verifySignature(byte abyte0[])
    {
        byte abyte2[];
        byte abyte3[];
        int i;
        int k;
        boolean flag;
        int l;
        int i1;
        boolean flag1;
        try
        {
            abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (abyte0.length < (keyBits + 7) / 8)
        {
            byte abyte1[] = new byte[(keyBits + 7) / 8];
            System.arraycopy(abyte0, 0, abyte1, abyte1.length - abyte0.length, abyte0.length);
            clearBlock(abyte0);
            abyte0 = abyte1;
        }
        if ((abyte0[abyte0.length - 1] & 0xff ^ 0xbc) == 0)
        {
            i = 1;
        } else
        {
            switch ((abyte0[abyte0.length - 2] & 0xff) << 8 | abyte0[abyte0.length - 1] & 0xff)
            {
            default:
                throw new IllegalArgumentException("unrecognised hash in signature");

            case 12748: 
                if (!(digest instanceof RIPEMD160Digest))
                {
                    throw new IllegalStateException("signer should be initialised with RIPEMD160");
                }
                break;

            case 13260: 
                if (!(digest instanceof SHA1Digest))
                {
                    throw new IllegalStateException("signer should be initialised with SHA1");
                }
                break;

            case 13004: 
                if (!(digest instanceof RIPEMD128Digest))
                {
                    throw new IllegalStateException("signer should be initialised with RIPEMD128");
                }
                break;
            }
            i = 2;
        }
        abyte2 = new byte[hLen];
        digest.doFinal(abyte2, 0);
        abyte3 = maskGeneratorFunction1(abyte0, abyte0.length - hLen - i, hLen, abyte0.length - hLen - i);
        for (int j = 0; j != abyte3.length; j++)
        {
            abyte0[j] = (byte)(abyte0[j] ^ abyte3[j]);
        }

        abyte0[0] = (byte)(abyte0[0] & 0x7f);
        k = 0;
        do
        {
            if (k == abyte0.length || abyte0[k] == 1)
            {
                k++;
                if (k >= abyte0.length)
                {
                    clearBlock(abyte0);
                    return false;
                }
                break;
            }
            k++;
        } while (true);
        if (k > 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        fullMessage = flag1;
        recoveredMessage = new byte[abyte3.length - k - saltLength];
        System.arraycopy(abyte0, k, recoveredMessage, 0, recoveredMessage.length);
        abyte3 = new byte[8];
        LtoOSP(recoveredMessage.length * 8, abyte3);
        digest.update(abyte3, 0, abyte3.length);
        if (recoveredMessage.length != 0)
        {
            digest.update(recoveredMessage, 0, recoveredMessage.length);
        }
        digest.update(abyte2, 0, abyte2.length);
        digest.update(abyte0, recoveredMessage.length + k, saltLength);
        abyte2 = new byte[digest.getDigestSize()];
        digest.doFinal(abyte2, 0);
        l = abyte0.length;
        i1 = abyte2.length;
        k = 0;
        flag = true;
        for (; k != abyte2.length; k++)
        {
            if (abyte2[k] != abyte0[(l - i - i1) + k])
            {
                flag = false;
            }
        }

        clearBlock(abyte0);
        clearBlock(abyte2);
        if (!flag)
        {
            fullMessage = false;
            clearBlock(recoveredMessage);
            return false;
        }
        if (messageLength != 0)
        {
            if (!isSameAs(mBuf, recoveredMessage))
            {
                clearBlock(mBuf);
                return false;
            }
            messageLength = 0;
        }
        clearBlock(mBuf);
        return true;
    }
}
