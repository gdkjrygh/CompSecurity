// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.activity;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.ui.login.LogoutActivity;

// Referenced classes of package com.netflix.mediaclient.android.activity:
//            NetflixActivity

class this._cls0
    implements Runnable
{

    final NetflixActivity this$0;

    public void run()
    {
        long l = System.nanoTime();
        Log.d("NetflixActivity", (new StringBuilder()).append("Restarting app, time: ").append(l).toString());
        finish();
        startActivity(LogoutActivity.create(NetflixActivity.this));
    }

    A()
    {
        this$0 = NetflixActivity.this;
        super();
    }
}
