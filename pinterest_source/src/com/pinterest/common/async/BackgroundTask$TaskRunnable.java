// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.common.async;

import android.os.Handler;

// Referenced classes of package com.pinterest.common.async:
//            BackgroundTask

class <init>
    implements Runnable
{

    private BackgroundTask _task;

    public void run()
    {
        if (_task != null)
        {
            _task.run();
            BackgroundTask.access$200().post(new nable(_task, null));
        }
    }

    private nable(BackgroundTask backgroundtask)
    {
        _task = backgroundtask;
    }

    _task(BackgroundTask backgroundtask, _task _ptask)
    {
        this(backgroundtask);
    }
}
