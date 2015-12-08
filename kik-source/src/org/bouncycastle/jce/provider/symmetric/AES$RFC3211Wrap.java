// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import org.bouncycastle.crypto.engines.AESFastEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.jce.provider.WrapCipherSpi;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            AES

public static class  extends WrapCipherSpi
{

    public ()
    {
        super(new RFC3211WrapEngine(new AESFastEngine()), 16);
    }
}
