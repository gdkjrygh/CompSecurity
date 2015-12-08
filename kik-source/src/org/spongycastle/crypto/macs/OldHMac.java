// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.macs;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.params.KeyParameter;

public class OldHMac
    implements Mac
{

    private Digest a;
    private int b;
    private byte c[];
    private byte d[];

    public OldHMac(Digest digest)
    {
        c = new byte[64];
        d = new byte[64];
        a = digest;
        b = digest.b();
    }

    public final int a()
    {
        return b;
    }

    public final int a(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[b];
        a.a(abyte1, 0);
        a.a(d, 0, d.length);
        a.a(abyte1, 0, abyte1.length);
        i = a.a(abyte0, i);
        b();
        return i;
    }

    public final void a(byte byte0)
    {
        a.a(byte0);
    }

    public final void a(CipherParameters cipherparameters)
    {
        a.c();
        cipherparameters = ((KeyParameter)cipherparameters).a();
        if (cipherparameters.length > 64)
        {
            a.a(cipherparameters, 0, cipherparameters.length);
            a.a(c, 0);
            for (int i = b; i < c.length; i++)
            {
                c[i] = 0;
            }

        } else
        {
            System.arraycopy(cipherparameters, 0, c, 0, cipherparameters.length);
            for (int j = cipherparameters.length; j < c.length; j++)
            {
                c[j] = 0;
            }

        }
        d = new byte[c.length];
        System.arraycopy(c, 0, d, 0, c.length);
        for (int k = 0; k < c.length; k++)
        {
            cipherparameters = c;
            cipherparameters[k] = (byte)(cipherparameters[k] ^ 0x36);
        }

        for (int l = 0; l < d.length; l++)
        {
            cipherparameters = d;
            cipherparameters[l] = (byte)(cipherparameters[l] ^ 0x5c);
        }

        a.a(c, 0, c.length);
    }

    public final void a(byte abyte0[], int i, int j)
    {
        a.a(abyte0, i, j);
    }

    public final void b()
    {
        a.c();
        a.a(c, 0, c.length);
    }
}
