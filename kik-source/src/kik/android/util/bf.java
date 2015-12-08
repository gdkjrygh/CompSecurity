// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.util;

import android.os.AsyncTask;

public abstract class bf extends AsyncTask
{

    public bf()
    {
    }

    public final transient AsyncTask a(Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return execute(aobj);
        } else
        {
            return executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
        }
    }
}
