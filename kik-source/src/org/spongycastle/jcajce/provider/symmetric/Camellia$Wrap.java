// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.CamelliaWrapEngine;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Camellia

public static class  extends BaseWrapCipher
{

    public ipher()
    {
        super(new CamelliaWrapEngine());
    }
}
