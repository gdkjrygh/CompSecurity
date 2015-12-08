// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.wear.manager;

import android.content.Context;
import android.content.Intent;
import com.dominos.wear.receiver.WearTrackerReceiver;

// Referenced classes of package com.dominos.wear.manager:
//            WearManager

class val.intent
    implements com.dominos.wear.client.ent.WearConnectionCallback
{

    final WearManager this$0;
    final Context val$context;
    final Intent val$intent;

    public void onConnectionFailed()
    {
    }

    public void onConnectionSuccess()
    {
        (new WearTrackerReceiver()).onReceive(val$context, val$intent);
    }

    ceiver()
    {
        this$0 = final_wearmanager;
        val$context = context1;
        val$intent = Intent.this;
        super();
    }
}
