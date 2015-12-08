// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.util.HashMap;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            AES

public static class put extends HashMap
{

    public ()
    {
        put("AlgorithmParameters.AES", "org.bouncycastle.jce.provider.symmetric.AES$AlgParams");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.2", "AES");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.22", "AES");
        put("Alg.Alias.AlgorithmParameters.2.16.840.1.101.3.4.42", "AES");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.h).toString(), "AES");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.o).toString(), "AES");
        put((new StringBuilder("Alg.Alias.AlgorithmParameters.")).append(NISTObjectIdentifiers.v).toString(), "AES");
        put("AlgorithmParameterGenerator.AES", "org.bouncycastle.jce.provider.symmetric.AES$AlgParamGen");
        put("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.2", "AES");
        put("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.22", "AES");
        put("Alg.Alias.AlgorithmParameterGenerator.2.16.840.1.101.3.4.42", "AES");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.h).toString(), "AES");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.o).toString(), "AES");
        put((new StringBuilder("Alg.Alias.AlgorithmParameterGenerator.")).append(NISTObjectIdentifiers.v).toString(), "AES");
        put("Cipher.AES", "org.bouncycastle.jce.provider.symmetric.AES$ECB");
        put("Alg.Alias.Cipher.2.16.840.1.101.3.4.2", "AES");
        put("Alg.Alias.Cipher.2.16.840.1.101.3.4.22", "AES");
        put("Alg.Alias.Cipher.2.16.840.1.101.3.4.42", "AES");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.g).toString(), "org.bouncycastle.jce.provider.symmetric.AES$ECB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.n).toString(), "org.bouncycastle.jce.provider.symmetric.AES$ECB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.u).toString(), "org.bouncycastle.jce.provider.symmetric.AES$ECB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.h).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CBC");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.o).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CBC");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.v).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CBC");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.i).toString(), "org.bouncycastle.jce.provider.symmetric.AES$OFB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.p).toString(), "org.bouncycastle.jce.provider.symmetric.AES$OFB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.w).toString(), "org.bouncycastle.jce.provider.symmetric.AES$OFB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.j).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CFB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.q).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CFB");
        put((new StringBuilder("Cipher.")).append(NISTObjectIdentifiers.x).toString(), "org.bouncycastle.jce.provider.symmetric.AES$CFB");
        put("Cipher.AESWRAP", "org.bouncycastle.jce.provider.symmetric.AES$Wrap");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.k).toString(), "AESWRAP");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.r).toString(), "AESWRAP");
        put((new StringBuilder("Alg.Alias.Cipher.")).append(NISTObjectIdentifiers.y).toString(), "AESWRAP");
        put("Cipher.AESRFC3211WRAP", "org.bouncycastle.jce.provider.symmetric.AES$RFC3211Wrap");
        put("KeyGenerator.AES", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen");
        put("KeyGenerator.2.16.840.1.101.3.4.2", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
        put("KeyGenerator.2.16.840.1.101.3.4.22", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
        put("KeyGenerator.2.16.840.1.101.3.4.42", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.g).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.h).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.i).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.j).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.n).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.o).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.p).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.q).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.u).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.v).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.w).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.x).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
        put("KeyGenerator.AESWRAP", "org.bouncycastle.jce.provider.symmetric.AES$KeyGen");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.k).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen128");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.r).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen192");
        put((new StringBuilder("KeyGenerator.")).append(NISTObjectIdentifiers.y).toString(), "org.bouncycastle.jce.provider.symmetric.AES$KeyGen256");
        put("Mac.AESCMAC", "org.bouncycastle.jce.provider.symmetric.AES$AESCMAC");
    }
}
