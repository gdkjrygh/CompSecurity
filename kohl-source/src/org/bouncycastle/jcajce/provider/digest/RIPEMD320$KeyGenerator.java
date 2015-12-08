// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.digest;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.bouncycastle.jcajce.provider.digest:
//            RIPEMD320

public static class r extends BaseKeyGenerator
{

    public r()
    {
        super("HMACRIPEMD320", 320, new CipherKeyGenerator());
    }
}
