// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Salsa20

public static class erator extends BaseKeyGenerator
{

    public erator()
    {
        super("Salsa20", 128, new CipherKeyGenerator());
    }
}
