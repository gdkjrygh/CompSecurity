// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            RC2

public static class ider extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/RC2.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.RC2", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm("KeyGenerator.RC2", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        configurableprovider.addAlgorithm("KeyGenerator.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        configurableprovider.addAlgorithm("AlgorithmParameters.RC2", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("AlgorithmParameters.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("Cipher.RC2", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm("Cipher.RC2WRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(PKCSObjectIdentifiers.id_alg_CMSRC2wrap).toString(), "RC2WRAP");
        configurableprovider.addAlgorithm("Cipher.1.2.840.113549.3.2", (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm("Mac.RC2MAC", (new StringBuilder()).append(PREFIX).append("$CBCMAC").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.RC2", "RC2MAC");
        configurableprovider.addAlgorithm("Mac.RC2MAC/CFB8", (new StringBuilder()).append(PREFIX).append("$CFB8MAC").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
    }


    public ider()
    {
    }
}
