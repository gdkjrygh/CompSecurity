// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            ElGamalKeyParameters, ElGamalParameters

public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters
{

    private BigInteger b;

    public ElGamalPrivateKeyParameters(BigInteger biginteger, ElGamalParameters elgamalparameters)
    {
        super(true, elgamalparameters);
        b = biginteger;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ElGamalPrivateKeyParameters))
        {
            return false;
        }
        if (!((ElGamalPrivateKeyParameters)obj).getX().equals(b))
        {
            return false;
        } else
        {
            return super.equals(obj);
        }
    }

    public BigInteger getX()
    {
        return b;
    }

    public int hashCode()
    {
        return getX().hashCode();
    }
}
