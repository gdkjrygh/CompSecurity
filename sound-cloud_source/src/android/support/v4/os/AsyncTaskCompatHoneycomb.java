// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.os;

import android.os.AsyncTask;

class AsyncTaskCompatHoneycomb
{

    AsyncTaskCompatHoneycomb()
    {
    }

    static transient void executeParallel(AsyncTask asynctask, Object aobj[])
    {
        asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
    }
}
