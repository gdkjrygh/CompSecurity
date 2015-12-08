// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.math.BigInteger;
import org.bouncycastle.crypto.AsymmetricBlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.crypto.params.RSABlindingParameters;
import org.bouncycastle.crypto.params.RSAKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.engines:
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

    private BigInteger blindMessage(BigInteger biginteger)
    {
        return biginteger.multiply(c.modPow(b.getExponent(), b.getModulus())).mod(b.getModulus());
    }

    private BigInteger unblindMessage(BigInteger biginteger)
    {
        BigInteger biginteger1 = b.getModulus();
        return biginteger.multiply(c.modInverse(biginteger1)).mod(biginteger1);
    }

    public int getInputBlockSize()
    {
        return a.getInputBlockSize();
    }

    public int getOutputBlockSize()
    {
        return a.getOutputBlockSize();
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof ParametersWithRandom)
        {
            cipherparameters = (RSABlindingParameters)((ParametersWithRandom)cipherparameters).getParameters();
        } else
        {
            cipherparameters = (RSABlindingParameters)cipherparameters;
        }
        a.init(flag, cipherparameters.getPublicKey());
        d = flag;
        b = cipherparameters.getPublicKey();
        c = cipherparameters.getBlindingFactor();
    }

    public byte[] processBlock(byte abyte0[], int i, int j)
    {
        abyte0 = a.convertInput(abyte0, i, j);
        if (d)
        {
            abyte0 = blindMessage(abyte0);
        } else
        {
            abyte0 = unblindMessage(abyte0);
        }
        return a.convertOutput(abyte0);
    }
}
