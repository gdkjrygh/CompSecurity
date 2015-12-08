// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.bouncycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            RC2

public static class spec extends BaseAlgorithmParameterGenerator
{

    RC2ParameterSpec spec;

    protected AlgorithmParameters engineGenerateParameters()
    {
        if (spec == null)
        {
            byte abyte0[] = new byte[8];
            if (random == null)
            {
                random = new SecureRandom();
            }
            random.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters1;
            try
            {
                algorithmparameters1 = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.PROVIDER_NAME);
                algorithmparameters1.init(new IvParameterSpec(abyte0));
            }
            catch (Exception exception)
            {
                throw new RuntimeException(exception.getMessage());
            }
            return algorithmparameters1;
        }
        AlgorithmParameters algorithmparameters;
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.PROVIDER_NAME);
            algorithmparameters.init(spec);
        }
        catch (Exception exception1)
        {
            throw new RuntimeException(exception1.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        if (algorithmparameterspec instanceof RC2ParameterSpec)
        {
            spec = (RC2ParameterSpec)algorithmparameterspec;
            return;
        } else
        {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
        }
    }

    public hmParameterGenerator()
    {
        spec = null;
    }
}
