// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.Digest;
import org.spongycastle.crypto.PBEParametersGenerator;
import org.spongycastle.crypto.params.KeyParameter;
import org.spongycastle.crypto.params.ParametersWithIV;

public class PKCS5S1ParametersGenerator extends PBEParametersGenerator
{

    private Digest d;

    public PKCS5S1ParametersGenerator(Digest digest)
    {
        d = digest;
    }

    private byte[] a()
    {
        byte abyte0[] = new byte[d.b()];
        d.a(a, 0, a.length);
        d.a(b, 0, b.length);
        d.a(abyte0, 0);
        for (int i = 1; i < c; i++)
        {
            d.a(abyte0, 0, abyte0.length);
            d.a(abyte0, 0);
        }

        return abyte0;
    }

    public final CipherParameters a(int i)
    {
        i /= 8;
        if (i > d.b())
        {
            throw new IllegalArgumentException((new StringBuilder("Can't generate a derived key ")).append(i).append(" bytes long.").toString());
        } else
        {
            return new KeyParameter(a(), 0, i);
        }
    }

    public final CipherParameters a(int i, int j)
    {
        i /= 8;
        j /= 8;
        if (i + j > d.b())
        {
            throw new IllegalArgumentException((new StringBuilder("Can't generate a derived key ")).append(i + j).append(" bytes long.").toString());
        } else
        {
            byte abyte0[] = a();
            return new ParametersWithIV(new KeyParameter(abyte0, 0, i), abyte0, i, j);
        }
    }

    public final CipherParameters b(int i)
    {
        return a(i);
    }
}
