// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.BufferedBlockCipher;
import org.bouncycastle.crypto.engines.RC6Engine;
import org.bouncycastle.crypto.modes.CFBBlockCipher;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            RC6

public static class  extends BaseBlockCipher
{

    public eBlockCipher()
    {
        super(new BufferedBlockCipher(new CFBBlockCipher(new RC6Engine(), 128)), 128);
    }
}
