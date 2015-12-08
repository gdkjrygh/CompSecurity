// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import java.security.SecureRandom;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.adobe.mobile:
//            Message, StaticMethods, MessageNotificationHandler, Messages

final class MessageLocalNotification extends Message
{

    private static final String JSON_CONFIG_CONTENT = "content";
    private static final String JSON_CONFIG_WAIT = "wait";
    protected String content;
    protected Integer localNotificationDelay;

    MessageLocalNotification()
    {
    }

    protected boolean initWithPayloadObject(JSONObject jsonobject)
    {
label0:
        {
            while (jsonobject == null || jsonobject.length() <= 0 || !super.initWithPayloadObject(jsonobject)) 
            {
                return false;
            }
            try
            {
                jsonobject = jsonobject.getJSONObject("payload");
                if (jsonobject.length() > 0)
                {
                    break label0;
                }
                StaticMethods.logDebugFormat("Messages - Unable to create local notification message \"%s\", payload is empty", new Object[] {
                    messageId
                });
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                StaticMethods.logDebugFormat("Messages - Unable to create local notification message \"%s\", payload is required", new Object[] {
                    messageId
                });
                return false;
            }
            return false;
        }
label1:
        {
            try
            {
                content = jsonobject.getString("content");
                if (content.length() > 0)
                {
                    break label1;
                }
                StaticMethods.logDebugFormat("Messages - Unable to create local notification message \"%s\", content is empty", new Object[] {
                    messageId
                });
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                StaticMethods.logDebugFormat("Messages - Unable to create local notification message \"%s\", content is required", new Object[] {
                    messageId
                });
                return false;
            }
            return false;
        }
        try
        {
            localNotificationDelay = Integer.valueOf(jsonobject.getInt("wait"));
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            StaticMethods.logDebugFormat("Messages - Unable to create local notification message \"%s\", localNotificationDelay is required", new Object[] {
                messageId
            });
            return false;
        }
        return true;
    }

    protected void show()
    {
        super.show();
        Calendar calendar;
        android.app.Activity activity;
        Intent intent;
        int i;
        try
        {
            activity = StaticMethods.getCurrentActivity();
        }
        catch (StaticMethods.NullActivityException nullactivityexception)
        {
            StaticMethods.logErrorFormat(nullactivityexception.getMessage(), new Object[0]);
            return;
        }
        i = (new SecureRandom()).nextInt();
        calendar = Calendar.getInstance();
        calendar.add(13, localNotificationDelay.intValue());
        intent = new Intent();
        intent.setClass(activity, com/adobe/mobile/MessageNotificationHandler);
        intent.putExtra("alarm_message", content);
        intent.putExtra("adbMessageCode", Messages.MESSAGE_LOCAL_IDENTIFIER);
        intent.putExtra("requestCode", i);
        try
        {
            PendingIntent pendingintent = PendingIntent.getBroadcast(StaticMethods.getSharedContext(), i, intent, 0x8000000);
            ((AlarmManager)StaticMethods.getSharedContext().getSystemService("alarm")).set(0, calendar.getTimeInMillis(), pendingintent);
        }
        catch (StaticMethods.NullContextException nullcontextexception)
        {
            StaticMethods.logErrorFormat("Messaging - Error scheduling local notification (%s)", new Object[] {
                nullcontextexception.getMessage()
            });
        }
        viewed();
    }
}
