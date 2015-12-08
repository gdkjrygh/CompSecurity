// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.DESEngine;
import org.bouncycastle.crypto.macs.CMac;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseMac;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            DES

public static class Mac extends BaseMac
{

    public Mac()
    {
        super(new CMac(new DESEngine()));
    }
}
