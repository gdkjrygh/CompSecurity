// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.push;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gcm.GCMBaseIntentService;
import com.worklight.androidgap.WLDroidGap;
import com.worklight.common.WLConfig;
import com.worklight.common.WLUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class GCMIntentService extends GCMBaseIntentService
{
    public static class Message
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Message createFromParcel(Parcel parcel)
            {
                return new Message(parcel, null);
            }

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public Message[] newArray(int i)
            {
                return new Message[i];
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

        };
        private String alert;
        private int badge;
        private String payload;
        private String sound;

        public int describeContents()
        {
            return 0;
        }

        public JSONObject getPayload()
        {
            JSONObject jsonobject;
            try
            {
                jsonobject = new JSONObject(payload);
            }
            catch (JSONException jsonexception)
            {
                return new JSONObject();
            }
            return jsonobject;
        }

        public JSONObject getProps()
        {
            JSONObject jsonobject = new JSONObject();
            if (alert != null) goto _L2; else goto _L1
_L1:
            Object obj = JSONObject.NULL;
_L3:
            jsonobject.put("alert", obj);
            jsonobject.put("badge", badge);
            if (sound != null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            obj = JSONObject.NULL;
_L4:
            jsonobject.put("sound", obj);
            return jsonobject;
_L2:
            try
            {
                obj = alert;
            }
            catch (JSONException jsonexception)
            {
                throw new RuntimeException(jsonexception.getMessage(), jsonexception);
            }
              goto _L3
            obj = sound;
              goto _L4
        }

        public String toString()
        {
            return String.format("Message(alert=%s, badge=%d, sound=%s, payload=%s)", new Object[] {
                alert, Integer.valueOf(badge), sound, payload
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(alert);
            parcel.writeInt(badge);
            parcel.writeString(sound);
            parcel.writeString(payload);
        }









        public Message()
        {
            alert = null;
            badge = 1;
            sound = null;
            payload = null;
        }

        private Message(Parcel parcel)
        {
            alert = parcel.readString();
            badge = parcel.readInt();
            sound = parcel.readString();
            payload = parcel.readString();
        }

        Message(Parcel parcel, Message message)
        {
            this(parcel);
        }
    }


    public static final String GCM_ERROR = ".C2DM_ERROR";
    public static final String GCM_EXTRA_ALERT = "alert";
    public static final String GCM_EXTRA_BADGE = "badge";
    public static final String GCM_EXTRA_ERROR_ID = "errorId";
    public static final String GCM_EXTRA_MESSAGE = "message";
    public static final String GCM_EXTRA_PAYLOAD = "payload";
    public static final String GCM_EXTRA_REGISTRATION_ID = "registrationId";
    public static final String GCM_EXTRA_SOUND = "sound";
    public static final String GCM_MESSAGE = ".C2DM_MESSAGE";
    public static final String GCM_NOTIFICATION = ".NOTIFICATION";
    public static final String GCM_REGISTERED = ".C2DM_REGISTERED";
    public static final String GCM_UNREGISTERED = ".C2DM_UNREGISTERED";
    private static int RES_PUSH_NOIIFICATION_TITLE = -1;
    private static int RES_PUSH_NOTIFICATION_ICON = -1;
    private BroadcastReceiver resultReceiver;

    public GCMIntentService()
    {
        String s;
        if (WLDroidGap.getWLConfig() != null)
        {
            s = WLDroidGap.getWLConfig().getGCMSender();
        } else
        {
            s = "";
        }
        super(s);
        resultReceiver = new BroadcastReceiver() {

            final GCMIntentService this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (getResultCode() == 1 || !WLDroidGap.isForeGround())
                {
                    onUnhandled(context, intent);
                }
            }

            
            {
                this$0 = GCMIntentService.this;
                super();
            }
        };
    }

    private void generateNotification(Context context, String s, String s1, String s2, int i, String s3, Intent intent)
    {
        s = new Notification(RES_PUSH_NOTIFICATION_ICON, s, System.currentTimeMillis());
        s.setLatestEventInfo(context, s1, s2, PendingIntent.getActivity(context, 0, intent, 0x8000000));
        s.number = i;
        s.flags = ((Notification) (s)).flags | 0x10;
        ((NotificationManager)context.getSystemService("notification")).notify(1, s);
        if (s3 != null && !"".equals(s3.trim()))
        {
            playNotificationSound(context);
        }
    }

    private void setResources()
    {
        if (RES_PUSH_NOTIFICATION_ICON != -1 && RES_PUSH_NOIIFICATION_TITLE != -1)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        RES_PUSH_NOTIFICATION_ICON = WLUtils.getResourceId(getApplicationContext(), "drawable", "push");
        RES_PUSH_NOIIFICATION_TITLE = WLUtils.getResourceId(getApplicationContext(), "string", "push_notification_title");
        return;
        Exception exception;
        exception;
        WLUtils.error((new StringBuilder("cannot find resource")).append(exception.getMessage()).toString(), exception);
        return;
    }

    public void notify(Context context, String s)
    {
        generateNotification(context, s, context.getString(RES_PUSH_NOIIFICATION_TITLE), s, 0, "1", null);
    }

    public void notify(Context context, String s, int i, String s1, Intent intent)
    {
        generateNotification(context, s, context.getString(RES_PUSH_NOIIFICATION_TITLE), s, i, s1, intent);
    }

    public void onError(Context context, String s)
    {
        WLUtils.warning((new StringBuilder("Received error ")).append(s).toString());
        Intent intent = new Intent((new StringBuilder(String.valueOf(WLUtils.getFullAppName(context)))).append(".C2DM_ERROR").toString());
        intent.putExtra("errorId", s);
        context.sendBroadcast(intent);
    }

    protected void onMessage(Context context, Intent intent)
    {
        WLUtils.debug("Received a message from the GCM server");
        Message message = new Message();
        intent = intent.getExtras();
        message.alert = intent.getString("alert");
        try
        {
            message.badge = Integer.parseInt(intent.getString("badge"), 10);
        }
        catch (Exception exception)
        {
            WLUtils.warning((new StringBuilder("Problem to parse ")).append(intent.getString("badge")).append(" badge into Integer.").toString());
        }
        message.sound = intent.getString("sound");
        message.payload = intent.getString("payload");
        intent = new Intent((new StringBuilder(String.valueOf(WLUtils.getFullAppName(context)))).append(".C2DM_MESSAGE").toString());
        intent.putExtra("message", message);
        context.sendOrderedBroadcast(intent, null, resultReceiver, null, 1, null, null);
    }

    protected boolean onRecoverableError(Context context, String s)
    {
        WLUtils.warning((new StringBuilder("Received recoverable error ")).append(s).toString());
        return super.onRecoverableError(context, s);
    }

    public void onRegistered(Context context, String s)
    {
        setResources();
        WLUtils.debug((new StringBuilder("Registered at the GCM server with registration id ")).append(s).toString());
        Intent intent = new Intent((new StringBuilder(String.valueOf(WLUtils.getFullAppName(context)))).append(".C2DM_REGISTERED").toString());
        intent.putExtra("registrationId", s);
        context.sendBroadcast(intent);
    }

    protected void onUnhandled(Context context, Intent intent)
    {
        setResources();
        String s = intent.getAction();
        if ((new StringBuilder(String.valueOf(WLUtils.getFullAppName(context)))).append(".C2DM_MESSAGE").toString().equals(s))
        {
            intent = (Message)intent.getParcelableExtra("message");
            WLUtils.debug((new StringBuilder("Showing notification for unhandled ")).append(intent.toString()).toString());
            Intent intent1 = new Intent((new StringBuilder(String.valueOf(WLUtils.getFullAppName(context)))).append(".NOTIFICATION").toString());
            intent1.putExtra("message", intent);
            notify(context, ((Message) (intent)).alert, ((Message) (intent)).badge, ((Message) (intent)).sound, intent1);
        }
    }

    protected void onUnregistered(Context context, String s)
    {
        WLUtils.debug("Unregistered at the GCM server");
        context.sendBroadcast(new Intent((new StringBuilder(String.valueOf(WLUtils.getFullAppName(context)))).append(".C2DM_UNREGISTERED").toString()));
    }

    public void playNotificationSound(Context context)
    {
        android.net.Uri uri = RingtoneManager.getDefaultUri(2);
        if (uri != null)
        {
            context = RingtoneManager.getRingtone(context, uri);
            if (context != null)
            {
                context.setStreamType(5);
                context.play();
            }
        }
    }

}
