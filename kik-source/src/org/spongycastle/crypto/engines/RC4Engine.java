// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.StreamCipher;
import org.spongycastle.crypto.params.KeyParameter;

public class RC4Engine
    implements StreamCipher
{

    private byte a[];
    private int b;
    private int c;
    private byte d[];

    public RC4Engine()
    {
        a = null;
        b = 0;
        c = 0;
        d = null;
    }

    private void a(byte abyte0[])
    {
        int k = 0;
        d = abyte0;
        b = 0;
        c = 0;
        if (a == null)
        {
            a = new byte[256];
        }
        for (int i = 0; i < 256; i++)
        {
            a[i] = (byte)i;
        }

        int l = 0;
        int j = 0;
        for (; k < 256; k++)
        {
            l = l + ((abyte0[j] & 0xff) + a[k]) & 0xff;
            byte byte0 = a[k];
            a[k] = a[l];
            a[l] = byte0;
            j = (j + 1) % abyte0.length;
        }

    }

    public final byte a(byte byte0)
    {
        b = b + 1 & 0xff;
        c = a[b] + c & 0xff;
        byte byte1 = a[b];
        a[b] = a[c];
        a[c] = byte1;
        return (byte)(a[a[b] + a[c] & 0xff] ^ byte0);
    }

    public final String a()
    {
        return "RC4";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            d = ((KeyParameter)cipherparameters).a();
            a(d);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to RC4 init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final void a(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        if (i + j > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (k + j > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        for (int l = 0; l < j; l++)
        {
            b = b + 1 & 0xff;
            c = a[b] + c & 0xff;
            byte byte0 = a[b];
            a[b] = a[c];
            a[c] = byte0;
            abyte1[l + k] = (byte)(abyte0[l + i] ^ a[a[b] + a[c] & 0xff]);
        }

    }

    public final void b()
    {
        a(d);
    }
}
