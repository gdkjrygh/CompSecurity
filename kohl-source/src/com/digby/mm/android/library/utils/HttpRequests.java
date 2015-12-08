// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import android.content.Context;
import android.util.Log;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.digby.mm.android.library.utils:
//            Logger

public class HttpRequests
{

    public HttpRequests()
    {
    }

    public static JSONObject doPost(String s, String s1, boolean flag, String s2, Context context)
        throws MalformedURLException, IOException, JSONException
    {
        String s3;
        String s4;
        String s5;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        context = null;
        s4 = null;
        s5 = null;
        s3 = null;
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s.setRequestMethod("POST");
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s.setDoOutput(true);
        if (!flag) goto _L2; else goto _L1
_L1:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s.setRequestProperty("Content-Type", "application/json");
_L9:
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s.setRequestProperty("Authorization", s2);
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s.getOutputStream().write(s1.getBytes());
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        int i = s.getResponseCode();
        if (i >= 400) goto _L4; else goto _L3
_L3:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
_L7:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s2 = new StringBuffer();
_L6:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        String s6 = s1.readLine();
        if (s6 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s2.append(s6);
        if (true) goto _L6; else goto _L5
        s;
        context = s3;
        throw s;
        s;
        if (context != null)
        {
            context.disconnect();
        }
        throw s;
_L2:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
        continue; /* Loop/switch isn't completed */
        s;
        context = s4;
        throw s;
_L4:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s1 = new BufferedReader(new InputStreamReader(s.getErrorStream()));
          goto _L7
        s;
        context = s5;
        throw s;
_L5:
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        s1.close();
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        jsonobject.put("Response", s2.toString());
        s3 = s;
        context = s;
        s4 = s;
        s5 = s;
        jsonobject.put("ResponseCode", i);
        if (s != null)
        {
            s.disconnect();
        }
        return jsonobject;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public static JSONObject get(String s, String s1)
        throws MalformedURLException, IOException, JSONException
    {
        String s2;
        String s3;
        String s4;
        String s5;
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        s2 = null;
        s4 = null;
        s5 = null;
        s3 = null;
        s = (HttpURLConnection)(new URL(s)).openConnection();
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s.setRequestMethod("GET");
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s.setReadTimeout(10000);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s.setRequestProperty("Authorization", s1);
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s.connect();
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        int i = s.getResponseCode();
        if (i >= 400) goto _L2; else goto _L1
_L1:
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
_L5:
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        StringBuffer stringbuffer = new StringBuffer();
_L4:
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        String s6 = s1.readLine();
        if (s6 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        stringbuffer.append(s6);
        if (true) goto _L4; else goto _L3
        s;
        s2 = s3;
        throw s;
        s;
        if (s2 != null)
        {
            s2.disconnect();
        }
        throw s;
_L2:
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s1 = new BufferedReader(new InputStreamReader(s.getErrorStream()));
          goto _L5
        s;
        s2 = s4;
        throw s;
_L3:
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        s1.close();
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        jsonobject.put("Response", stringbuffer.toString());
        s3 = s;
        s2 = s;
        s4 = s;
        s5 = s;
        jsonobject.put("ResponseCode", i);
        if (s != null)
        {
            s.disconnect();
        }
        return jsonobject;
        s;
        s2 = s5;
        throw s;
          goto _L5
    }

    public static JSONObject post(String s, String s1, Context context)
    {
        try
        {
            s = doPost(s, s1, true, null, context);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Logger.Error("POST", s);
            Log.e("DigbyLibrary", Arrays.toString(s.getStackTrace()));
            return new JSONObject();
        }
        return s;
    }
}
