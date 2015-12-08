// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

final class jvn extends BroadcastReceiver
{

    jvn()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("com.google.android.gms.cast.remote_display.ACTION_NOTIFICATION_DISCONNECT"))
        {
            jva.b().a("disconnecting", new Object[0]);
            jva.a();
        }
    }
}
