// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            AES

public static class ider extends AlgorithmProvider
{

    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/AES.getName();
    private static final String wrongAES128 = "2.16.840.1.101.3.4.2";
    private static final String wrongAES192 = "2.16.840.1.101.3.4.22";
    private static final String wrongAES256 = "2.16.840.1.101.3.4.42";

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("AlgorithmParameters.AES", (new StringBuilder()).append(PREFIX).append("$AlgParams").toString());
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), "AES");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.AES", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
        configurableprovider.addAlgorithm("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), "AES");
        configurableprovider.addAlgorithm("Cipher.AES", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
        configurableprovider.addAlgorithm("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$OFB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$OFB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$OFB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes128_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$CFB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes192_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$CFB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(NISTObjectIdentifiers.id_aes256_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$CFB").toString());
        configurableprovider.addAlgorithm("Cipher.AESWRAP", (new StringBuilder()).append(PREFIX).append("$Wrap").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NISTObjectIdentifiers.id_aes128_wrap).toString(), "AESWRAP");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NISTObjectIdentifiers.id_aes192_wrap).toString(), "AESWRAP");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.Cipher.").append(NISTObjectIdentifiers.id_aes256_wrap).toString(), "AESWRAP");
        configurableprovider.addAlgorithm("Cipher.AESRFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211Wrap").toString());
        configurableprovider.addAlgorithm("KeyGenerator.AES", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.2", (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.22", (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm("KeyGenerator.2.16.840.1.101.3.4.42", (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_ECB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_CBC).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_OFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_CFB).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm("KeyGenerator.AESWRAP", (new StringBuilder()).append(PREFIX).append("$KeyGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes128_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen128").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes192_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen192").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("KeyGenerator.").append(NISTObjectIdentifiers.id_aes256_wrap).toString(), (new StringBuilder()).append(PREFIX).append("$KeyGen256").toString());
        configurableprovider.addAlgorithm("Mac.AESCMAC", (new StringBuilder()).append(PREFIX).append("$AESCMAC").toString());
    }


    public ider()
    {
    }
}
