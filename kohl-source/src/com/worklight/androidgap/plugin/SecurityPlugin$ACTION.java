// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import com.worklight.common.security.AppAuthenticityToken;
import com.worklight.wlclient.api.SecurityUtils;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.androidgap.plugin:
//            SecurityPlugin

public static abstract class <init> extends Enum
{

    private static final hashData $VALUES[];
    public static final hashData base64Decode;
    public static final hashData base64Encode;
    public static final hashData decrypt;
    public static final hashData encrypt;
    public static final hashData hashData;
    public static final hashData keygen;
    public static final hashData localRandomString;

    public static <init> fromString(String s)
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

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(com/worklight/androidgap/plugin/SecurityPlugin$ACTION, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    protected abstract boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context);

    protected boolean executeError(N_3B_.clone clone, CallbackContext callbackcontext, String s)
    {
        s = (new StringBuilder()).append("Action: ").append(clone).append(" failed. ").append(s).toString();
        clone = new JSONObject();
        try
        {
            clone.put("msg", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        callbackcontext.error(clone);
        return true;
    }

    protected boolean executeError(String s, CallbackContext callbackcontext, String s1)
    {
        s1 = (new StringBuilder()).append(s).append(" = ").append(s1).toString();
        s = new JSONObject();
        try
        {
            s.put("msg", s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        callbackcontext.error(s);
        return true;
    }

    static 
    {
        keygen = new SecurityPlugin.ACTION("keygen", 0) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    callbackcontext.success(SecurityPlugin.access$100(jsonarray));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(SecurityPlugin.access$200(), callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        encrypt = new SecurityPlugin.ACTION("encrypt", 1) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    callbackcontext.success(SecurityPlugin.access$300(jsonarray));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(SecurityPlugin.access$400(), callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        decrypt = new SecurityPlugin.ACTION("decrypt", 2) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    jsonarray = SecurityPlugin.access$500(jsonarray).getBytes("UTF-8");
                    callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, jsonarray));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(SecurityPlugin.access$600(), callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        localRandomString = new SecurityPlugin.ACTION("localRandomString", 3) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    callbackcontext.success(SecurityUtils.getRandomString(jsonarray.getInt(0)));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(localRandomString, callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        base64Encode = new SecurityPlugin.ACTION("base64Encode", 4) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    callbackcontext.success(new String(SecurityPlugin.access$700(jsonarray)));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(base64Encode, callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        base64Decode = new SecurityPlugin.ACTION("base64Decode", 5) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    callbackcontext.success(new String(SecurityPlugin.access$800(jsonarray)));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(base64Decode, callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        hashData = new SecurityPlugin.ACTION("hashData", 6) {

            public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
            {
                try
                {
                    callbackcontext.success((new AppAuthenticityToken()).a1(context, jsonarray.getString(0)));
                }
                // Misplaced declaration of an exception variable
                catch (JSONArray jsonarray)
                {
                    return executeError(hashData, callbackcontext, jsonarray.getLocalizedMessage());
                }
                return true;
            }

        };
        $VALUES = (new .VALUES[] {
            keygen, encrypt, decrypt, localRandomString, base64Encode, base64Decode, hashData
        });
    }

    private _cls7(String s, int i)
    {
        super(s, i);
    }

    _cls7(String s, int i, _cls7 _pcls7)
    {
        this(s, i);
    }
}
