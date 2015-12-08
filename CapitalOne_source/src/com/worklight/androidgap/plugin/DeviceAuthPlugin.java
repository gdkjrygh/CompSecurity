// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import android.util.Log;
import com.worklight.androidgap.WLDroidGap;
import com.worklight.common.WLUtils;
import com.worklight.common.security.WLDeviceAuthManager;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;

public class DeviceAuthPlugin extends Plugin
{
    private static final class Command extends Enum
    {

        private static final Command ENUM$VALUES[];
        public static final Command createCSR;
        public static final Command createDeviceAuthHeader;
        public static final Command init;
        public static final Command isCertificateExists;
        public static final Command noValue;

        public static Command fromString(String s)
        {
            try
            {
                s = valueOf(s);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return noValue;
            }
            return s;
        }

        public static Command valueOf(String s)
        {
            return (Command)Enum.valueOf(com/worklight/androidgap/plugin/DeviceAuthPlugin$Command, s);
        }

        public static Command[] values()
        {
            Command acommand[] = ENUM$VALUES;
            int i = acommand.length;
            Command acommand1[] = new Command[i];
            System.arraycopy(acommand, 0, acommand1, 0, i);
            return acommand1;
        }

        static 
        {
            isCertificateExists = new Command("isCertificateExists", 0);
            createDeviceAuthHeader = new Command("createDeviceAuthHeader", 1);
            createCSR = new Command("createCSR", 2);
            init = new Command("init", 3);
            noValue = new Command("noValue", 4);
            ENUM$VALUES = (new Command[] {
                isCertificateExists, createDeviceAuthHeader, createCSR, init, noValue
            });
        }

        private Command(String s, int i)
        {
            super(s, i);
        }
    }


    private static int $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command[];
    private static final String RESULT_ERROR = "result:error";
    private String logCat;

    static int[] $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command()
    {
        int ai[] = $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[Command.values().length];
        try
        {
            ai[Command.createCSR.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[Command.createDeviceAuthHeader.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[Command.init.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[Command.isCertificateExists.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[Command.noValue.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command = ai;
        return ai;
    }

    public DeviceAuthPlugin()
    {
        logCat = "";
    }

    private PluginResult createCSR(JSONArray jsonarray)
    {
        try
        {
            String s = jsonarray.getString(0);
            String s1 = jsonarray.getString(1);
            jsonarray = jsonarray.getString(2);
            WLDeviceAuthManager.getInstance().createCSR(s, s1, jsonarray);
            jsonarray = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            WLUtils.error((new StringBuilder("Error occurred while trying to create CSR ")).append(jsonarray.getMessage()).toString(), jsonarray);
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR);
        }
        return jsonarray;
    }

    private String createDeviceAuthHeader(JSONArray jsonarray)
    {
        try
        {
            String s = jsonarray.getString(0);
            boolean flag = jsonarray.getBoolean(1);
            jsonarray = jsonarray.getString(2);
            s = WLDeviceAuthManager.getInstance().addDeviceIdAndAppId(WLDroidGap.getWLConfig(), s);
            jsonarray = WLDeviceAuthManager.getInstance().createDeviceAuthHeader(s, jsonarray, flag);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            WLUtils.error((new StringBuilder("Error occurred while trying to create JWS header ")).append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    private PluginResult init(JSONArray jsonarray)
    {
        WLDeviceAuthManager.getInstance().init((Activity)cordova, webView);
        return new PluginResult(org.apache.cordova.api.PluginResult.Status.OK);
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
            WLUtils.error((new StringBuilder("Error occurred while trying to check device authentication ")).append(jsonarray.getMessage()).toString(), jsonarray);
            return "result:error";
        }
        return jsonarray;
    }

    public void debug(String s)
    {
        Log.d(logCat, s);
    }

    public void error(String s)
    {
        Log.e(logCat, s);
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = "";
        $SWITCH_TABLE$com$worklight$androidgap$plugin$DeviceAuthPlugin$Command()[Command.fromString(s).ordinal()];
        JVM INSTR tableswitch 1 4: default 44
    //                   1 66
    //                   2 75
    //                   3 84
    //                   4 90;
           goto _L1 _L2 _L3 _L4 _L5
_L3:
        break MISSING_BLOCK_LABEL_75;
_L4:
        break MISSING_BLOCK_LABEL_84;
_L5:
        break MISSING_BLOCK_LABEL_90;
_L1:
        s = s1;
_L6:
        if (s.equals("result:error"))
        {
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR);
        } else
        {
            return new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, s);
        }
_L2:
        s = isIfCertificateExists(jsonarray);
          goto _L6
        s = createDeviceAuthHeader(jsonarray);
          goto _L6
        return createCSR(jsonarray);
        return init(jsonarray);
    }

    public boolean isSynch(String s)
    {
        return true;
    }
}
