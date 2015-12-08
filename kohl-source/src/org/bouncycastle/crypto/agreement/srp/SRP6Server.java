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

public class SRP6Server
{

    protected BigInteger A;
    protected BigInteger B;
    protected BigInteger N;
    protected BigInteger S;
    protected BigInteger b;
    protected Digest digest;
    protected BigInteger g;
    protected SecureRandom random;
    protected BigInteger u;
    protected BigInteger v;

    public SRP6Server()
    {
    }

    private BigInteger calculateS()
    {
        return v.modPow(u, N).multiply(A).mod(N).modPow(b, N);
    }

    public BigInteger calculateSecret(BigInteger biginteger)
        throws CryptoException
    {
        A = SRP6Util.validatePublicValue(N, biginteger);
        u = SRP6Util.calculateU(digest, N, A, B);
        S = calculateS();
        return S;
    }

    public BigInteger generateServerCredentials()
    {
        BigInteger biginteger = SRP6Util.calculateK(digest, N, g);
        b = selectPrivateValue();
        B = biginteger.multiply(v).mod(N).add(g.modPow(b, N)).mod(N);
        return B;
    }

    public void init(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, Digest digest1, SecureRandom securerandom)
    {
        N = biginteger;
        g = biginteger1;
        v = biginteger2;
        random = securerandom;
        digest = digest1;
    }

    protected BigInteger selectPrivateValue()
    {
        return SRP6Util.generatePrivateValue(digest, N, g, random);
    }
}
