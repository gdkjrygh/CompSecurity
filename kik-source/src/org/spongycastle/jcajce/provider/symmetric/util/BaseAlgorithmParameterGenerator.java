// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric.util;

import java.security.AlgorithmParameterGeneratorSpi;
import java.security.SecureRandom;

public abstract class BaseAlgorithmParameterGenerator extends AlgorithmParameterGeneratorSpi
{

    protected SecureRandom b;
    protected int c;

    public BaseAlgorithmParameterGenerator()
    {
        c = 1024;
    }

    protected void engineInit(int i, SecureRandom securerandom)
    {
        c = i;
        b = securerandom;
    }
}
