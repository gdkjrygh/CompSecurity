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
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.util.Arrays;

// Referenced classes of package org.spongycastle.crypto.engines:
//            DESedeEngine

public class DESedeWrapEngine
    implements Wrapper
{

    private static final byte h[] = {
        74, -35, -94, 44, 121, -24, 33, 5
    };
    Digest a;
    byte b[];
    private CBCBlockCipher c;
    private KeyParameter d;
    private ParametersWithIV e;
    private byte f[];
    private boolean g;

    public DESedeWrapEngine()
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

    private static byte[] b(byte abyte0[])
    {
        byte abyte1[] = new byte[abyte0.length];
        for (int i = 0; i < abyte0.length; i++)
        {
            abyte1[i] = abyte0[abyte0.length - (i + 1)];
        }

        return abyte1;
    }

    public final String a()
    {
        return "DESede";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        g = flag;
        c = new CBCBlockCipher(new DESedeEngine());
        Object obj;
        if (cipherparameters instanceof ParametersWithRandom)
        {
            obj = (ParametersWithRandom)cipherparameters;
            cipherparameters = ((ParametersWithRandom) (obj)).b();
            obj = ((ParametersWithRandom) (obj)).a();
        } else
        {
            obj = new SecureRandom();
        }
        if (cipherparameters instanceof KeyParameter)
        {
            d = (KeyParameter)cipherparameters;
            if (g)
            {
                f = new byte[8];
                ((SecureRandom) (obj)).nextBytes(f);
                e = new ParametersWithIV(d, f);
            }
        } else
        if (cipherparameters instanceof ParametersWithIV)
        {
            e = (ParametersWithIV)cipherparameters;
            f = e.a();
            d = (KeyParameter)e.b();
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
        }
    }

    public final byte[] a(byte abyte0[], int i)
    {
        boolean flag = false;
        if (!g)
        {
            throw new IllegalStateException("Not initialized for wrapping");
        }
        byte abyte1[] = new byte[i];
        System.arraycopy(abyte0, 0, abyte1, 0, i);
        byte abyte2[] = a(abyte1);
        abyte0 = new byte[abyte1.length + 8];
        System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
        System.arraycopy(abyte2, 0, abyte0, abyte1.length, 8);
        int j = c.b();
        if (abyte0.length % j != 0)
        {
            throw new IllegalStateException("Not multiple of block length");
        }
        c.a(true, e);
        abyte1 = new byte[abyte0.length];
        for (i = 0; i != abyte0.length; i += j)
        {
            c.a(abyte0, i, abyte1, i);
        }

        abyte0 = new byte[f.length + abyte1.length];
        System.arraycopy(f, 0, abyte0, 0, f.length);
        System.arraycopy(abyte1, 0, abyte0, f.length, abyte1.length);
        abyte0 = b(abyte0);
        ParametersWithIV parameterswithiv = new ParametersWithIV(d, h);
        c.a(true, parameterswithiv);
        for (i = ((flag) ? 1 : 0); i != abyte0.length; i += j)
        {
            c.a(abyte0, i, abyte0, i);
        }

        return abyte0;
    }

    public final byte[] b(byte abyte0[], int i)
    {
        if (g)
        {
            throw new IllegalStateException("Not set for unwrapping");
        }
        if (abyte0 == null)
        {
            throw new InvalidCipherTextException("Null pointer as ciphertext");
        }
        int k = c.b();
        if (i % k != 0)
        {
            throw new InvalidCipherTextException((new StringBuilder("Ciphertext not multiple of ")).append(k).toString());
        }
        ParametersWithIV parameterswithiv = new ParametersWithIV(d, h);
        c.a(false, parameterswithiv);
        byte abyte1[] = new byte[i];
        for (int j = 0; j != i; j += k)
        {
            c.a(abyte0, j + 0, abyte1, j);
        }

        abyte0 = b(abyte1);
        f = new byte[8];
        abyte1 = new byte[abyte0.length - 8];
        System.arraycopy(abyte0, 0, f, 0, 8);
        System.arraycopy(abyte0, 8, abyte1, 0, abyte0.length - 8);
        e = new ParametersWithIV(d, f);
        c.a(false, e);
        abyte0 = new byte[abyte1.length];
        for (i = 0; i != abyte0.length; i += k)
        {
            c.a(abyte1, i, abyte0, i);
        }

        abyte1 = new byte[abyte0.length - 8];
        byte abyte2[] = new byte[8];
        System.arraycopy(abyte0, 0, abyte1, 0, abyte0.length - 8);
        System.arraycopy(abyte0, abyte0.length - 8, abyte2, 0, 8);
        if (!Arrays.b(a(abyte1), abyte2))
        {
            throw new InvalidCipherTextException("Checksum inside ciphertext is corrupted");
        } else
        {
            return abyte1;
        }
    }

}
