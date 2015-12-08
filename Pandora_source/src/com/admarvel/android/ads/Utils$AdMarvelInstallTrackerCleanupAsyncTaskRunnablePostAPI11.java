// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.AsyncTask;

// Referenced classes of package com.admarvel.android.ads:
//            Utils, AdMarvelInstallTrackerCleanupAsyncTask

private static class <init>
    implements Runnable
{

    public void run()
    {
        (new AdMarvelInstallTrackerCleanupAsyncTask()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
            null
        });
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
