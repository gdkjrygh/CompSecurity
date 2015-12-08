// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.installtracker;

import android.os.AsyncTask;

// Referenced classes of package com.admarvel.android.installtracker:
//            AdMarvelInstallTracker, AdMarvelInstallTrackerCleanupAsyncTask

private class <init>
    implements Runnable
{

    final AdMarvelInstallTracker this$0;

    public void run()
    {
        (new AdMarvelInstallTrackerCleanupAsyncTask()).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[] {
            null
        });
    }

    private ()
    {
        this$0 = AdMarvelInstallTracker.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
