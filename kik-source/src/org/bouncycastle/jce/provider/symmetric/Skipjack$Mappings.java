// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            Skipjack

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.SKIPJACK", "org.bouncycastle.jce.provider.symmetric.Skipjack$ECB");
        put("KeyGenerator.SKIPJACK", "org.bouncycastle.jce.provider.symmetric.Skipjack$KeyGen");
        put("AlgorithmParameters.SKIPJACK", "org.bouncycastle.jce.provider.symmetric.Skipjack$AlgParams");
        put("Mac.SKIPJACKMAC", "org.bouncycastle.jce.provider.symmetric.Skipjack$Mac");
        put("Alg.Alias.Mac.SKIPJACK", "SKIPJACKMAC");
        put("Mac.SKIPJACKMAC/CFB8", "org.bouncycastle.jce.provider.symmetric.Skipjack$MacCFB8");
        put("Alg.Alias.Mac.SKIPJACK/CFB8", "SKIPJACKMAC/CFB8");
    }
}
