// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.internal.p;

// Referenced classes of package com.google.android.gms.cast:
//            CastRemoteDisplayLocalService

private static final class A extends BroadcastReceiver
{

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
        {
            CastRemoteDisplayLocalService.b().a("disconnecting", new Object[0]);
            CastRemoteDisplayLocalService.a();
        }
    }
}
