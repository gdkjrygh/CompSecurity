// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.net.URI;

// Referenced classes of package com.soundcloud.android.api.legacy:
//            PublicApi

class this._cls0 extends BroadcastReceiver
{

    final PublicApi this$0;

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("proxy");
        intent = PublicApi.TAG;
        intent = PublicApi.this;
        if (context == null)
        {
            context = null;
        } else
        {
            context = URI.create(context);
        }
        intent.setProxy(context);
    }

    ()
    {
        this$0 = PublicApi.this;
        super();
    }
}
