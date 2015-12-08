// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui:
//            LaunchActivity

class this._cls0 extends BroadcastReceiver
{

    final LaunchActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (Log.isLoggable("LaunchActivity", 2))
        {
            Log.v("LaunchActivity", (new StringBuilder()).append("Received intent ").append(intent).toString());
        }
        context = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.NFLX_HANDLER_RESULT".equals(context))
        {
            Log.d("LaunchActivity", "Delayed nflx action completed, finish activity");
            finish();
        } else
        if (Log.isLoggable("LaunchActivity", 3))
        {
            Log.d("LaunchActivity", (new StringBuilder()).append("We do not support action ").append(context).toString());
            return;
        }
    }

    ()
    {
        this$0 = LaunchActivity.this;
        super();
    }
}
