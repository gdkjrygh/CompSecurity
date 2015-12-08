// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class BaseKeyGenerator extends KeyGeneratorSpi
{

    protected String algName;
    protected int defaultKeySize;
    protected CipherKeyGenerator engine;
    protected int keySize;
    protected boolean uninitialised;

    protected BaseKeyGenerator(String s, int i, CipherKeyGenerator cipherkeygenerator)
    {
        uninitialised = true;
        algName = s;
        defaultKeySize = i;
        keySize = i;
        engine = cipherkeygenerator;
    }

    protected SecretKey engineGenerateKey()
    {
        if (uninitialised)
        {
            engine.init(new KeyGenerationParameters(new SecureRandom(), defaultKeySize));
            uninitialised = false;
        }
        return new SecretKeySpec(engine.generateKey(), algName);
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        try
        {
            engine.init(new KeyGenerationParameters(securerandom, i));
            uninitialised = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (SecureRandom securerandom)
        {
            throw new InvalidParameterException(securerandom.getMessage());
        }
    }

    protected void engineInit(SecureRandom securerandom)
    {
        if (securerandom != null)
        {
            engine.init(new KeyGenerationParameters(securerandom, defaultKeySize));
            uninitialised = false;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
        throws InvalidAlgorithmParameterException
    {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
