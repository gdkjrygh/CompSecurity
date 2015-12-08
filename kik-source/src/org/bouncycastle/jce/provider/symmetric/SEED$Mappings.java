// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            SEED

public static class put extends HashMap
{

    public ()
    {
        put("AlgorithmParameters.SEED", "org.bouncycastle.jce.provider.symmetric.SEED$AlgParams");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(KISAObjectIdentifiers.a).toString(), "SEED");
        put("AlgorithmParameterGenerator.SEED", "org.bouncycastle.jce.provider.symmetric.SEED$AlgParamGen");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(KISAObjectIdentifiers.a).toString(), "SEED");
        put("Cipher.SEED", "org.bouncycastle.jce.provider.symmetric.SEED$ECB");
        put((new StringBuilder("Cipher.")).append(KISAObjectIdentifiers.a).toString(), "org.bouncycastle.jce.provider.symmetric.SEED$CBC");
        put("Cipher.SEEDWRAP", "org.bouncycastle.jce.provider.symmetric.SEED$Wrap");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(KISAObjectIdentifiers.b).toString(), "SEEDWRAP");
        put("KeyGenerator.SEED", "org.bouncycastle.jce.provider.symmetric.SEED$KeyGen");
        put((new StringBuilder("KeyGenerator.")).append(KISAObjectIdentifiers.a).toString(), "org.bouncycastle.jce.provider.symmetric.SEED$KeyGen");
        put((new StringBuilder("KeyGenerator.")).append(KISAObjectIdentifiers.b).toString(), "org.bouncycastle.jce.provider.symmetric.SEED$KeyGen");
    }
}
