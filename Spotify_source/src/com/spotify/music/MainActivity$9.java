// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.ui.activity.UpdateActivity;

// Referenced classes of package com.spotify.music:
//            MainActivity

final class  extends BroadcastReceiver
{

    private MainActivity a;

    public final void onReceive(Context context, Intent intent)
    {
        a.startActivity((new Intent(a, com/spotify/mobile/android/ui/activity/UpdateActivity)).setData(intent.getData()));
    }

    ivity.UpdateActivity(MainActivity mainactivity)
    {
        a = mainactivity;
        super();
    }
}
