// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.squareup.picasso:
//            BitmapHunter

class PicassoExecutorService extends ThreadPoolExecutor
{
    private static final class PicassoFutureTask extends FutureTask
        implements Comparable
    {

        private final BitmapHunter hunter;

        public int compareTo(PicassoFutureTask picassofuturetask)
        {
            Picasso.Priority priority = hunter.getPriority();
            Picasso.Priority priority1 = picassofuturetask.hunter.getPriority();
            if (priority == priority1)
            {
                return hunter.sequence - picassofuturetask.hunter.sequence;
            } else
            {
                return priority1.ordinal() - priority.ordinal();
            }
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((PicassoFutureTask)obj);
        }

        public PicassoFutureTask(BitmapHunter bitmaphunter)
        {
            super(bitmaphunter, null);
            hunter = bitmaphunter;
        }
    }


    PicassoExecutorService()
    {
        super(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new Utils.PicassoThreadFactory());
    }

    private void setThreadCount(int i)
    {
        setCorePoolSize(i);
        setMaximumPoolSize(i);
    }

    void adjustThreadCount(NetworkInfo networkinfo)
    {
        if (networkinfo == null || !networkinfo.isConnectedOrConnecting())
        {
            setThreadCount(3);
            return;
        }
        switch (networkinfo.getType())
        {
        default:
            setThreadCount(3);
            return;

        case 1: // '\001'
        case 6: // '\006'
        case 9: // '\t'
            setThreadCount(4);
            return;

        case 0: // '\0'
            switch (networkinfo.getSubtype())
            {
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            default:
                setThreadCount(3);
                return;

            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
                setThreadCount(3);
                return;

            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 12: // '\f'
                setThreadCount(2);
                return;

            case 1: // '\001'
            case 2: // '\002'
                setThreadCount(1);
                return;
            }
        }
    }

    public Future submit(Runnable runnable)
    {
        runnable = new PicassoFutureTask((BitmapHunter)runnable);
        execute(runnable);
        return runnable;
    }
}
