// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            DES

public static class ider extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/DES.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("Cipher.DES", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(OIWObjectIdentifiers.e).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        ASN1ObjectIdentifier asn1objectidentifier = OIWObjectIdentifiers.e;
        configurableprovider.a((new StringBuilder("Alg.Alias.KeyGenerator.")).append(asn1objectidentifier.c()).toString(), "DES");
        configurableprovider.a((new StringBuilder("Alg.Alias.KeyFactory.")).append(asn1objectidentifier.c()).toString(), "DES");
        configurableprovider.a("Cipher.DESRFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211").toString());
        configurableprovider.a("KeyGenerator.DES", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        configurableprovider.a("SecretKeyFactory.DES", (new StringBuilder()).append(a).append("$KeyFactory").toString());
        configurableprovider.a("Mac.DESCMAC", (new StringBuilder()).append(a).append("$CMAC").toString());
        configurableprovider.a("Mac.DESMAC", (new StringBuilder()).append(a).append("$CBCMAC").toString());
        configurableprovider.a("Alg.Alias.Mac.DES", "DESMAC");
        configurableprovider.a("Mac.DESMAC/CFB8", (new StringBuilder()).append(a).append("$DESCFB8").toString());
        configurableprovider.a("Alg.Alias.Mac.DES/CFB8", "DESMAC/CFB8");
        configurableprovider.a("Mac.DESMAC64", (new StringBuilder()).append(a).append("$DES64").toString());
        configurableprovider.a("Alg.Alias.Mac.DES64", "DESMAC64");
        configurableprovider.a("Mac.DESMAC64WITHISO7816-4PADDING", (new StringBuilder()).append(a).append("$DES64with7816d4").toString());
        configurableprovider.a("Alg.Alias.Mac.DES64WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableprovider.a("Alg.Alias.Mac.DESISO9797ALG1MACWITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableprovider.a("Alg.Alias.Mac.DESISO9797ALG1WITHISO7816-4PADDING", "DESMAC64WITHISO7816-4PADDING");
        configurableprovider.a("AlgorithmParameters.DES", "org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(OIWObjectIdentifiers.e).toString(), "DES");
        configurableprovider.a("AlgorithmParameterGenerator.DES", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(OIWObjectIdentifiers.e).toString(), "DES");
    }


    public ider()
    {
    }
}
