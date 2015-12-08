// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.CamelliaWrapEngine;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Camellia

public static class  extends BaseWrapCipher
{

    public ipher()
    {
        super(new CamelliaWrapEngine());
    }
}
