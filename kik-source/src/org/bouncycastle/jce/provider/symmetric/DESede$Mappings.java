// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.asn1.oiw.OIWObjectIdentifiers;
import org.bouncycastle.asn1.pkcs.PKCSObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            DESede

public static class put extends HashMap
{

    public ()
    {
        put("Cipher.DESEDE", "org.bouncycastle.jce.provider.symmetric.DESede$ECB");
        put((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$CBC");
        put((new StringBuilder("Cipher.")).append(OIWObjectIdentifiers.e).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$CBC");
        put("Cipher.DESEDEWRAP", "org.bouncycastle.jce.provider.symmetric.DESede$Wrap");
        put((new StringBuilder("Cipher.")).append(PKCSObjectIdentifiers.bw).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$Wrap");
        put("Cipher.DESEDERFC3211WRAP", "org.bouncycastle.jce.provider.symmetric.DESede$RFC3211");
        put("KeyGenerator.DESEDE", "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator");
        put((new StringBuilder("KeyGenerator.")).append(PKCSObjectIdentifiers.B).toString(), "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator3");
        put("KeyGenerator.DESEDEWRAP", "org.bouncycastle.jce.provider.symmetric.DESede$KeyGenerator");
        put("SecretKeyFactory.DESEDE", "org.bouncycastle.jce.provider.symmetric.DESede$KeyFactory");
        put("Mac.DESEDECMAC", "org.bouncycastle.jce.provider.symmetric.DESede$CMAC");
        put("Mac.DESEDEMAC", "org.bouncycastle.jce.provider.symmetric.DESede$CBCMAC");
        put("Alg.Alias.Mac.DESEDE", "DESEDEMAC");
        put("Mac.DESEDEMAC/CFB8", "org.bouncycastle.jce.provider.symmetric.DESede$DESedeCFB8");
        put("Alg.Alias.Mac.DESEDE/CFB8", "DESEDEMAC/CFB8");
        put("Mac.DESEDEMAC64", "org.bouncycastle.jce.provider.symmetric.DESede$DESede64");
        put("Alg.Alias.Mac.DESEDE64", "DESEDEMAC64");
        put("Mac.DESEDEMAC64WITHISO7816-4PADDING", "org.bouncycastle.jce.provider.symmetric.DESede$DESede64with7816d4");
        put("Alg.Alias.Mac.DESEDE64WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        put("Alg.Alias.Mac.DESEDEISO9797ALG1MACWITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
        put("Alg.Alias.Mac.DESEDEISO9797ALG1WITHISO7816-4PADDING", "DESEDEMAC64WITHISO7816-4PADDING");
    }
}
