// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.asymmetric.ec;

import org.spongycastle.crypto.agreement.ECDHBasicAgreement;
import org.spongycastle.crypto.agreement.kdf.ECDHKEKGenerator;
import org.spongycastle.crypto.digests.SHA1Digest;

// Referenced classes of package org.spongycastle.jcajce.provider.asymmetric.ec:
//            KeyAgreementSpi

public static class  extends KeyAgreementSpi
{

    public ()
    {
        super("ECDHwithSHA1KDF", new ECDHBasicAgreement(), new ECDHKEKGenerator(new SHA1Digest()));
    }
}
