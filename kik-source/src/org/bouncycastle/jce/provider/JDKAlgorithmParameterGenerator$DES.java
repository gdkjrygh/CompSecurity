// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameterGenerator, BouncyCastleProvider

public static class  extends JDKAlgorithmParameterGenerator
{

    protected AlgorithmParameters engineGenerateParameters()
    {
        byte abyte0[] = new byte[8];
        if (a == null)
        {
            a = new SecureRandom();
        }
        a.nextBytes(abyte0);
        AlgorithmParameters algorithmparameters;
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("DES", BouncyCastleProvider.a);
            algorithmparameters.init(new IvParameterSpec(abyte0));
        }
        catch (Exception exception)
        {
            throw new RuntimeException(exception.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for DES parameter generation.");
    }

    public ()
    {
    }
}
