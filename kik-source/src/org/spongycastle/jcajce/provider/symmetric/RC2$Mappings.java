// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            RC2

public static class ider extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/RC2.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameterGenerator.RC2", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("AlgorithmParameterGenerator.1.2.840.113549.3.2", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("KeyGenerator.RC2", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        configurableprovider.a("KeyGenerator.1.2.840.113549.3.2", (new StringBuilder()).append(a).append("$KeyGenerator").toString());
        configurableprovider.a("AlgorithmParameters.RC2", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("AlgorithmParameters.1.2.840.113549.3.2", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Cipher.RC2", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("Cipher.RC2WRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(PKCSObjectIdentifiers.by).toString(), "RC2WRAP");
        configurableprovider.a("Cipher.1.2.840.113549.3.2", (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("Mac.RC2MAC", (new StringBuilder()).append(a).append("$CBCMAC").toString());
        configurableprovider.a("Alg.Alias.Mac.RC2", "RC2MAC");
        configurableprovider.a("Mac.RC2MAC/CFB8", (new StringBuilder()).append(a).append("$CFB8MAC").toString());
        configurableprovider.a("Alg.Alias.Mac.RC2/CFB8", "RC2MAC/CFB8");
    }


    public ider()
    {
    }
}
