// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.DSAParameterSpec;
import org.bouncycastle.crypto.generators.DSAParametersGenerator;
import org.bouncycastle.crypto.params.DSAParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameterGenerator, BouncyCastleProvider

public static class  extends JDKAlgorithmParameterGenerator
{

    protected AlgorithmParameters engineGenerateParameters()
    {
        Object obj = new DSAParametersGenerator();
        AlgorithmParameters algorithmparameters;
        if (a != null)
        {
            ((DSAParametersGenerator) (obj)).init(b, 20, a);
        } else
        {
            ((DSAParametersGenerator) (obj)).init(b, 20, new SecureRandom());
        }
        obj = ((DSAParametersGenerator) (obj)).generateParameters();
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("DSA", BouncyCastleProvider.a);
            algorithmparameters.init(new DSAParameterSpec(((DSAParameters) (obj)).getP(), ((DSAParameters) (obj)).getQ(), ((DSAParameters) (obj)).getG()));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        if (i < 512 || i > 1024 || i % 64 != 0)
        {
            throw new InvalidParameterException("strength must be from 512 - 1024 and a multiple of 64");
        } else
        {
            b = i;
            a = securerandom;
            return;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DSA parameter generation.");
    }

    public ()
    {
    }
}
