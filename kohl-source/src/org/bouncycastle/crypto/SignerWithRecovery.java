// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;


// Referenced classes of package org.bouncycastle.crypto:
//            Signer, InvalidCipherTextException

public interface SignerWithRecovery
    extends Signer
{

    public abstract byte[] getRecoveredMessage();

    public abstract boolean hasFullMessage();

    public abstract void updateWithRecoveredMessage(byte abyte0[])
        throws InvalidCipherTextException;
}
