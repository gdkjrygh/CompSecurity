// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.lightcycle;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

// Referenced classes of package com.soundcloud.lightcycle:
//            LightCycleDispatcher, ActivityLightCycleDispatcher, ActivityLightCycle, LightCycleBinder

public abstract class LightCycleActionBarActivity extends ActionBarActivity
    implements LightCycleDispatcher
{

    private final ActivityLightCycleDispatcher lightCycleDispatcher = new ActivityLightCycleDispatcher();

    public LightCycleActionBarActivity()
    {
    }

    public void bind(ActivityLightCycle activitylightcycle)
    {
        lightCycleDispatcher.bind(activitylightcycle);
    }

    public volatile void bind(Object obj)
    {
        bind((ActivityLightCycle)obj);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setActivityContentView();
        LightCycleBinder.bind(this);
        lightCycleDispatcher.onCreate(this, bundle);
    }

    protected void onDestroy()
    {
        lightCycleDispatcher.onDestroy(this);
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        lightCycleDispatcher.onNewIntent(this, intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        return lightCycleDispatcher.onOptionsItemSelected(this, menuitem);
    }

    protected void onPause()
    {
        lightCycleDispatcher.onPause(this);
        super.onPause();
    }

    protected void onRestoreInstanceState(Bundle bundle)
    {
        super.onRestoreInstanceState(bundle);
        lightCycleDispatcher.onRestoreInstanceState(this, bundle);
    }

    protected void onResume()
    {
        super.onResume();
        lightCycleDispatcher.onResume(this);
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        lightCycleDispatcher.onSaveInstanceState(this, bundle);
    }

    protected void onStart()
    {
        super.onStart();
        lightCycleDispatcher.onStart(this);
    }

    protected void onStop()
    {
        lightCycleDispatcher.onStop(this);
        super.onStop();
    }

    protected abstract void setActivityContentView();
}
