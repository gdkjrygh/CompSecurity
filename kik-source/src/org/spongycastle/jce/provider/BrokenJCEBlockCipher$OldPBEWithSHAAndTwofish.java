// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.engines.TwofishEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;

// Referenced classes of package org.spongycastle.jce.provider:
//            BrokenJCEBlockCipher

public static class  extends BrokenJCEBlockCipher
{

    public ()
    {
        super(new CBCBlockCipher(new TwofishEngine()), 3, 1, 256, 128);
    }
}
