// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.signers;

import java.math.BigInteger;
import java.util.Hashtable;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.SignerWithRecovery;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.util.Arrays;

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
        c = asymmetricblockcipher;
        b = digest;
        d = 188;
    }

    private boolean a(byte abyte0[], byte abyte1[])
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

    private static void b(byte abyte0[])
    {
        for (int i1 = 0; i1 != abyte0.length; i1++)
        {
            abyte0[i1] = 0;
        }

    }

    private boolean c(byte abyte0[])
    {
        b(g);
        b(abyte0);
        return false;
    }

    public final void a(byte byte0)
    {
        b.a(byte0);
        if (k == null && h < g.length)
        {
            g[h] = byte0;
        }
        h = h + 1;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        cipherparameters = (RSAKeyParameters)cipherparameters;
        c.a(flag, cipherparameters);
        e = cipherparameters.b().bitLength();
        f = new byte[(e + 7) / 8];
        if (d == 188)
        {
            g = new byte[f.length - b.b() - 2];
        } else
        {
            g = new byte[f.length - b.b() - 3];
        }
        b.c();
        h = 0;
        b(g);
        if (j != null)
        {
            b(j);
        }
        j = null;
        i = false;
    }

    public final void a(byte abyte0[], int i1, int j1)
    {
        b.a(abyte0, i1, j1);
        if (k == null && h < g.length)
        {
            for (int k1 = 0; k1 < j1 && h + k1 < g.length; k1++)
            {
                g[h + k1] = abyte0[i1 + k1];
            }

        }
        h = h + j1;
    }

    public final boolean a(byte abyte0[])
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
                abyte0 = c.a(abyte0, 0, abyte0.length);
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
            return c(abyte0);
        }
        if ((abyte0[abyte0.length - 1] & 0xf ^ 0xc) != 0)
        {
            return c(abyte0);
        }
        if ((abyte0[abyte0.length - 1] & 0xff ^ 0xbc) == 0)
        {
            i1 = 1;
        } else
        {
            i1 = abyte0[abyte0.length - 2];
            i1 = abyte0[abyte0.length - 1] & 0xff | (i1 & 0xff) << 8;
            integer = (Integer)a.get(b.a());
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
        abyte1 = new byte[b.b()];
        l1 = abyte0.length - i1 - abyte1.length;
        if (l1 - k1 <= 0)
        {
            return c(abyte0);
        }
        if ((abyte0[0] & 0x20) == 0)
        {
            i = true;
            if (h > l1 - k1)
            {
                return c(abyte0);
            }
            b.c();
            b.a(abyte0, k1, l1 - k1);
            b.a(abyte1, 0);
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
                return c(abyte0);
            }
            j = new byte[l1 - k1];
            System.arraycopy(abyte0, k1, j, 0, j.length);
        } else
        {
            i = false;
            b.a(abyte1, 0);
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
                return c(abyte0);
            }
            j = new byte[l1 - k1];
            System.arraycopy(abyte0, k1, j, 0, j.length);
        }
        if (h != 0 && !flag && !a(g, j))
        {
            return c(abyte0);
        } else
        {
            b(g);
            b(abyte0);
            return true;
        }
    }

    public final byte[] a()
    {
        int k1 = b.b();
        int i1;
        int j1;
        if (d == 188)
        {
            j1 = 8;
            i1 = f.length - k1 - 1;
            b.a(f, i1);
            f[f.length - 1] = -68;
        } else
        {
            j1 = 16;
            i1 = f.length - k1 - 2;
            b.a(f, i1);
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
        abyte1 = c.a(f, 0, f.length);
        b(g);
        b(f);
        return abyte1;
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
