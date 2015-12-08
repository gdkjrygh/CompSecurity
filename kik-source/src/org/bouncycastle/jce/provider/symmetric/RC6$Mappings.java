// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            RC6

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.RC6", "org.bouncycastle.jce.provider.symmetric.RC6$ECB");
        put("KeyGenerator.RC6", "org.bouncycastle.jce.provider.symmetric.RC6$KeyGen");
        put("AlgorithmParameters.RC6", "org.bouncycastle.jce.provider.symmetric.RC6$AlgParams");
    }
}
