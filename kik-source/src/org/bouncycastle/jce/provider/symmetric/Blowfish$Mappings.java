// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            Blowfish

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.BLOWFISH", "org.bouncycastle.jce.provider.symmetric.Blowfish$ECB");
        put("Cipher.1.3.6.1.4.1.3029.1.2", "org.bouncycastle.jce.provider.symmetric.Blowfish$CBC");
        put("KeyGenerator.BLOWFISH", "org.bouncycastle.jce.provider.symmetric.Blowfish$KeyGen");
        put("Alg.Alias.KeyGenerator.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
        put("AlgorithmParameters.BLOWFISH", "org.bouncycastle.jce.provider.symmetric.Blowfish$AlgParams");
        put("Alg.Alias.AlgorithmParameters.1.3.6.1.4.1.3029.1.2", "BLOWFISH");
    }
}
