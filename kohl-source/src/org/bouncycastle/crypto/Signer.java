// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            CryptoException, DataLengthException, CipherParameters

public interface Signer
{

    public abstract byte[] generateSignature()
        throws CryptoException, DataLengthException;

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract void reset();

    public abstract void update(byte byte0);

    public abstract void update(byte abyte0[], int i, int j);

    public abstract boolean verifySignature(byte abyte0[]);
}
