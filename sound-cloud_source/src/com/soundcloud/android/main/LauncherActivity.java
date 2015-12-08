// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.main;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.analytics.Referrer;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ForegroundEvent;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.main:
//            TrackedActivity, MainActivity, Screen

public class LauncherActivity extends TrackedActivity
{

    AccountOperations accountOperations;
    EventBus eventBus;

    public LauncherActivity()
    {
    }

    private Intent getMainActivityIntentWithExtras()
    {
        Intent intent = new Intent(this, com/soundcloud/android/main/MainActivity);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        return intent;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        eventBus.publish(EventQueue.TRACKING, ForegroundEvent.open(Screen.UNKNOWN, Referrer.HOME_BUTTON));
    }

    protected void onResume()
    {
        super.onResume();
        (new Handler()).post(new _cls1());
    }

    protected void setActivityContentView()
    {
        setContentView(0x7f03006e);
    }


    private class _cls1
        implements Runnable
    {

        final LauncherActivity this$0;

        public void run()
        {
            if (accountOperations.isUserLoggedIn())
            {
                startActivity(getMainActivityIntentWithExtras());
                return;
            } else
            {
                accountOperations.triggerLoginFlow(LauncherActivity.this);
                return;
            }
        }

        _cls1()
        {
            this$0 = LauncherActivity.this;
            super();
        }
    }

}
