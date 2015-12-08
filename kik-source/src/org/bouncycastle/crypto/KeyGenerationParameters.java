// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import java.security.SecureRandom;

public class KeyGenerationParameters
{

    private SecureRandom a;
    private int b;

    public KeyGenerationParameters(SecureRandom securerandom, int i)
    {
        a = securerandom;
        b = i;
    }

    public SecureRandom getRandom()
    {
        return a;
    }

    public int getStrength()
    {
        return b;
    }
}
