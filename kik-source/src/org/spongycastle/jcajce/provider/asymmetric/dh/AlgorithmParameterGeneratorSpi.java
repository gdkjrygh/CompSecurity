// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.dh;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.spongycastle.crypto.generators.DHParametersGenerator;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.jce.provider.BouncyCastleProvider;

public class AlgorithmParameterGeneratorSpi extends java.security.AlgorithmParameterGeneratorSpi
{

    protected SecureRandom a;
    protected int b;
    private int c;

    public AlgorithmParameterGeneratorSpi()
    {
        b = 1024;
        c = 0;
    }

    protected AlgorithmParameters engineGenerateParameters()
    {
        Object obj = new DHParametersGenerator();
        AlgorithmParameters algorithmparameters;
        if (a != null)
        {
            ((DHParametersGenerator) (obj)).a(b, 20, a);
        } else
        {
            ((DHParametersGenerator) (obj)).a(b, 20, new SecureRandom());
        }
        obj = ((DHParametersGenerator) (obj)).a();
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("DH", BouncyCastleProvider.a);
            algorithmparameters.init(new DHParameterSpec(((DHParameters) (obj)).a(), ((DHParameters) (obj)).b(), c));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        b = i;
        a = securerandom;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (!(algorithmparameterspec instanceof DHGenParameterSpec))
        {
            throw new InvalidAlgorithmParameterException("DH parameter generator requires a DHGenParameterSpec for initialisation");
        } else
        {
            algorithmparameterspec = (DHGenParameterSpec)algorithmparameterspec;
            b = algorithmparameterspec.getPrimeSize();
            c = algorithmparameterspec.getExponentSize();
            a = securerandom;
            return;
        }
    }
}
