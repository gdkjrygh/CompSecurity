// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            HomeActivity

class this._cls0 extends BroadcastReceiver
{

    final HomeActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            Log.w("HomeActivity", "Received null intent");
        } else
        {
            context = intent.getAction();
            Log.i("HomeActivity", (new StringBuilder()).append("RefreshHomeReceiver inovoked and received Intent with Action ").append(context).toString());
            if ("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO".equals(context))
            {
                HomeActivity.access$900(HomeActivity.this);
                return;
            }
        }
    }

    ()
    {
        this$0 = HomeActivity.this;
        super();
    }
}
