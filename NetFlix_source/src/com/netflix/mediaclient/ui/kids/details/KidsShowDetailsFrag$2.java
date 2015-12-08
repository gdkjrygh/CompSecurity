// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.details;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.kids.details:
//            KidsShowDetailsFrag

class this._cls0 extends BroadcastReceiver
{

    final KidsShowDetailsFrag this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (!KidsShowDetailsFrag.access$200(KidsShowDetailsFrag.this))
        {
            context = intent.getAction();
            Log.v("KidsShowDetailsFrag", (new StringBuilder()).append("receiver inovoked, action: ").append(context).toString());
            if ("com.netflix.mediaclient.intent.action.BA_EPISODE_REFRESH".equals(context))
            {
                return;
            }
        }
    }

    ()
    {
        this$0 = KidsShowDetailsFrag.this;
        super();
    }
}
