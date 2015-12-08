// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.actionbar;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.cast.CastConnectionHelper;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.UIEvent;
import com.soundcloud.android.properties.ApplicationProperties;
import com.soundcloud.android.utils.BugReporter;
import com.soundcloud.android.utils.DeviceHelper;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;

public class ActionBarHelper extends DefaultActivityLightCycle
{

    private final ApplicationProperties applicationProperties;
    private final BugReporter bugReporter;
    private final CastConnectionHelper castConnectionHelper;
    private final DeviceHelper deviceHelper;
    private final EventBus eventBus;
    private final Navigator navigator;

    public ActionBarHelper(CastConnectionHelper castconnectionhelper, EventBus eventbus, ApplicationProperties applicationproperties, BugReporter bugreporter, Navigator navigator1, DeviceHelper devicehelper)
    {
        castConnectionHelper = castconnectionhelper;
        eventBus = eventbus;
        applicationProperties = applicationproperties;
        bugReporter = bugreporter;
        navigator = navigator1;
        deviceHelper = devicehelper;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        menuinflater.inflate(0x7f100003, menu);
        if (menu.findItem(0x7f0f02b5) != null)
        {
            castConnectionHelper.addMediaRouterButton(menu, 0x7f0f02b5);
        }
        menuinflater = menu.findItem(0x7f0f02bd);
        if (menuinflater != null)
        {
            menuinflater.setVisible(applicationProperties.shouldAllowFeedback());
        }
        menu = menu.findItem(0x7f0f02bb);
        if (menu != null)
        {
            menu.setVisible(deviceHelper.hasMicrophone());
        }
    }

    public volatile boolean onOptionsItemSelected(Activity activity, MenuItem menuitem)
    {
        return onOptionsItemSelected((AppCompatActivity)activity, menuitem);
    }

    public boolean onOptionsItemSelected(AppCompatActivity appcompatactivity, MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131690169: 
            navigator.openDiscovery(appcompatactivity);
            eventBus.publish(EventQueue.TRACKING, UIEvent.fromSearchAction());
            return true;

        case 2131690172: 
            navigator.openSettings(appcompatactivity);
            return true;

        case 2131690171: 
            navigator.openRecord(appcompatactivity);
            return true;

        case 2131690170: 
            navigator.openActivities(appcompatactivity);
            return true;

        case 2131690173: 
            bugReporter.showGeneralFeedbackDialog(appcompatactivity);
            break;
        }
        return true;
    }
}
