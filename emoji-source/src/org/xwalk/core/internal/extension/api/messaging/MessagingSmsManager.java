// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.telephony.SmsMessage;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            Messaging

public class MessagingSmsManager
{
    private abstract class MessagingReceiver extends BroadcastReceiver
    {

        protected Messaging mMessaging;
        final MessagingSmsManager this$0;

        public MessagingReceiver(Messaging messaging)
        {
            this$0 = MessagingSmsManager.this;
            super();
            mMessaging = messaging;
        }
    }


    private static final String DEFAULT_SERVICE_ID = "sim0";
    private static final String EXTRA_MSGID = "asyncCallId";
    private static final String EXTRA_MSGINSTANCEID = "instanceid";
    private static final String EXTRA_MSGTEXT = "message";
    private static final String EXTRA_MSGTO = "to";
    private static final String TAG = "MessagingSmsManager";
    private final WeakReference mActivity;
    private final Messaging mMessagingHandler;
    private BroadcastReceiver mSmsDeliveredReceiver;
    private BroadcastReceiver mSmsReceiveReceiver;
    private BroadcastReceiver mSmsSentReceiver;
    private BroadcastReceiver mSmsServiceReceiver;

    MessagingSmsManager(Activity activity, Messaging messaging)
    {
        mActivity = new WeakReference(activity);
        mMessagingHandler = messaging;
    }

    private boolean checkService(String s)
    {
        for (s = (Activity)mActivity.get(); s == null || 5 != ((TelephonyManager)s.getSystemService("phone")).getSimState();)
        {
            return false;
        }

        return true;
    }

    public String getServiceIds()
    {
        JSONArray jsonarray = new JSONArray();
        jsonarray.put("sim0");
        return jsonarray.toString();
    }

