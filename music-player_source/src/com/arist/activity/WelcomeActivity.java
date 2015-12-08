// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.arist.activity.base.BaseActivity;
import com.arist.service.DeskLrcService;
import com.arist.service.MusicPlayService;
import com.ijoysoft.a.a;

// Referenced classes of package com.arist.activity:
//            am, MainActivity, MyApplication, ao

public class WelcomeActivity extends BaseActivity
{

    private Handler a;

    public WelcomeActivity()
    {
        a = new am(this);
    }

    static void a(WelcomeActivity welcomeactivity)
    {
        welcomeactivity.startActivity(new Intent(welcomeactivity, com/arist/activity/MainActivity));
        welcomeactivity.overridePendingTransition(0x7f04000e, 0);
        welcomeactivity.finish();
    }

    static Handler b(WelcomeActivity welcomeactivity)
    {
        return welcomeactivity.a;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f030044);
        Log.i("WelcomActivity", "onCreate()");
        com.ijoysoft.a.a.a().b();
        com.ijoysoft.a.a.a().a(this, false);
        bundle = new Intent(MyApplication.q, com/arist/service/MusicPlayService);
        bundle.putExtra("from", "WelcomeActivity");
        startService(bundle);
        if (MyApplication.r)
        {
            Log.i("WelcomeActivity", "\u5F00\u542F\u684C\u9762\u6B4C\u8BCD");
            startService(new Intent(MyApplication.q, com/arist/service/DeskLrcService));
        }
        if (!MyApplication.s)
        {
            (new ao(this)).start();
            return;
        } else
        {
            a.sendEmptyMessageDelayed(0, 2000L);
            return;
        }
    }
}
