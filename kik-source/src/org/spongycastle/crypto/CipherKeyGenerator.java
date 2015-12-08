// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto;

import java.security.SecureRandom;

// Referenced classes of package org.spongycastle.crypto:
//            KeyGenerationParameters

public class CipherKeyGenerator
{

    protected SecureRandom a;
    protected int b;

    public CipherKeyGenerator()
    {
    }

    public void a(KeyGenerationParameters keygenerationparameters)
    {
        a = keygenerationparameters.a();
        b = (keygenerationparameters.b() + 7) / 8;
    }

    public byte[] a()
    {
        byte abyte0[] = new byte[b];
        a.nextBytes(abyte0);
        return abyte0;
    }
}
