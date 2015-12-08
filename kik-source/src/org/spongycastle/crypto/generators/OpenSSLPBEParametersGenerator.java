// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.digests.MD5Digest;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class OpenSSLPBEParametersGenerator extends PBEParametersGenerator
{

    private Digest d;

    public OpenSSLPBEParametersGenerator()
    {
        d = new MD5Digest();
    }

    private byte[] c(int i)
    {
        byte abyte0[] = new byte[d.b()];
        byte abyte1[] = new byte[i];
        int j = 0;
        do
        {
            d.a(a, 0, a.length);
            d.a(b, 0, b.length);
            d.a(abyte0, 0);
            int k;
            if (i > abyte0.length)
            {
                k = abyte0.length;
            } else
            {
                k = i;
            }
            System.arraycopy(abyte0, 0, abyte1, j, k);
            j += k;
            i -= k;
            if (i != 0)
            {
                d.c();
                d.a(abyte0, 0, abyte0.length);
            } else
            {
                return abyte1;
            }
        } while (true);
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
