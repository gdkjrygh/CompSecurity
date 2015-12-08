// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            DESede

public static class r extends AlgorithmProvider
{

    private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/DESede.getName();

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("Cipher.DESEDE", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm("Cipher.DESEDEWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(PKCSObjectIdentifiers.id_alg_CMS3DESwrap).toString(), (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
        configurableprovider.addAlgorithm("Cipher.DESEDERFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211").toString());
        if (configurableprovider.hasAlgorithm("MessageDigest", "SHA-1"))
        {
            configurableprovider.addAlgorithm("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$PBEWithSHAAndDES3Key").toString());
            configurableprovider.addAlgorithm("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$BrokePBEWithSHAAndDES3Key").toString());
            configurableprovider.addAlgorithm("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$OldPBEWithSHAAndDES3Key").toString());
            configurableprovider.addAlgorithm("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$PBEWithSHAAndDES2Key").toString());
            configurableprovider.addAlgorithm("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(PREFIX).append("$BrokePBEWithSHAAndDES2Key").toString());
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(PKCSObjectIdentifiers.pbeWithSHAAnd3_KeyTripleDES_CBC).toString(), "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(PKCSObjectIdentifiers.pbeWithSHAAnd2_KeyTripleDES_CBC).toString(), "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableprovider.addAlgorithm("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        }
        configurableprovider.addAlgorithm("KeyGenerator.DESEDE", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGenerator3").toString());
        configurableprovider.addAlgorithm("KeyGenerator.DESEDEWRAP", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        configurableprovider.addAlgorithm("SecretKeyFactory.DESEDE", (new StringBuilder()).append(PREFIX).append("$KeyFactory").toString());
        configurableprovider.addAlgorithm("Mac.DESEDECMAC", (new StringBuilder()).append(PREFIX).append("$CMAC").toString());
        configurableprovider.addAlgorithm("Mac.DESEDEMAC", (new StringBuilder()).append(PREFIX).append("$CBCMAC").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
        configurableprovider.addAlgorithm("Mac.DESEDEMAC/CFB8", (new StringBuilder()).append(PREFIX).append("$DESedeCFB8").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
        configurableprovider.addAlgorithm("Mac.DESEDEMAC64", (new StringBuilder()).append(PREFIX).append("$DESede64").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
        configurableprovider.addAlgorithm("Mac.DESEDEMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(PREFIX).append("$DESede64with7816d4").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableprovider.addAlgorithm("AlgorithmParameters.DESEDE", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), "DESEDE");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.DESEDE", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(PKCSObjectIdentifiers.des_EDE3_CBC).toString(), "DESEDE");
    }


    public r()
    {
    }
}
