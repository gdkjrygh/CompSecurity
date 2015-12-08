// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            Camellia

public static class put extends HashMap
{

    public ()
    {
        put("AlgorithmParameters.CAMELLIA", "org.bouncycastle.jce.provider.symmetric.Camellia$AlgParams");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.a).toString(), "CAMELLIA");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.b).toString(), "CAMELLIA");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.c).toString(), "CAMELLIA");
        put("AlgorithmParameterGenerator.CAMELLIA", "org.bouncycastle.jce.provider.symmetric.Camellia$AlgParamGen");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.a).toString(), "CAMELLIA");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.b).toString(), "CAMELLIA");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.c).toString(), "CAMELLIA");
        put("Cipher.CAMELLIA", "org.bouncycastle.jce.provider.symmetric.Camellia$ECB");
        put((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.a).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$CBC");
        put((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.b).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$CBC");
        put((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.c).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$CBC");
        put("Cipher.CAMELLIARFC3211WRAP", "org.bouncycastle.jce.provider.symmetric.Camellia$RFC3211Wrap");
        put("Cipher.CAMELLIAWRAP", "org.bouncycastle.jce.provider.symmetric.Camellia$Wrap");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.d).toString(), "CAMELLIAWRAP");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.e).toString(), "CAMELLIAWRAP");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.f).toString(), "CAMELLIAWRAP");
        put("KeyGenerator.CAMELLIA", "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen");
        put((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.d).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.e).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.f).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen256");
        put((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.a).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.b).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.c).toString(), "org.bouncycastle.jce.provider.symmetric.Camellia$KeyGen256");
    }
}
