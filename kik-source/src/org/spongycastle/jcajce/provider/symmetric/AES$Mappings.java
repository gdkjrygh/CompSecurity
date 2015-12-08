// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.asn1.nist.NISTObjectIdentifiers;
import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            AES

public static class ider extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/AES.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameters.AES", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.h).toString(), "AES");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.o).toString(), "AES");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.v).toString(), "AES");
        configurableprovider.a("AlgorithmParameterGenerator.AES", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
        configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
        configurableprovider.a("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.h).toString(), "AES");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.o).toString(), "AES");
        configurableprovider.a((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.v).toString(), "AES");
        configurableprovider.a("Cipher.AES", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
        configurableprovider.a("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
        configurableprovider.a("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.g).toString(), (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.n).toString(), (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.u).toString(), (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.h).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.o).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.v).toString(), (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.i).toString(), (new StringBuilder()).append(a).append("$OFB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.p).toString(), (new StringBuilder()).append(a).append("$OFB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.w).toString(), (new StringBuilder()).append(a).append("$OFB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.j).toString(), (new StringBuilder()).append(a).append("$CFB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.q).toString(), (new StringBuilder()).append(a).append("$CFB").toString());
        configurableprovider.a((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.x).toString(), (new StringBuilder()).append(a).append("$CFB").toString());
        configurableprovider.a("Cipher.AESWRAP", (new StringBuilder()).append(a).append("$Wrap").toString());
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.k).toString(), "AESWRAP");
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.r).toString(), "AESWRAP");
        configurableprovider.a((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.y).toString(), "AESWRAP");
        configurableprovider.a("Cipher.AESRFC3211WRAP", (new StringBuilder()).append(a).append("$RFC3211Wrap").toString());
        configurableprovider.a("KeyGenerator.AES", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("KeyGenerator.2.16.840.1.101.3.4.2", (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a("KeyGenerator.2.16.840.1.101.3.4.22", (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a("KeyGenerator.2.16.840.1.101.3.4.42", (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.g).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.h).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.i).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.j).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.n).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.o).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.p).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.q).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.u).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.v).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.w).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.x).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a("KeyGenerator.AESWRAP", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.k).toString(), (new StringBuilder()).append(a).append("$KeyGen128").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.r).toString(), (new StringBuilder()).append(a).append("$KeyGen192").toString());
        configurableprovider.a((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.y).toString(), (new StringBuilder()).append(a).append("$KeyGen256").toString());
        configurableprovider.a("Mac.AESCMAC", (new StringBuilder()).append(a).append("$AESCMAC").toString());
    }


    public ider()
    {
    }
}
