// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

// Referenced classes of package com.fitbit.util:
//            PushNotificationsController

static final class b
    implements Runnable
{

    final FragmentActivity a;
    final Handler b;

    public void run()
    {
        FragmentManager fragmentmanager = a.getSupportFragmentManager();
        Fragment fragment = fragmentmanager.findFragmentByTag("com.fitbit.ui.BaseFragmentPushActivity.TAG_DLG_PUSH");
        if (fragment != null)
        {
            if (!fragment.isRemoving())
            {
                fragmentmanager.beginTransaction().remove(fragment).commitAllowingStateLoss();
            }
            b.postDelayed(this, 1L);
        }
    }

    (FragmentActivity fragmentactivity, Handler handler)
    {
        a = fragmentactivity;
        b = handler;
        super();
    }
}
