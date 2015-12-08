// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.math.ec;


// Referenced classes of package org.spongycastle.math.ec:
//            d, ECPoint

final class h
    implements d
{

    private ECPoint a[];
    private ECPoint b;

    h()
    {
        a = null;
        b = null;
    }

    protected final void a(ECPoint ecpoint)
    {
        b = ecpoint;
    }

    protected final void a(ECPoint aecpoint[])
    {
        a = aecpoint;
    }

    protected final ECPoint[] a()
    {
        return a;
    }

    protected final ECPoint b()
    {
        return b;
    }
}
