// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.agreement.srp:
//            SRP6Util

public class SRP6Client
{

    protected BigInteger a;
    protected BigInteger b;
    protected BigInteger c;
    protected BigInteger d;
    protected BigInteger e;
    protected BigInteger f;
    protected BigInteger g;
    protected BigInteger h;
    protected Digest i;
    protected SecureRandom j;

    public SRP6Client()
    {
    }

    private BigInteger calculateS()
    {
        BigInteger biginteger1 = SRP6Util.calculateK(i, a, b);
        BigInteger biginteger = g.multiply(f).add(c);
        biginteger1 = b.modPow(f, a).multiply(biginteger1).mod(a);
        return e.subtract(biginteger1).mod(a).modPow(biginteger, a);
    }

    public BigInteger calculateSecret(BigInteger biginteger)
    {
        e = SRP6Util.validatePublicValue(a, biginteger);
        g = SRP6Util.calculateU(i, a, d, e);
        h = calculateS();
        return h;
    }

    public BigInteger generateClientCredentials(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        f = SRP6Util.calculateX(i, a, abyte0, abyte1, abyte2);
        c = selectPrivateValue();
        d = b.modPow(c, a);
        return d;
    }

    public void init(BigInteger biginteger, BigInteger biginteger1, Digest digest, SecureRandom securerandom)
    {
        a = biginteger;
        b = biginteger1;
        i = digest;
        j = securerandom;
    }

    protected BigInteger selectPrivateValue()
    {
        return SRP6Util.generatePrivateValue(i, a, b, j);
    }
}
