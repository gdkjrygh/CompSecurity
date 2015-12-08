// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSABlindingParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;

// Referenced classes of package org.spongycastle.crypto.engines:
//            a

public class RSABlindingEngine
    implements AsymmetricBlockCipher
{

    private a a;
    private RSAKeyParameters b;
    private BigInteger c;
    private boolean d;

    public RSABlindingEngine()
    {
        a = new a();
    }

    public final int a()
    {
        return a.a();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (RSABlindingParameters)((ParametersWithRandom)cipherparameters).b();
        } else
        {
            cipherparameters = (RSABlindingParameters)cipherparameters;
        }
        a.a(flag, cipherparameters.a());
        d = flag;
        b = cipherparameters.a();
        c = cipherparameters.b();
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        abyte0 = a.a(abyte0, i, j);
        if (d)
        {
            abyte0 = abyte0.multiply(c.modPow(b.c(), b.b())).mod(b.b());
        } else
        {
            BigInteger biginteger = b.b();
            abyte0 = abyte0.multiply(c.modInverse(biginteger)).mod(biginteger);
        }
        return a.a(abyte0);
    }

    public final int b()
    {
        return a.b();
    }
}
