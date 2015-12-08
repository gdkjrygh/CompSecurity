// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.provider;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.InvalidCipherTextException;

// Referenced classes of package org.bouncycastle.jce.provider:
//            JCEBlockCipher

private static interface 
{

    public abstract int doFinal(byte abyte0[], int i)
        throws IllegalStateException, InvalidCipherTextException;

    public abstract String getAlgorithmName();

    public abstract int getOutputSize(int i);

    public abstract BlockCipher getUnderlyingCipher();

    public abstract int getUpdateOutputSize(int i);

    public abstract void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException;

    public abstract int processByte(byte byte0, byte abyte0[], int i)
        throws DataLengthException;

    public abstract int processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException;

    public abstract boolean wrapOnNoPadding();
}
