// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

// Referenced classes of package org.chromium.content.browser:
//            TimeZoneMonitor

class this._cls0 extends BroadcastReceiver
{

    final TimeZoneMonitor this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (!intent.getAction().equals("android.intent.action.TIMEZONE_CHANGED"))
        {
            Log.e("TimeZoneMonitor", "unexpected intent");
            return;
        } else
        {
            TimeZoneMonitor.access$100(TimeZoneMonitor.this, TimeZoneMonitor.access$000(TimeZoneMonitor.this));
            return;
        }
    }

    ()
    {
        this$0 = TimeZoneMonitor.this;
        super();
    }
}
