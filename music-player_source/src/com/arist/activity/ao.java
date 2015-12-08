// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.os.Handler;
import com.arist.model.a.a;

// Referenced classes of package com.arist.activity:
//            WelcomeActivity, MyApplication

final class ao extends Thread
{

    final WelcomeActivity a;

    ao(WelcomeActivity welcomeactivity)
    {
        a = welcomeactivity;
        super();
    }

    public final void run()
    {
        new a();
        com.arist.model.a.a.a(a.getApplicationContext());
        a.sendBroadcast(new Intent(com.arist.c.a.k));
        MyApplication.s = true;
        WelcomeActivity.b(a).sendEmptyMessageDelayed(0, 2000L);
    }
}
