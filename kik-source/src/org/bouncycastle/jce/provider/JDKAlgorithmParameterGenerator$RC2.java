// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKAlgorithmParameterGenerator, BouncyCastleProvider

public static class c extends JDKAlgorithmParameterGenerator
{

    RC2ParameterSpec c;

    protected AlgorithmParameters engineGenerateParameters()
    {
        if (c == null)
        {
            byte abyte0[] = new byte[8];
            if (a == null)
            {
                a = new SecureRandom();
            }
            a.nextBytes(abyte0);
            AlgorithmParameters algorithmparameters1;
            try
            {
                algorithmparameters1 = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.a);
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
            algorithmparameters = AlgorithmParameters.getInstance("RC2", BouncyCastleProvider.a);
            algorithmparameters.init(c);
        }
        catch (Exception exception1)
        {
            throw new RuntimeException(exception1.getMessage());
        }
        return algorithmparameters;
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        if (algorithmparameterspec instanceof RC2ParameterSpec)
        {
            c = (RC2ParameterSpec)algorithmparameterspec;
            return;
        } else
        {
            throw new InvalidAlgorithmParameterException("No supported AlgorithmParameterSpec for RC2 parameter generation.");
        }
    }

    public ()
    {
        c = null;
    }
}
