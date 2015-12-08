// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHGenParameterSpec;
import javax.crypto.spec.DHParameterSpec;
import org.bouncycastle.crypto.generators.DHParametersGenerator;
import org.bouncycastle.crypto.params.DHParameters;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameterGenerator, BouncyCastleProvider

public static class c extends JDKAlgorithmParameterGenerator
{

    private int c;

    protected AlgorithmParameters engineGenerateParameters()
    {
        Object obj = new DHParametersGenerator();
        AlgorithmParameters algorithmparameters;
        if (a != null)
        {
            ((DHParametersGenerator) (obj)).init(b, 20, a);
        } else
        {
            ((DHParametersGenerator) (obj)).init(b, 20, new SecureRandom());
        }
        obj = ((DHParametersGenerator) (obj)).generateParameters();
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("DH", BouncyCastleProvider.a);
            algorithmparameters.init(new DHParameterSpec(((DHParameters) (obj)).getP(), ((DHParameters) (obj)).getG(), c));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
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

    public ()
    {
        c = 0;
    }
}
