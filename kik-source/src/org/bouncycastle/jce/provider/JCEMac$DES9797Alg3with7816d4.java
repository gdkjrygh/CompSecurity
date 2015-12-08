// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.macs.ISO9797Alg3Mac;
import org.bouncycastle.crypto.paddings.ISO7816d4Padding;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEMac

public static class  extends JCEMac
{

    public ()
    {
        super(new ISO9797Alg3Mac(new DESEngine(), new ISO7816d4Padding()));
    }
}
