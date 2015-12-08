// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.Logger;
import com.worklight.common.security.WLUserAuthManager;
import java.security.KeyStoreException;
import java.util.concurrent.ExecutorService;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UserAuthPlugin extends CordovaPlugin
{
    public static final class ACTION extends Enum
    {

        private static final ACTION $VALUES[];
        public static final ACTION clean;
        public static final ACTION init;
        public static final ACTION isCertificateExists;
        public static final ACTION saveCertificate;
        public static final ACTION send;
        public static final ACTION signCsr;
        public static final ACTION signDeviceAuth;

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
            return (ACTION)Enum.valueOf(com/worklight/androidgap/plugin/UserAuthPlugin$ACTION, s);
        }

        public static ACTION[] values()
        {
            return (ACTION[])$VALUES.clone();
        }

        static 
        {
            init = new ACTION("init", 0);
            isCertificateExists = new ACTION("isCertificateExists", 1);
            signDeviceAuth = new ACTION("signDeviceAuth", 2);
            signCsr = new ACTION("signCsr", 3);
            saveCertificate = new ACTION("saveCertificate", 4);
            send = new ACTION("send", 5);
            clean = new ACTION("clean", 6);
            $VALUES = (new ACTION[] {
                init, isCertificateExists, signDeviceAuth, signCsr, saveCertificate, send, clean
            });
        }

        private ACTION(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String RESULT_ERROR = "result:error";
    private static final int RSA_KEY_SIZE = 2048;
    private static Logger logger = Logger.getInstance(com/worklight/androidgap/plugin/UserAuthPlugin.getName());
    private JSONObject httpsResult;

    public UserAuthPlugin()
    {
    }

    private boolean callback(String s, CallbackContext callbackcontext)
    {
        if ("result:error".equals(s))
        {
            callbackcontext.error(org.apache.cordova.PluginResult.Status.ERROR.name());
            return true;
        } else
        {
            callbackcontext.success(s);
            return true;
        }
    }

    private String emptyKeystore(JSONArray jsonarray)
    {
        try
        {
            WLUserAuthManager.getInstance().clearKeystore();
            jsonarray = (new JSONObject()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return "result:error";
        }
        return jsonarray;
    }

    private String init(JSONArray jsonarray)
    {
        WLUserAuthManager.getInstance().init(cordova.getActivity());
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private String isIfCertificateExists(JSONArray jsonarray)
    {
        try
        {
            jsonarray = Boolean.toString(WLUserAuthManager.getInstance().doesValidCertificateExist());
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform Server failed, because failed to check if the required certificate exists on the device with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    private String saveCertificate(JSONArray jsonarray)
    {
        try
        {
            String s = jsonarray.getString(0);
            jsonarray = jsonarray.getString(1);
            WLUserAuthManager.getInstance().saveCertificate(s, jsonarray);
            jsonarray = org.apache.cordova.PluginResult.Status.OK.name();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform Server failed, because device provisioning is unable to save required certificate with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    private String sendSignedHTTPSRequest(CallbackContext callbackcontext, JSONArray jsonarray)
    {
        try
        {
            httpsResult = WLUserAuthManager.getInstance().authenticateToTheServerWithCertificate();
            callbackcontext = httpsResult.toString();
        }
        // Misplaced declaration of an exception variable
        catch (CallbackContext callbackcontext)
        {
            logger.info((new StringBuilder()).append("Error sending signed HTTPS request with error \"").append(callbackcontext.getClass()).append("\": ").append(callbackcontext.getMessage()).toString());
            return "result:error";
        }
        return callbackcontext;
    }

    private String signCsr(JSONArray jsonarray)
    {
        try
        {
            jsonarray = jsonarray.getJSONObject(0);
            WLUserAuthManager.getInstance().generateKeyPair(2048);
            jsonarray = WLUserAuthManager.getInstance().createSignedCSR(jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with Work light server failed, because device provisioning is unable sign CSR with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    public boolean execute(String s, final JSONArray args, final CallbackContext ctx)
        throws JSONException
    {
        ACTION action = ACTION.fromString(s);
        static class _cls2
        {

            static final int $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[];

            static 
            {
                $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION = new int[ACTION.values().length];
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[ACTION.init.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[ACTION.isCertificateExists.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[ACTION.signCsr.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[ACTION.saveCertificate.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[ACTION.send.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$UserAuthPlugin$ACTION[ACTION.clean.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (action != null)
        {
            switch (_cls2..SwitchMap.com.worklight.androidgap.plugin.UserAuthPlugin.ACTION[action.ordinal()])
            {
            default:
                ctx.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
                return true;

            case 1: // '\001'
                return callback(init(args), ctx);

            case 2: // '\002'
                return callback(isIfCertificateExists(args), ctx);

            case 3: // '\003'
                return callback(signCsr(args), ctx);

            case 4: // '\004'
                return callback(saveCertificate(args), ctx);

            case 5: // '\005'
                cordova.getThreadPool().execute(new Runnable() {

                    final UserAuthPlugin this$0;
                    final JSONArray val$args;
                    final CallbackContext val$ctx;

                    public void run()
                    {
                        callback(sendSignedHTTPSRequest(ctx, args), ctx);
                    }

            
            {
                this$0 = UserAuthPlugin.this;
                ctx = callbackcontext;
                args = jsonarray;
                super();
            }
                });
                return true;

            case 6: // '\006'
                return callback(emptyKeystore(args), ctx);
            }
        } else
        {
            ctx.error("Null action");
            return true;
        }
    }



}
