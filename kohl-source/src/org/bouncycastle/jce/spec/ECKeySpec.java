// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import java.security.spec.KeySpec;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ECParameterSpec

public class ECKeySpec
    implements KeySpec
{

    private ECParameterSpec spec;

    protected ECKeySpec(ECParameterSpec ecparameterspec)
    {
        spec = ecparameterspec;
    }

    public ECParameterSpec getParams()
    {
        return spec;
    }
}
