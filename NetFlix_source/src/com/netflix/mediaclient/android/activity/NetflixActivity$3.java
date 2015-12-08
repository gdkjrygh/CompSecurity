// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0 extends BroadcastReceiver
{

    final NetflixActivity this$0;

    public void onReceive(Context context, Intent intent)
    {
        Log.v("NetflixActivity", (new StringBuilder()).append("Finishing activity ").append(getClass().getSimpleName()).append(" from intent: ").append(intent.getAction()).toString());
        finish();
    }

    ()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
