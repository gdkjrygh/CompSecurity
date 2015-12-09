// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;

public final class gl
{

    public static transient AsyncTask a(AsyncTask asynctask, Object aobj[])
    {
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, aobj);
            return asynctask;
        } else
        {
            asynctask.execute(aobj);
            return asynctask;
        }
    }
}
