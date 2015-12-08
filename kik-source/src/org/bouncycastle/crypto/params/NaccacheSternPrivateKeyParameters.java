// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;
import java.util.Vector;

// Referenced classes of package org.bouncycastle.crypto.params:
//            NaccacheSternKeyParameters

public class NaccacheSternPrivateKeyParameters extends NaccacheSternKeyParameters
{

    private BigInteger c;
    private Vector d;

    public NaccacheSternPrivateKeyParameters(BigInteger biginteger, BigInteger biginteger1, int i, Vector vector, BigInteger biginteger2)
    {
        super(true, biginteger, biginteger1, i);
        d = vector;
        c = biginteger2;
    }

    public BigInteger getPhi_n()
    {
        return c;
    }

    public Vector getSmallPrimes()
    {
        return d;
    }
}
