// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.generators;

import java.security.SecureRandom;
import org.bouncycastle.crypto.params.ElGamalParameters;

// Referenced classes of package org.bouncycastle.crypto.generators:
//            b

public class ElGamalParametersGenerator
{

    private int a;
    private int b;
    private SecureRandom c;

    public ElGamalParametersGenerator()
    {
    }

    public ElGamalParameters generateParameters()
    {
        java.math.BigInteger abiginteger[] = org.bouncycastle.crypto.generators.b.generateSafePrimes(a, b, c);
        java.math.BigInteger biginteger = abiginteger[0];
        return new ElGamalParameters(biginteger, org.bouncycastle.crypto.generators.b.selectGenerator(biginteger, abiginteger[1], c));
    }

    public void init(int i, int j, SecureRandom securerandom)
    {
        a = i;
        b = j;
        c = securerandom;
    }
}
