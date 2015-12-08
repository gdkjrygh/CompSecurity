// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.params;


// Referenced classes of package org.bouncycastle.crypto.params:
//            AsymmetricKeyParameter, DSAParameters

public class DSAKeyParameters extends AsymmetricKeyParameter
{

    private DSAParameters params;

    public DSAKeyParameters(boolean flag, DSAParameters dsaparameters)
    {
        super(flag);
        params = dsaparameters;
    }

    public DSAParameters getParameters()
    {
        return params;
    }
}
