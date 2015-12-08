// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.agreement.srp:
//            SRP6Util

public class SRP6Client
{

    protected BigInteger A;
    protected BigInteger B;
    protected BigInteger N;
    protected BigInteger S;
    protected BigInteger a;
    protected Digest digest;
    protected BigInteger g;
    protected SecureRandom random;
    protected BigInteger u;
    protected BigInteger x;

    public SRP6Client()
    {
    }

    private BigInteger calculateS()
    {
        BigInteger biginteger1 = SRP6Util.calculateK(digest, N, g);
        BigInteger biginteger = u.multiply(x).add(a);
        biginteger1 = g.modPow(x, N).multiply(biginteger1).mod(N);
        return B.subtract(biginteger1).mod(N).modPow(biginteger, N);
    }

    public BigInteger calculateSecret(BigInteger biginteger)
        throws CryptoException
    {
        B = SRP6Util.validatePublicValue(N, biginteger);
        u = SRP6Util.calculateU(digest, N, A, B);
        S = calculateS();
        return S;
    }

    public BigInteger generateClientCredentials(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        x = SRP6Util.calculateX(digest, N, abyte0, abyte1, abyte2);
        a = selectPrivateValue();
        A = g.modPow(a, N);
        return A;
    }

    public void init(BigInteger biginteger, BigInteger biginteger1, Digest digest1, SecureRandom securerandom)
    {
        N = biginteger;
        g = biginteger1;
        digest = digest1;
        random = securerandom;
    }

    protected BigInteger selectPrivateValue()
    {
        return SRP6Util.generatePrivateValue(digest, N, g, random);
    }
}
