// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            bf, bg

public final class bi extends bh.a
{

    private final OnCustomRenderedAdLoadedListener a;

    public bi(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        a = oncustomrenderedadloadedlistener;
    }

    public void a(bg bg)
    {
        a.onCustomRenderedAdLoaded(new bf(bg));
    }
}
