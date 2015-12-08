// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.Mac;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;
import org.spongycastle.crypto.macs.HMac;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class PKCS5S2ParametersGenerator extends PBEParametersGenerator
{

    private Mac d;

    public PKCS5S2ParametersGenerator()
    {
        this(((Digest) (new SHA1Digest())));
    }

    private PKCS5S2ParametersGenerator(Digest digest)
    {
        d = new HMac(digest);
    }

    private byte[] c(int i)
    {
        int l = d.a();
        int i1 = ((i + l) - 1) / l;
        byte abyte0[] = new byte[4];
        byte abyte1[] = new byte[i1 * l];
        for (i = 1; i <= i1; i++)
        {
            abyte0[0] = (byte)(i >>> 24);
            abyte0[1] = (byte)(i >>> 16);
            abyte0[2] = (byte)(i >>> 8);
            abyte0[3] = (byte)i;
            byte abyte4[] = a;
            byte abyte2[] = b;
            int j1 = c;
            int k1 = (i - 1) * l;
            byte abyte3[] = new byte[d.a()];
            KeyParameter keyparameter = new KeyParameter(abyte4);
            d.a(keyparameter);
            if (abyte2 != null)
            {
                d.a(abyte2, 0, abyte2.length);
            }
            d.a(abyte0, 0, 4);
            d.a(abyte3, 0);
            System.arraycopy(abyte3, 0, abyte1, k1, abyte3.length);
            if (j1 == 0)
            {
                throw new IllegalArgumentException("iteration count must be at least 1.");
            }
            for (int j = 1; j < j1; j++)
            {
                d.a(keyparameter);
                d.a(abyte3, 0, abyte3.length);
                d.a(abyte3, 0);
                for (int k = 0; k != abyte3.length; k++)
                {
                    int l1 = k1 + k;
                    abyte1[l1] = (byte)(abyte1[l1] ^ abyte3[k]);
                }

            }

        }

        return abyte1;
    }

    public final CipherParameters a(int i)
    {
        i /= 8;
        return new KeyParameter(c(i), 0, i);
    }

    public final CipherParameters a(int i, int j)
    {
        i /= 8;
        j /= 8;
        byte abyte0[] = c(i + j);
        return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte0, i, j);
    }

    public final CipherParameters b(int i)
    {
        return a(i);
    }
}
