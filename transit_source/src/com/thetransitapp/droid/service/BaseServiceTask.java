// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.thetransitapp.droid.service;

import android.app.ProgressDialog;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;
import com.crashlytics.android.Crashlytics;
import com.thetransitapp.droid.data.BaseOnlineSource;
import com.thetransitapp.droid.data.OnlinePlannerSource;
import com.thetransitapp.droid.data.OnlineTransitSource;
import com.thetransitapp.droid.data.TransitSource;
import org.apache.http.HttpException;
import roboguice.util.RoboAsyncTask;

// Referenced classes of package com.thetransitapp.droid.service:
//            RoutingTask

public abstract class BaseServiceTask extends RoboAsyncTask
{

    private ProgressDialog dialog;
    private OnlinePlannerSource plannerSource;
    private TransitSource transitSource;

    public BaseServiceTask(Context context)
    {
        this(context, -1);
    }

    public BaseServiceTask(Context context, int i)
    {
        super(context);
        dialog = null;
        if (i != -1)
        {
            dialog = new ProgressDialog(this.context);
            dialog.setCancelable(false);
            dialog.setMessage(this.context.getString(i));
        }
    }

    public BaseOnlineSource getOnlineSource()
    {
        return (BaseOnlineSource)transitSource;
    }

    public OnlinePlannerSource getPlannerSource()
    {
        return plannerSource;
    }

    public TransitSource getTransitSource()
    {
        return transitSource;
    }

    protected void onException(Exception exception)
    {
        if (!(exception instanceof HttpException)) goto _L2; else goto _L1
_L1:
        if (!(this instanceof RoutingTask)) goto _L4; else goto _L3
_L3:
        Crashlytics.log((new StringBuilder("Last OnlinePlannerSource URL: ")).append(plannerSource.getLastURL()).toString());
_L2:
        Crashlytics.logException(exception);
        Log.e(getClass().getSimpleName(), exception.getMessage(), exception);
        Toast.makeText(context, context.getString(0x7f0a0077), 0).show();
        return;
_L4:
        if (transitSource instanceof OnlineTransitSource)
        {
            OnlineTransitSource onlinetransitsource = (OnlineTransitSource)transitSource;
            Crashlytics.log((new StringBuilder("Last TransitSource URL: ")).append(onlinetransitsource.getLastURL()).toString());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected void onFinally()
    {
        if (dialog != null && dialog.isShowing())
        {
            dialog.dismiss();
        }
    }

    protected void onPreExecute()
    {
        if (dialog != null)
        {
            dialog.show();
        }
    }
}
