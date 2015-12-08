// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.signers;

import java.math.BigInteger;
import java.util.Hashtable;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.SignerWithRecovery;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.util.Arrays;

public class ISO9796d2Signer
    implements SignerWithRecovery
{

    private static Hashtable a;
    private Digest b;
    private AsymmetricBlockCipher c;
    private int d;
    private int e;
    private byte f[];
    private byte g[];
    private int h;
    private boolean i;
    private byte j[];
    private byte k[];
    private byte l[];

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricblockcipher, Digest digest)
    {
        this(asymmetricblockcipher, digest, false);
    }

    public ISO9796d2Signer(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, boolean flag)
    {
        c = asymmetricblockcipher;
        b = digest;
        if (flag)
        {
            d = 188;
            return;
        }
        asymmetricblockcipher = (Integer)a.get(digest.getAlgorithmName());
        if (asymmetricblockcipher != null)
        {
            d = asymmetricblockcipher.intValue();
            return;
        } else
        {
            throw new IllegalArgumentException("no valid trailer for digest");
        }
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
        boolean flag2 = true;
        boolean flag = true;
        if (h > g.length)
        {
            if (g.length > abyte1.length)
            {
                flag = false;
            }
            int i1 = 0;
            do
            {
                flag2 = flag;
                if (i1 == g.length)
                {
                    break;
                }
                if (abyte0[i1] != abyte1[i1])
                {
                    flag = false;
                }
                i1++;
            } while (true);
        } else
        {
            boolean flag1 = flag2;
            if (h != abyte1.length)
            {
                flag1 = false;
            }
            int j1 = 0;
            do
            {
                flag2 = flag1;
                if (j1 == abyte1.length)
                {
                    break;
                }
                if (abyte0[j1] != abyte1[j1])
                {
                    flag1 = false;
                }
                j1++;
            } while (true);
        }
        return flag2;
    }

    private boolean returnFalse(byte abyte0[])
    {
        clearBlock(g);
        clearBlock(abyte0);
        return false;
    }

    public byte[] generateSignature()
    {
        int k1 = b.getDigestSize();
        int i1;
        int j1;
        if (d == 188)
        {
            j1 = 8;
            i1 = f.length - k1 - 1;
            b.doFinal(f, i1);
            f[f.length - 1] = -68;
        } else
        {
            j1 = 16;
            i1 = f.length - k1 - 2;
            b.doFinal(f, i1);
            f[f.length - 2] = (byte)(d >>> 8);
            f[f.length - 1] = (byte)d;
        }
        j1 = (j1 + (k1 + h) * 8 + 4) - e;
        if (j1 > 0)
        {
            k1 = h - (j1 + 7) / 8;
            j1 = i1 - k1;
            System.arraycopy(g, 0, f, j1, k1);
            i1 = 96;
        } else
        {
            j1 = i1 - h;
            System.arraycopy(g, 0, f, j1, h);
            i1 = 64;
        }
        byte abyte1[];
        if (j1 - 1 > 0)
        {
            for (k1 = j1 - 1; k1 != 0; k1--)
            {
                f[k1] = -69;
            }

            byte abyte0[] = f;
            j1--;
            abyte0[j1] = (byte)(abyte0[j1] ^ 1);
            f[0] = 11;
            abyte0 = f;
            abyte0[0] = (byte)(abyte0[0] | i1);
        } else
        {
            f[0] = 10;
            byte abyte2[] = f;
            abyte2[0] = (byte)(abyte2[0] | i1);
        }
        abyte1 = c.processBlock(f, 0, f.length);
        clearBlock(g);
        clearBlock(f);
        return abyte1;
    }

    public byte[] getRecoveredMessage()
    {
        return j;
    }

    public boolean hasFullMessage()
    {
        return i;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        cipherparameters = (RSAKeyParameters)cipherparameters;
        c.init(flag, cipherparameters);
        e = cipherparameters.getModulus().bitLength();
        f = new byte[(e + 7) / 8];
        if (d == 188)
        {
            g = new byte[f.length - b.getDigestSize() - 2];
        } else
        {
            g = new byte[f.length - b.getDigestSize() - 3];
        }
        reset();
    }

    public void reset()
    {
        b.reset();
        h = 0;
        clearBlock(g);
        if (j != null)
        {
            clearBlock(j);
        }
        j = null;
        i = false;
    }

    public void update(byte byte0)
    {
        b.update(byte0);
        if (k == null && h < g.length)
        {
            g[h] = byte0;
        }
        h = h + 1;
    }

    public void update(byte abyte0[], int i1, int j1)
    {
        b.update(abyte0, i1, j1);
        if (k == null && h < g.length)
        {
            for (int k1 = 0; k1 < j1 && h + k1 < g.length; k1++)
            {
                g[h + k1] = abyte0[i1 + k1];
            }

        }
        h = h + j1;
    }

    public void updateWithRecoveredMessage(byte abyte0[])
    {
        byte abyte1[] = c.processBlock(abyte0, 0, abyte0.length);
        if ((abyte1[0] & 0xc0 ^ 0x40) != 0)
        {
            throw new InvalidCipherTextException("malformed signature");
        }
        if ((abyte1[abyte1.length - 1] & 0xf ^ 0xc) != 0)
        {
            throw new InvalidCipherTextException("malformed signature");
        }
        int i1;
        int j1;
        if ((abyte1[abyte1.length - 1] & 0xff ^ 0xbc) == 0)
        {
            i1 = 1;
        } else
        {
            i1 = abyte1[abyte1.length - 2];
            i1 = abyte1[abyte1.length - 1] & 0xff | (i1 & 0xff) << 8;
            Integer integer = (Integer)a.get(b.getAlgorithmName());
            if (integer != null)
            {
                if (i1 != integer.intValue())
                {
                    throw new IllegalStateException((new StringBuilder("signer initialised with wrong digest for trailer ")).append(i1).toString());
                }
            } else
            {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            i1 = 2;
        }
        for (j1 = 0; j1 != abyte1.length && (abyte1[j1] & 0xf ^ 0xa) != 0; j1++) { }
        j1++;
        i1 = abyte1.length - i1 - b.getDigestSize();
        if (i1 - j1 <= 0)
        {
            throw new InvalidCipherTextException("malformed block");
        }
        if ((abyte1[0] & 0x20) == 0)
        {
            i = true;
            j = new byte[i1 - j1];
            System.arraycopy(abyte1, j1, j, 0, j.length);
        } else
        {
            i = false;
            j = new byte[i1 - j1];
            System.arraycopy(abyte1, j1, j, 0, j.length);
        }
        k = abyte0;
        l = abyte1;
        b.update(j, 0, j.length);
        h = j.length;
    }

    public boolean verifySignature(byte abyte0[])
    {
        if (k == null)
        {
            Integer integer;
            byte abyte1[];
            boolean flag;
            int i1;
            int j1;
            boolean flag1;
            int k1;
            int l1;
            int i2;
            try
            {
                abyte0 = c.processBlock(abyte0, 0, abyte0.length);
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return false;
            }
            flag = false;
        } else
        {
            if (!Arrays.a(k, abyte0))
            {
                throw new IllegalStateException("updateWithRecoveredMessage called on different signature");
            }
            abyte0 = l;
            k = null;
            l = null;
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
            i1 = 1;
        } else
        {
            i1 = abyte0[abyte0.length - 2];
            i1 = abyte0[abyte0.length - 1] & 0xff | (i1 & 0xff) << 8;
            integer = (Integer)a.get(b.getAlgorithmName());
            if (integer != null)
            {
                if (i1 != integer.intValue())
                {
                    throw new IllegalStateException((new StringBuilder("signer initialised with wrong digest for trailer ")).append(i1).toString());
                }
            } else
            {
                throw new IllegalArgumentException("unrecognised hash in signature");
            }
            i1 = 2;
        }
        for (j1 = 0; j1 != abyte0.length && (abyte0[j1] & 0xf ^ 0xa) != 0; j1++) { }
        k1 = j1 + 1;
        abyte1 = new byte[b.getDigestSize()];
        l1 = abyte0.length - i1 - abyte1.length;
        if (l1 - k1 <= 0)
        {
            return returnFalse(abyte0);
        }
        if ((abyte0[0] & 0x20) == 0)
        {
            i = true;
            if (h > l1 - k1)
            {
                return returnFalse(abyte0);
            }
            b.reset();
            b.update(abyte0, k1, l1 - k1);
            b.doFinal(abyte1, 0);
            i1 = 0;
            flag1 = true;
            for (; i1 != abyte1.length; i1++)
            {
                i2 = l1 + i1;
                abyte0[i2] = (byte)(abyte0[i2] ^ abyte1[i1]);
                if (abyte0[l1 + i1] != 0)
                {
                    flag1 = false;
                }
            }

            if (!flag1)
            {
                return returnFalse(abyte0);
            }
            j = new byte[l1 - k1];
            System.arraycopy(abyte0, k1, j, 0, j.length);
        } else
        {
            i = false;
            b.doFinal(abyte1, 0);
            i1 = 0;
            flag1 = true;
            for (; i1 != abyte1.length; i1++)
            {
                i2 = l1 + i1;
                abyte0[i2] = (byte)(abyte0[i2] ^ abyte1[i1]);
                if (abyte0[l1 + i1] != 0)
                {
                    flag1 = false;
                }
            }

            if (!flag1)
            {
                return returnFalse(abyte0);
            }
            j = new byte[l1 - k1];
            System.arraycopy(abyte0, k1, j, 0, j.length);
        }
        if (h != 0 && !flag && !isSameAs(g, j))
        {
            return returnFalse(abyte0);
        } else
        {
            clearBlock(g);
            clearBlock(abyte0);
            return true;
        }
    }

    static 
    {
        Hashtable hashtable = new Hashtable();
        a = hashtable;
        hashtable.put("RIPEMD128", new Integer(13004));
        a.put("RIPEMD160", new Integer(12748));
        a.put("SHA-1", new Integer(13260));
        a.put("SHA-256", new Integer(13516));
        a.put("SHA-384", new Integer(14028));
        a.put("SHA-512", new Integer(13772));
        a.put("Whirlpool", new Integer(14284));
    }
}
