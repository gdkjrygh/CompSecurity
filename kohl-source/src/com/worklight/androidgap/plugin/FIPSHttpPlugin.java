// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import android.util.Log;
import com.worklight.androidgap.fips.FipsHandler;
import com.worklight.common.Logger;
import com.worklight.common.WLConfig;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class FIPSHttpPlugin extends CordovaPlugin
{

    private static final String ERROR_MSG_JSON_KEY = "msg";
    private static final String ERROR_MSG_PREFIX = "An unrecoverable error has occurred: ";
    protected static boolean FIPS_ENABLED = false;
    private static FIPSHttpPlugin fipsHttpPlugin = null;
    private static final Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/FIPSHttpPlugin.getName());

    public FIPSHttpPlugin()
    {
    }

    private JSONObject createErrorResponse(String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("msg", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public static boolean isFipsEnabled()
    {
        return FIPS_ENABLED;
    }

    public static void resetCookies()
    {
        FipsHandler.getInstance(fipsHttpPlugin.cordova.getActivity()).resetCookies();
    }

    public boolean execute(String s, final JSONArray ctx, final CallbackContext callbackContext)
    {
        String s1 = System.getProperty("os.arch");
        logger.debug((new StringBuilder()).append("os.arch: ").append(s1).toString());
        if (s1 != null && !s1.toLowerCase().startsWith("armv7") && !s1.toLowerCase().startsWith("i") && !s1.toLowerCase().startsWith("aar") && !s1.toLowerCase().startsWith("x86"))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("FIPS feature is not supported on this architecture: ");
            ctx = s1;
            if (s1 == null)
            {
                ctx = "";
            }
            callbackContext.error(createErrorResponse(stringbuilder.append(ctx).toString()));
            logger.debug((new StringBuilder()).append("execute(").append(s).append(") returning false").toString());
            return false;
        }
        if ("enable".equals(s))
        {
            ctx = cordova.getActivity();
            cordova.getThreadPool().execute(new Runnable() {

                final FIPSHttpPlugin this$0;
                final CallbackContext val$callbackContext;
                final Context val$ctx;

                public void run()
                {
                    try
                    {
                        FipsHandler.getInstance(ctx);
                        FIPSHttpPlugin.FIPS_ENABLED = true;
                        callbackContext.success();
                        return;
                    }
                    catch (Throwable throwable)
                    {
                        FIPSHttpPlugin.logger.error("An unrecoverable error has occurred: ", throwable);
                        callbackContext.error(createErrorResponse((new StringBuilder()).append("An unrecoverable error has occurred: ").append(throwable.getLocalizedMessage()).toString()));
                        return;
                    }
                }

            
            {
                this$0 = FIPSHttpPlugin.this;
                ctx = context;
                callbackContext = callbackcontext;
                super();
            }
            });
            logger.debug((new StringBuilder()).append("execute(").append(s).append(") returning true").toString());
            return true;
        }
        if (!"send".equals(s)) goto _L2; else goto _L1
_L1:
        final String url;
        final Object headersFinal;
        headersFinal = WLConfig.getInstance().getRootURL();
        url = ctx.getString(0);
        JSONException jsonexception;
        final String httpMethod;
        if (!url.startsWith("http:") && !url.startsWith("https:"))
        {
            try
            {
                url = (new StringBuilder()).append(((String) (headersFinal))).append(ctx.getString(0)).toString();
            }
            // Misplaced declaration of an exception variable
            catch (final JSONArray ctx)
            {
                logger.error("An unrecoverable error has occurred: ", ctx);
                callbackContext.error(createErrorResponse((new StringBuilder()).append("An unrecoverable error has occurred: ").append(ctx.getLocalizedMessage()).toString()));
                logger.debug((new StringBuilder()).append("execute(").append(s).append(") returning false").toString());
                return false;
            }
        }
_L5:
        httpMethod = ctx.getString(1);
        headersFinal = ctx.getJSONObject(2);
_L3:
        ctx = ctx.getString(3);
        Log.d(com/worklight/androidgap/plugin/FIPSHttpPlugin.getName(), (new StringBuilder()).append("execute(").append(s).append("): calling FipsHandler.send in a thread with the following parameters").toString());
        Log.d(com/worklight/androidgap/plugin/FIPSHttpPlugin.getName(), (new StringBuilder()).append("url: ").append(url).toString());
        Log.d(com/worklight/androidgap/plugin/FIPSHttpPlugin.getName(), (new StringBuilder()).append("httpMethod: ").append(httpMethod).toString());
        Log.d(com/worklight/androidgap/plugin/FIPSHttpPlugin.getName(), (new StringBuilder()).append("headers: ").append(headersFinal).toString());
        Log.d(com/worklight/androidgap/plugin/FIPSHttpPlugin.getName(), (new StringBuilder()).append("data: ").append(ctx).toString());
        logger.debug((new StringBuilder()).append("execute(").append(s).append("): calling FipsHandler.send in a thread with the following parameters").toString());
        final android.app.Activity ctx = cordova.getActivity();
        cordova.getThreadPool().execute(new Runnable() {

            final FIPSHttpPlugin this$0;
            final CallbackContext val$callbackContext;
            final Context val$ctx;
            final String val$data;
            final JSONObject val$headersFinal;
            final String val$httpMethod;
            final String val$url;

            public void run()
            {
                try
                {
                    callbackContext.success(FipsHandler.getInstance(ctx).VPNWLSend(url, httpMethod, headersFinal, data));
                    return;
                }
                catch (Throwable throwable)
                {
                    FIPSHttpPlugin.logger.error("An unrecoverable error has occurred: ", throwable);
                    callbackContext.error(createErrorResponse((new StringBuilder()).append("An unrecoverable error has occurred: ").append(throwable.getLocalizedMessage()).toString()));
                    return;
                }
            }

            
            {
                this$0 = FIPSHttpPlugin.this;
                callbackContext = callbackcontext;
                ctx = context;
                url = s;
                httpMethod = s1;
                headersFinal = jsonobject;
                data = s2;
                super();
            }
        });
        return true;
        jsonexception;
        logger.error("headers could not be parsed.  Continuing with no headers.");
        jsonexception = new JSONObject();
          goto _L3
_L2:
        callbackContext.error(createErrorResponse((new StringBuilder()).append("Invalid action: ").append(s).toString()));
        logger.debug((new StringBuilder()).append("execute(").append(s).append(") returning false").toString());
        return false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void initialize(CordovaInterface cordovainterface, CordovaWebView cordovawebview)
    {
        super.initialize(cordovainterface, cordovawebview);
        fipsHttpPlugin = this;
    }



}
