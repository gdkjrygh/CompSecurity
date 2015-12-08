// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;

import android.content.Context;
import android.os.AsyncTask;
import com.mopub.common.factories.MethodBuilderFactory;
import com.mopub.common.logging.MoPubLog;
import java.lang.ref.WeakReference;

// Referenced classes of package com.mopub.common:
//            GpsHelper

final class j extends AsyncTask
{

    private WeakReference a;
    private WeakReference b;

    public j(Context context, GpsHelper.GpsHelperListener gpshelperlistener)
    {
        a = new WeakReference(context);
        b = new WeakReference(gpshelperlistener);
    }

    private transient Void a()
    {
        Context context = (Context)a.get();
        if (context == null)
        {
            return null;
        }
        Object obj = MethodBuilderFactory.create(null, "getAdvertisingIdInfo").setStatic(Class.forName(GpsHelper.a())).addParam(android/content/Context, context).execute();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        GpsHelper.a(context, obj);
        return null;
        Exception exception;
        exception;
        MoPubLog.d("Unable to obtain Google AdvertisingIdClient.Info via reflection.");
        return null;
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    protected final void onPostExecute(Object obj)
    {
        obj = (GpsHelper.GpsHelperListener)b.get();
        if (obj != null)
        {
            ((GpsHelper.GpsHelperListener) (obj)).onFetchAdInfoCompleted();
        }
    }
}
