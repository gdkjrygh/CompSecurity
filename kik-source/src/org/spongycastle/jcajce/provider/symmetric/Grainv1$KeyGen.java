// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            Grainv1

public static class erator extends BaseKeyGenerator
{

    public erator()
    {
        super("Grainv1", 80, new CipherKeyGenerator());
    }
}
