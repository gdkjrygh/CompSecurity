// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.security.SecureRandom;
import org.spongycastle.crypto.CipherParameters;

public class ParametersWithRandom
    implements CipherParameters
{

    private SecureRandom a;
    private CipherParameters b;

    public ParametersWithRandom(CipherParameters cipherparameters, SecureRandom securerandom)
    {
        a = securerandom;
        b = cipherparameters;
    }

    public final SecureRandom a()
    {
        return a;
    }

    public final CipherParameters b()
    {
        return b;
    }
}
