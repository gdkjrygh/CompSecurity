// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            TEA

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.TEA", "org.bouncycastle.jce.provider.symmetric.TEA$ECB");
        put("KeyGenerator.TEA", "org.bouncycastle.jce.provider.symmetric.TEA$KeyGen");
        put("AlgorithmParameters.TEA", "org.bouncycastle.jce.provider.symmetric.TEA$AlgParams");
    }
}
