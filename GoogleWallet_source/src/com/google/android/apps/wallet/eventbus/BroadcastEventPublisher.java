// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.eventbus;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.util.async.AsyncCallback;
import com.google.android.apps.wallet.util.async.ThreadChecker;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

// Referenced classes of package com.google.android.apps.wallet.eventbus:
//            InitializedEventPublisher, EventBus, RegistrationCallback

public abstract class BroadcastEventPublisher
    implements InitializedEventPublisher
{

    private static final String TAG = com/google/android/apps/wallet/eventbus/BroadcastEventPublisher.getSimpleName();
    private final Application application;
    private final EventBus eventBus;
    private final Class eventType;
    private boolean firstRegistrationEvent;
    private final AsyncCallback initialEventCallback = new AsyncCallback() {

        final BroadcastEventPublisher this$0;

        public final void onFailure(Exception exception)
        {
            ThreadChecker _tmp = threadChecker;
            ThreadChecker.checkOnUiThread();
            WLog.e(BroadcastEventPublisher.TAG, "Error getting initial event", exception);
        }

        public final void onSuccess(Object obj)
        {
            ThreadChecker _tmp = threadChecker;
            ThreadChecker.checkOnUiThread();
            if (!lastEvent.isPresent() && obj != null)
            {
                lastEvent = Optional.of(obj);
                postLastEvent();
            }
        }

            
            {
                this$0 = BroadcastEventPublisher.this;
                super();
            }
    };
    private Optional lastEvent;
    private final String receiverAction;
    private final ThreadChecker threadChecker;

    protected BroadcastEventPublisher(Application application1, EventBus eventbus, ThreadChecker threadchecker, Class class1, String s)
    {
        firstRegistrationEvent = true;
        application = application1;
        eventBus = eventbus;
        threadChecker = threadchecker;
        receiverAction = s;
        eventType = class1;
        lastEvent = Optional.absent();
    }

    private void onFirstRegistrationEvent()
    {
        BroadcastReceiver broadcastreceiver = new BroadcastReceiver() {

            final BroadcastEventPublisher this$0;

            public final void onReceive(Context context, Intent intent)
            {
                Preconditions.checkNotNull(intent);
                context = ((Context) (translateIntent(intent)));
                if (!lastEvent.isPresent() || !Objects.equal(context, lastEvent.get()))
                {
                    lastEvent = Optional.of(context);
                    postLastEvent();
                }
            }

            
            {
                this$0 = BroadcastEventPublisher.this;
                super();
            }
        };
        application.registerReceiver(broadcastreceiver, new IntentFilter(receiverAction));
        getInitialEvent(initialEventCallback);
    }

    private void postLastEvent()
    {
        if (lastEvent.isPresent())
        {
            eventBus.post(lastEvent.get());
        }
    }

    protected void getInitialEvent(AsyncCallback asynccallback)
    {
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(eventType, new RegistrationCallback() {

            final BroadcastEventPublisher this$0;

            public final void handleRegistration(Object obj)
            {
                if (firstRegistrationEvent)
                {
                    firstRegistrationEvent = false;
                    onFirstRegistrationEvent();
                }
                postLastEvent();
            }

            
            {
                this$0 = BroadcastEventPublisher.this;
                super();
            }
        });
    }

    protected abstract Object translateIntent(Intent intent);





/*
    static Optional access$102(BroadcastEventPublisher broadcasteventpublisher, Optional optional)
    {
        broadcasteventpublisher.lastEvent = optional;
        return optional;
    }

*/





/*
    static boolean access$402(BroadcastEventPublisher broadcasteventpublisher, boolean flag)
    {
        broadcasteventpublisher.firstRegistrationEvent = flag;
        return flag;
    }

*/

}
