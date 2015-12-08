// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;

import java.math.BigInteger;

// Referenced classes of package org.spongycastle.crypto.params:
//            DHKeyParameters, DHParameters

public class DHPublicKeyParameters extends DHKeyParameters
{

    private BigInteger b;

    public DHPublicKeyParameters(BigInteger biginteger, DHParameters dhparameters)
    {
        super(false, dhparameters);
        b = biginteger;
    }

    public final BigInteger c()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof DHPublicKeyParameters))
        {
            return false;
        }
        return ((DHPublicKeyParameters)obj).b.equals(b) && super.equals(obj);
    }

    public int hashCode()
    {
        return b.hashCode() ^ super.hashCode();
    }
}
