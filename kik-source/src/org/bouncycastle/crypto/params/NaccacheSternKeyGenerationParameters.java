// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters
{

    private int a;
    private int b;
    private boolean c;

    public NaccacheSternKeyGenerationParameters(SecureRandom securerandom, int i, int j, int k)
    {
        this(securerandom, i, j, k, false);
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom securerandom, int i, int j, int k, boolean flag)
    {
        super(securerandom, i);
        c = false;
        a = j;
        if (k % 2 == 1)
        {
            throw new IllegalArgumentException("cntSmallPrimes must be a multiple of 2");
        }
        if (k < 30)
        {
            throw new IllegalArgumentException("cntSmallPrimes must be >= 30 for security reasons");
        } else
        {
            b = k;
            c = flag;
            return;
        }
    }

    public int getCertainty()
    {
        return a;
    }

    public int getCntSmallPrimes()
    {
        return b;
    }

    public boolean isDebug()
    {
        return c;
    }
}
