// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.macs.CFBBlockCipherMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric.util:
//            BaseMac

public static class  extends BaseMac
{

    public ()
    {
        super(new CFBBlockCipherMac(new DESEngine()));
    }
}
