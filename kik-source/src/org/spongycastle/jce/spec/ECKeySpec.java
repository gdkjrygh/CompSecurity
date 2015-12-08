// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jce.spec;

import java.security.spec.KeySpec;

// Referenced classes of package org.spongycastle.jce.spec:
//            ECParameterSpec

public class ECKeySpec
    implements KeySpec
{

    private ECParameterSpec a;

    protected ECKeySpec(ECParameterSpec ecparameterspec)
    {
        a = ecparameterspec;
    }

    public final ECParameterSpec a()
    {
        return a;
    }
}
