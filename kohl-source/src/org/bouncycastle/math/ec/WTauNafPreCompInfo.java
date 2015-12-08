// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.math.ec;


// Referenced classes of package org.bouncycastle.math.ec:
//            PreCompInfo

class WTauNafPreCompInfo
    implements PreCompInfo
{

    private ECPoint.F2m preComp[];

    WTauNafPreCompInfo(ECPoint.F2m af2m[])
    {
        preComp = null;
        preComp = af2m;
    }

    protected ECPoint.F2m[] getPreComp()
    {
        return preComp;
    }
}
