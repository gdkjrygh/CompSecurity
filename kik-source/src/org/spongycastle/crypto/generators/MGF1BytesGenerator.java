// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.DerivationFunction;
import org.spongycastle.crypto.DerivationParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.params.MGFParameters;

public class MGF1BytesGenerator
    implements DerivationFunction
{

    private Digest a;
    private byte b[];
    private int c;

    private static void a(int i, byte abyte0[])
    {
        abyte0[0] = (byte)(i >>> 24);
        abyte0[1] = (byte)(i >>> 16);
        abyte0[2] = (byte)(i >>> 8);
        abyte0[3] = (byte)(i >>> 0);
    }

    public final int a(byte abyte0[], int i, int j)
    {
        if (abyte0.length - j < i)
        {
            throw new DataLengthException("output buffer too small");
        }
        byte abyte1[] = new byte[c];
        byte abyte2[] = new byte[4];
        a.c();
        int l;
        if (j > c)
        {
            int k = 0;
            do
            {
                a(k, abyte2);
                a.a(b, 0, b.length);
                a.a(abyte2, 0, 4);
                a.a(abyte1, 0);
                System.arraycopy(abyte1, 0, abyte0, c * k + i, c);
                l = k + 1;
                k = l;
            } while (l < j / c);
        } else
        {
            l = 0;
        }
        if (c * l < j)
        {
            a(l, abyte2);
            a.a(b, 0, b.length);
            a.a(abyte2, 0, 4);
            a.a(abyte1, 0);
            System.arraycopy(abyte1, 0, abyte0, c * l + i, j - l * c);
        }
        return j;
    }

    public final void a(DerivationParameters derivationparameters)
    {
        if (!(derivationparameters instanceof MGFParameters))
        {
            throw new IllegalArgumentException("MGF parameters required for MGF1Generator");
        } else
        {
            b = ((MGFParameters)derivationparameters).a();
            return;
        }
    }
}
