// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.SEEDEngine;
import org.bouncycastle.crypto.modes.CBCBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            SEED

public static class BlockCipher extends BaseBlockCipher
{

    public BlockCipher()
    {
        super(new CBCBlockCipher(new SEEDEngine()), 128);
    }
}
