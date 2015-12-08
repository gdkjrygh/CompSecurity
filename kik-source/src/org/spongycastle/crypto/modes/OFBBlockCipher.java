// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;

public class OFBBlockCipher
    implements BlockCipher
{

    private byte a[];
    private byte b[];
    private byte c[];
    private final int d;
    private final BlockCipher e;

    public OFBBlockCipher(BlockCipher blockcipher, int i)
    {
        e = blockcipher;
        d = i / 8;
        a = new byte[blockcipher.b()];
        b = new byte[blockcipher.b()];
        c = new byte[blockcipher.b()];
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (d + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.a(b, 0, c, 0);
        for (int k = 0; k < d; k++)
        {
            abyte1[j + k] = (byte)(c[k] ^ abyte0[i + k]);
        }

        System.arraycopy(b, d, b, 0, b.length - d);
        System.arraycopy(c, 0, b, b.length - d, d);
        return d;
    }

    public final String a()
    {
        return (new StringBuilder()).append(e.a()).append("/OFB").append(d * 8).toString();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.a();
            if (abyte0.length < a.length)
            {
                System.arraycopy(abyte0, 0, a, a.length - abyte0.length, abyte0.length);
                for (int i = 0; i < a.length - abyte0.length; i++)
                {
                    a[i] = 0;
                }

            } else
            {
                System.arraycopy(abyte0, 0, a, 0, a.length);
            }
            c();
            if (cipherparameters.b() != null)
            {
                e.a(true, cipherparameters.b());
            }
            return;
        } else
        {
            c();
            e.a(true, cipherparameters);
            return;
        }
    }

    public final int b()
    {
        return d;
    }

    public final void c()
    {
        System.arraycopy(a, 0, b, 0, a.length);
        e.c();
    }
}
