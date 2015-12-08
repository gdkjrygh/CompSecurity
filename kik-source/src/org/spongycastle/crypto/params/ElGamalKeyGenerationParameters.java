// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            ElGamalParameters

public class ElGamalKeyGenerationParameters extends KeyGenerationParameters
{

    private ElGamalParameters a;

    public ElGamalKeyGenerationParameters(SecureRandom securerandom, ElGamalParameters elgamalparameters)
    {
        int i;
        if (elgamalparameters.c() != 0)
        {
            i = elgamalparameters.c();
        } else
        {
            i = elgamalparameters.a().bitLength();
        }
        super(securerandom, i);
        a = elgamalparameters;
    }

    public final ElGamalParameters c()
    {
        return a;
    }
}
