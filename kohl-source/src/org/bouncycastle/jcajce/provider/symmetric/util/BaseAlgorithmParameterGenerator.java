// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi
{

    protected SecureRandom random;
    protected int strength;

    public BaseAlgorithmParameterGenerator()
    {
        strength = 1024;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        strength = i;
        random = securerandom;
    }
}
