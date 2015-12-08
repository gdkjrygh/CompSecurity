// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.kisa.KISAObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            SEED

public static class der extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/SEED.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameters.SEED", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(KISAObjectIdentifiers.id_seedCBC).toString(), "SEED");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.SEED", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(KISAObjectIdentifiers.id_seedCBC).toString(), "SEED");
        configurableprovider.addAlgorithm("Cipher.SEED", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(KISAObjectIdentifiers.id_seedCBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm("Cipher.SEEDWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap).toString(), "SEEDWRAP");
        configurableprovider.addAlgorithm("KeyGenerator.SEED", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(KISAObjectIdentifiers.id_seedCBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(KISAObjectIdentifiers.id_npki_app_cmsSeed_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
    }


    public der()
    {
    }
}
