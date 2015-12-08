// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ECDomainParameters

public class ECKeyGenerationParameters extends KeyGenerationParameters
{

    private ECDomainParameters domainParams;

    public ECKeyGenerationParameters(ECDomainParameters ecdomainparameters, SecureRandom securerandom)
    {
        super(securerandom, ecdomainparameters.getN().bitLength());
        domainParams = ecdomainparameters;
    }

    public ECDomainParameters getDomainParameters()
    {
        return domainParams;
    }
}
