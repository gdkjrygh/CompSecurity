// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tasks;

import android.os.AsyncTask;

public abstract class ParallelAsyncTask extends AsyncTask
{

    private static final boolean IS_UNIT_TEST_HACK;

    public ParallelAsyncTask()
    {
    }

    public final transient AsyncTask executeOnThreadPool(Object aobj[])
    {
        if (IS_UNIT_TEST_HACK)
        {
            return execute(aobj);
        } else
        {
            return executeOnExecutor(THREAD_POOL_EXECUTOR, aobj);
        }
    }

    static 
    {
        boolean flag;
        if (!"Dalvik".equals(System.getProperty("java.vm.name")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        IS_UNIT_TEST_HACK = flag;
    }
}
