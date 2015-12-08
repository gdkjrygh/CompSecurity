// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package org.chromium.base:
//            TraceEvent

class SystemMessageHandler extends Handler
{

    static final boolean $assertionsDisabled;
    private static final int DELAYED_SCHEDULED_WORK = 2;
    private static final int SCHEDULED_WORK = 1;
    private static final String TAG = "SystemMessageHandler";
    private long mDelayedScheduledTimeTicks;
    private long mMessagePumpDelegateNative;
    private MessageQueue mMessageQueue;
    private Field mMessageQueueMessageField;
    private Field mMessageTargetField;
    private boolean mQueueHasSyncBarrier;
    private long mSyncBarrierTraceId;

    private SystemMessageHandler(long l)
    {
        mMessagePumpDelegateNative = 0L;
        mDelayedScheduledTimeTicks = 0L;
        mMessagePumpDelegateNative = l;
        tryEnableSyncBarrierDetection();
    }

    private static SystemMessageHandler create(long l)
    {
        return new SystemMessageHandler(l);
    }

    private void disableSyncBarrierDetection()
    {
        Log.e("SystemMessageHandler", "Unexpected error with sync barrier detection, disabling.");
        mMessageQueue = null;
        mMessageQueueMessageField = null;
        mMessageTargetField = null;
        setqueueHasSyncBarrier(false);
    }

    private Object getField(Object obj, Field field)
    {
        try
        {
            obj = field.get(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("SystemMessageHandler", (new StringBuilder()).append("Failed field access: ").append(obj).toString());
            disableSyncBarrierDetection();
            return null;
        }
        return obj;
    }

    private boolean isSyncBarrierMessage(Message message)
    {
        while (message == null || getField(message, mMessageTargetField) != null) 
        {
            return false;
        }
        return true;
    }

    private native void nativeDoRunLoopOnce(long l, long l1);

    private void removeAllPendingMessages()
    {
        updateWhetherQueueHasBlockingSyncBarrier();
        removeMessages(1);
        removeMessages(2);
    }

    private void scheduleDelayedWork(long l, long l1)
    {
        if (mDelayedScheduledTimeTicks != 0L)
        {
            removeMessages(2);
        }
        mDelayedScheduledTimeTicks = l;
        updateWhetherQueueHasBlockingSyncBarrier();
        if (mQueueHasSyncBarrier)
        {
            TraceEvent.instant("SystemMessageHandler:delayedWorkBlocked");
        }
        sendEmptyMessageDelayed(2, l1);
    }

    private void scheduleWork()
    {
        updateWhetherQueueHasBlockingSyncBarrier();
        if (mQueueHasSyncBarrier)
        {
            TraceEvent.instant("SystemMessageHandler:immediateWorkBlocked");
        }
        sendEmptyMessage(1);
    }

    private void setqueueHasSyncBarrier(boolean flag)
    {
        if (flag == mQueueHasSyncBarrier)
        {
            return;
        }
        mQueueHasSyncBarrier = flag;
        if (mQueueHasSyncBarrier)
        {
            TraceEvent.startAsync("SyncBarrier", mSyncBarrierTraceId);
            return;
        } else
        {
            TraceEvent.finishAsync("SyncBarrier", mSyncBarrierTraceId);
            return;
        }
    }

    private void tryEnableSyncBarrierDetection()
    {
        if (!$assertionsDisabled && mMessageQueue != null)
        {
            throw new AssertionError();
        }
        mMessageQueue = (MessageQueue)android/os/Looper.getMethod("getQueue", new Class[0]).invoke(getLooper(), new Object[0]);
        mMessageQueueMessageField = mMessageQueue.getClass().getDeclaredField("mMessages");
        mMessageQueueMessageField.setAccessible(true);
        mMessageTargetField = android/os/Message.getDeclaredField("target");
        mMessageTargetField.setAccessible(true);
        mSyncBarrierTraceId = hashCode();
        if (false)
        {
            disableSyncBarrierDetection();
        }
_L2:
        return;
        Object obj;
        obj;
        Log.e("SystemMessageHandler", (new StringBuilder()).append("Failed to load method: ").append(obj).toString());
        if (false) goto _L2; else goto _L1
_L1:
        disableSyncBarrierDetection();
        return;
        obj;
        Log.e("SystemMessageHandler", (new StringBuilder()).append("Failed to load field: ").append(obj).toString());
        if (false) goto _L2; else goto _L3
_L3:
        disableSyncBarrierDetection();
        return;
        obj;
        Log.e("SystemMessageHandler", (new StringBuilder()).append("Failed invocation: ").append(obj).toString());
        if (false) goto _L2; else goto _L4
_L4:
        disableSyncBarrierDetection();
        return;
        obj;
        Log.e("SystemMessageHandler", (new StringBuilder()).append("Illegal access to reflected invocation: ").append(obj).toString());
        if (false) goto _L2; else goto _L5
_L5:
        disableSyncBarrierDetection();
        return;
        obj;
        Log.e("SystemMessageHandler", (new StringBuilder()).append("Illegal argument to reflected invocation: ").append(obj).toString());
        if (false) goto _L2; else goto _L6
_L6:
        disableSyncBarrierDetection();
        return;
        obj;
        Log.e("SystemMessageHandler", ((RuntimeException) (obj)).toString());
        if (false) goto _L2; else goto _L7
_L7:
        disableSyncBarrierDetection();
        return;
        obj;
        if (true)
        {
            disableSyncBarrierDetection();
        }
        throw obj;
    }

    private void updateWhetherQueueHasBlockingSyncBarrier()
    {
        if (mMessageQueue == null)
        {
            return;
        }
        if (!TraceEvent.enabled())
        {
            mQueueHasSyncBarrier = false;
            return;
        } else
        {
            setqueueHasSyncBarrier(isSyncBarrierMessage((Message)getField(mMessageQueue, mMessageQueueMessageField)));
            return;
        }
    }

    public void handleMessage(Message message)
    {
        updateWhetherQueueHasBlockingSyncBarrier();
        if (message.what == 2)
        {
            mDelayedScheduledTimeTicks = 0L;
        }
        nativeDoRunLoopOnce(mMessagePumpDelegateNative, mDelayedScheduledTimeTicks);
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/SystemMessageHandler.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