    public void onSmsClear(int i, JSONObject jsonobject)
    {
        Object obj2 = (Activity)mActivity.get();
        if (obj2 == null)
        {
            return;
        }
        Object obj;
        Object obj1;
        try
        {
            obj = jsonobject.getString("asyncCallId");
            obj1 = jsonobject.getString("cmd");
            jsonobject = jsonobject.getJSONObject("data").getString("serviceID");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return;
        }
        ((Activity) (obj2)).getContentResolver().delete(Uri.parse("content://sms"), null, null);
        obj2 = new JSONObject();
        ((JSONObject) (obj2)).put("asyncCallId", obj);
        ((JSONObject) (obj2)).put("cmd", (new StringBuilder()).append(((String) (obj1))).append("_ret").toString());
        obj = new JSONObject();
        ((JSONObject) (obj2)).put("data", obj);
        ((JSONObject) (obj)).put("error", false);
        obj1 = new JSONObject();
        ((JSONObject) (obj)).put("body", obj1);
        ((JSONObject) (obj1)).put("value", jsonobject);
        mMessagingHandler.postMessage(i, ((JSONObject) (obj2)).toString());
        return;
        jsonobject;
_L2:
        jsonobject.printStackTrace();
        return;
        jsonobject;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void onSmsSegmentInfo(int i, JSONObject jsonobject)
    {
        Object obj;
        obj = jsonobject.getString("asyncCallId");
        jsonobject = jsonobject.getJSONObject("data").getString("text");
        if (jsonobject == null)
        {
            try
            {
                Log.e("MessagingSmsManager", "No \"text\" attribute.");
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JSONObject jsonobject)
            {
                jsonobject.printStackTrace();
            }
            return;
        }
        jsonobject = SmsManager.getDefault().divideMessage(jsonobject);
        try
        {
            JSONObject jsonobject1 = new JSONObject();
            jsonobject1.put("cmd", "msg_smsSegmentInfo_ret");
            jsonobject1.put("asyncCallId", obj);
            obj = new JSONObject();
            jsonobject1.put("data", obj);
            ((JSONObject) (obj)).put("error", false);
            JSONObject jsonobject2 = new JSONObject();
            ((JSONObject) (obj)).put("body", jsonobject2);
            jsonobject2.put("segments", jsonobject.size());
            jsonobject2.put("charsPerSegment", ((String)jsonobject.get(0)).length());
            jsonobject2.put("charsAvailableInLastSegment", ((String)jsonobject.get(jsonobject.size() - 1)).length());
            mMessagingHandler.postMessage(i, jsonobject1.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
        }
        return;
    }

    public void onSmsSend(int i, JSONObject jsonobject)
    {
        if (!checkService("sim0"))
        {
            Log.e("MessagingSmsManager", "No Sim Card");
        }
        Object obj = (Activity)mActivity.get();
        if (obj == null)
        {
            return;
        }
        String s;
        Object obj1;
        SmsManager smsmanager;
        String s1;
        Object obj2;
        Intent intent;
        try
        {
            s = jsonobject.getString("asyncCallId");
            obj1 = jsonobject.getJSONObject("data");
            jsonobject = ((JSONObject) (obj1)).getString("phone");
            obj1 = ((JSONObject) (obj1)).getString("message");
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            return;
        }
        smsmanager = SmsManager.getDefault();
        obj2 = new Intent("SMS_SENT");
        ((Intent) (obj2)).putExtra("asyncCallId", s);
        ((Intent) (obj2)).putExtra("message", ((String) (obj1)));
        ((Intent) (obj2)).putExtra("to", jsonobject);
        s1 = Integer.toString(i);
        ((Intent) (obj2)).putExtra("instanceid", s1);
        i = Integer.valueOf(s).intValue();
        obj2 = PendingIntent.getBroadcast(((Context) (obj)), i, ((Intent) (obj2)), 0x40000000);
        intent = new Intent("SMS_DELIVERED");
        intent.putExtra("asyncCallId", s);
        intent.putExtra("message", ((String) (obj1)));
        intent.putExtra("instanceid", s1);
        obj = PendingIntent.getBroadcast(((Context) (obj)), -i, intent, 0x40000000);
        try
        {
            smsmanager.sendTextMessage(jsonobject, null, ((String) (obj1)), ((PendingIntent) (obj2)), ((PendingIntent) (obj)));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            Log.e("MessagingSmsManager", "Failed to send SMS message.", jsonobject);
        }
    }

    public void registerIntentFilters()
    {
        Activity activity = (Activity)mActivity.get();
        if (activity == null)
        {
            return;
        } else
        {
            mSmsReceiveReceiver = new MessagingReceiver(mMessagingHandler) {

                final MessagingSmsManager this$0;

                public void onReceive(Context context, Intent intent)
                {
                    context = intent.getExtras();
                    if (context != null)
                    {
                        context = ((Context) ((Object[])(Object[])context.get("pdus")));
                        int i = 0;
                        while (i < context.length) 
                        {
                            try
                            {
                                intent = new JSONObject();
                                intent.put("cmd", "received");
                                SmsMessage smsmessage = SmsMessage.createFromPdu((byte[])(byte[])context[i]);
                                JSONObject jsonobject = new JSONObject();
                                intent.put("data", jsonobject);
                                JSONObject jsonobject1 = new JSONObject();
                                jsonobject.put("message", jsonobject1);
                                jsonobject1.put("messageID", "");
                                jsonobject1.put("type", "sms");
                                jsonobject1.put("serviceID", "sim0");
                                jsonobject1.put("from", smsmessage.getOriginatingAddress());
                                jsonobject1.put("timestamp", (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()));
                                jsonobject1.put("body", smsmessage.getMessageBody().toString());
                                mMessaging.broadcastMessage(intent.toString());
                            }
                            // Misplaced declaration of an exception variable
                            catch (Context context)
                            {
                                context.printStackTrace();
                                return;
                            }
                            i++;
                        }
                    }
                }

            
            {
                this$0 = MessagingSmsManager.this;
                super(messaging);
            }
            };
            mSmsSentReceiver = new MessagingReceiver(mMessagingHandler) {

                final MessagingSmsManager this$0;

                public void onReceive(Context context, Intent intent)
                {
                    Activity activity1 = (Activity)mActivity.get();
                    if (activity1 == null)
                    {
                        return;
                    }
                    String s;
                    String s1;
                    Object obj;
                    int i;
                    boolean flag;
                    if (getResultCode() != -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    obj = intent.getStringExtra("asyncCallId");
                    s = intent.getStringExtra("message");
                    s1 = intent.getStringExtra("to");
                    i = Integer.valueOf(intent.getStringExtra("instanceid")).intValue();
                    try
                    {
                        intent = new JSONObject();
                        intent.put("type", "sms");
                        intent.put("from", "");
                        intent.put("read", true);
                        intent.put("to", s1);
                        intent.put("body", s);
                        intent.put("messageClass", "class1");
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                        return;
                    }
                    if (flag)
                    {
                        context = "failed";
                    } else
                    {
                        context = "sending";
                    }
                    intent.put("state", context);
                    if (flag)
                    {
                        context = "error";
                    } else
                    {
                        context = "pending";
                    }
                    intent.put("deliveryStatus", context);
                    context = new JSONObject();
                    context.put("asyncCallId", obj);
                    context.put("cmd", "msg_smsSend_ret");
                    obj = new JSONObject();
                    context.put("data", obj);
                    ((JSONObject) (obj)).put("error", flag);
                    ((JSONObject) (obj)).put("body", intent);
                    mMessaging.postMessage(i, context.toString());
                    context = new JSONObject();
                    context.put("cmd", "sent");
                    context.put("data", intent);
                    mMessaging.broadcastMessage(context.toString());
                    context = new ContentValues();
                    context.put("address", s1);
                    context.put("body", s);
                    activity1.getContentResolver().insert(Uri.parse("content://sms/sent"), context);
                    return;
                }

            
            {
                this$0 = MessagingSmsManager.this;
                super(messaging);
            }
            };
            mSmsDeliveredReceiver = new MessagingReceiver(mMessagingHandler) {

                final MessagingSmsManager this$0;

                public void onReceive(Context context, Intent intent)
                {
                    JSONObject jsonobject;
                    int i;
                    boolean flag;
                    if (getResultCode() != -1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    context = intent.getStringExtra("asyncCallId");
                    i = Integer.valueOf(intent.getStringExtra("instanceid")).intValue();
                    intent = new JSONObject();
                    intent.put("asyncCallId", context);
                    if (flag)
                    {
                        context = "deliveryerror";
                    } else
                    {
                        context = "deliverysuccess";
                    }
                    try
                    {
                        intent.put("cmd", context);
                        context = new JSONObject();
                        intent.put("data", context);
                        jsonobject = new JSONObject();
                        context.put("event", jsonobject);
                        jsonobject.put("serviceID", "sim0");
                        jsonobject.put("messageID", "");
                        jsonobject.put("recipients", "");
                        jsonobject.put("deliveryTimestamps", (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()));
                        context.put("error", flag);
                        mMessaging.postMessage(i, intent.toString());
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                    }
                    return;
                }

            
            {
                this$0 = MessagingSmsManager.this;
                super(messaging);
            }
            };
            mSmsServiceReceiver = new MessagingReceiver(mMessagingHandler) {

                final MessagingSmsManager this$0;

                public void onReceive(Context context, Intent intent)
                {
                    intent = new JSONObject();
                    if (checkService("sim0"))
                    {
                        context = "serviceadded";
                    } else
                    {
                        context = "serviceremoved";
                    }
                    try
                    {
                        intent.put("cmd", context);
                        context = new JSONObject();
                        intent.put("data", context);
                        JSONObject jsonobject = new JSONObject();
                        context.put("event", jsonobject);
                        jsonobject.put("serviceID", "sim0");
                        mMessaging.broadcastMessage(intent.toString());
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (Context context)
                    {
                        context.printStackTrace();
                    }
                    return;
                }

            
            {
                this$0 = MessagingSmsManager.this;
                super(messaging);
            }
            };
            activity.registerReceiver(mSmsReceiveReceiver, new IntentFilter("android.provider.Telephony.SMS_RECEIVED"));
            activity.registerReceiver(mSmsSentReceiver, new IntentFilter("SMS_SENT"));
            activity.registerReceiver(mSmsDeliveredReceiver, new IntentFilter("SMS_DELIVERED"));
            activity.registerReceiver(mSmsServiceReceiver, new IntentFilter("android.intent.action.SIM_STATE_CHANGED"));
            return;
        }
    }

    public void unregisterIntentFilters()
    {
        Activity activity = (Activity)mActivity.get();
        if (activity == null)
        {
            return;
        } else
        {
            activity.unregisterReceiver(mSmsReceiveReceiver);
            activity.unregisterReceiver(mSmsSentReceiver);
            activity.unregisterReceiver(mSmsDeliveredReceiver);
            activity.unregisterReceiver(mSmsServiceReceiver);
            return;
        }
    }


}
