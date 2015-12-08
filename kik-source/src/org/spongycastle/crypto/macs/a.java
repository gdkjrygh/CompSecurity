// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.ParametersWithIV;

final class a
{

    private byte a[];
    private byte b[];
    private byte c[];
    private int d;
    private BlockCipher e;

    public a(BlockCipher blockcipher)
    {
        e = null;
        e = blockcipher;
        d = 1;
        a = new byte[blockcipher.b()];
        b = new byte[blockcipher.b()];
        c = new byte[blockcipher.b()];
    }

    public final int a()
    {
        return d;
    }

    public final int a(byte abyte0[], int i, byte abyte1[])
    {
        if (d + i > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (d + 0 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        e.a(b, 0, c, 0);
        for (int j = 0; j < d; j++)
        {
            abyte1[j + 0] = (byte)(c[j] ^ abyte0[i + j]);
        }

        System.arraycopy(b, d, b, 0, b.length - d);
        System.arraycopy(abyte1, 0, b, b.length - d, d);
        return d;
    }

    public final void a(CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            byte abyte0[] = cipherparameters.a();
            if (abyte0.length < a.length)
            {
                System.arraycopy(abyte0, 0, a, a.length - abyte0.length, abyte0.length);
            } else
            {
                System.arraycopy(abyte0, 0, a, 0, a.length);
            }
            b();
            e.a(true, cipherparameters.b());
            return;
        } else
        {
            b();
            e.a(true, cipherparameters);
            return;
        }
    }

    final void a(byte abyte0[])
    {
        e.a(b, 0, abyte0, 0);
    }

    public final void b()
    {
        System.arraycopy(a, 0, b, 0, a.length);
        e.c();
    }
}
