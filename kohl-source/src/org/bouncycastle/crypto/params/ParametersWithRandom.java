// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.security.SecureRandom;
import org.bouncycastle.crypto.CipherParameters;

public class ParametersWithRandom
    implements CipherParameters
{

    private CipherParameters parameters;
    private SecureRandom random;

    public ParametersWithRandom(CipherParameters cipherparameters)
    {
        this(cipherparameters, new SecureRandom());
    }

    public ParametersWithRandom(CipherParameters cipherparameters, SecureRandom securerandom)
    {
        random = securerandom;
        parameters = cipherparameters;
    }

    public CipherParameters getParameters()
    {
        return parameters;
    }

    public SecureRandom getRandom()
    {
        return random;
    }
}
