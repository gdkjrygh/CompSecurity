// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzbc extends zzbk.zza
{

    private final AppEventListener zzpd;

    public zzbc(AppEventListener appeventlistener)
    {
        zzpd = appeventlistener;
    }

    public final void onAppEvent(String s, String s1)
    {
        zzpd.onAppEvent(s, s1);
    }
}
