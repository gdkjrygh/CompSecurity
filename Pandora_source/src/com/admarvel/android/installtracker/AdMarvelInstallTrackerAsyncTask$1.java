// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.installtracker;

import android.content.Context;
import android.webkit.WebView;
import com.admarvel.android.util.Logging;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.installtracker:
//            AdMarvelInstallTrackerAsyncTask

class this._cls0 extends Thread
{

    final AdMarvelInstallTrackerAsyncTask this$0;

    public void run()
    {
        if (AdMarvelInstallTrackerAsyncTask.access$0(AdMarvelInstallTrackerAsyncTask.this) != null)
        {
            Object obj = (Context)AdMarvelInstallTrackerAsyncTask.access$0(AdMarvelInstallTrackerAsyncTask.this).get();
            if (obj != null)
            {
                obj = new WebView(((Context) (obj)).getApplicationContext());
                Logging.log((new StringBuilder("Firing Install Tracking Pixels: ")).append(AdMarvelInstallTrackerAsyncTask.access$1(AdMarvelInstallTrackerAsyncTask.this).toString()).toString());
                ((WebView) (obj)).loadDataWithBaseURL(null, AdMarvelInstallTrackerAsyncTask.access$1(AdMarvelInstallTrackerAsyncTask.this).toString(), "text/html", "utf-8", null);
            }
        }
    }

    ()
    {
        this$0 = AdMarvelInstallTrackerAsyncTask.this;
        super();
    }
}
