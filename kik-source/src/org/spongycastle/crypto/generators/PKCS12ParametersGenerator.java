// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class PKCS12ParametersGenerator extends PBEParametersGenerator
{

    private Digest d;
    private int e;
    private int f;

    public PKCS12ParametersGenerator(Digest digest)
    {
        d = digest;
        e = digest.b();
        f = ((ExtendedDigest)digest).d();
    }

    private byte[] b(int i, int j)
    {
        byte abyte2[] = new byte[f];
        byte abyte3[] = new byte[j];
        for (int k = 0; k != abyte2.length; k++)
        {
            abyte2[k] = (byte)i;
        }

        byte abyte0[];
        byte abyte1[];
        if (b != null && b.length != 0)
        {
            abyte0 = new byte[f * (((b.length + f) - 1) / f)];
            for (i = 0; i != abyte0.length; i++)
            {
                abyte0[i] = b[i % b.length];
            }

        } else
        {
            abyte0 = new byte[0];
        }
        byte abyte4[];
        int k1;
        if (a != null && a.length != 0)
        {
            abyte1 = new byte[f * (((a.length + f) - 1) / f)];
            for (i = 0; i != abyte1.length; i++)
            {
                abyte1[i] = a[i % a.length];
            }

        } else
        {
            abyte1 = new byte[0];
        }
        abyte4 = new byte[abyte0.length + abyte1.length];
        System.arraycopy(abyte0, 0, abyte4, 0, abyte0.length);
        System.arraycopy(abyte1, 0, abyte4, abyte0.length, abyte1.length);
        abyte0 = new byte[f];
        k1 = ((e + j) - 1) / e;
        i = 1;
        while (i <= k1) 
        {
            abyte1 = new byte[e];
            d.a(abyte2, 0, abyte2.length);
            d.a(abyte4, 0, abyte4.length);
            d.a(abyte1, 0);
            for (j = 1; j < c; j++)
            {
                d.a(abyte1, 0, abyte1.length);
                d.a(abyte1, 0);
            }

            for (j = 0; j != abyte0.length; j++)
            {
                abyte0[j] = abyte1[j % abyte1.length];
            }

            for (j = 0; j != abyte4.length / f; j++)
            {
                int l1 = j * f;
                int l = (abyte0[abyte0.length - 1] & 0xff) + (abyte4[(abyte0.length + l1) - 1] & 0xff) + 1;
                abyte4[(abyte0.length + l1) - 1] = (byte)l;
                int j1 = l >>> 8;
                for (int i1 = abyte0.length - 2; i1 >= 0; i1--)
                {
                    j1 += (abyte0[i1] & 0xff) + (abyte4[l1 + i1] & 0xff);
                    abyte4[l1 + i1] = (byte)j1;
                    j1 >>>= 8;
                }

            }

            if (i == k1)
            {
                System.arraycopy(abyte1, 0, abyte3, (i - 1) * e, abyte3.length - (i - 1) * e);
            } else
            {
                System.arraycopy(abyte1, 0, abyte3, (i - 1) * e, abyte1.length);
            }
            i++;
        }
        return abyte3;
    }

    public final CipherParameters a(int i)
    {
        i /= 8;
        return new KeyParameter(b(1, i), 0, i);
    }

    public final CipherParameters a(int i, int j)
    {
        i /= 8;
        j /= 8;
        byte abyte0[] = b(1, i);
        byte abyte1[] = b(2, j);
        return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte1, 0, j);
    }

    public final CipherParameters b(int i)
    {
        i /= 8;
        return new KeyParameter(b(3, i), 0, i);
    }
}
