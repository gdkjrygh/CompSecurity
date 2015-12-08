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
//            a

public class ElGamalKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private ElGamalKeyGenerationParameters a;

    public ElGamalKeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        a a1 = a.a;
        ElGamalParameters elgamalparameters = a.getParameters();
        DHParameters dhparameters = new DHParameters(elgamalparameters.getP(), elgamalparameters.getG(), null, elgamalparameters.getL());
        java.math.BigInteger biginteger = a1.calculatePrivate(dhparameters, a.getRandom());
        return new AsymmetricCipherKeyPair(new ElGamalPublicKeyParameters(a1.calculatePublic(dhparameters, biginteger), elgamalparameters), new ElGamalPrivateKeyParameters(biginteger, elgamalparameters));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        a = (ElGamalKeyGenerationParameters)keygenerationparameters;
    }
}
