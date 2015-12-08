// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.events.impl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.os.IBinder;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.events.IEventSender;
import com.digby.mm.android.library.events.queue.impl.BackoffManager;
import com.digby.mm.android.library.services.IEventSenderService;
import com.digby.mm.android.library.services.impl.EventSenderService;
import com.digby.mm.android.library.utils.Logger;

public class EventSender
    implements IEventSender
{

    private ServiceConnection mConnection;
    private IEvent mEvent;
    private IEventResponseHandler mHandler;
    private IEventSenderService mService;

    public EventSender()
    {
        mConnection = new ServiceConnection() {

            final EventSender this$0;

            public void onServiceConnected(ComponentName componentname, IBinder ibinder)
            {
                mService = ((com.digby.mm.android.library.services.impl.EventSenderService.EventSenderServiceBinder)ibinder).getService();
                mService.initializeService(new BackoffManager(), (ConnectivityManager)mEvent.getContext().getSystemService("connectivity"));
                mService.addEvent(mEvent, mHandler);
                mEvent.getContext().unbindService(this);
            }

            public void onServiceDisconnected(ComponentName componentname)
            {
                mService = null;
            }

            
            {
                this$0 = EventSender.this;
                super();
            }
        };
    }

    public void send(IEvent ievent, IEventResponseHandler ieventresponsehandler)
    {
        try
        {
            mEvent = ievent;
            mHandler = ieventresponsehandler;
            ieventresponsehandler = new Intent(ievent.getContext(), com/digby/mm/android/library/services/impl/EventSenderService);
            ievent.getContext().startService(ieventresponsehandler);
            ievent.getContext().bindService(ieventresponsehandler, mConnection, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEvent ievent)
        {
            Logger.Error("send", ievent);
        }
    }



/*
    static IEventSenderService access$002(EventSender eventsender, IEventSenderService ieventsenderservice)
    {
        eventsender.mService = ieventsenderservice;
        return ieventsenderservice;
    }

*/


}
