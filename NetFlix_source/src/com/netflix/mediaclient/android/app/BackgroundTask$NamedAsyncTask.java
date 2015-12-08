// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.app;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.osp.AsyncTaskCompat;

// Referenced classes of package com.netflix.mediaclient.android.app:
//            BackgroundTask

private static class <init> extends AsyncTaskCompat
{

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Runnable[])aobj);
    }

    protected transient Void doInBackground(Runnable arunnable[])
    {
        int j = arunnable.length;
        int i = 0;
_L2:
        Runnable runnable;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        runnable = arunnable[i];
        Thread.currentThread().setName((new StringBuilder()).append("BackgroundTask-").append(runnable.getClass().getSimpleName()).toString());
        runnable.run();
        i++;
        if (true) goto _L2; else goto _L1
        arunnable;
        Log.e("BackgroundTask", "Failed to execute!", arunnable);
_L1:
        return null;
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
