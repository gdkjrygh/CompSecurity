// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.ISO18033KDFParameters;
import org.spongycastle.crypto.params.KDFParameters;

public class BaseKDFBytesGenerator
    implements DerivationFunction
{

    private int a;
    private Digest b;
    private byte c[];
    private byte d[];

    protected BaseKDFBytesGenerator(Digest digest)
    {
        a = 1;
        b = digest;
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        long l1 = j;
        int j1 = b.b();
        if (l1 > 0x1ffffffffL)
        {
            throw new IllegalArgumentException("Output length too large");
        }
        int k1 = (int)(((l1 + (long)j1) - 1L) / (long)j1);
        byte abyte1[] = new byte[b.b()];
        int i1 = a;
        boolean flag = false;
        int l = i;
        int k = j;
        j = i1;
        i = ((flag) ? 1 : 0);
        while (i < k1) 
        {
            b.a(c, 0, c.length);
            b.a((byte)(j >> 24));
            b.a((byte)(j >> 16));
            b.a((byte)(j >> 8));
            b.a((byte)j);
            if (d != null)
            {
                b.a(d, 0, d.length);
            }
            b.a(abyte1, 0);
            if (k > j1)
            {
                System.arraycopy(abyte1, 0, abyte0, l, j1);
                l += j1;
                k -= j1;
            } else
            {
                System.arraycopy(abyte1, 0, abyte0, l, k);
            }
            j++;
            i++;
        }
        b.c();
        return k;
    }

    public final void a(DerivationParameters derivationparameters)
    {
        if (derivationparameters instanceof KDFParameters)
        {
            derivationparameters = (KDFParameters)derivationparameters;
            c = derivationparameters.a();
            d = derivationparameters.b();
            return;
        }
        if (derivationparameters instanceof ISO18033KDFParameters)
        {
            c = ((ISO18033KDFParameters)derivationparameters).a();
            d = null;
            return;
        } else
        {
            throw new IllegalArgumentException("KDF parameters required for KDF2Generator");
        }
    }
}
