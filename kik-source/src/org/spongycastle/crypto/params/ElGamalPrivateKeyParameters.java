// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.crypto.params:
//            ElGamalKeyParameters, ElGamalParameters

public class ElGamalPrivateKeyParameters extends ElGamalKeyParameters
{

    private BigInteger b;

    public ElGamalPrivateKeyParameters(BigInteger biginteger, ElGamalParameters elgamalparameters)
    {
        super(true, elgamalparameters);
        b = biginteger;
    }

    public final BigInteger c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof ElGamalPrivateKeyParameters))
        {
            return false;
        }
        if (!((ElGamalPrivateKeyParameters)obj).b.equals(b))
        {
            return false;
        } else
        {
            return super.equals(obj);
        }
    }

    public int hashCode()
    {
        return b.hashCode();
    }
}
