// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.actionsender.WLAction;
import com.worklight.androidgap.actionsender.WLActionSender;
import com.worklight.common.Logger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLActionReceiverWithCallbackcontext

public class WLActionSenderPlugin extends CordovaPlugin
{

    private static final String ACTION_ADD_ACTION_RECEIVER = "addActionReceiver";
    private static final String ACTION_REMOVE_ACTION_RECEIVER = "removeActionReceiver";
    private static final String ACTION_SEND_ACTION_TO_NATIVE = "sendActionToNative";
    private static Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/WLActionSenderPlugin.getName());
    private HashMap actionReceivers;

    public WLActionSenderPlugin()
    {
    }

    private void doAddActionReceiver(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        logger.debug("doAddActionReceiver");
        String s = jsonarray.getString(0);
        if (jsonarray.isNull(1))
        {
            jsonarray = null;
        } else
        {
            jsonarray = jsonarray.getString(1);
        }
        removeActionReceiverIfExists(s);
        logger.debug((new StringBuilder()).append("Adding receiver :: ").append(s).append(", tag :: ").append(jsonarray).toString());
        callbackcontext = new WLActionReceiverWithCallbackcontext(callbackcontext);
        WLActionSender.getInstance().addActionReceiver(callbackcontext, true, jsonarray);
        actionReceivers.put(s, callbackcontext);
    }

    private void doRemoveActionReceiver(JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        logger.debug("doRemoveActionReceiver");
        removeActionReceiverIfExists(jsonarray.getString(0));
        callbackcontext.success();
    }

    private void doSendActionToNative(String s, JSONObject jsonobject, String s1, CallbackContext callbackcontext)
    {
        s = new WLAction(s, jsonobject, s1);
        WLActionSender.getInstance().sendActionToNative(s);
        callbackcontext.success();
    }

    private void removeActionReceiverIfExists(String s)
    {
        if (actionReceivers.containsKey(s))
        {
            logger.debug((new StringBuilder()).append("Receiver :: ").append(s).append(" found. Removing.").toString());
            s = (WLActionReceiverWithCallbackcontext)actionReceivers.get(s);
            WLActionSender.getInstance().removeActionReceiver(s, true);
            s.releaseCallbackContext();
            actionReceivers.remove(s);
            return;
        } else
        {
            logger.debug((new StringBuilder()).append("Receiver :: ").append(s).append(" not found. Nothing to remove.").toString());
            return;
        }
    }

    public boolean execute(String s, final JSONArray args, final CallbackContext callbackContext)
        throws JSONException
    {
        if ("addActionReceiver".equals(s))
        {
            doAddActionReceiver(args, callbackContext);
            return true;
        }
        if ("removeActionReceiver".equals(s))
        {
            doRemoveActionReceiver(args, callbackContext);
            return true;
        }
        if ("sendActionToNative".equals(s))
        {
            cordova.getThreadPool().execute(new Runnable() {

                final WLActionSenderPlugin this$0;
                final JSONArray val$args;
                final CallbackContext val$callbackContext;

                public void run()
                {
                    String s1 = null;
                    String s2 = args.getString(0);
                    JSONObject jsonobject;
                    if (args.isNull(1))
                    {
                        jsonobject = null;
                    } else
                    {
                        try
                        {
                            jsonobject = args.getJSONObject(1);
                        }
                        catch (JSONException jsonexception)
                        {
                            callbackContext.error("sendActionToNative - Error parsing data");
                            return;
                        }
                    }
                    if (!args.isNull(2))
                    {
                        break MISSING_BLOCK_LABEL_62;
                    }
_L1:
                    doSendActionToNative(s2, jsonobject, s1, callbackContext);
                    return;
                    s1 = args.getString(2);
                      goto _L1
                }

            
            {
                this$0 = WLActionSenderPlugin.this;
                args = jsonarray;
                callbackContext = callbackcontext;
                super();
            }
            });
            return true;
        } else
        {
            logger.debug("execute :: method not found");
            return false;
        }
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        actionReceivers = new HashMap();
    }

    public void onDestroy()
    {
        logger.debug("onDestroy");
        for (Iterator iterator = actionReceivers.keySet().iterator(); iterator.hasNext(); removeActionReceiverIfExists((String)iterator.next())) { }
        super.onDestroy();
    }


}
