// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            SEED

public static class mParameterGenerator extends BaseAlgorithmParameterGenerator
{

    protected AlgorithmParameters engineGenerateParameters()
    {
        byte abyte0[] = new byte[16];
        if (random == null)
        {
            random = new SecureRandom();
        }
        random.nextBytes(abyte0);
        AlgorithmParameters algorithmparameters;
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("SEED", BouncyCastleProvider.PROVIDER_NAME);
            algorithmparameters.init(new IvParameterSpec(abyte0));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for SEED parameter generation.");
    }

    public mParameterGenerator()
    {
    }
}
