// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DHKeyParameters, DHParameters

public class DHPublicKeyParameters extends DHKeyParameters
{

    private BigInteger b;

    public DHPublicKeyParameters(BigInteger biginteger, DHParameters dhparameters)
    {
        super(false, dhparameters);
        b = biginteger;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DHPublicKeyParameters))
        {
            return false;
        }
        return ((DHPublicKeyParameters)obj).getY().equals(b) && super.equals(obj);
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
