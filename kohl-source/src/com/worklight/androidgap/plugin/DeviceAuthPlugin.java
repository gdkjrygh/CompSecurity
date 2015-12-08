// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.common.Logger;
import com.worklight.common.security.WLDeviceAuthManager;
import java.security.KeyStoreException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceAuthPlugin extends CordovaPlugin
{
    public static final class ACTION extends Enum
    {

        private static final ACTION $VALUES[];
        public static final ACTION clearDeviceCertCredentials;
        public static final ACTION getDeviceUUID;
        public static final ACTION init;
        public static final ACTION isCertificateExists;
        public static final ACTION saveCertificate;
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
            return (ACTION)Enum.valueOf(com/worklight/androidgap/plugin/DeviceAuthPlugin$ACTION, s);
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
            getDeviceUUID = new ACTION("getDeviceUUID", 5);
            clearDeviceCertCredentials = new ACTION("clearDeviceCertCredentials", 6);
            $VALUES = (new ACTION[] {
                init, isCertificateExists, signDeviceAuth, signCsr, saveCertificate, getDeviceUUID, clearDeviceCertCredentials
            });
        }

        private ACTION(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String RESULT_ERROR = "result:error";
    private static final int RSA_KEY_SIZE = 512;
    private static Logger logger = Logger.getInstance("DeviceAuthPlugin");

    public DeviceAuthPlugin()
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

    private String clearDeviceCertCredentials(JSONArray jsonarray)
    {
        try
        {
            jsonarray = jsonarray.getString(0);
            WLDeviceAuthManager.getInstance().removeEntityKeyStoreValues(jsonarray);
            jsonarray = (new JSONObject()).toString();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return "result:error";
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            return "result:error";
        }
        return jsonarray;
    }

    private String getDeviceUUID()
    {
        String s;
        try
        {
            s = WLDeviceAuthManager.getInstance().getDeviceUUID(cordova.getActivity());
        }
        catch (Exception exception)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform server failed, because device provisioning is unable to get device UUID with ").append(exception.getMessage()).toString(), exception);
            return "result:error";
        }
        return s;
    }

    private String init(JSONArray jsonarray)
    {
        WLDeviceAuthManager.getInstance().init(cordova.getActivity());
        return org.apache.cordova.PluginResult.Status.OK.name();
    }

    private String isIfCertificateExists(JSONArray jsonarray)
    {
        try
        {
            jsonarray = jsonarray.getString(0);
            jsonarray = Boolean.toString(WLDeviceAuthManager.getInstance().isCertificateExists(jsonarray));
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform server failed, because failed to check if the required certificate exists on the device with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    private String saveCertificate(JSONArray jsonarray)
    {
        try
        {
            String s = jsonarray.getString(0);
            String s1 = jsonarray.getString(1);
            jsonarray = jsonarray.getString(2);
            WLDeviceAuthManager.getInstance().saveCertificate(s, s1, jsonarray);
            jsonarray = org.apache.cordova.PluginResult.Status.OK.name();
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform server failed, because device provisioning is unable to save required certificate with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    private String signCsr(JSONArray jsonarray)
    {
        try
        {
            JSONObject jsonobject = jsonarray.getJSONObject(0);
            jsonarray = jsonarray.getString(1);
            WLDeviceAuthManager.getInstance().generateKeyPair(jsonarray, 512);
            jsonarray = WLDeviceAuthManager.getInstance().signCsr(jsonobject, jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform server failed, because device provisioning is unable sign CSR with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    private String signDeviceAuth(JSONArray jsonarray)
    {
        try
        {
            String s = jsonarray.getString(0);
            String s1 = jsonarray.getString(1);
            boolean flag = jsonarray.getBoolean(2);
            jsonarray = WLDeviceAuthManager.getInstance().signDeviceAuth(s, s1, flag);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            logger.error((new StringBuilder()).append("Authentication with MobileFirst Platform server failed, because device provisioning is unable to sign with current certificate with ").append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        ACTION action = ACTION.fromString(s);
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[];

            static 
            {
                $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION = new int[ACTION.values().length];
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.init.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.isCertificateExists.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.signDeviceAuth.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.signCsr.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.saveCertificate.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.getDeviceUUID.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$androidgap$plugin$DeviceAuthPlugin$ACTION[ACTION.clearDeviceCertCredentials.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        if (action != null)
        {
            switch (_cls1..SwitchMap.com.worklight.androidgap.plugin.DeviceAuthPlugin.ACTION[action.ordinal()])
            {
            default:
                callbackcontext.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
                return true;

            case 1: // '\001'
                return callback(init(jsonarray), callbackcontext);

            case 2: // '\002'
                return callback(isIfCertificateExists(jsonarray), callbackcontext);

            case 3: // '\003'
                return callback(signDeviceAuth(jsonarray), callbackcontext);

            case 4: // '\004'
                return callback(signCsr(jsonarray), callbackcontext);

            case 5: // '\005'
                return callback(saveCertificate(jsonarray), callbackcontext);

            case 6: // '\006'
                return callback(getDeviceUUID(), callbackcontext);

            case 7: // '\007'
                return callback(clearDeviceCertCredentials(jsonarray), callbackcontext);
            }
        } else
        {
            callbackcontext.error("Null action");
            return true;
        }
    }

}
