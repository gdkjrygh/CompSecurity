// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import java.util.LinkedList;

public class GCMIntentService extends com.worklight.wlclient.push.GCMIntentService
{

    private static Logger logger = Logger.getInstance("GCMIntentService");
    private BroadcastReceiver resultReceiver;

    public GCMIntentService()
    {
        resultReceiver = new BroadcastReceiver() {

            final GCMIntentService this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (getResultCode() == 1 || !WLConfig.getInstance().isHybridActivityInForeground())
                {
                    onUnhandled(context, intent);
                }
            }

            
            {
                this$0 = GCMIntentService.this;
                super();
            }
        };
        setBroadcastReceiver(resultReceiver);
    }

    protected void addToIntentQueue(Intent intent)
    {
        if (!WLConfig.getInstance().isHybridActivityInForeground())
        {
            logger.debug("GCMIntentService: App is not on foreground. Queue the intent for later re-sending when app is back on foreground.");
            intentsQueue.add(intent);
        } else
        if (!WLConfig.getInstance().isInitComplete())
        {
            logger.debug("GCMIntentService: App is on foreground but init is not comeplete. Queue the intent for later re-sending when app is back on foreground.");
            intentsQueue.add(intent);
            return;
        }
    }

    protected String getNotificationTitle(Context context)
    {
        return context.getString(RES_PUSH_NOTIFICATION_TITLE);
    }

    protected void onMessage(Context context, Intent intent)
    {
        WLConfig.createInstance(context);
        super.onMessage(context, intent);
    }

    protected void setResources(Context context)
    {
        if (RES_PUSH_NOTIFICATION_ICON != -1 && RES_PUSH_NOTIFICATION_TITLE != -1)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        RES_PUSH_NOTIFICATION_ICON = WLUtils.getResourceId(context, "drawable", "push");
        RES_PUSH_NOTIFICATION_TITLE = WLUtils.getResourceId(context, "string", "push_notification_title");
        return;
        context;
        logger.error((new StringBuilder()).append("HybridIntentServiceDelegate: Push notification icon or title may not be displayed properly, because resource was not found. Add icon to native/res/drawable, or add <string =\"push_notification_title\">title</string> in native/res/values/strings.xml").append(context.getMessage()).toString(), context);
        return;
    }


}
