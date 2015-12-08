// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayParamsReceiver

class val.intent
    implements Runnable
{

    final PlayParamsReceiver this$0;
    final Context val$context;
    final Intent val$intent;

    public void run()
    {
        PlayParamsReceiver.access$100(PlayParamsReceiver.this, val$context, val$intent);
    }

    A()
    {
        this$0 = final_playparamsreceiver;
        val$context = context1;
        val$intent = Intent.this;
        super();
    }
}
