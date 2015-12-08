// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.params;


// Referenced classes of package org.spongycastle.crypto.params:
//            AsymmetricKeyParameter, GOST3410Parameters

public class GOST3410KeyParameters extends AsymmetricKeyParameter
{

    private GOST3410Parameters b;

    public GOST3410KeyParameters(boolean flag, GOST3410Parameters gost3410parameters)
    {
        super(flag);
        b = gost3410parameters;
    }

    public final GOST3410Parameters b()
    {
        return b;
    }
}
