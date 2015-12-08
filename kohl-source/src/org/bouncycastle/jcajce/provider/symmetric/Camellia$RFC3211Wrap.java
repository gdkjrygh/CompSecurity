// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.engines.CamelliaEngine;
import org.bouncycastle.crypto.engines.RFC3211WrapEngine;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Camellia

public static class init> extends BaseWrapCipher
{

    public ()
    {
        super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
    }
}
