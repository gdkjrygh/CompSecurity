// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.bouncycastle.crypto.params:
//            GOST3410Parameters

public class GOST3410KeyGenerationParameters extends KeyGenerationParameters
{

    private GOST3410Parameters params;

    public GOST3410KeyGenerationParameters(SecureRandom securerandom, GOST3410Parameters gost3410parameters)
    {
        super(securerandom, gost3410parameters.getP().bitLength() - 1);
        params = gost3410parameters;
    }

    public GOST3410Parameters getParameters()
    {
        return params;
    }
}
