// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            InvalidCipherTextException, CipherParameters

public interface AsymmetricBlockCipher
{

    public abstract int getInputBlockSize();

    public abstract int getOutputBlockSize();

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract byte[] processBlock(byte abyte0[], int i, int j)
        throws InvalidCipherTextException;
}
