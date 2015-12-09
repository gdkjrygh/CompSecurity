// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.player.NewPlayQueueActivity;

public final class ezv extends BroadcastReceiver
{

    private NewPlayQueueActivity a;

    private ezv(NewPlayQueueActivity newplayqueueactivity)
    {
        a = newplayqueueactivity;
        super();
    }

    public ezv(NewPlayQueueActivity newplayqueueactivity, byte byte0)
    {
        this(newplayqueueactivity);
    }

    public final void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("sleep_timer_cancelled"))
        {
            NewPlayQueueActivity.a(a).a.f();
        }
    }
}
