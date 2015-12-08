// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.bouncycastle.jcajce.provider.symmetric:
//            Camellia

public static class rator extends BaseKeyGenerator
{

    public rator()
    {
        this(256);
    }

    public <init>(int i)
    {
        super("Camellia", i, new CipherKeyGenerator());
    }
}
