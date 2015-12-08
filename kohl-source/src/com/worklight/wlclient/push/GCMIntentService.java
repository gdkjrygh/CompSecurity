// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.push;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import com.worklight.common.Logger;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.push.common.GCMClientFactory;
import com.worklight.wlclient.push.common.GCMHelperUtil;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.push:
//            WakefulIntentService

public class GCMIntentService extends WakefulIntentService
{
    public static class Message
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Message createFromParcel(Parcel parcel)
            {
                return new Message(parcel);
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
        private boolean bridge;
        private String category;
        private String key;
        private String payload;
        private int priority;
        private String redact;
        private String sound;
        private int visibility;

        public int describeContents()
        {
            return 0;
        }

        public JSONObject getPayload()
        {
            if (payload == null)
            {
                break MISSING_BLOCK_LABEL_22;
            }
            JSONObject jsonobject = new JSONObject(payload);
            return jsonobject;
            JSONException jsonexception;
            jsonexception;
            return new JSONObject();
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
                break MISSING_BLOCK_LABEL_89;
            }
            obj = JSONObject.NULL;
_L4:
            jsonobject.put("sound", obj);
            jsonobject.put("priority", priority);
            jsonobject.put("key", key);
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
            return String.format("Message(alert=%s, badge=%d, sound=%s, priority=%d, visibility=%d, redact=%s, payload=%s, category=%s, bridge=%s, key=%s)", new Object[] {
                alert, Integer.valueOf(badge), sound, Integer.valueOf(priority), Integer.valueOf(visibility), redact, payload, category, Boolean.valueOf(bridge), key
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeString(alert);
            parcel.writeInt(badge);
            parcel.writeString(sound);
            parcel.writeString(payload);
            parcel.writeInt(priority);
            parcel.writeInt(visibility);
            parcel.writeString(redact);
            parcel.writeString(category);
            parcel.writeString(String.valueOf(bridge));
            parcel.writeString(key);
        }




/*
        static String access$002(Message message, String s)
        {
            message.payload = s;
            return s;
        }

*/



/*
        static String access$102(Message message, String s)
        {
            message.alert = s;
            return s;
        }

*/



/*
        static int access$202(Message message, int i)
        {
            message.badge = i;
            return i;
        }

*/



/*
        static String access$302(Message message, String s)
        {
            message.sound = s;
            return s;
        }

*/



/*
        static int access$402(Message message, int i)
        {
            message.priority = i;
            return i;
        }

*/



/*
        static int access$502(Message message, int i)
        {
            message.visibility = i;
            return i;
        }

*/



/*
        static String access$602(Message message, String s)
        {
            message.redact = s;
            return s;
        }

*/



/*
        static String access$702(Message message, String s)
        {
            message.category = s;
            return s;
        }

*/



/*
        static boolean access$802(Message message, boolean flag)
        {
            message.bridge = flag;
            return flag;
        }

*/


/*
        static String access$902(Message message, String s)
        {
            message.key = s;
            return s;
        }

*/

        public Message()
        {
            alert = null;
            badge = 1;
            sound = null;
            payload = null;
            priority = 0;
            visibility = 1;
            redact = null;
            category = null;
            bridge = true;
            key = null;
        }

        private Message(Parcel parcel)
        {
            alert = parcel.readString();
            badge = parcel.readInt();
            sound = parcel.readString();
            payload = parcel.readString();
            priority = parcel.readInt();
            visibility = parcel.readInt();
            redact = parcel.readString();
            category = parcel.readString();
            bridge = Boolean.valueOf(parcel.readString()).booleanValue();
            key = parcel.readString();
        }

    }


    public static final String DISMISS_NOTIFICATION = "com.worklight.wlclient.push.DISMISS_NOTIFICATION";
    public static final String GCM_ERROR = ".C2DM_ERROR";
    public static final String GCM_EXTRA_ALERT = "alert";
    public static final String GCM_EXTRA_BADGE = "badge";
    public static final String GCM_EXTRA_BRIDGE = "bridge";
    public static final String GCM_EXTRA_CATEGORY = "category";
    public static final String GCM_EXTRA_ERROR_ID = "errorId";
    public static final String GCM_EXTRA_KEY = "key";
    public static final String GCM_EXTRA_MESSAGE = "message";
    public static final String GCM_EXTRA_PAYLOAD = "payload";
    public static final String GCM_EXTRA_PRIORITY = "priority";
    public static final String GCM_EXTRA_REDACT = "redact";
    public static final String GCM_EXTRA_REGISTRATION_ID = "registrationId";
    public static final String GCM_EXTRA_SOUND = "sound";
    public static final String GCM_EXTRA_VISIBILITY = "visibility";
    public static final String GCM_MESSAGE = ".C2DM_MESSAGE";
    public static final String GCM_NOTIFICATION = ".NOTIFICATION";
    public static final String GCM_REGISTERED = ".C2DM_REGISTERED";
    public static final String GCM_UNREGISTERED = ".C2DM_UNREGISTERED";
    protected static int RES_PUSH_NOTIFICATION_ICON = -1;
    protected static int RES_PUSH_NOTIFICATION_TITLE = -1;
    public static LinkedList intentsQueue = new LinkedList();
    private static boolean isAppForeground = false;
    private static Logger logger = Logger.getInstance("GCMIntentService");
    private BroadcastReceiver resultReceiver;

    public GCMIntentService()
    {
        super("GCMIntentService");
        resultReceiver = new BroadcastReceiver() {

            final GCMIntentService this$0;

            public void onReceive(Context context, Intent intent)
            {
                if (getResultCode() == 1 || !GCMIntentService.isAppForeground())
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

    private void dispatchNotification(Context context, Notification notification, String s)
    {
        s = getNotificationSoundUri(context, s);
        if (s != null)
        {
            notification.sound = s;
        }
        ((NotificationManager)context.getSystemService("notification")).notify(1, notification);
    }

    private Notification generateNotification(Context context, String s, String s1, String s2, int i, boolean flag, int j, 
            Intent intent)
    {
        int k = android.os.Build.VERSION.SDK_INT;
        int l = RES_PUSH_NOTIFICATION_ICON;
        long l1 = System.currentTimeMillis();
        intent = PendingIntent.getActivity(context, 0, intent, 0x8000000);
        if (k > 10)
        {
            context = (new android.app.Notification.Builder(context)).setSmallIcon(l).setTicker(s).setWhen(l1).setContentTitle(s1).setContentText(s2).setContentIntent(intent);
            if (k > 19)
            {
                context.setColor(0xff000000);
                if (!flag)
                {
                    context.setLocalOnly(true);
                }
            }
            if (k > 15)
            {
                context = context.build();
                context.priority = j;
            } else
            {
                context = context.getNotification();
            }
        } else
        {
            s = new Notification(l, s, l1);
            s.setLatestEventInfo(context, s1, s2, intent);
            s.audioStreamType = 5;
            context = s;
        }
        context.number = i;
        context.flags = ((Notification) (context)).flags | 0x10;
        return context;
    }

    private Uri getNotificationSoundUri(Context context, String s)
    {
        Object obj = null;
        if (s != null) goto _L2; else goto _L1
_L1:
        obj = RingtoneManager.getDefaultUri(2);
_L4:
        return ((Uri) (obj));
_L2:
        if (s.trim().isEmpty()) goto _L4; else goto _L3
_L3:
        String s1;
        obj = s;
        s1 = s;
        if (s.contains("."))
        {
            s1 = s;
            int i;
            try
            {
                obj = s.substring(0, s.indexOf("."));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                logger.error((new StringBuilder()).append("Push notification sound will not be used because sound file name \"").append(s1).append("\" was not found. Add \"").append(s1).append("\" to native/res/raw folder.").toString());
                return null;
            }
        }
        s1 = ((String) (obj));
        i = WLUtils.getResourceId(context, "raw", ((String) (obj)));
        if (i != -1)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s1 = ((String) (obj));
        logger.error((new StringBuilder()).append("Push notification sound will not be used because sound file name \"").append(((String) (obj))).append("\" was not found. Add \"").append(((String) (obj))).append("\" to native/res/raw folder.").toString());
        s1 = ((String) (obj));
        context = Uri.parse((new StringBuilder()).append("android.resource://").append(context.getPackageName()).append("/").append(i).toString());
        return context;
    }

    private void handleRegistration(Context context, Intent intent)
    {
        String s = intent.getStringExtra("registration_id");
        String s1 = intent.getStringExtra("error");
        if (intent.getStringExtra("unregistered") != null)
        {
            onUnregistered(context);
            return;
        }
        if (s1 != null)
        {
            onError(context, s1);
            return;
        } else
        {
            GCMHelperUtil.setRegistrationId(context, s);
            onRegistered(context, s);
            return;
        }
    }

    public static boolean isAppForeground()
    {
        return isAppForeground;
    }

    private void onError(Context context, String s)
    {
        logger.warn((new StringBuilder()).append("Push notification will not work, because register/unregister to GCM service returned error ").append(s).append(".").toString());
        Intent intent = new Intent((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_ERROR").toString());
        intent.putExtra("errorId", s);
        context.sendBroadcast(intent);
    }

    private void onRegistered(Context context, String s)
    {
        setResources(context);
        logger.debug((new StringBuilder()).append("GCMIntentService: Registered at the GCM server with registration id ").append(s).toString());
        Intent intent = new Intent((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_REGISTERED").toString());
        intent.putExtra("registrationId", s);
        context.sendBroadcast(intent);
    }

    private void onUnregistered(Context context)
    {
        logger.debug("GCMIntentService: Unregistered at the GCM server");
        context.sendBroadcast(new Intent((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_UNREGISTERED").toString()));
        intentsQueue.clear();
    }

    public static void setAppForeground(boolean flag)
    {
        isAppForeground = flag;
    }

    protected void addToIntentQueue(Intent intent)
    {
        if (!isAppForeground())
        {
            logger.debug("GCMIntentService: App is not on foreground. Queue the intent for later re-sending when app is back on foreground.");
            intentsQueue.add(intent);
        }
    }

    public Intent createMessageIntent(Context context, Intent intent)
    {
        Message message = new Message();
        intent = intent.getExtras();
        message.alert = intent.getString("alert");
        String s;
        try
        {
            message.badge = Integer.parseInt(intent.getString("badge"), 10);
        }
        catch (Exception exception)
        {
            logger.warn((new StringBuilder()).append("Unable to update badge while received push notification, becasue failed to parse badge number ").append(intent.getString("badge")).append(", badge must be an integer number.").toString());
        }
        message.sound = intent.getString("sound");
        message.payload = intent.getString("payload");
        s = intent.getString("priority");
        if (s != null)
        {
            message.priority = Integer.parseInt(s, 10);
        }
        s = intent.getString("visibility");
        if (s != null)
        {
            message.visibility = Integer.parseInt(s, 10);
        }
        message.redact = intent.getString("redact");
        message.category = intent.getString("category");
        s = intent.getString("bridge");
        if (s != null)
        {
            message.bridge = Boolean.valueOf(s).booleanValue();
        }
        message.key = intent.getString("key");
        context = new Intent((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_MESSAGE").toString());
        context.putExtra("message", message);
        return context;
    }

    protected void dismissNotification(String s, String s1)
    {
        ((NotificationManager)getSystemService("notification")).cancel(1);
        if (s == null && s1 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        LinkedList linkedlist = intentsQueue;
        linkedlist;
        JVM INSTR monitorenter ;
        Iterator iterator = intentsQueue.descendingIterator();
_L4:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_186;
        }
        obj = (Message)((Intent)iterator.next()).getParcelableExtra("message");
        obj = new JSONObject(((Message) (obj)).payload);
        if (((JSONObject) (obj)).isNull("alias")) goto _L2; else goto _L1
_L1:
        obj = ((JSONObject) (obj)).getString("alias");
        if (s == null) goto _L4; else goto _L3
_L3:
        if (!((String) (obj)).equals(s)) goto _L4; else goto _L5
_L5:
        iterator.remove();
          goto _L4
        s;
        throw new RuntimeException(s.getMessage(), s);
        s;
        linkedlist;
        JVM INSTR monitorexit ;
        throw s;
_L2:
        if (((JSONObject) (obj)).isNull("tag")) goto _L4; else goto _L6
_L6:
        obj = ((JSONObject) (obj)).getString("tag");
        if (s1 == null) goto _L4; else goto _L7
_L7:
        if (!((String) (obj)).equals(s1)) goto _L4; else goto _L8
_L8:
        iterator.remove();
          goto _L4
        linkedlist;
        JVM INSTR monitorexit ;
        return;
        intentsQueue.clear();
        return;
    }

    protected void doWakefulWork(Intent intent, Map map)
    {
        map = getApplicationContext();
        String s = intent.getAction();
        if (s.equals("com.google.android.c2dm.intent.REGISTRATION") && !GCMClientFactory.useGooglePlayServices(map))
        {
            logger.debug("GCMIntentService : Received a registration message from the GCM server");
            handleRegistration(map, intent);
        } else
        if (s.equals("com.google.android.c2dm.intent.RECEIVE"))
        {
            onMessage(map, intent);
            return;
        }
    }

    protected String getNotificationTitle(Context context)
    {
        int i = -1;
        String s;
        int j;
        try
        {
            j = WLUtils.getResourceId(context, "string", "push_notification_title");
        }
        catch (Exception exception)
        {
            if (i == -1)
            {
                Object obj = null;
                PackageManager packagemanager = context.getPackageManager();
                try
                {
                    context = packagemanager.getApplicationInfo(context.getPackageName(), 0);
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    logger.warn((new StringBuilder()).append("Notification will not have a title because application name is not available. ").append(context.getMessage()).toString());
                    context = obj;
                }
                if (context != null)
                {
                    return (String)packagemanager.getApplicationLabel(context);
                }
            }
            return "";
        }
        i = j;
        s = context.getString(j);
        return s;
    }

    public void notify(Context context, Message message, Intent intent)
    {
        int i = android.os.Build.VERSION.SDK_INT;
        intent = generateNotification(context, message.alert, getNotificationTitle(context), message.alert, message.badge, message.bridge, message.priority, intent);
        if (i > 19)
        {
            intent.visibility = message.visibility;
            if (message.visibility == 0 && message.redact != null)
            {
                intent.publicVersion = (new android.app.Notification.Builder(context)).setSmallIcon(((Notification) (intent)).icon).setTicker(((Notification) (intent)).tickerText).setWhen(((Notification) (intent)).when).setContentTitle(getNotificationTitle(context)).setContentText(message.redact).build();
            }
            if (message.category != null)
            {
                intent.category = message.category.toLowerCase();
            }
        }
        dispatchNotification(context, intent, message.sound);
    }

    public void notify(Context context, String s)
    {
        dispatchNotification(context, generateNotification(context, s, getNotificationTitle(context), s, 0, true, 0, null), "1");
    }

    public void notify(Context context, String s, int i, String s1, Intent intent)
    {
        dispatchNotification(context, generateNotification(context, s, getNotificationTitle(context), s, i, true, 0, intent), s1);
    }

    protected void onMessage(Context context, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        String s = bundle.getString("action");
        if (s != null && s.equals("com.worklight.wlclient.push.DISMISS_NOTIFICATION"))
        {
            logger.debug("GCMIntentService : Received a dismissal message from the GCM server");
            dismissNotification(bundle.getString("alias"), bundle.getString("tag"));
        } else
        if (!GCMClientFactory.useGooglePlayServices(context) || GoogleCloudMessaging.getInstance(this).getMessageType(intent).equals("gcm"))
        {
            logger.debug("GCMIntentService: Received a message from the GCM server");
            intent = createMessageIntent(context, intent);
            addToIntentQueue(intent);
            context.sendOrderedBroadcast(intent, null, resultReceiver, null, 1, null, null);
            return;
        }
    }

    protected void onUnhandled(Context context, Intent intent)
    {
        setResources(context);
        String s = intent.getAction();
        if ((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_MESSAGE").toString().equals(s))
        {
            intent = (Message)intent.getParcelableExtra("message");
            logger.debug((new StringBuilder()).append("GCMIntentService: Showing notification for unhandled ").append(intent.toString()).toString());
            Intent intent1 = new Intent((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".NOTIFICATION").toString());
            intent1.putExtra("message", intent);
            notify(context, intent, intent1);
        }
    }

    protected void setBroadcastReceiver(BroadcastReceiver broadcastreceiver)
    {
        resultReceiver = broadcastreceiver;
    }

    protected void setResources(Context context)
    {
        try
        {
            RES_PUSH_NOTIFICATION_ICON = WLUtils.getResourceId(context, "drawable", "push");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            logger.error("Failed to find the icon resource. Add the icon file under the /res/drawable folder.");
        }
    }

}
