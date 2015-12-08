// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            CAST5

public static class put extends HashMap
{

    public ()
    {
        put("AlgorithmParameters.CAST5", "org.bouncycastle.jce.provider.symmetric.CAST5$AlgParams");
        put("Alg.Alias.AlgorithmParameters.1.2.840.113533.7.66.10", "CAST5");
        put("AlgorithmParameterGenerator.CAST5", "org.bouncycastle.jce.provider.symmetric.CAST5$AlgParamGen");
        put("Alg.Alias.AlgorithmParameterGenerator.1.2.840.113533.7.66.10", "CAST5");
        put("Cipher.CAST5", "org.bouncycastle.jce.provider.symmetric.CAST5$ECB");
        put("Cipher.1.2.840.113533.7.66.10", "org.bouncycastle.jce.provider.symmetric.CAST5$CBC");
        put("KeyGenerator.CAST5", "org.bouncycastle.jce.provider.symmetric.CAST5$KeyGen");
        put("Alg.Alias.KeyGenerator.1.2.840.113533.7.66.10", "CAST5");
    }
}
