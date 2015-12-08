// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            DESede

public static class r extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/DESede.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.DESEDE", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.B).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("Cipher.DESEDEWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.bx).toString(), (new StringBuilder()).append(a).append("$Wrap").toString());
        configurableprovider.a("Cipher.DESEDERFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211").toString());
        if (configurableprovider.b("MessageDigest", "SHA-1"))
        {
            configurableprovider.a("Cipher.PBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndDES3Key").toString());
            configurableprovider.a("Cipher.BROKENPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$BrokePBEWithSHAAndDES3Key").toString());
            configurableprovider.a("Cipher.OLDPBEWITHSHAAND3-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$OldPBEWithSHAAndDES3Key").toString());
            configurableprovider.a("Cipher.PBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndDES2Key").toString());
            configurableprovider.a("Cipher.BROKENPBEWITHSHAAND2-KEYTRIPLEDES-CBC", (new StringBuilder()).append(a).append("$BrokePBEWithSHAAndDES2Key").toString());
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.bs).toString(), "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.bt).toString(), "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
            configurableprovider.a("Alg.Alias.Cipher.PBEWITHSHA1ANDDESEDE", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableprovider.a("Alg.Alias.Cipher.PBEWITHSHA1AND3-KEYTRIPLEDES-CBC", "PBEWITHSHAAND3-KEYTRIPLEDES-CBC");
            configurableprovider.a("Alg.Alias.Cipher.PBEWITHSHA1AND2-KEYTRIPLEDES-CBC", "PBEWITHSHAAND2-KEYTRIPLEDES-CBC");
        }
        configurableprovider.a("KeyGenerator.DESEDE", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(PKCSObjectIdentifiers.B).toString(), (new StringBuilder()).append(a).append("$KeyGenerator3").toString());
        configurableprovider.a("KeyGenerator.DESEDEWRAP", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        configurableprovider.a("SecretKeyFactory.DESEDE", (new StringBuilder()).append(a).append("$KeyFactory").toString());
        configurableprovider.a("Mac.DESEDECMAC", (new StringBuilder()).append(a).append("$CMAC").toString());
        configurableprovider.a("Mac.DESEDEMAC", (new StringBuilder()).append(a).append("$CBCMAC").toString());
        configurableprovider.a("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
        configurableprovider.a("Mac.DESEDEMAC/CFB8", (new StringBuilder()).append(a).append("$DESedeCFB8").toString());
        configurableprovider.a("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
        configurableprovider.a("Mac.DESEDEMAC64", (new StringBuilder()).append(a).append("$DESede64").toString());
        configurableprovider.a("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
        configurableprovider.a("Mac.DESEDEMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(a).append("$DESede64with7816d4").toString());
        configurableprovider.a("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableprovider.a("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableprovider.a("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        configurableprovider.a("AlgorithmParameters.DESEDE", "org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(PKCSObjectIdentifiers.B).toString(), "DESEDE");
        configurableprovider.a("AlgorithmParameterGenerator.DESEDE", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(PKCSObjectIdentifiers.B).toString(), "DESEDE");
    }


    public r()
    {
    }
}
