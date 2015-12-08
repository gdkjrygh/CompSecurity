// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.worklight.androidgap.push.GCMIntentService;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.push.GCMErrorCode;
import com.worklight.wlclient.push.common.GCMClient;
import com.worklight.wlclient.push.common.GCMClientFactory;
import com.worklight.wlclient.push.common.GCMHelperUtil;
import com.worklight.wlclient.push.common.GCMRegistrationListener;
import com.worklight.wlclient.push.common.GCMRetryListener;
import com.worklight.wlclient.push.common.GCMRetryWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Push extends CordovaPlugin
    implements GCMRegistrationListener, GCMRetryListener
{
    private static final class ACTION extends Enum
    {

        private static final ACTION $VALUES[];
        public static final ACTION dispatch;
        public static final ACTION notifyInitComplete;
        public static final ACTION sendUpstreamMessage;
        public static final ACTION subscribe;
        public static final ACTION token;

        public static ACTION fromString(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return s;
        }

        public static ACTION valueOf(String s)
        {
            return (ACTION)Enum.valueOf(com/worklight/androidgap/plugin/Push$ACTION, s);
        }

        public static ACTION[] values()
        {
            return (ACTION[])$VALUES.clone();
        }

        static 
        {
            subscribe = new ACTION("subscribe", 0);
            dispatch = new ACTION("dispatch", 1);
            token = new ACTION("token", 2);
            notifyInitComplete = new ACTION("notifyInitComplete", 3);
            sendUpstreamMessage = new ACTION("sendUpstreamMessage", 4);
            $VALUES = (new ACTION[] {
                subscribe, dispatch, token, notifyInitComplete, sendUpstreamMessage
            });
        }

        private ACTION(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String FROM_NOTIFICATION_BAR = "notificationBar";
    private static final String RESOURCE_BUNDLE = "com/worklight/wlclient/messages";
    private static final String WL_CLIENT_PUSH_ONMESSAGE = "WL.Client.Push.__onmessage";
    private String badGCMSetupMsg;
    private String deviceToken;
    private GCMClient gcm;
    private GCMRetryWorker gcmRetryWorker;
    private boolean isGCMSetupValid;
    private Logger logger;
    private String messageCallback;
    private BroadcastReceiver onMessageReceiver;
    private ArrayList pending;
    private CallbackContext registerContext;

    public Push()
    {
        logger = Logger.getInstance("push");
        messageCallback = null;
        pending = new ArrayList();
        deviceToken = null;
        badGCMSetupMsg = null;
        isGCMSetupValid = true;
        registerContext = null;
    }

    private void dispatch(JSONArray jsonarray)
    {
        JSONArray jsonarray1 = null;
        jsonarray = jsonarray.getString(0);
        jsonarray1 = jsonarray;
_L1:
        logger.debug((new StringBuilder()).append("Push.dispatch(): method=").append(jsonarray1).toString());
        jsonarray = jsonarray1;
        if (jsonarray1 != null)
        {
            jsonarray = jsonarray1.trim();
        }
        jsonarray1 = jsonarray;
        if ("".equals(jsonarray))
        {
            jsonarray1 = null;
        }
        if (messageCallback == null && jsonarray1 != null || messageCallback != null && !messageCallback.equals(jsonarray1))
        {
            messageCallback = jsonarray1;
            Logger logger1 = logger;
            StringBuilder stringbuilder = (new StringBuilder()).append("Javascript script requests ");
            if (jsonarray1 == null)
            {
                jsonarray = "to stop dispatching";
            } else
            {
                jsonarray = (new StringBuilder()).append("dispatching to ").append(jsonarray1).toString();
            }
            logger1.debug(stringbuilder.append(jsonarray).toString());
        }
        dispatchPending();
        return;
        jsonarray;
        logger.debug("Push.dispatch(): Unable to get method name from args");
          goto _L1
    }

    private void dispatchPending()
    {
        StringBuilder stringbuilder;
        if (cordova != null && cordova.getActivity().hasWindowFocus())
        {
            messageCallback = "WL.Client.Push.__onmessage";
        }
        if (webView == null || messageCallback == null)
        {
            return;
        }
        stringbuilder = new StringBuilder();
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
            ((NotificationManager)cordova.getActivity().getSystemService("notification")).cancelAll();
            return;
        }
        break MISSING_BLOCK_LABEL_114;
        obj;
        arraylist;
        JVM INSTR monitorexit ;
        throw obj;
        logger.debug((new StringBuilder()).append("Dispatching to javascript ").append(((com.worklight.wlclient.push.GCMIntentService.Message) (obj)).toString()).toString());
        stringbuilder.setLength(0);
        stringbuilder.append(messageCallback);
        stringbuilder.append('(');
        stringbuilder.append(((com.worklight.wlclient.push.GCMIntentService.Message) (obj)).getProps().toString());
        stringbuilder.append(',');
        stringbuilder.append(((com.worklight.wlclient.push.GCMIntentService.Message) (obj)).getPayload().toString());
        stringbuilder.append(");");
        webView.sendJavascript(stringbuilder.toString());
        if (true) goto _L2; else goto _L1
_L1:
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

        break MISSING_BLOCK_LABEL_57;
        Exception exception;
        exception;
        linkedlist;
        JVM INSTR monitorexit ;
        throw exception;
        GCMIntentService.intentsQueue.clear();
        linkedlist;
        JVM INSTR monitorexit ;
    }

    private void sendUpstreamMessage(JSONArray jsonarray)
    {
        try
        {
            gcm.sendUpstreamMessage(jsonarray.getString(0), jsonarray.getString(1), jsonarray.getString(2), cordova.getActivity());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.debug("Push.sendUpstreamMessage(): Unable to get android notification key from args");
        }
    }

    private void subscribe(JSONArray jsonarray, CallbackContext callbackcontext)
    {
        registerContext = callbackcontext;
        try
        {
            gcmRetryWorker.resetBackOff();
            gcm.register(cordova.getActivity(), jsonarray.getString(0), this);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.debug("Push.dispatch(): Unable to get senderId from args");
        }
        jsonarray = new PluginResult(org.apache.cordova.PluginResult.Status.NO_RESULT);
        jsonarray.setKeepCallback(true);
        callbackcontext.sendPluginResult(jsonarray);
    }

    private void unregisterReceivers()
    {
        if (cordova == null)
        {
            break MISSING_BLOCK_LABEL_41;
        }
        gcm.unregisterReceivers(cordova.getActivity());
        cordova.getActivity().unregisterReceiver(onMessageReceiver);
        return;
        Exception exception;
        exception;
        logger.trace((new StringBuilder()).append("unregisterReceivers:").append(exception.getLocalizedMessage()).toString());
        return;
    }

    private void validateGCMSetup()
    {
        int i = android.os.Build.VERSION.SDK_INT;
        if (i < 8)
        {
            badGCMSetupMsg = (new StringBuilder()).append("Your device does not support GCM. GCM is available for Android 2.2+ (API level 8+). Your device API level is: ").append(i).toString();
            isGCMSetupValid = false;
        }
        try
        {
            GCMHelperUtil.checkManifest(cordova.getActivity(), (new StringBuilder()).append(cordova.getActivity().getPackageName()).append(".GCMIntentService").toString(), "com.worklight.androidgap.push.WLBroadcastReceiver");
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            badGCMSetupMsg = (new StringBuilder()).append("Your application manifest is not properly set up for GCM. ").append(illegalstateexception.getMessage()).append(". Refer to the Google Android documentation for instructons how to setup up your application manifest for using GCM.").toString();
        }
        isGCMSetupValid = false;
    }

    public void dispatchPending(com.worklight.wlclient.push.GCMIntentService.Message message)
    {
        messageCallback = "WL.Client.Push.__onmessage";
        moveQueueToPending();
        dispatchPending();
    }

    public boolean execute(final String action, final JSONArray args, final CallbackContext ctx)
        throws JSONException
    {
        if (ctx == null)
        {
            logger.error("Push notification will not be served by the application because MobileFirst Platform runtime failed to register a callback function.");
            return false;
        }
        if (!isGCMSetupValid)
        {
            ctx.error(badGCMSetupMsg);
            return true;
        } else
        {
            cordova.getThreadPool().execute(new Runnable() {

                final Push this$0;
                final String val$action;
                final JSONArray val$args;
                final CallbackContext val$ctx;

                public void run()
                {
                    ACTION action1 = ACTION.fromString(action);
                    if (action1 != null)
                    {
                        static class _cls3
                        {

                            static final int $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION[];

                            static 
                            {
                                $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION = new int[ACTION.values().length];
                                try
                                {
                                    $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION[ACTION.subscribe.ordinal()] = 1;
                                }
                                catch (NoSuchFieldError nosuchfielderror4) { }
                                try
                                {
                                    $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION[ACTION.dispatch.ordinal()] = 2;
                                }
                                catch (NoSuchFieldError nosuchfielderror3) { }
                                try
                                {
                                    $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION[ACTION.token.ordinal()] = 3;
                                }
                                catch (NoSuchFieldError nosuchfielderror2) { }
                                try
                                {
                                    $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION[ACTION.notifyInitComplete.ordinal()] = 4;
                                }
                                catch (NoSuchFieldError nosuchfielderror1) { }
                                try
                                {
                                    $SwitchMap$com$worklight$androidgap$plugin$Push$ACTION[ACTION.sendUpstreamMessage.ordinal()] = 5;
                                }
                                catch (NoSuchFieldError nosuchfielderror)
                                {
                                    return;
                                }
                            }
                        }

                        switch (_cls3..SwitchMap.com.worklight.androidgap.plugin.Push.ACTION[action1.ordinal()])
                        {
                        default:
                            ctx.error((new StringBuilder()).append("Invalid action: ").append(action).toString());
                            return;

                        case 1: // '\001'
                            subscribe(args, ctx);
                            return;

                        case 2: // '\002'
                            ctx.success();
                            dispatch(args);
                            return;

                        case 3: // '\003'
                            ctx.success(deviceToken);
                            return;

                        case 4: // '\004'
                            WLConfig.getInstance().setInitComplete(true);
                            return;

                        case 5: // '\005'
                            sendUpstreamMessage(args);
                            break;
                        }
                        return;
                    } else
                    {
                        ctx.error("Null action");
                        return;
                    }
                }

            
            {
                this$0 = Push.this;
                action = s;
                args = jsonarray;
                ctx = callbackcontext;
                super();
            }
            });
            return true;
        }
    }

    public Context getContext()
    {
        return cordova.getActivity();
    }

    public String getErrorCode(String s)
    {
        return gcm.getErrorCode(s);
    }

    public GCMRetryWorker getGcmRetryWorker()
    {
        return gcmRetryWorker;
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        gcm = GCMClientFactory.getInstance(cordovainterface.getActivity());
        gcmRetryWorker = new GCMRetryWorker(this);
        validateGCMSetup();
        if (isGCMSetupValid)
        {
            unregisterReceivers();
            if (cordovainterface != null)
            {
                if (onMessageReceiver == null)
                {
                    onMessageReceiver = new BroadcastReceiver() {

                        final Push this$0;

                        public void onReceive(Context context, Intent intent)
                        {
                            boolean flag;
                            logger.debug("Push: Queuing message for dispatch to javascript");
                            flag = intent.getBooleanExtra("notificationBar", false);
                            context = pending;
                            context;
                            JVM INSTR monitorenter ;
                            intent = (com.worklight.wlclient.push.GCMIntentService.Message)intent.getParcelableExtra("message");
                            if (WLConfig.getInstance().isHybridActivityInForeground() && WLConfig.getInstance().isInitComplete())
                            {
                                logger.debug((new StringBuilder()).append("Push: App on foreground and init completed. Add message from intent to pending: ").append(intent).toString());
                                pending.add(intent);
                            }
                            if (!flag)
                            {
                                break MISSING_BLOCK_LABEL_110;
                            }
                            moveQueueToPending();
                            context;
                            JVM INSTR monitorexit ;
                            if (WLConfig.getInstance().isHybridActivityInForeground())
                            {
                                dispatchPending();
                            }
                            if (!flag)
                            {
                                setResultCode(-1);
                            }
                            return;
                            intent;
                            context;
                            JVM INSTR monitorexit ;
                            throw intent;
                        }

            
            {
                this$0 = Push.this;
                super();
            }
                    };
                }
                cordovainterface.getActivity().registerReceiver(onMessageReceiver, new IntentFilter((new StringBuilder()).append(WLUtils.getFullAppName(cordovainterface.getActivity())).append(".C2DM_MESSAGE").toString()));
                cordovainterface = (Activity)cordovainterface;
                if ((new StringBuilder()).append(WLUtils.getFullAppName(cordova.getActivity())).append(".NOTIFICATION").toString().equals(cordovainterface.getIntent().getAction()))
                {
                    logger.debug("Activity started from message notification");
                    cordovainterface.getIntent().putExtra("notificationBar", true);
                    onMessageReceiver.onReceive(cordova.getActivity(), cordovainterface.getIntent());
                }
            }
            dispatchPending();
        }
    }

    public void onDestroy()
    {
        unregisterReceivers();
        super.onDestroy();
    }

    public void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        if (intent != null && cordova != null)
        {
            logger.debug("onNewIntent: Set the new intent on the activity");
            cordova.getActivity().setIntent(intent);
        }
    }

    public void onReset()
    {
        logger.debug("Push service reset requested");
        gcm.reset();
        super.onReset();
    }

    public void onResume(boolean flag)
    {
label0:
        {
            super.onResume(flag);
            if (cordova != null && cordova.getActivity().getIntent() != null)
            {
                logger.info("onResume: There is an message handle from the intent");
                com.worklight.wlclient.push.GCMIntentService.Message message = (com.worklight.wlclient.push.GCMIntentService.Message)cordova.getActivity().getIntent().getParcelableExtra("message");
                if (message == null)
                {
                    break label0;
                }
                dispatchPending(message);
            }
            return;
        }
        if (GCMIntentService.intentsQueue.size() > 0)
        {
            logger.debug((new StringBuilder()).append("onResume: No message to handle from intent but there are ").append(GCMIntentService.intentsQueue.size()).append(" in the queue").toString());
            messageCallback = "WL.Client.Push.__onmessage";
            moveQueueToPending();
            dispatchPending();
            return;
        } else
        {
            logger.debug("onResume: No message to handle from intent");
            return;
        }
    }

    public void sendErrorMsg(String s, boolean flag)
    {
        Object obj;
        if (flag)
        {
            Object obj1 = ResourceBundle.getBundle("com/worklight/wlclient/messages", Locale.getDefault());
            try
            {
                obj = GCMErrorCode.valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                obj = GCMErrorCode.UNEXPECTED;
                logger.debug((new StringBuilder()).append("Push Service: additional information for unexpected error: ").append(s).toString());
            }
            obj1 = ((ResourceBundle) (obj1)).getString(((GCMErrorCode) (obj)).getDescription());
            obj = obj1;
            if (GCMErrorCode.INVALID_SENDER.toString().equals(s))
            {
                obj = (new StringBuilder()).append(((String) (obj1))).append("\nCheck the pushSender attributes in the application-descriptor.xml file. \nUsing a browser login into the 'Google APIs Console page' that will be used for sending push messages.\nThe 'Project Number' should be set as the pushSender 'senderId'.\nNavigate to the API Access tab. The 'API key for server apps' should be set as the pushSender 'key'.").toString();
            }
            logger.debug((new StringBuilder()).append(((String) (obj))).append(". Notifying javascript about unsuccessful registration to the GCM service.").toString());
        } else
        {
            obj = s;
        }
        s = new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, ((String) (obj)));
        s.setKeepCallback(false);
        registerContext.sendPluginResult(s);
    }

    public void sendToken(String s)
    {
        deviceToken = s;
        s = new PluginResult(org.apache.cordova.PluginResult.Status.OK, s);
        s.setKeepCallback(false);
        registerContext.sendPluginResult(s);
    }








}
