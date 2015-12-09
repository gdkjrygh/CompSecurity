// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import android.app.Activity;
import com.worklight.common.WLUtils;
import com.worklight.utils.Base64;
import com.worklight.utils.SecurityUtils;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.apache.cordova.api.CordovaInterface;
import org.apache.cordova.api.Plugin;
import org.apache.cordova.api.PluginResult;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class SecurityPlugin extends Plugin
{

    protected static final String ACTION_DECRYPT = "decrypt";
    protected static final String ACTION_ENCRYPT = "encrypt";
    protected static final String ACTION_HASH_DATA = "hashData";
    protected static final String ACTION_KEYGEN = "keygen";
    private Activity myactivity;

    public SecurityPlugin()
    {
        myactivity = null;
    }

    private byte[] decrypt(JSONArray jsonarray)
        throws Exception, IllegalBlockSizeException, BadPaddingException
    {
        String s = jsonarray.getString(0);
        String s1 = jsonarray.getString(1);
        jsonarray = jsonarray.getString(2);
        return initCipher(2, WLUtils.hexStringToByteArray(s), WLUtils.hexStringToByteArray(jsonarray)).doFinal(WLUtils.hexStringToByteArray(s1));
    }

    private String encrypt(JSONArray jsonarray)
        throws Exception, IllegalBlockSizeException, BadPaddingException
    {
        String s = jsonarray.getString(0);
        Object obj = jsonarray.getString(1);
        jsonarray = jsonarray.getString(2);
        byte abyte0[] = initCipher(1, WLUtils.hexStringToByteArray(s), WLUtils.hexStringToByteArray(jsonarray)).doFinal(((String) (obj)).getBytes());
        obj = new JSONObject();
        ((JSONObject) (obj)).put("ct", WLUtils.byteArrayToHexString(abyte0));
        ((JSONObject) (obj)).put("iv", jsonarray);
        return ((JSONObject) (obj)).toString();
    }

    private byte[] generateKey(JSONArray jsonarray)
        throws NoSuchAlgorithmException, JSONException, InvalidKeyException, InvalidKeySpecException, UnsupportedEncodingException
    {
        String s = jsonarray.getString(0);
        String s1 = jsonarray.getString(1);
        int i = Integer.parseInt(jsonarray.getString(2));
        int j = Integer.parseInt(jsonarray.getString(3));
        return com.worklight.utils.SecurityUtils.PBKDF2.genKey(s.toCharArray(), s1.getBytes("UTF-8"), i, j).getEncoded();
    }

    private static Cipher initCipher(int i, byte abyte0[], byte abyte1[])
        throws Exception
    {
        abyte1 = new IvParameterSpec(abyte1);
        abyte0 = new SecretKeySpec(abyte0, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, abyte0, abyte1);
        return cipher;
    }

    public PluginResult execute(String s, JSONArray jsonarray, String s1)
    {
        s1 = null;
        if (s.equals("keygen"))
        {
            s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, WLUtils.byteArrayToHexString(generateKey(jsonarray)));
            break MISSING_BLOCK_LABEL_293;
        }
        if (s.equals("encrypt"))
        {
            s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, encrypt(jsonarray));
            break MISSING_BLOCK_LABEL_293;
        }
        if (s.equals("decrypt"))
        {
            s = new String(decrypt(jsonarray));
            s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, s);
            break MISSING_BLOCK_LABEL_293;
        }
        if (!s.equals("hashData"))
        {
            break MISSING_BLOCK_LABEL_293;
        }
        s = ((String)jsonarray.get(0)).split(",")[0];
        jsonarray = (JSONArray)jsonarray.get(1);
        s1 = new ArrayList();
        int i = 0;
_L1:
        if (i < jsonarray.length())
        {
            break MISSING_BLOCK_LABEL_247;
        }
        jsonarray = Base64.encode(SecurityUtils.kpg(myactivity, (String[])s1.toArray(new String[0])), "UTF-8").replaceAll("\n", "");
        s = new PluginResult(org.apache.cordova.api.PluginResult.Status.OK, SecurityUtils.hashData((new StringBuilder(String.valueOf(s.trim()))).append(jsonarray).toString(), "SHA-1"));
        return s;
        s;
        WLUtils.error(s.getMessage(), s);
        s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.JSON_EXCEPTION);
        break MISSING_BLOCK_LABEL_293;
        s1.add(jsonarray.getString(i));
        i++;
          goto _L1
        s;
        WLUtils.error(s.getMessage(), s);
        s1 = new PluginResult(org.apache.cordova.api.PluginResult.Status.ERROR, s.getMessage());
        return s1;
    }

    public void setContext(CordovaInterface cordovainterface)
    {
        myactivity = (Activity)cordovainterface;
    }
}
