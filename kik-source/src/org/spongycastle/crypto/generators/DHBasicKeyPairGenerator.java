// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import org.spongycastle.crypto.AsymmetricCipherKeyPair;
import org.spongycastle.crypto.AsymmetricCipherKeyPairGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DHKeyGenerationParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;

// Referenced classes of package org.spongycastle.crypto.generators:
//            a

public class DHBasicKeyPairGenerator
    implements AsymmetricCipherKeyPairGenerator
{

    private DHKeyGenerationParameters a;

    public DHBasicKeyPairGenerator()
    {
    }

    public final AsymmetricCipherKeyPair a()
    {
        Object obj = a.a;
        obj = a.c();
        java.math.BigInteger biginteger = org.spongycastle.crypto.generators.a.a(((org.spongycastle.crypto.params.DHParameters) (obj)), a.a());
        return new AsymmetricCipherKeyPair(new DHPublicKeyParameters(org.spongycastle.crypto.generators.a.a(((org.spongycastle.crypto.params.DHParameters) (obj)), biginteger), ((org.spongycastle.crypto.params.DHParameters) (obj))), new DHPrivateKeyParameters(biginteger, ((org.spongycastle.crypto.params.DHParameters) (obj))));
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        a = (DHKeyGenerationParameters)keygenerationparameters;
    }
}
