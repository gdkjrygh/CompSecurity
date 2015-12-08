// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.utilities;

import com.accuweather.android.services.BaseUpdateTask;
import com.accuweather.android.services.ITaskFactory;
import com.accuweather.android.services.TaskFactoryImpl;
import com.accuweather.android.services.request.Request;
import com.accuweather.android.services.request.WeatherUpdateTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.accuweather.android.utilities:
//            Logger, Data

public class TaskQueue
{

    private Data mData;
    private BaseUpdateTask mTask;
    private ITaskFactory mTaskFactory;
    private ArrayList mTasks;

    public TaskQueue(Data data)
    {
        mTasks = new ArrayList();
        mData = data;
        mTaskFactory = new TaskFactoryImpl();
    }

    private boolean areAllTaskArgumentsInQueue(List list)
    {
        for (int i = 0; i < mTasks.size(); i++)
        {
            if (((List)mTasks.get(i)).containsAll(list))
            {
                return true;
            }
        }

        return false;
    }

    private void clearQueueWhileRetainingWidgetAndNotificationCalls()
    {
        for (int i = mTasks.size() - 1; i >= 0; i--)
        {
            List list = (List)mTasks.get(i);
            if (!containsWidgetParam(list) && !containsNotificationParam(list))
            {
                mTasks.remove(i);
            }
        }

    }

    private boolean containsNotificationParam(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((Request)list.next()).isNotification())
            {
                return true;
            }
        }

        return false;
    }

    private boolean containsNotificationTask(WeatherUpdateTask weatherupdatetask)
    {
        return weatherupdatetask.containsNotificationTask();
    }

    private boolean containsWidgetParam(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((Request)list.next()).isWidget())
            {
                return true;
            }
        }

        return false;
    }

    private boolean containsWidgetTask(WeatherUpdateTask weatherupdatetask)
    {
        return weatherupdatetask.containsWidgetTask();
    }

    public void clearTaskQueue()
    {
        if (mTask == null) goto _L2; else goto _L1
_L1:
        if (mTask instanceof WeatherUpdateTask) goto _L4; else goto _L3
_L3:
        mTask.cancel(true);
_L2:
        clearQueueWhileRetainingWidgetAndNotificationCalls();
        executeNextTask();
        return;
_L4:
        if (!containsWidgetTask((WeatherUpdateTask)mTask) || containsNotificationTask((WeatherUpdateTask)mTask))
        {
            mTask.cancel(true);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public void executeNextTask()
    {
        if (mTasks.size() != 0)
        {
            if (mTask != null)
            {
                mTask.cancel(true);
            }
            List list = (List)mTasks.get(0);
            BaseUpdateTask baseupdatetask = mTaskFactory.getTask(list, mData);
            if (baseupdatetask != null)
            {
                mTask = baseupdatetask;
            }
            if (mTask != null)
            {
                if (Logger.isDebugEnabled())
                {
                    Logger.d(getClass().getName(), (new StringBuilder()).append("In executeNextTask(), mTask = ").append(mTask).toString());
                }
                if (mData.isTesting())
                {
                    mTask.executeSync(new List[] {
                        list
                    });
                    return;
                } else
                {
                    mTask.execute(new List[] {
                        list
                    });
                    return;
                }
            }
        }
    }

    public List getTasks()
    {
        return mTasks;
    }

    public void queueRequest(List list)
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In addTaskToQueue(), requests = ").append(list).append(", queue = ").append(mTasks).toString());
        }
        Logger.printMethodTrace(getClass().getName());
        if (!areAllTaskArgumentsInQueue(list))
        {
            mTasks.add(list);
        }
        if (mTasks.size() == 1)
        {
            executeNextTask();
        } else
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In addTaskToQueue(), queue size = ").append(mTasks.size()).append(" and will not execute a task now.").toString());
            return;
        }
    }

    public transient void queueRequest(Request arequest[])
    {
        ArrayList arraylist = new ArrayList();
        int j = arequest.length;
        for (int i = 0; i < j; i++)
        {
            arraylist.add(arequest[i]);
        }

        queueRequest(((List) (arraylist)));
    }

    public void removeTaskFromQueue()
    {
        if (Logger.isDebugEnabled())
        {
            Logger.d(getClass().getName(), (new StringBuilder()).append("In removeTaskFromQueue(), queue size = ").append(mTasks.size()).toString());
            Logger.printMethodTrace(getClass().getName());
        }
        if (mTasks.size() > 0)
        {
            mTasks.remove(0);
        }
    }

    public void setTaskFactory(ITaskFactory itaskfactory)
    {
        mTaskFactory = itaskfactory;
    }
}
