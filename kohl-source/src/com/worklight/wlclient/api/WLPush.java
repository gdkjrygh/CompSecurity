// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.push.GCMErrorCode;
import com.worklight.wlclient.WLRequest;
import com.worklight.wlclient.WLRequestListener;
import com.worklight.wlclient.push.GCMIntentService;
import com.worklight.wlclient.push.common.GCMClient;
import com.worklight.wlclient.push.common.GCMClientFactory;
import com.worklight.wlclient.push.common.GCMHelperUtil;
import com.worklight.wlclient.push.common.GCMRegistrationListener;
import com.worklight.wlclient.push.common.GCMRetryListener;
import com.worklight.wlclient.push.common.GCMRetryWorker;
import com.worklight.wlclient.ui.UIActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            WLEventSourceListener, WLNotificationListener, WLPushOptions, WLRequestOptions, 
//            WLOnReadyToSubscribeListener, WLResponseListener, WLResponse, WLFailResponse

public class WLPush
    implements GCMRegistrationListener, GCMRetryListener
{
    class EventSourceSubscribeRequestListener extends SubscribeRequestListener
    {

        private String alias;
        final WLPush this$0;

        private void deletePendingNotifications(String s)
        {
            Iterator iterator = pendingPushEvents.iterator();
_L7:
            if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
            Object obj = (JSONObject)iterator.next();
            if (!((JSONObject) (obj)).isNull("alias")) goto _L4; else goto _L3
_L3:
            obj = null;
_L5:
            if (obj != null)
            {
                try
                {
                    if (((String) (obj)).equals(s))
                    {
                        iterator.remove();
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    WLPush.logger.error((new StringBuilder()).append("Failed deleting pending push events.").append(((JSONException) (obj)).getMessage()).toString());
                }
            }
            continue; /* Loop/switch isn't completed */
_L4:
            obj = (String)((JSONObject) (obj)).get("alias");
            if (true) goto _L5; else goto _L2
_L2:
            return;
            if (true) goto _L7; else goto _L6
_L6:
        }

        public void onSuccess(WLResponse wlresponse)
        {
            removeOldSubscribedAliases(alias);
            if (!subscribedEventSources.contains(alias))
            {
                subscribedEventSources.add(alias);
                deletePendingNotifications(alias);
            }
            super.onSuccess(wlresponse);
        }

        public EventSourceSubscribeRequestListener(String s)
        {
            this$0 = WLPush.this;
            super();
            alias = s;
        }
    }

    class EventSourceUnSubscribeRequestListener extends UnSubscribeRequestListener
    {

        private String alias;
        final WLPush this$0;

        public void onSuccess(WLResponse wlresponse)
        {
            JSONObject jsonobject;
            boolean flag;
            removeOldSubscribedAliases(alias);
            if (subscribedEventSources.contains(alias))
            {
                subscribedEventSources.remove(alias);
            }
            jsonobject = wlresponse.getResponseJSON();
            if (jsonobject != null)
            {
                break MISSING_BLOCK_LABEL_71;
            }
            flag = true;
_L1:
            if (!flag)
            {
                try
                {
                    super.onFailure(new WLFailResponse(wlresponse));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (WLResponse wlresponse)
                {
                    WLPush.logger.error((new StringBuilder()).append("Failed to unsubscribe from tag.").append(wlresponse.getMessage()).toString());
                }
                break MISSING_BLOCK_LABEL_116;
            }
            break MISSING_BLOCK_LABEL_81;
            flag = jsonobject.getBoolean("isSuccessful");
              goto _L1
            super.onSuccess(wlresponse);
            return;
        }

        public EventSourceUnSubscribeRequestListener(String s)
        {
            this$0 = WLPush.this;
            super();
            alias = s;
        }
    }

    class RegisteredEventSource
    {

        private String adapter;
        private String eventSource;
        private WLEventSourceListener eventSourceListener;
        final WLPush this$0;

        public String getAdapter()
        {
            return adapter;
        }

        public String getEventSource()
        {
            return eventSource;
        }

        public WLEventSourceListener getEventSourceListener()
        {
            return eventSourceListener;
        }

        public void setAdapter(String s)
        {
            adapter = s;
        }

        public void setEventSource(String s)
        {
            eventSource = s;
        }

        public void setEventSourceListener(WLEventSourceListener wleventsourcelistener)
        {
            eventSourceListener = wleventsourcelistener;
        }




        RegisteredEventSource()
        {
            this$0 = WLPush.this;
            super();
        }
    }

    class SubscribeRequestListener
        implements WLRequestListener
    {

        final WLPush this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
        }

        public void onSuccess(WLResponse wlresponse)
        {
            wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
            if (hasPendings())
            {
                dispatchPendings();
            }
        }

        SubscribeRequestListener()
        {
            this$0 = WLPush.this;
            super();
        }
    }

    class TagSubscribeRequestListener extends SubscribeRequestListener
    {

        private String tagName;
        final WLPush this$0;

        public void onSuccess(WLResponse wlresponse)
        {
            if (!subscribedTags.contains(tagName))
            {
                subscribedTags.add(tagName);
            }
            super.onSuccess(wlresponse);
        }

        public TagSubscribeRequestListener(String s)
        {
            this$0 = WLPush.this;
            super();
            tagName = s;
        }
    }

    class TagUnSubscribeRequestListener extends UnSubscribeRequestListener
    {

        private String tagName;
        final WLPush this$0;

        public void onSuccess(WLResponse wlresponse)
        {
            JSONObject jsonobject;
            boolean flag;
            if (subscribedTags.contains(tagName))
            {
                subscribedTags.remove(tagName);
            }
            jsonobject = wlresponse.getResponseJSON();
            if (jsonobject != null)
            {
                break MISSING_BLOCK_LABEL_60;
            }
            flag = true;
_L1:
            if (!flag)
            {
                try
                {
                    super.onFailure(new WLFailResponse(wlresponse));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (WLResponse wlresponse)
                {
                    WLPush.logger.error((new StringBuilder()).append("Failed to unsubscribe from tag.").append(wlresponse.getMessage()).toString());
                }
                break MISSING_BLOCK_LABEL_105;
            }
            break MISSING_BLOCK_LABEL_70;
            flag = jsonobject.getBoolean("isSuccessful");
              goto _L1
            super.onSuccess(wlresponse);
            return;
        }

        public TagUnSubscribeRequestListener(String s)
        {
            this$0 = WLPush.this;
            super();
            tagName = s;
        }
    }

    class UnSubscribeRequestListener
        implements WLRequestListener
    {

        final WLPush this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            wlfailresponse.getOptions().getResponseListener().onFailure(wlfailresponse);
        }

        public void onSuccess(WLResponse wlresponse)
        {
            wlresponse.getOptions().getResponseListener().onSuccess(wlresponse);
        }

        UnSubscribeRequestListener()
        {
            this$0 = WLPush.this;
            super();
        }
    }

    class UpdateTokenListener
        implements WLRequestListener
    {

        final WLPush this$0;

        public void onFailure(WLFailResponse wlfailresponse)
        {
            isTokenUpdatedOnServer = false;
            WLPush.logger.error("Failed to update token on server");
        }

        public void onSuccess(WLResponse wlresponse)
        {
            isTokenUpdatedOnServer = true;
            if (onReadyToSubscribeListener != null)
            {
                onReadyToSubscribeListener.onReadyToSubscribe();
            } else
            {
                WLPush.logger.debug("onReadyToSubscribeListener is NULL");
            }
            if (hasPendings())
            {
                dispatchPendings();
            }
        }

        public UpdateTokenListener()
        {
            this$0 = WLPush.this;
            super();
        }
    }


    private static final String ERROR_ID = "WLClient.error";
    private static final String FROM_NOTIFICATION_BAR = "notificationBar";
    private static final String NOT_UPDATE_FAILURE = "WLClient.notificationUpdateFailure";
    private static final String OK = "WLClient.ok";
    private static final String PUSH_CREDENTIALS = "credentials";
    private static final String SERVER_DEVREGUSERID_FIELD = "userId";
    private static final String SERVER_LOGINUSERID_FIELD = "login_userId";
    private static final String TOKEN_DATA_FIELD = "token";
    private static Logger logger = Logger.getInstance(com/worklight/wlclient/api/WLPush.getName());
    private WLConfig config;
    private Context context;
    private String existingDevRegUserId;
    private GCMClient gcm;
    private GCMRetryWorker gcmRetryWorker;
    private String gcmSenderId;
    private boolean isTokenUpdatedOnServer;
    private WLNotificationListener notificationListener;
    private BroadcastReceiver onMessage;
    private WLOnReadyToSubscribeListener onReadyToSubscribeListener;
    private ArrayList pending;
    private ArrayList pendingPushEvents;
    private HashMap registeredEventSources;
    private String serverLoginUserId;
    private String serverToken;
    private ArrayList subscribedEventSources;
    private ArrayList subscribedTags;

    WLPush(WLConfig wlconfig, Context context1, JSONObject jsonobject)
    {
        isTokenUpdatedOnServer = false;
        registeredEventSources = new HashMap();
        subscribedEventSources = new ArrayList();
        subscribedTags = new ArrayList();
        pendingPushEvents = new ArrayList();
        pending = new ArrayList();
        serverToken = null;
        onReadyToSubscribeListener = null;
        notificationListener = null;
        onMessage = new BroadcastReceiver() {

            final WLPush this$0;

            public void onReceive(Context context2, Intent intent)
            {
                boolean flag;
                WLPush.logger.debug("Successfully received message for dispatching");
                flag = intent.getBooleanExtra("notificationBar", false);
                context2 = pending;
                context2;
                JVM INSTR monitorenter ;
                intent = (com.worklight.wlclient.push.GCMIntentService.Message)intent.getParcelableExtra("message");
                if (!GCMIntentService.isAppForeground() || flag)
                {
                    break MISSING_BLOCK_LABEL_83;
                }
                WLPush.logger.debug((new StringBuilder()).append("Push: App on foreground. Add message from intent to pending: ").append(intent).toString());
                pending.add(intent);
                if (!flag)
                {
                    break MISSING_BLOCK_LABEL_94;
                }
                moveQueueToPending();
                context2;
                JVM INSTR monitorexit ;
                if (GCMIntentService.isAppForeground())
                {
                    dispatchPending();
                }
                if (!flag)
                {
                    setResultCode(-1);
                }
                return;
                intent;
                context2;
                JVM INSTR monitorexit ;
                throw intent;
            }

            
            {
                this$0 = WLPush.this;
                super();
            }
        };
        if (context1 == null)
        {
            throw new RuntimeException("getPush() call failed because the input parameter 'context' is null. Pass a valid context instance.");
        }
        gcm = GCMClientFactory.getInstance(context1);
        gcmRetryWorker = new GCMRetryWorker(this);
        if (android.os.Build.VERSION.SDK_INT < 8)
        {
            wlconfig = (new StringBuilder()).append("The current Android version ").append(android.os.Build.VERSION.RELEASE).append(" not allowed to work with push.").toString();
            logger.error(wlconfig);
            throw new RuntimeException(wlconfig);
        }
        try
        {
            GCMHelperUtil.checkManifest(context1, "com.worklight.wlclient.push.GCMIntentService", "com.worklight.wlclient.push.WLBroadcastReceiver");
        }
        // Misplaced declaration of an exception variable
        catch (WLConfig wlconfig)
        {
            throw new RuntimeException((new StringBuilder()).append("Your manifest is not allowed to work with push. ").append(wlconfig.getMessage()).toString());
        }
        try
        {
            WLUtils.getResourceId(context1, "drawable", "push");
        }
        // Misplaced declaration of an exception variable
        catch (WLConfig wlconfig)
        {
            throw new RuntimeException("Failed to find the icon resource. Add the icon file under the /res/drawable folder.");
        }
        config = wlconfig;
        context = context1;
        GCMIntentService.setAppForeground(true);
        unregisterReceivers();
        context1.registerReceiver(onMessage, new IntentFilter((new StringBuilder()).append(WLUtils.getFullAppName(context1)).append(".C2DM_MESSAGE").toString()));
        dispatchPending();
        updateNotificationSubscriptionState(jsonobject);
    }

    private void cancelAllNotification()
    {
        ((NotificationManager)context.getSystemService("notification")).cancelAll();
    }

    private void clearSubscribedEventSources()
    {
        logger.debug("Clearing notification subscriptions.");
        subscribedEventSources.clear();
    }

    private void clearSubscribedTags()
    {
        logger.debug("Clearing tag notification subscriptions.");
        subscribedTags.clear();
    }

    private void dispatch()
    {
        dispatchPending();
    }

    private void dispatchPending()
    {
_L2:
        obj = null;
        synchronized (pending)
        {
            if (pending.size() > 0)
            {
                obj = (com.worklight.wlclient.push.GCMIntentService.Message)pending.remove(0);
            }
        }
        if (obj == null)
        {
            return;
        }
        break MISSING_BLOCK_LABEL_43;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        if (!onMessage(((com.worklight.wlclient.push.GCMIntentService.Message) (obj))))
        {
            Intent intent = new Intent((new StringBuilder()).append(WLUtils.getFullAppName(context)).append(".C2DM_MESSAGE").toString());
            intent.putExtra("message", ((android.os.Parcelable) (obj)));
            synchronized (GCMIntentService.intentsQueue)
            {
                GCMIntentService.intentsQueue.add(intent);
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void dispatchPendings()
    {
        Iterator iterator = pendingPushEvents.iterator();
_L3:
        JSONObject jsonobject;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = (JSONObject)iterator.next();
        if (!jsonobject.isNull("alias"))
        {
            break MISSING_BLOCK_LABEL_217;
        }
        Object obj = null;
_L1:
        if (obj != null)
        {
            try
            {
                if (subscribedEventSources.contains(obj) && registeredEventSources.containsKey(obj) && ((RegisteredEventSource)registeredEventSources.get(obj)).eventSourceListener != null)
                {
                    if (!jsonobject.getJSONObject("props").isNull("key"))
                    {
                        String s = (String)jsonobject.getJSONObject("props").remove("key");
                        gcm.sendUpstreamMessage(s, ((String) (obj)), null, context);
                    }
                    ((RegisteredEventSource)registeredEventSources.get(obj)).eventSourceListener.onReceive(jsonobject.getString("props"), jsonobject.getString("payload"));
                    removeFromGCMIntentQueue(jsonobject);
                    iterator.remove();
                    cancelAllNotification();
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                logger.error((new StringBuilder()).append("Failed processing pending push events.").append(((JSONException) (obj)).getMessage()).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        break MISSING_BLOCK_LABEL_231;
        obj = (String)jsonobject.get("alias");
          goto _L1
        if (notificationListener == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (jsonobject.getJSONObject("props").isNull("key"))
        {
            break MISSING_BLOCK_LABEL_324;
        }
        obj = null;
        String s1 = (String)jsonobject.getJSONObject("props").remove("key");
        if (!jsonobject.getJSONObject("payload").isNull("tag"))
        {
            obj = (String)jsonobject.getJSONObject("payload").get("tag");
        }
        gcm.sendUpstreamMessage(s1, null, ((String) (obj)), context);
        notificationListener.onMessage(jsonobject.getString("props"), jsonobject.getString("payload"));
        removeFromGCMIntentQueue(jsonobject);
        iterator.remove();
        cancelAllNotification();
        if (true) goto _L3; else goto _L2
_L2:
    }

    private boolean hasPendings()
    {
        return pendingPushEvents != null && pendingPushEvents.size() > 0;
    }

    private void internalSubscribe(WLRequestOptions wlrequestoptions, WLPushOptions wlpushoptions, WLRequestListener wlrequestlistener, WLResponseListener wlresponselistener, final String originMethod)
    {
        Object obj = wlpushoptions;
        if (wlpushoptions == null)
        {
            obj = new WLPushOptions();
        }
        wlpushoptions = new StringBuffer();
        obj = ((WLPushOptions) (obj)).getSubscriptionParameters();
        wlpushoptions.append("{");
        if (obj != null && !((Map) (obj)).isEmpty())
        {
            Iterator iterator = ((Map) (obj)).keySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                String s = (String)iterator.next();
                wlpushoptions.append("\"");
                wlpushoptions.append(s);
                wlpushoptions.append("\":\"");
                wlpushoptions.append((String)((Map) (obj)).get(s));
                wlpushoptions.append("\"");
                if (iterator.hasNext())
                {
                    wlpushoptions.append(",");
                }
            } while (true);
        }
        wlpushoptions.append("}");
        wlrequestoptions.addParameter("subscribe", wlpushoptions.toString());
        wlpushoptions = wlresponselistener;
        if (wlresponselistener == null)
        {
            wlpushoptions = new WLResponseListener() {

                final WLPush this$0;
                final String val$originMethod;

                public void onFailure(WLFailResponse wlfailresponse)
                {
                    WLPush.logger.error((new StringBuilder()).append(originMethod).append(": error subscribing for notifications").toString());
                }

                public void onSuccess(WLResponse wlresponse)
                {
                }

            
            {
                this$0 = WLPush.this;
                originMethod = s;
                super();
            }
            };
        }
        wlrequestoptions.setResponseListener(wlpushoptions);
        (new WLRequest(wlrequestlistener, wlrequestoptions, config, context)).makeRequest("notifications");
        dispatch();
    }

    private void internalUnsubscribe(WLRequestOptions wlrequestoptions, WLRequestListener wlrequestlistener, WLResponseListener wlresponselistener, final String originMethod)
    {
        WLResponseListener wlresponselistener1 = wlresponselistener;
        if (wlresponselistener == null)
        {
            wlresponselistener1 = new WLResponseListener() {

                final WLPush this$0;
                final String val$originMethod;

                public void onFailure(WLFailResponse wlfailresponse)
                {
                    WLPush.logger.error((new StringBuilder()).append(originMethod).append(": error unsubscribing from notifications").toString());
                }

                public void onSuccess(WLResponse wlresponse)
                {
                }

            
            {
                this$0 = WLPush.this;
                originMethod = s;
                super();
            }
            };
        }
        wlrequestoptions.setResponseListener(wlresponselistener1);
        wlrequestoptions.addParameter("unsubscribe", "{}");
        (new WLRequest(wlrequestlistener, wlrequestoptions, config, context)).makeRequest("notifications");
    }

    private boolean isAbleToSubscribe()
    {
        if (!isDeviceSupportPush())
        {
            logger.error((new StringBuilder()).append("The current Android version ").append(android.os.Build.VERSION.RELEASE).append(" does not support push notifications.").toString());
            return false;
        }
        if (!isTokenUpdatedOnServer)
        {
            logger.error("Can't subscribe, notification token is not updated on the server");
            return false;
        } else
        {
            return true;
        }
    }

    private boolean isAbleToSubscribeEventSource(String s)
    {
        if (!isAbleToSubscribe())
        {
            return false;
        }
        if (registeredEventSources == null || registeredEventSources.get(s) == null)
        {
            logger.error((new StringBuilder()).append("No registered push event source for alias '").append(s).append("'.").toString());
            return false;
        } else
        {
            return true;
        }
    }

    private boolean isDeviceSupportPush()
    {
        return WLUtils.getSDKVersion() >= 10;
    }

    private void moveQueueToPending()
    {
        LinkedList linkedlist = GCMIntentService.intentsQueue;
        linkedlist;
        JVM INSTR monitorenter ;
        com.worklight.wlclient.push.GCMIntentService.Message message;
        for (Iterator iterator = GCMIntentService.intentsQueue.descendingIterator(); iterator.hasNext(); pending.add(message))
        {
            message = (com.worklight.wlclient.push.GCMIntentService.Message)((Intent)iterator.next()).getParcelableExtra("message");
        }

        break MISSING_BLOCK_LABEL_58;
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        GCMIntentService.intentsQueue.clear();
        linkedlist;
        JVM INSTR monitorexit ;
    }

    private boolean onMessage(com.worklight.wlclient.push.GCMIntentService.Message message)
    {
        JSONObject jsonobject;
        JSONObject jsonobject1;
        jsonobject = message.getProps();
        jsonobject1 = message.getPayload();
        if (!jsonobject1.isNull("alias"))
        {
            String s = (String)jsonobject1.get("alias");
            logger.debug((new StringBuilder()).append("WLPush received notification for alias: ").append(s).toString());
            if (subscribedEventSources.contains(s) && registeredEventSources.containsKey(s) && ((RegisteredEventSource)registeredEventSources.get(s)).eventSourceListener != null)
            {
                if (!jsonobject.isNull("key"))
                {
                    message = (String)jsonobject.remove("key");
                    gcm.sendUpstreamMessage(message, s, null, context);
                }
                ((RegisteredEventSource)registeredEventSources.get(s)).eventSourceListener.onReceive(jsonobject.toString(), jsonobject1.toString());
                break MISSING_BLOCK_LABEL_447;
            }
            try
            {
                pendingPushEvents.add(new JSONObject((new StringBuilder()).append("{\"alias\":").append(s).append(", \"props\":").append(jsonobject.toString()).append(", \"payload\":").append(jsonobject1.toString()).append(", \"message\":").append(message.hashCode()).append("}").toString()));
            }
            // Misplaced declaration of an exception variable
            catch (com.worklight.wlclient.push.GCMIntentService.Message message)
            {
                logger.error((new StringBuilder()).append("Failed processing pending push events, because ").append(message.getMessage()).toString());
                break MISSING_BLOCK_LABEL_447;
            }
            return false;
        }
        if (notificationListener == null)
        {
            break MISSING_BLOCK_LABEL_375;
        }
        if (jsonobject.isNull("key"))
        {
            break MISSING_BLOCK_LABEL_322;
        }
        message = null;
        s = (String)jsonobject.remove("key");
        if (!jsonobject1.isNull("tag"))
        {
            message = (String)jsonobject1.get("tag");
        }
        gcm.sendUpstreamMessage(s, null, message, context);
        notificationListener.onMessage(jsonobject.toString(), jsonobject1.toString());
        break MISSING_BLOCK_LABEL_447;
        pendingPushEvents.add(new JSONObject((new StringBuilder()).append("{\"props\":").append(jsonobject.toString()).append(", \"payload\":").append(jsonobject1.toString()).append(", \"message\":").append(message.hashCode()).append("}").toString()));
        return false;
        return true;
    }

    private void removeFromGCMIntentQueue(JSONObject jsonobject)
        throws JSONException
    {
        synchronized (GCMIntentService.intentsQueue)
        {
            Iterator iterator = GCMIntentService.intentsQueue.descendingIterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                Intent intent = (Intent)iterator.next();
                com.worklight.wlclient.push.GCMIntentService.Message message = (com.worklight.wlclient.push.GCMIntentService.Message)intent.getParcelableExtra("message");
                if (jsonobject.getInt("message") != message.hashCode())
                {
                    continue;
                }
                GCMIntentService.intentsQueue.remove(intent);
                break;
            } while (true);
        }
        return;
        jsonobject;
        linkedlist;
        JVM INSTR monitorexit ;
        throw jsonobject;
    }

    private void removeOldSubscribedAliases(String s)
    {
        Object obj = (RegisteredEventSource)registeredEventSources.get(s);
        String s1 = ((RegisteredEventSource) (obj)).eventSource;
        obj = ((RegisteredEventSource) (obj)).adapter;
        Iterator iterator = registeredEventSources.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            RegisteredEventSource registeredeventsource = (RegisteredEventSource)entry.getValue();
            if (registeredeventsource.eventSource.equals(s1) && registeredeventsource.adapter.equals(obj) && !((String)entry.getKey()).equals(s))
            {
                subscribedEventSources.remove(entry.getKey());
            }
        } while (true);
    }

    private void showErrorDialogue(String s, String s1, String s2)
    {
        Intent intent = new Intent(context, com/worklight/wlclient/ui/UIActivity);
        intent.putExtra("action", "exit");
        intent.putExtra("dialogue_message", s1);
        intent.putExtra("dialogue_title", s);
        intent.putExtra("positive_button_text", s2);
        context.startActivity(intent);
    }

    private void updateRegisteredEventSources(String s, String s1, String s2, WLEventSourceListener wleventsourcelistener)
    {
        if (registeredEventSources == null)
        {
            registeredEventSources = new HashMap();
        }
        RegisteredEventSource registeredeventsource1 = (RegisteredEventSource)registeredEventSources.get(s);
        RegisteredEventSource registeredeventsource = registeredeventsource1;
        if (registeredeventsource1 == null)
        {
            registeredeventsource = new RegisteredEventSource();
        }
        registeredeventsource.setAdapter(s1);
        registeredeventsource.setEventSource(s2);
        registeredeventsource.setEventSourceListener(wleventsourcelistener);
        registeredEventSources.put(s, registeredeventsource);
    }

    private void updateSubscribedEventSources(JSONArray jsonarray)
    {
        int i;
        logger.debug("Updating notification subscriptions.");
        i = 0;
        int j = jsonarray.length();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        String s = (String)((JSONObject)jsonarray.get(i)).get("alias");
        if (!subscribedEventSources.contains(s))
        {
            subscribedEventSources.add(s);
        }
        i++;
        if (true) goto _L2; else goto _L1
        jsonarray;
        logger.error((new StringBuilder()).append("Updating notification subscriptions failed, because ").append(jsonarray.getMessage()).toString());
_L1:
    }

    private void updateSubscribedTags(JSONArray jsonarray)
    {
        int i;
        logger.debug("Updating tag notification subscriptions.");
        i = 0;
        int j = jsonarray.length();
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        String s = (String)jsonarray.get(i);
        if (!subscribedTags.contains(s))
        {
            subscribedTags.add(s);
        }
        i++;
        if (true) goto _L2; else goto _L1
        jsonarray;
        logger.error((new StringBuilder()).append("Updating tag notification subscriptions failed, because ").append(jsonarray.getMessage()).toString());
_L1:
    }

    private void updateToken(JSONObject jsonobject)
    {
        try
        {
            if (jsonobject.has("token"))
            {
                serverToken = (String)jsonobject.get("token");
            }
            if (jsonobject.has("credentials"))
            {
                gcmSenderId = (String)jsonobject.get("credentials");
            }
            if (jsonobject.has("userId"))
            {
                existingDevRegUserId = (String)jsonobject.get("userId");
            }
            if (jsonobject.has("login_userId"))
            {
                serverLoginUserId = (String)jsonobject.get("login_userId");
            }
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject) { }
        logger.debug("Registering at the GCM server.");
        gcmRetryWorker.resetBackOff();
        gcm.register(context, gcmSenderId, this);
    }

    private void updateTokenCallback(String s)
    {
        boolean flag1 = false;
        if (serverToken != null && serverToken.equals(s)) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L6:
        if (flag)
        {
            logger.debug((new StringBuilder()).append("Push notification device token has changed, Updating on server [serverToken: ").append(serverToken).append(", deviceToken: ").append(s).append("]").toString());
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            wlrequestoptions.addParameter("updateToken", s);
            (new WLRequest(new UpdateTokenListener(), wlrequestoptions, config, context)).makeRequest("notifications");
        } else
        {
            isTokenUpdatedOnServer = true;
            if (onReadyToSubscribeListener != null)
            {
                onReadyToSubscribeListener.onReadyToSubscribe();
            }
            if (hasPendings())
            {
                dispatchPendings();
            }
        }
        serverToken = null;
        return;
_L2:
        if (existingDevRegUserId != null && !existingDevRegUserId.equals(serverLoginUserId)) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (existingDevRegUserId != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (serverLoginUserId == null) goto _L6; else goto _L4
_L4:
        flag = true;
          goto _L6
    }

    public Context getContext()
    {
        return context;
    }

    public String getErrorCode(String s)
    {
        return gcm.getErrorCode(s);
    }

    public GCMRetryWorker getGcmRetryWorker()
    {
        return gcmRetryWorker;
    }

    public String getGcmSenderId()
    {
        return gcmSenderId;
    }

    WLOnReadyToSubscribeListener getOnReadyToSubscribeListener()
    {
        return onReadyToSubscribeListener;
    }

    WLNotificationListener getWLNotificationListener()
    {
        return notificationListener;
    }

    public boolean isForeground()
    {
        return GCMIntentService.isAppForeground();
    }

    public boolean isPushSupported()
    {
        return isDeviceSupportPush();
    }

    public boolean isSubscribed(String s)
    {
        return subscribedEventSources != null && subscribedEventSources.contains(s);
    }

    public boolean isTagSubscribed(String s)
    {
        return subscribedTags != null && subscribedTags.contains(s);
    }

    public void registerEventSourceCallback(String s, String s1, String s2, WLEventSourceListener wleventsourcelistener)
    {
        if (WLUtils.isStringEmpty(s) || WLUtils.isStringEmpty(s1) || WLUtils.isStringEmpty(s2))
        {
            logger.error((new StringBuilder()).append("Cannot register to event source callback with alias '").append(s).append("', adapter '").append(s1).append("' and eventSource '").append(s2).append("'. Use concrete values which are not null or empty.").toString());
        } else
        {
            if (registeredEventSources.get(s) != null)
            {
                logger.warn((new StringBuilder()).append("Event source callback is already registered with alias: ").append(s).toString());
                return;
            }
            if (isAbleToSubscribe())
            {
                updateRegisteredEventSources(s, s1, s2, wleventsourcelistener);
                return;
            }
        }
    }

    public void sendErrorMsg(String s, boolean flag)
    {
        if (!flag) goto _L2; else goto _L1
_L1:
        ResourceBundle resourcebundle = WLUtils.getMessagesBundle();
        GCMErrorCode gcmerrorcode = GCMErrorCode.valueOf(s);
        s = gcmerrorcode;
_L4:
        s = resourcebundle.getString(s.getDescription());
        logger.error((new StringBuilder()).append("The application will not receive push notifications, because registration for push notifications failed with ").append(s).toString());
        showErrorDialogue(resourcebundle.getString("WLClient.error"), (new StringBuilder()).append(resourcebundle.getString("WLClient.notificationUpdateFailure")).append("\n").append(s).toString(), resourcebundle.getString("WLClient.ok"));
_L2:
        return;
        Exception exception;
        exception;
        GCMErrorCode gcmerrorcode1 = GCMErrorCode.UNEXPECTED;
        logger.error((new StringBuilder()).append("Registering to notification failed because ").append(s).append(".").toString());
        s = gcmerrorcode1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void sendToken(String s)
    {
        updateTokenCallback(s);
    }

    public void setForeground(boolean flag)
    {
        GCMIntentService.setAppForeground(flag);
        if (flag)
        {
            moveQueueToPending();
            dispatchPending();
            if (!hasPendings())
            {
                cancelAllNotification();
            }
            return;
        } else
        {
            pendingPushEvents.clear();
            return;
        }
    }

    public void setOnReadyToSubscribeListener(WLOnReadyToSubscribeListener wlonreadytosubscribelistener)
    {
        onReadyToSubscribeListener = wlonreadytosubscribelistener;
    }

    public void setWLNotificationListener(WLNotificationListener wlnotificationlistener)
    {
        notificationListener = wlnotificationlistener;
        if (hasPendings())
        {
            dispatchPendings();
        }
    }

    public void subscribe(String s, WLPushOptions wlpushoptions, WLResponseListener wlresponselistener)
    {
        if (WLUtils.isStringEmpty(s))
        {
            logger.error((new StringBuilder()).append("Cannot subscribe to event source with alias '").append(s).append("', because it is either null or empty.").toString());
        } else
        if (isAbleToSubscribeEventSource(s))
        {
            RegisteredEventSource registeredeventsource = (RegisteredEventSource)registeredEventSources.get(s);
            if (registeredeventsource == null)
            {
                logger.error((new StringBuilder()).append("Event source with alias '").append(s).append("' is not registered. Register before subscribing to event source.").toString());
                return;
            } else
            {
                WLRequestOptions wlrequestoptions = new WLRequestOptions();
                wlrequestoptions.addParameter("alias", s);
                wlrequestoptions.addParameter("adapter", registeredeventsource.adapter);
                wlrequestoptions.addParameter("eventSource", registeredeventsource.eventSource);
                internalSubscribe(wlrequestoptions, wlpushoptions, new EventSourceSubscribeRequestListener(s), wlresponselistener, "WLPush.subscribe");
                return;
            }
        }
    }

    public void subscribeTag(String s, WLPushOptions wlpushoptions, WLResponseListener wlresponselistener)
    {
        if (WLUtils.isStringEmpty(s))
        {
            logger.error((new StringBuilder()).append("Cannot subscribe to tag with name '").append(s).append("', because it is either null or empty.").toString());
        } else
        if (isAbleToSubscribe())
        {
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            wlrequestoptions.addParameter("tag", s);
            internalSubscribe(wlrequestoptions, wlpushoptions, new TagSubscribeRequestListener(s), wlresponselistener, "WLPush.subscribeTag");
            return;
        }
    }

    public void unregisterReceivers()
    {
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        gcm.unregisterReceivers(context);
        context.unregisterReceiver(onMessage);
        return;
        Exception exception;
        exception;
        logger.warn((new StringBuilder()).append("unregisterReceivers:").append(exception.getMessage()).toString());
        return;
    }

    public void unsubscribe(String s, WLResponseListener wlresponselistener)
    {
        if (WLUtils.isStringEmpty(s))
        {
            logger.error((new StringBuilder()).append("Cannot unsubscribe from event source with alias '").append(s).append("'.Please check if the input alias is valid.").toString());
        } else
        if (isAbleToSubscribeEventSource(s))
        {
            RegisteredEventSource registeredeventsource = (RegisteredEventSource)registeredEventSources.get(s);
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            wlrequestoptions.addParameter("alias", s);
            wlrequestoptions.addParameter("adapter", registeredeventsource.adapter);
            wlrequestoptions.addParameter("eventSource", registeredeventsource.eventSource);
            internalUnsubscribe(wlrequestoptions, new EventSourceUnSubscribeRequestListener(s), wlresponselistener, "WLPush.unsubscribe");
            return;
        }
    }

    public void unsubscribeTag(String s, WLResponseListener wlresponselistener)
    {
        if (WLUtils.isStringEmpty(s))
        {
            logger.error((new StringBuilder()).append("Cannot unsubscribe from tag with name '").append(s).append("'.Please check if the input tag name is valid.").toString());
        } else
        if (isAbleToSubscribe())
        {
            WLRequestOptions wlrequestoptions = new WLRequestOptions();
            wlrequestoptions.addParameter("tag", s);
            internalUnsubscribe(wlrequestoptions, new TagUnSubscribeRequestListener(s), wlresponselistener, "WLPush.unsubscribeTag");
            return;
        }
    }

    void updateNotificationSubscriptionState(JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_65;
        }
        updateToken(jsonobject);
        clearSubscribedEventSources();
        if (jsonobject.has("eventSources"))
        {
            updateSubscribedEventSources((JSONArray)jsonobject.get("eventSources"));
        }
        clearSubscribedTags();
        if (jsonobject.has("tags"))
        {
            updateSubscribedTags((JSONArray)jsonobject.get("tags"));
        }
        return;
        jsonobject;
    }






/*
    static boolean access$1302(WLPush wlpush, boolean flag)
    {
        wlpush.isTokenUpdatedOnServer = flag;
        return flag;
    }

*/








}
