// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.KDFParameters;

public class BrokenKDF2BytesGenerator
    implements DerivationFunction
{

    private Digest a;
    private byte b[];
    private byte c[];

    public BrokenKDF2BytesGenerator(Digest digest)
    {
        a = digest;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j * 8;
        if (l1 > (long)(a.b() * 8) * 29L)
        {
            new IllegalArgumentException("Output length to large");
        }
        int l = (int)(l1 / (long)a.b());
        byte abyte1[] = new byte[a.b()];
        boolean flag = true;
        int k = i;
        i = ((flag) ? 1 : 0);
        while (i <= l) 
        {
            a.a(b, 0, b.length);
            a.a((byte)(i & 0xff));
            a.a((byte)(i >> 8 & 0xff));
            a.a((byte)(i >> 16 & 0xff));
            a.a((byte)(i >> 24 & 0xff));
            a.a(c, 0, c.length);
            a.a(abyte1, 0);
            if (j - k > abyte1.length)
            {
                System.arraycopy(abyte1, 0, abyte0, k, abyte1.length);
                k += abyte1.length;
            } else
            {
                System.arraycopy(abyte1, 0, abyte0, k, j - k);
            }
            i++;
        }
        a.c();
        return j;
    }

    public final void a(DerivationParameters derivationparameters)
    {
        if (!(derivationparameters instanceof KDFParameters))
        {
            throw new IllegalArgumentException("KDF parameters required for KDF2Generator");
        } else
        {
            derivationparameters = (KDFParameters)derivationparameters;
            b = derivationparameters.a();
            c = derivationparameters.b();
            return;
        }
    }
}
