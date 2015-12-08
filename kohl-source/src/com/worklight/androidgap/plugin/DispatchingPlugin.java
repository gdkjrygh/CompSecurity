// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.jsonstore.types.ActionDispatcher;
import com.worklight.common.Logger;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;

public abstract class DispatchingPlugin extends CordovaPlugin
{
    private class ActionDispatcherRunnable
        implements Runnable
    {

        private String actionName;
        private JSONArray args;
        private CallbackContext callbackContext;
        private ActionDispatcher dispatcher;
        final DispatchingPlugin this$0;

        public void run()
        {
            DispatchingPlugin.logger.trace((new StringBuilder()).append("dispatching action \"").append(actionName).append("\"").toString());
            PluginResult pluginresult;
            if (dispatcher == null)
            {
                try
                {
                    callbackContext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, (new StringBuilder()).append("unable to dispatch action \"").append(actionName).append("\"").toString()));
                }
                catch (Exception exception)
                {
                    DispatchingPlugin.logger.error("Could not send plugin result because of an exception");
                }
            }
            try
            {
                pluginresult = dispatcher.dispatch(args);
            }
            catch (Throwable throwable)
            {
                DispatchingPlugin.logger.error((new StringBuilder()).append("error while dispatching action \"").append(dispatcher.getName()).append("\"").toString(), throwable);
                throwable = new PluginResult(org.apache.cordova.PluginResult.Status.ERROR, throwable.getMessage());
            }
            try
            {
                callbackContext.sendPluginResult(pluginresult);
                return;
            }
            catch (Exception exception1)
            {
                DispatchingPlugin.logger.error("error while sending plugin result to Javascript", exception1);
            }
        }

        private ActionDispatcherRunnable(ActionDispatcher actiondispatcher, JSONArray jsonarray, CallbackContext callbackcontext, String s)
        {
            this$0 = DispatchingPlugin.this;
            super();
            args = jsonarray;
            callbackContext = callbackcontext;
            dispatcher = actiondispatcher;
            actionName = s;
        }

    }


    private static final Executor executor = Executors.newFixedThreadPool(1);
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/DispatchingPlugin.getName());
    private final HashMap dispatchers = new HashMap();

    public DispatchingPlugin()
    {
    }

    protected void addDispatcher(ActionDispatcher actiondispatcher)
    {
        dispatchers.put(actiondispatcher.getName(), actiondispatcher);
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
    {
        ActionDispatcher actiondispatcher = (ActionDispatcher)dispatchers.get(s);
        executor.execute(new ActionDispatcherRunnable(actiondispatcher, jsonarray, callbackcontext, s));
        return true;
    }


}
