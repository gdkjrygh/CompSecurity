// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import org.spongycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameterGenerator;
import org.spongycastle.jce.provider.BouncyCastleProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            CAST5

public static class ParameterGenerator extends BaseAlgorithmParameterGenerator
{

    protected AlgorithmParameters engineGenerateParameters()
    {
        byte abyte0[] = new byte[8];
        if (b == null)
        {
            b = new SecureRandom();
        }
        b.nextBytes(abyte0);
        AlgorithmParameters algorithmparameters;
        try
        {
            algorithmparameters = AlgorithmParameters.getInstance("CAST5", BouncyCastleProvider.a);
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
        throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for CAST5 parameter generation.");
    }

    public ParameterGenerator()
    {
    }
}
