// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services.request;

import android.content.Context;
import android.os.AsyncTask;
import java.util.List;

// Referenced classes of package com.accuweather.android.services.request:
//            CompositeGeocoder, AsyncTaskCallback

public class GeocoderAsyncTask extends AsyncTask
{

    private AsyncTaskCallback callback;
    private CompositeGeocoder compositeGeocoder;
    private Exception lastException;

    public GeocoderAsyncTask(Context context)
    {
        lastException = null;
        compositeGeocoder = new CompositeGeocoder(context);
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((String[])aobj);
    }

    protected transient List doInBackground(String as[])
    {
        if (as.length <= 0 || as[0].length() <= 0)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        as = compositeGeocoder.geocode(as[0]);
        return as;
        as;
        lastException = as;
        return null;
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((List)obj);
    }

    protected void onPostExecute(List list)
    {
label0:
        {
            if (callback != null)
            {
                if (lastException == null)
                {
                    break label0;
                }
                callback.onBackgroundProcessingError(lastException);
            }
            return;
        }
        callback.onPostExecute(list);
    }

    public void setCallback(AsyncTaskCallback asynctaskcallback)
    {
        callback = asynctaskcallback;
    }
}
