// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction.validators;

import com.fitbit.d.a;
import com.fitbit.data.bl.exceptions.ApplicationBackedOffException;
import com.fitbit.data.bl.exceptions.MobileTrackBackOffException;
import com.fitbit.data.bl.exceptions.RateLimitException;
import com.fitbit.data.bl.exceptions.SynclairBackOffException;
import com.fitbit.serverinteraction.ServerGateway;
import com.fitbit.serverinteraction.n;
import com.fitbit.serverinteraction.o;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class d
{

    private static final String a = "ServerErrorsChecker";
    private static final String b = "n/a";
    private static final String c = "503";
    private static final String d = "errors";
    private static final String e = "fieldName";
    private static final String f = "errorType";
    private static final String g = "message";
    private static final String h = "request";
    private static final String i = "Retry-After";
    private static final long j = 0x1b7740L;

    d()
    {
    }

    public static MobileTrackBackOffException a(JSONObject jsonobject, int k, HttpURLConnection httpurlconnection)
    {
        if (jsonobject != null || k == 503) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        if (!"503".equals(com.fitbit.d.a.a(jsonobject, "fieldName"))) goto _L1; else goto _L3
_L3:
        String s;
        s = com.fitbit.d.a.a(jsonobject, "message");
        k = httpurlconnection.getHeaderFieldInt("Retry-After", -1);
        if (k == -1)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        return new MobileTrackBackOffException(com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.a, s, k);
        httpurlconnection = new MobileTrackBackOffException(com.fitbit.data.bl.exceptions.MobileTrackBackOffException.BackOffType.a, s);
        return httpurlconnection;
        httpurlconnection;
        com.fitbit.e.a.f("ServerErrorsChecker", (new StringBuilder()).append("Unable to parse JSON: ").append(jsonobject.toString()).toString(), httpurlconnection, new Object[0]);
        return null;
    }

    public static RateLimitException a(HttpURLConnection httpurlconnection)
        throws IOException
    {
        if (httpurlconnection.getResponseCode() != 429)
        {
            return null;
        } else
        {
            return new RateLimitException(b(httpurlconnection));
        }
    }

    public static SynclairBackOffException a(int k, HttpURLConnection httpurlconnection)
    {
        if (k < 500 || k > 599)
        {
            return null;
        }
        int l = httpurlconnection.getHeaderFieldInt("Retry-After", -1);
        if (k == 503 && l != -1)
        {
            return new SynclairBackOffException(l);
        } else
        {
            return new SynclairBackOffException();
        }
    }

    public static boolean a(n n1, int k)
        throws ApplicationBackedOffException
    {
        if (k == 409) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if ((n1 = n1.getEntity()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        JSONObject jsonobject;
        int l;
        boolean flag;
        try
        {
            n1 = new JSONObject(new String(EntityUtils.toByteArray(n1)));
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            com.fitbit.e.a.f("ServerErrorsChecker", "Unable to parse JSON", n1, new Object[0]);
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            com.fitbit.e.a.f("ServerErrorsChecker", "Unable to parse JSON", n1, new Object[0]);
            return false;
        }
        if (n1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        n1 = n1.optJSONArray("errors");
        if (n1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l = 0;
_L4:
        if (l >= n1.length())
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonobject = n1.getJSONObject(l);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_86;
        }
        flag = a(jsonobject, k);
        if (flag)
        {
            return true;
        }
        l++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean a(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getString("fieldName");
        return jsonobject != null && jsonobject.equals("oauth_timestamp");
    }

    public static boolean a(JSONObject jsonobject, int k)
        throws JSONException
    {
        while (k != 409 || !"n/a".equals(jsonobject.getString("fieldName")) || !jsonobject.has("errorType") || !jsonobject.getString("errorType").equals("request")) 
        {
            return false;
        }
        return true;
    }

    private static long b(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection != null)
        {
            long l = (long)httpurlconnection.getHeaderFieldInt("Retry-After", -1) * 1000L;
            if (l >= 0L && l < 0x1b7740L)
            {
                return l;
            } else
            {
                return 0x1b7740L;
            }
        } else
        {
            return ServerGateway.a().c().a();
        }
    }

    public static boolean b(JSONObject jsonobject)
        throws JSONException
    {
        jsonobject = jsonobject.getString("fieldName");
        return jsonobject != null && jsonobject.equals("oauth_access_token");
    }
}
