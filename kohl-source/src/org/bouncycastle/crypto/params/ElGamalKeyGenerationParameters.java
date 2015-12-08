// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ElGamalParameters

public class ElGamalKeyGenerationParameters extends KeyGenerationParameters
{

    private ElGamalParameters params;

    public ElGamalKeyGenerationParameters(SecureRandom securerandom, ElGamalParameters elgamalparameters)
    {
        super(securerandom, getStrength(elgamalparameters));
        params = elgamalparameters;
    }

    static int getStrength(ElGamalParameters elgamalparameters)
    {
        if (elgamalparameters.getL() != 0)
        {
            return elgamalparameters.getL();
        } else
        {
            return elgamalparameters.getP().bitLength();
        }
    }

    public ElGamalParameters getParameters()
    {
        return params;
    }
}
