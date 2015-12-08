// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.generators;

import java.security.SecureRandom;
import org.spongycastle.crypto.KeyGenerationParameters;
import org.spongycastle.crypto.params.DESedeParameters;

// Referenced classes of package org.spongycastle.crypto.generators:
//            DESKeyGenerator

public class DESedeKeyGenerator extends DESKeyGenerator
{

    public DESedeKeyGenerator()
    {
    }

    public final void a(KeyGenerationParameters keygenerationparameters)
    {
        a = keygenerationparameters.a();
        b = (keygenerationparameters.b() + 7) / 8;
        if (b == 0 || b == 21)
        {
            b = 24;
        } else
        {
            if (b == 14)
            {
                b = 16;
                return;
            }
            if (b != 24 && b != 16)
            {
                throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
            }
        }
    }

    public final byte[] a()
    {
        byte abyte0[] = new byte[b];
        do
        {
            a.nextBytes(abyte0);
            DESedeParameters.a(abyte0);
        } while (DESedeParameters.b(abyte0, abyte0.length));
        return abyte0;
    }
}
