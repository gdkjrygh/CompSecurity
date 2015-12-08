// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            Serpent

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.Serpent", "org.bouncycastle.jce.provider.symmetric.Serpent$ECB");
        put("KeyGenerator.Serpent", "org.bouncycastle.jce.provider.symmetric.Serpent$KeyGen");
        put("AlgorithmParameters.Serpent", "org.bouncycastle.jce.provider.symmetric.Serpent$AlgParams");
    }
}
