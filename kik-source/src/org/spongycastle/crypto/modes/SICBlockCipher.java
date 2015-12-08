// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithIV;

public class SICBlockCipher
    implements BlockCipher
{

    private final BlockCipher a;
    private final int b;
    private byte c[];
    private byte d[];
    private byte e[];

    public SICBlockCipher(BlockCipher blockcipher)
    {
        a = blockcipher;
        b = a.b();
        c = new byte[b];
        d = new byte[b];
        e = new byte[b];
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        a.a(d, 0, e, 0);
        for (int k = 0; k < e.length; k++)
        {
            abyte1[j + k] = (byte)(e[k] ^ abyte0[i + k]);
        }

        j = d.length - 1;
        i = 1;
        while (j >= 0) 
        {
            int l = (d[j] & 0xff) + i;
            if (l > 255)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            d[j] = (byte)l;
            j--;
        }
        return d.length;
    }

    public final String a()
    {
        return (new StringBuilder()).append(a.a()).append("/SIC").toString();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithIV)
        {
            cipherparameters = (ParametersWithIV)cipherparameters;
            System.arraycopy(cipherparameters.a(), 0, c, 0, c.length);
            c();
            if (cipherparameters.b() != null)
            {
                a.a(true, cipherparameters.b());
            }
            return;
        } else
        {
            throw new IllegalArgumentException("SIC mode requires ParametersWithIV");
        }
    }

    public final int b()
    {
        return a.b();
    }

    public final void c()
    {
        System.arraycopy(c, 0, d, 0, d.length);
        a.c();
    }

    public final BlockCipher d()
    {
        return a;
    }
}
