// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import com.admarvel.android.util.Logging;

// Referenced classes of package com.admarvel.android.ads:
//            AdMarvelActivity, AdMarvelAd

private class adMarvelAd
    implements Runnable
{

    private final AdMarvelAd adMarvelAd;
    final AdMarvelActivity this$0;

    public void run()
    {
        try
        {
            (new adMarvelAd(AdMarvelActivity.this, adMarvelAd)).r(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
            return;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
        }
        AdMarvelActivity.access$19(AdMarvelActivity.this).sendEmptyMessage(0);
    }

    public Y(AdMarvelAd admarvelad)
    {
        this$0 = AdMarvelActivity.this;
        super();
        adMarvelAd = admarvelad;
    }
}
