// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.encodings;

import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.digests.SHA1Digest;
import org.bouncycastle.crypto.params.ParametersWithRandom;

public class OAEPEncoding
    implements AsymmetricBlockCipher
{

    private byte defHash[];
    private AsymmetricBlockCipher engine;
    private boolean forEncryption;
    private Digest hash;
    private Digest mgf1Hash;
    private SecureRandom random;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricblockcipher)
    {
        this(asymmetricblockcipher, ((Digest) (new SHA1Digest())), null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricblockcipher, Digest digest)
    {
        this(asymmetricblockcipher, digest, null);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, byte abyte0[])
    {
        engine = asymmetricblockcipher;
        hash = digest;
        mgf1Hash = digest1;
        defHash = new byte[digest.getDigestSize()];
        if (abyte0 != null)
        {
            digest.update(abyte0, 0, abyte0.length);
        }
        digest.doFinal(defHash, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, byte abyte0[])
    {
        this(asymmetricblockcipher, digest, digest, abyte0);
    }

    private void ItoOSP(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    private byte[] maskGeneratorFunction1(byte abyte0[], int i, int j, int k)
    {
        byte abyte1[] = new byte[k];
        byte abyte2[] = new byte[mgf1Hash.getDigestSize()];
        byte abyte3[] = new byte[4];
        hash.reset();
        int l = 0;
        int i1;
        do
        {
            ItoOSP(l, abyte3);
            mgf1Hash.update(abyte0, i, j);
            mgf1Hash.update(abyte3, 0, abyte3.length);
            mgf1Hash.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, abyte2.length * l, abyte2.length);
            i1 = l + 1;
            l = i1;
        } while (i1 < k / abyte2.length);
        if (abyte2.length * i1 < k)
        {
            ItoOSP(i1, abyte3);
            mgf1Hash.update(abyte0, i, j);
            mgf1Hash.update(abyte3, 0, abyte3.length);
            mgf1Hash.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, abyte2.length * i1, abyte1.length - i1 * abyte2.length);
        }
        return abyte1;
    }

    public byte[] decodeBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        abyte0 = engine.processBlock(abyte0, i, j);
        if (abyte0.length < engine.getOutputBlockSize())
        {
            byte abyte1[] = new byte[engine.getOutputBlockSize()];
            System.arraycopy(abyte0, 0, abyte1, abyte1.length - abyte0.length, abyte0.length);
            abyte0 = abyte1;
        }
        if (abyte0.length < defHash.length * 2 + 1)
        {
            throw new InvalidCipherTextException("data too short");
        }
        byte abyte2[] = maskGeneratorFunction1(abyte0, defHash.length, abyte0.length - defHash.length, defHash.length);
        for (i = 0; i != defHash.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte2[i]);
        }

        abyte2 = maskGeneratorFunction1(abyte0, 0, defHash.length, abyte0.length - defHash.length);
        for (i = defHash.length; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte2[i - defHash.length]);
        }

        for (i = 0; i != defHash.length; i++)
        {
            if (defHash[i] != abyte0[defHash.length + i])
            {
                throw new InvalidCipherTextException("data hash wrong");
            }
        }

        i = defHash.length * 2;
        do
        {
            if (i == abyte0.length || abyte0[i] != 0)
            {
                if (i >= abyte0.length - 1 || abyte0[i] != 1)
                {
                    throw new InvalidCipherTextException((new StringBuilder()).append("data start wrong ").append(i).toString());
                } else
                {
                    i++;
                    byte abyte3[] = new byte[abyte0.length - i];
                    System.arraycopy(abyte0, i, abyte3, 0, abyte3.length);
                    return abyte3;
                }
            }
            i++;
        } while (true);
    }

    public byte[] encodeBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        byte abyte1[] = new byte[getInputBlockSize() + 1 + defHash.length * 2];
        System.arraycopy(abyte0, i, abyte1, abyte1.length - j, j);
        abyte1[abyte1.length - j - 1] = 1;
        System.arraycopy(defHash, 0, abyte1, defHash.length, defHash.length);
        abyte0 = new byte[defHash.length];
        random.nextBytes(abyte0);
        byte abyte2[] = maskGeneratorFunction1(abyte0, 0, abyte0.length, abyte1.length - defHash.length);
        for (i = defHash.length; i != abyte1.length; i++)
        {
            abyte1[i] = (byte)(abyte1[i] ^ abyte2[i - defHash.length]);
        }

        System.arraycopy(abyte0, 0, abyte1, 0, defHash.length);
        abyte0 = maskGeneratorFunction1(abyte1, defHash.length, abyte1.length - defHash.length, defHash.length);
        for (i = 0; i != defHash.length; i++)
        {
            abyte1[i] = (byte)(abyte1[i] ^ abyte0[i]);
        }

        return engine.processBlock(abyte1, 0, abyte1.length);
    }

    public int getInputBlockSize()
    {
        int j = engine.getInputBlockSize();
        int i = j;
        if (forEncryption)
        {
            i = j - 1 - defHash.length * 2;
        }
        return i;
    }

    public int getOutputBlockSize()
    {
        int i = engine.getOutputBlockSize();
        if (forEncryption)
        {
            return i;
        } else
        {
            return i - 1 - defHash.length * 2;
        }
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return engine;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            random = ((ParametersWithRandom)cipherparameters).getRandom();
        } else
        {
            random = new SecureRandom();
        }
        engine.init(flag, cipherparameters);
        forEncryption = flag;
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException
    {
        if (forEncryption)
        {
            return encodeBlock(abyte0, i, j);
        } else
        {
            return decodeBlock(abyte0, i, j);
        }
    }
}
