// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.jcajce.provider.symmetric;

import org.spongycastle.jcajce.provider.symmetric.util.IvAlgorithmParameters;

// Referenced classes of package org.spongycastle.jcajce.provider.symmetric:
//            XTEA

public static class mParameters extends IvAlgorithmParameters
{

    protected String engineToString()
    {
        return "XTEA IV";
    }

    public mParameters()
    {
    }
}
