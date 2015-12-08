// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient.api;

import android.content.Context;
import com.worklight.common.WLConfig;
import com.worklight.nativeandroid.common.WLUtils;
import com.worklight.wlclient.WLRequestListener;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.worklight.wlclient.api:
//            SecurityUtilsException, WLResponse, WLFailResponse, WLErrorCode

public class SecurityUtils
{

    private static final int CURRENT_VERSION = 1;
    public static final String CYPHER_TEXT_LABEL = "ct";
    private static final String ENCRYPTION_SOURCE = "java";
    public static final String ENCRYPTION_SOURCE_LABEL = "src";
    private static final int IV_BYTE_SIZE = 16;
    public static final String IV_LABEL = "iv";
    private static final int PBKDF2_LENGTH_BYTE_SIZE = 32;
    private static final String UTF_8 = "UTF-8";
    public static final String VERSION_LABEL = "v";

    public SecurityUtils()
    {
    }

    static URL buildURL(int i, WLConfig wlconfig)
        throws MalformedURLException
    {
        return new URL((new StringBuilder()).append(wlconfig.getRootURL()).append("/").append("apps/services/random").append("?bytes=").append(i).toString());
    }

    public static String decrypt(String s, JSONObject jsonobject)
        throws SecurityUtilsException
    {
        if (s == null || s.length() <= 0)
        {
            throw new SecurityUtilsException("Key cannot be null or empty.");
        }
        if (jsonobject == null || jsonobject.length() <= 0 || !jsonobject.has("ct") || !jsonobject.has("iv") || !jsonobject.has("src") || !jsonobject.has("v"))
        {
            throw new SecurityUtilsException("The given encrypted object is invalid or null.");
        }
        String s1;
        byte abyte0[];
        try
        {
            if (!jsonobject.getString("src").equals("java"))
            {
                throw new SecurityUtilsException("The encrypted object was generated in another environment. Cannot decrypt in this environment.");
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("There was a problem while decrypting. Make sure the given encryptedObject is valid.", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("There was a problem while adding properties to the returned JSONObject.", s);
        }
        s1 = jsonobject.getString("ct");
        jsonobject = jsonobject.getString("iv");
        abyte0 = WLUtils.hexStringToByteArray(s1);
        s = new String(initCipher(2, WLUtils.hexStringToByteArray(s), WLUtils.hexStringToByteArray(jsonobject)).doFinal(abyte0), "UTF-8");
        return s;
    }

    public static JSONObject encrypt(String s, String s1)
        throws SecurityUtilsException
    {
        if (s == null || s.length() <= 0)
        {
            throw new SecurityUtilsException("Key cannot be null or empty.");
        }
        if (s1 == null || s1.length() <= 0)
        {
            throw new SecurityUtilsException("Plain text cannot be null or empty.");
        }
        String s2 = getRandomString(16);
        try
        {
            s = initCipher(1, WLUtils.hexStringToByteArray(s), WLUtils.hexStringToByteArray(s2));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.", s);
        }
        try
        {
            s = s.doFinal(s1.getBytes());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.", s);
        }
        s = WLUtils.byteArrayToHexString(s);
        s1 = new JSONObject();
        try
        {
            s1.put("ct", s);
            s1.put("iv", s2);
            s1.put("src", "java");
            s1.put("v", 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("There was a problem while adding properties to the returned JSONObject.", s);
        }
        return s1;
    }

    public static String generateKey(String s, String s1, int i)
        throws SecurityUtilsException
    {
        return generateKey(s, s1, i, 32);
    }

    public static String generateKey(String s, String s1, int i, int j)
        throws SecurityUtilsException
    {
        if (s == null || s.length() <= 0)
        {
            throw new SecurityUtilsException("Password cannot be null or empty.");
        }
        if (s1 == null || s1.length() <= 0)
        {
            throw new SecurityUtilsException("Salt cannot be null or empty.");
        }
        if (i <= 0)
        {
            throw new SecurityUtilsException("Iterations must be greater than zero.");
        }
        if (j <= 0)
        {
            throw new SecurityUtilsException("Key length must be greater than zero.");
        }
        try
        {
            s = WLUtils.byteArrayToHexString(com.worklight.androidgap.jsonstore.security.SecurityUtils.generateKey(s, s1, i, j).getEncoded());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new SecurityUtilsException("Problem occured while encrypting. Make sure the given key is valid.");
        }
        return s;
    }

    private static WLConfig getConfig(Context context)
    {
        WLConfig wlconfig;
        try
        {
            wlconfig = WLConfig.getInstance();
        }
        catch (IllegalStateException illegalstateexception)
        {
            WLConfig.createInstance(context);
            return WLConfig.getInstance();
        }
        return wlconfig;
    }

    public static String getRandomString(int i)
    {
        return com.worklight.androidgap.jsonstore.security.SecurityUtils.encodeBytesAsHexString(com.worklight.androidgap.jsonstore.security.SecurityUtils.generateLocalKey(i));
    }

    public static void getRandomStringFromServer(int i, Context context, WLRequestListener wlrequestlistener)
    {
        (new Runnable(context, i, wlrequestlistener) {

            final int val$byteLength;
            final Context val$context;
            final WLRequestListener val$listener;

            public void run()
            {
                Object obj;
                obj = SecurityUtils.getConfig(context);
                obj = (HttpURLConnection)SecurityUtils.buildURL(byteLength, ((WLConfig) (obj))).openConnection();
                WLResponse wlresponse = new WLResponse(200, SecurityUtils.readRandomStringFromInputStream(((HttpURLConnection) (obj))), null);
                listener.onSuccess(wlresponse);
                Exception exception;
                try
                {
                    ((HttpURLConnection) (obj)).disconnect();
                    return;
                }
                catch (Throwable throwable)
                {
                    throwable = new WLFailResponse(WLErrorCode.UNEXPECTED_ERROR, throwable.getMessage(), null);
                }
                break MISSING_BLOCK_LABEL_78;
                exception;
                ((HttpURLConnection) (obj)).disconnect();
                throw exception;
                listener.onFailure(throwable);
                return;
            }

            
            {
                context = context1;
                byteLength = i;
                listener = wlrequestlistener;
                super();
            }
        }).run();
    }

    static Cipher initCipher(int i, byte abyte0[], byte abyte1[])
        throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException
    {
        abyte1 = new IvParameterSpec(abyte1);
        abyte0 = new SecretKeySpec(abyte0, "AES");
        Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        cipher.init(i, abyte0, abyte1);
        return cipher;
    }

    static String readRandomStringFromInputStream(HttpURLConnection httpurlconnection)
        throws IOException
    {
        BufferedReader bufferedreader;
        bufferedreader = new BufferedReader(new InputStreamReader(new BufferedInputStream(httpurlconnection.getInputStream())));
        httpurlconnection = "";
_L2:
        String s = bufferedreader.readLine();
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        httpurlconnection = (new StringBuilder()).append(httpurlconnection).append(s).toString();
        if (true) goto _L2; else goto _L1
_L1:
        bufferedreader.close();
        return httpurlconnection;
        httpurlconnection;
        bufferedreader.close();
        throw httpurlconnection;
    }

}
