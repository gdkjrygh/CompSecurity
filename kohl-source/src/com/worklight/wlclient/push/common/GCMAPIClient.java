// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.AsyncTask;
import android.os.Bundle;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMClient, GCMRegistrationListener, GCMRetryWorker

public class GCMAPIClient
    implements GCMClient
{

    private static Logger logger = Logger.getInstance("GCMAPIClient");
    private GoogleCloudMessaging gcm;
    private BroadcastReceiver onRegisterRetryReceiver;

    public GCMAPIClient()
    {
    }

    private void registerInBackground(final String gcmSenderId, final GCMRegistrationListener listener)
    {
        (new AsyncTask() {

            final GCMAPIClient this$0;
            final String val$gcmSenderId;
            final GCMRegistrationListener val$listener;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                avoid = gcm.register(new String[] {
                    gcmSenderId
                });
                listener.getGcmRetryWorker().resetBackOff();
                GCMAPIClient.logger.debug((new StringBuilder()).append("Successfully registered with GCM using Google Play Services. Returned deviceToken:").append(avoid).toString());
                listener.sendToken(avoid);
                gcm.close();
_L2:
                return null;
                avoid;
                String s = (new StringBuilder()).append("Error :").append(avoid.getMessage()).toString();
                GCMAPIClient.logger.error((new StringBuilder()).append("Failed to register with GCM using Google Play Services. Error:").append(s).toString());
                if (listener.getGcmRetryWorker().isErrorRetriable(avoid.getMessage()))
                {
                    break; /* Loop/switch isn't completed */
                }
                listener.sendErrorMsg(s, false);
_L3:
                gcm.close();
                if (true) goto _L2; else goto _L1
_L1:
                listener.getGcmRetryWorker().scheduleRetry();
                  goto _L3
                avoid;
                gcm.close();
                throw avoid;
            }

            
            {
                this$0 = GCMAPIClient.this;
                gcmSenderId = s;
                listener = gcmregistrationlistener;
                super();
            }
        }).execute(new Void[] {
            null, null, null
        });
    }

    public String getErrorCode(String s)
    {
        String s1 = s;
        if (s.equals("SERVICE_NOT_AVAILABLE"))
        {
            s1 = "SERVICE_NOT_AVAILABLE";
        }
        return s1;
    }

    public void register(Context context, final String gcmSenderId, final GCMRegistrationListener listener)
    {
        if (gcm == null)
        {
            gcm = GoogleCloudMessaging.getInstance(context.getApplicationContext());
        }
        try
        {
            context.unregisterReceiver(onRegisterRetryReceiver);
        }
        catch (Exception exception) { }
        if (onRegisterRetryReceiver == null)
        {
            onRegisterRetryReceiver = new BroadcastReceiver() {

                final GCMAPIClient this$0;
                final String val$gcmSenderId;
                final GCMRegistrationListener val$listener;

                public void onReceive(Context context1, Intent intent)
                {
                    GCMAPIClient.logger.debug("Received an Retry event from GCM");
                    if (!listener.getGcmRetryWorker().validateIntent(intent))
                    {
                        return;
                    } else
                    {
                        registerInBackground(gcmSenderId, listener);
                        return;
                    }
                }

            
            {
                this$0 = GCMAPIClient.this;
                listener = gcmregistrationlistener;
                gcmSenderId = s;
                super();
            }
            };
        }
        context.registerReceiver(onRegisterRetryReceiver, new IntentFilter((new StringBuilder()).append(WLUtils.getFullAppName(context)).append("retryconnection").toString()));
        registerInBackground(gcmSenderId, listener);
    }

    public void reset()
    {
    }

    public void sendUpstreamMessage(final String androidKey, final String alias, final String tag, final Context context)
    {
        (new AsyncTask() {

            final GCMAPIClient this$0;
            final String val$alias;
            final String val$androidKey;
            final Context val$context;
            final String val$tag;

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((Void[])aobj);
            }

            protected transient Void doInBackground(Void avoid[])
            {
                if (gcm == null)
                {
                    gcm = GoogleCloudMessaging.getInstance(context.getApplicationContext());
                }
                avoid = Integer.toString((new AtomicInteger()).incrementAndGet());
                Bundle bundle = new Bundle();
                bundle.putString("action", "com.worklight.wlclient.push.DISMISS_NOTIFICATION");
                if (alias != null)
                {
                    bundle.putString("alias", alias);
                }
                if (tag != null)
                {
                    bundle.putString("tag", tag);
                }
                try
                {
                    gcm.send(androidKey, avoid, bundle);
                }
                // Misplaced declaration of an exception variable
                catch (Void avoid[])
                {
                    avoid.printStackTrace();
                }
                return null;
            }

            
            {
                this$0 = GCMAPIClient.this;
                context = context1;
                alias = s;
                tag = s1;
                androidKey = s2;
                super();
            }
        }).execute(new Void[] {
            null, null, null
        });
    }

    public void unregisterReceivers(Context context)
    {
        try
        {
            context.unregisterReceiver(onRegisterRetryReceiver);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.warn((new StringBuilder()).append("unregister:").append(context.getLocalizedMessage()).toString());
        }
    }






/*
    static GoogleCloudMessaging access$202(GCMAPIClient gcmapiclient, GoogleCloudMessaging googlecloudmessaging)
    {
        gcmapiclient.gcm = googlecloudmessaging;
        return googlecloudmessaging;
    }

*/
}
