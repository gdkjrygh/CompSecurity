// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.ScreenEvent;
import com.soundcloud.android.main.PlayerController;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.view.screen.BaseLayoutHelper;
import com.soundcloud.rx.eventbus.EventBus;

// Referenced classes of package com.soundcloud.android.stations:
//            ShowAllStationsFragment

public class ShowAllStationsActivity extends ScActivity
{

    public static final String COLLECTION_TYPE = "type";
    BaseLayoutHelper baseLayoutHelper;
    PlayerController playerController;

    public ShowAllStationsActivity()
    {
    }

    private void attachFragment()
    {
        ShowAllStationsFragment showallstationsfragment = ShowAllStationsFragment.create(getIntent().getIntExtra("type", -1));
        getSupportFragmentManager().beginTransaction().replace(0x7f0f00b5, showallstationsfragment).commit();
    }

    private ScreenEvent getScreenEventFromIntent()
    {
        if (getIntent().getIntExtra("type", -1) == 0)
        {
            return ScreenEvent.create(Screen.STATIONS_RECENT);
        } else
        {
            return ScreenEvent.create(Screen.STATIONS_SHOW_ALL);
        }
    }

    private String getTitleFromIntent()
    {
        int i = getIntent().getIntExtra("type", -1);
        switch (i)
        {
        case 2: // '\002'
        default:
            throw new IllegalStateException((new StringBuilder("Unknown StationsCollectionsType: ")).append(i).toString());

        case 1: // '\001'
            return getString(0x7f070315);

        case 0: // '\0'
            return getString(0x7f0701ed);

        case 5: // '\005'
            return getString(0x7f070313);

        case 4: // '\004'
            return getString(0x7f070314);

        case 3: // '\003'
            return getString(0x7f070316);
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle(getTitleFromIntent());
        if (bundle == null)
        {
            attachFragment();
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (shouldTrackScreen())
        {
            eventBus.publish(EventQueue.TRACKING, getScreenEventFromIntent());
        }
    }

    protected void setActivityContentView()
    {
        baseLayoutHelper.setBaseLayout(this);
    }
}
