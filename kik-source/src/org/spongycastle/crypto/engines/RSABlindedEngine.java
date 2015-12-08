// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.AsymmetricBlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.params.ParametersWithRandom;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.spongycastle.util.BigIntegers;

// Referenced classes of package org.spongycastle.crypto.engines:
//            a

public class RSABlindedEngine
    implements AsymmetricBlockCipher
{

    private static BigInteger a = BigInteger.valueOf(1L);
    private a b;
    private RSAKeyParameters c;
    private SecureRandom d;

    public RSABlindedEngine()
    {
        b = new a();
    }

    public final int a()
    {
        return b.a();
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        b.a(flag, cipherparameters);
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            c = (RSAKeyParameters)cipherparameters.b();
            d = cipherparameters.a();
            return;
        } else
        {
            c = (RSAKeyParameters)cipherparameters;
            d = new SecureRandom();
            return;
        }
    }

    public final byte[] a(byte abyte0[], int i, int j)
    {
        if (c == null)
        {
            throw new IllegalStateException("RSA engine not initialised");
        }
        abyte0 = b.a(abyte0, i, j);
        if (c instanceof RSAPrivateCrtKeyParameters)
        {
            Object obj = (RSAPrivateCrtKeyParameters)c;
            BigInteger biginteger = ((RSAPrivateCrtKeyParameters) (obj)).d();
            if (biginteger != null)
            {
                obj = ((RSAPrivateCrtKeyParameters) (obj)).b();
                BigInteger biginteger1 = BigIntegers.a(a, ((BigInteger) (obj)).subtract(a), d);
                abyte0 = biginteger1.modPow(biginteger, ((BigInteger) (obj))).multiply(abyte0).mod(((BigInteger) (obj)));
                abyte0 = b.b(abyte0).multiply(biginteger1.modInverse(((BigInteger) (obj)))).mod(((BigInteger) (obj)));
            } else
            {
                abyte0 = b.b(abyte0);
            }
        } else
        {
            abyte0 = b.b(abyte0);
        }
        return b.a(abyte0);
    }

    public final int b()
    {
        return b.b();
    }

}
