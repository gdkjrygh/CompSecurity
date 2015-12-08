// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.ElGamalKeyGenerationParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;

// Referenced classes of package org.spongycastle.crypto.generators:
//            a

public class ElGamalKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private ElGamalKeyGenerationParameters a;

    public ElGamalKeyPairGenerator()
    {
    }

    public final AsymmetricCipherKeyPair a()
    {
        Object obj = a.a;
        obj = a.c();
        DHParameters dhparameters = new DHParameters(((ElGamalParameters) (obj)).a(), ((ElGamalParameters) (obj)).b(), ((ElGamalParameters) (obj)).c());
        java.math.BigInteger biginteger = org.spongycastle.crypto.generators.a.a(dhparameters, a.a());
        return new AsymmetricCipherKeyPair(new ElGamalPublicKeyParameters(org.spongycastle.crypto.generators.a.a(dhparameters, biginteger), ((ElGamalParameters) (obj))), new ElGamalPrivateKeyParameters(biginteger, ((ElGamalParameters) (obj))));
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        a = (ElGamalKeyGenerationParameters)keygenerationparameters;
    }
}
