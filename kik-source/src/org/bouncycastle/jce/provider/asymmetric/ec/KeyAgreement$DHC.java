// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.asymmetric.ec;

import org.bouncycastle.crypto.agreement.ECDHCBasicAgreement;

// Referenced classes of package org.bouncycastle.jce.provider.asymmetric.ec:
//            KeyAgreement

public static class t> extends KeyAgreement
{

    public ()
    {
        super("ECDHC", new ECDHCBasicAgreement(), null);
    }
}
