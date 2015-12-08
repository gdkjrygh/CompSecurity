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

    private byte a[];
    private Digest b;
    private Digest c;
    private AsymmetricBlockCipher d;
    private SecureRandom e;
    private boolean f;

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
        d = asymmetricblockcipher;
        b = digest;
        c = digest1;
        a = new byte[digest.getDigestSize()];
        if (abyte0 != null)
        {
            digest.update(abyte0, 0, abyte0.length);
        }
        digest.doFinal(a, 0);
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
        byte abyte2[] = new byte[c.getDigestSize()];
        byte abyte3[] = new byte[4];
        b.reset();
        int l = 0;
        int i1;
        do
        {
            ItoOSP(l, abyte3);
            c.update(abyte0, i, j);
            c.update(abyte3, 0, 4);
            c.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, abyte2.length * l, abyte2.length);
            i1 = l + 1;
            l = i1;
        } while (i1 < k / abyte2.length);
        if (abyte2.length * i1 < k)
        {
            ItoOSP(i1, abyte3);
            c.update(abyte0, i, j);
            c.update(abyte3, 0, 4);
            c.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, abyte2.length * i1, k - i1 * abyte2.length);
        }
        return abyte1;
    }

    public byte[] decodeBlock(byte abyte0[], int i, int j)
    {
        abyte0 = d.processBlock(abyte0, i, j);
        if (abyte0.length < d.getOutputBlockSize())
        {
            byte abyte1[] = new byte[d.getOutputBlockSize()];
            System.arraycopy(abyte0, 0, abyte1, abyte1.length - abyte0.length, abyte0.length);
            abyte0 = abyte1;
        }
        if (abyte0.length < a.length * 2 + 1)
        {
            throw new InvalidCipherTextException("data too short");
        }
        byte abyte2[] = maskGeneratorFunction1(abyte0, a.length, abyte0.length - a.length, a.length);
        for (i = 0; i != a.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte2[i]);
        }

        abyte2 = maskGeneratorFunction1(abyte0, 0, a.length, abyte0.length - a.length);
        for (i = a.length; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte2[i - a.length]);
        }

        for (i = 0; i != a.length; i++)
        {
            if (a[i] != abyte0[a.length + i])
            {
                throw new InvalidCipherTextException("data hash wrong");
            }
        }

        for (i = a.length * 2; i != abyte0.length && abyte0[i] == 0; i++) { }
        if (i >= abyte0.length - 1 || abyte0[i] != 1)
        {
            throw new InvalidCipherTextException((new StringBuilder("data start wrong ")).append(i).toString());
        } else
        {
            i++;
            byte abyte3[] = new byte[abyte0.length - i];
            System.arraycopy(abyte0, i, abyte3, 0, abyte3.length);
            return abyte3;
        }
    }

    public byte[] encodeBlock(byte abyte0[], int i, int j)
    {
        byte abyte1[] = new byte[getInputBlockSize() + 1 + a.length * 2];
        System.arraycopy(abyte0, i, abyte1, abyte1.length - j, j);
        abyte1[abyte1.length - j - 1] = 1;
        System.arraycopy(a, 0, abyte1, a.length, a.length);
        abyte0 = new byte[a.length];
        e.nextBytes(abyte0);
        byte abyte2[] = maskGeneratorFunction1(abyte0, 0, abyte0.length, abyte1.length - a.length);
        for (i = a.length; i != abyte1.length; i++)
        {
            abyte1[i] = (byte)(abyte1[i] ^ abyte2[i - a.length]);
        }

        System.arraycopy(abyte0, 0, abyte1, 0, a.length);
        abyte0 = maskGeneratorFunction1(abyte1, a.length, abyte1.length - a.length, a.length);
        for (i = 0; i != a.length; i++)
        {
            abyte1[i] = (byte)(abyte1[i] ^ abyte0[i]);
        }

        return d.processBlock(abyte1, 0, abyte1.length);
    }

    public int getInputBlockSize()
    {
        int j = d.getInputBlockSize();
        int i = j;
        if (f)
        {
            i = j - 1 - a.length * 2;
        }
        return i;
    }

    public int getOutputBlockSize()
    {
        int i = d.getOutputBlockSize();
        if (f)
        {
            return i;
        } else
        {
            return i - 1 - a.length * 2;
        }
    }

    public AsymmetricBlockCipher getUnderlyingCipher()
    {
        return d;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            e = ((ParametersWithRandom)cipherparameters).getRandom();
        } else
        {
            e = new SecureRandom();
        }
        d.init(flag, cipherparameters);
        f = flag;
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        if (f)
        {
            return encodeBlock(abyte0, i, j);
        } else
        {
            return decodeBlock(abyte0, i, j);
        }
    }
}
