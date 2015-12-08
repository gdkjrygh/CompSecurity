// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DHParameters

public class DHKeyGenerationParameters extends KeyGenerationParameters
{

    private DHParameters params;

    public DHKeyGenerationParameters(SecureRandom securerandom, DHParameters dhparameters)
    {
        super(securerandom, getStrength(dhparameters));
        params = dhparameters;
    }

    static int getStrength(DHParameters dhparameters)
    {
        if (dhparameters.getL() != 0)
        {
            return dhparameters.getL();
        } else
        {
            return dhparameters.getP().bitLength();
        }
    }

    public DHParameters getParameters()
    {
        return params;
    }
}
