// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.analytics.Tracker;

// Referenced classes of package com.google.android.gms.internal:
//            k, zzkv

static class a
    implements .zza
{

    private final Tracker a;

    public void zza(zzkv zzkv1)
    {
        a.setScreenName(zzkv1.zzuL());
        com.google.android.gms.analytics.uilders.ScreenViewBuilder screenviewbuilder = new com.google.android.gms.analytics.uilders.ScreenViewBuilder();
        screenviewbuilder.set("&a", String.valueOf(zzkv1.zzaJ()));
        a.send(screenviewbuilder.build());
    }

    public void zza(zzkv zzkv1, Activity activity)
    {
    }

    cker(Tracker tracker)
    {
        a = tracker;
    }
}
