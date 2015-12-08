// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.agreement.srp;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.Digest;

// Referenced classes of package org.bouncycastle.crypto.agreement.srp:
//            SRP6Util

public class SRP6Server
{

    protected BigInteger a;
    protected BigInteger b;
    protected BigInteger c;
    protected SecureRandom d;
    protected Digest e;
    protected BigInteger f;
    protected BigInteger g;
    protected BigInteger h;
    protected BigInteger i;
    protected BigInteger j;

    public SRP6Server()
    {
    }

    private BigInteger calculateS()
    {
        return c.modPow(i, a).multiply(f).mod(a).modPow(g, a);
    }

    public BigInteger calculateSecret(BigInteger biginteger)
    {
        f = SRP6Util.validatePublicValue(a, biginteger);
        i = SRP6Util.calculateU(e, a, f, h);
        j = calculateS();
        return j;
    }

    public BigInteger generateServerCredentials()
    {
        BigInteger biginteger = SRP6Util.calculateK(e, a, b);
        g = selectPrivateValue();
        h = biginteger.multiply(c).mod(a).add(b.modPow(g, a)).mod(a);
        return h;
    }

    public void init(BigInteger biginteger, BigInteger biginteger1, BigInteger biginteger2, Digest digest, SecureRandom securerandom)
    {
        a = biginteger;
        b = biginteger1;
        c = biginteger2;
        d = securerandom;
        e = digest;
    }

    protected BigInteger selectPrivateValue()
    {
        return SRP6Util.generatePrivateValue(e, a, b, d);
    }
}
