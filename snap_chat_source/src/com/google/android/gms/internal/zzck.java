// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.OnCustomRenderedAdLoadedListener;

// Referenced classes of package com.google.android.gms.internal:
//            zzch, zzci

public final class zzck extends zzcj.zza
{

    private final OnCustomRenderedAdLoadedListener zzpL;

    public zzck(OnCustomRenderedAdLoadedListener oncustomrenderedadloadedlistener)
    {
        zzpL = oncustomrenderedadloadedlistener;
    }

    public final void zza(zzci zzci)
    {
        zzpL.onCustomRenderedAdLoaded(new zzch(zzci));
    }
}
