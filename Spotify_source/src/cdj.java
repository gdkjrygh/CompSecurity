// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
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

public final class cdj
    implements cdi
{

    private final Context a;
    private final VersionInfoParcel b;

    public cdj(Context context, VersionInfoParcel versioninfoparcel)
    {
        a = context;
        b = versioninfoparcel;
    }

    private static cdl a(JSONObject jsonobject)
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
            bka.b("Error constructing http request.", ((Throwable) (obj)));
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
                arraylist.add(new cdk(jsonobject1.optString("key"), jsonobject1.optString("value")));
            }
        }

        return new cdl(s, ((URL) (obj)), arraylist, s1);
    }

    private cdm a(cdl cdl1)
    {
        HttpURLConnection httpurlconnection;
        try
        {
            httpurlconnection = (HttpURLConnection)cdl1.b.openConnection();
            bkv.e().a(a, b.b, false, httpurlconnection);
            cdk cdk1;
            for (Iterator iterator = cdl1.c.iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(cdk1.a, cdk1.b))
            {
                cdk1 = (cdk)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (cdl cdl1)
        {
            return new cdm(false, null, cdl1.toString());
        }
        ArrayList arraylist;
        if (!TextUtils.isEmpty(cdl1.d))
        {
            httpurlconnection.setDoOutput(true);
            byte abyte0[] = cdl1.d.getBytes();
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
                    arraylist.add(new cdk((String)entry.getKey(), s));
                }
            }

        }
        cdl1 = cdl1.a;
        int i = httpurlconnection.getResponseCode();
        bkv.e();
        cdl1 = new cdm(true, new cdn(cdl1, i, arraylist, cjj.a(new InputStreamReader(httpurlconnection.getInputStream()))), null);
        return cdl1;
    }

    private static JSONObject a(cdn cdn1)
    {
        JSONObject jsonobject;
        JSONArray jsonarray;
        jsonobject = new JSONObject();
        try
        {
            jsonobject.put("http_request_id", cdn1.a);
            if (cdn1.d != null)
            {
                jsonobject.put("body", cdn1.d);
            }
            jsonarray = new JSONArray();
            cdk cdk1;
            for (Iterator iterator = cdn1.c.iterator(); iterator.hasNext(); jsonarray.put((new JSONObject()).put("key", cdk1.a).put("value", cdk1.b)))
            {
                cdk1 = (cdk)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (cdn cdn1)
        {
            bka.b("Error constructing JSON for http response.", cdn1);
            return jsonobject;
        }
        jsonobject.put("headers", jsonarray);
        jsonobject.put("response_code", cdn1.b);
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
            bka.b("The request is not a valid JSON.");
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
        if (!((cdm) (obj)).b)
        {
            break MISSING_BLOCK_LABEL_117;
        }
        s = s1;
        jsonobject.put("response", a(((cdm) (obj)).a));
        s = s1;
        jsonobject.put("success", true);
        return jsonobject;
        s = s1;
        jsonobject.put("response", (new JSONObject()).put("http_request_id", s1));
        s = s1;
        jsonobject.put("success", false);
        s = s1;
        jsonobject.put("reason", ((cdm) (obj)).c);
        return jsonobject;
    }

    public final void a(ckw ckw, Map map)
    {
        cji.a(new Runnable(map, ckw) {

            final ckw a;
            private Map b;
            private cdj c;

            public final void run()
            {
                bka.a("Received Http request.");
                Object obj = (String)b.get("http_request");
                obj = c.a(((String) (obj)));
                if (obj == null)
                {
                    bka.b("Response should not be null.");
                    return;
                } else
                {
                    cjj.a.post(new Runnable(this, ((JSONObject) (obj))) {

                        private JSONObject a;
                        private _cls1 b;

                        public final void run()
                        {
                            b.a.a("fetchHttpRequestCompleted", a);
                            bka.a("Dispatched http response.");
                        }

            
            {
                b = _pcls1;
                a = jsonobject;
                super();
            }
                    });
                    return;
                }
            }

            
            {
                c = cdj.this;
                b = map;
                a = ckw;
                super();
            }
        });
    }
}
