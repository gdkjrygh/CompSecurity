// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            DES

public static class ider extends AlgorithmProvider
{

    private static final String PACKAGE = "org.bouncycastle.jcajce.provider.symmetric";
    private static final String PREFIX = org/bouncycastle/jcajce/provider/symmetric/DES.getName();

    private void addAlias(ConfigurableProvider configurableprovider, ASN1ObjectIdentifier asn1objectidentifier, String s)
    {
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyGenerator.").append(asn1objectidentifier.getId()).toString(), s);
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.KeyFactory.").append(asn1objectidentifier.getId()).toString(), s);
    }

    public void configure(ConfigurableProvider configurableprovider)
    {
        configurableprovider.addAlgorithm("Cipher.DES", (new StringBuilder()).append(PREFIX).append("$ECB").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Cipher.").append(OIWObjectIdentifiers.desCBC).toString(), (new StringBuilder()).append(PREFIX).append("$CBC").toString());
        addAlias(configurableprovider, OIWObjectIdentifiers.desCBC, "DES");
        configurableprovider.addAlgorithm("Cipher.DESRFC3211WRAP", (new StringBuilder()).append(PREFIX).append("$RFC3211").toString());
        configurableprovider.addAlgorithm("KeyGenerator.DES", (new StringBuilder()).append(PREFIX).append("$KeyGenerator").toString());
        configurableprovider.addAlgorithm("SecretKeyFactory.DES", (new StringBuilder()).append(PREFIX).append("$KeyFactory").toString());
        configurableprovider.addAlgorithm("Mac.DESCMAC", (new StringBuilder()).append(PREFIX).append("$CMAC").toString());
        configurableprovider.addAlgorithm("Mac.DESMAC", (new StringBuilder()).append(PREFIX).append("$CBCMAC").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DES", "DESMAC");
        configurableprovider.addAlgorithm("Mac.DESMAC/CFB8", (new StringBuilder()).append(PREFIX).append("$DESCFB8").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
        configurableprovider.addAlgorithm("Mac.DESMAC64", (new StringBuilder()).append(PREFIX).append("$DES64").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DES64", "DESMAC64");
        configurableprovider.addAlgorithm("Mac.DESMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(PREFIX).append("$DES64with7816d4").toString());
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableprovider.addAlgorithm("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableprovider.addAlgorithm("AlgorithmParameters.DES", "org.bouncycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameters.").append(OIWObjectIdentifiers.desCBC).toString(), "DES");
        configurableprovider.addAlgorithm("AlgorithmParameterGenerator.DES", (new StringBuilder()).append(PREFIX).append("$AlgParamGen").toString());
        configurableprovider.addAlgorithm((new StringBuilder()).append("Alg.Alias.AlgorithmParameterGenerator.").append(OIWObjectIdentifiers.desCBC).toString(), "DES");
    }


    public ider()
    {
    }
}
