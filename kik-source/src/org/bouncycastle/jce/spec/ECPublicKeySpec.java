// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.jce.spec;

import org.bouncycastle.math.ec.ECPoint;

// Referenced classes of package org.bouncycastle.jce.spec:
//            ECKeySpec

public class ECPublicKeySpec extends ECKeySpec
{

    private ECPoint a;

    public final ECPoint b()
    {
        return a;
    }
}
