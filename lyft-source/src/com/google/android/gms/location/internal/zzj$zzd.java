// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.location.LocationSettingsResult;

final class a extends a
{

    private com.google.android.gms.common.api.zj.zzd.a a;

    public void a(LocationSettingsResult locationsettingsresult)
    {
        a.a(locationsettingsresult);
        a = null;
    }

    public esult(com.google.android.gms.common.api.zj.zzd zzd)
    {
        boolean flag;
        if (zzd != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzu.b(flag, "listener can't be null.");
        a = zzd;
    }
}
