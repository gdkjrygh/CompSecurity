// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.content.Context;
import android.util.Base64;
import com.worklight.common.security.AppAuthenticityToken;
import com.worklight.wlclient.api.SecurityUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SecurityPlugin extends CordovaPlugin
{
    public static abstract class ACTION extends Enum
    {

        private static final ACTION $VALUES[];
        public static final ACTION base64Decode;
        public static final ACTION base64Encode;
        public static final ACTION decrypt;
        public static final ACTION encrypt;
        public static final ACTION hashData;
        public static final ACTION keygen;
        public static final ACTION localRandomString;

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
            return (ACTION)Enum.valueOf(com/worklight/androidgap/plugin/SecurityPlugin$ACTION, s);
        }

        public static ACTION[] values()
        {
            return (ACTION[])$VALUES.clone();
        }

        protected abstract boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context);

        protected boolean executeError(ACTION action, CallbackContext callbackcontext, String s)
        {
            s = (new StringBuilder()).append("Action: ").append(action).append(" failed. ").append(s).toString();
            action = new JSONObject();
            try
            {
                action.put("msg", s);
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
            callbackcontext.error(action);
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
            keygen = new ACTION("keygen", 0) {

                public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
                {
                    try
                    {
                        callbackcontext.success(SecurityPlugin.generateKey(jsonarray));
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONArray jsonarray)
                    {
                        return executeError(SecurityPlugin.KEYGEN_ERROR, callbackcontext, jsonarray.getLocalizedMessage());
                    }
                    return true;
                }

            };
            encrypt = new ACTION("encrypt", 1) {

                public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
                {
                    try
                    {
                        callbackcontext.success(SecurityPlugin.encrypt(jsonarray));
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONArray jsonarray)
                    {
                        return executeError(SecurityPlugin.ENCRYPT_ERROR, callbackcontext, jsonarray.getLocalizedMessage());
                    }
                    return true;
                }

            };
            decrypt = new ACTION("decrypt", 2) {

                public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
                {
                    try
                    {
                        jsonarray = SecurityPlugin.decrypt(jsonarray).getBytes("UTF-8");
                        callbackcontext.sendPluginResult(new PluginResult(org.apache.cordova.PluginResult.Status.OK, jsonarray));
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONArray jsonarray)
                    {
                        return executeError(SecurityPlugin.DECRYPT_ERROR, callbackcontext, jsonarray.getLocalizedMessage());
                    }
                    return true;
                }

            };
            localRandomString = new ACTION("localRandomString", 3) {

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
            base64Encode = new ACTION("base64Encode", 4) {

                public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
                {
                    try
                    {
                        callbackcontext.success(new String(SecurityPlugin.base64Encode(jsonarray)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONArray jsonarray)
                    {
                        return executeError(base64Encode, callbackcontext, jsonarray.getLocalizedMessage());
                    }
                    return true;
                }

            };
            base64Decode = new ACTION("base64Decode", 5) {

                public boolean execute(JSONArray jsonarray, CallbackContext callbackcontext, Context context)
                {
                    try
                    {
                        callbackcontext.success(new String(SecurityPlugin.base64Decode(jsonarray)));
                    }
                    // Misplaced declaration of an exception variable
                    catch (JSONArray jsonarray)
                    {
                        return executeError(base64Decode, callbackcontext, jsonarray.getLocalizedMessage());
                    }
                    return true;
                }

            };
            hashData = new ACTION("hashData", 6) {

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
            $VALUES = (new ACTION[] {
                keygen, encrypt, decrypt, localRandomString, base64Encode, base64Decode, hashData
            });
        }

        private ACTION(String s, int i)
        {
            super(s, i);
        }

    }


    private static final int CURRENT_VERSION = 1;
    private static String DECRYPT_ERROR = "DECRYPT_ERROR";
    private static String EMPTY_CIPHER_TEXT_ERROR_MESSAGE = "Cannot decrypt empty/nil cipher";
    private static String EMPTY_IV_ERROR_MESSAGE = "Cannot encrypt with empty/nil iv";
    private static String EMPTY_KEY_ERROR_MESSAGE = "Cannot work with an empty/nil key";
    private static String EMPTY_PASSWORD_ERROR_MESSAGE = "Password cannot be nil/empty";
    private static String EMPTY_PLAIN_TEXT_ERROR_MESSAGE = "Cannot encrypt empty/nil plaintext";
    private static String EMPTY_SALT_ERROR_MESSAGE = "Salt cannot be nil/empty";
    private static final String ENCRYPTION_SOURCE = "java";
    private static String ENCRYPT_ERROR = "ENCRYPT_ERROR";
    private static String INVALID_SOURCE_ERROR_MESSAGE = "Cannot decrypt something not encrypted in this environment";
    private static String INVALID_VERSION_ERROR_MESSAGE = "Cannot decrypt something with that version";
    private static String KEYGEN_ERROR = "KEYGEN_ERROR";
    private static String NEGATIVE_ITERATIONS_ERROR_MESSAGE = "Number of iterations must greater than 0";

    public SecurityPlugin()
    {
    }

    private static byte[] base64Decode(String s)
        throws JSONException, UnsupportedEncodingException
    {
        return Base64.decode(s.getBytes("UTF-8"), 2);
    }

    private static byte[] base64Decode(JSONArray jsonarray)
        throws JSONException, UnsupportedEncodingException
    {
        return base64Decode(jsonarray.getString(0));
    }

    private static byte[] base64Encode(String s)
        throws JSONException, UnsupportedEncodingException
    {
        return Base64.encode(s.getBytes("UTF-8"), 2);
    }

    private static byte[] base64Encode(JSONArray jsonarray)
        throws JSONException, UnsupportedEncodingException
    {
        return base64Encode(jsonarray.getString(0));
    }

    private static String decrypt(JSONArray jsonarray)
        throws IllegalBlockSizeException, BadPaddingException, JSONException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, Exception
    {
        String s = jsonarray.getString(0);
        validateKey(s);
        String s1 = getCipherText(jsonarray);
        String s2 = getIV(jsonarray);
        String s3 = validateSource(jsonarray);
        jsonarray = getVersion(jsonarray);
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("ct", s1);
        jsonobject.put("iv", s2);
        jsonobject.put("src", s3);
        jsonobject.put("v", jsonarray);
        return SecurityUtils.decrypt(s, jsonobject);
    }

    private static String encrypt(JSONArray jsonarray)
        throws IllegalBlockSizeException, BadPaddingException, JSONException, InvalidKeyException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidAlgorithmParameterException, UnsupportedEncodingException, Exception
    {
        String s = jsonarray.getString(0);
        validateKey(s);
        String s1 = jsonarray.getString(1);
        validatePlainText(s1);
        jsonarray.getString(2);
        return SecurityUtils.encrypt(s, s1).toString();
    }

    private static String generateKey(JSONArray jsonarray)
        throws NoSuchAlgorithmException, JSONException, InvalidKeyException, InvalidKeySpecException, UnsupportedEncodingException, Exception
    {
        if (jsonarray.length() < 4)
        {
            throw new Exception("Invalid number of arguments.");
        } else
        {
            return SecurityUtils.generateKey(getPassword(jsonarray), getSalt(jsonarray), getIterations(jsonarray), getLength(jsonarray));
        }
    }

    private static String getCipherText(JSONArray jsonarray)
        throws JSONException, Exception
    {
        jsonarray = jsonarray.getString(1);
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            throw new Exception(EMPTY_CIPHER_TEXT_ERROR_MESSAGE);
        } else
        {
            return jsonarray;
        }
    }

    private static String getIV(JSONArray jsonarray)
        throws JSONException, Exception
    {
        jsonarray = jsonarray.getString(2);
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            throw new Exception(EMPTY_IV_ERROR_MESSAGE);
        } else
        {
            return jsonarray;
        }
    }

    private static int getIterations(JSONArray jsonarray)
        throws JSONException, Exception
    {
        jsonarray = jsonarray.getString(2);
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            throw new Exception(NEGATIVE_ITERATIONS_ERROR_MESSAGE);
        }
        int i;
        try
        {
            i = Integer.parseInt(jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            i = -1;
        }
        if (i <= 0)
        {
            throw new Exception(NEGATIVE_ITERATIONS_ERROR_MESSAGE);
        } else
        {
            return i;
        }
    }

    private static int getLength(JSONArray jsonarray)
        throws JSONException, Exception
    {
        jsonarray = jsonarray.getString(3);
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            throw new Exception("Length cannot be 0 or less.");
        }
        int i;
        try
        {
            i = Integer.parseInt(jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            i = -1;
        }
        if (i <= 0)
        {
            throw new Exception("Length cannot be 0 or less.");
        } else
        {
            return i;
        }
    }

    private static String getPassword(JSONArray jsonarray)
        throws JSONException, Exception
    {
        jsonarray = jsonarray.getString(0);
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            throw new Exception(EMPTY_PASSWORD_ERROR_MESSAGE);
        } else
        {
            return jsonarray;
        }
    }

    private static String getSalt(JSONArray jsonarray)
        throws JSONException, Exception
    {
        jsonarray = jsonarray.getString(1);
        if (jsonarray == null || jsonarray.length() <= 0)
        {
            throw new Exception(EMPTY_SALT_ERROR_MESSAGE);
        } else
        {
            return jsonarray;
        }
    }

    private static String getVersion(JSONArray jsonarray)
        throws Exception
    {
        try
        {
            jsonarray = jsonarray.getString(4);
        }
        // Misplaced declaration of an exception variable
        catch (JSONArray jsonarray)
        {
            jsonarray = "1";
        }
        validateVersion(jsonarray);
        return jsonarray;
    }

    private static void validateKey(String s)
        throws Exception
    {
        if (s == null || s.length() <= 0)
        {
            throw new Exception(EMPTY_KEY_ERROR_MESSAGE);
        } else
        {
            return;
        }
    }

    private static void validatePlainText(String s)
        throws Exception
    {
        if (s == null || s.length() <= 0)
        {
            throw new Exception(EMPTY_PLAIN_TEXT_ERROR_MESSAGE);
        } else
        {
            return;
        }
    }

    private static String validateSource(JSONArray jsonarray)
        throws Exception
    {
        jsonarray = jsonarray.getString(3);
        Object obj;
        obj = jsonarray;
        if (jsonarray != null)
        {
            obj = jsonarray;
            if (!jsonarray.equalsIgnoreCase("java"))
            {
                throw new Exception(INVALID_SOURCE_ERROR_MESSAGE);
            }
        }
        break MISSING_BLOCK_LABEL_38;
        jsonarray;
        obj = "java";
        return ((String) (obj));
    }

    private static void validateVersion(String s)
        throws Exception
    {
        String s1;
label0:
        {
            if (s != null)
            {
                s1 = s;
                if (s.length() > 0)
                {
                    break label0;
                }
            }
            s1 = "1";
        }
        int i;
        try
        {
            i = Integer.parseInt(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new Exception(INVALID_VERSION_ERROR_MESSAGE);
        }
        if (i > 1 || i <= 0)
        {
            throw new Exception(INVALID_VERSION_ERROR_MESSAGE);
        } else
        {
            return;
        }
    }

    public boolean execute(String s, JSONArray jsonarray, CallbackContext callbackcontext)
        throws JSONException
    {
        ACTION action = ACTION.fromString(s);
        if (action != null)
        {
            if (cordova != null)
            {
                s = cordova.getActivity();
            } else
            {
                s = null;
            }
            return action.execute(jsonarray, callbackcontext, s);
        } else
        {
            callbackcontext.error((new StringBuilder()).append("Invalid action: ").append(s).toString());
            return true;
        }
    }









}
