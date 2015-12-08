// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.cast.CastDevice;

final class jvb extends zc
{

    private jva a;

    jvb(jva jva1)
    {
        a = jva1;
        super();
    }

    public final void d(zb zb, zk zk1)
    {
        jva.a(a, "onRouteUnselected");
        if (jva.a(a) == null)
        {
            jva.a(a, "onRouteUnselected, no device was selected");
            return;
        }
        if (!CastDevice.a(zk1.n).b.equals(jva.a(a).b))
        {
            jva.a(a, "onRouteUnselected, device does not match");
            return;
        } else
        {
            jva.a();
            return;
        }
    }
}
