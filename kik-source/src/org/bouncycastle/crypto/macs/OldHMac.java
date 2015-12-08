// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.macs;

import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.Mac;
import org.bouncycastle.crypto.params.KeyParameter;

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
        b = digest.getDigestSize();
    }

    public int doFinal(byte abyte0[], int i)
    {
        byte abyte1[] = new byte[b];
        a.doFinal(abyte1, 0);
        a.update(d, 0, d.length);
        a.update(abyte1, 0, abyte1.length);
        i = a.doFinal(abyte0, i);
        reset();
        return i;
    }

    public String getAlgorithmName()
    {
        return (new StringBuilder()).append(a.getAlgorithmName()).append("/HMAC").toString();
    }

    public int getMacSize()
    {
        return b;
    }

    public Digest getUnderlyingDigest()
    {
        return a;
    }

    public void init(CipherParameters cipherparameters)
    {
        a.reset();
        cipherparameters = ((KeyParameter)cipherparameters).getKey();
        if (cipherparameters.length > 64)
        {
            a.update(cipherparameters, 0, cipherparameters.length);
            a.doFinal(c, 0);
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

        a.update(c, 0, c.length);
    }

    public void reset()
    {
        a.reset();
        a.update(c, 0, c.length);
    }

    public void update(byte byte0)
    {
        a.update(byte0);
    }

    public void update(byte abyte0[], int i, int j)
    {
        a.update(abyte0, i, j);
    }
}
