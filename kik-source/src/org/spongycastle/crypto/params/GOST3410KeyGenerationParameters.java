// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;

// Referenced classes of package org.spongycastle.crypto.params:
//            GOST3410Parameters

public class GOST3410KeyGenerationParameters extends KeyGenerationParameters
{

    private GOST3410Parameters a;

    public GOST3410KeyGenerationParameters(SecureRandom securerandom, GOST3410Parameters gost3410parameters)
    {
        super(securerandom, gost3410parameters.a().bitLength() - 1);
        a = gost3410parameters;
    }

    public final GOST3410Parameters c()
    {
        return a;
    }
}
