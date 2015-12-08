// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.digest;

import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.spongycastle.jcajce.provider.digest:
//            SHA512

public static class ator extends BaseKeyGenerator
{

    public ator()
    {
        super("HMACSHA512", 512, new CipherKeyGenerator());
    }
}
