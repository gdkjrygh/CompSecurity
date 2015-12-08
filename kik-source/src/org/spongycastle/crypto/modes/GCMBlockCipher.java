// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.modes.gcm.GCMMultiplier;
import org.spongycastle.crypto.modes.gcm.Tables8kGCMMultiplier;
import org.spongycastle.crypto.params.AEADParameters;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.util.Pack;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.modes:
//            AEADBlockCipher

public class GCMBlockCipher
    implements AEADBlockCipher
{

    private static final byte a[] = new byte[16];
    private BlockCipher b;
    private GCMMultiplier c;
    private boolean d;
    private int e;
    private byte f[];
    private byte g[];
    private byte h[];
    private byte i[];
    private byte j[];
    private byte k[];
    private byte l[];
    private byte m[];
    private byte n[];
    private int o;
    private long p;

    public GCMBlockCipher(BlockCipher blockcipher)
    {
        this(blockcipher, (byte)0);
    }

    private GCMBlockCipher(BlockCipher blockcipher, byte byte0)
    {
        if (blockcipher.b() != 16)
        {
            throw new IllegalArgumentException("cipher required with a block size of 16.");
        } else
        {
            Tables8kGCMMultiplier tables8kgcmmultiplier = new Tables8kGCMMultiplier();
            b = blockcipher;
            c = tables8kgcmmultiplier;
            return;
        }
    }

    private static void a(long l1, byte abyte0[], int i1)
    {
        Pack.a((int)(l1 >>> 32), abyte0, i1);
        Pack.a((int)l1, abyte0, i1 + 4);
    }

    private void a(byte abyte0[], int i1, byte abyte1[], int j1)
    {
        int k1 = 15;
        do
        {
            if (k1 < 12)
            {
                break;
            }
            byte byte0 = (byte)(n[k1] + 1 & 0xff);
            n[k1] = byte0;
            if (byte0 != 0)
            {
                break;
            }
            k1--;
        } while (true);
        byte abyte3[] = new byte[16];
        b.a(n, 0, abyte3, 0);
        byte abyte2[];
        if (d)
        {
            System.arraycopy(a, i1, abyte3, i1, 16 - i1);
            abyte2 = abyte3;
        } else
        {
            abyte2 = abyte0;
        }
        for (k1 = i1 - 1; k1 >= 0; k1--)
        {
            abyte3[k1] = (byte)(abyte3[k1] ^ abyte0[k1]);
            abyte1[j1 + k1] = abyte3[k1];
        }

        a(m, abyte2);
        c.b(m);
        p = p + (long)i1;
    }

    private static void a(byte abyte0[], byte abyte1[])
    {
        for (int i1 = 15; i1 >= 0; i1--)
        {
            abyte0[i1] = (byte)(abyte0[i1] ^ abyte1[i1]);
        }

    }

    private byte[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[16];
        for (int i1 = 0; i1 < abyte0.length; i1 += 16)
        {
            byte abyte2[] = new byte[16];
            System.arraycopy(abyte0, i1, abyte2, 0, Math.min(abyte0.length - i1, 16));
            a(abyte1, abyte2);
            c.b(abyte1);
        }

        return abyte1;
    }

    public final int a(int i1)
    {
        return ((o + i1) / 16) * 16;
    }

    public final int a(byte abyte0[], int i1)
    {
        int k1 = o;
        int j1 = k1;
        if (!d)
        {
            if (k1 < e)
            {
                throw new InvalidCipherTextException("data too short");
            }
            j1 = k1 - e;
        }
        if (j1 > 0)
        {
            byte abyte1[] = new byte[16];
            System.arraycopy(k, 0, abyte1, 0, j1);
            a(abyte1, j1, abyte0, i1);
        }
        byte abyte2[] = new byte[16];
        a((long)g.length * 8L, abyte2, 0);
        a(p * 8L, abyte2, 8);
        a(m, abyte2);
        c.b(m);
        abyte2 = new byte[16];
        b.a(j, 0, abyte2, 0);
        a(abyte2, m);
        l = new byte[e];
        System.arraycopy(abyte2, 0, l, 0, e);
        if (d)
        {
            System.arraycopy(l, 0, abyte0, o + i1, e);
            j1 += e;
        } else
        {
            abyte0 = new byte[e];
            System.arraycopy(k, j1, abyte0, 0, e);
            if (!Arrays.b(l, abyte0))
            {
                throw new InvalidCipherTextException("mac check in GCM failed");
            }
        }
        m = Arrays.b(i);
        n = Arrays.b(j);
        o = 0;
        p = 0L;
        if (k != null)
        {
            Arrays.a(k, (byte)0);
        }
        b.c();
        return j1;
    }

    public final int a(byte abyte0[], int i1, int j1, byte abyte1[], int k1)
    {
        int l1 = 0;
        int i2;
        int j2;
        for (i2 = 0; l1 != j1; i2 = j2)
        {
            byte abyte2[] = k;
            j2 = o;
            o = j2 + 1;
            abyte2[j2] = abyte0[i1 + l1];
            j2 = i2;
            if (o == k.length)
            {
                a(k, 16, abyte1, k1 + i2);
                if (!d)
                {
                    System.arraycopy(k, 16, k, 0, e);
                }
                o = k.length - 16;
                j2 = i2 + 16;
            }
            l1++;
        }

        return i2;
    }

    public final BlockCipher a()
    {
        return b;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        d = flag;
        l = null;
        int j1;
        if (cipherparameters instanceof AEADParameters)
        {
            cipherparameters = (AEADParameters)cipherparameters;
            f = cipherparameters.d();
            g = cipherparameters.c();
            int i1 = cipherparameters.b();
            if (i1 < 96 || i1 > 128 || i1 % 8 != 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Invalid value for MAC size: ")).append(i1).toString());
            }
            e = i1 / 8;
            cipherparameters = cipherparameters.a();
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            f = cipherparameters.a();
            g = null;
            e = 16;
            cipherparameters = (KeyParameter)cipherparameters.b();
        } else
        {
            throw new IllegalArgumentException("invalid parameters passed to GCM");
        }
        if (flag)
        {
            j1 = 16;
        } else
        {
            j1 = e + 16;
        }
        k = new byte[j1];
        if (f == null || f.length <= 0)
        {
            throw new IllegalArgumentException("IV must be at least 1 byte");
        }
        if (g == null)
        {
            g = new byte[0];
        }
        if (cipherparameters != null)
        {
            b.a(true, cipherparameters);
        }
        h = new byte[16];
        b.a(a, 0, h, 0);
        c.a(h);
        i = a(g);
        if (f.length == 12)
        {
            j = new byte[16];
            System.arraycopy(f, 0, j, 0, f.length);
            j[15] = 1;
        } else
        {
            j = a(f);
            cipherparameters = new byte[16];
            a((long)f.length * 8L, ((byte []) (cipherparameters)), 8);
            a(j, ((byte []) (cipherparameters)));
            c.b(j);
        }
        m = Arrays.b(i);
        n = Arrays.b(j);
        o = 0;
        p = 0L;
    }

    public final int b(int i1)
    {
        if (d)
        {
            return o + i1 + e;
        } else
        {
            return (o + i1) - e;
        }
    }

}
