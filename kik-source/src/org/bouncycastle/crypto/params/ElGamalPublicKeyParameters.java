// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ElGamalKeyParameters, ElGamalParameters

public class ElGamalPublicKeyParameters extends ElGamalKeyParameters
{

    private BigInteger b;

    public ElGamalPublicKeyParameters(BigInteger biginteger, ElGamalParameters elgamalparameters)
    {
        super(false, elgamalparameters);
        b = biginteger;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ElGamalPublicKeyParameters))
        {
            return false;
        }
        return ((ElGamalPublicKeyParameters)obj).getY().equals(b) && super.equals(obj);
    }

    public BigInteger getY()
    {
        return b;
    }

    public int hashCode()
    {
        return b.hashCode() ^ super.hashCode();
    }
}
