// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.ntt.NTTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Camellia

public static class  extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/Camellia.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameters.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), "CAMELLIA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), "CAMELLIA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), "CAMELLIA");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), "CAMELLIA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), "CAMELLIA");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), "CAMELLIA");
        configurableprovider.addAlgorithm("Cipher.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm("Cipher.CAMELLIARFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211Wrap").toString());
        configurableprovider.addAlgorithm("Cipher.CAMELLIAWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NTTObjectIdentifiers.id_camellia128_wrap).toString(), "CAMELLIAWRAP");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NTTObjectIdentifiers.id_camellia192_wrap).toString(), "CAMELLIAWRAP");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NTTObjectIdentifiers.id_camellia256_wrap).toString(), "CAMELLIAWRAP");
        configurableprovider.addAlgorithm("KeyGenerator.CAMELLIA", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia128_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia192_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia256_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia128_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia192_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NTTObjectIdentifiers.id_camellia256_cbc).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
    }


    public ()
    {
    }
}
