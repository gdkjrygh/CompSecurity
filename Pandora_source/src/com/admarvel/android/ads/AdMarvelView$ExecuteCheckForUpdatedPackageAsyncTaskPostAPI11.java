// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.app.Activity;
import android.os.AsyncTask;
import com.admarvel.android.offline.CheckForUpdatedPackage;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelView

private static class partnerId
    implements Runnable
{

    private WeakReference activityReference;
    private String partnerId;

    public void run()
    {
        if (AdMarvelView.access$0() != null)
        {
            AdMarvelView.access$0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        } else
        if (activityReference.get() != null && partnerId != null)
        {
            AdMarvelView.access$1(new CheckForUpdatedPackage(partnerId, (Activity)activityReference.get()));
            AdMarvelView.access$0().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            return;
        }
    }

    public (Activity activity, String s)
    {
        activityReference = new WeakReference(activity);
        partnerId = s;
    }
}
