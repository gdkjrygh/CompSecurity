// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            DataLengthException, Digest, DerivationParameters

public interface DerivationFunction
{

    public abstract int generateBytes(byte abyte0[], int i, int j)
        throws DataLengthException, IllegalArgumentException;

    public abstract Digest getDigest();

    public abstract void init(DerivationParameters derivationparameters);
}
