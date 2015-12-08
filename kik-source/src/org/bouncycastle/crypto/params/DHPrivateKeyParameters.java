// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.bouncycastle.crypto.params:
//            DHKeyParameters, DHParameters

public class DHPrivateKeyParameters extends DHKeyParameters
{

    private BigInteger b;

    public DHPrivateKeyParameters(BigInteger biginteger, DHParameters dhparameters)
    {
        super(true, dhparameters);
        b = biginteger;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DHPrivateKeyParameters))
        {
            return false;
        }
        return ((DHPrivateKeyParameters)obj).getX().equals(b) && super.equals(obj);
    }

    public BigInteger getX()
    {
        return b;
    }

    public int hashCode()
    {
        return b.hashCode() ^ super.hashCode();
    }
}
