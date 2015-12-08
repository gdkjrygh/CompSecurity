// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, ECDomainParameters

public class ECKeyParameters extends AsymmetricKeyParameter
{

    ECDomainParameters b;

    protected ECKeyParameters(boolean flag, ECDomainParameters ecdomainparameters)
    {
        super(flag);
        b = ecdomainparameters;
    }

    public final ECDomainParameters b()
    {
        return b;
    }
}
