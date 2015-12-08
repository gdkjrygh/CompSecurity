// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.params.DHParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            b

public class DHParametersGenerator
{

    private static final BigInteger d = BigInteger.valueOf(2L);
    private int a;
    private int b;
    private SecureRandom c;

    public DHParametersGenerator()
    {
    }

    public DHParameters generateParameters()
    {
        BigInteger abiginteger[] = org.bouncycastle.crypto.generators.b.generateSafePrimes(a, b, c);
        BigInteger biginteger = abiginteger[0];
        BigInteger biginteger1 = abiginteger[1];
        return new DHParameters(biginteger, org.bouncycastle.crypto.generators.b.selectGenerator(biginteger, biginteger1, c), biginteger1, d, null);
    }

    public void init(int i, int j, SecureRandom securerandom)
    {
        a = i;
        b = j;
        c = securerandom;
    }

}
