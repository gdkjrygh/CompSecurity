// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.modes.OFBBlockCipher;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEStreamCipher

public static class  extends JCEStreamCipher
{

    public ()
    {
        super(new OFBBlockCipher(new DESEngine(), 8), 64);
    }
}
