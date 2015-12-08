// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.Wrapper;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.engines:
//            RC2Engine

public class RC2WrapEngine
    implements Wrapper
{

    private static final byte i[] = {
        74, -35, -94, 44, 121, -24, 33, 5
    };
    Digest a;
    byte b[];
    private CBCBlockCipher c;
    private CipherParameters d;
    private ParametersWithIV e;
    private byte f[];
    private boolean g;
    private SecureRandom h;

    public RC2WrapEngine()
    {
        a = new SHA1Digest();
        b = new byte[20];
    }

    private byte[] a(byte abyte0[])
    {
        byte abyte1[] = new byte[8];
        a.a(abyte0, 0, abyte0.length);
        a.a(b, 0);
        System.arraycopy(b, 0, abyte1, 0, 8);
        return abyte1;
    }

    public final String a()
    {
        return "RC2";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        g = flag;
        c = new CBCBlockCipher(new RC2Engine());
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            h = cipherparameters.a();
            cipherparameters = cipherparameters.b();
        } else
        {
            h = new SecureRandom();
        }
        if (cipherparameters instanceof ParametersWithIV)
        {
            e = (ParametersWithIV)cipherparameters;
            f = e.a();
            d = e.b();
            if (g)
            {
                if (f == null || f.length != 8)
                {
                    throw new IllegalArgumentException("IV is not 8 octets");
                }
            } else
            {
                throw new IllegalArgumentException("You should not supply an IV for unwrapping");
            }
        } else
        {
            d = cipherparameters;
            if (g)
            {
                f = new byte[8];
                h.nextBytes(f);
                e = new ParametersWithIV(d, f);
            }
        }
    }

    public final byte[] a(byte abyte0[], int j)
    {
        boolean flag = false;
        if (!g)
        {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        int i1 = j + 1;
        int k = i1;
        if (i1 % 8 != 0)
        {
            k = i1 + (8 - i1 % 8);
        }
        byte abyte1[] = new byte[k];
        abyte1[0] = (byte)j;
        System.arraycopy(abyte0, 0, abyte1, 1, j);
        abyte0 = new byte[abyte1.length - j - 1];
        if (abyte0.length > 0)
        {
            h.nextBytes(abyte0);
            System.arraycopy(abyte0, 0, abyte1, j + 1, abyte0.length);
        }
        byte abyte2[] = a(abyte1);
        abyte0 = new byte[abyte1.length + 8];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        System.arraycopy(abyte2, 0, abyte0, abyte1.length, 8);
        abyte1 = new byte[abyte0.length];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length);
        k = abyte0.length / c.b();
        if (abyte0.length % c.b() != 0)
        {
            throw new IllegalStateException("Not multiple of block length");
        }
        c.a(true, e);
        for (j = 0; j < k; j++)
        {
            int j1 = c.b() * j;
            c.a(abyte1, j1, abyte1, j1);
        }

        abyte0 = new byte[f.length + abyte1.length];
        System.arraycopy(f, 0, abyte0, 0, f.length);
        System.arraycopy(abyte1, 0, abyte0, f.length, abyte1.length);
        abyte1 = new byte[abyte0.length];
        for (j = 0; j < abyte0.length; j++)
        {
            abyte1[j] = abyte0[abyte0.length - (j + 1)];
        }

        abyte0 = new ParametersWithIV(d, i);
        c.a(true, abyte0);
        for (j = ((flag) ? 1 : 0); j < k + 1; j++)
        {
            int l = c.b() * j;
            c.a(abyte1, l, abyte1, l);
        }

        return abyte1;
    }

    public final byte[] b(byte abyte0[], int j)
    {
        if (g)
        {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (abyte0 == null)
        {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        if (j % c.b() != 0)
        {
            throw new InvalidCipherTextException((new StringBuilder("Ciphertext not multiple of ")).append(c.b()).toString());
        }
        ParametersWithIV parameterswithiv = new ParametersWithIV(d, i);
        c.a(false, parameterswithiv);
        byte abyte1[] = new byte[j];
        System.arraycopy(abyte0, 0, abyte1, 0, j);
        for (j = 0; j < abyte1.length / c.b(); j++)
        {
            int k = c.b() * j;
            c.a(abyte1, k, abyte1, k);
        }

        abyte0 = new byte[abyte1.length];
        for (j = 0; j < abyte1.length; j++)
        {
            abyte0[j] = abyte1[abyte1.length - (j + 1)];
        }

        f = new byte[8];
        abyte1 = new byte[abyte0.length - 8];
        System.arraycopy(abyte0, 0, f, 0, 8);
        System.arraycopy(abyte0, 8, abyte1, 0, abyte0.length - 8);
        e = new ParametersWithIV(d, f);
        c.a(false, e);
        abyte0 = new byte[abyte1.length];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        for (j = 0; j < abyte0.length / c.b(); j++)
        {
            int l = c.b() * j;
            c.a(abyte0, l, abyte0, l);
        }

        abyte1 = new byte[abyte0.length - 8];
        byte abyte2[] = new byte[8];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length - 8);
        System.arraycopy(abyte0, abyte0.length - 8, abyte2, 0, 8);
        if (!Arrays.b(a(abyte1), abyte2))
        {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        }
        if (abyte1.length - ((abyte1[0] & 0xff) + 1) > 7)
        {
            throw new InvalidCipherTextException((new StringBuilder("too many pad bytes (")).append(abyte1.length - ((abyte1[0] & 0xff) + 1)).append(")").toString());
        } else
        {
            abyte0 = new byte[abyte1[0]];
            System.arraycopy(abyte1, 1, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

}
