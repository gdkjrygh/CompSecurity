// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.events;

import android.content.Context;
import io.fabric.sdk.android.services.common.CommonUtils;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package io.fabric.sdk.android.services.events:
//            EventsStrategy, EventsFilesManager, TimeBasedFileRollOverRunnable, FilesSender

public abstract class EnabledEventsStrategy
    implements EventsStrategy
{

    protected static final int UNDEFINED_ROLLOVER_INTERVAL_SECONDS = -1;
    protected final Context context;
    protected final ScheduledExecutorService executorService;
    protected final EventsFilesManager filesManager;
    protected volatile int rolloverIntervalSeconds;
    protected final AtomicReference scheduledRolloverFutureRef = new AtomicReference();

    public EnabledEventsStrategy(Context context1, ScheduledExecutorService scheduledexecutorservice, EventsFilesManager eventsfilesmanager)
    {
        rolloverIntervalSeconds = -1;
        context = context1;
        executorService = scheduledexecutorservice;
        filesManager = eventsfilesmanager;
    }

    public void cancelTimeBasedFileRollOver()
    {
        if (scheduledRolloverFutureRef.get() != null)
        {
            CommonUtils.logControlled(context, "Cancelling time-based rollover because no events are currently being generated.");
            ((ScheduledFuture)scheduledRolloverFutureRef.get()).cancel(false);
            scheduledRolloverFutureRef.set(null);
        }
    }

    protected void configureRollover(int i)
    {
        rolloverIntervalSeconds = i;
        scheduleTimeBasedFileRollOver(0, rolloverIntervalSeconds);
    }

    public void deleteAllEvents()
    {
        filesManager.deleteAllEventsFiles();
    }

    public void recordEvent(Object obj)
    {
        CommonUtils.logControlled(context, obj.toString());
        try
        {
            filesManager.writeEvent(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            CommonUtils.logControlledError(context, "Failed to write event.", ((Throwable) (obj)));
        }
        scheduleTimeBasedRollOverIfNeeded();
    }

    public boolean rollFileOver()
    {
        boolean flag;
        try
        {
            flag = filesManager.rollFileOver();
        }
        catch (IOException ioexception)
        {
            CommonUtils.logControlledError(context, "Failed to roll file over.", ioexception);
            return false;
        }
        return flag;
    }

    protected void scheduleTimeBasedFileRollOver(int i, int j)
    {
        try
        {
            TimeBasedFileRollOverRunnable timebasedfilerolloverrunnable = new TimeBasedFileRollOverRunnable(context, this);
            CommonUtils.logControlled(context, (new StringBuilder()).append("Scheduling time based file roll over every ").append(j).append(" seconds").toString());
            scheduledRolloverFutureRef.set(executorService.scheduleAtFixedRate(timebasedfilerolloverrunnable, i, j, TimeUnit.SECONDS));
            return;
        }
        catch (RejectedExecutionException rejectedexecutionexception)
        {
            CommonUtils.logControlledError(context, "Failed to schedule time based file roll over", rejectedexecutionexception);
        }
    }

    public void scheduleTimeBasedRollOverIfNeeded()
    {
        boolean flag;
        boolean flag1;
        if (rolloverIntervalSeconds != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (scheduledRolloverFutureRef.get() == null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag && flag1)
        {
            scheduleTimeBasedFileRollOver(rolloverIntervalSeconds, rolloverIntervalSeconds);
        }
    }

    void sendAndCleanUpIfSuccess()
    {
        FilesSender filessender = getFilesSender();
        if (filessender != null) goto _L2; else goto _L1
_L1:
        CommonUtils.logControlled(context, "skipping files send because we don't yet know the target endpoint");
_L6:
        return;
_L2:
        List list;
        int i;
        int j;
        CommonUtils.logControlled(context, "Sending all files");
        i = 0;
        j = 0;
        list = filesManager.getBatchOfFilesToSend();
        CommonUtils.logControlled(context, String.format(Locale.US, "attempt to send batch of %d files", new Object[] {
            Integer.valueOf(list.size())
        }));
_L7:
        int k;
        k = j;
        i = j;
        if (list.size() <= 0) goto _L4; else goto _L3
_L3:
        i = j;
        boolean flag = filessender.send(list);
        k = j;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        i = j;
        k = j + list.size();
        i = k;
        filesManager.deleteSentFiles(list);
        if (flag) goto _L5; else goto _L4
_L4:
        if (k == 0)
        {
            filesManager.deleteOldestInRollOverIfOverMax();
            return;
        }
          goto _L6
_L5:
        i = k;
        list = filesManager.getBatchOfFilesToSend();
        j = k;
          goto _L7
        Exception exception;
        exception;
        CommonUtils.logControlledError(context, (new StringBuilder()).append("Failed to send batch of analytics files to server: ").append(exception.getMessage()).toString(), exception);
        k = i;
          goto _L4
    }

    public void sendEvents()
    {
        sendAndCleanUpIfSuccess();
    }
}
