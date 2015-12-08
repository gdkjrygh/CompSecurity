// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import android.os.AsyncTask;
import com.accuweather.android.utilities.Data;
import java.util.List;

public abstract class BaseUpdateTask extends AsyncTask
{

    private static final String TAG = "BaseUpdateTask";
    protected Data data;
    protected boolean isNotification;
    protected boolean isWearable;
    protected boolean isWidget;

    public BaseUpdateTask(Data data1)
    {
        data = data1;
    }

    public transient void executeSync(List alist[])
    {
        onPostExecute(doInBackground(alist));
    }

    protected final void notifyError(Exception exception)
    {
        if (isWearable)
        {
            data.notifyErrorForWearables(exception);
            return;
        }
        if (isWidget)
        {
            data.notifyWidgetWeatherCallError(exception);
            return;
        }
        if (isNotification)
        {
            data.notifyNotificationWeatherCallError(exception);
            return;
        } else
        {
            data.notifyMainAppWeatherCallError(exception);
            return;
        }
    }
}
