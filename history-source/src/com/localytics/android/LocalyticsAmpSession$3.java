// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.localytics.android;

import android.database.Cursor;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.widget.Toast;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

// Referenced classes of package com.localytics.android:
//            LocalyticsAmpSession, LocalyticsProvider, SessionHandler, DatapointHelper

class val.creative extends AsyncTask
{

    final String pushRegID = getPushRegistrationID();
    final LocalyticsAmpSession this$0;
    final String val$apiKey;
    final String val$campaign;
    final String val$creative;
    final LocalyticsProvider val$provider;

    private String getPushRegistrationID()
    {
        return (String)val$provider.runBatchTransaction(new Callable() {

            final LocalyticsAmpSession._cls3 this$1;

            public Object call()
                throws Exception
            {
                Cursor cursor;
                String s;
                cursor = null;
                s = null;
                Cursor cursor1 = provider.query("info", null, null, null, null);
                cursor = cursor1;
                if (!cursor1.moveToFirst())
                {
                    break MISSING_BLOCK_LABEL_49;
                }
                cursor = cursor1;
                s = cursor1.getString(cursor1.getColumnIndexOrThrow("registration_id"));
                if (cursor1 != null)
                {
                    cursor1.close();
                }
                return s;
                Exception exception;
                exception;
                if (cursor != null)
                {
                    cursor.close();
                }
                throw exception;
            }

            
            {
                this$1 = LocalyticsAmpSession._cls3.this;
                super();
            }
        });
    }

    protected volatile Object doInBackground(Object aobj[])
    {
        return doInBackground((Void[])aobj);
    }

    protected transient Void doInBackground(Void avoid[])
    {
        val$provider.runBatchTransaction(new Runnable() {

            final LocalyticsAmpSession._cls3 this$1;

            public void run()
            {
                String s;
                String s1;
                Object obj;
                if (TextUtils.isEmpty(pushRegID))
                {
                    break MISSING_BLOCK_LABEL_204;
                }
                s = SessionHandler.getInstallationId(provider, apiKey);
                s1 = (String)provider.getUserIdAndType().get("id");
                obj = String.format("http://pushapi.localytics.com/push_test?platform=android&type=prod&campaign=%s&creative=%s&token=%s&install_id=%s", new Object[] {
                    campaign, creative, pushRegID, s
                });
                Object obj1 = new BasicHttpParams();
                HttpConnectionParams.setConnectionTimeout(((org.apache.http.params.HttpParams) (obj1)), 5000);
                HttpConnectionParams.setSoTimeout(((org.apache.http.params.HttpParams) (obj1)), 5000);
                obj1 = new DefaultHttpClient(((org.apache.http.params.HttpParams) (obj1)));
                obj = new HttpGet(((String) (obj)));
                ((HttpGet) (obj)).addHeader("x-install-id", s);
                ((HttpGet) (obj)).addHeader("x-app-id", apiKey);
                ((HttpGet) (obj)).addHeader("x-client-version", "androida_2.72");
                ((HttpGet) (obj)).addHeader("x-app-version", DatapointHelper.getAppVersion(mContext));
                ((HttpGet) (obj)).addHeader("x-customer-id", s1);
                ((HttpClient) (obj1)).execute(((org.apache.http.client.methods.HttpUriRequest) (obj)));
                return;
                IOException ioexception;
                ioexception;
                ioexception.printStackTrace();
                return;
            }

            
            {
                this$1 = LocalyticsAmpSession._cls3.this;
                super();
            }
        });
        return null;
    }

    protected void onPreExecute()
    {
        String s;
        if (!TextUtils.isEmpty(pushRegID))
        {
            s = "Push Test Activated\nYou should receive a notification soon.";
        } else
        {
            s = "App isn't registered with GCM to receive push notifications. Please make sure that this.localyticsSession.registerPush(<PROJECT_ID>) has been called.";
        }
        Toast.makeText(mContext, s, 1).show();
    }

    _cls2.this._cls1()
    {
        this$0 = final_localyticsampsession;
        val$provider = localyticsprovider;
        val$apiKey = s;
        val$campaign = s1;
        val$creative = String.this;
        super();
    }
}
