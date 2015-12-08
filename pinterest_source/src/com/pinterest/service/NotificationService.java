// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.service;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.pinterest.api.ApiResponseHandler;
import com.pinterest.base.Application;
import com.pinterest.kit.log.PLog;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.pushnotification.PushNotification;

// Referenced classes of package com.pinterest.service:
//            NotifData

public class NotificationService extends Service
{

    private static final int DELAY = 5000;
    private boolean _running;
    Handler handler;
    ApiResponseHandler onNotifLoad;

    public NotificationService()
    {
        handler = new Handler();
        onNotifLoad = new _cls2();
    }

    private void doShowNotif(PinterestJsonObject pinterestjsonobject)
    {
        PushNotification.a(this, new NotifData(pinterestjsonobject), null);
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
    }

    public void onDestroy()
    {
        _running = false;
        super.onDestroy();
        Application.watch(this);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        _running = true;
        PLog.info("NotificationService started", new Object[0]);
        handler.postDelayed(new _cls1(), 5000L);
        return 2;
    }


    private class _cls2 extends ApiResponseHandler
    {

        final NotificationService this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.info("onNotifLoad.onFailure", new Object[0]);
            stopSelf();
        }

        public void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            boolean flag;
            try
            {
                apiresponse = ((PinterestJsonArray)apiresponse.getData()).c(0);
            }
            // Misplaced declaration of an exception variable
            catch (ApiResponse apiresponse)
            {
                apiresponse = null;
            }
            if (apiresponse != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            PLog.info((new StringBuilder("onNotifLoad.onSuccess: ")).append(flag).toString(), new Object[0]);
            if (!flag)
            {
                stopSelf();
                return;
            } else
            {
                (new ShowNotifTask(null)).execute(new PinterestJsonObject[] {
                    apiresponse
                });
                Pinalytics.a(EventType.PULL_NOTIFICATION_RECEIVED_BY, ApplicationInfo.getInstallId());
                return;
            }
        }

        _cls2()
        {
            this$0 = NotificationService.this;
            super();
        }

        private class ShowNotifTask extends AsyncTask
        {

            final NotificationService this$0;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((PinterestJsonObject[])aobj);
            }

            protected transient Void doInBackground(PinterestJsonObject apinterestjsonobject[])
            {
                doShowNotif(apinterestjsonobject[0]);
                return null;
            }

            protected volatile void onPostExecute(Object obj)
            {
                onPostExecute((Void)obj);
            }

            protected void onPostExecute(Void void1)
            {
                super.onPostExecute(void1);
                stopSelf();
            }

            private ShowNotifTask()
            {
                this$0 = NotificationService.this;
                super();
            }

            ShowNotifTask(_cls1 _pcls1)
            {
                this();
            }
        }

    }


    private class _cls1
        implements Runnable
    {

        final NotificationService this$0;

        public void run()
        {
            MccMnc mccmnc = NetworkUtils.getInstance().getCarrierMccMnc();
            WidgetApi.b(mccmnc.a, mccmnc.b, onNotifLoad);
        }

        _cls1()
        {
            this$0 = NotificationService.this;
            super();
        }
    }

}
