// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import org.bouncycastle.crypto.encodings.PKCS1Encoding;
import org.bouncycastle.crypto.engines.ElGamalEngine;

// Referenced classes of package org.bouncycastle.jcajce.provider.asymmetric.elgamal:
//            CipherSpi

public static class  extends CipherSpi
{

    public ()
    {
        super(new PKCS1Encoding(new ElGamalEngine()));
    }
}
