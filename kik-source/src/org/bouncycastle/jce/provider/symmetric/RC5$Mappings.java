// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            RC5

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.RC5", "org.bouncycastle.jce.provider.symmetric.RC5$ECB32");
        put("Alg.Alias.Cipher.RC5-32", "RC5");
        put("Cipher.RC5-64", "org.bouncycastle.jce.provider.symmetric.RC5$ECB64");
        put("KeyGenerator.RC5", "org.bouncycastle.jce.provider.symmetric.RC5$KeyGen32");
        put("Alg.Alias.KeyGenerator.RC5-32", "RC5");
        put("KeyGenerator.RC5-64", "org.bouncycastle.jce.provider.symmetric.RC5$KeyGen64");
        put("AlgorithmParameters.RC5", "org.bouncycastle.jce.provider.symmetric.RC5$AlgParams");
        put("AlgorithmParameters.RC5-64", "org.bouncycastle.jce.provider.symmetric.RC5$AlgParams");
        put("Mac.RC5MAC", "org.bouncycastle.jce.provider.symmetric.RC5$Mac32");
        put("Alg.Alias.Mac.RC5", "RC5MAC");
        put("Mac.RC5MAC/CFB8", "org.bouncycastle.jce.provider.symmetric.RC5$CFB8Mac32");
        put("Alg.Alias.Mac.RC5/CFB8", "RC5MAC/CFB8");
    }
}
