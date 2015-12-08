// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pandora.android.provider.b;
import p.cw.c;

public class WidgetBroadcastsReceiver extends BroadcastReceiver
{

    public WidgetBroadcastsReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        p.cw.b b1 = b.a.b().d();
        if (context != null)
        {
            if (context.equals("cmd_widget_toggle_pause"))
            {
                b1.b();
            } else
            {
                if (context.equals("cmd_widget_thumbs_down"))
                {
                    b1.d();
                    return;
                }
                if (context.equals("cmd_widget_thumbs_up"))
                {
                    b1.c();
                    return;
                }
                if (context.equals("cmd_widget_skip"))
                {
                    b1.b(intent.getStringExtra("intent_skip_source"));
                    return;
                }
            }
        }
    }
}
