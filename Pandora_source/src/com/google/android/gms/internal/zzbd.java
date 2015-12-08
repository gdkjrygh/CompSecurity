// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzba, zzbb

public final class zzbd extends zzbc.zza
{

    private final OnCustomRenderedAdLoadedListener zzqJ;

    public zzbd(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzqJ = oncustomrenderedadloadedlistener;
    }

    public void zza(zzbb zzbb)
    {
        zzqJ.onCustomRenderedAdLoaded(new zzba(zzbb));
    }
}
