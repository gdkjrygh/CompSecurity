// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.engines.CamelliaEngine;
import org.spongycastle.crypto.engines.RFC3211WrapEngine;
import org.spongycastle.jcajce.provider.symmetric.util.BaseWrapCipher;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Camellia

public static class init> extends BaseWrapCipher
{

    public ()
    {
        super(new RFC3211WrapEngine(new CamelliaEngine()), 16);
    }
}
