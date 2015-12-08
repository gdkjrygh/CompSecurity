// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.DESEngine;
import org.spongycastle.crypto.macs.CBCBlockCipherMac;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            DES

public static class c extends BaseMac
{

    public c()
    {
        super(new CBCBlockCipherMac(new DESEngine()));
    }
}
