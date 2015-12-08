// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.activity;

import android.app.LauncherActivity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Map;
import roboguice.RoboGuice;
import roboguice.activity.event.OnActivityResultEvent;
import roboguice.activity.event.OnConfigurationChangedEvent;
import roboguice.activity.event.OnContentChangedEvent;
import roboguice.activity.event.OnCreateEvent;
import roboguice.activity.event.OnDestroyEvent;
import roboguice.activity.event.OnNewIntentEvent;
import roboguice.activity.event.OnPauseEvent;
import roboguice.activity.event.OnRestartEvent;
import roboguice.activity.event.OnResumeEvent;
import roboguice.activity.event.OnStartEvent;
import roboguice.activity.event.OnStopEvent;
import roboguice.event.EventManager;
import roboguice.inject.ContentViewListener;
import roboguice.inject.RoboInjector;
import roboguice.util.RoboContext;

public class RoboLauncherActivity extends LauncherActivity
    implements RoboContext
{

    protected EventManager eventManager;
    ContentViewListener ignored;
    protected HashMap scopedObjects;

    public RoboLauncherActivity()
    {
        scopedObjects = new HashMap();
    }

    public Map getScopedObjectMap()
    {
        return scopedObjects;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        eventManager.fire(new OnActivityResultEvent(i, j, intent));
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        Configuration configuration1 = getResources().getConfiguration();
        super.onConfigurationChanged(configuration);
        eventManager.fire(new OnConfigurationChangedEvent(configuration1, configuration));
    }

    public void onContentChanged()
    {
        super.onContentChanged();
        RoboGuice.getInjector(this).injectViewMembers(this);
        eventManager.fire(new OnContentChangedEvent());
    }

    protected void onCreate(Bundle bundle)
    {
        RoboInjector roboinjector = RoboGuice.getInjector(this);
        eventManager = (EventManager)roboinjector.getInstance(roboguice/event/EventManager);
        roboinjector.injectMembersWithoutViews(this);
        super.onCreate(bundle);
        eventManager.fire(new OnCreateEvent(bundle));
    }

    protected void onDestroy()
    {
        eventManager.fire(new OnDestroyEvent());
        RoboGuice.destroyInjector(this);
        super.onDestroy();
        return;
        Exception exception;
        exception;
        super.onDestroy();
        throw exception;
        exception;
        RoboGuice.destroyInjector(this);
        super.onDestroy();
        throw exception;
        exception;
        super.onDestroy();
        throw exception;
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        eventManager.fire(new OnNewIntentEvent());
    }

    protected void onPause()
    {
        super.onPause();
        eventManager.fire(new OnPauseEvent());
    }

    protected void onRestart()
    {
        super.onRestart();
        eventManager.fire(new OnRestartEvent());
    }

    protected void onResume()
    {
        super.onResume();
        eventManager.fire(new OnResumeEvent());
    }

    protected void onStart()
    {
        super.onStart();
        eventManager.fire(new OnStartEvent());
    }

    protected void onStop()
    {
        eventManager.fire(new OnStopEvent());
        super.onStop();
        return;
        Exception exception;
        exception;
        super.onStop();
        throw exception;
    }
}
