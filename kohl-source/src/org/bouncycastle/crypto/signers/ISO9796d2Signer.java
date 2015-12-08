// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

public class ISO9796d2Signer
    implements SignerWithRecovery
{

    public static final int TRAILER_IMPLICIT = 188;
    public static final int TRAILER_RIPEMD128 = 13004;
    public static final int TRAILER_RIPEMD160 = 12748;
    public static final int TRAILER_SHA1 = 13260;
    public static final int TRAILER_SHA256 = 13516;
    public static final int TRAILER_SHA384 = 14028;
    public static final int TRAILER_SHA512 = 13772;
    public static final int TRAILER_WHIRLPOOL = 14284;
    private static Hashtable trailerMap;
    private byte block[];
    private AsymmetricBlockCipher cipher;
    private Digest digest;
    private boolean fullMessage;
    private int keyBits;
    private byte mBuf[];
    private int messageLength;
    private byte preBlock[];
    private byte preSig[];
    private byte recoveredMessage[];
    private int trailer;

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricblockcipher, Digest digest1)
    {
        this(asymmetricblockcipher, digest1, false);
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricblockcipher, Digest digest1, boolean flag)
    {
        cipher = asymmetricblockcipher;
        digest = digest1;
        if (flag)
        {
            trailer = 188;
            return;
        }
        asymmetricblockcipher = (Integer)trailerMap.get(digest1.getAlgorithmName());
        if (asymmetricblockcipher != null)
        {
            trailer = asymmetricblockcipher.intValue();
            return;
        } else
        {
            throw new IllegalArgumentException("no valid trailer for digest");
        }
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
        boolean flag2 = true;
        boolean flag = true;
        if (messageLength > mBuf.length)
        {
            if (mBuf.length > abyte1.length)
            {
                flag = false;
            }
            int i = 0;
            do
            {
                flag2 = flag;
                if (i == mBuf.length)
                {
                    break;
                }
                if (abyte0[i] != abyte1[i])
                {
                    flag = false;
                }
                i++;
            } while (true);
        } else
        {
            boolean flag1 = flag2;
            if (messageLength != abyte1.length)
            {
                flag1 = false;
            }
            int j = 0;
            do
            {
                flag2 = flag1;
                if (j == abyte1.length)
                {
                    break;
                }
                if (abyte0[j] != abyte1[j])
                {
                    flag1 = false;
                }
                j++;
            } while (true);
        }
        return flag2;
    }

    private boolean returnFalse(byte abyte0[])
    {
        clearBlock(mBuf);
        clearBlock(abyte0);
        return false;
    }

    public byte[] generateSignature()
        throws CryptoException
    {
        int k = digest.getDigestSize();
        int i;
        int j;
        if (trailer == 188)
        {
            j = 8;
            i = block.length - k - 1;
            digest.doFinal(block, i);
            block[block.length - 1] = -68;
        } else
        {
            j = 16;
            i = block.length - k - 2;
            digest.doFinal(block, i);
            block[block.length - 2] = (byte)(trailer >>> 8);
            block[block.length - 1] = (byte)trailer;
        }
        j = (j + (k + messageLength) * 8 + 4) - keyBits;
        if (j > 0)
        {
            int l = messageLength - (j + 7) / 8;
            k = 96;
            j = i - l;
            System.arraycopy(mBuf, 0, block, j, l);
            i = k;
        } else
        {
            byte byte0 = 64;
            j = i - messageLength;
            System.arraycopy(mBuf, 0, block, j, messageLength);
            i = byte0;
        }
        byte abyte1[];
        if (j - 1 > 0)
        {
            for (k = j - 1; k != 0; k--)
            {
                block[k] = -69;
            }

            byte abyte0[] = block;
            j--;
            abyte0[j] = (byte)(abyte0[j] ^ 1);
            block[0] = 11;
            abyte0 = block;
            abyte0[0] = (byte)(i | abyte0[0]);
        } else
        {
            block[0] = 10;
            byte abyte2[] = block;
            abyte2[0] = (byte)(i | abyte2[0]);
        }
        abyte1 = cipher.processBlock(block, 0, block.length);
        clearBlock(mBuf);
        clearBlock(block);
        return abyte1;
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
        cipherparameters = (RSAKeyParameters)cipherparameters;
        cipher.init(flag, cipherparameters);
        keyBits = cipherparameters.getModulus().bitLength();
        block = new byte[(keyBits + 7) / 8];
        if (trailer == 188)
        {
            mBuf = new byte[block.length - digest.getDigestSize() - 2];
        } else
        {
            mBuf = new byte[block.length - digest.getDigestSize() - 3];
        }
        reset();
    }

    public void reset()
    {
        digest.reset();
        messageLength = 0;
        clearBlock(mBuf);
        if (recoveredMessage != null)
        {
            clearBlock(recoveredMessage);
        }
        recoveredMessage = null;
        fullMessage = false;
    }

    public void update(byte byte0)
    {
        digest.update(byte0);
        if (preSig == null && messageLength < mBuf.length)
        {
            mBuf[messageLength] = byte0;
        }
        messageLength = messageLength + 1;
    }

    public void update(byte abyte0[], int i, int j)
    {
        digest.update(abyte0, i, j);
        if (preSig == null && messageLength < mBuf.length)
        {
            for (int k = 0; k < j && messageLength + k < mBuf.length; k++)
            {
                mBuf[messageLength + k] = abyte0[i + k];
            }

        }
        messageLength = messageLength + j;
    }

    public void updateWithRecoveredMessage(byte abyte0[])
        throws InvalidCipherTextException
    {
        byte abyte1[] = cipher.processBlock(abyte0, 0, abyte0.length);
        if ((abyte1[0] & 0xc0 ^ 0x40) != 0)
        {
            throw new InvalidCipherTextException("malformed signature");
        }
        if ((abyte1[abyte1.length - 1] & 0xf ^ 0xc) != 0)
        {
            throw new InvalidCipherTextException("malformed signature");
        }
        int i;
        int j;
        if ((abyte1[abyte1.length - 1] & 0xff ^ 0xbc) == 0)
        {
            i = 1;
        } else
        {
            i = abyte1[abyte1.length - 2];
            i = abyte1[abyte1.length - 1] & 0xff | (i & 0xff) << 8;
            Integer integer = (Integer)trailerMap.get(digest.getAlgorithmName());
            if (integer != null)
            {
                if (i != integer.intValue())
                {
                    throw new IllegalStateException((new StringBuilder()).append("signer initialised with wrong digest for trailer ").append(i).toString());
                }
            } else
            {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            i = 2;
        }
        j = 0;
        do
        {
            if (j == abyte1.length || (abyte1[j] & 0xf ^ 0xa) == 0)
            {
                j++;
                i = abyte1.length - i - digest.getDigestSize();
                if (i - j <= 0)
                {
                    throw new InvalidCipherTextException("malformed block");
                }
                break;
            }
            j++;
        } while (true);
        if ((abyte1[0] & 0x20) == 0)
        {
            fullMessage = true;
            recoveredMessage = new byte[i - j];
            System.arraycopy(abyte1, j, recoveredMessage, 0, recoveredMessage.length);
        } else
        {
            fullMessage = false;
            recoveredMessage = new byte[i - j];
            System.arraycopy(abyte1, j, recoveredMessage, 0, recoveredMessage.length);
        }
        preSig = abyte0;
        preBlock = abyte1;
        digest.update(recoveredMessage, 0, recoveredMessage.length);
        messageLength = recoveredMessage.length;
    }

    public boolean verifySignature(byte abyte0[])
    {
        if (preSig == null)
        {
            byte abyte1[];
            boolean flag;
            int i;
            int j;
            boolean flag1;
            int k;
            int l;
            int i1;
            try
            {
                abyte0 = cipher.processBlock(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return false;
            }
            flag = false;
        } else
        {
            if (!Arrays.areEqual(preSig, abyte0))
            {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            abyte0 = preBlock;
            preSig = null;
            preBlock = null;
            flag = true;
        }
        if ((abyte0[0] & 0xc0 ^ 0x40) != 0)
        {
            return returnFalse(abyte0);
        }
        if ((abyte0[abyte0.length - 1] & 0xf ^ 0xc) != 0)
        {
            return returnFalse(abyte0);
        }
        if ((abyte0[abyte0.length - 1] & 0xff ^ 0xbc) == 0)
        {
            i = 1;
        } else
        {
            i = abyte0[abyte0.length - 2];
            i = abyte0[abyte0.length - 1] & 0xff | (i & 0xff) << 8;
            abyte1 = (Integer)trailerMap.get(digest.getAlgorithmName());
            if (abyte1 != null)
            {
                if (i != abyte1.intValue())
                {
                    throw new IllegalStateException((new StringBuilder()).append("signer initialised with wrong digest for trailer ").append(i).toString());
                }
            } else
            {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            i = 2;
        }
        j = 0;
        do
        {
            if (j == abyte0.length || (abyte0[j] & 0xf ^ 0xa) == 0)
            {
                k = j + 1;
                abyte1 = new byte[digest.getDigestSize()];
                l = abyte0.length - i - abyte1.length;
                if (l - k <= 0)
                {
                    return returnFalse(abyte0);
                }
                break;
            }
            j++;
        } while (true);
        if ((abyte0[0] & 0x20) == 0)
        {
            fullMessage = true;
            if (messageLength > l - k)
            {
                return returnFalse(abyte0);
            }
            digest.reset();
            digest.update(abyte0, k, l - k);
            digest.doFinal(abyte1, 0);
            i = 0;
            flag1 = true;
            for (; i != abyte1.length; i++)
            {
                i1 = l + i;
                abyte0[i1] = (byte)(abyte0[i1] ^ abyte1[i]);
                if (abyte0[l + i] != 0)
                {
                    flag1 = false;
                }
            }

            if (!flag1)
            {
                return returnFalse(abyte0);
            }
            recoveredMessage = new byte[l - k];
            System.arraycopy(abyte0, k, recoveredMessage, 0, recoveredMessage.length);
        } else
        {
            fullMessage = false;
            digest.doFinal(abyte1, 0);
            i = 0;
            flag1 = true;
            for (; i != abyte1.length; i++)
            {
                i1 = l + i;
                abyte0[i1] = (byte)(abyte0[i1] ^ abyte1[i]);
                if (abyte0[l + i] != 0)
                {
                    flag1 = false;
                }
            }

            if (!flag1)
            {
                return returnFalse(abyte0);
            }
            recoveredMessage = new byte[l - k];
            System.arraycopy(abyte0, k, recoveredMessage, 0, recoveredMessage.length);
        }
        if (messageLength != 0 && !flag && !isSameAs(mBuf, recoveredMessage))
        {
            return returnFalse(abyte0);
        } else
        {
            clearBlock(mBuf);
            clearBlock(abyte0);
            return true;
        }
    }

    static 
    {
        trailerMap = new Hashtable();
        trailerMap.put("RIPEMD128", new Integer(13004));
        trailerMap.put("RIPEMD160", new Integer(12748));
        trailerMap.put("SHA-1", new Integer(13260));
        trailerMap.put("SHA-256", new Integer(13516));
        trailerMap.put("SHA-384", new Integer(14028));
        trailerMap.put("SHA-512", new Integer(13772));
        trailerMap.put("Whirlpool", new Integer(14284));
    }
}
