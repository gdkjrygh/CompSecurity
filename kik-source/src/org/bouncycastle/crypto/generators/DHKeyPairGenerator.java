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
//            a

public class DHKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private DHKeyGenerationParameters a;

    public DHKeyPairGenerator()
    {
    }

    public AsymmetricCipherKeyPair generateKeyPair()
    {
        a a1 = a.a;
        org.bouncycastle.crypto.params.DHParameters dhparameters = a.getParameters();
        java.math.BigInteger biginteger = a1.calculatePrivate(dhparameters, a.getRandom());
        return new AsymmetricCipherKeyPair(new DHPublicKeyParameters(a1.calculatePublic(dhparameters, biginteger), dhparameters), new DHPrivateKeyParameters(biginteger, dhparameters));
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        a = (DHKeyGenerationParameters)keygenerationparameters;
    }
}
