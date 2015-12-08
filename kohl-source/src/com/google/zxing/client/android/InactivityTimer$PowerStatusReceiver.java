// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.zxing.client.android:
//            InactivityTimer

private final class <init> extends BroadcastReceiver
{

    final InactivityTimer this$0;

    public void onReceive(Context context, Intent intent)
    {
label0:
        {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
            {
                boolean flag;
                if (intent.getIntExtra("plugged", -1) <= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag)
                {
                    break label0;
                }
                onActivity();
            }
            return;
        }
        InactivityTimer.access$200(InactivityTimer.this);
    }

    private I()
    {
        this$0 = InactivityTimer.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
