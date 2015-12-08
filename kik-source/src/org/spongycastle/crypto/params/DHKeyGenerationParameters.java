// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            DHParameters

public class DHKeyGenerationParameters extends KeyGenerationParameters
{

    private DHParameters a;

    public DHKeyGenerationParameters(SecureRandom securerandom, DHParameters dhparameters)
    {
        int i;
        if (dhparameters.e() != 0)
        {
            i = dhparameters.e();
        } else
        {
            i = dhparameters.a().bitLength();
        }
        super(securerandom, i);
        a = dhparameters;
    }

    public final DHParameters c()
    {
        return a;
    }
}
