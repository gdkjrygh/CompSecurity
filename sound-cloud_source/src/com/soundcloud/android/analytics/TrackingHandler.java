// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.android.utils.NetworkConnectionHelper;
import com.soundcloud.propeller.ChangeResult;
import com.soundcloud.propeller.InsertResult;
import java.io.UnsupportedEncodingException;
import java.util.List;

// Referenced classes of package com.soundcloud.android.analytics:
//            EventTracker, TrackingStorage, TrackingRecord, TrackingApiFactory, 
//            TrackingApi

class TrackingHandler extends Handler
{

    static final int FINISH_TOKEN = 0xdeadbeef;
    static final int FLUSH_TOKEN = 1;
    static final int INSERT_TOKEN = 0;
    private final TrackingApiFactory apiFactory;
    private final NetworkConnectionHelper networkConnectionHelper;
    private final TrackingStorage storage;

    TrackingHandler(Looper looper, NetworkConnectionHelper networkconnectionhelper, TrackingStorage trackingstorage, TrackingApiFactory trackingapifactory)
    {
        super(looper);
        networkConnectionHelper = networkconnectionhelper;
        storage = trackingstorage;
        apiFactory = trackingapifactory;
    }

    private void flushTrackingEvents(Message message)
    {
        String s = (String)message.obj;
        if (networkConnectionHelper.isNetworkConnected())
        {
            message = EventTracker.TAG;
            (new StringBuilder("flushing tracking events (backend = ")).append(s).append(")");
            if (s == null)
            {
                message = storage.getPendingEvents();
            } else
            {
                message = storage.getPendingEventsForBackend(s);
            }
            if (!message.isEmpty())
            {
                submitEvents(message, s);
            }
            return;
        } else
        {
            message = EventTracker.TAG;
            return;
        }
    }

    private void handleTrackingEvent(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 3: default 40
    //                   -559038737: 147
    //                   0: 41
    //                   1: 141;
           goto _L1 _L2 _L3 _L4
_L1:
        return;
_L3:
        try
        {
            Object obj = EventTracker.TAG;
            (new StringBuilder("Inserting event: ")).append(message.obj).append("\nthread=").append(Thread.currentThread());
            obj = storage.insertEvent((TrackingRecord)message.obj);
            if (!((InsertResult) (obj)).success())
            {
                ErrorUtils.handleSilentException(EventTracker.TAG, new Exception((new StringBuilder("error inserting tracking event ")).append(message.obj).toString(), ((InsertResult) (obj)).getFailure()));
                return;
            }
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            ErrorUtils.handleSilentException(EventTracker.TAG, message);
            return;
        }
          goto _L1
_L4:
        flushTrackingEvents(message);
        return;
_L2:
        message = EventTracker.TAG;
        removeCallbacksAndMessages(null);
        getLooper().quit();
        return;
    }

    private void submitEvents(List list, String s)
    {
        int i;
label0:
        {
            list = apiFactory.create(s).pushToRemote(list);
            if (!list.isEmpty())
            {
                s = storage.deleteEvents(list);
                i = s.getNumRowsAffected();
                if (!s.success() || list.size() != i)
                {
                    break label0;
                }
                list = EventTracker.TAG;
                (new StringBuilder("submitted ")).append(i).append(" events");
            }
            return;
        }
        ErrorUtils.handleSilentException(EventTracker.TAG, new Exception((new StringBuilder("Failed to delete some tracking events: failed = ")).append(list.size() - i).toString(), s.getFailure()));
    }

    public void handleMessage(Message message)
    {
        try
        {
            handleTrackingEvent(message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            ErrorUtils.handleSilentException(EventTracker.TAG, message);
        }
    }
}
