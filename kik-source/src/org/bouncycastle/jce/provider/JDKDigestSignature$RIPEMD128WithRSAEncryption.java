// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.asn1.teletrust.TeleTrusTObjectIdentifiers;
import org.bouncycastle.crypto.digests.RIPEMD128Digest;
import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKDigestSignature

public static class Q extends JDKDigestSignature
{

    public Q()
    {
        super(TeleTrusTObjectIdentifiers.c, new RIPEMD128Digest(), new PKCS1Encoding(new RSABlindedEngine()));
    }
}
