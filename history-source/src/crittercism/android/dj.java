// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URLConnection;
import java.security.GeneralSecurityException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            di, dc, cw, dx, 
//            cy

public class dj extends di
{

    private static final String a = crittercism/android/dj.getName();
    private cw b;
    private dc c;
    private boolean d;
    private cy e;

    public dj(cw cw1, dc dc1, cy cy1)
    {
        this(cw1, dc1, false, cy1);
    }

    public dj(cw cw1, dc dc1, boolean flag, cy cy1)
    {
        b = cw1;
        c = dc1;
        d = flag;
        e = cy1;
    }

    public final void a()
    {
        Object obj;
        Object obj1 = null;
        HttpURLConnection httpurlconnection;
        Object obj2;
        int i;
        int j;
        boolean flag;
        try
        {
            httpurlconnection = c.a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        if (httpurlconnection != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        b.a(httpurlconnection.getOutputStream());
        i = httpurlconnection.getResponseCode();
        if (!d)
        {
            break MISSING_BLOCK_LABEL_316;
        }
        obj = new StringBuilder();
        obj2 = new BufferedReader(new InputStreamReader(httpurlconnection.getInputStream()));
_L5:
        j = ((BufferedReader) (obj2)).read();
        if (j == -1) goto _L4; else goto _L3
_L3:
        ((StringBuilder) (obj)).append((char)j);
          goto _L5
        obj;
_L11:
        obj2 = a;
        (new StringBuilder("UnsupportedEncodingException in proceed(): ")).append(((UnsupportedEncodingException) (obj)).getMessage());
        dx.b();
        dx.c();
        flag = false;
        obj = obj1;
_L7:
        httpurlconnection.disconnect();
        if (e == null) goto _L1; else goto _L6
_L6:
        e.a(flag, i, ((JSONObject) (obj)));
        return;
_L4:
        ((BufferedReader) (obj2)).close();
        obj = new JSONObject(((StringBuilder) (obj)).toString());
_L12:
        flag = false;
          goto _L7
        obj;
        i = -1;
_L10:
        obj2 = a;
        (new StringBuilder("SocketTimeoutException in proceed(): ")).append(((SocketTimeoutException) (obj)).getMessage());
        dx.b();
        flag = true;
        obj = obj1;
          goto _L7
        obj;
        i = -1;
_L9:
        obj2 = a;
        (new StringBuilder("IOException in proceed(): ")).append(((IOException) (obj)).getMessage());
        dx.b();
        dx.c();
        flag = false;
        obj = obj1;
          goto _L7
        obj;
        i = -1;
_L8:
        obj2 = a;
        (new StringBuilder("JSONException in proceed(): ")).append(((JSONException) (obj)).getMessage());
        dx.b();
        flag = false;
        dx.c();
        obj = obj1;
          goto _L7
        obj;
          goto _L8
        obj;
          goto _L9
        obj;
          goto _L10
        obj;
        i = -1;
          goto _L11
        obj = null;
          goto _L12
    }

}
