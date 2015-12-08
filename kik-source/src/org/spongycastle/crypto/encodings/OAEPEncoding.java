// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.encodings;

import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.InvalidCipherTextException;
import org.spongycastle.crypto.params.ParametersWithRandom;

public class OAEPEncoding
    implements AsymmetricBlockCipher
{

    private byte a[];
    private Digest b;
    private Digest c;
    private AsymmetricBlockCipher d;
    private SecureRandom e;
    private boolean f;

    public OAEPEncoding(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, Digest digest1, byte abyte0[])
    {
        d = asymmetricblockcipher;
        b = digest;
        c = digest1;
        a = new byte[digest.b()];
        if (abyte0 != null)
        {
            digest.a(abyte0, 0, abyte0.length);
        }
        digest.a(a, 0);
    }

    public OAEPEncoding(AsymmetricBlockCipher asymmetricblockcipher, Digest digest, byte abyte0[])
    {
        this(asymmetricblockcipher, digest, digest, abyte0);
    }

    private static void a(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    private byte[] a(byte abyte0[], int i, int j, int k)
    {
        byte abyte1[] = new byte[k];
        byte abyte2[] = new byte[c.b()];
        byte abyte3[] = new byte[4];
        b.c();
        int l = 0;
        int i1;
        do
        {
            a(l, abyte3);
            c.a(abyte0, i, j);
            c.a(abyte3, 0, 4);
            c.a(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, abyte2.length * l, abyte2.length);
            i1 = l + 1;
            l = i1;
        } while (i1 < k / abyte2.length);
        if (abyte2.length * i1 < k)
        {
            a(i1, abyte3);
            c.a(abyte0, i, j);
            c.a(abyte3, 0, 4);
            c.a(abyte2, 0);
            System.arraycopy(abyte2, 0, abyte1, abyte2.length * i1, abyte1.length - i1 * abyte2.length);
        }
        return abyte1;
    }

    public final int a()
    {
        int j = d.a();
        int i = j;
        if (f)
        {
            i = j - 1 - a.length * 2;
        }
        return i;
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            e = ((ParametersWithRandom)cipherparameters).a();
        } else
        {
            e = new SecureRandom();
        }
        d.a(flag, cipherparameters);
        f = flag;
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        if (f)
        {
            byte abyte1[] = new byte[a() + 1 + a.length * 2];
            System.arraycopy(abyte0, i, abyte1, abyte1.length - j, j);
            abyte1[abyte1.length - j - 1] = 1;
            System.arraycopy(a, 0, abyte1, a.length, a.length);
            abyte0 = new byte[a.length];
            e.nextBytes(abyte0);
            byte abyte5[] = a(abyte0, 0, abyte0.length, abyte1.length - a.length);
            for (i = a.length; i != abyte1.length; i++)
            {
                abyte1[i] = (byte)(abyte1[i] ^ abyte5[i - a.length]);
            }

            System.arraycopy(abyte0, 0, abyte1, 0, a.length);
            abyte0 = a(abyte1, a.length, abyte1.length - a.length, a.length);
            for (i = 0; i != a.length; i++)
            {
                abyte1[i] = (byte)(abyte1[i] ^ abyte0[i]);
            }

            return d.a(abyte1, 0, abyte1.length);
        }
        abyte0 = d.a(abyte0, i, j);
        if (abyte0.length < d.b())
        {
            byte abyte2[] = new byte[d.b()];
            System.arraycopy(abyte0, 0, abyte2, abyte2.length - abyte0.length, abyte0.length);
            abyte0 = abyte2;
        }
        if (abyte0.length < a.length * 2 + 1)
        {
            throw new InvalidCipherTextException("data too short");
        }
        byte abyte3[] = a(abyte0, a.length, abyte0.length - a.length, a.length);
        for (i = 0; i != a.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte3[i]);
        }

        abyte3 = a(abyte0, 0, a.length, abyte0.length - a.length);
        for (i = a.length; i != abyte0.length; i++)
        {
            abyte0[i] = (byte)(abyte0[i] ^ abyte3[i - a.length]);
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
            byte abyte4[] = new byte[abyte0.length - i];
            System.arraycopy(abyte0, i, abyte4, 0, abyte4.length);
            return abyte4;
        }
    }

    public final int b()
    {
        int i = d.b();
        if (f)
        {
            return i;
        } else
        {
            return i - 1 - a.length * 2;
        }
    }
}
