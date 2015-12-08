// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            DataLengthException, CipherParameters

public interface StreamCipher
{

    public abstract String getAlgorithmName();

    public abstract void init(boolean flag, CipherParameters cipherparameters)
        throws IllegalArgumentException;

    public abstract void processBytes(byte abyte0[], int i, int j, byte abyte1[], int k)
        throws DataLengthException;

    public abstract void reset();

    public abstract byte returnByte(byte byte0);
}
