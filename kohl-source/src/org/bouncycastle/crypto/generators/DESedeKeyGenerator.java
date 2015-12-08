// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DESedeParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            DESKeyGenerator

public class DESedeKeyGenerator extends DESKeyGenerator
{

    public DESedeKeyGenerator()
    {
    }

    public byte[] generateKey()
    {
        byte abyte0[] = new byte[strength];
        do
        {
            random.nextBytes(abyte0);
            DESedeParameters.setOddParity(abyte0);
        } while (DESedeParameters.isWeakKey(abyte0, 0, abyte0.length));
        return abyte0;
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        random = keygenerationparameters.getRandom();
        strength = (keygenerationparameters.getStrength() + 7) / 8;
        if (strength == 0 || strength == 21)
        {
            strength = 24;
        } else
        {
            if (strength == 14)
            {
                strength = 16;
                return;
            }
            if (strength != 24 && strength != 16)
            {
                throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
            }
        }
    }
}
