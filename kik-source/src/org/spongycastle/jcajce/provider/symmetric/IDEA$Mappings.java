// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.config.ConfigurableProvider;
import org.spongycastle.jcajce.provider.util.AlgorithmProvider;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            IDEA

public static class der extends AlgorithmProvider
{

    private static final String a = org/spongycastle/jcajce/provider/symmetric/IDEA.getName();

    public final void a(ConfigurableProvider configurableprovider)
    {
        configurableprovider.a("AlgorithmParameterGenerator.IDEA", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("AlgorithmParameterGenerator.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$AlgParamGen").toString());
        configurableprovider.a("AlgorithmParameters.IDEA", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("AlgorithmParameters.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$AlgParams").toString());
        configurableprovider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA", "PKCS12PBE");
        configurableprovider.a("Alg.Alias.AlgorithmParameters.PBEWITHSHAANDIDEA-CBC", "PKCS12PBE");
        configurableprovider.a("Cipher.IDEA", (new StringBuilder()).append(a).append("$ECB").toString());
        configurableprovider.a("Cipher.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$CBC").toString());
        configurableprovider.a("Cipher.PBEWITHSHAANDIDEA-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndIDEA").toString());
        configurableprovider.a("KeyGenerator.IDEA", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("KeyGenerator.1.3.6.1.4.1.188.7.1.1.2", (new StringBuilder()).append(a).append("$KeyGen").toString());
        configurableprovider.a("SecretKeyFactory.PBEWITHSHAANDIDEA-CBC", (new StringBuilder()).append(a).append("$PBEWithSHAAndIDEAKeyGen").toString());
        configurableprovider.a("Mac.IDEAMAC", (new StringBuilder()).append(a).append("$Mac").toString());
        configurableprovider.a("Alg.Alias.Mac.IDEA", "IDEAMAC");
        configurableprovider.a("Mac.IDEAMAC/CFB8", (new StringBuilder()).append(a).append("$CFB8Mac").toString());
        configurableprovider.a("Alg.Alias.Mac.IDEA/CFB8", "IDEAMAC/CFB8");
    }


    public der()
    {
    }
}
