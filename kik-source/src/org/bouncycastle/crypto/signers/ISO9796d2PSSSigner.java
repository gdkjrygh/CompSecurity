// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
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

    private Digest a;
    private AsymmetricBlockCipher b;
    private SecureRandom c;
    private byte d[];
    private int e;
    private int f;
    private int g;
    private byte h[];
    private byte i[];
    private int j;
    private int k;
    private boolean l;
    private byte m[];

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, int i1)
    {
        this(asymmetricblockcipher, digest, i1, false);
    }

    public ISO9796d2PSSSigner(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, int i1, boolean flag)
    {
        b = asymmetricblockcipher;
        a = digest;
        e = digest.getDigestSize();
        k = i1;
        if (flag)
        {
            f = 188;
            return;
        }
        if (digest instanceof SHA1Digest)
        {
            f = 13260;
            return;
        }
        if (digest instanceof RIPEMD160Digest)
        {
            f = 12748;
            return;
        }
        if (digest instanceof RIPEMD128Digest)
        {
            f = 13004;
            return;
        } else
        {
            throw new IllegalArgumentException("no valid trailer for digest");
        }
    }

    private void ItoOSP(int i1, byte abyte0[])
    {
        abyte0[0] = (byte)(i1 >>> 24);
        abyte0[1] = (byte)(i1 >>> 16);
        abyte0[2] = (byte)(i1 >>> 8);
        abyte0[3] = (byte)(i1 >>> 0);
    }

    private void LtoOSP(long l1, byte abyte0[])
    {
        abyte0[0] = (byte)(int)(l1 >>> 56);
        abyte0[1] = (byte)(int)(l1 >>> 48);
        abyte0[2] = (byte)(int)(l1 >>> 40);
        abyte0[3] = (byte)(int)(l1 >>> 32);
        abyte0[4] = (byte)(int)(l1 >>> 24);
        abyte0[5] = (byte)(int)(l1 >>> 16);
        abyte0[6] = (byte)(int)(l1 >>> 8);
        abyte0[7] = (byte)(int)(l1 >>> 0);
    }

    private void clearBlock(byte abyte0[])
    {
        for (int i1 = 0; i1 != abyte0.length; i1++)
        {
            abyte0[i1] = 0;
        }

    }

    private boolean isSameAs(byte abyte0[], byte abyte1[])
    {
        boolean flag = true;
        if (j != abyte1.length)
        {
            flag = false;
        }
        for (int i1 = 0; i1 != abyte1.length; i1++)
        {
            if (abyte0[i1] != abyte1[i1])
            {
                flag = false;
            }
        }

        return flag;
    }

    private byte[] maskGeneratorFunction1(byte abyte0[], int i1, int j1, int k1)
    {
        byte abyte1[] = new byte[k1];
        byte abyte2[] = new byte[e];
        byte abyte3[] = new byte[4];
        a.reset();
        int l1;
        for (l1 = 0; l1 < k1 / e; l1++)
        {
            ItoOSP(l1, abyte3);
            a.update(abyte0, i1, j1);
            a.update(abyte3, 0, 4);
            a.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, e * l1, e);
        }

        if (e * l1 < k1)
        {
            ItoOSP(l1, abyte3);
            a.update(abyte0, i1, j1);
            a.update(abyte3, 0, 4);
            a.doFinal(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, e * l1, k1 - l1 * e);
        }
        return abyte1;
    }

    public byte[] generateSignature()
    {
        int i1 = a.getDigestSize();
        byte abyte0[] = new byte[i1];
        a.doFinal(abyte0, 0);
        byte abyte1[] = new byte[8];
        LtoOSP(j * 8, abyte1);
        a.update(abyte1, 0, 8);
        a.update(i, 0, j);
        a.update(abyte0, 0, i1);
        int j1;
        if (d != null)
        {
            abyte0 = d;
        } else
        {
            abyte0 = new byte[k];
            c.nextBytes(abyte0);
        }
        a.update(abyte0, 0, abyte0.length);
        abyte1 = new byte[a.getDigestSize()];
        a.doFinal(abyte1, 0);
        i1 = 2;
        if (f == 188)
        {
            i1 = 1;
        }
        j1 = h.length - j - abyte0.length - e - i1 - 1;
        h[j1] = 1;
        System.arraycopy(i, 0, h, j1 + 1, j);
        System.arraycopy(abyte0, 0, h, j1 + 1 + j, abyte0.length);
        abyte0 = maskGeneratorFunction1(abyte1, 0, abyte1.length, h.length - e - i1);
        for (int k1 = 0; k1 != abyte0.length; k1++)
        {
            byte abyte2[] = h;
            abyte2[k1] = (byte)(abyte2[k1] ^ abyte0[k1]);
        }

        System.arraycopy(abyte1, 0, h, h.length - e - i1, e);
        if (f == 188)
        {
            h[h.length - 1] = -68;
        } else
        {
            h[h.length - 2] = (byte)(f >>> 8);
            h[h.length - 1] = (byte)f;
        }
        abyte0 = h;
        abyte0[0] = (byte)(abyte0[0] & 0x7f);
        abyte0 = b.processBlock(h, 0, h.length);
        clearBlock(i);
        clearBlock(h);
        j = 0;
        return abyte0;
    }

    public byte[] getRecoveredMessage()
    {
        return m;
    }

    public boolean hasFullMessage()
    {
        return l;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        int i1 = k;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            ParametersWithRandom parameterswithrandom = (ParametersWithRandom)cipherparameters;
            cipherparameters = (RSAKeyParameters)parameterswithrandom.getParameters();
            if (flag)
            {
                c = parameterswithrandom.getRandom();
            }
        } else
        if (cipherparameters instanceof ParametersWithSalt)
        {
            ParametersWithSalt parameterswithsalt = (ParametersWithSalt)cipherparameters;
            cipherparameters = (RSAKeyParameters)parameterswithsalt.getParameters();
            d = parameterswithsalt.getSalt();
            i1 = d.length;
            if (d.length != k)
            {
                throw new IllegalArgumentException("Fixed salt is of wrong length");
            }
        } else
        {
            cipherparameters = (RSAKeyParameters)cipherparameters;
            if (flag)
            {
                c = new SecureRandom();
            }
        }
        b.init(flag, cipherparameters);
        g = cipherparameters.getModulus().bitLength();
        h = new byte[(g + 7) / 8];
        if (f == 188)
        {
            i = new byte[h.length - a.getDigestSize() - i1 - 1 - 1];
        } else
        {
            i = new byte[h.length - a.getDigestSize() - i1 - 1 - 2];
        }
        reset();
    }

    public void reset()
    {
        a.reset();
        j = 0;
        if (i != null)
        {
            clearBlock(i);
        }
        if (m != null)
        {
            clearBlock(m);
            m = null;
        }
        l = false;
    }

    public void update(byte byte0)
    {
        if (j < i.length)
        {
            byte abyte0[] = i;
            int i1 = j;
            j = i1 + 1;
            abyte0[i1] = byte0;
            return;
        } else
        {
            a.update(byte0);
            return;
        }
    }

    public void update(byte abyte0[], int i1, int j1)
    {
        for (; j1 > 0 && j < i.length; j1--)
        {
            update(abyte0[i1]);
            i1++;
        }

        if (j1 > 0)
        {
            a.update(abyte0, i1, j1);
        }
    }

    public void updateWithRecoveredMessage(byte abyte0[])
    {
        throw new RuntimeException("not implemented");
    }

    public boolean verifySignature(byte abyte0[])
    {
        byte abyte2[];
        byte abyte3[];
        int i1;
        int k1;
        boolean flag;
        int l1;
        int i2;
        boolean flag1;
        try
        {
            abyte0 = b.processBlock(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            return false;
        }
        if (abyte0.length < (g + 7) / 8)
        {
            byte abyte1[] = new byte[(g + 7) / 8];
            System.arraycopy(abyte0, 0, abyte1, abyte1.length - abyte0.length, abyte0.length);
            clearBlock(abyte0);
            abyte0 = abyte1;
        }
        if ((abyte0[abyte0.length - 1] & 0xff ^ 0xbc) == 0)
        {
            i1 = 1;
        } else
        {
            switch ((abyte0[abyte0.length - 2] & 0xff) << 8 | abyte0[abyte0.length - 1] & 0xff)
            {
            default:
                throw new IllegalArgumentException("unrecognised hash in signature");

            case 12748: 
                if (!(a instanceof RIPEMD160Digest))
                {
                    throw new IllegalStateException("signer should be initialised with RIPEMD160");
                }
                break;

            case 13260: 
                if (!(a instanceof SHA1Digest))
                {
                    throw new IllegalStateException("signer should be initialised with SHA1");
                }
                break;

            case 13004: 
                if (!(a instanceof RIPEMD128Digest))
                {
                    throw new IllegalStateException("signer should be initialised with RIPEMD128");
                }
                break;
            }
            i1 = 2;
        }
        abyte2 = new byte[e];
        a.doFinal(abyte2, 0);
        abyte3 = maskGeneratorFunction1(abyte0, abyte0.length - e - i1, e, abyte0.length - e - i1);
        for (int j1 = 0; j1 != abyte3.length; j1++)
        {
            abyte0[j1] = (byte)(abyte0[j1] ^ abyte3[j1]);
        }

        abyte0[0] = (byte)(abyte0[0] & 0x7f);
        for (k1 = 0; k1 != abyte0.length && abyte0[k1] != 1; k1++) { }
        k1++;
        if (k1 >= abyte0.length)
        {
            clearBlock(abyte0);
            return false;
        }
        if (k1 > 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = flag1;
        m = new byte[abyte3.length - k1 - k];
        System.arraycopy(abyte0, k1, m, 0, m.length);
        abyte3 = new byte[8];
        LtoOSP(m.length * 8, abyte3);
        a.update(abyte3, 0, 8);
        if (m.length != 0)
        {
            a.update(m, 0, m.length);
        }
        a.update(abyte2, 0, abyte2.length);
        a.update(abyte0, m.length + k1, k);
        abyte2 = new byte[a.getDigestSize()];
        a.doFinal(abyte2, 0);
        l1 = abyte0.length;
        i2 = abyte2.length;
        k1 = 0;
        flag = true;
        for (; k1 != abyte2.length; k1++)
        {
            if (abyte2[k1] != abyte0[(l1 - i1 - i2) + k1])
            {
                flag = false;
            }
        }

        clearBlock(abyte0);
        clearBlock(abyte2);
        if (!flag)
        {
            l = false;
            clearBlock(m);
            return false;
        }
        if (j != 0)
        {
            if (!isSameAs(i, m))
            {
                clearBlock(i);
                return false;
            }
            j = 0;
        }
        clearBlock(i);
        return true;
    }
}
