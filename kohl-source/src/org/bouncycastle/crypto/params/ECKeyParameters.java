// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter, ECDomainParameters

public class ECKeyParameters extends AsymmetricKeyParameter
{

    ECDomainParameters params;

    protected ECKeyParameters(boolean flag, ECDomainParameters ecdomainparameters)
    {
        super(flag);
        params = ecdomainparameters;
    }

    public ECDomainParameters getParameters()
    {
        return params;
    }
}
