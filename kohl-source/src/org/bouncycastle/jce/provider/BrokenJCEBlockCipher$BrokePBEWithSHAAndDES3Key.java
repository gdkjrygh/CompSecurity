// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.engines.DESedeEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;

// Referenced classes of package org.bouncycastle.jce.provider:
//            BrokenJCEBlockCipher

public static class  extends BrokenJCEBlockCipher
{

    public ()
    {
        super(new CBCBlockCipher(new DESedeEngine()), 2, 1, 192, 64);
    }
}
