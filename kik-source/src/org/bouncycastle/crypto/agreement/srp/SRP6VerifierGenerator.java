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

    protected BigInteger a;
    protected BigInteger b;
    protected Digest c;

    public SRP6VerifierGenerator()
    {
    }

    public BigInteger generateVerifier(byte abyte0[], byte abyte1[], byte abyte2[])
    {
        abyte0 = SRP6Util.calculateX(c, a, abyte0, abyte1, abyte2);
        return b.modPow(abyte0, a);
    }

    public void init(BigInteger biginteger, BigInteger biginteger1, Digest digest)
    {
        a = biginteger;
        b = biginteger1;
        c = digest;
    }
}
