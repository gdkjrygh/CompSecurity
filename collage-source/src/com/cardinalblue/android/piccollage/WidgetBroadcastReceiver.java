// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.cardinalblue.android.piccollage.multitouch.photoproto.activities.MainActivity;

public class WidgetBroadcastReceiver extends BroadcastReceiver
{

    public WidgetBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        intent = intent.getStringExtra("com.amazon.device.home.extra.HERO_WIDGET_DATA");
        if (TextUtils.isEmpty(intent))
        {
            return;
        } else
        {
            Intent intent1 = new Intent(context, com/cardinalblue/android/piccollage/multitouch/photoproto/activities/MainActivity);
            intent1.setData(Uri.parse(intent));
            intent1.setFlags(0x14000000);
            context.startActivity(intent1);
            return;
        }
    }
}
