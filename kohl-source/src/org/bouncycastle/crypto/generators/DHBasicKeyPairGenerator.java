// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DHKeyGenerationParameters;
import org.bouncycastle.crypto.params.DHPrivateKeyParameters;
import org.bouncycastle.crypto.params.DHPublicKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            DHKeyGeneratorHelper

public class DHBasicKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private DHKeyGenerationParameters param;

    public DHBasicKeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        DHKeyGeneratorHelper dhkeygeneratorhelper = DHKeyGeneratorHelper.INSTANCE;
        org.bouncycastle.crypto.params.DHParameters dhparameters = param.getParameters();
        java.math.BigInteger biginteger = dhkeygeneratorhelper.calculatePrivate(dhparameters, param.getRandom());
        return new AsymmetricCipherKeyPair(new DHPublicKeyParameters(dhkeygeneratorhelper.calculatePublic(dhparameters, biginteger), dhparameters), new DHPrivateKeyParameters(biginteger, dhparameters));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        param = (DHKeyGenerationParameters)keygenerationparameters;
    }
}
