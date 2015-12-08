// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.asn1.x9;


// Referenced classes of package org.bouncycastle.asn1.x9:
//            X9ECParameters

public abstract class X9ECParametersHolder
{

    private X9ECParameters params;

    public X9ECParametersHolder()
    {
    }

    protected abstract X9ECParameters createParameters();

    public X9ECParameters getParameters()
    {
        if (params == null)
        {
            params = createParameters();
        }
        return params;
    }
}
