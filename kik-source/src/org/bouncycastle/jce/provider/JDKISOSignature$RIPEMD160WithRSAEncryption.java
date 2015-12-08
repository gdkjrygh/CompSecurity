// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.digests.RIPEMD160Digest;
import org.bouncycastle.crypto.engines.RSABlindedEngine;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JDKISOSignature

public static class  extends JDKISOSignature
{

    public ()
    {
        super(new RIPEMD160Digest(), new RSABlindedEngine());
    }
}
