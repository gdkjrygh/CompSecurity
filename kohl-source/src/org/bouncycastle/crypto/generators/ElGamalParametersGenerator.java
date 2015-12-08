// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.params.ElGamalParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            DHParametersHelper

public class ElGamalParametersGenerator
{

    private int certainty;
    private SecureRandom random;
    private int size;

    public ElGamalParametersGenerator()
    {
    }

    public ElGamalParameters generateParameters()
    {
        java.math.BigInteger abiginteger[] = DHParametersHelper.generateSafePrimes(size, certainty, random);
        java.math.BigInteger biginteger = abiginteger[0];
        return new ElGamalParameters(biginteger, DHParametersHelper.selectGenerator(biginteger, abiginteger[1], random));
    }

    public void init(int i, int j, SecureRandom securerandom)
    {
        size = i;
        certainty = j;
        random = securerandom;
    }
}
