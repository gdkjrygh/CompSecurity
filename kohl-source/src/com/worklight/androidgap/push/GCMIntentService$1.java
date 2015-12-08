// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.WLConfig;

// Referenced classes of package com.worklight.androidgap.push:
//            GCMIntentService

class this._cls0 extends BroadcastReceiver
{

    final GCMIntentService this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (getResultCode() == 1 || !WLConfig.getInstance().isHybridActivityInForeground())
        {
            GCMIntentService.access$000(GCMIntentService.this, context, intent);
        }
    }

    ()
    {
        this$0 = GCMIntentService.this;
        super();
    }
}
