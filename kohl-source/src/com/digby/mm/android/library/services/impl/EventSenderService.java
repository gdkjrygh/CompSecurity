// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Binder;
import android.os.IBinder;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.events.queue.IBackoffManager;
import com.digby.mm.android.library.services.IEventSenderService;
import com.digby.mm.android.library.utils.HttpRequests;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.Logger;
import java.util.LinkedList;
import java.util.Queue;
import org.json.JSONObject;

public class EventSenderService extends Service
    implements IEventSenderService
{
    public class EventSenderServiceBinder extends Binder
    {

        final EventSenderService this$0;

        public IEventSenderService getService()
        {
            return EventSenderService.this;
        }

        public EventSenderServiceBinder()
        {
            this$0 = EventSenderService.this;
            super();
        }
    }

    private class SendEventTask extends AsyncTask
    {

        private IEvent mEvent;
        private IEventResponseHandler mHandler;
        private int mNumTries;
        private JSONObject mResponse;
        final EventSenderService this$0;

        private void handleRequest()
        {
            try
            {
                Logger.Debug((new StringBuilder()).append("Sleeping for ").append(mBackoffManager.getBackoffValue()).append(" ms").toString(), EventSenderService.this);
                Thread.sleep(mBackoffManager.getBackoffValue());
                Object obj = DigbyController.getInstance(mEvent.getContext()).getSettings();
                mEvent.beforeSend();
                Object obj1 = ((ISettings) (obj)).getBrandCode();
                obj = String.format("https://%s.api.%sdigby.com%s/api/brands/%s/events", new Object[] {
                    obj1, ((ISettings) (obj)).getServer(), ((ISettings) (obj)).getServerPort(), obj1
                });
                obj1 = mEvent.getContext().getApplicationContext();
                Logger.Debug((new StringBuilder()).append("Sending data to URL: ").append(((String) (obj))).toString(), ((Context) (obj1)));
                Logger.Debug((new StringBuilder()).append("JSON data to send: ").append(mEvent.getJSON()).toString(), ((Context) (obj1)));
                mResponse = HttpRequests.post(((String) (obj)), mEvent.getJSON().toString(), mEvent.getContext());
                return;
            }
            catch (Exception exception)
            {
                Logger.Error("SendEventTask_doInBackground", exception);
            }
        }

        private void handleResponse()
        {
            if (mResponse.has("ResponseCode"))
            {
                break MISSING_BLOCK_LABEL_133;
            }
            Logger.Debug("Connection timed out so increasing backoff and trying to send this event again", EventSenderService.this);
            mBackoffManager.increaseBackoff();
            if (mNumTries < 5)
            {
                EventSenderService eventsenderservice = EventSenderService.this;
                IEvent ievent = mEvent;
                IEventResponseHandler ieventresponsehandler = mHandler;
                int i = mNumTries;
                mNumTries = i + 1;
                (eventsenderservice. new SendEventTask(ievent, ieventresponsehandler, i)).execute(new String[0]);
                return;
            }
            try
            {
                mEventQueue.remove();
                mEventResponseHandlerQueue.remove();
                sendAnotherEventOrStop();
                return;
            }
            catch (Exception exception)
            {
                Logger.Error("SendEventTask_onPostExecute", exception);
            }
            return;
            if (mHandler != null)
            {
                mHandler.handleEventResponse(mResponse, mEvent);
            }
            mBackoffManager.decreaseBackoff();
            mEventQueue.remove();
            mEventResponseHandlerQueue.remove();
            sendAnotherEventOrStop();
            return;
        }

        protected transient Integer doInBackground(String as[])
        {
            handleRequest();
            handleResponse();
            return Integer.valueOf(1);
        }

        protected volatile Object doInBackground(Object aobj[])
        {
            return doInBackground((String[])aobj);
        }

        public SendEventTask(IEvent ievent, IEventResponseHandler ieventresponsehandler, int i)
        {
            this$0 = EventSenderService.this;
            super();
            mEvent = ievent;
            mHandler = ieventresponsehandler;
            mNumTries = i;
        }
    }


    private static final int mMaxNumTries = 5;
    private static final String mServerURL = "https://%s.api.%sdigby.com%s/api/brands/%s/events";
    private IBackoffManager mBackoffManager;
    private final IBinder mBinder = new EventSenderServiceBinder();
    private ConnectivityManager mConnectivityManager;
    private BroadcastReceiver mConnectivityReceiver;
    private Queue mEventQueue;
    private Queue mEventResponseHandlerQueue;
    private boolean mInitialized;

    public EventSenderService()
    {
        mInitialized = false;
        mConnectivityReceiver = new BroadcastReceiver() {

            final EventSenderService this$0;

            public void onReceive(Context context, Intent intent)
            {
                try
                {
                    if (mConnectivityManager.getActiveNetworkInfo() != null && mConnectivityManager.getActiveNetworkInfo().isConnected())
                    {
                        sendAnotherEventOrStop();
                        unregisterReceiver(this);
                    }
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    Logger.Error("mConnectivityReceiver_onReceive: ", context);
                }
            }

            
            {
                this$0 = EventSenderService.this;
                super();
            }
        };
    }

    private void sendAnotherEventOrStop()
    {
        if (getEventCount() <= 0)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        Logger.Debug("sending event instead of stoppin", this);
        if (mConnectivityManager.getActiveNetworkInfo() != null && mConnectivityManager.getActiveNetworkInfo().isConnected())
        {
            Logger.Debug("We have a connection, so send the event", this);
            (new SendEventTask((IEvent)mEventQueue.peek(), (IEventResponseHandler)mEventResponseHandlerQueue.peek(), 0)).execute(new String[0]);
            return;
        }
        try
        {
            Logger.Debug("Active network not connected, registering for changes in network connectivity", this);
            registerReceiver(mConnectivityReceiver, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("sendAnotherEventOrStop: ", exception);
        }
        return;
        Logger.Debug("no events left in the queue so stopping self", this);
        stopSelf();
        return;
    }

    public void addEvent(IEvent ievent, IEventResponseHandler ieventresponsehandler)
        throws IllegalStateException
    {
        if (!mInitialized)
        {
            throw new IllegalStateException("You must call initializeService before you can call this method.");
        }
        if (ievent == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        JSONObject jsonobject = ievent.getJSON();
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        String s;
        s = jsonobject.getString("eventType");
        if (jsonobject.getDouble("latitude") == -1D)
        {
            Logger.Debug((new StringBuilder()).append("-1 latitude found: ").append(jsonobject.toString()).toString());
            if (!"DEVICE_REGISTRATION".equals(s) && !"PUSH_CALLBACK".equals(s) && !"CHECKIN".equals(s) && !"MESSAGE_IMPRESSION".equals(s))
            {
                break MISSING_BLOCK_LABEL_234;
            }
            Logger.Debug("We still send DEVICE_REGISTRATION, PUSH_CALLBACK , CHECKIN and MESSAGE_IMPRESSION events when latitude is -1");
        }
        if (ievent.addToQueue(mEventQueue))
        {
            Logger.Debug((new StringBuilder()).append("Adding ").append(ievent.getClass()).append(" to mEventQueue").toString(), this);
            mEventQueue.add(ievent);
            mEventResponseHandlerQueue.add(ieventresponsehandler);
            Logger.Debug((new StringBuilder()).append("Event Count: ").append(getEventCount()).toString(), this);
            if (getEventCount() == 1)
            {
                Logger.Debug("calling sendAnotherEventOrStop", this);
                sendAnotherEventOrStop();
                return;
            }
            break MISSING_BLOCK_LABEL_297;
        }
        break MISSING_BLOCK_LABEL_266;
        try
        {
            Logger.Debug((new StringBuilder()).append(s).append(" has been ignore because latitude is -1").toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IEvent ievent)
        {
            Logger.Error("addEvent: ", ievent);
        }
        return;
        Logger.Debug((new StringBuilder()).append("Already have ").append(ievent.getClass()).append(" in mEventQueue, ignore it.").toString(), this);
    }

    public int getEventCount()
        throws IllegalStateException
    {
        if (!mInitialized)
        {
            throw new IllegalStateException("You must call initializeService before you can call this method.");
        } else
        {
            return mEventQueue.size();
        }
    }

    public void initializeService(IBackoffManager ibackoffmanager, ConnectivityManager connectivitymanager)
    {
        try
        {
            if (!mInitialized)
            {
                mBackoffManager = ibackoffmanager;
                mConnectivityManager = connectivitymanager;
                mInitialized = true;
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IBackoffManager ibackoffmanager)
        {
            Logger.Error("initializeService: ", ibackoffmanager);
        }
    }

    public IBinder onBind(Intent intent)
    {
        Logger.Debug("EventSenderService_onBind", this);
        return mBinder;
    }

    public void onCreate()
    {
        try
        {
            Logger.Debug("EventSenderService_onCreate", this);
            mEventQueue = new LinkedList();
            mEventResponseHandlerQueue = new LinkedList();
            return;
        }
        catch (Exception exception)
        {
            Logger.Error("EventSenderService_onCreate: ", exception);
        }
    }

    public void onDestroy()
    {
        Logger.Debug("EventSenderService_onDestroy", this);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        Logger.Debug("EventSenderService_onStart", this);
        return 1;
    }





}
