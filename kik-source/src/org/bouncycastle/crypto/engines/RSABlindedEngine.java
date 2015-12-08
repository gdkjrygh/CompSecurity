// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSAKeyParameters;
import org.bouncycastle.crypto.params.RSAPrivateCrtKeyParameters;
import org.bouncycastle.util.BigIntegers;

// Referenced classes of package org.bouncycastle.crypto.engines:
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

    public int getInputBlockSize()
    {
        return b.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return b.getOutputBlockSize();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        b.init(flag, cipherparameters);
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (ParametersWithRandom)cipherparameters;
            c = (RSAKeyParameters)cipherparameters.getParameters();
            d = cipherparameters.getRandom();
            return;
        } else
        {
            c = (RSAKeyParameters)cipherparameters;
            d = new SecureRandom();
            return;
        }
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        if (c == null)
        {
            throw new IllegalStateException("RSA engine not initialised");
        }
        abyte0 = b.convertInput(abyte0, i, j);
        if (c instanceof RSAPrivateCrtKeyParameters)
        {
            Object obj = (RSAPrivateCrtKeyParameters)c;
            BigInteger biginteger = ((RSAPrivateCrtKeyParameters) (obj)).getPublicExponent();
            if (biginteger != null)
            {
                obj = ((RSAPrivateCrtKeyParameters) (obj)).getModulus();
                BigInteger biginteger1 = BigIntegers.a(a, ((BigInteger) (obj)).subtract(a), d);
                abyte0 = biginteger1.modPow(biginteger, ((BigInteger) (obj))).multiply(abyte0).mod(((BigInteger) (obj)));
                abyte0 = b.processBlock(abyte0).multiply(biginteger1.modInverse(((BigInteger) (obj)))).mod(((BigInteger) (obj)));
            } else
            {
                abyte0 = b.processBlock(abyte0);
            }
        } else
        {
            abyte0 = b.processBlock(abyte0);
        }
        return b.convertOutput(abyte0);
    }

}
