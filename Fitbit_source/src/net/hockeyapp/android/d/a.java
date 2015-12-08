// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.d;

import android.os.AsyncTask;

public class a
{

    public a()
    {
    }

    public static void a(AsyncTask asynctask)
    {
        if (android.os.Build.VERSION.SDK_INT <= 12)
        {
            asynctask.execute(new Void[0]);
            return;
        } else
        {
            asynctask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
    }
}
