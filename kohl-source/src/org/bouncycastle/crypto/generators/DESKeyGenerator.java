// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherKeyGenerator;
import org.bouncycastle.crypto.KeyGenerationParameters;
import org.bouncycastle.crypto.params.DESParameters;

public class DESKeyGenerator extends CipherKeyGenerator
{

    public DESKeyGenerator()
    {
    }

    public byte[] generateKey()
    {
        byte abyte0[] = new byte[8];
        do
        {
            random.nextBytes(abyte0);
            DESParameters.setOddParity(abyte0);
        } while (DESParameters.isWeakKey(abyte0, 0));
        return abyte0;
    }

    public void init(KeyGenerationParameters keygenerationparameters)
    {
        super.init(keygenerationparameters);
        if (strength == 0 || strength == 7)
        {
            strength = 8;
        } else
        if (strength != 8)
        {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }
}
