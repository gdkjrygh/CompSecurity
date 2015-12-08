// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            DataLengthException, CipherParameters

public interface BlockCipher
{

    public abstract String getAlgorithmName();

    public abstract int getBlockSize();

    public abstract void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException;

    public abstract int processBlock(byte abyte0[], int i, byte abyte1[], int j)
        throws DataLengthException, IllegalStateException;

    public abstract void reset();
}
