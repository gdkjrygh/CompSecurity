// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0 extends BroadcastReceiver
{

    final NetflixActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        if (destroyed())
        {
            return;
        }
        if (intent == null || !"com.netflix.mediaclient.service.ACTION_EXPAND_MDX_MINI_PLAYER".equals(intent.getAction()))
        {
            Log.v("NetflixActivity", "Invalid intent: ");
            AndroidUtils.logIntent("NetflixActivity", intent);
            return;
        } else
        {
            expandMiniPlayerIfVisible();
            return;
        }
    }

    ()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
