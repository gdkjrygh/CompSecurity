// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            ARC4

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.ARC4", "org.bouncycastle.jce.provider.symmetric.ARC4$Base");
        put("Alg.Alias.Cipher.1.2.840.113549.3.4", "ARC4");
        put("Alg.Alias.Cipher.ARCFOUR", "ARC4");
        put("Alg.Alias.Cipher.RC4", "ARC4");
        put("KeyGenerator.ARC4", "org.bouncycastle.jce.provider.symmetric.ARC4$KeyGen");
        put("Alg.Alias.KeyGenerator.RC4", "ARC4");
        put("Alg.Alias.KeyGenerator.1.2.840.113549.3.4", "ARC4");
    }
}
