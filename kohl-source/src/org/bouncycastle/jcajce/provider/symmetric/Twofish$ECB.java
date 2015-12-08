// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.TwofishEngine;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Twofish

public static class ckCipher extends BaseBlockCipher
{

    public ckCipher()
    {
        super(new TwofishEngine());
    }
}
