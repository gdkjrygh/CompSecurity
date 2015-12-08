// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.gost;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.crypto.generators.GOST3410ParametersGenerator;
import org.bouncycastle.crypto.params.GOST3410Parameters;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.GOST3410ParameterSpec;
import org.bouncycastle.jce.spec.GOST3410PublicKeyParameterSetSpec;

public abstract class AlgorithmParameterGeneratorSpi extends java.security.AlgorithmParameterGeneratorSpi
{

    protected SecureRandom random;
    protected int strength;

    public AlgorithmParameterGeneratorSpi()
    {
        strength = 1024;
    }

    protected AlgorithmParameters engineGenerateParameters()
    {
        Object obj = new GOST3410ParametersGenerator();
        AlgorithmParameters algorithmparameters;
        if (random != null)
        {
            ((GOST3410ParametersGenerator) (obj)).init(strength, 2, random);
        } else
        {
            ((GOST3410ParametersGenerator) (obj)).init(strength, 2, new SecureRandom());
        }
        obj = ((GOST3410ParametersGenerator) (obj)).generateParameters();
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("GOST3410", BouncyCastleProvider.PROVIDER_NAME);
            algorithmparameters.init(new GOST3410ParameterSpec(new GOST3410PublicKeyParameterSetSpec(((GOST3410Parameters) (obj)).getP(), ((GOST3410Parameters) (obj)).getQ(), ((GOST3410Parameters) (obj)).getA())));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        strength = i;
        random = securerandom;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for GOST3410 parameter generation.");
    }
}
