// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import com.google.android.gms.ads.doubleclick.AppEventListener;

public final class zzh extends zzp.zza
{

    private final AppEventListener zzqb;

    public zzh(AppEventListener appeventlistener)
    {
        zzqb = appeventlistener;
    }

    public void onAppEvent(String s, String s1)
    {
        zzqb.onAppEvent(s, s1);
    }
}
