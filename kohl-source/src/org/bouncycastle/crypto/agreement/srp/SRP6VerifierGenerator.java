// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.agreement.srp:
//            SRP6Util

public class SRP6VerifierGenerator
{

    protected BigInteger N;
    protected Digest digest;
    protected BigInteger g;

    public SRP6VerifierGenerator()
    {
    }

    public BigInteger generateVerifier(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        abyte0 = SRP6Util.calculateX(digest, N, abyte0, abyte1, abyte2);
        return g.modPow(abyte0, N);
    }

    public void init(BigInteger biginteger, BigInteger biginteger1, Digest digest1)
    {
        N = biginteger;
        g = biginteger1;
        digest = digest1;
    }
}
