// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherKeyGenerator;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESParameters;

public class DESKeyGenerator extends CipherKeyGenerator
{

    public DESKeyGenerator()
    {
    }

    public void a(KeyGenerationParameters keygenerationparameters)
    {
        super.a(keygenerationparameters);
        if (b == 0 || b == 7)
        {
            b = 8;
        } else
        if (b != 8)
        {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }

    public byte[] a()
    {
        byte abyte0[] = new byte[8];
        do
        {
            a.nextBytes(abyte0);
            DESParameters.a(abyte0);
        } while (DESParameters.a(abyte0, 0));
        return abyte0;
    }
}
