// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.ads.s;

// Referenced classes of package com.pandora.android.activity:
//            YuMeVideoActivity

class a extends BroadcastReceiver
{

    final YuMeVideoActivity a;

    public void onReceive(Context context, Intent intent)
    {
        if ("android.intent.action.SCREEN_OFF".equals(intent.getAction()))
        {
            YuMeVideoActivity.e(a).c();
        }
    }

    (YuMeVideoActivity yumevideoactivity)
    {
        a = yumevideoactivity;
        super();
    }
}
