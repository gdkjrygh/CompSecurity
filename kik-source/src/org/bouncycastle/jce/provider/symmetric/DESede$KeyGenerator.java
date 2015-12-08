// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider.symmetric;

import java.security.SecureRandom;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.generators.DESedeKeyGenerator;
import org.bouncycastle.jce.provider.JCEKeyGenerator;

// Referenced classes of package org.bouncycastle.jce.provider.symmetric:
//            DESede

public static class f extends JCEKeyGenerator
{

    private boolean f;

    protected SecretKey engineGenerateKey()
    {
        if (e)
        {
            d.init(new KeyGenerationParameters(new SecureRandom(), c));
            e = false;
        }
        if (!f)
        {
            byte abyte0[] = d.generateKey();
            System.arraycopy(abyte0, 0, abyte0, 16, 8);
            return new SecretKeySpec(abyte0, a);
        } else
        {
            return new SecretKeySpec(d.generateKey(), a);
        }
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        super.engineInit(i, securerandom);
        f = true;
    }

    public A()
    {
        super("DESede", 192, new DESedeKeyGenerator());
        f = false;
    }
}
