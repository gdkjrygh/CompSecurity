// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.CAST5Engine;
import org.spongycastle.crypto.modes.CBCBlockCipher;
import org.spongycastle.jcajce.provider.symmetric.util.BaseBlockCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            CAST5

public static class lockCipher extends BaseBlockCipher
{

    public lockCipher()
    {
        super(new CBCBlockCipher(new CAST5Engine()), 64);
    }
}
