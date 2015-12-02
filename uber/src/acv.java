// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class acv
    implements acu
{

    private final Context a;
    private final VersionInfoParcel b;

    public acv(Context context, VersionInfoParcel versioninfoparcel)
    {
        a = context;
        b = versioninfoparcel;
    }

    private static acx a(JSONObject jsonobject)
    {
        String s = jsonobject.optString("http_request_id");
        Object obj = jsonobject.optString("url");
        String s1 = jsonobject.optString("post_body", null);
        JSONArray jsonarray;
        ArrayList arraylist;
        try
        {
            obj = new URL(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            of.b("Error constructing http request.", ((Throwable) (obj)));
            obj = null;
        }
        arraylist = new ArrayList();
        jsonarray = jsonobject.optJSONArray("headers");
        jsonobject = jsonarray;
        if (jsonarray == null)
        {
            jsonobject = new JSONArray();
        }
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.optJSONObject(i);
            if (jsonobject1 != null)
            {
                arraylist.add(new acw(jsonobject1.optString("key"), jsonobject1.optString("value")));
            }
        }

        return new acx(s, ((URL) (obj)), arraylist, s1);
    }

    private acy a(acx acx1)
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = (HttpURLConnection)acx1.b().openConnection();
            ot.e().a(a, b.b, false, httpurlconnection);
            acw acw1;
            for (Iterator iterator = acx1.c().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(acw1.a(), acw1.b()))
            {
                acw1 = (acw)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (acx acx1)
        {
            return new acy(this, false, null, acx1.toString());
        }
        ArrayList arraylist;
        if (!TextUtils.isEmpty(acx1.d()))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = acx1.d().getBytes();
            httpurlconnection.setFixedLengthStreamingMode(abyte0.length);
            BufferedOutputStream bufferedoutputstream = new BufferedOutputStream(httpurlconnection.getOutputStream());
            bufferedoutputstream.write(abyte0);
            bufferedoutputstream.close();
        }
        arraylist = new ArrayList();
        if (httpurlconnection.getHeaderFields() != null)
        {
            for (Iterator iterator1 = httpurlconnection.getHeaderFields().entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                Iterator iterator2 = ((List)entry.getValue()).iterator();
                while (iterator2.hasNext()) 
                {
                    String s = (String)iterator2.next();
                    arraylist.add(new acw((String)entry.getKey(), s));
                }
            }

        }
        acx1 = acx1.a();
        int i = httpurlconnection.getResponseCode();
        ot.e();
        acx1 = new acy(this, true, new acz(acx1, i, arraylist, ajc.a(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return acx1;
    }

    private static JSONObject a(acz acz1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", acz1.a());
            if (acz1.d() != null)
            {
                jsonobject.put("body", acz1.d());
            }
            jsonarray = new JSONArray();
            acw acw1;
            for (Iterator iterator = acz1.c().iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", acw1.a()).put("value", acw1.b())))
            {
                acw1 = (acw)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (acz acz1)
        {
            of.b("Error constructing JSON for http response.", acz1);
            return jsonobject;
        }
        jsonobject.put("headers", jsonarray);
        jsonobject.put("response_code", acz1.b());
        return jsonobject;
    }

    public final JSONObject a(String s)
    {
        String s1;
        JSONObject jsonobject;
        Object obj;
        try
        {
            obj = new JSONObject(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            of.b("The request is not a valid JSON.");
            try
            {
                s = (new JSONObject()).put("success", false);
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return new JSONObject();
            }
            return s;
        }
        jsonobject = new JSONObject();
        s = "";
        try
        {
            s1 = ((JSONObject) (obj)).optString("http_request_id");
        }
        catch (Exception exception)
        {
            try
            {
                jsonobject.put("response", (new JSONObject()).put("http_request_id", s));
                jsonobject.put("success", false);
                jsonobject.put("reason", exception.toString());
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return jsonobject;
            }
            return jsonobject;
        }
        s = s1;
        obj = a(a(((JSONObject) (obj))));
        s = s1;
        if (!((acy) (obj)).c())
        {
            break MISSING_BLOCK_LABEL_117;
        }
        s = s1;
        jsonobject.put("response", a(((acy) (obj)).b()));
        s = s1;
        jsonobject.put("success", true);
        return jsonobject;
        s = s1;
        jsonobject.put("response", (new JSONObject()).put("http_request_id", s1));
        s = s1;
        jsonobject.put("success", false);
        s = s1;
        jsonobject.put("reason", ((acy) (obj)).a());
        return jsonobject;
    }

    public final void a(akk akk, Map map)
    {
        ajb.a(new _cls1(map, akk));
    }

    /* member class not found */
    class _cls1 {}

}
