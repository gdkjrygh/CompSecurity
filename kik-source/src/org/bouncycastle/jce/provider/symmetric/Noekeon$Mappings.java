// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            Noekeon

public static class put extends HashMap
{

    public ()
    {
        put("AlgorithmParameters.NOEKEON", "org.bouncycastle.jce.provider.symmetric.Noekeon$AlgParams");
        put("AlgorithmParameterGenerator.NOEKEON", "org.bouncycastle.jce.provider.symmetric.Noekeon$AlgParamGen");
        put("Cipher.NOEKEON", "org.bouncycastle.jce.provider.symmetric.Noekeon$ECB");
        put("KeyGenerator.NOEKEON", "org.bouncycastle.jce.provider.symmetric.Noekeon$KeyGen");
    }
}
