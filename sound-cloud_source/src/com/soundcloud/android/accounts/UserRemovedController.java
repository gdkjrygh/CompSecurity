// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.accounts;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.soundcloud.android.events.CurrentUserChangedEvent;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.rx.RxUtils;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.lightcycle.DefaultActivityLightCycle;
import com.soundcloud.rx.eventbus.EventBus;
import rx.Y;

public class UserRemovedController extends DefaultActivityLightCycle
{
    private static class CurrentUserChangedSubscriber extends DefaultSubscriber
    {

        private final Activity activity;

        public void onNext(CurrentUserChangedEvent currentuserchangedevent)
        {
            if (currentuserchangedevent.getKind() == 1)
            {
                activity.finish();
            }
        }

        public volatile void onNext(Object obj)
        {
            onNext((CurrentUserChangedEvent)obj);
        }

        public CurrentUserChangedSubscriber(Activity activity1)
        {
            activity = activity1;
        }
    }


    private final EventBus eventBus;
    private Y userEventSubscription;

    public UserRemovedController(EventBus eventbus)
    {
        userEventSubscription = RxUtils.invalidSubscription();
        eventBus = eventbus;
    }

    public volatile void onCreate(Activity activity, Bundle bundle)
    {
        onCreate((AppCompatActivity)activity, bundle);
    }

    public void onCreate(AppCompatActivity appcompatactivity, Bundle bundle)
    {
        userEventSubscription = eventBus.subscribe(EventQueue.CURRENT_USER_CHANGED, new CurrentUserChangedSubscriber(appcompatactivity));
    }

    public volatile void onDestroy(Activity activity)
    {
        onDestroy((AppCompatActivity)activity);
    }

    public void onDestroy(AppCompatActivity appcompatactivity)
    {
        userEventSubscription.unsubscribe();
    }
}
