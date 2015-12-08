// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzho

final class <init> extends BroadcastReceiver
{

    final zzho zzzs;

    public final void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction()))
        {
            zzho.zza(zzzs, true);
        } else
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            zzho.zza(zzzs, false);
            return;
        }
    }

    private (zzho zzho1)
    {
        zzzs = zzho1;
        super();
    }

    zzzs(zzho zzho1, zzzs zzzs1)
    {
        this(zzho1);
    }
}
