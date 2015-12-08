// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.chimera;

import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import com.google.android.chimera.Service;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.drive.events.ChangeEvent;
import com.google.android.gms.drive.events.ChangesAvailableEvent;
import com.google.android.gms.drive.events.CompletionEvent;
import com.google.android.gms.drive.events.DriveEvent;
import com.google.android.gms.drive.internal.DriveLog;
import com.google.android.gms.drive.internal.OnEventResponse;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class DriveEventService extends Service
{
    final class EventHandler extends Handler
    {

        final DriveEventService this$0;

        public final void handleMessage(Message message)
        {
            DriveLog.d("DriveEventService", (new StringBuilder("handleMessage message type:")).append(message.what).toString());
            switch (message.what)
            {
            default:
                DriveLog.w("DriveEventService", (new StringBuilder("Unexpected message type:")).append(message.what).toString());
                return;

            case 1: // '\001'
                DriveEventService.access$000(DriveEventService.this, (OnEventResponse)message.obj);
                return;

            case 2: // '\002'
                getLooper().quit();
                break;
            }
        }



        EventHandler()
        {
            this$0 = DriveEventService.this;
            super();
        }
    }

    final class EventRouter extends com.google.android.gms.drive.internal.IEventCallback.Stub
    {

        final DriveEventService this$0;

        public final void onEvent(OnEventResponse oneventresponse)
            throws RemoteException
        {
            DriveEventService driveeventservice = DriveEventService.this;
            driveeventservice;
            JVM INSTR monitorenter ;
            DriveLog.d("DriveEventService", (new StringBuilder("onEvent: ")).append(oneventresponse).toString());
            DriveEventService.access$100(DriveEventService.this);
            if (mEventHandler == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            oneventresponse = mEventHandler.obtainMessage(oneventresponse);
            mEventHandler.sendMessage(oneventresponse);
_L2:
            return;
            DriveLog.e("DriveEventService", "Receiving event before initialize is completed.");
            if (true) goto _L2; else goto _L1
_L1:
            oneventresponse;
            driveeventservice;
            JVM INSTR monitorexit ;
            throw oneventresponse;
        }

        EventRouter()
        {
            this$0 = DriveEventService.this;
            super();
        }
    }


    EventHandler mEventHandler;
    private CountDownLatch mEventHandlerQuitLatch;
    int mGmsCoreUid;
    boolean mInitializing;
    private final String mName;

    protected DriveEventService()
    {
        this("DriveEventService");
    }

    public DriveEventService(String s)
    {
        mInitializing = false;
        mGmsCoreUid = -1;
        mName = s;
    }

    public final IBinder onBind(final Intent initLatch)
    {
        this;
        JVM INSTR monitorenter ;
        if (!"com.google.android.gms.drive.events.HANDLE_EVENT".equals(initLatch.getAction())) goto _L2; else goto _L1
_L1:
        if (mEventHandler != null || mInitializing)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        mInitializing = true;
        initLatch = new CountDownLatch(1);
        mEventHandlerQuitLatch = new CountDownLatch(1);
        (new Thread() {

            final DriveEventService this$0;
            final CountDownLatch val$initLatch;

            public final void run()
            {
                Looper.prepare();
                mEventHandler = new EventHandler();
                mInitializing = false;
                initLatch.countDown();
                DriveLog.d("DriveEventService", "Bound and starting loop");
                Looper.loop();
                DriveLog.d("DriveEventService", "Finished loop");
                if (mEventHandlerQuitLatch != null)
                {
                    mEventHandlerQuitLatch.countDown();
                }
                return;
                Exception exception;
                exception;
                if (mEventHandlerQuitLatch != null)
                {
                    mEventHandlerQuitLatch.countDown();
                }
                throw exception;
            }

            
            {
                this$0 = DriveEventService.this;
                initLatch = countdownlatch;
                super();
            }
        }).start();
        if (!initLatch.await(5000L, TimeUnit.MILLISECONDS))
        {
            DriveLog.e("DriveEventService", "Failed to synchronously initialize event handler.");
        }
        initLatch = (new EventRouter()).asBinder();
_L4:
        this;
        JVM INSTR monitorexit ;
        return initLatch;
        initLatch;
        throw new RuntimeException("Unable to start event handler", initLatch);
        initLatch;
        this;
        JVM INSTR monitorexit ;
        throw initLatch;
_L2:
        initLatch = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onCompletion(CompletionEvent completionevent)
    {
        DriveLog.w(mName, (new StringBuilder("Unhandled completion event: ")).append(completionevent).toString());
    }

    public void onDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        DriveLog.d("DriveEventService", "onDestroy");
        if (mEventHandler == null)
        {
            break MISSING_BLOCK_LABEL_66;
        }
        Message message = mEventHandler.obtainMessage();
        mEventHandler.sendMessage(message);
        mEventHandler = null;
        Exception exception;
        try
        {
            if (!mEventHandlerQuitLatch.await(5000L, TimeUnit.MILLISECONDS))
            {
                DriveLog.w("DriveEventService", "Failed to synchronously quit event handler. Will quit itself");
            }
        }
        catch (InterruptedException interruptedexception) { }
        mEventHandlerQuitLatch = null;
        super.onDestroy();
        this;
        JVM INSTR monitorexit ;
        return;
        exception;
        throw exception;
    }

    public boolean onUnbind(Intent intent)
    {
        return true;
    }


/*
    static void access$000(DriveEventService driveeventservice, OnEventResponse oneventresponse)
    {
        oneventresponse.mEventType;
        JVM INSTR tableswitch 1 6: default 44
    //                   1 71
    //                   2 156
    //                   3 164
    //                   4 172
    //                   5 180
    //                   6 180;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L6
_L1:
        throw new IllegalStateException((new StringBuilder("Unexpected event type ")).append(oneventresponse.mEventType).toString());
_L2:
        oneventresponse = oneventresponse.mChangeEvent;
_L11:
        DriveLog.d("DriveEventService", (new StringBuilder("handleEventMessage: ")).append(oneventresponse).toString());
        oneventresponse.getType();
        JVM INSTR tableswitch 1 4: default 281
    //                   1 188
    //                   2 243
    //                   3 132
    //                   4 252;
           goto _L7 _L8 _L9 _L7 _L10
_L7:
        DriveLog.w(driveeventservice.mName, (new StringBuilder("Unhandled event: ")).append(oneventresponse).toString());
        return;
_L3:
        oneventresponse = oneventresponse.mCompletionEvent;
          goto _L11
_L4:
        oneventresponse = oneventresponse.mQueryResultEvent;
          goto _L11
_L5:
        oneventresponse = oneventresponse.mChangesAvailableEvent;
          goto _L11
_L6:
        oneventresponse = oneventresponse.mProgressEvent;
          goto _L11
_L8:
        try
        {
            ChangeEvent changeevent = (ChangeEvent)oneventresponse;
            DriveLog.w(driveeventservice.mName, (new StringBuilder("Unhandled change event: ")).append(changeevent).toString());
            return;
        }
        catch (Exception exception)
        {
            DriveLog.e(driveeventservice.mName, exception, (new StringBuilder("Error handling event: ")).append(oneventresponse).toString());
        }
        return;
_L9:
        driveeventservice.onCompletion((CompletionEvent)oneventresponse);
        return;
_L10:
        ChangesAvailableEvent changesavailableevent = (ChangesAvailableEvent)oneventresponse;
        DriveLog.w(driveeventservice.mName, (new StringBuilder("Unhandled changes available event: ")).append(changesavailableevent).toString());
        return;
    }

*/


/*
    static void access$100(DriveEventService driveeventservice)
        throws SecurityException
    {
label0:
        {
            int i = Binder.getCallingUid();
            if (i != driveeventservice.mGmsCoreUid)
            {
                if (!GooglePlayServicesUtil.isGooglePlayServicesUid(driveeventservice, i))
                {
                    break label0;
                }
                driveeventservice.mGmsCoreUid = i;
            }
            return;
        }
        throw new SecurityException("Caller is not GooglePlayServices");
    }

*/

}
