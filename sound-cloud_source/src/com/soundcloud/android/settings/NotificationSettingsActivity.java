// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.os.Bundle;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.settings:
//            NotificationSettingsFragment

public class NotificationSettingsActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;

    public NotificationSettingsActivity()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentFragment(NotificationSettingsFragment.create());
    }

    public boolean onNavigateUp()
    {
        finish();
        return true;
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, ScreenEvent.create(Screen.SETTINGS_NOTIFICATIONS));
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setContainerLayout(this);
    }
}
