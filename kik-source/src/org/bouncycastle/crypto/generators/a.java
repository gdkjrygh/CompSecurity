// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.util.BigIntegers;

final class a
{

    static final a a = new a();
    private static final BigInteger b = BigInteger.valueOf(1L);
    private static final BigInteger c = BigInteger.valueOf(2L);

    private a()
    {
    }

    final BigInteger calculatePrivate(DHParameters dhparameters, SecureRandom securerandom)
    {
        BigInteger biginteger1 = dhparameters.getP();
        int i = dhparameters.getL();
        if (i != 0)
        {
            return (new BigInteger(i, securerandom)).setBit(i - 1);
        }
        BigInteger biginteger = c;
        i = dhparameters.getM();
        if (i != 0)
        {
            biginteger = b.shiftLeft(i - 1);
        }
        biginteger1 = biginteger1.subtract(c);
        BigInteger biginteger2 = dhparameters.getQ();
        dhparameters = biginteger1;
        if (biginteger2 != null)
        {
            dhparameters = biginteger2.subtract(c);
        }
        return BigIntegers.a(biginteger, dhparameters, securerandom);
    }

    final BigInteger calculatePublic(DHParameters dhparameters, BigInteger biginteger)
    {
        return dhparameters.getG().modPow(biginteger, dhparameters.getP());
    }

}
