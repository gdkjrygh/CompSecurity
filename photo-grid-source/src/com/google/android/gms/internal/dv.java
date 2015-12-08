// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            dt, do, dp

public final class dv extends dt
{

    private final OnCustomRenderedAdLoadedListener a;

    public dv(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        a = oncustomrenderedadloadedlistener;
    }

    public final void a(dp dp)
    {
        a.onCustomRenderedAdLoaded(new do(dp));
    }
}
