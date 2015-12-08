// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.DerivationParameters;

public class ISO18033KDFParameters
    implements DerivationParameters
{

    byte seed[];

    public ISO18033KDFParameters(byte abyte0[])
    {
        seed = abyte0;
    }

    public byte[] getSeed()
    {
        return seed;
    }
}
