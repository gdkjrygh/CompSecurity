// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;

// Referenced classes of package com.worklight.wlclient.push.common:
//            GCMClient, GCMHelperUtil, GCMRegistrationListener, GCMRetryWorker

public class GCMHelperClient
    implements GCMClient
{

    private Logger logger;
    private BroadcastReceiver onRegisterErrorReceiver;
    private BroadcastReceiver onRegisterReceiver;
    private BroadcastReceiver onRegisterRetryReceiver;

    public GCMHelperClient()
    {
        logger = Logger.getInstance("GCMHelperClient");
    }

    public String getErrorCode(String s)
    {
        String s1 = s;
        if ("SERVICE_NOT_AVAILABLE".equals(s))
        {
            s1 = "SERVICE_NOT_AVAILABLE";
        }
        return s1;
    }

    public void register(final Context context, final String gcmSenderId, final GCMRegistrationListener listener)
    {
        try
        {
            context.unregisterReceiver(onRegisterReceiver);
        }
        catch (Exception exception2) { }
        try
        {
            context.unregisterReceiver(onRegisterErrorReceiver);
        }
        catch (Exception exception1) { }
        try
        {
            context.unregisterReceiver(onRegisterRetryReceiver);
        }
        catch (Exception exception) { }
        if (onRegisterReceiver == null)
        {
            onRegisterReceiver = new BroadcastReceiver() {

                final GCMHelperClient this$0;
                final GCMRegistrationListener val$listener;

                public void onReceive(Context context1, Intent intent)
                {
                    intent = intent.getStringExtra("registrationId");
                    logger.debug((new StringBuilder()).append("Successfully registered.Returned deviceToken: ").append(intent).toString());
                    listener.sendToken(intent);
                    listener.getGcmRetryWorker().resetBackOff();
                    context1.unregisterReceiver(onRegisterReceiver);
                    context1.unregisterReceiver(onRegisterErrorReceiver);
                    context1.unregisterReceiver(onRegisterRetryReceiver);
                }

            
            {
                this$0 = GCMHelperClient.this;
                listener = gcmregistrationlistener;
                super();
            }
            };
        }
        context.registerReceiver(onRegisterReceiver, new IntentFilter((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_REGISTERED").toString()));
        if (onRegisterErrorReceiver == null)
        {
            onRegisterErrorReceiver = new BroadcastReceiver() {

                final GCMHelperClient this$0;
                final GCMRegistrationListener val$listener;

                public void onReceive(Context context1, Intent intent)
                {
                    logger.debug("Received an Error event from GCM");
                    intent = intent.getStringExtra("errorId");
                    if (!listener.getGcmRetryWorker().isErrorRetriable(intent))
                    {
                        listener.sendErrorMsg(intent, true);
                        context1.unregisterReceiver(onRegisterReceiver);
                        context1.unregisterReceiver(onRegisterErrorReceiver);
                        context1.unregisterReceiver(onRegisterRetryReceiver);
                        return;
                    } else
                    {
                        listener.getGcmRetryWorker().scheduleRetry();
                        context1.unregisterReceiver(onRegisterReceiver);
                        context1.unregisterReceiver(onRegisterErrorReceiver);
                        return;
                    }
                }

            
            {
                this$0 = GCMHelperClient.this;
                listener = gcmregistrationlistener;
                super();
            }
            };
        }
        context.registerReceiver(onRegisterErrorReceiver, new IntentFilter((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_ERROR").toString()));
        if (onRegisterRetryReceiver == null)
        {
            onRegisterRetryReceiver = new BroadcastReceiver() {

                final GCMHelperClient this$0;
                final Context val$context;
                final String val$gcmSenderId;
                final GCMRegistrationListener val$listener;

                public void onReceive(Context context1, Intent intent)
                {
                    logger.debug("Received a retry event from GCM");
                    if (!listener.getGcmRetryWorker().validateIntent(intent))
                    {
                        return;
                    } else
                    {
                        register(context, gcmSenderId, listener);
                        return;
                    }
                }

            
            {
                this$0 = GCMHelperClient.this;
                listener = gcmregistrationlistener;
                context = context1;
                gcmSenderId = s;
                super();
            }
            };
        }
        context.registerReceiver(onRegisterRetryReceiver, new IntentFilter((new StringBuilder()).append(WLUtils.getFullAppName(context)).append("retryconnection").toString()));
        GCMHelperUtil.register(context.getApplicationContext(), gcmSenderId);
    }

    public void reset()
    {
    }

    public void sendUpstreamMessage(String s, String s1, String s2, Context context)
    {
        logger.warn("Since this app does not use Google Play Services, upstream messaging is not supported");
    }

    public void unregisterReceivers(Context context)
    {
        try
        {
            context.unregisterReceiver(onRegisterReceiver);
        }
        catch (Exception exception)
        {
            logger.warn((new StringBuilder()).append("unregister:").append(exception.getLocalizedMessage()).toString());
        }
        try
        {
            context.unregisterReceiver(onRegisterErrorReceiver);
        }
        catch (Exception exception1)
        {
            logger.warn((new StringBuilder()).append("unregister:").append(exception1.getLocalizedMessage()).toString());
        }
        try
        {
            context.unregisterReceiver(onRegisterRetryReceiver);
        }
        catch (Exception exception2)
        {
            logger.warn((new StringBuilder()).append("unregister:").append(exception2.getLocalizedMessage()).toString());
        }
        if (GCMHelperUtil.isRegistered(context.getApplicationContext()))
        {
            logger.debug("unregisterReceivers: Use application context for onDestroy()");
            GCMHelperUtil.unregister(context.getApplicationContext());
        }
    }




}
