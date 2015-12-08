// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;

public class BaseKeyGenerator extends KeyGeneratorSpi
{

    protected String a;
    protected int b;
    protected int c;
    protected CipherKeyGenerator d;
    protected boolean e;

    protected BaseKeyGenerator(String s, int i, CipherKeyGenerator cipherkeygenerator)
    {
        e = true;
        a = s;
        c = i;
        b = i;
        d = cipherkeygenerator;
    }

    protected SecretKey engineGenerateKey()
    {
        if (e)
        {
            d.a(new KeyGenerationParameters(new SecureRandom(), c));
            e = false;
        }
        return new SecretKeySpec(d.a(), a);
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        try
        {
            d.a(new KeyGenerationParameters(securerandom, i));
            e = false;
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
            d.a(new KeyGenerationParameters(securerandom, c));
            e = false;
        }
    }

    protected void engineInit(AlgorithmParameterSpec algorithmparameterspec, SecureRandom securerandom)
    {
        throw new InvalidAlgorithmParameterException("Not Implemented");
    }
}
