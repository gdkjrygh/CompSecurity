// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import org.bouncycastle.crypto.AsymmetricCipherKeyPair;
import org.bouncycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DHParameters;
import org.bouncycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.bouncycastle.crypto.params.ElGamalParameters;
import org.bouncycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.bouncycastle.crypto.params.ElGamalPublicKeyParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            DHKeyGeneratorHelper

public class ElGamalKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private ElGamalKeyGenerationParameters param;

    public ElGamalKeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        DHKeyGeneratorHelper dhkeygeneratorhelper = DHKeyGeneratorHelper.INSTANCE;
        ElGamalParameters elgamalparameters = param.getParameters();
        DHParameters dhparameters = new DHParameters(elgamalparameters.getP(), elgamalparameters.getG(), null, elgamalparameters.getL());
        java.math.BigInteger biginteger = dhkeygeneratorhelper.calculatePrivate(dhparameters, param.getRandom());
        return new AsymmetricCipherKeyPair(new ElGamalPublicKeyParameters(dhkeygeneratorhelper.calculatePublic(dhparameters, biginteger), elgamalparameters), new ElGamalPrivateKeyParameters(biginteger, elgamalparameters));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        param = (ElGamalKeyGenerationParameters)keygenerationparameters;
    }
}
