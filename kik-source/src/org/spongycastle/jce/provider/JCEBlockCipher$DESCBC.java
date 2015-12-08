// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.provider;

import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.modes.CBCBlockCipher;

// Referenced classes of package org.spongycastle.jce.provider:
//            JCEBlockCipher

public static class _cls9 extends JCEBlockCipher
{

    public _cls9()
    {
        super(new CBCBlockCipher(new DESEngine()), (byte)0);
    }
}
