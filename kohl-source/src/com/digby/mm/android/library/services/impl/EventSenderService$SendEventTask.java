// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.services.impl;

import android.content.Context;
import android.os.AsyncTask;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.IEvent;
import com.digby.mm.android.library.events.IEventResponseHandler;
import com.digby.mm.android.library.events.queue.IBackoffManager;
import com.digby.mm.android.library.utils.HttpRequests;
import com.digby.mm.android.library.utils.ISettings;
import com.digby.mm.android.library.utils.Logger;
import java.util.Queue;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.services.impl:
//            EventSenderService

private class mNumTries extends AsyncTask
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
            Logger.Debug((new StringBuilder()).append("Sleeping for ").append(EventSenderService.access$000(EventSenderService.this).getBackoffValue()).append(" ms").toString(), EventSenderService.this);
            Thread.sleep(EventSenderService.access$000(EventSenderService.this).getBackoffValue());
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
        EventSenderService.access$000(EventSenderService.this).increaseBackoff();
        if (mNumTries < 5)
        {
            EventSenderService eventsenderservice = EventSenderService.this;
            IEvent ievent = mEvent;
            IEventResponseHandler ieventresponsehandler = mHandler;
            int i = mNumTries;
            mNumTries = i + 1;
            (eventsenderservice. new <init>(ievent, ieventresponsehandler, i)).execute(new String[0]);
            return;
        }
        try
        {
            EventSenderService.access$100(EventSenderService.this).remove();
            EventSenderService.access$200(EventSenderService.this).remove();
            EventSenderService.access$300(EventSenderService.this);
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
        EventSenderService.access$000(EventSenderService.this).decreaseBackoff();
        EventSenderService.access$100(EventSenderService.this).remove();
        EventSenderService.access$200(EventSenderService.this).remove();
        EventSenderService.access$300(EventSenderService.this);
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

    public Q(IEvent ievent, IEventResponseHandler ieventresponsehandler, int i)
    {
        this$0 = EventSenderService.this;
        super();
        mEvent = ievent;
        mHandler = ieventresponsehandler;
        mNumTries = i;
    }
}
