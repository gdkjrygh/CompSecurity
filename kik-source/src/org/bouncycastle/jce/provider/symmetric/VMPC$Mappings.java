// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            VMPC

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.VMPC", "org.bouncycastle.jce.provider.symmetric.VMPC$Base");
        put("KeyGenerator.VMPC", "org.bouncycastle.jce.provider.symmetric.VMPC$KeyGen");
        put("Mac.VMPCMAC", "org.bouncycastle.jce.provider.symmetric.VMPC$Mac");
        put("Alg.Alias.Mac.VMPC", "VMPCMAC");
        put("Alg.Alias.Mac.VMPC-MAC", "VMPCMAC");
    }
}
