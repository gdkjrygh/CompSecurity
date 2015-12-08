// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.generators.DESKeyGenerator;
import org.spongycastle.jcajce.provider.symmetric.util.BaseKeyGenerator;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            DES

public static class ator extends BaseKeyGenerator
{

    protected SecretKey engineGenerateKey()
    {
        if (e)
        {
            d.a(new KeyGenerationParameters(new SecureRandom(), c));
            e = false;
        }
        return new SecretKeySpec(d.a(), a);
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        super.engineInit(i, securerandom);
    }

    public ator()
    {
        super("DES", 64, new DESKeyGenerator());
    }
}
