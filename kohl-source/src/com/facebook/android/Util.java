// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.android;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import com.facebook.internal.Utility;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook.android:
//            FacebookError

public final class Util
{

    private static final String UTF8 = "UTF-8";

    public Util()
    {
    }

    public static Bundle decodeUrl(String s)
    {
        Bundle bundle = new Bundle();
        if (s == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        s = s.split("&");
        j = s.length;
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as[] = s[i].split("=");
        if (as.length != 2) goto _L5; else goto _L4
_L4:
        bundle.putString(URLDecoder.decode(as[0], "UTF-8"), URLDecoder.decode(as[1], "UTF-8"));
          goto _L6
_L5:
        try
        {
            if (as.length == 1)
            {
                bundle.putString(URLDecoder.decode(as[0], "UTF-8"), "");
            }
        }
        catch (UnsupportedEncodingException unsupportedencodingexception) { }
          goto _L6
_L2:
        return bundle;
_L6:
        i++;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static String encodePostBody(Bundle bundle, String s)
    {
        if (bundle == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            Object obj = bundle.get(s1);
            if (obj instanceof String)
            {
                stringbuilder.append((new StringBuilder()).append("Content-Disposition: form-data; name=\"").append(s1).append("\"\r\n\r\n").append((String)obj).toString());
                stringbuilder.append((new StringBuilder()).append("\r\n--").append(s).append("\r\n").toString());
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String encodeUrl(Bundle bundle)
    {
        if (bundle == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        boolean flag = true;
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            if (bundle.get(s) instanceof String)
            {
                if (flag)
                {
                    flag = false;
                } else
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append((new StringBuilder()).append(URLEncoder.encode(s)).append("=").append(URLEncoder.encode(bundle.getString(s))).toString());
            }
        } while (true);
        return stringbuilder.toString();
    }

    public static String openUrl(String s, String s1, Bundle bundle)
        throws MalformedURLException, IOException
    {
        Object obj;
        obj = s;
        if (s1.equals("GET"))
        {
            obj = (new StringBuilder()).append(s).append("?").append(encodeUrl(bundle)).toString();
        }
        Utility.logd("Facebook-Util", (new StringBuilder()).append(s1).append(" URL: ").append(((String) (obj))).toString());
        s = (HttpURLConnection)(new URL(((String) (obj)))).openConnection();
        s.setRequestProperty("User-Agent", (new StringBuilder()).append(System.getProperties().getProperty("http.agent")).append(" FacebookAndroidSDK").toString());
        if (s1.equals("GET"))
        {
            break MISSING_BLOCK_LABEL_555;
        }
        obj = new Bundle();
        Iterator iterator = bundle.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s3 = (String)iterator.next();
            Object obj1 = bundle.get(s3);
            if (obj1 instanceof byte[])
            {
                ((Bundle) (obj)).putByteArray(s3, (byte[])(byte[])obj1);
            }
        } while (true);
        if (!bundle.containsKey("method"))
        {
            bundle.putString("method", s1);
        }
        if (bundle.containsKey("access_token"))
        {
            bundle.putString("access_token", URLDecoder.decode(bundle.getString("access_token")));
        }
        s.setRequestMethod("POST");
        s.setRequestProperty("Content-Type", (new StringBuilder()).append("multipart/form-data;boundary=").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").toString());
        s.setDoOutput(true);
        s.setDoInput(true);
        s.setRequestProperty("Connection", "Keep-Alive");
        s.connect();
        s1 = new BufferedOutputStream(s.getOutputStream());
        s1.write((new StringBuilder()).append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
        s1.write(encodePostBody(bundle, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
        s1.write((new StringBuilder()).append("\r\n").append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes());
        if (!((Bundle) (obj)).isEmpty())
        {
            for (bundle = ((Bundle) (obj)).keySet().iterator(); bundle.hasNext(); s1.write((new StringBuilder()).append("\r\n").append("--").append("3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").append("\r\n").toString().getBytes()))
            {
                String s2 = (String)bundle.next();
                s1.write((new StringBuilder()).append("Content-Disposition: form-data; filename=\"").append(s2).append("\"").append("\r\n").toString().getBytes());
                s1.write((new StringBuilder()).append("Content-Type: content/unknown").append("\r\n").append("\r\n").toString().getBytes());
                s1.write(((Bundle) (obj)).getByteArray(s2));
            }

        }
        break MISSING_BLOCK_LABEL_547;
        s;
        s1.close();
        throw s;
        s1.flush();
        s1.close();
        try
        {
            s1 = read(s.getInputStream());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return read(s.getErrorStream());
        }
        return s1;
    }

    public static JSONObject parseJson(String s)
        throws JSONException, FacebookError
    {
        if (s.equals("false"))
        {
            throw new FacebookError("request failed");
        }
        String s1 = s;
        if (s.equals("true"))
        {
            s1 = "{value : true}";
        }
        s = new JSONObject(s1);
        if (s.has("error"))
        {
            s = s.getJSONObject("error");
            throw new FacebookError(s.getString("message"), s.getString("type"), 0);
        }
        if (s.has("error_code") && s.has("error_msg"))
        {
            throw new FacebookError(s.getString("error_msg"), "", Integer.parseInt(s.getString("error_code")));
        }
        if (s.has("error_code"))
        {
            throw new FacebookError("request failed", "", Integer.parseInt(s.getString("error_code")));
        }
        if (s.has("error_msg"))
        {
            throw new FacebookError(s.getString("error_msg"));
        }
        if (s.has("error_reason"))
        {
            throw new FacebookError(s.getString("error_reason"));
        } else
        {
            return s;
        }
    }

    public static Bundle parseUrl(String s)
    {
        s = s.replace("fbconnect", "http");
        Bundle bundle;
        try
        {
            s = new URL(s);
            bundle = decodeUrl(s.getQuery());
            bundle.putAll(decodeUrl(s.getRef()));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new Bundle();
        }
        return bundle;
    }

    private static String read(InputStream inputstream)
        throws IOException
    {
        StringBuilder stringbuilder = new StringBuilder();
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream), 1000);
        for (String s = bufferedreader.readLine(); s != null; s = bufferedreader.readLine())
        {
            stringbuilder.append(s);
        }

        inputstream.close();
        return stringbuilder.toString();
    }

    public static void showAlert(Context context, String s, String s1)
    {
        context = new android.app.AlertDialog.Builder(context);
        context.setTitle(s);
        context.setMessage(s1);
        context.create().show();
    }
}
