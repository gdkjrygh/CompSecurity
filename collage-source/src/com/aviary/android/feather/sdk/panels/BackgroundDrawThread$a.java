// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.panels;

import android.graphics.PointF;
import java.util.concurrent.LinkedBlockingQueue;

// Referenced classes of package com.aviary.android.feather.sdk.panels:
//            BackgroundDrawThread

static class add extends LinkedBlockingQueue
{

    private com.aviary.android.feather.headless.filters. a;
    private float b;
    private volatile boolean c;
    private PointF d;

    public PointF a()
    {
        return d;
    }

    public com.aviary.android.feather.headless.filters. b()
    {
        return a;
    }

    public float c()
    {
        return b;
    }

    public void d()
    {
        c = true;
    }

    public boolean e()
    {
        return c;
    }

    public a(com.aviary.android.feather.headless.filters. , float f, float af[])
    {
        a = ;
        b = f;
        c = false;
        d = new PointF();
        if (af != null && af.length >= 2)
        {
            d.x = af[0];
            d.y = af[1];
        }
        add(af);
    }
}
