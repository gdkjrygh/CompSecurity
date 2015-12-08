// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto:
//            CipherParameters

public interface DSA
{

    public abstract BigInteger[] generateSignature(byte abyte0[]);

    public abstract void init(boolean flag, CipherParameters cipherparameters);

    public abstract boolean verifySignature(byte abyte0[], BigInteger biginteger, BigInteger biginteger1);
}
