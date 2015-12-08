// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.service;

import android.app.Service;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.inject.Injector;
import java.util.HashMap;
import java.util.Map;
import roboguice.RoboGuice;
import roboguice.event.EventManager;
import roboguice.service.event.OnConfigurationChangedEvent;
import roboguice.service.event.OnCreateEvent;
import roboguice.service.event.OnDestroyEvent;
import roboguice.service.event.OnStartEvent;
import roboguice.util.RoboContext;

public abstract class RoboService extends Service
    implements RoboContext
{

    protected EventManager eventManager;
    protected HashMap scopedObjects;

    public RoboService()
    {
        scopedObjects = new HashMap();
    }

    public Map getScopedObjectMap()
    {
        return scopedObjects;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        Configuration configuration1 = getResources().getConfiguration();
        super.onConfigurationChanged(configuration);
        eventManager.fire(new OnConfigurationChangedEvent(configuration1, configuration));
    }

    public void onCreate()
    {
        roboguice.inject.RoboInjector roboinjector = RoboGuice.getInjector(this);
        eventManager = (EventManager)roboinjector.getInstance(roboguice/event/EventManager);
        roboinjector.injectMembers(this);
        super.onCreate();
        eventManager.fire(new OnCreateEvent());
    }

    public void onDestroy()
    {
        if (eventManager != null)
        {
            eventManager.fire(new OnDestroyEvent());
        }
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

    public void onStart(Intent intent, int i)
    {
        super.onStart(intent, i);
        eventManager.fire(new OnStartEvent());
    }
}
