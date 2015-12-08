// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            SkidmarkLoLoMoAdapter

class this._cls0 extends BroadcastReceiver
{

    final SkidmarkLoLoMoAdapter this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (intent == null)
        {
            Log.w("SkidmarkLoLoMoAdapter", "Received null intent");
        } else
        {
            context = intent.getAction();
            if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
            {
                Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("browseReceiver inovoked with Action: ").append(context).toString());
            }
            if ("com.netflix.mediaclient.intent.action.BA_CW_REFRESH".equals(context))
            {
                SkidmarkLoLoMoAdapter.access$300(SkidmarkLoLoMoAdapter.this);
                return;
            }
        }
    }

    ()
    {
        this$0 = SkidmarkLoLoMoAdapter.this;
        super();
    }
}
