// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.ntt.NTTObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Camellia

public static class  extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/Camellia.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameters.CAMELLIA", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.a).toString(), "CAMELLIA");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.b).toString(), "CAMELLIA");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NTTObjectIdentifiers.c).toString(), "CAMELLIA");
        configurableprovider.a("AlgorithmParameterGenerator.CAMELLIA", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.a).toString(), "CAMELLIA");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.b).toString(), "CAMELLIA");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NTTObjectIdentifiers.c).toString(), "CAMELLIA");
        configurableprovider.a("Cipher.CAMELLIA", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NTTObjectIdentifiers.c).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("Cipher.CAMELLIARFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211Wrap").toString());
        configurableprovider.a("Cipher.CAMELLIAWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.d).toString(), "CAMELLIAWRAP");
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.e).toString(), "CAMELLIAWRAP");
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NTTObjectIdentifiers.f).toString(), "CAMELLIAWRAP");
        configurableprovider.a("KeyGenerator.CAMELLIA", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.d).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.e).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.f).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.a).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.b).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NTTObjectIdentifiers.c).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
    }


    public ()
    {
    }
}
