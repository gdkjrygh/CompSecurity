// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.KeyGenerationParameters;

public class NaccacheSternKeyGenerationParameters extends KeyGenerationParameters
{

    private int certainty;
    private int cntSmallPrimes;
    private boolean debug;

    public NaccacheSternKeyGenerationParameters(SecureRandom securerandom, int i, int j, int k)
    {
        this(securerandom, i, j, k, false);
    }

    public NaccacheSternKeyGenerationParameters(SecureRandom securerandom, int i, int j, int k, boolean flag)
    {
        super(securerandom, i);
        debug = false;
        certainty = j;
        if (k % 2 == 1)
        {
            throw new IllegalArgumentException("cntSmallPrimes must be a multiple of 2");
        }
        if (k < 30)
        {
            throw new IllegalArgumentException("cntSmallPrimes must be >= 30 for security reasons");
        } else
        {
            cntSmallPrimes = k;
            debug = flag;
            return;
        }
    }

    public int getCertainty()
    {
        return certainty;
    }

    public int getCntSmallPrimes()
    {
        return cntSmallPrimes;
    }

    public boolean isDebug()
    {
        return debug;
    }
}
